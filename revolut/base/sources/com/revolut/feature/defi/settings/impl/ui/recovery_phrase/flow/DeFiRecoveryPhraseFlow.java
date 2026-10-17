package com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow;

import aii.q;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.DeFiRecoveryPhraseFlow;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.DeFiRecoveryPhraseFlowContract$Input;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import e66.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/ui/recovery_phrase/flow/DeFiRecoveryPhraseFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiRecoveryPhraseFlow extends ViewController<q> implements f {
    public final DeFiRecoveryPhraseFlowContract$Input K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public DeFiRecoveryPhraseFlow(DeFiRecoveryPhraseFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: j66.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiRecoveryPhraseFlow f171672b;

            {
                this.f171672b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((e66.a) this.f171672b.O.getValue()).d.get();
                    case 1:
                        DeFiRecoveryPhraseFlow deFiRecoveryPhraseFlow = this.f171672b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, deFiRecoveryPhraseFlow, (b) deFiRecoveryPhraseFlow.M.getValue());
                    default:
                        DeFiRecoveryPhraseFlow deFiRecoveryPhraseFlow2 = this.f171672b;
                        phm.a aVar = (phm.a) e.j(deFiRecoveryPhraseFlow2.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).d;
                        DeFiRecoveryPhraseFlowContract$Input deFiRecoveryPhraseFlowContract$Input = deFiRecoveryPhraseFlow2.K;
                        deFiRecoveryPhraseFlowContract$Input.getClass();
                        return new e66.a(dVar, deFiRecoveryPhraseFlowContract$Input);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: j66.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiRecoveryPhraseFlow f171672b;

            {
                this.f171672b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((e66.a) this.f171672b.O.getValue()).d.get();
                    case 1:
                        DeFiRecoveryPhraseFlow deFiRecoveryPhraseFlow = this.f171672b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, deFiRecoveryPhraseFlow, (b) deFiRecoveryPhraseFlow.M.getValue());
                    default:
                        DeFiRecoveryPhraseFlow deFiRecoveryPhraseFlow2 = this.f171672b;
                        phm.a aVar = (phm.a) e.j(deFiRecoveryPhraseFlow2.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).d;
                        DeFiRecoveryPhraseFlowContract$Input deFiRecoveryPhraseFlowContract$Input = deFiRecoveryPhraseFlow2.K;
                        deFiRecoveryPhraseFlowContract$Input.getClass();
                        return new e66.a(dVar, deFiRecoveryPhraseFlowContract$Input);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: j66.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiRecoveryPhraseFlow f171672b;

            {
                this.f171672b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((e66.a) this.f171672b.O.getValue()).d.get();
                    case 1:
                        DeFiRecoveryPhraseFlow deFiRecoveryPhraseFlow = this.f171672b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, deFiRecoveryPhraseFlow, (b) deFiRecoveryPhraseFlow.M.getValue());
                    default:
                        DeFiRecoveryPhraseFlow deFiRecoveryPhraseFlow2 = this.f171672b;
                        phm.a aVar = (phm.a) e.j(deFiRecoveryPhraseFlow2.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).d;
                        DeFiRecoveryPhraseFlowContract$Input deFiRecoveryPhraseFlowContract$Input = deFiRecoveryPhraseFlow2.K;
                        deFiRecoveryPhraseFlowContract$Input.getClass();
                        return new e66.a(dVar, deFiRecoveryPhraseFlowContract$Input);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e66.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (e66.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j66.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
