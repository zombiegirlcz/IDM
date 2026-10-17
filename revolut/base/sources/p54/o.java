package p54;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit_resources.R$drawable;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ozc.z;
import qc0.i1;
import te0.s;
import te0.w;
import zc0.y2;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends y2 {
    public final jt0.b C;
    public final e D;
    public final xpi.g E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jt0.b creditBackendFlowCancellationChecker, e state, xpi.g navBarWithToolbarView, zc0.g presentationModel, qc0.j router, ypi.i nextButtonView, zc0.c backendFlowItemsMapper, npi.a dialogView, k3l.b statusDialogView, rpi.c keyboardView, zd7.b imagePickerBottomDialog, tpi.j progressView, opi.d expandableDialogView, cqi.h promptView, i1 backendFlowTransactionsProvider, oc0.f cardsRepository, fc0.f backendFlowEntitiesInteractor, oc0.m backendFlowTicketsRepository, t9l.g sharedTransactionInteractor, oc0.k entitiesSummaryRepository, f01.c uiKitResources) {
        super(promptView, uiKitResources, backendFlowEntitiesInteractor, statusDialogView, dialogView, cardsRepository, entitiesSummaryRepository, backendFlowTicketsRepository, expandableDialogView, router, backendFlowTransactionsProvider, keyboardView, sharedTransactionInteractor, progressView, navBarWithToolbarView, nextButtonView, backendFlowItemsMapper, presentationModel, imagePickerBottomDialog);
        Intrinsics.checkNotNullParameter(creditBackendFlowCancellationChecker, "creditBackendFlowCancellationChecker");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(backendFlowItemsMapper, "backendFlowItemsMapper");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(imagePickerBottomDialog, "imagePickerBottomDialog");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(promptView, "promptView");
        Intrinsics.checkNotNullParameter(backendFlowTransactionsProvider, "backendFlowTransactionsProvider");
        Intrinsics.checkNotNullParameter(cardsRepository, "cardsRepository");
        Intrinsics.checkNotNullParameter(backendFlowEntitiesInteractor, "backendFlowEntitiesInteractor");
        Intrinsics.checkNotNullParameter(backendFlowTicketsRepository, "backendFlowTicketsRepository");
        Intrinsics.checkNotNullParameter(sharedTransactionInteractor, "sharedTransactionInteractor");
        Intrinsics.checkNotNullParameter(entitiesSummaryRepository, "entitiesSummaryRepository");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.C = creditBackendFlowCancellationChecker;
        this.D = state;
        this.E = navBarWithToolbarView;
    }

    @Override // zc0.y2, pri.b, pri.e
    /* JADX INFO: renamed from: O */
    public final void h(zc0.i view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        if (!((Boolean) w.M(this.D.V(), Boolean.FALSE)).booleanValue()) {
            ((xpi.c) this.E).e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
            return;
        }
        jt0.b bVar = this.C;
        qc0.k kVar = (qc0.k) bVar.f178265b;
        te0.e eVarR0 = kVar.r0();
        s sVar = s.f270018a;
        r map = w.l(eVarR0.c(sVar), ((te0.r) kVar.k()).c(sVar)).distinctUntilChanged().map(new q3d.c(12, new q03.h(bVar, 29)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        oxd.m mVar = new oxd.m(this, 21);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = map.onErrorResumeNext(new os2.g(new p2i.l(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new lhi.b(19, mVar), new lhi.b(19, function1K), new z(7, function0J));
        w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }

    @Override // zc0.y2
    public final void Y() {
    }
}
