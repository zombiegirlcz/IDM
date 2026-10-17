package gla;

import com.revolut.core.security.deviceId.impl.DeviceIdAccountManager$ScopedDeviceId;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import com.revolut.feature.credit.card.impl.ui.cancellation.repayment.CreditCardTerminatedRepaymentScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreen;
import gmg.t;
import gmg.w;
import gr2.a0;
import gr2.b0;
import gr2.f0;
import gr2.g0;
import gr2.k0;
import gr2.n0;
import gr2.q0;
import gr2.z;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import org.jmrtd.cbeff.ISO781611;
import qlm.h0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144592a;

    public /* synthetic */ k(int i) {
        this.f144592a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Float f = null;
        Object[] objArr = 0;
        switch (this.f144592a) {
            case 0:
                return j1.b("com.revolut.feature.product_catalogue.api.State", bla.c.values());
            case 1:
                return new h0(v1.f247718a, l.f144593a, 1);
            case 2:
                KProperty[] kPropertyArr = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                return new SingleChoiceDelegate();
            case 3:
                return j1.a("com.revolut.core.security.deviceId.impl.DeviceIdAccountManager.DeviceIdScope", gm0.c.values(), new String[]{"GLOBAL", "APP"}, new Annotation[][]{null, null});
            case 4:
                DeviceIdAccountManager$ScopedDeviceId.Companion companion = DeviceIdAccountManager$ScopedDeviceId.INSTANCE;
                return gm0.c.Companion.serializer();
            case 5:
                return new qlm.e(gmg.l.f144832a);
            case 6:
                return new qlm.e(v1.f247718a);
            case 7:
                return new qlm.e(gmg.q.f144836a);
            case 8:
                return new qlm.e(w.f144847a);
            case 9:
                return new qlm.e(t.f144843a);
            case 10:
                KProperty[] kPropertyArr2 = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                return new InputTextDelegate(null);
            case 11:
                return new UrlImageDrawable.Shimmering.Transformable(new ImageTransformations(null, new CircleTransformation(f, (Integer) (objArr == true ? 1 : 0), false, 15), null, null, null, null, null, ISO781611.SMT_TAG));
            case 12:
                KProperty[] kPropertyArr3 = FormsListScreen.R;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr4 = FormsListScreen.R;
                return new LargeActionButtonDelegate();
            case 14:
                KProperty[] kPropertyArr5 = CreditCardTerminatedRepaymentScreen.U;
                return new FullScreenStateDelegate();
            case 15:
                return new qlm.e(gqc.j.f145639a);
            case 16:
                return j1.b("com.revolut.biometric_verification.impl.data.models.BiometricVerificationSubmitCheckUserInputDocumentTypeDto", gr.j.values());
            case 17:
                return new qlm.e(gr2.t.f145868a);
            case 18:
                return new qlm.e(k0.f145845a);
            case 19:
                return new qlm.e(gr2.a.f145813a);
            case 20:
                return new qlm.e(b0.a.f145817a);
            case 21:
                return new qlm.e(gr2.n.f145852a);
            case 22:
                return new qlm.e(gr2.k.f145844a);
            case 23:
                return new qlm.e(v1.f247718a);
            case 24:
                z.c cVar = z.Companion;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.be_driven_design.models.dto.FincrimeSectionContentDto", p0Var.b(z.class), new KClass[]{p0Var.b(z.a.class), p0Var.b(z.b.class), p0Var.b(z.d.class), p0Var.b(z.e.class), p0Var.b(z.f.class), p0Var.b(z.g.class), p0Var.b(z.h.class), p0Var.b(z.i.class), p0Var.b(z.j.class), p0Var.b(z.k.class), p0Var.b(z.l.class), p0Var.b(z.m.class)}, new KSerializer[]{z.a.C0842a.f145887a, z.b.a.f145890a, z.d.a.f145893a, z.e.a.f145896a, z.f.a.f145899a, z.g.a.f145902a, z.h.a.f145906a, z.i.a.f145911a, z.j.a.f145914a, z.k.a.f145917a, z.l.a.f145920a, z.m.a.f145927a}, new Annotation[]{new a0()});
            case 25:
                z.a.b bVar = z.a.Companion;
                return new qlm.e(q0.f145862a);
            case 26:
                z.i.b bVar2 = z.i.Companion;
                return new qlm.e(n0.f145853a);
            case 27:
                return new qlm.e(gr2.a.f145813a);
            case 28:
                return new qlm.e(z.m.a.f145927a);
            default:
                f0.Companion bVar3 = f0.INSTANCE;
                return new qlm.e(g0.f145836a);
        }
    }
}
