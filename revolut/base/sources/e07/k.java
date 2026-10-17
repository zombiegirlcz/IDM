package e07;

import a3e.u;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.saveable.SaverScope;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.health.api.models.CreditScore;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation.interactor.PaymentAuthorisationExpiredException;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import e69.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121453a;

    public /* synthetic */ k(int i) {
        this.f121453a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f121453a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 1:
                Throwable error = (Throwable) obj2;
                t61.g gVar = (t61.g) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (gVar == null) {
                    return error;
                }
                return null;
            case 2:
                Throwable error2 = (Throwable) obj2;
                e7l.f fVar = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (fVar == null) {
                    return error2;
                }
                return null;
            case 3:
                Throwable error3 = (Throwable) obj2;
                com.revolut.domain.models.topup.methods.b bVar = (com.revolut.domain.models.topup.methods.b) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bVar == null) {
                    return error3;
                }
                return null;
            case 4:
                Throwable error4 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list == null) {
                    return error4;
                }
                return null;
            case 5:
                Throwable error5 = (Throwable) obj2;
                xel.c cVar = (xel.c) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (cVar == null) {
                    return error5;
                }
                return null;
            case 6:
                return ScrollState.Saver$lambda$0((SaverScope) obj2, (ScrollState) obj3);
            case 7:
                Throwable error6 = (Throwable) obj2;
                CreditScore creditScore = (CreditScore) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (creditScore == null) {
                    return error6;
                }
                return null;
            case 8:
                Throwable error7 = (Throwable) obj2;
                g05.d dVar = (g05.d) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (dVar == null) {
                    return error7;
                }
                return null;
            case 9:
                Throwable error8 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list2 == null) {
                    return error8;
                }
                return null;
            case 10:
                Function1 getDefaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultItems, "getDefaultItems");
                Intrinsics.checkNotNullParameter(getDefaultItems, "getDefaultItems");
                return (List) getDefaultItems.invoke(new iii.d(12, null, true, true, null));
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new Data(null, (Throwable) obj2, false, 5, null);
            case 12:
                Throwable error9 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list3 == null) {
                    return error9;
                }
                return null;
            case 13:
                Throwable error10 = (Throwable) obj2;
                e7l.f fVar2 = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (fVar2 == null) {
                    return error10;
                }
                return null;
            case 14:
                Throwable error11 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (iVar == null) {
                    return error11;
                }
                return null;
            case 15:
                Throwable error12 = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (tradingLegalEntityInformation == null) {
                    return error12;
                }
                return null;
            case 16:
                Throwable error13 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (bool == null) {
                    return error13;
                }
                return null;
            case 17:
                Throwable error14 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (list4 == null) {
                    return error14;
                }
                return null;
            case 18:
                Function1 defaultError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                return (List) defaultError.invoke(new iii.d(4, e4b.j.f122526a, true, true, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((d56.c) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((i56.e) obj3, "<unused var>");
                return Unit.f186387a;
            case 24:
                Throwable th10 = (Throwable) obj2;
                if (((LoanDetails) obj3) == null) {
                    return th10;
                }
                return null;
            case 25:
                Throwable th11 = (Throwable) obj2;
                if (((Loan) obj3) == null) {
                    return th11;
                }
                return null;
            case 26:
                Throwable th12 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th12;
                }
                return null;
            case 27:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new n(((Throwable) obj2) instanceof PaymentAuthorisationExpiredException ? f0.f322471a : (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), null);
            case 28:
                Throwable error15 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (list5 == null) {
                    return error15;
                }
                return null;
            default:
                Throwable error16 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error16, "error");
                if (list6 == null) {
                    return error16;
                }
                return null;
        }
    }

    public /* synthetic */ k(u uVar) {
        this.f121453a = 10;
    }
}
