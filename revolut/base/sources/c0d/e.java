package c0d;

import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.list.ApmRecipientListScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationController;
import com.revolut.feature.credit.loan.impl.ui.rev10.loanslist.LoansListScreen;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreen;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.Rev10ChatTransferScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreen;
import com.revolut.feature.selfserve.sow.impl.ui.help.SowHelpFragment;
import com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen.InvestTransactionsListScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note.StructuredReferenceTransferNoteScreen;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonScreen;
import ft3.q0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import nel.z;
import qlm.d1;
import zhm.u;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20237a;

    public /* synthetic */ e(int i) {
        this.f20237a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20237a) {
            case 0:
                SowHelpFragment.Companion companion = SowHelpFragment.INSTANCE;
                return new ListCellDelegate();
            case 1:
                xi0.b.Companion.getClass();
                return v.n(xi0.b.f306272g, xi0.b.i, xi0.b.f306273h);
            case 2:
                xi0.b.Companion.getClass();
                return u.c(xi0.b.H);
            case 3:
                xi0.b.Companion.getClass();
                return u.c(xi0.b.S);
            case 4:
                return y0.b(z.BOND);
            case 5:
                z[] elements = {z.ETF, z.ETC, z.ETN};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.y0(elements);
            case 6:
                z[] elements2 = {z.ADR, z.EQUITY, z.WARRANT, z.SPAC};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return kotlin.collections.d.y0(elements2);
            case 7:
                return LocalLifecycleOwnerKt.LocalLifecycleOwner$lambda$3$lambda$2();
            case 8:
                KProperty[] kPropertyArr = ApmRecipientListScreen.V;
                return new RowDelegate(null, null, 7);
            case 9:
                KProperty[] kPropertyArr2 = ApmRecipientListScreen.V;
                return new FullScreenStateDelegate();
            case 10:
                KProperty[] kPropertyArr3 = ApmRecipientListScreen.V;
                return new ActionWidgetDelegate();
            case 11:
                KProperty[] kPropertyArr4 = StructuredReferenceTransferNoteScreen.S;
                return new FixedTabsDelegate();
            case 12:
                KProperty[] kPropertyArr5 = ChatTransferScreen.f80146e0;
                DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
                defaultItemAnimator.setSupportsChangeAnimations(false);
                return defaultItemAnimator;
            case 13:
                KProperty[] kPropertyArr6 = Rev10ChatTransferScreen.i0;
                DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator();
                defaultItemAnimator2.setSupportsChangeAnimations(false);
                return defaultItemAnimator2;
            case 14:
                KProperty[] kPropertyArr7 = CancelLoanConfirmationController.U;
                return new TextDelegate();
            case 15:
                KProperty[] kPropertyArr8 = CancelLoanConfirmationController.U;
                return new LargeActionButtonDelegate();
            case 16:
                KProperty[] kPropertyArr9 = CancelLoanConfirmationController.U;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr10 = LoansListScreen.c0;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr11 = LoansListScreen.c0;
                return new FullScreenStateDelegate();
            case 19:
                KProperty[] kPropertyArr12 = CobrandedCardsSelectionScreen.T;
                return new CellDetailsStandaloneNoteDelegate();
            case 20:
                KProperty[] kPropertyArr13 = CobrandedCardsSelectionScreen.T;
                return new LargeActionButtonDelegate();
            case 21:
                KProperty[] kPropertyArr14 = CobrandedCardsSelectionScreen.T;
                return new FullScreenStateDelegate();
            case 22:
                KProperty[] kPropertyArr15 = MoneyRequestRejectWithReasonScreen.c0;
                return new InputTextDelegate(null);
            case 23:
                KProperty[] kPropertyArr16 = MoneyRequestRejectWithReasonScreen.c0;
                return new ActionsDelegate();
            case 24:
                return new ResourceImage(R$drawable.uikit_icn_20_keyboard_sticker, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 25:
                CreditAccountType.Companion companion2 = CreditAccountType.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.credit.models.CreditAccountType", p0Var.b(CreditAccountType.class), new KClass[]{p0Var.b(CreditAccountType.Application.class), p0Var.b(CreditAccountType.CreditCard.class), p0Var.b(CreditAccountType.EmptyState.class), p0Var.b(CreditAccountType.Loan.class), p0Var.b(CreditAccountType.Overdraft.class), p0Var.b(CreditAccountType.PayLater.class)}, new KSerializer[]{CreditAccountType.Application.a.f70623a, CreditAccountType.CreditCard.a.f70625a, CreditAccountType.EmptyState.a.f70628a, CreditAccountType.Loan.a.f70630a, new d1("overdraft", CreditAccountType.Overdraft.INSTANCE, new Annotation[]{new com.revolut.feature.credit.models.b()}), CreditAccountType.PayLater.a.f70633a}, new Annotation[]{new com.revolut.feature.credit.models.b()});
            case 26:
                CreditAccountType.Application.Companion companion3 = CreditAccountType.Application.INSTANCE;
                return q0.Companion.serializer();
            case 27:
                CreditAccountType.EmptyState.Companion companion4 = CreditAccountType.EmptyState.INSTANCE;
                return q0.Companion.serializer();
            case 28:
                return new d1("overdraft", CreditAccountType.Overdraft.INSTANCE, new Annotation[]{new com.revolut.feature.credit.models.b()});
            default:
                KProperty[] kPropertyArr17 = InvestTransactionsListScreen.Z;
                return new RowLoadingDelegate();
        }
    }
}
