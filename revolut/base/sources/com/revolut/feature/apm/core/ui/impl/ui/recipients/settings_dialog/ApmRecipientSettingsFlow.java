package com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog;

import c12.e0;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientSettingsNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.ApmRecipientSettingsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import e42.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p12.v;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/recipients/settings_dialog/ApmRecipientSettingsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc12/e0;", "Lyki/f;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmRecipientSettingsFlow extends ViewController<e0> implements f {
    public final ApmRecipientSettingsNavigation$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ApmRecipientSettingsFlow(ApmRecipientSettingsNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: e42.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientSettingsFlow f122374b;

            {
                this.f122374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ApmRecipientSettingsFlow apmRecipientSettingsFlow = this.f122374b;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientSettingsFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmRecipientSettingsNavigation$InputData apmRecipientSettingsNavigation$InputData = apmRecipientSettingsFlow.K;
                        apmRecipientSettingsNavigation$InputData.getClass();
                        return new p12.e0(vVar, apmRecipientSettingsNavigation$InputData);
                    case 1:
                        return (c) ((p12.e0) this.f122374b.L.getValue()).f231642c.get();
                    default:
                        ApmRecipientSettingsFlow apmRecipientSettingsFlow2 = this.f122374b;
                        return czi.c.d(0, 6, null, apmRecipientSettingsFlow2, (c) apmRecipientSettingsFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: e42.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientSettingsFlow f122374b;

            {
                this.f122374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ApmRecipientSettingsFlow apmRecipientSettingsFlow = this.f122374b;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientSettingsFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmRecipientSettingsNavigation$InputData apmRecipientSettingsNavigation$InputData = apmRecipientSettingsFlow.K;
                        apmRecipientSettingsNavigation$InputData.getClass();
                        return new p12.e0(vVar, apmRecipientSettingsNavigation$InputData);
                    case 1:
                        return (c) ((p12.e0) this.f122374b.L.getValue()).f231642c.get();
                    default:
                        ApmRecipientSettingsFlow apmRecipientSettingsFlow2 = this.f122374b;
                        return czi.c.d(0, 6, null, apmRecipientSettingsFlow2, (c) apmRecipientSettingsFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: e42.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientSettingsFlow f122374b;

            {
                this.f122374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ApmRecipientSettingsFlow apmRecipientSettingsFlow = this.f122374b;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientSettingsFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmRecipientSettingsNavigation$InputData apmRecipientSettingsNavigation$InputData = apmRecipientSettingsFlow.K;
                        apmRecipientSettingsNavigation$InputData.getClass();
                        return new p12.e0(vVar, apmRecipientSettingsNavigation$InputData);
                    case 1:
                        return (c) ((p12.e0) this.f122374b.L.getValue()).f231642c.get();
                    default:
                        ApmRecipientSettingsFlow apmRecipientSettingsFlow2 = this.f122374b;
                        return czi.c.d(0, 6, null, apmRecipientSettingsFlow2, (c) apmRecipientSettingsFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p12.e0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (p12.e0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
