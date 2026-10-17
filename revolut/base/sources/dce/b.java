package dce;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreen;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsController;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreen;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.retail.core.navigation.FeatureCommand;
import df6.a;
import df6.b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112858a;

    public /* synthetic */ b(int i) {
        this.f112858a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f112858a) {
            case 0:
                KProperty[] kPropertyArr = SubscriptionDetailsController.j0;
                return new FullScreenStateDelegate();
            case 1:
                KProperty[] kPropertyArr2 = SubscriptionDetailsController.j0;
                return new DatePickerDelegate();
            case 2:
                return Unit.f186387a;
            case 3:
                KProperty[] kPropertyArr3 = TradingAddOnsMainScreen.f91675h0;
                return new FullScreenStateDelegate();
            case 4:
                KProperty[] kPropertyArr4 = TradingAddOnsMainScreen.f91675h0;
                return new ListSubheaderDelegate();
            case 5:
                KProperty[] kPropertyArr5 = TradingAddOnsMainScreen.f91675h0;
                return new RowLoadingDelegate();
            case 6:
                KProperty[] kPropertyArr6 = TradingAddOnsMainScreen.f91675h0;
                return new PlanTileDelegate(0);
            case 7:
                KProperty[] kPropertyArr7 = TradingAddOnsMainScreen.f91675h0;
                return new TextDelegate();
            case 8:
                return new FullScreenStateDelegate();
            case 9:
                return new ListSubheaderDelegate();
            case 10:
                return new RowLoadingDelegate();
            case 11:
                return new PlanTileDelegate(0);
            case 12:
                RevPointsPocketInfo.Companion bVar = RevPointsPocketInfo.INSTANCE;
                return ddi.e.Companion.serializer();
            case 13:
                return j1.b("com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo.State", ddi.e.values());
            case 14:
                RevPointsPocketState.Companion aVar = RevPointsPocketState.INSTANCE;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState", p0Var.b(RevPointsPocketState.class), new KClass[]{p0Var.b(RevPointsPocketState.Active.class), p0Var.b(RevPointsPocketState.Inactive.class)}, new KSerializer[]{RevPointsPocketState.Active.a.f97791a, new d1("Inactive", RevPointsPocketState.Inactive.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 15:
                return new d1("Inactive", RevPointsPocketState.Inactive.INSTANCE, new Annotation[0]);
            case 16:
                v1 v1Var = v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
            case 17:
                a.Companion bVar2 = df6.a.INSTANCE;
                return new qlm.e(b.a.f113799a);
            case 18:
                a.Companion bVar3 = df6.a.INSTANCE;
                return new qlm.e(b.a.f113799a);
            case 19:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
            case 20:
                return new tf(4, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
            case 21:
                KProperty[] kPropertyArr8 = PayLaterPlanDetailsScreen.j0;
                return new RowDelegate(null, null, 7);
            case 22:
                KProperty[] kPropertyArr9 = PayLaterPlanDetailsScreen.j0;
                return new CellDetailsDelegate();
            case 23:
                KProperty[] kPropertyArr10 = PayLaterPlanDetailsScreen.j0;
                return new CellDetailsChevronDelegate();
            case 24:
                KProperty[] kPropertyArr11 = PayLaterPlanDetailsScreen.j0;
                return new CellDetailsActionDelegate();
            case 25:
                KProperty[] kPropertyArr12 = PayLaterPlanDetailsScreen.j0;
                return new PlainTextWarningDelegate();
            case 26:
                KProperty[] kPropertyArr13 = PayLaterPlanDetailsScreen.j0;
                return new ProgressStepVerticalDelegate();
            case 27:
                KProperty[] kPropertyArr14 = PayLaterPlanDetailsScreen.j0;
                return new LargeActionButtonDelegate();
            case 28:
                KProperty[] kPropertyArr15 = PayLaterPlanDetailsScreen.j0;
                return new ListSubheaderDelegate();
            default:
                SlotDefaultPrompt.Content.Companion bVar4 = SlotDefaultPrompt.Content.INSTANCE;
                return SlotDefaultPrompt.LayoutType.INSTANCE.serializer();
        }
    }
}
