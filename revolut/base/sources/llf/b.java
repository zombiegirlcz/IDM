package llf;

import aii.e;
import aii.g;
import aii.u;
import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$TransactionDetailsFeesBreakdown;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$TransactionDetailsHorizontalPager;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.transactions.impl.ui.kompot.details.OpenExternalLinkDialogDestination;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreen;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreen;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.declaration.EditNoteDestination;
import com.revolut.feature.transactions.impl.ui.kompot.receipts.ReceiptsScreen;
import com.revolut.feature.transactions.impl.ui.kompot.receipts.ReceiptsScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.kompot.receipts.declaration.ReceiptsDestination;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreen;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.declaration.LinkedTransactionDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.c;
import nc1.j;
import rhf.f;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nlf.a f196794a;

    public b(nlf.a openExternalLinkDialogFactory) {
        Intrinsics.checkNotNullParameter(openExternalLinkDialogFactory, "openExternalLinkDialogFactory");
        this.f196794a = openExternalLinkDialogFactory;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof f)) {
            return null;
        }
        f fVar = (f) descriptor;
        return fVar.a(new TransactionDetailsScreen(new TransactionDetailsScreenContract$InputData(fVar.f254446a, fVar.f254447b, fVar.f254448c)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(TransactionDetailsApi$Toggles$TransactionDetailsHorizontalPager.f91960c, TransactionDetailsApi$Toggles$TransactionDetailsKompotLoyalty.f91961c, TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked.f91958c, TransactionDetailsApi$Toggles$TransactionDetailsFeesBreakdown.f91959c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TransactionDetailsDestination) {
            TransactionDetailsDestination transactionDetailsDestination = (TransactionDetailsDestination) destination;
            return new TransactionDetailsScreen(new TransactionDetailsScreenContract$InputData(transactionDetailsDestination.f91988a, transactionDetailsDestination.f91989b, transactionDetailsDestination.f91990c));
        }
        if (destination instanceof EditNoteDestination) {
            EditNoteDestination editNoteDestination = (EditNoteDestination) destination;
            return new EditNoteScreen(new EditNoteScreenContract$InputData(editNoteDestination.f92063a, editNoteDestination.f92064b));
        }
        if (destination instanceof ReceiptsDestination) {
            return new ReceiptsScreen(new ReceiptsScreenContract$InputData(((ReceiptsDestination) destination).f92066a));
        }
        if (!(destination instanceof OpenExternalLinkDialogDestination)) {
            if (!(destination instanceof LinkedTransactionDestination)) {
                return null;
            }
            LinkedTransactionDestination linkedTransactionDestination = (LinkedTransactionDestination) destination;
            return new LinkedTransactionScreen(new LinkedTransactionScreenContract$InputData(linkedTransactionDestination.f92089a, linkedTransactionDestination.f92090b, linkedTransactionDestination.f92091c, linkedTransactionDestination.d));
        }
        String url2 = ((OpenExternalLinkDialogDestination) destination).f92040a;
        Intrinsics.checkNotNullParameter(url2, "url");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.transaction_details_leave_app_dialogue_title, null, null, 14), new TextLocalisedClause(R$string.transaction_details_leave_app_dialogue_subtitle, null, null, 14), new c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), null, false, 24);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R$string.transaction_details_leave_app_dialogue_actions_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.transaction_details_leave_app_dialogue_actions_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
        k9 k9Var = k9.Transaction;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        j block = new j(this.f196794a, url2, 17);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }
}
