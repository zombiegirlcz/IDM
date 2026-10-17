package is7;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog.CreditCardAccruedInterestsBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreen;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationController;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreen;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsController;
import is7.d;
import is7.g;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168154a;

    public /* synthetic */ b(int i) {
        this.f168154a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f168154a) {
            case 0:
                return d.INSTANCE.serializer();
            case 1:
                return g.INSTANCE.serializer();
            case 2:
                d.Companion companion = d.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.policy.PolicyInfoSectionDto.PolicyItemDto.ActionDto", p0Var.b(d.class), new KClass[]{p0Var.b(d.b.class), p0Var.b(d.c.class)}, new KSerializer[]{d.b.a.f168158a, new d1("UNKNOWN", d.c.INSTANCE, new Annotation[]{new e()})}, new Annotation[]{new e()});
            case 3:
                return new d1("UNKNOWN", d.c.INSTANCE, new Annotation[]{new e()});
            case 4:
                g.Companion companion2 = g.INSTANCE;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.policy.PolicyInfoSectionDto.PolicyItemDto.TitleActionDto", p0Var2.b(g.class), new KClass[]{p0Var2.b(g.a.class), p0Var2.b(g.c.class)}, new KSerializer[]{g.a.C0942a.f168162a, new d1("UNKNOWN", g.c.INSTANCE, new Annotation[]{new e()})}, new Annotation[]{new e()});
            case 5:
                return new d1("UNKNOWN", g.c.INSTANCE, new Annotation[]{new e()});
            case 6:
                ThreeDsVerificationController.a aVar = ThreeDsVerificationController.Companion;
                return new LargeActionButtonDelegate();
            case 7:
                ThreeDsVerificationController.a aVar2 = ThreeDsVerificationController.Companion;
                return new FullScreenStateDelegate();
            case 8:
                ThreeDsVerificationController.a aVar3 = ThreeDsVerificationController.Companion;
                return new PromptMarketingContentDelegate();
            case 9:
                ThreeDsVerificationController.a aVar4 = ThreeDsVerificationController.Companion;
                return new CellDetailsActionDelegate();
            case 10:
                ThreeDsVerificationController.a aVar5 = ThreeDsVerificationController.Companion;
                return new RowDelegate(null, null, 7);
            case 11:
                ThreeDsVerificationController.a aVar6 = ThreeDsVerificationController.Companion;
                return new TextDelegate();
            case 12:
                KProperty[] kPropertyArr = AlternativeDocumentsController.T;
                return new CellDetailsListDelegate();
            case 13:
                KProperty[] kPropertyArr2 = AlternativeDocumentsController.T;
                return new RowDelegate(null, null, 7);
            case 14:
                KProperty[] kPropertyArr3 = ManualTransferReviewScreen.f92480e0;
                return new CellDetailsDelegate();
            case 15:
                KProperty[] kPropertyArr4 = ManualTransferReviewScreen.f92480e0;
                return new RowDelegate(null, null, 7);
            case 16:
                KProperty[] kPropertyArr5 = ManualTransferReviewScreen.f92480e0;
                return new HighlightTileDelegate();
            case 17:
                KProperty[] kPropertyArr6 = ManualTransferReviewScreen.f92480e0;
                return new CellDetailsDelegate();
            case 18:
                KProperty[] kPropertyArr7 = ManualTransferReviewScreen.f92480e0;
                return new CellDetailsActionDelegate();
            case 19:
                KProperty[] kPropertyArr8 = ManualTransferReviewScreen.f92480e0;
                return new CellDetailsNoteDelegate();
            case 20:
                KProperty[] kPropertyArr9 = ManualTransferReviewScreen.f92480e0;
                return new LargeActionButtonDelegate();
            case 21:
                KProperty[] kPropertyArr10 = ManualTransferReviewScreen.f92480e0;
                return new RowDelegate(null, null, 7);
            case 22:
                KProperty[] kPropertyArr11 = ManualTransferReviewScreen.f92480e0;
                return new HighlightTileDelegate();
            case 23:
                KProperty[] kPropertyArr12 = ManualTransferReviewScreen.f92480e0;
                return new TextDelegate();
            case 24:
                KProperty[] kPropertyArr13 = ManualTransferReviewScreen.f92480e0;
                return new CellDetailsActionDelegate();
            case 25:
                KProperty[] kPropertyArr14 = ManualTransferReviewScreen.f92480e0;
                return new CellDetailsNoteDelegate();
            case 26:
                KProperty[] kPropertyArr15 = ManualTransferReviewScreen.f92480e0;
                return new CellDetailsSwitcherDelegate();
            case 27:
                KProperty[] kPropertyArr16 = CreditCardAccruedInterestsBottomSheetController.U;
                return new RowDelegate(null, null, 7);
            case 28:
                return new qlm.e(iv9.c.f168783a);
            default:
                KProperty[] kPropertyArr17 = CreditCardStatementFinancingSetupScreen.Z;
                return new FullScreenStateDelegate();
        }
    }
}
