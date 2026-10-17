package com.revolut.feature.user.checklist.impl.ui.flow;

import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user/checklist/impl/ui/flow/ChecklistFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_user_checklist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChecklistFlow extends ViewController<Object> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ChecklistFlow(ChecklistFlowContract$ChecklistFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pmg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistFlow f237565b;

            {
                this.f237565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ChecklistFlow checklistFlow = this.f237565b;
                        return c.d(R$id.screen_transparent_container, 4, null, checklistFlow, (b) checklistFlow.N.getValue());
                    default:
                        return (b) ((kmg.b) this.f237565b.M.getValue()).d.get();
                }
            }
        });
        this.M = w.y0(new pe2.c(this, inputData, 14));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pmg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistFlow f237565b;

            {
                this.f237565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ChecklistFlow checklistFlow = this.f237565b;
                        return c.d(R$id.screen_transparent_container, 4, null, checklistFlow, (b) checklistFlow.N.getValue());
                    default:
                        return (b) ((kmg.b) this.f237565b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kmg.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (kmg.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (pmg.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
