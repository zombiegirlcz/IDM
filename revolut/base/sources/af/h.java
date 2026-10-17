package af;

/* JADX INFO: loaded from: classes.dex */
public enum h {
    NONE(0),
    SDK(1),
    GLOBAL(2),
    COMBINED(3);

    private final int code;

    h(int i) {
        this.code = i;
    }

    public final int a() {
        return this.code;
    }
}
