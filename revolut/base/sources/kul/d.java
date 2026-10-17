package kul;

import bul.s;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wul.q;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f189849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xul.l f189850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f189851c;
    public final gte.a d;

    public d(l4i.a amountConverter, h cellsBuilder, xul.l orderUnifiedInfoGroupMapper, s orderQuoteAmountProvider, q tradingOrderReviewBottomDisclaimerMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(cellsBuilder, "cellsBuilder");
        Intrinsics.checkNotNullParameter(orderUnifiedInfoGroupMapper, "orderUnifiedInfoGroupMapper");
        Intrinsics.checkNotNullParameter(orderQuoteAmountProvider, "orderQuoteAmountProvider");
        Intrinsics.checkNotNullParameter(tradingOrderReviewBottomDisclaimerMapper, "tradingOrderReviewBottomDisclaimerMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f189849a = cellsBuilder;
        this.f189850b = orderUnifiedInfoGroupMapper;
        this.f189851c = tradingOrderReviewBottomDisclaimerMapper;
        this.d = featureToggleInteractor;
    }

    public static void c(aim.e eVar, Function0 function0) {
        List list = (List) function0.invoke();
        d(list);
        eVar.addAll(list);
    }

    public static void d(List list) {
        yp0.b.k(list, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
    }

    @Override // kul.l
    public final boolean a(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        switch (c.f189846a[instrument.f214597c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return !instrument.b();
            case 14:
            case 15:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b9  */
    @Override // kul.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(final kul.k r62) {
        /*
            Method dump skipped, instruction units count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kul.d.b(kul.k):java.util.List");
    }
}
