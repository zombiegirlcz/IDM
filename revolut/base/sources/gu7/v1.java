package gu7;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreen;
import com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner;
import com.revolut.feature.insurance_embedded.impl.data.model.PricingPlanBanner;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsuranceActivateCoverageWidget;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreen;
import com.revolut.feature.security_hub.impl.ui.secure_account.SecureAccountController;
import gu7.e3;
import gu7.p2;
import gu7.w1;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146846a;

    public /* synthetic */ v1(int i) {
        this.f146846a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f146846a) {
            case 0:
                w1.Companion aVar = w1.INSTANCE;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.DocumentsLayout.Document.Action", p0Var.b(w1.class), new KClass[]{p0Var.b(z1.class), p0Var.b(c2.class), p0Var.b(f2.class)}, new KSerializer[]{x1.f146862a, a2.f146711a, d2.f146728a}, new Annotation[]{new bka.b(27)});
            case 1:
                return new qlm.e(qlm.v1.f247718a);
            case 2:
                return new qlm.e(u1.f146839a);
            case 3:
                return com.revolut.feature.insurance_embedded.impl.data.model.j.INSTANCE.serializer();
            case 4:
                return p2.INSTANCE.serializer();
            case 5:
                p2.Companion aVar2 = p2.INSTANCE;
                kotlin.jvm.internal.p0 p0Var2 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.EmbeddedInsuranceDetailsLayout.FooterButton.EmbeddedInsuranceDetailsFooterButtonAction", p0Var2.b(p2.class), new KClass[]{p0Var2.b(s2.class), p0Var2.b(v2.class)}, new KSerializer[]{q2.f146812a, t2.f146835a}, new Annotation[]{new bka.b(28)});
            case 6:
                return new qlm.e(qlm.v1.f247718a);
            case 7:
                GenericBanner.Companion bVar = GenericBanner.INSTANCE;
                return GenericBanner.GenericBannerAction.INSTANCE.serializer();
            case 8:
                GenericBanner.GenericBannerAction.Companion aVar3 = GenericBanner.GenericBannerAction.INSTANCE;
                kotlin.jvm.internal.p0 p0Var3 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner.GenericBannerAction", p0Var3.b(GenericBanner.GenericBannerAction.class), new KClass[]{p0Var3.b(GenericBanner.GenericBannerAction.Deeplink.class)}, new KSerializer[]{GenericBanner.GenericBannerAction.Deeplink.a.f75944a}, new Annotation[]{new com.revolut.feature.insurance_embedded.impl.data.model.m0()});
            case 9:
                GenericBanner.GenericBannerButton.Companion bVar2 = GenericBanner.GenericBannerButton.INSTANCE;
                return GenericBanner.GenericBannerAction.INSTANCE.serializer();
            case 10:
                return new qlm.e(o3.f146806a);
            case 11:
                e3.Companion aVar4 = e3.INSTANCE;
                kotlin.jvm.internal.p0 p0Var4 = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.impl.data.model.Header.Action", p0Var4.b(e3.class), new KClass[]{p0Var4.b(h3.class), p0Var4.b(k3.class), p0Var4.b(n3.class)}, new KSerializer[]{f3.f146748a, i3.f146766a, l3.f146786a}, new Annotation[]{new bka.b(29)});
            case 12:
                return new qlm.e(qlm.v1.f247718a);
            case 13:
                return e3.INSTANCE.serializer();
            case 14:
                return qlm.j1.b("com.revolut.feature.insurance_embedded.impl.data.model.Header.TypedImageType", y3.values());
            case 15:
                return new qlm.e(a3.f146712a);
            case 16:
                return new qlm.e(b4.f146716a);
            case 17:
                PricingPlanBanner.Companion bVar3 = PricingPlanBanner.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 18:
                return new fu7.l();
            case 19:
                return new qlm.e(h4.f146760a);
            case 20:
                SchemeInsuranceActivateCoverageWidget.Companion bVar4 = SchemeInsuranceActivateCoverageWidget.INSTANCE;
                return new qlm.e(qlm.v1.f247718a);
            case 21:
                return new qlm.e(q4.f146816a);
            case 22:
                return new qlm.e(c5.f146726a);
            case 23:
                return new qlm.e(r5.f146824a);
            case 24:
                return p5.Companion.serializer();
            case 25:
                return qlm.j1.b("com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePolicyLink.Type", p5.values());
            case 26:
                KProperty[] kPropertyArr = CreditCardAccruedInterestsScreen.S;
                return new CellDetailsDelegate();
            case 27:
                KProperty[] kPropertyArr2 = SimpleTextDocumentScreen.S;
                return new FullScreenStateDelegate();
            case 28:
                KProperty[] kPropertyArr3 = SimpleTextDocumentScreen.S;
                return new NotificationCentreItemDelegate();
            default:
                KProperty[] kPropertyArr4 = SecureAccountController.U;
                return new RowDelegate(null, null, 7);
        }
    }
}
