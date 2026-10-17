package ma4;

import com.revolut.core.ui_kit_resources.R$drawable;
import cqi.h;
import fc0.f;
import kotlin.jvm.internal.Intrinsics;
import oc0.k;
import oc0.m;
import opi.d;
import qc0.i1;
import qc0.j;
import xpi.g;
import ypi.i;
import zc0.y2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends y2 {
    public final g C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h promptView, f01.c uiKitResources, f backendFlowEntitiesInteractor, k3l.b statusDialogView, npi.a dialogView, oc0.f cardsRepository, k entitiesSummaryRepository, m backendFlowTicketsRepository, d expandableDialogView, j router, i1 backendFlowTransactionsProvider, rpi.c keyboardView, t9l.g sharedTransactionInteractor, tpi.j progressView, g navBarWithToolbarView, i nextButtonView, zc0.c backendFlowItemsMapper, zc0.g presentationModel, zd7.b imagePickerBottomDialog) {
        super(promptView, uiKitResources, backendFlowEntitiesInteractor, statusDialogView, dialogView, cardsRepository, entitiesSummaryRepository, backendFlowTicketsRepository, expandableDialogView, router, backendFlowTransactionsProvider, keyboardView, sharedTransactionInteractor, progressView, navBarWithToolbarView, nextButtonView, backendFlowItemsMapper, presentationModel, imagePickerBottomDialog);
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
        this.C = navBarWithToolbarView;
    }

    @Override // zc0.y2, pri.b, pri.e
    /* JADX INFO: renamed from: O */
    public final void h(zc0.i view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        ((xpi.c) this.C).e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // zc0.y2
    public final void Y() {
    }
}
