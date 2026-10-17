package jj9;

import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.contacts.impl.GsonHolder;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogController;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import com.revolut.feature.pay_later.impl.ui.accountdetails.PayLaterAccountDetailsScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.profile_account.ProfileAccountScreen;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsController;
import com.revolut.otp.input.flow.code.OtpCodeInputScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreen;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Objects;
import jkl.d2;
import jkl.h2;
import jp8.a;
import kg.j0;
import kg.p;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import qlm.h0;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import qlm.x;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174780a;

    public /* synthetic */ b(int i) {
        this.f174780a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f174780a) {
            case 0:
                KProperty[] kPropertyArr = PayLaterAccountDetailsScreen.i0;
                return new CellDetailsChevronDelegate();
            case 1:
                KProperty[] kPropertyArr2 = PayLaterAccountDetailsScreen.i0;
                return new CellDetailsActionDelegate();
            case 2:
                KProperty[] kPropertyArr3 = PayLaterAccountDetailsScreen.i0;
                return new ListSubheaderDelegate();
            case 3:
                KProperty[] kPropertyArr4 = TrustedMerchantDetailsController.R;
                return new CellDetailsDelegate();
            case 4:
                KProperty[] kPropertyArr5 = EsimMobilePlanCancellationTermsScreen.R;
                return new LargeActionButtonDelegate();
            case 5:
                KProperty[] kPropertyArr6 = CommonRemittanceFieldDialogController.R;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr7 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr8 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                return new TwinHorizontalButtonDelegate();
            case 8:
                KProperty[] kPropertyArr9 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                return new LargeActionButtonDelegate();
            case 9:
                return Calendar.getInstance();
            case 10:
                return new qlm.e(h2.f175286a);
            case 11:
                return new h0(v1.f247718a, d2.f175239a, 1);
            case 12:
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 13:
                return new qlm.e(v1.f247718a);
            case 14:
                Lazy lazy = GsonHolder.f65995a;
                p pVar = new p();
                j0 j0Var = j0.LONG_OR_DOUBLE;
                Objects.requireNonNull(j0Var);
                pVar.f183887m = j0Var;
                Type type = new TypeToken<String>() { // from class: com.revolut.feature.contacts.impl.GsonHolder$instance_delegate$lambda$0$$inlined$gsonTypeToken$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                pVar.c(new he0.k(), type);
                s90.a.a(pVar);
                return pVar.b();
            case 15:
                return j1.b("com.revolut.feature.product_catalogue.api.State", bla.c.values());
            case 16:
                return new h0(v1.f247718a, new qlm.e(jla.a.f175655a), 1);
            case 17:
                return new h0(v1.f247718a, new qlm.e(n0.f247680a), 1);
            case 18:
                return new h0(v1.f247718a, new qlm.e(x.f247723a), 1);
            case 19:
                return new h0(v1.f247718a, new qlm.e(qlm.h.f247648a), 1);
            case 20:
                v1 v1Var2 = v1.f247718a;
                return new h0(v1Var2, new qlm.e(v1Var2), 1);
            case 21:
                return new h0(v1.f247718a, new qlm.e(ie0.d.f160593a), 1);
            case 22:
                return new h0(v1.f247718a, new qlm.e(ie0.c.f160591a), 1);
            case 23:
                KProperty[] kPropertyArr10 = OtpCodeInputScreen.V;
                return new PlainTextDelegate();
            case 24:
                KProperty[] kPropertyArr11 = OtpCodeInputScreen.V;
                return new CodeEditorDelegate();
            case 25:
                KProperty[] kPropertyArr12 = OtpCodeInputScreen.V;
                return new LabelButtonDelegate();
            case 26:
                return new Regex(".*([\\d]{3}-[\\d]{3}).*");
            case 27:
                KProperty[] kPropertyArr13 = ProfileAccountScreen.f81475b0;
                return new RowDelegate(null, null, 7);
            case 28:
                a.Companion bVar = jp8.a.INSTANCE;
                return new qlm.e(v1.f247718a);
            default:
                return new qlm.e(jp8.i.f177226a);
        }
    }
}
