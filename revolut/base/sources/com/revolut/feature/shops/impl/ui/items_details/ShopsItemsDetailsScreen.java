package com.revolut.feature.shops.impl.ui.items_details;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import aw0.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreen;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import did.l;
import ijd.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;
import te0.w;
import tki.c;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/items_details/ShopsItemsDetailsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Laii/q;", "Ltki/c;", "Lcii/b;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsItemsDetailsScreen extends BaseBottomSheetController<q> implements c {
    public static final /* synthetic */ int S = 0;
    public final ShopsItemsDetailsScreenContract$InputData N;
    public final tw0.a O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ShopsItemsDetailsScreen(ShopsItemsDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = new tw0.a();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ijd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsItemsDetailsScreen f161769b;

            {
                this.f161769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShopsItemsDetailsScreen shopsItemsDetailsScreen = this.f161769b;
                switch (i2) {
                    case 0:
                        int i3 = ShopsItemsDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(shopsItemsDetailsScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsItemsDetailsScreenContract$InputData shopsItemsDetailsScreenContract$InputData = shopsItemsDetailsScreen.N;
                        shopsItemsDetailsScreenContract$InputData.getClass();
                        return new l(dVar, shopsItemsDetailsScreenContract$InputData);
                    case 1:
                        int i5 = ShopsItemsDetailsScreen.S;
                        return (d) ((l) shopsItemsDetailsScreen.P.getValue()).f115038c.get();
                    default:
                        int i6 = ShopsItemsDetailsScreen.S;
                        ShopsItemsDetailsScreen shopsItemsDetailsScreen2 = this.f161769b;
                        return tki.g.a(shopsItemsDetailsScreen2, (d) shopsItemsDetailsScreen2.Q.getValue(), v.k(new RoomPreviewCardDelegate(), new RowDelegate(null, null, 7), new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ijd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsItemsDetailsScreen f161769b;

            {
                this.f161769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShopsItemsDetailsScreen shopsItemsDetailsScreen = this.f161769b;
                switch (i22) {
                    case 0:
                        int i3 = ShopsItemsDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(shopsItemsDetailsScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsItemsDetailsScreenContract$InputData shopsItemsDetailsScreenContract$InputData = shopsItemsDetailsScreen.N;
                        shopsItemsDetailsScreenContract$InputData.getClass();
                        return new l(dVar, shopsItemsDetailsScreenContract$InputData);
                    case 1:
                        int i5 = ShopsItemsDetailsScreen.S;
                        return (d) ((l) shopsItemsDetailsScreen.P.getValue()).f115038c.get();
                    default:
                        int i6 = ShopsItemsDetailsScreen.S;
                        ShopsItemsDetailsScreen shopsItemsDetailsScreen2 = this.f161769b;
                        return tki.g.a(shopsItemsDetailsScreen2, (d) shopsItemsDetailsScreen2.Q.getValue(), v.k(new RoomPreviewCardDelegate(), new RowDelegate(null, null, 7), new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ijd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsItemsDetailsScreen f161769b;

            {
                this.f161769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShopsItemsDetailsScreen shopsItemsDetailsScreen = this.f161769b;
                switch (i22) {
                    case 0:
                        int i32 = ShopsItemsDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(shopsItemsDetailsScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsItemsDetailsScreenContract$InputData shopsItemsDetailsScreenContract$InputData = shopsItemsDetailsScreen.N;
                        shopsItemsDetailsScreenContract$InputData.getClass();
                        return new l(dVar, shopsItemsDetailsScreenContract$InputData);
                    case 1:
                        int i5 = ShopsItemsDetailsScreen.S;
                        return (d) ((l) shopsItemsDetailsScreen.P.getValue()).f115038c.get();
                    default:
                        int i6 = ShopsItemsDetailsScreen.S;
                        ShopsItemsDetailsScreen shopsItemsDetailsScreen2 = this.f161769b;
                        return tki.g.a(shopsItemsDetailsScreen2, (d) shopsItemsDetailsScreen2.Q.getValue(), v.k(new RoomPreviewCardDelegate(), new RowDelegate(null, null, 7), new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        cii.b uiState = (cii.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        m mVar = uiState.f24554b;
        i iVar = uiState.f24555c;
        this.O.b(mVar != null, iVar != null);
        j3(new cii.a(uiState.f24554b, iVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R$id.bottomSheetControllerBase_recyclerView);
        Intrinsics.h(recyclerView);
        recyclerView.setVisibility(0);
        this.O.a(recyclerView);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new ijd.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new ijd.b(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
