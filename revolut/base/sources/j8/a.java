package j8;

import c8.j;
import c8.k;
import com.bumptech.glide.load.data.m;
import i8.r;
import i8.s;
import i8.t;
import i8.u;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f172061b = j.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yf.c f172062a;

    public a(yf.c cVar) {
        this.f172062a = cVar;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, k kVar) {
        i8.k kVar2 = (i8.k) obj2;
        yf.c cVar = this.f172062a;
        if (cVar != null) {
            r rVar = (r) cVar.b;
            s sVarA = s.a(kVar2);
            Object objA = rVar.a(sVarA);
            sVarA.b();
            i8.k kVar3 = (i8.k) objA;
            if (kVar3 == null) {
                rVar.d(s.a(kVar2), kVar2);
            } else {
                kVar2 = kVar3;
            }
        }
        return new t(kVar2, new m(kVar2, ((Integer) kVar.a(f172061b)).intValue()));
    }

    @Override // i8.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj2) {
        return true;
    }
}
