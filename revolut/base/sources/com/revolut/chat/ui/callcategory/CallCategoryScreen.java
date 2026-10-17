package com.revolut.chat.ui.callcategory;

import android.view.View;
import com.revolut.chat.ui.callcategory.CallCategoryScreen;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import h30.k;
import h30.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m40.c;
import m40.d;
import m40.e;
import m40.h;
import pki.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/chat/ui/callcategory/CallCategoryScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lm40/e;", "Lm40/d;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallCategoryScreen extends BaseBottomSheetRecyclerController<e, d> {
    public static final /* synthetic */ int V = 0;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public CallCategoryScreen() {
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(fullScreenStateDelegate, new ListSubheaderDelegate(), rowDelegate, new RowLoadingDelegate());
        this.T = w.y0(new Function0(this) { // from class: m40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CallCategoryScreen f202615b;

            {
                this.f202615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CallCategoryScreen callCategoryScreen = this.f202615b;
                switch (i3) {
                    case 0:
                        int i5 = CallCategoryScreen.V;
                        qji.b bVarR1 = callCategoryScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.chat.ui.callcategory.di.CallCategoryScreenComponentInjector");
                        a61.a aVarY = ((d50.a) bVarR1).y();
                        aVarY.f1532c = callCategoryScreen;
                        return (k) aVarY.mo3783build();
                    default:
                        int i6 = CallCategoryScreen.V;
                        n nVar = ((k) callCategoryScreen.T.getValue()).f148901a;
                        f01.a aVarG = nVar.f148906b.g();
                        s.j(aVarG);
                        return new h(new g(aVarG), nVar.g());
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: m40.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CallCategoryScreen f202615b;

            {
                this.f202615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CallCategoryScreen callCategoryScreen = this.f202615b;
                switch (i3) {
                    case 0:
                        int i5 = CallCategoryScreen.V;
                        qji.b bVarR1 = callCategoryScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.chat.ui.callcategory.di.CallCategoryScreenComponentInjector");
                        a61.a aVarY = ((d50.a) bVarR1).y();
                        aVarY.f1532c = callCategoryScreen;
                        return (k) aVarY.mo3783build();
                    default:
                        int i6 = CallCategoryScreen.V;
                        n nVar = ((k) callCategoryScreen.T.getValue()).f148901a;
                        f01.a aVarG = nVar.f148906b.g();
                        s.j(aVarG);
                        return new h(new g(aVarG), nVar.g());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b k3() {
        return (h) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(this.R.f53218h), null, new m40.b(this, null), 3);
        a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
