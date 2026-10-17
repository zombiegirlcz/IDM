package com.revolut.feature.slot_manager.impl.ui.screen.checklist;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistController;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kkd.d;
import kkd.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lld.g;
import lld.h;
import lld.i;
import no.m;
import te0.w;
import vkm.q;
import vkm.z1;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/impl/ui/screen/checklist/SlotChecklistController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lkkd/d;", "Llld/h;", "Lno/m;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SlotChecklistController extends BaseBottomSheetRecyclerController<d, h> implements m {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f87360a0 = 0;
    public final SlotChecklistControllerContract$InputData Q;
    public final f R;
    public final AnalyticsProduct S;
    public final boolean T;
    public final RowDelegate U;
    public final SmallActionButtonDelegate V;
    public final TextDelegate W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public SlotChecklistController(SlotChecklistControllerContract$InputData inputData, f controllerModelEventHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(controllerModelEventHandler, "controllerModelEventHandler");
        this.Q = inputData;
        this.R = controllerModelEventHandler;
        this.S = inputData.f87362b;
        this.T = true;
        this.U = new RowDelegate(null, null, 7);
        this.V = new SmallActionButtonDelegate();
        this.W = new TextDelegate();
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: lld.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SlotChecklistController f196713b;

            {
                this.f196713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SlotChecklistController slotChecklistController = this.f196713b;
                switch (i2) {
                    case 0:
                        int i3 = SlotChecklistController.f87360a0;
                        return zhm.v.k(new RowLoadingDelegate(), slotChecklistController.U, slotChecklistController.V, slotChecklistController.W);
                    case 1:
                        int i5 = SlotChecklistController.f87360a0;
                        phm.a aVar = (phm.a) ue0.e.j(slotChecklistController.m2()).a().get(rkd.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rkd.g.class, " is not found"));
                        }
                        rkd.g gVar = ((rkd.g) aVar2.b()).f254806l;
                        SlotChecklistControllerContract$InputData slotChecklistControllerContract$InputData = slotChecklistController.Q;
                        slotChecklistControllerContract$InputData.getClass();
                        kkd.f fVar = slotChecklistController.R;
                        fVar.getClass();
                        return new rkd.h(gVar, slotChecklistController, slotChecklistControllerContract$InputData, fVar);
                    default:
                        int i6 = SlotChecklistController.f87360a0;
                        return (i) ((rkd.h) slotChecklistController.Y.getValue()).f254821h.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: lld.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SlotChecklistController f196713b;

            {
                this.f196713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SlotChecklistController slotChecklistController = this.f196713b;
                switch (i22) {
                    case 0:
                        int i3 = SlotChecklistController.f87360a0;
                        return zhm.v.k(new RowLoadingDelegate(), slotChecklistController.U, slotChecklistController.V, slotChecklistController.W);
                    case 1:
                        int i5 = SlotChecklistController.f87360a0;
                        phm.a aVar = (phm.a) ue0.e.j(slotChecklistController.m2()).a().get(rkd.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rkd.g.class, " is not found"));
                        }
                        rkd.g gVar = ((rkd.g) aVar2.b()).f254806l;
                        SlotChecklistControllerContract$InputData slotChecklistControllerContract$InputData = slotChecklistController.Q;
                        slotChecklistControllerContract$InputData.getClass();
                        kkd.f fVar = slotChecklistController.R;
                        fVar.getClass();
                        return new rkd.h(gVar, slotChecklistController, slotChecklistControllerContract$InputData, fVar);
                    default:
                        int i6 = SlotChecklistController.f87360a0;
                        return (i) ((rkd.h) slotChecklistController.Y.getValue()).f254821h.get();
                }
            }
        });
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: lld.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SlotChecklistController f196713b;

            {
                this.f196713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SlotChecklistController slotChecklistController = this.f196713b;
                switch (i22) {
                    case 0:
                        int i32 = SlotChecklistController.f87360a0;
                        return zhm.v.k(new RowLoadingDelegate(), slotChecklistController.U, slotChecklistController.V, slotChecklistController.W);
                    case 1:
                        int i5 = SlotChecklistController.f87360a0;
                        phm.a aVar = (phm.a) ue0.e.j(slotChecklistController.m2()).a().get(rkd.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rkd.g.class, " is not found"));
                        }
                        rkd.g gVar = ((rkd.g) aVar2.b()).f254806l;
                        SlotChecklistControllerContract$InputData slotChecklistControllerContract$InputData = slotChecklistController.Q;
                        slotChecklistControllerContract$InputData.getClass();
                        kkd.f fVar = slotChecklistController.R;
                        fVar.getClass();
                        return new rkd.h(gVar, slotChecklistController, slotChecklistControllerContract$InputData, fVar);
                    default:
                        int i6 = SlotChecklistController.f87360a0;
                        return (i) ((rkd.h) slotChecklistController.Y.getValue()).f254821h.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getS() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rkd.h) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: V2, reason: from getter */
    public final boolean getT() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.V.f53336c.f121375b), new lld.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f53218h), new lld.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.W.d), new g(this, continuation, 0), 3);
        ViewController.P2(this, q.J(e3(), f3()), new g(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        if (z) {
            a aVar = (a) d();
            z1 z1Var = aVar.f87372y;
            Unit unit = Unit.f186387a;
            z1Var.k(unit);
            aVar.f87367r.f196710n.k(unit);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return (List) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.Z.getValue();
    }

    public /* synthetic */ SlotChecklistController(SlotChecklistControllerContract$InputData slotChecklistControllerContract$InputData) {
        this(slotChecklistControllerContract$InputData, mld.a.f206672a);
    }
}
