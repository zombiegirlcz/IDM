package com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences;

import aii.q;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.LegacyConsentPreferencesFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.LegacyConsentPreferencesFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginSubFlowController;
import dw3.c1;
import dw3.v3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yhm.d;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/LegacyConsentPreferencesFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginSubFlowController;", "Laii/q;", "Lyki/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class LegacyConsentPreferencesFlow extends PluginSubFlowController<q> {
    public final LegacyConsentPreferencesFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public LegacyConsentPreferencesFlow(LegacyConsentPreferencesFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: a74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyConsentPreferencesFlow f1768b;

            {
                this.f1768b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LegacyConsentPreferencesFlow legacyConsentPreferencesFlow = this.f1768b;
                        phm.a aVar = (phm.a) e.j(legacyConsentPreferencesFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        LegacyConsentPreferencesFlowContract$InputData legacyConsentPreferencesFlowContract$InputData = legacyConsentPreferencesFlow.K;
                        legacyConsentPreferencesFlowContract$InputData.getClass();
                        return new v3(c1Var, legacyConsentPreferencesFlowContract$InputData);
                    case 1:
                        return (b) ((v3) this.f1768b.L.getValue()).d.get();
                    default:
                        LegacyConsentPreferencesFlow legacyConsentPreferencesFlow2 = this.f1768b;
                        return czi.c.d(0, 6, null, legacyConsentPreferencesFlow2, (b) legacyConsentPreferencesFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: a74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyConsentPreferencesFlow f1768b;

            {
                this.f1768b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LegacyConsentPreferencesFlow legacyConsentPreferencesFlow = this.f1768b;
                        phm.a aVar = (phm.a) e.j(legacyConsentPreferencesFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        LegacyConsentPreferencesFlowContract$InputData legacyConsentPreferencesFlowContract$InputData = legacyConsentPreferencesFlow.K;
                        legacyConsentPreferencesFlowContract$InputData.getClass();
                        return new v3(c1Var, legacyConsentPreferencesFlowContract$InputData);
                    case 1:
                        return (b) ((v3) this.f1768b.L.getValue()).d.get();
                    default:
                        LegacyConsentPreferencesFlow legacyConsentPreferencesFlow2 = this.f1768b;
                        return czi.c.d(0, 6, null, legacyConsentPreferencesFlow2, (b) legacyConsentPreferencesFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: a74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyConsentPreferencesFlow f1768b;

            {
                this.f1768b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        LegacyConsentPreferencesFlow legacyConsentPreferencesFlow = this.f1768b;
                        phm.a aVar = (phm.a) e.j(legacyConsentPreferencesFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        LegacyConsentPreferencesFlowContract$InputData legacyConsentPreferencesFlowContract$InputData = legacyConsentPreferencesFlow.K;
                        legacyConsentPreferencesFlowContract$InputData.getClass();
                        return new v3(c1Var, legacyConsentPreferencesFlowContract$InputData);
                    case 1:
                        return (b) ((v3) this.f1768b.L.getValue()).d.get();
                    default:
                        LegacyConsentPreferencesFlow legacyConsentPreferencesFlow2 = this.f1768b;
                        return czi.c.d(0, 6, null, legacyConsentPreferencesFlow2, (b) legacyConsentPreferencesFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v3) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (v3) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (a74.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginSubFlowController, oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
