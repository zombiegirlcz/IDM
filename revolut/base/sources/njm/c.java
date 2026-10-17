package njm;

/* JADX INFO: loaded from: classes14.dex */
public enum c {
    NON_STABLE_DECLARED(false, false),
    STABLE_DECLARED(true, false),
    NON_STABLE_SYNTHESIZED(false, true),
    STABLE_SYNTHESIZED(true, true);

    public final boolean isStable;
    public final boolean isSynthesized;

    c(boolean z, boolean z3) {
        this.isStable = z;
        this.isSynthesized = z3;
    }
}
