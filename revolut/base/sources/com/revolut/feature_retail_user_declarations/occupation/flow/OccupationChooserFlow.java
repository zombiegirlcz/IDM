package com.revolut.feature_retail_user_declarations.occupation.flow;

import com.revolut.feature_retail_user_declarations.occupation.OccupationChooserFlowInputData;
import com.revolut.feature_retail_user_declarations.occupation.flow.OccupationChooserFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.u;
import qji.b;
import rbi.c;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/occupation/flow/OccupationChooserFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrbi/c;", "Lyki/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OccupationChooserFlow extends ViewController<c> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public OccupationChooserFlow(OccupationChooserFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new s86.a(this, inputData, 5));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: sbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OccupationChooserFlow f261591b;

            {
                this.f261591b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((u) this.f261591b.K.getValue()).d.get();
                    default:
                        OccupationChooserFlow occupationChooserFlow = this.f261591b;
                        return czi.c.d(0, 6, null, occupationChooserFlow, (b) occupationChooserFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: sbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OccupationChooserFlow f261591b;

            {
                this.f261591b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((u) this.f261591b.K.getValue()).d.get();
                    default:
                        OccupationChooserFlow occupationChooserFlow = this.f261591b;
                        return czi.c.d(0, 6, null, occupationChooserFlow, (b) occupationChooserFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (u) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (sbi.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
