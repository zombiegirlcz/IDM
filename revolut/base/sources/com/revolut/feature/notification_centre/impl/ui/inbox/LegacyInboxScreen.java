package com.revolut.feature.notification_centre.impl.ui.inbox;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.notification_centre.impl.ui.inbox.LegacyInboxScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.notification_centre.R$id;
import com.revolut.notification_centre.R$layout;
import com.revolut.notification_centre.R$string;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import e79.b;
import grl.k9;
import hwi.l0;
import i4g.g;
import i79.i;
import ihm.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/notification_centre/impl/ui/inbox/LegacyInboxScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li79/i;", "Lno/m;", "<init>", "()V", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LegacyInboxScreen extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(LegacyInboxScreen.class, "binding", "getBinding()Lcom/revolut/notification_centre/databinding/ScreenLegacyInboxBinding;", 0))};
    public final AnalyticsProduct.Retail K;
    public final h L;
    public final NotificationCentreItemDelegate M;
    public final SwipeToActionDelegate N;
    public final no0.a O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final f S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, rmi.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/notification_centre/databinding/ScreenLegacyInboxBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
            int i = R$id.legacyInboxScreen_navBar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
            if (basicNavBar != null) {
                i = R$id.legacyInboxScreen_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new rmi.a(basicNavBar, controllerContainerConstraintLayout, screenContentRecyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public LegacyInboxScreen() {
        k9 k9Var = k9.CRM;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.K = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.L = s.t(this, a.f);
        NotificationCentreItemDelegate notificationCentreItemDelegate = new NotificationCentreItemDelegate();
        this.M = notificationCentreItemDelegate;
        final int i = 0;
        this.N = new SwipeToActionDelegate(notificationCentreItemDelegate, false);
        this.O = new no0.a(null, 15);
        this.P = w.y0(new Function0(this) { // from class: i79.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyInboxScreen f159215b;

            {
                this.f159215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LegacyInboxScreen legacyInboxScreen = this.f159215b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LegacyInboxScreen.T;
                        LegacyInboxScreen legacyInboxScreen2 = this.f159215b;
                        return dli.f.a(legacyInboxScreen2, legacyInboxScreen2.d(), v.k(new ListSubheaderDelegate(), legacyInboxScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.legacyInboxScreen_recyclerView, null, legacyInboxScreen2.O, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = LegacyInboxScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(legacyInboxScreen.m2()).a().get(e79.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new e79.b(((e79.c) aVar2.b()).i);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", e79.c.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = LegacyInboxScreen.T;
                        return (h) ((e79.b) legacyInboxScreen.Q.getValue()).f123111c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: i79.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyInboxScreen f159215b;

            {
                this.f159215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LegacyInboxScreen legacyInboxScreen = this.f159215b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LegacyInboxScreen.T;
                        LegacyInboxScreen legacyInboxScreen2 = this.f159215b;
                        return dli.f.a(legacyInboxScreen2, legacyInboxScreen2.d(), v.k(new ListSubheaderDelegate(), legacyInboxScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.legacyInboxScreen_recyclerView, null, legacyInboxScreen2.O, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = LegacyInboxScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(legacyInboxScreen.m2()).a().get(e79.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new e79.b(((e79.c) aVar2.b()).i);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", e79.c.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = LegacyInboxScreen.T;
                        return (h) ((e79.b) legacyInboxScreen.Q.getValue()).f123111c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: i79.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyInboxScreen f159215b;

            {
                this.f159215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LegacyInboxScreen legacyInboxScreen = this.f159215b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LegacyInboxScreen.T;
                        LegacyInboxScreen legacyInboxScreen2 = this.f159215b;
                        return dli.f.a(legacyInboxScreen2, legacyInboxScreen2.d(), v.k(new ListSubheaderDelegate(), legacyInboxScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.legacyInboxScreen_recyclerView, null, legacyInboxScreen2.O, null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = LegacyInboxScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(legacyInboxScreen.m2()).a().get(e79.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new e79.b(((e79.c) aVar2.b()).i);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", e79.c.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = LegacyInboxScreen.T;
                        return (h) ((e79.b) legacyInboxScreen.Q.getValue()).f123111c.get();
                }
            }
        });
        this.S = v0.a.d("create(...)");
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f255340b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f255340b.setTitle(new TextLocalisedClause(R$string.inbox_screen_title, null, null, 14));
        xv0.w wVar = new xv0.w(new g(1, this.S, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 3), null);
        ScreenContentRecyclerView legacyInboxScreenRecyclerView = d3().f255341c;
        Intrinsics.checkNotNullExpressionValue(legacyInboxScreenRecyclerView, "legacyInboxScreenRecyclerView");
        wVar.b(legacyInboxScreenRecyclerView);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f255340b.f59211b), new l0(this, continuation, 21), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52865c), new i79.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.f), new i79.f(this, null), 3);
        ViewController.P2(this, t1.d(rd0.e.b(this.S), 300L), new i79.e(this, continuation, 1), 3);
    }

    public final rmi.a d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rmi.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i79.h d() {
        return (i79.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return R$layout.screen_legacy_inbox;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
