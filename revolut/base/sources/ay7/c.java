package ay7;

import b60.d;
import l70.e;
import wy7.f;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f11106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11107c;

    public /* synthetic */ c(a31.a aVar, Object obj2, int i) {
        this.f11105a = i;
        this.f11106b = aVar;
        this.f11107c = obj2;
    }

    @Override // b60.d
    public final Object a() {
        switch (this.f11105a) {
            case 0:
                e eVar = (e) ((phm.a) this.f11106b.f955b).get();
                ex7.a aVar = (ex7.a) ((phm.a) this.f11107c).get();
                eVar.getClass();
                aVar.getClass();
                return new b(new hri.b(), eVar, aVar);
            case 1:
                e eVar2 = (e) ((phm.a) this.f11106b.f955b).get();
                ex7.a aVar2 = (ex7.a) ((phm.a) this.f11107c).get();
                eVar2.getClass();
                aVar2.getClass();
                return new f(new hri.b(), eVar2, aVar2);
            default:
                c21.e eVar3 = (c21.e) ((phm.a) this.f11106b.f955b).get();
                vxd.b bVar = (vxd.b) ((phm.a) ((a31.a) this.f11107c).f955b).get();
                eVar3.getClass();
                bVar.getClass();
                return new poa.b(new hri.b(), eVar3, bVar);
        }
    }
}
