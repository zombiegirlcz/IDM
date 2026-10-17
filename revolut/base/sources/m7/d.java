package m7;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f203226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f203227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7.c f203228c;
    public final l7.a d;
    public final l7.c e;
    public final l7.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f203229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f203230h;

    public d(String str, f fVar, Path.FillType fillType, l7.c cVar, l7.a aVar, l7.c cVar2, l7.c cVar3, boolean z) {
        this.f203226a = fVar;
        this.f203227b = fillType;
        this.f203228c = cVar;
        this.d = aVar;
        this.e = cVar2;
        this.f = cVar3;
        this.f203229g = str;
        this.f203230h = z;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        return new f7.i(lottieDrawable, jVar, bVar, this);
    }
}
