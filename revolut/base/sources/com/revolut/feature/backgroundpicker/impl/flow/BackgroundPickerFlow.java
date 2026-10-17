package com.revolut.feature.backgroundpicker.impl.flow;

import bn2.c;
import com.revolut.feature.backgroundpicker.api.model.BackgroundPickerFlowInput;
import com.revolut.feature.backgroundpicker.impl.flow.BackgroundPickerFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import em2.g;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pm2.b;
import pm2.h;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/flow/BackgroundPickerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lem2/g;", "Lyki/f;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackgroundPickerFlow extends ViewController<g> implements f {
    public final BackgroundPickerFlowInput K;
    public final c L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public /* synthetic */ BackgroundPickerFlow(BackgroundPickerFlowInput backgroundPickerFlowInput) {
        this(backgroundPickerFlowInput, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (qm2.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }

    public BackgroundPickerFlow(BackgroundPickerFlowInput inputData, c cVar) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = cVar;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackgroundPickerFlow f247764b;

            {
                this.f247764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BackgroundPickerFlow backgroundPickerFlow = this.f247764b;
                        phm.a aVar = (phm.a) ue0.e.j(backgroundPickerFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        pm2.c cVar2 = ((pm2.c) aVar2.b()).f237462g;
                        Optional optionalOfNullable = Optional.ofNullable(backgroundPickerFlow.L);
                        Intrinsics.checkNotNullExpressionValue(optionalOfNullable, "ofNullable(...)");
                        optionalOfNullable.getClass();
                        BackgroundPickerFlowInput backgroundPickerFlowInput = backgroundPickerFlow.K;
                        backgroundPickerFlowInput.getClass();
                        return new pm2.b(cVar2, optionalOfNullable, backgroundPickerFlowInput);
                    case 1:
                        return (b) ((pm2.b) this.f247764b.N.getValue()).f237458g.get();
                    default:
                        BackgroundPickerFlow backgroundPickerFlow2 = this.f247764b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, backgroundPickerFlow2, (b) backgroundPickerFlow2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackgroundPickerFlow f247764b;

            {
                this.f247764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BackgroundPickerFlow backgroundPickerFlow = this.f247764b;
                        phm.a aVar = (phm.a) ue0.e.j(backgroundPickerFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        pm2.c cVar2 = ((pm2.c) aVar2.b()).f237462g;
                        Optional optionalOfNullable = Optional.ofNullable(backgroundPickerFlow.L);
                        Intrinsics.checkNotNullExpressionValue(optionalOfNullable, "ofNullable(...)");
                        optionalOfNullable.getClass();
                        BackgroundPickerFlowInput backgroundPickerFlowInput = backgroundPickerFlow.K;
                        backgroundPickerFlowInput.getClass();
                        return new pm2.b(cVar2, optionalOfNullable, backgroundPickerFlowInput);
                    case 1:
                        return (b) ((pm2.b) this.f247764b.N.getValue()).f237458g.get();
                    default:
                        BackgroundPickerFlow backgroundPickerFlow2 = this.f247764b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, backgroundPickerFlow2, (b) backgroundPickerFlow2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackgroundPickerFlow f247764b;

            {
                this.f247764b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BackgroundPickerFlow backgroundPickerFlow = this.f247764b;
                        phm.a aVar = (phm.a) ue0.e.j(backgroundPickerFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        pm2.c cVar2 = ((pm2.c) aVar2.b()).f237462g;
                        Optional optionalOfNullable = Optional.ofNullable(backgroundPickerFlow.L);
                        Intrinsics.checkNotNullExpressionValue(optionalOfNullable, "ofNullable(...)");
                        optionalOfNullable.getClass();
                        BackgroundPickerFlowInput backgroundPickerFlowInput = backgroundPickerFlow.K;
                        backgroundPickerFlowInput.getClass();
                        return new pm2.b(cVar2, optionalOfNullable, backgroundPickerFlowInput);
                    case 1:
                        return (b) ((pm2.b) this.f247764b.N.getValue()).f237458g.get();
                    default:
                        BackgroundPickerFlow backgroundPickerFlow2 = this.f247764b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, backgroundPickerFlow2, (b) backgroundPickerFlow2.O.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}
