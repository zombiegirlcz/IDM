package ayh;

import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements wxh.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ak5.f f11230a;

    public m(ak5.f fVar) {
        this.f11230a = fVar;
    }

    @Override // wxh.e
    public final wxh.j a(CryptoOrderDetailsInputData.RecurringInputData recurringInputData) {
        b bVar = (b) this.f11230a.f5683c;
        mde.e eVarC = bVar.f11193a.c();
        xua.a aVarA = bVar.f11194b.a();
        s.j(aVarA);
        pu5.e eVarC2 = ((ku5.f) bVar.f11195c).c();
        mva.d dVar = bVar.d;
        return new wxh.j(recurringInputData, eVarC, aVarA, eVarC2, new nva.a());
    }
}
