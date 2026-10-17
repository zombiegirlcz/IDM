package lk7;

import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$TradingOnboardingFailException;
import com.revolut.feature.retail.savings.impl.documents.presentation.open_document.SavingsDocumentLauncherFlowContract$Step;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kl7.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196287a;

    public /* synthetic */ m(int i) {
        this.f196287a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f196287a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 5:
                Throwable error = (Throwable) obj2;
                dj0.d dVar = (dj0.d) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (dVar == null) {
                    return error;
                }
                return null;
            case 6:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 7:
                Throwable error3 = (Throwable) obj2;
                StatementUrlState statementUrlState = (StatementUrlState) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (statementUrlState == null) {
                    return error3;
                }
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((d2) obj3, "<unused var>");
                return Unit.f186387a;
            case 9:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new hlb.o((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), hlb.l.f153434a, null);
            case 10:
                Throwable error4 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar == null) {
                    return error4;
                }
                return null;
            case 11:
                Throwable th10 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th10;
                }
                return null;
            case 12:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return (List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null));
            case 13:
                ((Boolean) obj2).getClass();
                throw new SavingsErrorHandlingApi$TradingOnboardingFailException();
            case 14:
                TradingAccount tradingAccount = (TradingAccount) obj3;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                if (tradingAccount == null) {
                    return new SavingsErrorHandlingApi$TradingOnboardingFailException();
                }
                return null;
            case 15:
                Throwable error5 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (set == null) {
                    return error5;
                }
                return null;
            case 16:
                Throwable error6 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (cVar == null) {
                    return error6;
                }
                return null;
            case 17:
                Throwable error7 = (Throwable) obj2;
                he3.a aVar = (he3.a) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (aVar == null) {
                    return error7;
                }
                return null;
            case 18:
                Throwable error8 = (Throwable) obj2;
                xi0.b bVar = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bVar == null) {
                    return error8;
                }
                return null;
            case 19:
                Throwable error9 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list2 == null) {
                    return error9;
                }
                return null;
            case 20:
                Throwable error10 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list3 == null) {
                    return error10;
                }
                return null;
            case 21:
                Throwable error11 = (Throwable) obj2;
                lzi.h hVar = (lzi.h) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (hVar == null) {
                    return error11;
                }
                return null;
            case 22:
                Throwable error12 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list4 == null) {
                    return error12;
                }
                return null;
            case 23:
                Throwable error13 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (map == null) {
                    return error13;
                }
                return null;
            case 24:
                Throwable error14 = (Throwable) obj2;
                Map map2 = (Map) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (map2 == null) {
                    return error14;
                }
                return null;
            case 25:
                Throwable error15 = (Throwable) obj2;
                he3.a aVar2 = (he3.a) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (aVar2 == null) {
                    return error15;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 27:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 28:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter((SavingsDocumentLauncherFlowContract$Step) obj3, "<unused var>");
                throw new IllegalStateException("Savings document launcher does not expose screens");
            default:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
        }
    }
}
