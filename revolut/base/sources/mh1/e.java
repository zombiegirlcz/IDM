package mh1;

import aw0.o9;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.CurrencyChooserScreenContract$ModalStep;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoController;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoControllerContract$InputData;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import java.util.List;
import khg.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205351a;

    public /* synthetic */ e(int i) {
        this.f205351a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f205351a) {
            case 0:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 2:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return j.a.f184127a;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 5:
                Function1 getErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return (List) getErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 7:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null));
            case 8:
                Throwable error3 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list3 == null) {
                    return error3;
                }
                return null;
            case 9:
                Throwable error4 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (nVar == null) {
                    return error4;
                }
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 11:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CurrencyChooserScreenContract$ModalStep step = (CurrencyChooserScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, CurrencyChooserScreenContract$ModalStep.MultichainInfo.f70960a)) {
                    return new CryptoMultichainInfoController(new CryptoMultichainInfoControllerContract$InputData(tk5.j.ASSETS));
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                Throwable error5 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list4 == null) {
                    return error5;
                }
                return null;
            case 13:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 15:
                Throwable error6 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list5 == null) {
                    return error6;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return AnimatedBackgroundType.DEFAULT.f51471a;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 20:
                Throwable error7 = (Throwable) obj2;
                RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (roboPortfolioInfo != null) {
                    return error7;
                }
                return null;
            case 21:
                Throwable error8 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool == null) {
                    return error8;
                }
                return null;
            case 22:
                Function1 defaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems2, "defaultErrorItems");
                return (List) defaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 23:
                Throwable error9 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bool2 == null) {
                    return error9;
                }
                return null;
            case 24:
                Throwable th10 = (Throwable) obj2;
                if (((SavingsAccountDetails) obj3) == null) {
                    return th10;
                }
                return null;
            case 25:
                Throwable error10 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list6 == null) {
                    return error10;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 27:
                ep6.c cVar = (ep6.c) obj2;
                ep6.c cVar2 = (ep6.c) obj3;
                return Boolean.valueOf((cVar instanceof ep6.d) && (cVar2 instanceof ep6.d) && ((ep6.d) cVar).f128085b == ((ep6.d) cVar2).f128085b);
            case 28:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            default:
                Throwable error11 = (Throwable) obj2;
                do3.n nVar2 = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (nVar2 == null) {
                    return error11;
                }
                return null;
        }
    }
}
