package com.revolut.feature.direct_deposit.impl.ui_kompot.screen.account;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.direct_deposit.impl.R$string;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.account.DirectDepositAccountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import f96.b;
import f96.c;
import f96.d;
import f96.f;
import f96.g;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/ui_kompot/screen/account/DirectDepositAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lf96/b;", "Ldli/a;", "Lf96/d;", "<init>", "()V", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDepositAccountScreen extends ViewController<b> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DirectDepositAccountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object O;
    public final Object P;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final Object L = w.y0(new f2i.b(20));
    public final Object M = w.y0(new f2i.b(21));
    public final Object N = w.y0(new f2i.b(22));
    public final h R = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public DirectDepositAccountScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: f96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositAccountScreen f132840b;

            {
                this.f132840b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DirectDepositAccountScreen directDepositAccountScreen = this.f132840b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositAccountScreen.S;
                        DirectDepositAccountScreen directDepositAccountScreen2 = this.f132840b;
                        return dli.f.a(directDepositAccountScreen2, (c) directDepositAccountScreen2.Q.getValue(), v.k((PlainTextWarningDelegate) directDepositAccountScreen2.L.getValue(), (ListSubheaderDelegate) directDepositAccountScreen2.M.getValue(), (CellDetailsAccountDelegate) directDepositAccountScreen2.N.getValue(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositAccountScreen.S;
                        qji.b bVarU2 = directDepositAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.account.di.DirectDepositAccountScreenInjector");
                        a96.c cVar = ((a96.d) bVarU2).f2344a;
                        a96.a aVar = new a96.a();
                        aVar.f2337a = e4m.b.b(new a0b.c(cVar, 13));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr3 = DirectDepositAccountScreen.S;
                        return (c) ((a96.a) directDepositAccountScreen.P.getValue()).f2337a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: f96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositAccountScreen f132840b;

            {
                this.f132840b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DirectDepositAccountScreen directDepositAccountScreen = this.f132840b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositAccountScreen.S;
                        DirectDepositAccountScreen directDepositAccountScreen2 = this.f132840b;
                        return dli.f.a(directDepositAccountScreen2, (c) directDepositAccountScreen2.Q.getValue(), v.k((PlainTextWarningDelegate) directDepositAccountScreen2.L.getValue(), (ListSubheaderDelegate) directDepositAccountScreen2.M.getValue(), (CellDetailsAccountDelegate) directDepositAccountScreen2.N.getValue(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositAccountScreen.S;
                        qji.b bVarU2 = directDepositAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.account.di.DirectDepositAccountScreenInjector");
                        a96.c cVar = ((a96.d) bVarU2).f2344a;
                        a96.a aVar = new a96.a();
                        aVar.f2337a = e4m.b.b(new a0b.c(cVar, 13));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr3 = DirectDepositAccountScreen.S;
                        return (c) ((a96.a) directDepositAccountScreen.P.getValue()).f2337a.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: f96.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDepositAccountScreen f132840b;

            {
                this.f132840b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DirectDepositAccountScreen directDepositAccountScreen = this.f132840b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDepositAccountScreen.S;
                        DirectDepositAccountScreen directDepositAccountScreen2 = this.f132840b;
                        return dli.f.a(directDepositAccountScreen2, (c) directDepositAccountScreen2.Q.getValue(), v.k((PlainTextWarningDelegate) directDepositAccountScreen2.L.getValue(), (ListSubheaderDelegate) directDepositAccountScreen2.M.getValue(), (CellDetailsAccountDelegate) directDepositAccountScreen2.N.getValue(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDepositAccountScreen.S;
                        qji.b bVarU2 = directDepositAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.direct_deposit.impl.ui_kompot.screen.account.di.DirectDepositAccountScreenInjector");
                        a96.c cVar = ((a96.d) bVarU2).f2344a;
                        a96.a aVar = new a96.a();
                        aVar.f2337a = e4m.b.b(new a0b.c(cVar, 13));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr3 = DirectDepositAccountScreen.S;
                        return (c) ((a96.a) directDepositAccountScreen.P.getValue()).f2337a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a96.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.direct_deposit_setup_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((PlainTextWarningDelegate) this.L.getValue()).t()), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsAccountDelegate) this.N.getValue()).d), new f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.M.getValue()).f52707c), new g(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
