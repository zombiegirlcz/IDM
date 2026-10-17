package com.revolut.camerakit.revolut.ui.flow;

import com.revolut.camerakit.revolut.ui.flow.CameraKitFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import f00.a;
import fv.d;
import fv.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ly.c;
import ly.h;
import no.d1;
import om4.d0;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lly/h;", "Lyki/f;", "Lno/d1;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraKitFlow extends ViewController<h> implements f, d1 {
    public final c K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CameraKitFlow(c inputData, d0 d0Var, int i) {
        f00.b.Companion.getClass();
        Object customHintMapperFactory = d0Var;
        if ((i & 4) != 0) {
            e.Companion.getClass();
            customHintMapperFactory = d.f138299b;
        }
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        a.C0766a customValidatorFactory = f00.a.f130988b;
        Intrinsics.checkNotNullParameter(customValidatorFactory, "customValidatorFactory");
        Intrinsics.checkNotNullParameter(customHintMapperFactory, "customHintMapperFactory");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        this.M = w.y0(new ltf.b(this, customHintMapperFactory, 8));
        final int i2 = 0;
        this.N = w.y0(new Function0(this) { // from class: ly.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraKitFlow f200603b;

            {
                this.f200603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((my.b) this.f200603b.M.getValue()).e();
                    default:
                        CameraKitFlow cameraKitFlow = this.f200603b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cameraKitFlow, (b) cameraKitFlow.N.getValue());
                }
            }
        });
        final int i3 = 1;
        this.O = w.y0(new Function0(this) { // from class: ly.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraKitFlow f200603b;

            {
                this.f200603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((my.b) this.f200603b.M.getValue()).e();
                    default:
                        CameraKitFlow cameraKitFlow = this.f200603b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cameraKitFlow, (b) cameraKitFlow.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (my.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (my.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ly.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
