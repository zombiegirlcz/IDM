package kbb;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dtb.b f182570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dtb.b f182571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dtb.b f182572c;
    public final dtb.b d;
    public final dtb.b e;
    public final dtb.b f;

    public q(dtb.b accountsTabProvider, dtb.b investTabProvider, dtb.b cryptoTabProvider, dtb.b lifestyleTabProvider, dtb.b transferTabProvider, dtb.b creditTabProvider) {
        Intrinsics.checkNotNullParameter(accountsTabProvider, "accountsTabProvider");
        Intrinsics.checkNotNullParameter(investTabProvider, "investTabProvider");
        Intrinsics.checkNotNullParameter(cryptoTabProvider, "cryptoTabProvider");
        Intrinsics.checkNotNullParameter(lifestyleTabProvider, "lifestyleTabProvider");
        Intrinsics.checkNotNullParameter(transferTabProvider, "transferTabProvider");
        Intrinsics.checkNotNullParameter(creditTabProvider, "creditTabProvider");
        this.f182570a = accountsTabProvider;
        this.f182571b = investTabProvider;
        this.f182572c = cryptoTabProvider;
        this.d = lifestyleTabProvider;
        this.e = transferTabProvider;
        this.f = creditTabProvider;
    }

    public final dtb.b a(MainScreenTab tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        MainScreenTab mainScreenTab = ibb.c.f160140a;
        if (Intrinsics.f(tab2, ibb.c.f160140a)) {
            return this.f182570a;
        }
        if (Intrinsics.f(tab2, ibb.c.f160141b)) {
            return this.f182571b;
        }
        if (Intrinsics.f(tab2, ibb.c.d)) {
            return this.f182572c;
        }
        if (Intrinsics.f(tab2, ibb.c.e)) {
            return this.d;
        }
        if (Intrinsics.f(tab2, ibb.c.f160142c)) {
            return this.e;
        }
        if (Intrinsics.f(tab2, ibb.c.f)) {
            return this.f;
        }
        throw new IllegalArgumentException(j6.a.q("Unsupported MainScreenTab id=", tab2.f83420a));
    }
}
