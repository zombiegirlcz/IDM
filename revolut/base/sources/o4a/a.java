package o4a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import h6e.j;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o7e.i;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222175a;

    public /* synthetic */ a(int i) {
        this.f222175a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f222175a) {
            case 0:
                Throwable error = (Throwable) obj2;
                wi0.b bVar = (wi0.b) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bVar == null) {
                    return error;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return o4h.h.f222279a;
            case 3:
                Throwable error2 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (map == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                dj0.d dVar = (dj0.d) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                LoanDetails loanDetails = (LoanDetails) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (loanDetails == null) {
                    return error4;
                }
                return null;
            case 6:
                j dto = (j) obj3;
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto, "dto");
                return new w6e.f(dto.f149646a);
            case 7:
                w6e.f dto2 = (w6e.f) obj3;
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto2, "dto");
                return new j(dto2.f295425a);
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 10:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(6, "ManagedPortfolioDetailsChartContract", true, false, null));
            case 11:
                Throwable error5 = (Throwable) obj2;
                Map map2 = (Map) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (map2 == null) {
                    return error5;
                }
                return null;
            case 12:
                Throwable error6 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list == null) {
                    return error6;
                }
                return null;
            case 13:
                Throwable error7 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list2 == null) {
                    return error7;
                }
                return null;
            case 14:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return hx7.a.p(getDefaultErrorItems2);
            case 15:
                Function1 function1 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(function1, "default");
                return new i(null, (List) function1.invoke(new iii.d(14, null, false, false, null)));
            case 16:
                Throwable th10 = (Throwable) obj2;
                if (((AccountId.Joint) obj3) == null) {
                    return th10;
                }
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return e8d.b.b(false, null);
            case 19:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 22:
                Throwable error8 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (iVar == null) {
                    return error8;
                }
                return null;
            case 23:
                Throwable error9 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list3 == null) {
                    return error9;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 26:
                Throwable error10 = (Throwable) obj2;
                Map map3 = (Map) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (map3 == null) {
                    return error10;
                }
                return null;
            case 27:
                Throwable error11 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (pair == null) {
                    return error11;
                }
                return null;
            case 28:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            default:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
        }
    }
}
