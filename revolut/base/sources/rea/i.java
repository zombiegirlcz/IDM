package rea;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import rfm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f253573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountId f253574c;

    public /* synthetic */ i(m mVar, AccountId accountId, int i) {
        this.f253572a = i;
        this.f253573b = mVar;
        this.f253574c = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f253572a;
        AccountId accountId = this.f253574c;
        m mVar = this.f253573b;
        switch (i) {
            case 0:
                String pocketId = (String) obj2;
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                wsg.n nVar = mVar.f253579b;
                d0 d0VarW = nVar.w(accountId);
                d0VarW.getClass();
                f0 f0VarF = new pfm.h(d0VarW, 4).f(nVar.z(accountId, pocketId));
                l lVar = l.f;
                ufm.i iVar = new ufm.i(f0VarF, new q2j.k(20), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                Set customKeys = y0.b(new Pair("Pocket_Not_In_Wallet", pocketId));
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                Intrinsics.checkNotNullParameter(customKeys, "customKeys");
                z zVarO = ue0.e.t(iVar, customKeys).o(pocketId);
                Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
                return zVarO;
            case 1:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return ((j31.g) mVar.f253578a).d(accountId, pocket);
            case 2:
                String newPocketId = (String) obj2;
                Intrinsics.checkNotNullParameter(newPocketId, "newPocketId");
                return mVar.f253579b.z(accountId, newPocketId);
            default:
                io3.d pocket2 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket2, "pocket");
                return ((j31.g) mVar.f253578a).d(accountId, pocket2);
        }
    }
}
