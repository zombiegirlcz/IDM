package kbm;

/* JADX INFO: loaded from: classes21.dex */
public enum b {
    ERROR(false),
    IGNORED_ERROR(false),
    SUCCESS(false),
    NOT_PERMITTED(false),
    STATE_TRANSITION(true),
    RESET(true),
    FORCED_OPEN(false),
    DISABLED(false),
    FAILURE_RATE_EXCEEDED(false),
    SLOW_CALL_RATE_EXCEEDED(false);

    public final boolean forcePublish;

    b(boolean z) {
        this.forcePublish = z;
    }
}
