package ch.qos.logback.core.status;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.StatusPrinter;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes16.dex */
public abstract class OnPrintStreamStatusListenerBase extends ContextAwareBase implements StatusListener, LifeCycle {
    static final long DEFAULT_RETROSPECTIVE = 300;
    String prefix;
    boolean isStarted = false;
    long retrospectiveThresold = 300;

    private boolean isElapsedTimeLongerThanThreshold(long j2, long j3) {
        return j2 - j3 < this.retrospectiveThresold;
    }

    private void print(Status status) {
        StringBuilder sb6 = new StringBuilder();
        String str = this.prefix;
        if (str != null) {
            sb6.append(str);
        }
        StatusPrinter.buildStr(sb6, "", status);
        getPrintStream().print(sb6);
    }

    private void retrospectivePrint() {
        if (this.context == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Status status : this.context.getStatusManager().getCopyOfStatusList()) {
            if (isElapsedTimeLongerThanThreshold(jCurrentTimeMillis, status.getDate().longValue())) {
                print(status);
            }
        }
    }

    @Override // ch.qos.logback.core.status.StatusListener
    public void addStatusEvent(Status status) {
        if (this.isStarted) {
            print(status);
        }
    }

    public String getPrefix() {
        return this.prefix;
    }

    public abstract PrintStream getPrintStream();

    public long getRetrospective() {
        return this.retrospectiveThresold;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.isStarted;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setRetrospective(long j2) {
        this.retrospectiveThresold = j2;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.isStarted = true;
        if (this.retrospectiveThresold > 0) {
            retrospectivePrint();
        }
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.isStarted = false;
    }
}
