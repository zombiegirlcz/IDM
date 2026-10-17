package com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.close_connections_bottom_sheet;

import aii.q;
import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.close_connections_bottom_sheet.CloseConnectionsBottomSheet;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import la8.h;
import nng.c;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/close_connections_bottom_sheet/CloseConnectionsBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "<init>", "()V", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CloseConnectionsBottomSheet extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final List S = v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7));

    public CloseConnectionsBottomSheet() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: log.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CloseConnectionsBottomSheet f197453b;

            {
                this.f197453b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CloseConnectionsBottomSheet closeConnectionsBottomSheet = this.f197453b;
                switch (i2) {
                    case 0:
                        int i3 = CloseConnectionsBottomSheet.T;
                        qji.b bVarU2 = closeConnectionsBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.close_connections_bottom_sheet.di.CloseConnectionsBottomSheetInjector");
                        nng.c cVar = new nng.c();
                        cVar.f217637a = e4m.b.b(new m0m.a(17));
                        return cVar;
                    default:
                        int i5 = CloseConnectionsBottomSheet.T;
                        return (b) ((nng.c) closeConnectionsBottomSheet.Q.getValue()).f217637a.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: log.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CloseConnectionsBottomSheet f197453b;

            {
                this.f197453b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CloseConnectionsBottomSheet closeConnectionsBottomSheet = this.f197453b;
                switch (i22) {
                    case 0:
                        int i3 = CloseConnectionsBottomSheet.T;
                        qji.b bVarU2 = closeConnectionsBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.close_connections_bottom_sheet.di.CloseConnectionsBottomSheetInjector");
                        nng.c cVar = new nng.c();
                        cVar.f217637a = e4m.b.b(new m0m.a(17));
                        return cVar;
                    default:
                        int i5 = CloseConnectionsBottomSheet.T;
                        return (b) ((nng.c) closeConnectionsBottomSheet.Q.getValue()).f217637a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (log.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new h(this, null, 29), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (log.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.S;
    }
}
