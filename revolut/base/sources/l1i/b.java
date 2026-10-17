package l1i;

import an.e;
import an.f;
import an.g;
import an.h;
import an.i;
import an.k;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import efm.d0;
import efm.r;
import g1i.l0;
import g1i.m0;
import kotlin.jvm.internal.Intrinsics;
import m1i.m;
import te0.s;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f191544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1i.k f191545b;

    public b(m router, m1i.k presentationModel) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f191544a = router;
        this.f191545b = presentationModel;
    }

    @Override // an.k
    public final d0 a(f callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (callback instanceof g) {
            l0 l0Var = (l0) this.f191544a;
            l0Var.getClass();
            return l0Var.d.a(com.revolut.retail.core.navigation.a.c(FinishFlowCommand.f98647a, new FeatureCommand(new ReferralsBizFeatureConfig.InviteCampaignHomeFeatureConfig(null, 31)))).D(Boolean.TRUE);
        }
        if (!(callback instanceof h) && !(callback instanceof i) && !(callback instanceof e)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        m0 m0Var = (m0) ((g1i.d0) this.f191545b).e;
        r rVarC = m0Var.f.getValue(m0Var, m0.f139655t[4]).c(s.f270018a);
        od0.i.Companion.getClass();
        d0 d0VarElementAt = rVarC.elementAt(0L, od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(d0VarElementAt, "elementAt(...)");
        kxj.e eVar = new kxj.e(new a(this, 1), 17);
        d0VarElementAt.getClass();
        pfm.a aVar = new pfm.a(d0VarElementAt, eVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return ue0.e.A(aVar, new a(this, 0)).D(Boolean.TRUE);
    }
}
