package com.revolut.feature.transport.impl.ui.timer_dialog;

import android.view.View;
import cli.w;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.transport.impl.ui.timer_dialog.TimerDialogContract$InputData;
import com.revolut.feature.transport.impl.ui.timer_dialog.TimerDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import hvf.i;
import hvf.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import pwf.a;
import pwf.c;
import pwf.e;
import pwf.g;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/timer_dialog/TimerDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lpwf/e;", "Lpwf/a;", "Lcli/w;", "Lcii/b;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimerDialogController extends BaseBottomSheetRecyclerController<e, a> implements w {
    public static final /* synthetic */ int U = 0;
    public final TimerDialogContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public TimerDialogController(TimerDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        final int i2 = 1;
        this.R = v.k(new TextDelegate(), new CellDetailsStandaloneNoteDelegate());
        this.S = te0.w.y0(new Function0(this) { // from class: pwf.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TimerDialogController f240444b;

            {
                this.f240444b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                TimerDialogController timerDialogController = this.f240444b;
                switch (i3) {
                    case 0:
                        int i5 = TimerDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(timerDialogController.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).k;
                        TimerDialogContract$InputData timerDialogContract$InputData = timerDialogController.Q;
                        timerDialogContract$InputData.getClass();
                        return new i(qVar, timerDialogContract$InputData);
                    default:
                        int i6 = TimerDialogController.U;
                        return (g) ((i) timerDialogController.S.getValue()).f155914g.get();
                }
            }
        });
        this.T = te0.w.y0(new Function0(this) { // from class: pwf.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TimerDialogController f240444b;

            {
                this.f240444b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                TimerDialogController timerDialogController = this.f240444b;
                switch (i3) {
                    case 0:
                        int i5 = TimerDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(timerDialogController.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).k;
                        TimerDialogContract$InputData timerDialogContract$InputData = timerDialogController.Q;
                        timerDialogContract$InputData.getClass();
                        return new i(qVar, timerDialogContract$InputData);
                    default:
                        int i6 = TimerDialogController.U;
                        return (g) ((i) timerDialogController.S.getValue()).f155914g.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((g) this.T.getValue()).C2(c.f240441a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new pnb.b(this, null, 19), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
