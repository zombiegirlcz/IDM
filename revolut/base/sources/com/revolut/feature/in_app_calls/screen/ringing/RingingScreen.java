package com.revolut.feature.in_app_calls.screen.ringing;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import at.r;
import ce7.c;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.feature.in_app_calls.R$id;
import com.revolut.feature.in_app_calls.R$layout;
import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import com.revolut.feature.in_app_calls.screen.ringing.RingingScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import ee7.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import me7.f;
import me7.g;
import me7.k;
import n30.x;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/in_app_calls/screen/ringing/RingingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lme7/f;", "Ldli/a;", "Lme7/g;", "<init>", "()V", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RingingScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(RingingScreen.class, "binding", "getBinding()Lcom/revolut/feature/in_app_calls/databinding/LayoutCallRingingBinding;", 0))};
    public final int K = R$layout.layout_call_ringing;
    public final int L = R$style.UiKitTheme_TransparentNight;
    public final h M = s.t(this, a.f);
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/in_app_calls/databinding/LayoutCallRingingBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.background;
            AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
            if (animatedBackgroundView != null) {
                i = R$id.btnAcceptCall;
                TextView textView = (TextView) ViewBindings.findChildViewById(p0, i);
                if (textView != null) {
                    i = R$id.btnDeclineCall;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(p0, i);
                    if (textView2 != null) {
                        i = R$id.recyclerView;
                        if (((AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                            i = R$id.ringingSubtitle;
                            if (((TextView) ViewBindings.findChildViewById(p0, i)) != null) {
                                i = R$id.ringingTitle;
                                if (((TextView) ViewBindings.findChildViewById(p0, i)) != null) {
                                    return new c((ControllerContainerConstraintLayout) p0, animatedBackgroundView, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RingingScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: me7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RingingScreen f204617b;

            {
                this.f204617b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RingingScreen ringingScreen = this.f204617b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RingingScreen.Q;
                        qji.b bVarU2 = ringingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.in_app_calls.screen.ringing.di.RingingScreenInjector");
                        return new ee7.d(((ee7.b) bVarU2).f125123b);
                    case 1:
                        KProperty[] kPropertyArr2 = RingingScreen.Q;
                        ee7.a aVar = ((ee7.d) ringingScreen.N.getValue()).f125126a;
                        be7.h hVar = (be7.h) aVar.k.get();
                        be7.k kVar = (be7.k) aVar.f125115h.get();
                        x xVarB = aVar.e.b();
                        s.j(xVarB);
                        return new k(hVar, kVar, xVarB, new r(new je7.b()));
                    default:
                        KProperty[] kPropertyArr3 = RingingScreen.Q;
                        RingingScreen ringingScreen2 = this.f204617b;
                        return dli.f.a(ringingScreen2, (k) ringingScreen2.O.getValue(), f0.f322471a, 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: me7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RingingScreen f204617b;

            {
                this.f204617b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RingingScreen ringingScreen = this.f204617b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RingingScreen.Q;
                        qji.b bVarU2 = ringingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.in_app_calls.screen.ringing.di.RingingScreenInjector");
                        return new ee7.d(((ee7.b) bVarU2).f125123b);
                    case 1:
                        KProperty[] kPropertyArr2 = RingingScreen.Q;
                        ee7.a aVar = ((ee7.d) ringingScreen.N.getValue()).f125126a;
                        be7.h hVar = (be7.h) aVar.k.get();
                        be7.k kVar = (be7.k) aVar.f125115h.get();
                        x xVarB = aVar.e.b();
                        s.j(xVarB);
                        return new k(hVar, kVar, xVarB, new r(new je7.b()));
                    default:
                        KProperty[] kPropertyArr3 = RingingScreen.Q;
                        RingingScreen ringingScreen2 = this.f204617b;
                        return dli.f.a(ringingScreen2, (k) ringingScreen2.O.getValue(), f0.f322471a, 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: me7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RingingScreen f204617b;

            {
                this.f204617b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RingingScreen ringingScreen = this.f204617b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RingingScreen.Q;
                        qji.b bVarU2 = ringingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.in_app_calls.screen.ringing.di.RingingScreenInjector");
                        return new ee7.d(((ee7.b) bVarU2).f125123b);
                    case 1:
                        KProperty[] kPropertyArr2 = RingingScreen.Q;
                        ee7.a aVar = ((ee7.d) ringingScreen.N.getValue()).f125126a;
                        be7.h hVar = (be7.h) aVar.k.get();
                        be7.k kVar = (be7.k) aVar.f125115h.get();
                        x xVarB = aVar.e.b();
                        s.j(xVarB);
                        return new k(hVar, kVar, xVarB, new r(new je7.b()));
                    default:
                        KProperty[] kPropertyArr3 = RingingScreen.Q;
                        RingingScreen ringingScreen2 = this.f204617b;
                        return dli.f.a(ringingScreen2, (k) ringingScreen2.O.getValue(), f0.f322471a, 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f23404b.setBackgroundType(uiState.f204624b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        final int i = 0;
        d3().f23405c.setOnClickListener(new View.OnClickListener(this) { // from class: me7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RingingScreen f204619b;

            {
                this.f204619b = this;
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                RingingScreen ringingScreen = this.f204619b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RingingScreen.Q;
                        ((k) ringingScreen.O.getValue()).C2(d.f204621a);
                        break;
                    default:
                        KProperty[] kPropertyArr2 = RingingScreen.Q;
                        k kVar = (k) ringingScreen.O.getValue();
                        com.revolut.feature.in_app_calls.a aVar = (com.revolut.feature.in_app_calls.a) kVar.o;
                        aVar.getClass();
                        CallNotificationService.Companion companion = CallNotificationService.INSTANCE;
                        Context context = aVar.f74790a.getContext();
                        companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intent intent = new Intent(context, (Class<?>) CallNotificationService.class);
                        intent.putExtra("EXTRA_INVITE", (Parcelable) null);
                        Intent action = intent.setAction("com.revolut.feature.in_app_calls.DECLINE_CALL");
                        Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
                        context.startService(action);
                        kVar.C2(e.f204622a);
                        break;
                }
            }
        });
        final int i2 = 1;
        d3().d.setOnClickListener(new View.OnClickListener(this) { // from class: me7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RingingScreen f204619b;

            {
                this.f204619b = this;
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                RingingScreen ringingScreen = this.f204619b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RingingScreen.Q;
                        ((k) ringingScreen.O.getValue()).C2(d.f204621a);
                        break;
                    default:
                        KProperty[] kPropertyArr2 = RingingScreen.Q;
                        k kVar = (k) ringingScreen.O.getValue();
                        com.revolut.feature.in_app_calls.a aVar = (com.revolut.feature.in_app_calls.a) kVar.o;
                        aVar.getClass();
                        CallNotificationService.Companion companion = CallNotificationService.INSTANCE;
                        Context context = aVar.f74790a.getContext();
                        companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intent intent = new Intent(context, (Class<?>) CallNotificationService.class);
                        intent.putExtra("EXTRA_INVITE", (Parcelable) null);
                        Intent action = intent.setAction("com.revolut.feature.in_app_calls.DECLINE_CALL");
                        Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
                        context.startService(action);
                        kVar.C2(e.f204622a);
                        break;
                }
            }
        });
    }

    public final c d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
