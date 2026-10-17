package m7;

/* JADX INFO: loaded from: classes16.dex */
public enum m {
    STAR(1),
    POLYGON(2);

    private final int value;

    m(int i) {
        this.value = i;
    }

    public static m a(int i) {
        for (m mVar : values()) {
            if (mVar.value == i) {
                return mVar;
            }
        }
        return null;
    }
}
