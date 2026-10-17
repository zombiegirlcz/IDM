package m1i;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import m1i.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends vm.c {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f201574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f201575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3l.a f201576c;
    public final k d;
    public final t70.b e;
    public final yik.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ym.d f201577g;

    public s(sf0.h serverErrorParser, v60.e serverErrorsProvider, g3l.a statusDialogViewConfigurationDispatcher, k presentationModel, t70.b currencyLocalization, yik.h pricingPlanStringMapper, ym.d loadingDispatcher, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(loadingDispatcher, "loadingDispatcher");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f201574a = serverErrorParser;
        this.f201575b = serverErrorsProvider;
        this.f201576c = statusDialogViewConfigurationDispatcher;
        this.d = presentationModel;
        this.e = currencyLocalization;
        this.f = pricingPlanStringMapper;
        this.f201577g = loadingDispatcher;
    }

    @Override // vm.d
    public final efm.d0 d(um.a errorData) {
        efm.b aVar;
        efm.b aVar2;
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        ServerError serverErrorA = this.f201574a.a(errorData.f281173b);
        if (serverErrorA == null) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        int i = serverErrorA.f51362a;
        v60.c cVarB = ((ao0.a) this.f201575b).b(Integer.valueOf(i));
        TextLocalisedClause textLocalisedClauseO = cVarB != null ? ofm.q.O(cVarB) : new TextLocalisedClause(R$string.fx_orders_status_title_something_went_wrong, null, null, 14);
        k kVar = this.d;
        if (i != 1503) {
            if (i == 1507) {
                efm.d0 d0VarFirstOrError = ((g1i.d0) kVar).F3().firstOrError();
                m0g.d dVar = new m0g.d(6, new p(this, 0));
                d0VarFirstOrError.getClass();
                aVar2 = new pfm.a(d0VarFirstOrError, dVar, 4);
            } else if (i != 4100) {
                g3l.a aVar3 = this.f201576c;
                aVar = i != 10800 ? aVar3.c0(new StatusViewConfiguration.Error("STATUS_GENERIC_ERROR", textLocalisedClauseO, null, null, new TextLocalisedClause(R$string.fx_orders_status_action_retry, null, null, 14), null, null, 8172)) : aVar3.c0(new StatusViewConfiguration.Error("STATUS_CRYPTO_NOT_ALLOWED", new TextLocalisedClause(R$string.fx_orders_status_title_transaction_unsuccessful, null, null, 14), new TextLocalisedClause(R$string.fx_orders_status_description_crypto_not_allowed, null, null, 14), new TextLocalisedClause(R$string.fx_orders_status_action_got_it, null, null, 14), null, null, null, 8176));
            } else {
                aVar2 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(aVar2, "complete(...)");
            }
            aVar = aVar2;
        } else {
            g1i.d0 d0Var = (g1i.d0) kVar;
            efm.d0 d0VarFirstOrError2 = ((g1i.m0) d0Var.e).y0().c(te0.s.f270018a).firstOrError();
            g1i.e eVar = new g1i.e(10, new g1.c(17));
            d0VarFirstOrError2.getClass();
            ufm.i iVar = new ufm.i(new ufm.i(d0VarFirstOrError2, eVar, 1), new g1i.e(11, new g1i.d(d0Var, 8)), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            aVar = new pfm.a(new ufm.f(new ufm.f(new ufm.f(o70.a.i(iVar), new m0g.d(7, new p(this, 1)), 2), new m0g.d(8, new p(this, 2)), 3), new m0g.d(9, new p(this, 3)), 1), new m0g.d(10, new p(this, 4)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        }
        ufm.b bVarM2 = efm.d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        rfm.f0 f0VarF = aVar.f(bVarM2);
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }

    public final void e(boolean z) {
        ym.b bVar = new ym.b(q.a.f201570a, z, "LOADING_ID_GET_CURRENCY_NOT_AVAILABLE_DETAILS");
        ym.d dVar = this.f201577g;
        dVar.getClass();
        dVar.D(bVar);
    }
}
