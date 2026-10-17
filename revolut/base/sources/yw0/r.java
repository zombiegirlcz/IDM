package yw0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f317294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f317295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f317296c;
    public final boolean d;

    public r(boolean z, boolean z3, int i) {
        boolean z4 = (i & 1) != 0;
        z = (i & 2) != 0 ? true : z;
        boolean z6 = (i & 4) != 0;
        z3 = (i & 8) != 0 ? false : z3;
        this.f317294a = z4;
        this.f317295b = z;
        this.f317296c = z6;
        this.d = z3;
    }

    public abstract n14.e a();

    public boolean b() {
        return this.d;
    }
}
