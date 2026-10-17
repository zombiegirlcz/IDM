package j0g;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.saveable.SaverScope;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import do3.n;
import j53.t;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170024a;

    public /* synthetic */ b(int i) {
        this.f170024a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f170024a) {
            case 0:
                iyf.c cVar = (iyf.c) obj2;
                ((Integer) obj3).intValue();
                return Boolean.valueOf(cVar == iyf.c.PENDING);
            case 1:
                return LazyListState.Saver$lambda$0((SaverScope) obj2, (LazyListState) obj3);
            case 2:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable th10 = (Throwable) obj2;
                if (((n) obj3) == null) {
                    return th10;
                }
                return null;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(8, null, true, true, "ERROR_STATE_ID"));
            case 5:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 6:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 7:
                Throwable error2 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool2 == null) {
                    return error2;
                }
                return null;
            case 8:
                Throwable error3 = (Throwable) obj2;
                n4l.e eVar = (n4l.e) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (eVar == null) {
                    return error3;
                }
                return null;
            case 9:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return j2c.h.f170812a;
            case 11:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return j2f.g.f170850a;
            case 13:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 14:
                Throwable th11 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th11;
                }
                return null;
            case 15:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(12, null, false, true, null));
            case 16:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                aim.e eVarB = u.b();
                eVarB.add(j37.e.a(false));
                eVarB.addAll((List) getDefaultErrorItems7.invoke(new iii.d(true, true, "LIST_ID_CALENDAR_ERROR", j37.c.f170980a)));
                return u.a(eVarB);
            case 17:
                Throwable error4 = (Throwable) obj2;
                k59.c cVar2 = (k59.c) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (cVar2 == null) {
                    return error4;
                }
                return null;
            case 18:
                Throwable error5 = (Throwable) obj2;
                h93.f0 f0Var = (h93.f0) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (f0Var == null) {
                    return error5;
                }
                return null;
            case 19:
                Function1 getDefaultErrorItems8 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return new j45.g(new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_account_selector_title, null, null, 14), null, (List) getDefaultErrorItems8.invoke(new iii.d(14, null, true, false, null)), false, false);
            case 20:
                Function1 getDefaultErrorItems9 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems9, "getDefaultErrorItems");
                return new j4c.n(false, (List) getDefaultErrorItems9.invoke(new iii.d(8, null, true, true, "ERROR_ORDER_LIST_ID")));
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return t.a((Throwable) obj2);
            case 23:
                Throwable error6 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (pair == null) {
                    return error6;
                }
                return null;
            case 24:
                Function1 getDefaultErrorItems10 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems10, "getDefaultErrorItems");
                return (List) getDefaultErrorItems10.invoke(new iii.d(6, "ManagedPortfolioDetailsAllocationContract", true, false, null));
            case 25:
                Throwable error7 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (iVar == null) {
                    return error7;
                }
                return null;
            case 26:
                Throwable error8 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (set == null) {
                    return error8;
                }
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                Function1 getDefaultErrorItems11 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems11, "getDefaultErrorItems");
                return (List) getDefaultErrorItems11.invoke(new iii.d(14, null, true, false, null));
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f170024a = i;
    }
}
