package com.revolut.feature.card_screen.impl.nameless_card;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.card_screen.api.navigation.descriptors.NamelessCardDialogDescriptor$InputData;
import com.revolut.feature.card_screen.impl.nameless_card.NamelessCardDialogScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o73.h;
import q2e.i0;
import q83.b;
import q83.c;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/impl/nameless_card/NamelessCardDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lq83/b;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NamelessCardDialogScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int V = 0;
    public final NamelessCardDialogDescriptor$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public NamelessCardDialogScreen(NamelessCardDialogDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = w.y0(new q50.w(11));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: q83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NamelessCardDialogScreen f242965b;

            {
                this.f242965b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NamelessCardDialogScreen namelessCardDialogScreen = this.f242965b;
                switch (i2) {
                    case 0:
                        int i3 = NamelessCardDialogScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(namelessCardDialogScreen.m2()).a().get(l73.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l73.a.class, " is not found"));
                        }
                        o73.e eVar = ((o73.e) aVar2.b()).L;
                        NamelessCardDialogDescriptor$InputData namelessCardDialogDescriptor$InputData = namelessCardDialogScreen.Q;
                        namelessCardDialogDescriptor$InputData.getClass();
                        return new h(eVar, namelessCardDialogDescriptor$InputData);
                    case 1:
                        int i5 = NamelessCardDialogScreen.V;
                        return (c) ((h) namelessCardDialogScreen.S.getValue()).f222694c.get();
                    default:
                        int i6 = NamelessCardDialogScreen.V;
                        return v.k((RowDelegate) namelessCardDialogScreen.R.getValue(), new RowLoadingDelegate());
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: q83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NamelessCardDialogScreen f242965b;

            {
                this.f242965b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NamelessCardDialogScreen namelessCardDialogScreen = this.f242965b;
                switch (i22) {
                    case 0:
                        int i3 = NamelessCardDialogScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(namelessCardDialogScreen.m2()).a().get(l73.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l73.a.class, " is not found"));
                        }
                        o73.e eVar = ((o73.e) aVar2.b()).L;
                        NamelessCardDialogDescriptor$InputData namelessCardDialogDescriptor$InputData = namelessCardDialogScreen.Q;
                        namelessCardDialogDescriptor$InputData.getClass();
                        return new h(eVar, namelessCardDialogDescriptor$InputData);
                    case 1:
                        int i5 = NamelessCardDialogScreen.V;
                        return (c) ((h) namelessCardDialogScreen.S.getValue()).f222694c.get();
                    default:
                        int i6 = NamelessCardDialogScreen.V;
                        return v.k((RowDelegate) namelessCardDialogScreen.R.getValue(), new RowLoadingDelegate());
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: q83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NamelessCardDialogScreen f242965b;

            {
                this.f242965b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NamelessCardDialogScreen namelessCardDialogScreen = this.f242965b;
                switch (i22) {
                    case 0:
                        int i32 = NamelessCardDialogScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(namelessCardDialogScreen.m2()).a().get(l73.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l73.a.class, " is not found"));
                        }
                        o73.e eVar = ((o73.e) aVar2.b()).L;
                        NamelessCardDialogDescriptor$InputData namelessCardDialogDescriptor$InputData = namelessCardDialogScreen.Q;
                        namelessCardDialogDescriptor$InputData.getClass();
                        return new h(eVar, namelessCardDialogDescriptor$InputData);
                    case 1:
                        int i5 = NamelessCardDialogScreen.V;
                        return (c) ((h) namelessCardDialogScreen.S.getValue()).f222694c.get();
                    default:
                        int i6 = NamelessCardDialogScreen.V;
                        return v.k((RowDelegate) namelessCardDialogScreen.R.getValue(), new RowLoadingDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.R.getValue()).f53226s), new i0(this, (Continuation) null, 16), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getT() {
        return (List) this.U.getValue();
    }
}
