package o23;

import android.graphics.Paint;
import androidx.core.backported.fixes.KnownIssue;
import androidx.core.backported.fixes.KnownIssues;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.impl.ui.transactions_list.area.ApmTransactionAreaListScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.EnrollmentLabelScreen;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeController;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.CobrandedCardsPlanHubRewardSelectionScreen;
import java.lang.annotation.Annotation;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import o45.c1;
import o45.e1;
import o45.f1;
import o45.g1;
import o45.i1;
import o45.j0;
import o45.j1;
import o45.k0;
import o45.l1;
import o45.m0;
import o45.m1;
import o45.o1;
import o45.p1;
import o45.q1;
import o45.s1;
import o45.t1;
import qlm.d1;
import qlm.v1;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221441a;

    public /* synthetic */ b(int i) {
        this.f221441a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f221441a) {
            case 0:
                KProperty[] kPropertyArr = AddressFormController.Y;
                return new TextDelegate();
            case 1:
                return Boolean.valueOf(KnownIssue._init_$lambda$0());
            case 2:
                return Boolean.valueOf(KnownIssues.KI_372917199$lambda$0());
            case 3:
                return Boolean.valueOf(KnownIssues.KI_398591036$lambda$0());
            case 4:
                return Boolean.valueOf(KnownIssues.KI_452390376$lambda$0());
            case 5:
                return new Paint();
            case 6:
                KProperty[] kPropertyArr2 = ApmTransactionAreaListScreen.V;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr3 = ApmTransactionAreaListScreen.V;
                return new FullScreenStateDelegate();
            case 8:
                return new qlm.e(v1.f247718a);
            case 9:
                return new qlm.e(v1.f247718a);
            case 10:
                return new qlm.e(o45.w.f222119a);
            case 11:
                return new qlm.e(o45.d.f222036a);
            case 12:
                j0.Companion aVar = j0.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.credit.loan.impl.database.entity.LoanEntity.LoanInsuranceStateDescriptor", p0Var.b(j0.class), new KClass[]{p0Var.b(j0.b.class), p0Var.b(j0.c.class), p0Var.b(m0.class)}, new KSerializer[]{new d1("ELIGIBLE", j0.b.INSTANCE, new Annotation[]{new p1("type")}), new d1("INELIGIBLE", j0.c.INSTANCE, new Annotation[]{new p1("type")}), k0.f222074a}, new Annotation[]{new p1("type")});
            case 13:
                return new d1("ELIGIBLE", j0.b.INSTANCE, new Annotation[]{new p1("type")});
            case 14:
                return new d1("INELIGIBLE", j0.c.INSTANCE, new Annotation[]{new p1("type")});
            case 15:
                return new qlm.e(o45.g0.f222060a);
            case 16:
                f1.Companion aVar2 = f1.INSTANCE;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.credit.loan.impl.database.entity.LoanEntity.LoanStateDescription", p0Var2.b(f1.class), new KClass[]{p0Var2.b(e1.class), p0Var2.b(i1.class), p0Var2.b(f1.b.class), p0Var2.b(l1.class), p0Var2.b(o1.class), p0Var2.b(f1.c.class), p0Var2.b(s1.class), p0Var2.b(o45.v1.class)}, new KSerializer[]{c1.f222025a, g1.f222061a, new d1("HEALTHY", f1.b.INSTANCE, new Annotation[]{new p1("state")}), j1.f222072a, m1.f222082a, new d1("PLANNED", f1.c.INSTANCE, new Annotation[]{new p1("state")}), q1.f222095a, t1.f222109a}, new Annotation[]{new p1("state")});
            case 17:
                return new d1("HEALTHY", f1.b.INSTANCE, new Annotation[]{new p1("state")});
            case 18:
                return new d1("PLANNED", f1.c.INSTANCE, new Annotation[]{new p1("state")});
            case 19:
                pdh.c[] elements = {pdh.c.ONE_DAY, pdh.c.ONE_WEEK, pdh.c.ONE_MONTH, pdh.c.SIX_MONTHS, pdh.c.ONE_YEAR, pdh.c.FIVE_YEARS, pdh.c.ALL};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return (pdh.c[]) kotlin.collections.d.L(elements).toArray(new pdh.c[0]);
            case 20:
                KProperty[] kPropertyArr4 = CobrandedCardsPlanHubRewardSelectionScreen.S;
                return new SingleChoiceDelegate();
            case 21:
                KProperty[] kPropertyArr5 = CobrandedCardsPlanHubRewardSelectionScreen.S;
                return new FullScreenStateDelegate();
            case 22:
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_16_canceled;
                int i2 = R$attr.uikit_colorWidgetBackground;
                return LayeredImage.Companion.f(companion, i, R$attr.uikit_colorDeepGrey, i2, Integer.valueOf(i2), 4.0f, 4.0f, null, 64);
            case 23:
                KProperty[] kPropertyArr6 = LoanRepaymentTypeController.R;
                return new ProductSelectionDelegate();
            case 24:
                KProperty[] kPropertyArr7 = LoanRepaymentTypeController.R;
                return new FullScreenStateDelegate();
            case 25:
                String[] iSOCountries = Locale.getISOCountries();
                Intrinsics.checkNotNullExpressionValue(iSOCountries, "getISOCountries(...)");
                return r0.v(nkm.y.x(kotlin.collections.d.E(iSOCountries), new o69.b(24)));
            case 26:
                KProperty[] kPropertyArr8 = EnrollmentLabelScreen.S;
                return new InputTextDelegate(null);
            case 27:
                PixAuthorisationRequestScreen.a aVar3 = PixAuthorisationRequestScreen.Companion;
                return new CellDetailsActionDelegate();
            case 28:
                PixAuthorisationRequestScreen.a aVar4 = PixAuthorisationRequestScreen.Companion;
                return new CellDetailsSwitcherDelegate();
            default:
                PixAuthorisationRequestScreen.a aVar5 = PixAuthorisationRequestScreen.Companion;
                return new PlainTextWarningDelegate();
        }
    }
}
