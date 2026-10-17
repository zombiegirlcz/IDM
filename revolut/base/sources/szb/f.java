package szb;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import do3.n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pzd.x;
import t05.u;
import t05.z;
import t0e.m;
import t2e.l;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266792a;

    public /* synthetic */ f(int i) {
        this.f266792a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f266792a) {
            case 0:
                c state = (c) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(state, "state");
                return c.a(state, null, zBooleanValue, null, false, null, false, 61);
            case 1:
                c state2 = (c) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(state2, "state");
                return c.a(state2, null, false, null, zBooleanValue2, null, false, 55);
            case 2:
                c state3 = (c) obj2;
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(state3, "state");
                return c.a(state3, null, false, null, false, null, zBooleanValue3, 31);
            case 3:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 5:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new u((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), z.a());
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return t0c.g.a();
            case 7:
                Throwable th10 = (Throwable) obj2;
                if (((x) obj3) == null) {
                    return th10;
                }
                return null;
            case 8:
                Function1 defaultErrorItem = (Function1) obj3;
                m.a aVar = m.Companion;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return (List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null));
            case 9:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(6, q18.f.f241406a, true, false, null));
            case 10:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 11:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return new l((List) defaultErrorItemsProvider.invoke(new iii.d(8, null, true, true, "STORE_BRAND_DETAIL_EARN_ERROR_STATE_ID")), 2, 0);
            case 12:
                Throwable th11 = (Throwable) obj2;
                if (((v38.c) obj3) == null) {
                    return th11;
                }
                return null;
            case 13:
                Throwable error = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (iVar == null) {
                    return error;
                }
                return null;
            case 14:
                Throwable error2 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (iVar2 == null) {
                    return error2;
                }
                return null;
            case 15:
                Function1 defaultError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                return (List) defaultError.invoke(new iii.d(8, null, true, true, "CFD_PERFORMANCE_ERROR_STATE_ID"));
            case 16:
                Function1 defaultError2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError2, "defaultError");
                return (List) defaultError2.invoke(new iii.d(8, null, true, true, "CFD_PERFORMANCE_ERROR_STATE_ID"));
            case 17:
                Throwable error3 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool == null) {
                    return error3;
                }
                return null;
            case 18:
                Throwable error4 = (Throwable) obj2;
                LoanDetails loanDetails = (LoanDetails) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (loanDetails == null) {
                    return error4;
                }
                return null;
            case 19:
                Throwable error5 = (Throwable) obj2;
                LoanBackupCard loanBackupCard = (LoanBackupCard) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (loanBackupCard == null) {
                    return error5;
                }
                return null;
            case 20:
                Throwable error6 = (Throwable) obj2;
                FeatureCommand featureCommand = (FeatureCommand) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (featureCommand == null) {
                    return error6;
                }
                return null;
            case 21:
                Throwable error7 = (Throwable) obj2;
                NaviCommand naviCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (naviCommand == null) {
                    return error7;
                }
                return null;
            case 22:
                Throwable error8 = (Throwable) obj2;
                Loan loan = (Loan) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (loan == null) {
                    return error8;
                }
                return null;
            case 23:
                Throwable error9 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list == null) {
                    return error9;
                }
                return null;
            case 24:
                Throwable error10 = (Throwable) obj2;
                NaviCommand naviCommand2 = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (naviCommand2 == null) {
                    return error10;
                }
                return null;
            case 25:
                Throwable error11 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (bool2 == null) {
                    return error11;
                }
                return null;
            case 26:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 27:
                Throwable error12 = (Throwable) obj2;
                n nVar = (n) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (nVar == null) {
                    return error12;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            default:
                Throwable error13 = (Throwable) obj2;
                ybl.h hVar = (ybl.h) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (hVar == null) {
                    return error13;
                }
                return null;
        }
    }
}
