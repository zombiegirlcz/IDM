package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdjustAssetValueContract$InputData f238431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238433c;

    public i(n nVar, u0 u0Var, AdjustAssetValueContract$InputData adjustAssetValueContract$InputData) {
        this.f238432b = nVar;
        this.f238431a = adjustAssetValueContract$InputData;
        this.f238433c = e4m.b.b(new p2k.c(nVar, this, 28));
    }

    public final w80.b b() {
        qd0.b languageProvider = this.f238432b.d.n();
        vc.s.j(languageProvider);
        qrd.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, true, 10);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
