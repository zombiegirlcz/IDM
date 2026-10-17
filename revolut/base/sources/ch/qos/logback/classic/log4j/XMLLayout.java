package ch.qos.logback.classic.log4j;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.helpers.Transform;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public class XMLLayout extends LayoutBase<ILoggingEvent> {
    private static final int DEFAULT_SIZE = 256;
    private static final int UPPER_LIMIT = 2048;

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    private StringBuilder f24057buf = new StringBuilder(256);
    private boolean locationInfo = false;
    private boolean properties = false;

    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent iLoggingEvent) {
        Map<String, String> mDCPropertyMap;
        StackTraceElement[] callerData;
        if (this.f24057buf.capacity() > 2048) {
            this.f24057buf = new StringBuilder(256);
        } else {
            this.f24057buf.setLength(0);
        }
        this.f24057buf.append("<log4j:event logger=\"");
        this.f24057buf.append(Transform.escapeTags(iLoggingEvent.getLoggerName()));
        this.f24057buf.append("\"\r\n");
        this.f24057buf.append("             timestamp=\"");
        this.f24057buf.append(iLoggingEvent.getTimeStamp());
        this.f24057buf.append("\" level=\"");
        this.f24057buf.append(iLoggingEvent.getLevel());
        this.f24057buf.append("\" thread=\"");
        this.f24057buf.append(Transform.escapeTags(iLoggingEvent.getThreadName()));
        this.f24057buf.append("\">\r\n");
        this.f24057buf.append("  <log4j:message>");
        this.f24057buf.append(Transform.escapeTags(iLoggingEvent.getFormattedMessage()));
        this.f24057buf.append("</log4j:message>\r\n");
        IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy();
        if (throwableProxy != null) {
            StackTraceElementProxy[] stackTraceElementProxyArray = throwableProxy.getStackTraceElementProxyArray();
            this.f24057buf.append("  <log4j:throwable><![CDATA[");
            for (StackTraceElementProxy stackTraceElementProxy : stackTraceElementProxyArray) {
                this.f24057buf.append('\t');
                this.f24057buf.append(stackTraceElementProxy.toString());
                this.f24057buf.append("\r\n");
            }
            this.f24057buf.append("]]></log4j:throwable>\r\n");
        }
        if (this.locationInfo && (callerData = iLoggingEvent.getCallerData()) != null && callerData.length > 0) {
            StackTraceElement stackTraceElement = callerData[0];
            this.f24057buf.append("  <log4j:locationInfo class=\"");
            this.f24057buf.append(stackTraceElement.getClassName());
            this.f24057buf.append("\"\r\n");
            this.f24057buf.append("                      method=\"");
            this.f24057buf.append(Transform.escapeTags(stackTraceElement.getMethodName()));
            this.f24057buf.append("\" file=\"");
            this.f24057buf.append(Transform.escapeTags(stackTraceElement.getFileName()));
            this.f24057buf.append("\" line=\"");
            this.f24057buf.append(stackTraceElement.getLineNumber());
            this.f24057buf.append("\"/>\r\n");
        }
        if (getProperties() && (mDCPropertyMap = iLoggingEvent.getMDCPropertyMap()) != null && mDCPropertyMap.size() != 0) {
            Set<Map.Entry<String, String>> setEntrySet = mDCPropertyMap.entrySet();
            this.f24057buf.append("  <log4j:properties>");
            for (Map.Entry<String, String> entry : setEntrySet) {
                this.f24057buf.append("\r\n    <log4j:data");
                this.f24057buf.append(" name=\"" + Transform.escapeTags(entry.getKey()) + "\"");
                this.f24057buf.append(" value=\"" + Transform.escapeTags(entry.getValue()) + "\"");
                this.f24057buf.append(" />");
            }
            this.f24057buf.append("\r\n  </log4j:properties>");
        }
        this.f24057buf.append("\r\n</log4j:event>\r\n\r\n");
        return this.f24057buf.toString();
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getContentType() {
        return "text/xml";
    }

    public boolean getLocationInfo() {
        return this.locationInfo;
    }

    public boolean getProperties() {
        return this.properties;
    }

    public void setLocationInfo(boolean z) {
        this.locationInfo = z;
    }

    public void setProperties(boolean z) {
        this.properties = z;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
    }
}
