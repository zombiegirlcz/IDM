package ah1;

import ajd.j;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteTransactionWidget;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.existing_preorder_warning.ExistingPreorderWarningFlowContract$EmptyStep;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4869a;

    public /* synthetic */ p(int i) {
        this.f4869a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f4869a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 1:
                Throwable error = (Throwable) obj2;
                dda.a aVar = (dda.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 2:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 4:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, false, null));
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ahg.g.f5118a;
            case 6:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 7:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(aig.r.d("ERROR_TRANSACTIONS_ITEM_ID"));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return aig.r.a(u.c(aig.r.d("ERROR_AIRLINES_AND_ACCOUNTS_ITEM_ID")), aig.r.b());
            case 10:
                return new Data(j.b.f5547a, null, false, 6, null);
            case 11:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(12, null, false, true, null));
            case 12:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 13:
                Throwable th10 = (Throwable) obj2;
                if (((JuniorBankingProfile) obj3) == null) {
                    return th10;
                }
                return null;
            case 14:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new akb.r(akb.o.f5779a, (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null)));
            case 15:
                Throwable error3 = (Throwable) obj2;
                hha.d dVar = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar == null) {
                    return error3;
                }
                return null;
            case 16:
                Throwable error4 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool == null) {
                    return error4;
                }
                return null;
            case 17:
                Throwable error5 = (Throwable) obj2;
                n38.a aVar2 = (n38.a) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (aVar2 == null) {
                    return error5;
                }
                return null;
            case 18:
                Throwable error6 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bool2 == null) {
                    return error6;
                }
                return null;
            case 19:
                yki.l FlowCoordinator = (yki.l) obj2;
                ExistingPreorderWarningFlowContract$EmptyStep it8 = (ExistingPreorderWarningFlowContract$EmptyStep) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                return new LayoutViewerScreen(R$layout.screen_transparent);
            case 20:
                Throwable error7 = (Throwable) obj2;
                mha.s sVar = (mha.s) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (sVar == null) {
                    return error7;
                }
                return null;
            case 21:
                Throwable error8 = (Throwable) obj2;
                Boolean bool3 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool3 == null) {
                    return error8;
                }
                return null;
            case 22:
                Throwable error9 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (nVar == null) {
                    return error9;
                }
                return null;
            case 23:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                List list2 = (List) getDefaultErrorItems6.invoke(new iii.d(14, null, false, false, null));
                yp0.b.k(list2, R$attr.uikit_dp24, 0, 0, 0, 30);
                return new alb.g(list2, alb.m.a(null));
            case 24:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 25:
                Throwable error10 = (Throwable) obj2;
                InviteTransactionWidget inviteTransactionWidget = (InviteTransactionWidget) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (inviteTransactionWidget == null) {
                    return error10;
                }
                return null;
            case 26:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return (List) getDefaultErrorItems7.invoke(new iii.d(14, null, true, false, null));
            case 27:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 28:
                Throwable error11 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list3 == null) {
                    return error11;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((a3) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((do3.n) obj3, "<unused var>");
                return Boolean.TRUE;
        }
    }
}
