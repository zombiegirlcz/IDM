package m7;

import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l7.b f203270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f203271c;
    public final l7.a d;
    public final l7.a e;
    public final l7.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f203272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f203273h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f203274j;

    public x(String str, l7.b bVar, ArrayList arrayList, l7.a aVar, l7.a aVar2, l7.b bVar2, v vVar, w wVar, float f, boolean z) {
        this.f203269a = str;
        this.f203270b = bVar;
        this.f203271c = arrayList;
        this.d = aVar;
        this.e = aVar2;
        this.f = bVar2;
        this.f203272g = vVar;
        this.f203273h = wVar;
        this.i = f;
        this.f203274j = z;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        return new f7.w(lottieDrawable, bVar, this);
    }
}
