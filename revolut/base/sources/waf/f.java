package waf;

import com.revolut.feature.trading.transfer.investments.api.navigation.TransferOutFeatureConfig;
import l9f.k;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements b60.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a31.a f295932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f295933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f295934c;
    public final phm.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f295935g;

    public f(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, phm.a aVar7) {
        this.f295932a = aVar;
        this.f295933b = aVar2;
        this.f295934c = aVar3;
        this.d = aVar7;
        this.e = aVar4;
        this.f = aVar5;
        this.f295935g = aVar6;
    }

    public final d a(Object obj2, String str) {
        TransferOutFeatureConfig.TransferOut transferOut = (TransferOutFeatureConfig.TransferOut) obj2;
        l70.e eVar = (l70.e) ((phm.a) this.f295932a.f955b).get();
        zl2.a aVar = (zl2.a) ((phm.a) this.f295933b.f955b).get();
        cri.b bVar = (cri.b) ((phm.a) this.f295934c.f955b).get();
        k kVar = (k) this.d.get();
        osb.a aVar2 = (osb.a) ((phm.a) this.e.f955b).get();
        y90.e eVar2 = (y90.e) ((phm.a) this.f.f955b).get();
        lsb.a aVar3 = (lsb.a) ((phm.a) this.f295935g.f955b).get();
        str.getClass();
        transferOut.getClass();
        eVar.getClass();
        aVar.getClass();
        bVar.getClass();
        kVar.getClass();
        aVar2.getClass();
        eVar2.getClass();
        aVar3.getClass();
        return new d(new hri.b(), new x90.c(), eVar, aVar, bVar, kVar, aVar2, eVar2, aVar3, str, transferOut);
    }
}
