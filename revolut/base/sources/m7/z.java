package m7;

import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class z implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f203275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l7.b f203276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7.b f203277c;
    public final l7.b d;
    public final boolean e;

    public z(String str, y yVar, l7.b bVar, l7.b bVar2, l7.b bVar3, boolean z) {
        this.f203275a = yVar;
        this.f203276b = bVar;
        this.f203277c = bVar2;
        this.d = bVar3;
        this.e = z;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        return new f7.x(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f203276b + ", end: " + this.f203277c + ", offset: " + this.d + "}";
    }
}
