package ch.qos.logback.classic.layout;

import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.util.CachingDateFormatter;

/* JADX INFO: loaded from: classes16.dex */
public class TTLLLayout extends LayoutBase<ILoggingEvent> {
    CachingDateFormatter cachingDateFormatter = new CachingDateFormatter("HH:mm:ss.SSS");

    /* JADX INFO: renamed from: tpc, reason: collision with root package name */
    ThrowableProxyConverter f24056tpc = new ThrowableProxyConverter();

    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent iLoggingEvent) {
        if (!isStarted()) {
            return "";
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.cachingDateFormatter.format(iLoggingEvent.getTimeStamp()));
        sb6.append(" [");
        sb6.append(iLoggingEvent.getThreadName());
        sb6.append("] ");
        sb6.append(iLoggingEvent.getLevel().toString());
        sb6.append(" ");
        sb6.append(iLoggingEvent.getLoggerName());
        sb6.append(" - ");
        sb6.append(iLoggingEvent.getFormattedMessage());
        sb6.append(CoreConstants.LINE_SEPARATOR);
        if (iLoggingEvent.getThrowableProxy() != null) {
            sb6.append(this.f24056tpc.convert(iLoggingEvent));
        }
        return sb6.toString();
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f24056tpc.start();
        super.start();
    }
}
