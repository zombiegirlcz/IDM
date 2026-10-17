package hf7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.alipay_plus.mpm.support.APMPMDispatch;
import com.revolut.feature.alipay_plus.mpm.support.APMPMRegionResolver;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.error.FormErrorsScreen;
import com.revolut.feature.retail.salary_account.impl.work_email.input.WorkEmailInputController;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreen;
import hha.u;
import hi9.c;
import hjb.t;
import hl7.h8;
import hl7.i3;
import hl7.k0;
import hl7.p;
import hl7.s;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kr7.a;
import ncd.k;
import qlm.d1;
import qlm.j1;
import qlm.v1;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151769a;

    public /* synthetic */ d(int i) {
        this.f151769a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f151769a) {
            case 0:
                return new qlm.e(g.f151771a);
            case 1:
                KProperty[] kPropertyArr = FormErrorsScreen.R;
                return new RowDelegate(null, null, 7);
            case 2:
                KProperty[] kPropertyArr2 = FormErrorsScreen.R;
                return new FullScreenStateDelegate();
            case 3:
                Lazy lazy = hgl.a.f152191a;
                return ged.a.a().b();
            case 4:
                u.Companion.getClass();
                return v.k(u.K, u.L, u.M, u.N);
            case 5:
                KProperty[] kPropertyArr3 = EsimCountryPickerScreen.f100947b0;
                return new RowDelegate(null, null, 7);
            case 6:
                return new tf(4, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
            case 7:
                c.Companion aVar = hi9.c.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.pay_later.impl.database.entities.PlanEntity.FeeDetailsDescriptor", p0Var.b(hi9.c.class), new KClass[]{p0Var.b(hi9.f.class), p0Var.b(hi9.j.class)}, new KSerializer[]{hi9.d.f152544a, hi9.h.f152547a}, new Annotation[]{new hi9.g(0)});
            case 8:
                KProperty[] kPropertyArr4 = WorkEmailInputController.R;
                return new InputTextDelegate(null);
            case 9:
                return t.Companion.serializer();
            case 10:
                return hjb.h.Companion.serializer();
            case 11:
                return j1.b("com.revolut.feature.retail.savings.api.core.feature_config.model.UmbrellaNameType", uib.c.values());
            case 12:
                return new d1("junior_savings_account_type", hjb.f.INSTANCE, new Annotation[0]);
            case 13:
                return new d1("personal_savings_account_type", hjb.g.INSTANCE, new Annotation[0]);
            case 14:
                return j1.b("com.revolut.feature.shared.savings.models.product.SavingsInterestRateType", k.values());
            case 15:
                return APMPMDispatch.mainHandler_delegate$lambda$0();
            case 16:
                return APMPMRegionResolver.TIMEZONE_TO_REGION_delegate$lambda$0();
            case 17:
                return new qlm.e(i3.f153143a);
            case 18:
                return new qlm.e(hl7.d.f153054a);
            case 19:
                return new qlm.e(i3.f153143a);
            case 20:
                return new qlm.e(k0.f153166a);
            case 21:
                return new qlm.e(k0.f153166a);
            case 22:
                return new qlm.e(k0.f153166a);
            case 23:
                return new qlm.e(p.f153247a);
            case 24:
                return new qlm.e(s.f153293a);
            case 25:
                return new qlm.e(v1.f247718a);
            case 26:
                return new qlm.e(v1.f247718a);
            case 27:
                return new qlm.e(a.C1069a.f188668a);
            case 28:
                return new qlm.e(h8.f153130a);
            default:
                return new qlm.e(v1.f247718a);
        }
    }
}
