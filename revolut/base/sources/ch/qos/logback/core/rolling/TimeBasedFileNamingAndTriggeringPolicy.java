package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.spi.ContextAware;

/* JADX INFO: loaded from: classes16.dex */
public interface TimeBasedFileNamingAndTriggeringPolicy<E> extends TriggeringPolicy<E>, ContextAware {
    ArchiveRemover getArchiveRemover();

    String getCurrentPeriodsFileNameWithoutCompressionSuffix();

    long getCurrentTime();

    String getElapsedPeriodsFileName();

    void setCurrentTime(long j2);

    void setTimeBasedRollingPolicy(TimeBasedRollingPolicy<E> timeBasedRollingPolicy);
}
