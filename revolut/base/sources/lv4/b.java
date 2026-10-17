package lv4;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreen;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collections_list.CryptoCollectionsController;
import com.revolut.feature.insurance_home.impl.data.model.Action;
import com.revolut.feature.insurance_home.impl.data.model.FooterButton;
import com.revolut.feature.insurance_home.impl.data.model.Header;
import com.revolut.feature.insurance_home.impl.data.model.ProductSummary;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.ui.login.pin.LoginActivity;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.j1;
import qlm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200284a;

    public /* synthetic */ b(int i) {
        this.f200284a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f200284a) {
            case 0:
                KProperty[] kPropertyArr = CreditCardStatementPageScreen.Z;
                return new CellDetailsBadgeDelegate();
            case 1:
                KProperty[] kPropertyArr2 = CreditCardStatementPageScreen.Z;
                return new FullScreenStateDelegate();
            case 2:
                KProperty[] kPropertyArr3 = CreditCardStatementPageScreen.Z;
                return new RowDelegate(null, null, 7);
            case 3:
                KProperty[] kPropertyArr4 = CreditCardStatementPageScreen.Z;
                return new CellDetailsChevronDelegate();
            case 4:
                KProperty[] kPropertyArr5 = CreditCardStatementPageScreen.Z;
                return new CellDetailsActionDelegate();
            case 5:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
            case 6:
                Action.Companion companion = Action.INSTANCE;
                return j1.b("com.revolut.feature.insurance_home.impl.data.model.Action.Type", lw7.a.values());
            case 7:
                FooterButton.b bVar = FooterButton.Companion;
                return FooterButton.Action.Companion.serializer();
            case 8:
                FooterButton.Action.a aVar = FooterButton.Action.Companion;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_home.impl.data.model.FooterButton.Action", p0Var.b(FooterButton.Action.class), new KClass[]{p0Var.b(FooterButton.Action.PlanUpgrade.class), p0Var.b(FooterButton.Action.Upgrade.class)}, new KSerializer[]{FooterButton.Action.PlanUpgrade.a.f76178a, FooterButton.Action.Upgrade.a.f76181a}, new Annotation[]{new com.revolut.feature.insurance_home.impl.data.model.a()});
            case 9:
                FooterButton.Action.Upgrade.b bVar2 = FooterButton.Action.Upgrade.Companion;
                return new qlm.e(v1.f247718a);
            case 10:
                Header.Companion companion2 = Header.INSTANCE;
                return new qlm.e(Header.Button.a.f76193a);
            case 11:
                Header.Button.Companion companion3 = Header.Button.INSTANCE;
                return Header.Button.Action.INSTANCE.serializer();
            case 12:
                Header.Button.Action.Companion companion4 = Header.Button.Action.INSTANCE;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_home.impl.data.model.Header.Button.Action", p0Var2.b(Header.Button.Action.class), new KClass[]{p0Var2.b(Header.Button.Action.Upgrade.class)}, new KSerializer[]{Header.Button.Action.Upgrade.a.f76192a}, new Annotation[]{new com.revolut.feature.insurance_home.impl.data.model.b()});
            case 13:
                Header.Button.Action.Upgrade.Companion companion5 = Header.Button.Action.Upgrade.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 14:
                return new qlm.e(com.revolut.feature.insurance_home.impl.data.model.c.f76206a);
            case 15:
                ProductSummary.Companion bVar3 = ProductSummary.INSTANCE;
                return new qlm.e(ProductSummary.Coverage.a.f76204a);
            case 16:
                return j1.b("com.revolut.feature.insurance_home.impl.data.model.Tag.Color", lw7.f.values());
            case 17:
                return new qlm.e(lw7.e.f200421a);
            case 18:
                return new qlm.e(lw7.b.f200417a);
            case 19:
                KProperty[] kPropertyArr6 = TransitSectionScreen.f92548d0;
                return new SmallStockCardDelegate();
            case 20:
                KProperty[] kPropertyArr7 = TransitSectionScreen.f92548d0;
                return new SmallCardLoadingDelegate(null);
            case 21:
                KProperty[] kPropertyArr8 = TransitSectionScreen.f92548d0;
                return new FullScreenStateDelegate();
            case 22:
                int i = LoginActivity.f107072x0;
                return null;
            case 23:
                return vkm.q.c(h0.f322473a);
            case 24:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_question, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
            case 25:
                return LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_near_me, new Color.Solid(R$attr.uikit_colorAccentNeutral), new Color.Solid(R$attr.uikit_colorGreyTone10));
            case 26:
                KProperty[] kPropertyArr9 = DirectDebitConfirmScreen.Q;
                return new CellDetailsDelegate();
            case 27:
                KProperty[] kPropertyArr10 = CryptoCollectionsController.R;
                return new ActionCardDelegate();
            case 28:
                KProperty[] kPropertyArr11 = CryptoCollectionsController.R;
                return new FullScreenStateDelegate();
            default:
                return new qlm.e(m05.z.f201088a);
        }
    }
}
