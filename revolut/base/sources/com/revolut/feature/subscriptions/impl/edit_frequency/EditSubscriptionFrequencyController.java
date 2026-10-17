package com.revolut.feature.subscriptions.impl.edit_frequency;

import android.view.View;
import c9e.a;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyController;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import i9e.n;
import i9e.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import y9e.c;
import y9e.d;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/edit_frequency/EditSubscriptionFrequencyController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lc9e/a;", "Ly9e/d;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditSubscriptionFrequencyController extends BaseBottomSheetRecyclerController<a, d> {
    public static final /* synthetic */ int V = 0;
    public final EditSubscriptionFrequencyControllerContract$InputData Q;
    public final Object R;
    public final Object S;
    public final SingleChoiceDelegate T;
    public final List U;

    public EditSubscriptionFrequencyController(EditSubscriptionFrequencyControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: y9e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditSubscriptionFrequencyController f311843b;

            {
                this.f311843b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditSubscriptionFrequencyController editSubscriptionFrequencyController = this.f311843b;
                switch (i2) {
                    case 0:
                        int i3 = EditSubscriptionFrequencyController.V;
                        phm.a aVar = (phm.a) ue0.e.j(editSubscriptionFrequencyController.m2()).a().get(f9e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f9e.a.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).G;
                        EditSubscriptionFrequencyControllerContract$InputData editSubscriptionFrequencyControllerContract$InputData = editSubscriptionFrequencyController.Q;
                        editSubscriptionFrequencyControllerContract$InputData.getClass();
                        return new n(oVar, editSubscriptionFrequencyControllerContract$InputData);
                    default:
                        int i5 = EditSubscriptionFrequencyController.V;
                        return (c) ((n) editSubscriptionFrequencyController.R.getValue()).f159701c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: y9e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditSubscriptionFrequencyController f311843b;

            {
                this.f311843b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditSubscriptionFrequencyController editSubscriptionFrequencyController = this.f311843b;
                switch (i22) {
                    case 0:
                        int i3 = EditSubscriptionFrequencyController.V;
                        phm.a aVar = (phm.a) ue0.e.j(editSubscriptionFrequencyController.m2()).a().get(f9e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f9e.a.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).G;
                        EditSubscriptionFrequencyControllerContract$InputData editSubscriptionFrequencyControllerContract$InputData = editSubscriptionFrequencyController.Q;
                        editSubscriptionFrequencyControllerContract$InputData.getClass();
                        return new n(oVar, editSubscriptionFrequencyControllerContract$InputData);
                    default:
                        int i5 = EditSubscriptionFrequencyController.V;
                        return (c) ((n) editSubscriptionFrequencyController.R.getValue()).f159701c.get();
                }
            }
        });
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.T = singleChoiceDelegate;
        this.U = u.c(singleChoiceDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.p()), null, new y9e.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new y5g.d(this, null, 8), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
