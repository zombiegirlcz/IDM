package com.revolut.feature.shops.impl.ui.bid_screen;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreen;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import did.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import x0f.g;
import xid.c;
import xid.d;
import xid.h;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/bid_screen/ShopsItemsBidScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lxid/d;", "Lxid/c;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsItemsBidScreen extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int U = 0;
    public final ShopsItemsBidScreenContract$InputData Q;
    public final SuggestionsBarDelegate R;
    public final Object S;
    public final Object T;

    public ShopsItemsBidScreen(ShopsItemsBidScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = new SuggestionsBarDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: xid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsItemsBidScreen f306321b;

            {
                this.f306321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShopsItemsBidScreen shopsItemsBidScreen = this.f306321b;
                switch (i2) {
                    case 0:
                        int i3 = ShopsItemsBidScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(shopsItemsBidScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsItemsBidScreenContract$InputData shopsItemsBidScreenContract$InputData = shopsItemsBidScreen.Q;
                        shopsItemsBidScreenContract$InputData.getClass();
                        return new did.k(dVar, shopsItemsBidScreenContract$InputData);
                    default:
                        int i5 = ShopsItemsBidScreen.U;
                        return (h) ((did.k) shopsItemsBidScreen.S.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: xid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsItemsBidScreen f306321b;

            {
                this.f306321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShopsItemsBidScreen shopsItemsBidScreen = this.f306321b;
                switch (i22) {
                    case 0:
                        int i3 = ShopsItemsBidScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(shopsItemsBidScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsItemsBidScreenContract$InputData shopsItemsBidScreenContract$InputData = shopsItemsBidScreen.Q;
                        shopsItemsBidScreenContract$InputData.getClass();
                        return new did.k(dVar, shopsItemsBidScreenContract$InputData);
                    default:
                        int i5 = ShopsItemsBidScreen.U;
                        return (h) ((did.k) shopsItemsBidScreen.S.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(this.R.p().d), null, new xid.b(this, null), 3);
        a.g2(this, e3(), null, new x64.b(this, null, 25), 3);
        a.g2(this, f3(), null, new g(this, null, 19), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getS() {
        return v.k(new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new RoomPreviewCardDelegate(), new CellDetailsDelegate(), this.R, new PlainTextDelegate(), new FullScreenStateDelegate());
    }
}
