package com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.RevPointsTrophyRoomBottomSheetScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.RevPointsTrophyRoomBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sy6.j;
import t05.m;
import t0c.b;
import te0.w;
import xki.e;
import zhm.v;
import zxb.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/bottom_sheet/RevPointsTrophyRoomBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lt0c/b;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsTrophyRoomBottomSheetScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int U = 0;
    public final RevPointsTrophyRoomBottomSheetScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public RevPointsTrophyRoomBottomSheetScreen(RevPointsTrophyRoomBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: t0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomBottomSheetScreen f266993b;

            {
                this.f266993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsTrophyRoomBottomSheetScreen revPointsTrophyRoomBottomSheetScreen = this.f266993b;
                switch (i2) {
                    case 0:
                        int i3 = RevPointsTrophyRoomBottomSheetScreen.U;
                        qji.b bVarU2 = revPointsTrophyRoomBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.di.RevPointsTrophyRoomBottomSheetScreenInjector");
                        y yVar = (y) bVarU2;
                        zxb.e eVar = yVar.f326311a;
                        y yVar2 = yVar.f326312b;
                        RevPointsTrophyRoomBottomSheetScreenContract$InputData revPointsTrophyRoomBottomSheetScreenContract$InputData = revPointsTrophyRoomBottomSheetScreen.Q;
                        revPointsTrophyRoomBottomSheetScreenContract$InputData.getClass();
                        return new zxb.w(eVar, yVar2, revPointsTrophyRoomBottomSheetScreenContract$InputData);
                    default:
                        int i5 = RevPointsTrophyRoomBottomSheetScreen.U;
                        return (e) ((zxb.w) revPointsTrophyRoomBottomSheetScreen.R.getValue()).f326306c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: t0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomBottomSheetScreen f266993b;

            {
                this.f266993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsTrophyRoomBottomSheetScreen revPointsTrophyRoomBottomSheetScreen = this.f266993b;
                switch (i22) {
                    case 0:
                        int i3 = RevPointsTrophyRoomBottomSheetScreen.U;
                        qji.b bVarU2 = revPointsTrophyRoomBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.di.RevPointsTrophyRoomBottomSheetScreenInjector");
                        y yVar = (y) bVarU2;
                        zxb.e eVar = yVar.f326311a;
                        y yVar2 = yVar.f326312b;
                        RevPointsTrophyRoomBottomSheetScreenContract$InputData revPointsTrophyRoomBottomSheetScreenContract$InputData = revPointsTrophyRoomBottomSheetScreen.Q;
                        revPointsTrophyRoomBottomSheetScreenContract$InputData.getClass();
                        return new zxb.w(eVar, yVar2, revPointsTrophyRoomBottomSheetScreenContract$InputData);
                    default:
                        int i5 = RevPointsTrophyRoomBottomSheetScreen.U;
                        return (e) ((zxb.w) revPointsTrophyRoomBottomSheetScreen.R.getValue()).f326306c.get();
                }
            }
        });
        this.T = v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zxb.w) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (t0c.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new m(this, continuation, 1), 3);
        ViewController.P2(this, h3(), new j(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (t0c.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.T;
    }
}
