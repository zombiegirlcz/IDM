package m7;

import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l7.g f203222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7.c f203223c;
    public final boolean d;
    public final boolean e;

    public a(String str, l7.g gVar, l7.c cVar, boolean z, boolean z3) {
        this.f203221a = str;
        this.f203222b = gVar;
        this.f203223c = cVar;
        this.d = z;
        this.e = z3;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        return new f7.g(lottieDrawable, bVar, this);
    }
}
