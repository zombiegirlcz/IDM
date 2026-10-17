package com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.feature.security_hub.impl.R$layout;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dv9.r;
import dwc.b;
import dwc.c;
import dwc.d;
import dwc.f;
import dwc.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vtc.t;
import vtc.z;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldwc/f;", "Ldli/a;", "Ldwc/h;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsDayNightLimitsScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransactionsDayNightLimitsScreen.class, "binding", "getBinding()Lcom/revolut/feature/security_hub/impl/databinding/ScreenTransactionsDayNightLimitsBinding;", 0))};
    public final TransactionsDayNightLimitsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TransactionsDayNightLimitsScreen(TransactionsDayNightLimitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transactions_day_night_limits;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsDayNightLimitsScreen f120355b;

            {
                this.f120355b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen = this.f120355b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsDayNightLimitsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsDayNightLimitsScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        TransactionsDayNightLimitsScreenContract$InputData transactionsDayNightLimitsScreenContract$InputData = transactionsDayNightLimitsScreen.K;
                        transactionsDayNightLimitsScreenContract$InputData.getClass();
                        return new z(tVar, transactionsDayNightLimitsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsDayNightLimitsScreen.S;
                        return (g) ((z) transactionsDayNightLimitsScreen.N.getValue()).f292099c.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionsDayNightLimitsScreen.S;
                        int i3 = R$id.transactionsDayNightLimitsScreen_recyclerView;
                        TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen2 = this.f120355b;
                        return dli.f.a(transactionsDayNightLimitsScreen2, (g) transactionsDayNightLimitsScreen2.O.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) transactionsDayNightLimitsScreen2.P.getValue(), new FullScreenStateDelegate(), (ListSubheaderDelegate) transactionsDayNightLimitsScreen2.Q.getValue()), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: dwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsDayNightLimitsScreen f120355b;

            {
                this.f120355b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen = this.f120355b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsDayNightLimitsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsDayNightLimitsScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        TransactionsDayNightLimitsScreenContract$InputData transactionsDayNightLimitsScreenContract$InputData = transactionsDayNightLimitsScreen.K;
                        transactionsDayNightLimitsScreenContract$InputData.getClass();
                        return new z(tVar, transactionsDayNightLimitsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsDayNightLimitsScreen.S;
                        return (g) ((z) transactionsDayNightLimitsScreen.N.getValue()).f292099c.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionsDayNightLimitsScreen.S;
                        int i3 = R$id.transactionsDayNightLimitsScreen_recyclerView;
                        TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen2 = this.f120355b;
                        return dli.f.a(transactionsDayNightLimitsScreen2, (g) transactionsDayNightLimitsScreen2.O.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) transactionsDayNightLimitsScreen2.P.getValue(), new FullScreenStateDelegate(), (ListSubheaderDelegate) transactionsDayNightLimitsScreen2.Q.getValue()), i3, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new r(1));
        final int i3 = 2;
        this.Q = w.y0(new r(2));
        this.R = w.y0(new Function0(this) { // from class: dwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsDayNightLimitsScreen f120355b;

            {
                this.f120355b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen = this.f120355b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsDayNightLimitsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(transactionsDayNightLimitsScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        TransactionsDayNightLimitsScreenContract$InputData transactionsDayNightLimitsScreenContract$InputData = transactionsDayNightLimitsScreen.K;
                        transactionsDayNightLimitsScreenContract$InputData.getClass();
                        return new z(tVar, transactionsDayNightLimitsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsDayNightLimitsScreen.S;
                        return (g) ((z) transactionsDayNightLimitsScreen.N.getValue()).f292099c.get();
                    default:
                        KProperty[] kPropertyArr3 = TransactionsDayNightLimitsScreen.S;
                        int i32 = R$id.transactionsDayNightLimitsScreen_recyclerView;
                        TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen2 = this.f120355b;
                        return dli.f.a(transactionsDayNightLimitsScreen2, (g) transactionsDayNightLimitsScreen2.O.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) transactionsDayNightLimitsScreen2.P.getValue(), new FullScreenStateDelegate(), (ListSubheaderDelegate) transactionsDayNightLimitsScreen2.Q.getValue()), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((dwc.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((utc.f) value).f283089b.setTag(this.K.f85720a.name());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.Q.getValue()).d), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
