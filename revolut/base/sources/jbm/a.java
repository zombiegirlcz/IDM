package jbm;

/* JADX INFO: loaded from: classes21.dex */
public enum a {
    DISABLED(3, false),
    METRICS_ONLY(5, true),
    CLOSED(0, true),
    OPEN(1, true),
    FORCED_OPEN(4, false),
    HALF_OPEN(2, true);

    public final boolean allowPublish;
    private final int order;

    a(int i, boolean z) {
        this.order = i;
        this.allowPublish = z;
    }
}
