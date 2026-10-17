package an4;

import al4.q;
import com.revolut.feature.credit.api.navigation.CreditCardHomeFeatureConfig;
import com.revolut.feature.credit.api.navigation.PayLaterHomeFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import om4.y3;
import qg7.v;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements vx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6562a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6563b;

    public i(qi9.d payLaterNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        this.f6563b = payLaterNavigationCommandFactory;
    }

    @Override // vx4.b
    public final d0 a(w4l.k loadingStrategy) {
        switch (this.f6562a) {
            case 0:
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                d0 d0VarFirstOrError = rd0.e.c(new a87.b(mo3.a.g(((y3) ((q) this.f6563b)).e(loadingStrategy, true), null, new g(0), 1), 2), kotlin.coroutines.g.f186406a).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                ufm.i iVar = new ufm.i(ue0.e.t(d0VarFirstOrError, h0.f322473a), new ai0.j(new f(this, 0), 15), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            default:
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                qi9.d dVar = (qi9.d) this.f6563b;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                d0 d0VarFirstOrError2 = m70.a.g(rd0.e.c(((ti9.g) dVar.f246675a).k(loadingStrategy), kotlin.coroutines.g.f186406a), null, new qc8.a(24), 1).firstOrError();
                qe0.g gVar = new qe0.g(21, new v(13));
                d0VarFirstOrError2.getClass();
                ufm.i iVar2 = new ufm.i(d0VarFirstOrError2, gVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
        }
    }

    @Override // vx4.a
    public final FeatureCommand b(String facilityId) {
        switch (this.f6562a) {
            case 0:
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return new FeatureCommand(new CreditCardHomeFeatureConfig(facilityId));
            default:
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return new FeatureCommand(new PayLaterHomeFeatureConfig(facilityId));
        }
    }

    public i(q creditCardProductInteractor) {
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f6563b = creditCardProductInteractor;
    }
}
