package ak5;

import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import mk5.c0;
import vc.s;
import xx9.p;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f5720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5721c;

    public m(j jVar, n nVar, int i) {
        this.f5719a = jVar;
        this.f5720b = nVar;
        this.f5721c = i;
    }

    @Override // phm.a
    public final Object get() {
        j jVar = this.f5719a;
        ebj.b bVar = jVar.f5708j;
        rd5.c cVar = jVar.k;
        vv5.e eVar = jVar.f;
        n nVar = this.f5720b;
        int i = this.f5721c;
        if (i == 0) {
            mk5.k extension = (mk5.k) nVar.f5723b.get();
            pk5.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            s.k(extension);
            return extension;
        }
        if (i == 1) {
            CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData = nVar.f5722a;
            pn3.a aVar = (pn3.a) jVar.f5713q.get();
            cl3.a aVarD = jVar.f5705c.d();
            s.j(aVarD);
            p pVarB = jVar.d.b();
            s.j(pVarB);
            whf.b bVarA = jVar.e.a();
            s.j(bVarA);
            tv5.b bVarC = eVar.c();
            s.j(bVarC);
            return new ok5.d(inputData, aVar, aVarD, pVarB, bVarA, bVarC, jVar.f5706g.a());
        }
        if (i != 2) {
            if (i == 3) {
                return new c0(nVar.f5722a, (xj5.c) jVar.f5714r.get());
            }
            if (i != 4) {
                throw new AssertionError(i);
            }
            sd5.c cVarA = cVar.a();
            s.j(cVarA);
            return new bk5.a(cVarA);
        }
        cli.n nVar2 = (cli.n) nVar.d.get();
        CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData2 = nVar.f5722a;
        t70.b bVarG = jVar.f5704b.g();
        s.j(bVarG);
        wsg.n nVarB = jVar.f5707h.b();
        ppk.f fVarA = jVar.i.a();
        mk5.k kVar = (mk5.k) nVar.f5723b.get();
        kbj.d dVar = (kbj.d) ((qbj.m) bVar).f244312h.get();
        s.j(dVar);
        fbj.a aVarA = ((qbj.m) bVar).a();
        s.j(aVarA);
        bk5.a aVar2 = (bk5.a) nVar.e.get();
        rea.m mVarF = jVar.f5709l.f();
        tv5.b bVarC2 = eVar.c();
        s.j(bVarC2);
        sd5.c cVarA2 = cVar.a();
        s.j(cVarA2);
        nw5.j jVarD = jVar.f5710m.d();
        s.j(jVarD);
        xv5.c cVarA3 = eVar.a();
        s.j(cVarA3);
        gte.a aVarB = jVar.f5703a.b();
        s.j(aVarB);
        return new com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a(nVar2, inputData2, bVarG, nVarB, fVarA, kVar, dVar, aVarA, aVar2, mVarF, bVarC2, cVarA2, jVarD, cVarA3, aVarB);
    }
}
