package ayh;

import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements xxh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ak5.f f11232a;

    public o(ak5.f fVar) {
        this.f11232a = fVar;
    }

    @Override // xxh.b
    public final xxh.e a(CryptoOrderDetailsInputData.StopLimitInputData stopLimitInputData) {
        b bVar = (b) this.f11232a.f5683c;
        v0i.b bVar2 = bVar.e;
        u2i.d dVar = new u2i.d();
        mre.c cVarB = bVar.f.b();
        s.j(cVarB);
        p0i.b bVarE = bVar.e.e();
        s.j(bVarE);
        return new xxh.e(stopLimitInputData, dVar, cVarB, bVarE, new txh.c());
    }
}
