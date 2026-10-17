package m7;

import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f203232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7.c f203233c;
    public final l7.a d;
    public final l7.c e;
    public final l7.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l7.b f203234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f203235h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f203236j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l7.b f203237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f203238m;

    public e(String str, f fVar, l7.c cVar, l7.a aVar, l7.c cVar2, l7.c cVar3, l7.b bVar, v vVar, w wVar, float f, ArrayList arrayList, l7.b bVar2, boolean z) {
        this.f203231a = str;
        this.f203232b = fVar;
        this.f203233c = cVar;
        this.d = aVar;
        this.e = cVar2;
        this.f = cVar3;
        this.f203234g = bVar;
        this.f203235h = vVar;
        this.i = wVar;
        this.f203236j = f;
        this.k = arrayList;
        this.f203237l = bVar2;
        this.f203238m = z;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        return new f7.j(lottieDrawable, bVar, this);
    }
}
