package e6i;

import g6i.c;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import p1i.i;
import t8i.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f123003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f123004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f123005c;

    public a(t1 currencyRateNaviProvider, i quoteLimitsDialogMapper, d savingsTopUpLimitBottomSheetFactory) {
        Intrinsics.checkNotNullParameter(currencyRateNaviProvider, "currencyRateNaviProvider");
        Intrinsics.checkNotNullParameter(quoteLimitsDialogMapper, "quoteLimitsDialogMapper");
        Intrinsics.checkNotNullParameter(savingsTopUpLimitBottomSheetFactory, "savingsTopUpLimitBottomSheetFactory");
        this.f123003a = currencyRateNaviProvider;
        this.f123004b = quoteLimitsDialogMapper;
        this.f123005c = savingsTopUpLimitBottomSheetFactory;
    }

    public static c a(a aVar, j60.a bottomDialogExtension) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        return new c(aVar.f123003a, aVar.f123004b, bottomDialogExtension, aVar.f123005c);
    }
}
