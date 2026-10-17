package iv5;

import i6j.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ku1.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends ut5.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jv5.a f168734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nv5.a f168735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mv5.a f168736n;
    public final qv5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pv5.a f168737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ov5.b f168738q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ut5.h f168739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ut5.k f168740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ut5.g f168741t;

    public l(jv5.a autoEarnEligibleWidgetControllerModelExtension, nv5.a mainAccountsWidgetControllerPresentationModel, mv5.a earnAccountsWidgetControllerPresentationModel, qv5.a spotMarginTradingWidgetControllerPresentationModel, pv5.a perpetualsWidgetControllerPresentationModel, ov5.b mainAccountsClassicWidgetControllerPresentationModel, ut5.h pocketsDataProvider, ut5.k spotMarginTradingItemsProvider, ut5.g perpetualsItemsProvider) {
        Intrinsics.checkNotNullParameter(autoEarnEligibleWidgetControllerModelExtension, "autoEarnEligibleWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(mainAccountsWidgetControllerPresentationModel, "mainAccountsWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(earnAccountsWidgetControllerPresentationModel, "earnAccountsWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(spotMarginTradingWidgetControllerPresentationModel, "spotMarginTradingWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(perpetualsWidgetControllerPresentationModel, "perpetualsWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(mainAccountsClassicWidgetControllerPresentationModel, "mainAccountsClassicWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(pocketsDataProvider, "pocketsDataProvider");
        Intrinsics.checkNotNullParameter(spotMarginTradingItemsProvider, "spotMarginTradingItemsProvider");
        Intrinsics.checkNotNullParameter(perpetualsItemsProvider, "perpetualsItemsProvider");
        this.f168734l = autoEarnEligibleWidgetControllerModelExtension;
        this.f168735m = mainAccountsWidgetControllerPresentationModel;
        this.f168736n = earnAccountsWidgetControllerPresentationModel;
        this.o = spotMarginTradingWidgetControllerPresentationModel;
        this.f168737p = perpetualsWidgetControllerPresentationModel;
        this.f168738q = mainAccountsClassicWidgetControllerPresentationModel;
        this.f168739r = pocketsDataProvider;
        this.f168740s = spotMarginTradingItemsProvider;
        this.f168741t = perpetualsItemsProvider;
    }

    @Override // ut5.e
    public final Flow Z2() {
        jhi.b bVarF = mo3.a.f(this.f168739r.W(), new f0(22), new q(19), new iui.b(7));
        ((kv5.b) this.f168740s).getClass();
        Continuation continuation = null;
        return vkm.q.Q(ta6.a.h(bVarF, new go.g(ut5.j.HIDDEN, 2), this.f168741t.b(), new gce.l(this, continuation, 1)), new bwb.k(3, 7, continuation));
    }
}
