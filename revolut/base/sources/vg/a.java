package vg;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f288678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f288679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f288680c;
    public final double d;
    public final double e;
    public final double f;

    public a(double d, double d5, double d6, double d10) {
        this.f288678a = d;
        this.f288679b = d6;
        this.f288680c = d5;
        this.d = d10;
        this.e = (d + d5) / 2.0d;
        this.f = (d6 + d10) / 2.0d;
    }

    public final boolean a(double d, double d5) {
        return this.f288678a <= d && d <= this.f288680c && this.f288679b <= d5 && d5 <= this.d;
    }
}
