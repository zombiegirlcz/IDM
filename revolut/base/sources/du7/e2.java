package du7;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import du7.d2;
import du7.f4;
import du7.i5;
import du7.k3;
import du7.o2;
import du7.o4;
import du7.t2;
import du7.v4;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117662a;

    public /* synthetic */ e2(int i) {
        this.f117662a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AnalyticsContext analyticsContext = null;
        switch (this.f117662a) {
            case 0:
                return new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.CoverageDetailsLayoutDto.FooterButtonDto.ActionDto.Unknown", d2.e.INSTANCE, new Annotation[0]);
            case 1:
                d2.f.Companion companion = d2.f.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 2:
                return new qlm.e(i2.f117715a);
            case 3:
                o2.Companion companion2 = o2.INSTANCE;
                return new qlm.e(l2.f117742a);
            case 4:
                return new qlm.e(s2.f117837a);
            case 5:
                return new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.CoveragesSectionDto.CoverageDto.Action.Unknown", t2.b.INSTANCE, new Annotation[0]);
            case 6:
                return new qlm.e(x3.f117899a);
            case 7:
                return new qlm.e(qlm.v1.f247718a);
            case 8:
                return new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.DocumentsLayoutDto.DocumentDto.Action.Unknown", k3.b.INSTANCE, new Annotation[0]);
            case 9:
                return new qlm.e(j3.f117725a);
            case 10:
                return new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.EmbeddedInsuranceDetailsLayoutDto.FooterButtonDto.EmbeddedInsuranceDetailsFooterButtonActionDto.Unknown", f4.c.INSTANCE, new Annotation[0]);
            case 11:
                f4.d.Companion companion3 = f4.d.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 12:
                return new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.GenericBannerDto.GenericBannerActionDto.Unknown", o4.c.INSTANCE, new Annotation[0]);
            case 13:
                return new qlm.e(x4.f117900a);
            case 14:
                return new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.HeaderDto.ActionDto.Unknown", v4.d.INSTANCE, new Annotation[0]);
            case 15:
                v4.e.Companion companion4 = v4.e.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 16:
                i5.a aVar = i5.Companion;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.dto.HyperTextDto.ActionDto", p0Var.b(i5.class), new KClass[]{p0Var.b(i5.b.class), p0Var.b(i5.c.class), p0Var.b(i5.d.class)}, new KSerializer[]{i5.b.a.f117719a, new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.HyperTextDto.ActionDto.Documents", i5.c.INSTANCE, new Annotation[0]), new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.HyperTextDto.ActionDto.Unknown", i5.d.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 17:
                return new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.HyperTextDto.ActionDto.Documents", i5.c.INSTANCE, new Annotation[0]);
            case 18:
                return new qlm.d1("com.revolut.feature.insurance_embedded.impl.data.dto.HyperTextDto.ActionDto.Unknown", i5.d.INSTANCE, new Annotation[0]);
            case 19:
                return new qlm.e(h6.f117701a);
            case 20:
                return new qlm.e(t6.f117857a);
            case 21:
                return new qlm.e(p5.f117810a);
            case 22:
                return new qlm.e(q6.f117822a);
            case 23:
                return new qlm.e(m5.f117774a);
            case 24:
                return new qlm.e(qlm.v1.f247718a);
            case 25:
                return new qlm.e(qlm.v1.f247718a);
            case 26:
                return new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            case 27:
                com.revolut.shared.feature.wealth.models.trading_accounts.a[] elements = {com.revolut.shared.feature.wealth.models.trading_accounts.a.CREATED, com.revolut.shared.feature.wealth.models.trading_accounts.a.TERMINATED, com.revolut.shared.feature.wealth.models.trading_accounts.a.ONBOARDING};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.y0(elements);
            case 28:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
            default:
                int i = 12;
                return zhm.v.k(new FixedTabs.Item(pt5.b.TRANSACTIONS.getId(), new TextLocalisedClause(R$string.crypto_investments_transactions_title, null, null, 14), analyticsContext, i), new FixedTabs.Item(pt5.b.ORDERS.getId(), new TextLocalisedClause(R$string.crypto_investments_orders_title, null, null, 14), analyticsContext, i));
        }
    }
}
