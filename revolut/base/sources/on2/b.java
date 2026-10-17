package on2;

import com.revolut.feature.bank_account_switching.api.BankAccountSwitchingToggles$AccountSwitchFR;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oid.y;
import om4.l0;
import om4.l3;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import te0.w;
import ue0.e;
import ufm.i;
import yoj.c;
import yoj.d;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f226862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f226863b;

    public b(xoj.a featuresInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f226862a = featuresInteractor;
        this.f226863b = featureToggleInteractor;
    }

    public final i a() {
        i iVar = new i(w.I0(c(), b(y0.b("NL_OVERSTAP"), null), b(y0.b("FR_MOBILITY"), BankAccountSwitchingToggles$AccountSwitchFR.f63882c)), new y(new l3(21), 23), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final z b(Set set, BankAccountSwitchingToggles$AccountSwitchFR bankAccountSwitchingToggles$AccountSwitchFR) {
        i iVar = new i(((cpj.b) this.f226862a).e(c.ACCOUNT_SWITCH, d.DISABLED), new y(new l0(set, 4, bankAccountSwitchingToggles$AccountSwitchFR, this), 22), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return e.F(iVar, Boolean.FALSE);
    }

    public final z c() {
        String[] elements = {"GB_CASS", "UK_CASS"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return b(kotlin.collections.d.y0(elements), null);
    }
}
