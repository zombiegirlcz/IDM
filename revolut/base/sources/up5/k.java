package up5;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.transfer.core.models.FundingSource;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import mx0.h3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281901a;

    public /* synthetic */ k(int i) {
        this.f281901a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f281901a) {
            case 0:
                Throwable error = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                eq5.q qVar = (eq5.q) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (qVar == null) {
                    return error2;
                }
                return null;
            case 2:
                Throwable error3 = (Throwable) obj2;
                CryptoAddress cryptoAddress = (CryptoAddress) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (cryptoAddress == null) {
                    return error3;
                }
                return null;
            case 3:
                Throwable error4 = (Throwable) obj2;
                FiatCryptoMoney fiatCryptoMoney = (FiatCryptoMoney) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (fiatCryptoMoney == null) {
                    return error4;
                }
                return null;
            case 4:
                Throwable error5 = (Throwable) obj2;
                Pair pair = (Pair) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (pair == null) {
                    return error5;
                }
                return null;
            case 5:
                eq5.q calculatedAmounts = (eq5.q) obj2;
                FundingSource fundingSource = (FundingSource) data;
                Intrinsics.checkNotNullParameter(calculatedAmounts, "calculatedAmounts");
                Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
                return new Pair(calculatedAmounts, fundingSource);
            case 6:
                Throwable error6 = (Throwable) obj2;
                ko5.g gVar = (ko5.g) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (gVar == null) {
                    return error6;
                }
                return null;
            case 7:
                Throwable error7 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (model == null) {
                    return error7;
                }
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return zhm.f0.f322471a;
            case 9:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new upe.o((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 11:
                Function1 defaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new cii.b(null, (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 12:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 13:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 14:
                Throwable error8 = (Throwable) obj2;
                Pair pair2 = (Pair) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (pair2 == null) {
                    return error8;
                }
                return null;
            case 15:
                Throwable error9 = (Throwable) obj2;
                do3.n nVar = (do3.n) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (nVar == null) {
                    return error9;
                }
                return null;
            case 16:
                Throwable error10 = (Throwable) obj2;
                Pair pair3 = (Pair) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (pair3 == null) {
                    return error10;
                }
                return null;
            case 17:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            case 18:
                Throwable error11 = (Throwable) obj2;
                Pair pair4 = (Pair) data;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (pair4 == null) {
                    return error11;
                }
                return null;
            case 19:
                Throwable error12 = (Throwable) obj2;
                Pair pair5 = (Pair) data;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (pair5 == null) {
                    return error12;
                }
                return null;
            case 20:
                Throwable error13 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (list2 == null) {
                    return error13;
                }
                return null;
            case 21:
                Throwable error14 = (Throwable) obj2;
                Set set = (Set) data;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (set == null) {
                    return error14;
                }
                return null;
            case 22:
                Throwable error15 = (Throwable) obj2;
                ie3.a aVar = (ie3.a) data;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (aVar == null) {
                    return error15;
                }
                return null;
            case 23:
                Throwable error16 = (Throwable) obj2;
                od0.i iVar = (od0.i) data;
                Intrinsics.checkNotNullParameter(error16, "error");
                if (iVar == null) {
                    return error16;
                }
                return null;
            case 24:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new urj.f(null, (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null)));
            case 25:
                us4.g old2 = (us4.g) obj2;
                us4.g gVar2 = (us4.g) data;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(gVar2, "new");
                return Boolean.valueOf(Intrinsics.f(old2.b().d, gVar2.b().d));
            case 26:
                Function1 defaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItems2, "defaultErrorItems");
                return new us4.m(new us4.l(null), (List) defaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), new us4.k(null, false));
            case 27:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new f3(null, null, null, false, h3.ERROR, false);
            default:
                Throwable error17 = (Throwable) obj2;
                String str = (String) data;
                Intrinsics.checkNotNullParameter(error17, "error");
                if (str == null) {
                    return error17;
                }
                return null;
        }
    }

    public /* synthetic */ k(cli.n nVar, int i) {
        this.f281901a = i;
    }
}
