package ch.qos.logback.classic.html;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.Transform;
import ch.qos.logback.core.html.IThrowableRenderer;

/* JADX INFO: loaded from: classes16.dex */
public class DefaultThrowableRenderer implements IThrowableRenderer<ILoggingEvent> {
    static final String TRACE_PREFIX = "<br />&nbsp;&nbsp;&nbsp;&nbsp;";

    public void printFirstLine(StringBuilder sb6, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCommonFrames() > 0) {
            sb6.append("<br />");
            sb6.append("Caused by: ");
        }
        sb6.append(iThrowableProxy.getClassName());
        sb6.append(": ");
        sb6.append(Transform.escapeTags(iThrowableProxy.getMessage()));
        sb6.append(CoreConstants.LINE_SEPARATOR);
    }

    @Override // ch.qos.logback.core.html.IThrowableRenderer
    public void render(StringBuilder sb6, ILoggingEvent iLoggingEvent) {
        sb6.append("<tr><td class=\"Exception\" colspan=\"6\">");
        for (IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy(); throwableProxy != null; throwableProxy = throwableProxy.getCause()) {
            render(sb6, throwableProxy);
        }
        sb6.append("</td></tr>");
    }

    public void render(StringBuilder sb6, IThrowableProxy iThrowableProxy) {
        printFirstLine(sb6, iThrowableProxy);
        int commonFrames = iThrowableProxy.getCommonFrames();
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        for (int i = 0; i < stackTraceElementProxyArray.length - commonFrames; i++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i];
            sb6.append("<br />&nbsp;&nbsp;&nbsp;&nbsp;");
            sb6.append(Transform.escapeTags(stackTraceElementProxy.toString()));
            sb6.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            sb6.append("<br />&nbsp;&nbsp;&nbsp;&nbsp;");
            sb6.append("\t... ");
            sb6.append(commonFrames);
            sb6.append(" common frames omitted");
            sb6.append(CoreConstants.LINE_SEPARATOR);
        }
    }
}
