package g7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes16.dex */
public final class q extends s7.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s7.b f141051c;
    public final /* synthetic */ s7.c d;
    public final /* synthetic */ k7.c e;

    public q(s7.b bVar, s7.c cVar, k7.c cVar2) {
        this.f141051c = bVar;
        this.d = cVar;
        this.e = cVar2;
    }

    @Override // s7.c
    public final Object a(s7.b bVar) {
        float f = bVar.f260491a;
        float f4 = bVar.f260492b;
        String str = ((k7.c) bVar.f260493c).f181752a;
        String str2 = ((k7.c) bVar.d).f181752a;
        float f5 = bVar.e;
        float f6 = bVar.f;
        float f32 = bVar.f260494g;
        s7.b bVar2 = this.f141051c;
        bVar2.f260491a = f;
        bVar2.f260492b = f4;
        bVar2.f260493c = str;
        bVar2.d = str2;
        bVar2.e = f5;
        bVar2.f = f6;
        bVar2.f260494g = f32;
        String str3 = (String) this.d.a(bVar2);
        k7.c cVar = (k7.c) (bVar.f == 1.0f ? bVar.d : bVar.f260493c);
        String str4 = cVar.f181753b;
        float f35 = cVar.f181754c;
        k7.b bVar3 = cVar.d;
        int i = cVar.e;
        float f36 = cVar.f;
        float f37 = cVar.f181755g;
        int i2 = cVar.f181756h;
        int i3 = cVar.i;
        float f41 = cVar.f181757j;
        boolean z = cVar.k;
        PointF pointF = cVar.f181758l;
        PointF pointF2 = cVar.f181759m;
        k7.c cVar2 = this.e;
        cVar2.f181752a = str3;
        cVar2.f181753b = str4;
        cVar2.f181754c = f35;
        cVar2.d = bVar3;
        cVar2.e = i;
        cVar2.f = f36;
        cVar2.f181755g = f37;
        cVar2.f181756h = i2;
        cVar2.i = i3;
        cVar2.f181757j = f41;
        cVar2.k = z;
        cVar2.f181758l = pointF;
        cVar2.f181759m = pointF2;
        return cVar2;
    }
}
