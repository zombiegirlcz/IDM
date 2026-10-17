package com.revolut.feature.shops.impl.ui.bid_custom_input;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputContract$InputData;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t70.x;
import u7k.w;
import uf0.d;
import uid.a;
import uid.c;
import uid.f;
import vkm.z1;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/bid_custom_input/BidCustomInputScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Luid/c;", "Luid/a;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BidCustomInputScreen extends BaseBottomSheetRecyclerController<c, a> {
    public static final /* synthetic */ int X = 0;
    public final BidCustomInputContract$InputData Q;
    public final z1 R;
    public final SuggestionsBarDelegate S;
    public final w T;
    public final Object U;
    public final Object V;
    public final Object W;

    public BidCustomInputScreen(BidCustomInputContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = ta6.a.a(0);
        this.S = new SuggestionsBarDelegate();
        this.T = new w(this, 23);
        final int i = 0;
        this.U = te0.w.y0(new Function0(this) { // from class: uid.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BidCustomInputScreen f280383b;

            {
                this.f280383b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BidCustomInputScreen bidCustomInputScreen = this.f280383b;
                switch (i2) {
                    case 0:
                        return new CenteredAmountDelegate(bidCustomInputScreen.T);
                    case 1:
                        int i3 = BidCustomInputScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(bidCustomInputScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        BidCustomInputContract$InputData bidCustomInputContract$InputData = bidCustomInputScreen.Q;
                        bidCustomInputContract$InputData.getClass();
                        return new did.a(dVar, bidCustomInputContract$InputData);
                    default:
                        int i5 = BidCustomInputScreen.X;
                        return (d) ((did.a) bidCustomInputScreen.V.getValue()).f114968b.get();
                }
            }
        });
        final int i2 = 1;
        this.V = te0.w.y0(new Function0(this) { // from class: uid.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BidCustomInputScreen f280383b;

            {
                this.f280383b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BidCustomInputScreen bidCustomInputScreen = this.f280383b;
                switch (i22) {
                    case 0:
                        return new CenteredAmountDelegate(bidCustomInputScreen.T);
                    case 1:
                        int i3 = BidCustomInputScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(bidCustomInputScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        BidCustomInputContract$InputData bidCustomInputContract$InputData = bidCustomInputScreen.Q;
                        bidCustomInputContract$InputData.getClass();
                        return new did.a(dVar, bidCustomInputContract$InputData);
                    default:
                        int i5 = BidCustomInputScreen.X;
                        return (d) ((did.a) bidCustomInputScreen.V.getValue()).f114968b.get();
                }
            }
        });
        final int i3 = 2;
        this.W = te0.w.y0(new Function0(this) { // from class: uid.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BidCustomInputScreen f280383b;

            {
                this.f280383b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BidCustomInputScreen bidCustomInputScreen = this.f280383b;
                switch (i22) {
                    case 0:
                        return new CenteredAmountDelegate(bidCustomInputScreen.T);
                    case 1:
                        int i32 = BidCustomInputScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(bidCustomInputScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        BidCustomInputContract$InputData bidCustomInputContract$InputData = bidCustomInputScreen.Q;
                        bidCustomInputContract$InputData.getClass();
                        return new did.a(dVar, bidCustomInputContract$InputData);
                    default:
                        int i5 = BidCustomInputScreen.X;
                        return (d) ((did.a) bidCustomInputScreen.V.getValue()).f114968b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (did.a) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        kli.c.c(D2(), true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, this.R, null, new d(this, continuation, 5), 3);
        r rVarMergeWith = this.S.p().d.mergeWith(r.empty());
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeWith), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new d(view, this, continuation, 6), 3);
        view.postOnAnimation(new x(this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getV() {
        return v.k((CenteredAmountDelegate) this.U.getValue(), new CellDetailsDelegate(), this.S);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final uid.d R2() {
        return (uid.d) this.W.getValue();
    }
}
