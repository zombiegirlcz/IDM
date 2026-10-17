package lh6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreen;
import kotlin.jvm.internal.Intrinsics;
import u80.p;
import vc.s;
import xf6.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UpdateLimitsScreen f195163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.Model f195164b;

    public f(UpdateLimitsScreen updateLimitsScreen, InputTextDelegate.Model model) {
        this.f195163a = updateLimitsScreen;
        this.f195164b = model;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        UpdateLimitsScreen updateLimitsScreen = this.f195163a;
        xi0.b bVar = updateLimitsScreen.R;
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        if (z) {
            p pVar = p.f278066a;
            String str = bVar.f306286a;
            qd0.b bVarN = ((z1) updateLimitsScreen.O.getValue()).f305189b.d.n();
            s.j(bVarN);
            dj0.d amount = new dj0.d(p.a(formattedValue, str, bVarN, null), bVar);
            String str2 = this.f195164b.f52580a;
            if (Intrinsics.f(str2, "LIST_ID_MAX_PER_TRANSFER")) {
                com.revolut.feature.external_accounts.impl.mandate.update_limits.a aVar = (com.revolut.feature.external_accounts.impl.mandate.update_limits.a) updateLimitsScreen.R2();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                aVar.H2(aVar.f72475t, new ar3.a(18, amount));
                return;
            }
            if (Intrinsics.f(str2, "LIST_ID_MAX_PER_MONTH")) {
                com.revolut.feature.external_accounts.impl.mandate.update_limits.a aVar2 = (com.revolut.feature.external_accounts.impl.mandate.update_limits.a) updateLimitsScreen.R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                aVar2.H2(aVar2.f72475t, new ar3.a(17, amount));
            }
        }
    }
}
