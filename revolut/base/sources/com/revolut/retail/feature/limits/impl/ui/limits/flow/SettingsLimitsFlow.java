package com.revolut.retail.feature.limits.impl.ui.limits.flow;

import a0.d;
import aii.q;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlow;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlowContract$InputData;
import izj.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/limits/impl/ui/limits/flow/SettingsLimitsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingsLimitsFlow extends ViewController<q> implements f {
    public final SettingsLimitsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public SettingsLimitsFlow(SettingsLimitsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: izj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsLimitsFlow f169890b;

            {
                this.f169890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SettingsLimitsFlow settingsLimitsFlow = this.f169890b;
                        phm.a aVar = (phm.a) e.j(settingsLimitsFlow.m2()).a().get(yyj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", yyj.a.class, " is not found"));
                        }
                        ezj.b bVar = ((ezj.b) aVar2.b()).e;
                        SettingsLimitsFlowContract$InputData settingsLimitsFlowContract$InputData = settingsLimitsFlow.K;
                        settingsLimitsFlowContract$InputData.getClass();
                        return new ezj.d(bVar, settingsLimitsFlowContract$InputData);
                    case 1:
                        return (c) ((ezj.d) this.f169890b.L.getValue()).d.get();
                    default:
                        SettingsLimitsFlow settingsLimitsFlow2 = this.f169890b;
                        return czi.c.d(0, 6, null, settingsLimitsFlow2, (c) settingsLimitsFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: izj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsLimitsFlow f169890b;

            {
                this.f169890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SettingsLimitsFlow settingsLimitsFlow = this.f169890b;
                        phm.a aVar = (phm.a) e.j(settingsLimitsFlow.m2()).a().get(yyj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", yyj.a.class, " is not found"));
                        }
                        ezj.b bVar = ((ezj.b) aVar2.b()).e;
                        SettingsLimitsFlowContract$InputData settingsLimitsFlowContract$InputData = settingsLimitsFlow.K;
                        settingsLimitsFlowContract$InputData.getClass();
                        return new ezj.d(bVar, settingsLimitsFlowContract$InputData);
                    case 1:
                        return (c) ((ezj.d) this.f169890b.L.getValue()).d.get();
                    default:
                        SettingsLimitsFlow settingsLimitsFlow2 = this.f169890b;
                        return czi.c.d(0, 6, null, settingsLimitsFlow2, (c) settingsLimitsFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: izj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsLimitsFlow f169890b;

            {
                this.f169890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SettingsLimitsFlow settingsLimitsFlow = this.f169890b;
                        phm.a aVar = (phm.a) e.j(settingsLimitsFlow.m2()).a().get(yyj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", yyj.a.class, " is not found"));
                        }
                        ezj.b bVar = ((ezj.b) aVar2.b()).e;
                        SettingsLimitsFlowContract$InputData settingsLimitsFlowContract$InputData = settingsLimitsFlow.K;
                        settingsLimitsFlowContract$InputData.getClass();
                        return new ezj.d(bVar, settingsLimitsFlowContract$InputData);
                    case 1:
                        return (c) ((ezj.d) this.f169890b.L.getValue()).d.get();
                    default:
                        SettingsLimitsFlow settingsLimitsFlow2 = this.f169890b;
                        return czi.c.d(0, 6, null, settingsLimitsFlow2, (c) settingsLimitsFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ezj.d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (ezj.d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
