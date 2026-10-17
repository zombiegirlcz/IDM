package com.revolut.chat.ui.agent_offline;

import android.view.View;
import com.revolut.chat.ui.agent_offline.AgentOfflineScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import f40.d;
import f40.f;
import f40.g;
import h30.j;
import h30.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import w30.b;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ui/agent_offline/AgentOfflineScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lf40/f;", "Lf40/d;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AgentOfflineScreen extends BaseBottomSheetRecyclerController<f, d> {
    public static final /* synthetic */ int U = 0;
    public final b Q;
    public final f0 R;
    public final Object S;
    public final Object T;

    public AgentOfflineScreen() {
        this(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, e3(), null, new f40.b(this, null, 0), 3);
        a.g2(this, f3(), null, new f40.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return this.R;
    }

    public AgentOfflineScreen(b bVar) {
        this.Q = bVar;
        this.R = f0.f322471a;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: f40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AgentOfflineScreen f131988b;

            {
                this.f131988b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AgentOfflineScreen agentOfflineScreen = this.f131988b;
                switch (i2) {
                    case 0:
                        int i3 = AgentOfflineScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(agentOfflineScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                        }
                        n nVar = ((n) ((h30.a) aVar2.b())).f148930w;
                        return new j(agentOfflineScreen.Q);
                    default:
                        int i5 = AgentOfflineScreen.U;
                        return new i(new h(), ((j) agentOfflineScreen.S.getValue()).f148900a);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: f40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AgentOfflineScreen f131988b;

            {
                this.f131988b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AgentOfflineScreen agentOfflineScreen = this.f131988b;
                switch (i22) {
                    case 0:
                        int i3 = AgentOfflineScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(agentOfflineScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                        }
                        n nVar = ((n) ((h30.a) aVar2.b())).f148930w;
                        return new j(agentOfflineScreen.Q);
                    default:
                        int i5 = AgentOfflineScreen.U;
                        return new i(new h(), ((j) agentOfflineScreen.S.getValue()).f148900a);
                }
            }
        });
    }
}
