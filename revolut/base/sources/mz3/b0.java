package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.retail.core.navigation.DummyCommand;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 implements sv3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210583a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mri.w f210584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f210585c;
    public final Object d;

    public b0(mri.w revolutJobInteractor, o95.i overdraftProductInteractor, vx4.b overdraftProductCommandFactory) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(overdraftProductInteractor, "overdraftProductInteractor");
        Intrinsics.checkNotNullParameter(overdraftProductCommandFactory, "overdraftProductCommandFactory");
        this.f210584b = revolutJobInteractor;
        this.f210585c = overdraftProductInteractor;
        this.d = overdraftProductCommandFactory;
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        int i = this.f210583a;
        DummyCommand dummyCommand = DummyCommand.f98635a;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        switch (i) {
            case 0:
                pfm.z zVar = new pfm.z(pd.b.n(skm.p0.f264003c, new mpd.p(this, payload, null, 15)), 0, new a68.f(13), null);
                Intrinsics.checkNotNullExpressionValue(zVar, "toSingle(...)");
                return ue0.e.F(zVar, dummyCommand);
            case 1:
                ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new mpd.p(this, payload, null, 17)), new s(new a7(this, 20), 17), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            default:
                pfm.f fVarO = efm.b.o(zhm.v.k(pd.b.n(skm.p0.f264003c, new mx5.g(this, payload, null, 8)), ((ha3.x) ((l93.f) this.f210585c)).C()));
                ufm.i iVar2 = new ufm.i(new ufm.c(new i(payload, 21), 2), new s(new a7(this, 21), 18), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                rfm.f0 f0VarF = fVarO.f(ue0.e.F(iVar2, dummyCommand));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                return f0VarF;
        }
    }

    public b0(mri.w revolutJobInteractor, al4.n creditCardInteractor, al4.q creditCardProductInteractor) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f210584b = revolutJobInteractor;
        this.f210585c = creditCardInteractor;
        this.d = creditCardProductInteractor;
    }

    public b0(l93.f revolutCardsInteractor, mri.w revolutJobInteractor, an4.i payLaterProductCommandFactory) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(payLaterProductCommandFactory, "payLaterProductCommandFactory");
        this.f210585c = revolutCardsInteractor;
        this.f210584b = revolutJobInteractor;
        this.d = payLaterProductCommandFactory;
    }
}
