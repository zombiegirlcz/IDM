package ypg;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import mjf.b0;
import pcd.s;
import tof.i1;
import yma.r;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f315873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f315874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f315875c;

    public i(wsg.n walletInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f315873a = walletInteractor;
        this.f315874b = transactionsInteractor;
        this.f315875c = featureToggleInteractor;
    }

    public final efm.b a(s vault, odd.a sharedVaultsInteractor) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(sharedVaultsInteractor, "sharedVaultsInteractor");
        boolean zC = ((jte.d) this.f315875c).c(SavingsApi$Toggles.JointAccountsSavings.f83075c);
        int i = 0;
        i1 i1Var = i1.f272794a;
        com.revolut.domain.interactors.transactions.a aVar = this.f315874b;
        wsg.n nVar = this.f315873a;
        if (!zC) {
            return efm.b.p(ue0.e.v(((eed.n) sharedVaultsInteractor).i(vault.f234881a, false)), ue0.e.v(nVar.l0(false)), ue0.e.v(((b0) aVar).g(i1Var)));
        }
        pcd.b bVar = vault.f234889n;
        if (bVar == pcd.b.PERSONAL) {
            return efm.b.p(ue0.e.v(((eed.n) sharedVaultsInteractor).j(bVar, true)), ue0.e.v(nVar.k0(AccountId.Personal.f51414a)), ue0.e.v(((b0) aVar).g(i1Var)));
        }
        pfm.a aVarV = ue0.e.v(((eed.n) sharedVaultsInteractor).j(bVar, true));
        d0 d0VarFirstOrError = m70.a.g(nVar.Z(vault.f, w4l.i.f294643c), null, new h(i), 1).firstOrError();
        r rVar = new r(new yo7.p(this, 6), 26);
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, rVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return efm.b.p(aVarV, ue0.e.v(aVar2));
    }
}
