package dmb;

import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreenContract$ModalStep;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import dmj.c0;
import dmj.z;
import do8.v;
import ds4.r;
import ds4.s;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115891a;

    public /* synthetic */ m(int i) {
        this.f115891a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f115891a) {
            case 0:
                Throwable error = (Throwable) obj2;
                vf0.h hVar = (vf0.h) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (hVar == null) {
                    return error;
                }
                return null;
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 2:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
                z.Companion.getClass();
                return new c0(null, list, z.f116188c);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new dn8.d(iii.c.b(null, null, 6, true), false);
            case 6:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return new do2.j((List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null)), false, false);
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(10, null, true, false, "ID_FULL_ERROR_STATE_ITEM"));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new do8.k(v.a());
            case 11:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 12:
                Throwable error3 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list3 == null) {
                    return error3;
                }
                return null;
            case 13:
                Throwable error4 = (Throwable) obj2;
                i7 i7Var = (i7) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (i7Var == null) {
                    return error4;
                }
                return null;
            case 14:
                Throwable error5 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list4 == null) {
                    return error5;
                }
                return null;
            case 15:
                Throwable error6 = (Throwable) obj2;
                i7 i7Var2 = (i7) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (i7Var2 == null) {
                    return error6;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 17:
                Function1 defaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return (List) defaultItems.invoke(new iii.d(14, null, true, false, null));
            case 18:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "config");
                throw null;
            case 19:
                Pair pair = (Pair) obj2;
                Pair pair2 = (Pair) obj3;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return Boolean.valueOf(((xq2.a) pair.f186385a) == ((xq2.a) pair2.f186385a));
            case 20:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return dr7.k.c((List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null)));
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new drg.g(drg.m.b());
            case 22:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardInstalmentHubScreenContract$ModalStep step = (CreditCardInstalmentHubScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof CreditCardInstalmentHubScreenContract$ModalStep.DueThisMonth;
                BottomSheet.ActionStyle.Accent accent = BottomSheet.ActionStyle.Accent.f69824a;
                if (z) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_due_on, u.c(com.revolut.core.ui_kit.models.j.b(c7.Companion, ((CreditCardInstalmentHubScreenContract$ModalStep.DueThisMonth) step).f69388a, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT))), null, 12);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_due_month_description, null, null, 14);
                    BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), accent), null);
                    k9 k9Var = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    return BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, null, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 76);
                }
                if (!(step instanceof CreditCardInstalmentHubScreenContract$ModalStep.TotalLeftToPay)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_total_title, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_total_description, null, null, 14);
                BottomSheet.ActionBlock.SingleAction singleAction2 = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), accent), null);
                k9 k9Var2 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                return BottomSheet.a(textLocalisedClause3, textLocalisedClause4, null, null, singleAction2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, 76);
            case 23:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new s(new r(f0.f322471a), (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null)));
            case 24:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null));
            case 25:
                Throwable error7 = (Throwable) obj2;
                Pair pair3 = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (pair3 == null) {
                    return error7;
                }
                return null;
            case 26:
                Throwable error8 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list5 == null) {
                    return error8;
                }
                return null;
            case 27:
                Throwable th10 = (Throwable) obj2;
                if (((InvestOrder) obj3) == null) {
                    return th10;
                }
                return null;
            case 28:
                Boolean hasMoreDocs = (Boolean) obj2;
                Boolean updateKycStateAfterSubmit = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(hasMoreDocs, "hasMoreDocs");
                Intrinsics.checkNotNullParameter(updateKycStateAfterSubmit, "updateKycStateAfterSubmit");
                return new Pair(hasMoreDocs, updateKycStateAfterSubmit);
            default:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
        }
    }
}
