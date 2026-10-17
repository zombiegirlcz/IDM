package com.revolut.feature.retail.cfd.impl.screens.whatarecfds;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cfd.impl.screens.whatarecfds.WhatAreCfdsController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.n;
import m2b.v;
import m2b.y;
import pki.b;
import s4b.c;
import s4b.d;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/whatarecfds/WhatAreCfdsController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ls4b/d;", "<init>", "()V", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WhatAreCfdsController extends BaseBottomSheetRecyclerController<q, d> {
    public static final /* synthetic */ int U = 0;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final List S;
    public final Object T;

    public WhatAreCfdsController() {
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: s4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WhatAreCfdsController f259804b;

            {
                this.f259804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WhatAreCfdsController whatAreCfdsController = this.f259804b;
                switch (i2) {
                    case 0:
                        int i3 = WhatAreCfdsController.U;
                        return (c) ((y) whatAreCfdsController.T.getValue()).f201949a.get();
                    default:
                        int i5 = WhatAreCfdsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(whatAreCfdsController.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).C;
                        y yVar = new y();
                        yVar.f201949a = e4m.b.b(new n(vVar, 24));
                        return yVar;
                }
            }
        });
        this.S = u.c(fullScreenStateDelegate);
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: s4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WhatAreCfdsController f259804b;

            {
                this.f259804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WhatAreCfdsController whatAreCfdsController = this.f259804b;
                switch (i22) {
                    case 0:
                        int i3 = WhatAreCfdsController.U;
                        return (c) ((y) whatAreCfdsController.T.getValue()).f201949a.get();
                    default:
                        int i5 = WhatAreCfdsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(whatAreCfdsController.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).C;
                        y yVar = new y();
                        yVar.f201949a = e4m.b.b(new n(vVar, 24));
                        return yVar;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b e3() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new s1k.b(this, null, 5), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new s4b.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
