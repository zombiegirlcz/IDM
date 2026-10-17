package ljl;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreen;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreen;
import com.revolut.feature.insurance_car.impl.data.model.MtaState;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import hl7.i7;
import hl7.l7;
import ip0.p10;
import ip0.t10;
import ip0.x10;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lk0.h;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class n1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196041a;

    public /* synthetic */ n1(int i) {
        this.f196041a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f196041a) {
            case 0:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                o1 o1Var = o1.d;
                Intrinsics.checkNotNullParameter(null, "args");
                Intrinsics.checkNotNullExpressionValue(new a0(), "factory(...)");
                throw null;
            case 1:
                System.out.println((lk0.g) obj2);
                return Unit.f186387a;
            case 2:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return (pagedData.f196174a.isEmpty() || ((lk0.e) zhm.d0.b0(pagedData.f196174a)).f196171a.isEmpty()) ? h.a.f196175a : h.c.f196177a;
            case 3:
                SelectableDelegate.Model it8 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = SelectAmountTypeScreen.f68614b0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = ((RowDelegate.Model) it8.f53305b).u;
                if (obj3 instanceof ak4.a) {
                    return (ak4.a) obj3;
                }
                return null;
            case 4:
                lk6.i update = (lk6.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return lk6.i.a(update, null, null, update.f196245c != null ? Boolean.valueOf(!r15.booleanValue()) : null, null, null, null, 59);
            case 5:
                lk6.i it9 = (lk6.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f196243a;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return lk6.b.b(true);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return lk6.b.b(true);
            case 8:
                ty0.a it10 = (ty0.a) obj2;
                KProperty[] kPropertyArr2 = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f275445a, "CANCELLATION_REASONS"));
            case 9:
                KProperty[] kPropertyArr3 = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter((ty0.a) obj2, "it");
                return Boolean.FALSE;
            case 10:
                KProperty[] kPropertyArr4 = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 11:
                CellDetailsDelegate.Model it11 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.o == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT);
            case 12:
                KProperty[] kPropertyArr6 = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter((CellDetailsDelegate.Model) obj2, "it");
                return Boolean.FALSE;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return lk7.r.c(CFACReimbursementType.NO_PROOF_REIMBURSEMENT, null);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                t10 t10Var = new t10("ID_ITEM_PRODUCT_SUMMARY", p10.f165755a);
                yp0.b.l(t10Var, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                return zhm.u.c(t10Var);
            case 16:
                x10 it12 = (x10) obj2;
                KProperty[] kPropertyArr7 = PayLaterRepaymentDetailsScreen.f78910k0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f167082b;
            case 17:
                od0.i it13 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (zh9.i0) it13.f224257a;
            case 18:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(!d8l.d.k(it14).isEmpty());
            case 19:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return ao.h.t(it15);
            case 20:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return ao.h.t(it16);
            case 21:
                ml3.i contact = (ml3.i) obj2;
                Intrinsics.checkNotNullParameter(contact, "contact");
                return contact.n();
            case 22:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return ao.h.t(it17);
            case 23:
                return Boolean.valueOf(((kl7.v) obj2).f185394a != kl7.u.IN_PROGRESS);
            case 24:
                MtaState it18 = (MtaState) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.f75263c != kl7.z0.IN_PROGRESS);
            case 25:
                kl7.z0 z0Var = ((MtaState) obj2).f75263c;
                if (z0Var != kl7.z0.IN_PROGRESS && z0Var != kl7.z0.QUOTED) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return null;
            case 27:
                return Boolean.valueOf(Intrinsics.f(((i7) obj2).f153148a, "PROCESSED"));
            case 28:
                l7 policy = (l7) obj2;
                Intrinsics.checkNotNullParameter(policy, "policy");
                Intrinsics.checkNotNullParameter(policy, "<this>");
                return Boolean.valueOf(!Intrinsics.f(policy.f153189c, "INITIALISING"));
            default:
                Exception exception = (Exception) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                Intrinsics.checkNotNullParameter(exception, "<this>");
                if ((exception instanceof HttpException) && ((HttpException) exception).code() == 422) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ n1(Object obj2, int i) {
        this.f196041a = i;
    }
}
