package com.revolut.chat.ui.outage;

import android.view.View;
import com.revolut.chat.ui.outage.OngoingOutageScreen;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import h30.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r50.b;
import r50.c;
import r50.d;
import r50.f;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ui/outage/OngoingOutageScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lr50/d;", "Lr50/b;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OngoingOutageScreen extends BaseBottomSheetRecyclerController<d, b> {
    public static final /* synthetic */ int U = 0;
    public final c Q;
    public final List R;
    public final Object S;
    public final Object T;

    public OngoingOutageScreen(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = u.c(new ActionWidgetDelegate());
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: r50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OngoingOutageScreen f251522b;

            {
                this.f251522b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OngoingOutageScreen ongoingOutageScreen = this.f251522b;
                switch (i2) {
                    case 0:
                        int i3 = OngoingOutageScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(ongoingOutageScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                        }
                        n nVar = ((n) ((h30.a) aVar2.b())).f148930w;
                        c cVar = ongoingOutageScreen.Q;
                        cVar.getClass();
                        return new h30.u(cVar);
                    default:
                        int i5 = OngoingOutageScreen.U;
                        return new f(((h30.u) ongoingOutageScreen.S.getValue()).f148971a, new e());
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: r50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OngoingOutageScreen f251522b;

            {
                this.f251522b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OngoingOutageScreen ongoingOutageScreen = this.f251522b;
                switch (i22) {
                    case 0:
                        int i3 = OngoingOutageScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(ongoingOutageScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                        }
                        n nVar = ((n) ((h30.a) aVar2.b())).f148930w;
                        c cVar = ongoingOutageScreen.Q;
                        cVar.getClass();
                        return new h30.u(cVar);
                    default:
                        int i5 = OngoingOutageScreen.U;
                        return new f(((h30.u) ongoingOutageScreen.S.getValue()).f148971a, new e());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h30.u) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, e3(), null, new r0e.c(this, null, 7), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.R;
    }
}
