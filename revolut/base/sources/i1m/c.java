package i1m;

/* JADX INFO: loaded from: classes23.dex */
public enum c {
    OFF(0),
    ERROR(1),
    DEBUG(2),
    VERBOSE(3);

    private final int level;

    c(int i) {
        this.level = i;
    }

    public final int a() {
        return this.level;
    }
}
