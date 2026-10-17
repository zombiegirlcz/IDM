package ke;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f182937c = new i(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f182938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f182939b;

    public i(int i, int i2) {
        this.f182938a = i;
        this.f182939b = i2;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i.class.getSimpleName());
        sb6.append("[position = ");
        sb6.append(this.f182938a);
        sb6.append(", length = ");
        return j6.a.v(sb6, "]", this.f182939b);
    }
}
