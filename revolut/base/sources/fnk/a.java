package fnk;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ImageAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bizum.impl.ui.registration.terms_old.BizumRegistrationTermsOldScreen;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreen;
import fs7.b0;
import fs7.j;
import fs7.t;
import fs7.x;
import fs7.y;
import fs7.z;
import ft3.g;
import ft3.v;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136693a;

    public /* synthetic */ a(int i) {
        this.f136693a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f136693a) {
            case 0:
                KProperty[] kPropertyArr = PlanPreviewScreen.R;
                return new FullScreenStateDelegate();
            case 1:
                KProperty[] kPropertyArr2 = CounterPartyDetailsScreen.V;
                return new FixedTabsDelegate();
            case 2:
                KProperty[] kPropertyArr3 = CounterPartyDetailsScreen.V;
                return new CellDetailsDelegate();
            case 3:
                KProperty[] kPropertyArr4 = CounterPartyDetailsScreen.V;
                return new CellDetailsChevronDelegate();
            case 4:
                KProperty[] kPropertyArr5 = CounterPartyDetailsScreen.V;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr6 = CounterPartyDetailsScreen.V;
                return new LargeActionButtonDelegate();
            case 6:
                return new PromptMarketingContentDelegate();
            case 7:
                KProperty[] kPropertyArr7 = JuniorTransferAmountScreen.i0;
                return new InputTextDelegate(null);
            case 8:
                KProperty[] kPropertyArr8 = JuniorTransferAmountScreen.i0;
                return new ImageAttachmentDelegate();
            case 9:
                KProperty[] kPropertyArr9 = JuniorTransferAmountScreen.i0;
                return new FullScreenStateDelegate();
            case 10:
                return new qlm.e(v1.f247718a);
            case 11:
                return fs7.j.INSTANCE.serializer();
            case 12:
                j.Companion companion = fs7.j.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.coverages.CoverageDetailsLayoutDto.FooterButtonDto.ActionDto", p0Var.b(fs7.j.class), new KClass[]{p0Var.b(j.b.class), p0Var.b(j.c.class)}, new KSerializer[]{new d1("MAKE_EMBEDDED_CLAIM", j.b.INSTANCE, new Annotation[]{new rlm.g() { // from class: fs7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }}), new d1("UNKNOWN", j.c.INSTANCE, new Annotation[]{new rlm.g() { // from class: fs7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }})}, new Annotation[]{new rlm.g() { // from class: fs7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }});
            case 13:
                return new d1("MAKE_EMBEDDED_CLAIM", j.b.INSTANCE, new Annotation[]{new rlm.g() { // from class: fs7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }});
            case 14:
                return new d1("UNKNOWN", j.c.INSTANCE, new Annotation[]{new rlm.g() { // from class: fs7.k
                    {
                        Intrinsics.checkNotNullParameter("type", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return rlm.g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "type";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 705071198;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
                    }
                }});
            case 15:
                return new qlm.e(fs7.n.f137636a);
            case 16:
                t.Companion companion2 = t.INSTANCE;
                return new qlm.e(fs7.q.f137640a);
            case 17:
                return new qlm.e(x.f137652a);
            case 18:
                return y.INSTANCE.serializer();
            case 19:
                y.Companion companion3 = y.INSTANCE;
                p0 p0Var2 = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.coverages.CoveragesSectionDto.CoverageDto.Action", p0Var2.b(y.class), new KClass[]{p0Var2.b(b0.class), p0Var2.b(y.b.class)}, new KSerializer[]{z.f137655a, new d1("UNKNOWN", y.b.INSTANCE, new Annotation[]{new bka.b(19)})}, new Annotation[]{new bka.b(19)});
            case 20:
                return new d1("UNKNOWN", y.b.INSTANCE, new Annotation[]{new bka.b(19)});
            case 21:
                return Unit.f186387a;
            case 22:
                KProperty[] kPropertyArr10 = BizumRegistrationTermsOldScreen.f61594d0;
                return new RowDelegate(null, null, 7);
            case 23:
                KProperty[] kPropertyArr11 = BizumRegistrationTermsOldScreen.f61594d0;
                return new InputChecklistDelegate();
            case 24:
                return j1.b("com.revolut.feature.credit.application.models.products.ProductType", ft3.j1.values());
            case 25:
                return new mlm.d(o0.f186429a.b(gt3.f.class), new Annotation[0]);
            case 26:
                return j1.b("com.revolut.feature.credit.application.models.status.ProductMetadataType", it3.k.values());
            case 27:
                return new d1("buyNowPayLater", ft3.d.INSTANCE, new Annotation[]{new v("application_type")});
            case 28:
                g.b bVar = ft3.g.Companion;
                return j1.b("com.revolut.feature.credit.application.models.products.types.ProductSubtype.CreditCardType", gt3.c.values());
            default:
                g.b bVar2 = ft3.g.Companion;
                return j1.b("com.revolut.feature.credit.application.models.status.ProductMetadataType", it3.k.values());
        }
    }
}
