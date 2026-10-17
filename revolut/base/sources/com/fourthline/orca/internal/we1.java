package com.fourthline.orca.internal;

import android.os.SystemClock;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.core.flavor.OrcaLocalization;
import com.fourthline.orca.internal.k8;
import com.fourthline.orca.internal.ue1;
import com.fourthline.orca.workflow.WorkflowConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class we1 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f34665a;

    public we1() {
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.d(ib.b.Workflow);
        }
    }

    private final long b() {
        return SystemClock.uptimeMillis();
    }

    private final long c() {
        Long l2 = this.f34665a;
        if (l2 == null) {
            return -1L;
        }
        return b() - l2.longValue();
    }

    private final void d() {
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.d(null);
        }
    }

    @Override // com.fourthline.orca.internal.k8
    public void onProductFailed(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        jr0.a(jr0.f30017a, "workflow_failed", null, zhm.r0.k(new Pair("elapsedTime", Long.valueOf(c())), new Pair("orca_error", error.toString())), 2, null);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(new ue1.c(error, c()));
        }
        d();
    }

    @Override // com.fourthline.orca.internal.k8
    public void onProductStart(ProductConfig productConfig, ProductCustomization customization) {
        Intrinsics.checkNotNullParameter(productConfig, "productConfig");
        Intrinsics.checkNotNullParameter(customization, "customization");
        this.f34665a = Long.valueOf(b());
        OrcaFlavor orcaFlavor = new OrcaFlavor(null, null, null, null, null, 31, null);
        OrcaFlavor flavor = customization.getFlavor();
        Pair pair = new Pair("uses_custom_fonts", Boolean.valueOf(!Intrinsics.f(flavor.getFonts(), orcaFlavor.getFonts())));
        Pair pair2 = new Pair("uses_custom_colors", Boolean.valueOf((Intrinsics.f(flavor.getColorsLight(), orcaFlavor.getColorsLight()) && Intrinsics.f(flavor.getColorsDark(), orcaFlavor.getColorsDark())) ? false : true));
        Pair pair3 = new Pair("uses_custom_localization", Boolean.valueOf(!Intrinsics.f(flavor.getLocalization(), orcaFlavor.getLocalization())));
        Pair pair4 = new Pair("base_language", flavor.getLocalization().getBaseLanguage().getLanguageCode());
        OrcaLocalization.LanguageType fixedLanguage = flavor.getLocalization().getFixedLanguage();
        Map mapK = zhm.r0.k(pair, pair2, pair3, pair4, new Pair("fixed_language", fixedLanguage != null ? fixedLanguage.getLanguageCode() : null));
        WorkflowConfig workflowConfig = productConfig instanceof WorkflowConfig ? (WorkflowConfig) productConfig : null;
        mb.d networkEnvironment = workflowConfig != null ? workflowConfig.getNetworkEnvironment() : null;
        jr0.a(jr0.f30017a, "workflow_started", null, zhm.r0.k(new Pair("flavor", mapK), new Pair("network_config", networkEnvironment != null ? a1m.e.s(networkEnvironment) : null)), 2, null);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(ue1.d.f34072b);
        }
    }

    @Override // com.fourthline.orca.internal.k8
    public void onProductSuccess(Object result) {
        Intrinsics.checkNotNullParameter(result, "result");
        jr0.a(jr0.f30017a, "workflow_completed", null, zhm.q0.c(new Pair("elapsedTime", Long.valueOf(c()))), 2, null);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(new ue1.a(c()));
        }
        d();
    }

    @Override // com.fourthline.orca.internal.qg0
    public /* bridge */ void track(k8.a aVar) {
        super.track(aVar);
    }
}
