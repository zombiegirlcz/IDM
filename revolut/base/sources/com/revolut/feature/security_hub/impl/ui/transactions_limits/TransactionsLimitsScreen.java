package com.revolut.feature.security_hub.impl.ui.transactions_limits;

import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LimitProgressBarWithTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.feature.security_hub.impl.R$layout;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import fwc.d;
import fwc.f;
import fwc.h;
import fwc.q;
import fwc.r;
import fwc.s;
import in0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r60.b;
import te0.w;
import tki.c;
import vtc.c0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfwc/q;", "Ltki/c;", "Lfwc/s;", "Lin0/g;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsLimitsScreen extends ViewController<q> implements c, g {
    public final TransactionsLimitsScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final ListSubheaderDelegate N;
    public final LimitProgressBarWithTextDelegate O;
    public final List P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TransactionsLimitsScreen(TransactionsLimitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transactions_limits;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.N = listSubheaderDelegate;
        LimitProgressBarWithTextDelegate limitProgressBarWithTextDelegate = new LimitProgressBarWithTextDelegate();
        this.O = limitProgressBarWithTextDelegate;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.P = v.k(rowDelegate, limitProgressBarWithTextDelegate, listSubheaderDelegate, new FullScreenStateDelegate(), new RowLoadingDelegate());
        this.Q = w.y0(new Function0(this) { // from class: fwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsScreen f138602b;

            {
                this.f138602b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TransactionsLimitsScreen transactionsLimitsScreen = this.f138602b;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsLimitsScreen.m2()).a().get(vtc.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vtc.t.class, " is not found"));
                        }
                        vtc.t tVar = ((vtc.t) aVar2.b()).M;
                        TransactionsLimitsScreenContract$InputData transactionsLimitsScreenContract$InputData = transactionsLimitsScreen.K;
                        transactionsLimitsScreenContract$InputData.getClass();
                        return new c0(tVar, transactionsLimitsScreen, transactionsLimitsScreenContract$InputData);
                    case 1:
                        return (r) ((c0) this.f138602b.Q.getValue()).f291961g.get();
                    default:
                        int i5 = R$id.transactionsLimitsScreen_recyclerView;
                        TransactionsLimitsScreen transactionsLimitsScreen2 = this.f138602b;
                        return tki.g.a(transactionsLimitsScreen2, transactionsLimitsScreen2.d(), transactionsLimitsScreen2.P, i5, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new Function0(this) { // from class: fwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsScreen f138602b;

            {
                this.f138602b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TransactionsLimitsScreen transactionsLimitsScreen = this.f138602b;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsLimitsScreen.m2()).a().get(vtc.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vtc.t.class, " is not found"));
                        }
                        vtc.t tVar = ((vtc.t) aVar2.b()).M;
                        TransactionsLimitsScreenContract$InputData transactionsLimitsScreenContract$InputData = transactionsLimitsScreen.K;
                        transactionsLimitsScreenContract$InputData.getClass();
                        return new c0(tVar, transactionsLimitsScreen, transactionsLimitsScreenContract$InputData);
                    case 1:
                        return (r) ((c0) this.f138602b.Q.getValue()).f291961g.get();
                    default:
                        int i5 = R$id.transactionsLimitsScreen_recyclerView;
                        TransactionsLimitsScreen transactionsLimitsScreen2 = this.f138602b;
                        return tki.g.a(transactionsLimitsScreen2, transactionsLimitsScreen2.d(), transactionsLimitsScreen2.P, i5, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new Function0(this) { // from class: fwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsScreen f138602b;

            {
                this.f138602b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TransactionsLimitsScreen transactionsLimitsScreen = this.f138602b;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsLimitsScreen.m2()).a().get(vtc.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vtc.t.class, " is not found"));
                        }
                        vtc.t tVar = ((vtc.t) aVar2.b()).M;
                        TransactionsLimitsScreenContract$InputData transactionsLimitsScreenContract$InputData = transactionsLimitsScreen.K;
                        transactionsLimitsScreenContract$InputData.getClass();
                        return new c0(tVar, transactionsLimitsScreen, transactionsLimitsScreenContract$InputData);
                    case 1:
                        return (r) ((c0) this.f138602b.Q.getValue()).f291961g.get();
                    default:
                        int i5 = R$id.transactionsLimitsScreen_recyclerView;
                        TransactionsLimitsScreen transactionsLimitsScreen2 = this.f138602b;
                        return tki.g.a(transactionsLimitsScreen2, transactionsLimitsScreen2.d(), transactionsLimitsScreen2.P, i5, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((s) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new fwc.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53224q), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f), new fwc.g(this, null), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(this.O.e.f121375b), 11), new ft.d(this, null, 8), 3);
        ViewController.P2(this, rd0.e.b(((r60.d) ((b) ((c0) this.Q.getValue()).e.get())).d.d()), new h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
