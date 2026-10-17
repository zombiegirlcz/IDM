package com.revolut.feature.revolutpay.impl.ui.shops.what_is;

import aii.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.revolutpay.impl.R$id;
import com.revolut.feature.revolutpay.impl.R$layout;
import com.revolut.feature.revolutpay.impl.ui.shops.what_is.WhatIsRevolutPayScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.h;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n9c.c;
import n9c.d;
import p7c.s0;
import p7c.t0;
import rd0.e;
import sji.b;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/shops/what_is/WhatIsRevolutPayScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ln9c/c;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WhatIsRevolutPayScreen extends BaseRecyclerViewScreen<c, IOData$EmptyInput, q> {
    public final int U;
    public final int V;
    public final Object W;
    public final Object X;
    public final LargeActionButtonDelegate Y;
    public final List Z;

    public WhatIsRevolutPayScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_what_is_revolut_pay;
        this.V = R$id.whatIsRevolutPay_recyclerView;
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: n9c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WhatIsRevolutPayScreen f213631b;

            {
                this.f213631b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f213631b.m2()).a().get(s0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s0.class, " is not found"));
                        }
                        s0 s0Var = ((s0) aVar2.b()).e;
                        t0 t0Var = new t0();
                        int i2 = 14;
                        t0Var.f233710a = e4m.b.b(new p12.s0(t0Var, 1, i2));
                        t0Var.f233711b = e4m.b.b(new p12.s0(t0Var, 0, i2));
                        return t0Var;
                    default:
                        return (d) ((t0) this.f213631b.W.getValue()).f233711b.get();
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: n9c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WhatIsRevolutPayScreen f213631b;

            {
                this.f213631b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f213631b.m2()).a().get(s0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s0.class, " is not found"));
                        }
                        s0 s0Var = ((s0) aVar2.b()).e;
                        t0 t0Var = new t0();
                        int i22 = 14;
                        t0Var.f233710a = e4m.b.b(new p12.s0(t0Var, 1, i22));
                        t0Var.f233711b = e4m.b.b(new p12.s0(t0Var, 0, i22));
                        return t0Var;
                    default:
                        return (d) ((t0) this.f213631b.W.getValue()).f233711b.get();
                }
            }
        });
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Y = largeActionButtonDelegate;
        this.Z = v.k(largeActionButtonDelegate, new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new TextDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (t0) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (d) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(c uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        a.g2(this, e.b(this.Y.d.f121375b), null, new n9c.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }
}
