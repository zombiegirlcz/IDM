package com.revolut.feature.retail.legacy.login.impl.login;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import aw0.o9;
import aw0.v1;
import az0.r1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.retail.legacy.login.impl.PrefetchLoginDataBeforeAuth;
import com.revolut.feature.retail.legacy.login.impl.R$id;
import com.revolut.feature.retail.legacy.login.impl.R$layout;
import com.revolut.feature.retail.legacy.login.impl.R$string;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragmentContract$Configuration;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.legacy_ui.fragment.BaseFragment;
import com.revolut.tracking.v3.SettingsUnlockContext;
import com.revolut.utils.PinCodeHinter;
import efm.d0;
import eoi.r;
import grl.fc;
import grl.hc;
import hx0.m;
import ix0.h1;
import ix0.n1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import ljl.q1;
import mk0.p;
import no.j2;
import no.k;
import od0.i;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import pfm.t;
import pfm.z;
import pza.g;
import qza.x;
import rl0.b;
import rp0.g1;
import ru0.d;
import skm.a2;
import skm.b0;
import skm.e0;
import skm.h0;
import skm.p0;
import t70.u;
import te0.w;
import tx0.d5;
import tx0.t4;
import tx0.v4;
import ufm.f;
import uxe.l;
import vkm.c2;
import vkm.d2;
import vkm.t1;
import wl0.c;
import wr1.s;
import x.b;
import x94.q;
import xab.a0;
import xab.c0;
import xab.g0;
import xab.i0;
import xab.j0;
import xab.k0;
import xab.l0;
import xab.m0;
import xab.n;
import xab.n0;
import xab.o;
import xab.o0;
import xab.q0;
import xab.v;
import xab.y;
import xab.y0;
import xab.z0;
import yhm.j;
import zhm.f0;
import zl0.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003\n\u000b\fB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/impl/login/LoginFragment;", "Lcom/revolut/retail/legacy_ui/fragment/BaseFragment;", "Lxab/q0;", "Lxab/y0;", "Lno/k;", "Lno/m;", "Lhx0/m;", "<init>", "()V", "Companion", "t70/u", "xab/j", "a", "feature_retail_legacy_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoginFragment extends BaseFragment<q0, y0> implements y0, k, m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public int A0;
    public b B0;
    public n1 C0;
    public NavBarWithContainerBackground D0;
    public final Lazy E0;
    public final Lazy F0;
    public final Lazy G0;
    public final Lazy H0;
    public final Lazy I0;
    public final Lazy J0;
    public final Lazy K0;
    public final Lazy L0;
    public final Lazy M0;
    public final Lazy N0;
    public final Lazy O0;
    public final Lazy P0;
    public final Lazy Q0;
    public final Lazy S0;
    public final Lazy T0;
    public final Lazy U0;
    public final Object V0;
    public final Object W0;
    public final Lazy X0;
    public final Lazy Y0;
    public final Lazy Z0;
    public final Lazy a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final Lazy f82672b1;
    public AnalyticsContext c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final Lazy f82673c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public volatile boolean f82674d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final Lazy f82675d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public volatile boolean f82676e0;
    public e g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final Object f82679g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public a2 f82680h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final Object f82681h1;
    public Boolean i0;
    public WallpaperAssetSwitcher j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ViewGroup f82682k0;
    public ViewGroup l0;
    public PinCodeView m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TwinVerticalButton f82683n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public zm0.b f82684o0;
    public uab.a p0;
    public c q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public cn0.e f82685r0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CoroutineScope f82687t0;
    public CoroutineScope u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public h0 f82688v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public h0 f82689w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public h0 f82690x0;
    public h0 y0;
    public t1 z0;
    public sab.b f0 = sab.b.SIGN_LOGIN;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicBoolean f82686s0 = new AtomicBoolean(false);
    public final TwinHorizontalButtonDelegate R0 = new TwinHorizontalButtonDelegate();

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final Lazy f82677e1 = j.b(new d(27));

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final Lazy f82678f1 = j.b(new d(28));

    /* JADX INFO: renamed from: com.revolut.feature.retail.legacy.login.impl.login.LoginFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static final TextLocalisedClause a(Companion companion, int i) {
            companion.getClass();
            return new TextLocalisedClause(i, f0.f322471a, null);
        }
    }

    public LoginFragment() {
        final int i = 0;
        this.E0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i2 = 11;
        this.F0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i3 = 19;
        this.G0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i5 = 20;
        this.H0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i6 = 21;
        this.I0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i21 = 22;
        this.J0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i22 = 23;
        this.K0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i32 = 24;
        this.L0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i33 = 25;
        this.M0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i33) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i43 = 26;
        this.N0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i43) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i59 = 1;
        this.O0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i59) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i66 = 2;
        this.P0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i66) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i74 = 3;
        this.Q0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i74) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i92 = 4;
        this.S0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i92) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i96 = 5;
        this.T0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i96) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i99 = 6;
        this.U0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i99) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i100 = 7;
        this.V0 = w.y0(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i100) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i101 = 8;
        this.W0 = w.y0(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i101) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i102 = 9;
        this.X0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i102) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i103 = 10;
        this.Y0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i103) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i104 = 12;
        this.Z0 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i104) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i105 = 13;
        this.a1 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i105) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i106 = 14;
        this.f82672b1 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i106) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i107 = 15;
        this.f82673c1 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i107) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i108 = 16;
        this.f82675d1 = j.b(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i108) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i109 = 17;
        this.f82679g1 = w.y0(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i109) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
        final int i110 = 18;
        this.f82681h1 = w.y0(new Function0(this) { // from class: xab.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303823b;

            {
                this.f303823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i110) {
                    case 0:
                        w2l.a aVarI = this.f303823b.I();
                        Intrinsics.i(aVarI, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return (vab.d) aVarI;
                    case 1:
                        return this.f303823b.L().q();
                    case 2:
                        FragmentActivity fragmentActivityRequireActivity = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        return new rp0.d(fragmentActivityRequireActivity);
                    case 3:
                        return this.f303823b.L().c();
                    case 4:
                        return this.f303823b.L().x();
                    case 5:
                        Context contextRequireContext = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        pfb.a aVar = (pfb.a) ue0.e.i(ue0.e.j(contextRequireContext), pfb.a.class);
                        if (aVar != null) {
                            return aVar.a();
                        }
                        return null;
                    case 6:
                        return this.f303823b.L().m();
                    case 7:
                        return (LoginFragmentContract$Configuration) this.f303823b.A();
                    case 8:
                        return this.f303823b.L().G();
                    case 9:
                        return this.f303823b.I().N();
                    case 10:
                        return this.f303823b.L().i();
                    case 11:
                        w2l.a aVarI2 = this.f303823b.I();
                        Intrinsics.i(aVarI2, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.declaration.LoginDependenciesProvider");
                        return ((vab.d) aVarI2).J();
                    case 12:
                        LoginFragment loginFragment = this.f303823b;
                        return loginFragment.L().r().b(loginFragment.D());
                    case 13:
                        return this.f303823b.L().h().b0();
                    case 14:
                        return this.f303823b.L().o();
                    case 15:
                        return this.f303823b.L().d();
                    case 16:
                        Context contextRequireContext2 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        phm.a aVar2 = (phm.a) ue0.e.j(contextRequireContext2).a().get(q1.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return ((ljl.q0) ((q1) aVar3.b())).e();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", q1.class, " is not found"));
                    case 17:
                        LoginFragment loginFragment2 = this.f303823b;
                        wl0.c cVar = loginFragment2.q0;
                        if (cVar == null) {
                            Intrinsics.r("biometricHelper");
                            throw null;
                        }
                        j2 j2Var = (j2) loginFragment2.H0.getValue();
                        cn0.e eVar = loginFragment2.f82685r0;
                        if (eVar != null) {
                            return new w0(cVar, j2Var, eVar, loginFragment2.M(), loginFragment2.I().getProgressView(), loginFragment2.L().c(), loginFragment2.L().r().l(), loginFragment2.L().f(), new a());
                        }
                        Intrinsics.r("primaryAuthCredentialsTypeProvider");
                        throw null;
                    case 18:
                        return Boolean.valueOf(((jte.d) ((gte.a) this.f303823b.N0.getValue())).c(PrefetchLoginDataBeforeAuth.f82671c));
                    case 19:
                        return this.f303823b.D().Z0();
                    case 20:
                        return this.f303823b.L().U();
                    case 21:
                        FragmentActivity fragmentActivityRequireActivity2 = this.f303823b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                        return sri.o.c(fragmentActivityRequireActivity2, null, null, 14);
                    case 22:
                        rp0.x0 x0Var = g1.Companion;
                        View viewRequireView = this.f303823b.requireView();
                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                        return rp0.x0.a(x0Var, viewRequireView);
                    case 23:
                        Context contextRequireContext3 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        phm.a aVar4 = (phm.a) ue0.e.j(contextRequireContext3).a().get(sd0.c.class);
                        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                        if (aVar5 != null) {
                            return ((vd0.e) ((sd0.c) aVar5.b())).b();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
                    case 24:
                        Context contextRequireContext4 = this.f303823b.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                        phm.a aVar6 = (phm.a) ue0.e.j(contextRequireContext4).a().get(emi.a.class);
                        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                        if (aVar7 != null) {
                            return ((emi.a) aVar7.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 25:
                        return this.f303823b.L().g();
                    default:
                        return this.f303823b.L().p();
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(com.revolut.feature.retail.legacy.login.impl.login.LoginFragment r5, gim.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof xab.m
            if (r0 == 0) goto L13
            r0 = r6
            xab.m r0 = (xab.m) r0
            int r1 = r0.f303835w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303835w = r1
            goto L18
        L13:
            xab.m r0 = new xab.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303835w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L79
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L55
        L36:
            yhm.o.b(r6)
            androidx.fragment.app.FragmentActivity r6 = r5.requireActivity()
            boolean r6 = r6.isTaskRoot()
            r2 = 0
            if (r6 == 0) goto L58
            r0.f303835w = r4
            elm.g r6 = skm.p0.f264002b
            xab.n r3 = new xab.n
            r4 = 0
            r3.<init>(r5, r2, r4)
            java.lang.Object r6 = skm.e0.J(r6, r3, r0)
            if (r6 != r1) goto L55
            goto L78
        L55:
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r6 = (com.revolut.core.ui_kit.models.NavBarWithContainerBackground) r6
            goto L7b
        L58:
            com.revolut.feature.retail.legacy.login.impl.login.LoginFragmentContract$Configuration r6 = r5.K()
            android.os.Parcelable r6 = r6.f82695h
            boolean r4 = r6 instanceof com.revolut.core.ui_kit.models.NavBarWithContainerBackground
            if (r4 == 0) goto L65
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r6 = (com.revolut.core.ui_kit.models.NavBarWithContainerBackground) r6
            goto L66
        L65:
            r6 = r2
        L66:
            if (r6 != 0) goto L7b
            r0.f303835w = r3
            elm.g r6 = skm.p0.f264002b
            xab.n r3 = new xab.n
            r4 = 0
            r3.<init>(r5, r2, r4)
            java.lang.Object r6 = skm.e0.J(r6, r3, r0)
            if (r6 != r1) goto L79
        L78:
            return r1
        L79:
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r6 = (com.revolut.core.ui_kit.models.NavBarWithContainerBackground) r6
        L7b:
            r5.G(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.legacy.login.impl.login.LoginFragment.E(com.revolut.feature.retail.legacy.login.impl.login.LoginFragment, gim.c):java.lang.Object");
    }

    public static f Y(d0 d0Var, String name) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        f fVar = new f(d0Var, new x9h.d(11, new wsg.j(name, 22)), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return fVar;
    }

    public static final void z0(LoginFragment loginFragment) {
        int i = xab.k.f303828a[loginFragment.Q().ordinal()];
        if (i == 1) {
            loginFragment.c0(PinCodeView.a.C0445a.f59611a);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            loginFragment.p0();
        }
    }

    public final void B0() {
        int i = this.A0 + 1;
        this.A0 = i;
        if (i == 1) {
            b bVar = new b(this, 3);
            this.B0 = bVar;
            PinCodeView pinCodeView = this.m0;
            if (pinCodeView == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            pinCodeView.postDelayed(bVar, 500L);
            e0m.e.c(getActivity());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C0() {
        pfm.a aVar;
        pfm.a aVar2;
        efm.f fVarV;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        phm.a aVar3 = (phm.a) ue0.e.j(contextRequireContext).a().get(g8b.a.class);
        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
        if (aVar4 == null) {
            throw new IllegalStateException(a0.d.q("Api ", g8b.a.class, " is not found"));
        }
        ifm.b bVarA = ((g8b.a) aVar4.b()).a();
        kza.a aVarO = L().O();
        kka.j jVarV = L().v();
        jte.c cVarT = L().T();
        xoj.a aVarW = L().w();
        fn2.c cVarU = L().u();
        ang.c cVarI = L().I();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        phm.a aVar5 = (phm.a) ue0.e.j(contextRequireContext2).a().get(cri.d.class);
        b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
        if (aVar6 == null) {
            throw new IllegalStateException(a0.d.q("Api ", cri.d.class, " is not found"));
        }
        mri.w wVarA = ((ozl.a) ((cri.d) aVar6.b())).a();
        p pVarR = L().R();
        kotlinx.coroutines.d coroutineContext = p0.f264003c;
        Intrinsics.checkNotNullParameter(pVarR, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        h hVarN = pd.b.n(coroutineContext, new l(pVarR, null, 26));
        dfm.c cVar = mfm.f.f205044g;
        pfm.a aVar7 = new pfm.a(hVarN, cVar, 1);
        w4l.f fVar = ((g) aVarO.f191079a).d;
        Unit unit = Unit.f186387a;
        efm.b bVarIgnoreElements = mo3.a.n(fVar.f(unit, true)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        pfm.a aVar8 = new pfm.a(bVarIgnoreElements.e(new h(new ty7.b(wVarA, 23), 2)), cVar, 1);
        s sVar = new s(jVarV, null, 28);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        pfm.a aVarV = ue0.e.v(pd.b.n(gVar, sVar));
        h hVar = new h(new xab.d(this, 3), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarV2 = ue0.e.v(w.g0(hVar));
        pfm.a aVarV3 = ue0.e.v(((cpj.b) aVarW).i());
        pfm.a aVarV4 = ue0.e.v(pd.b.n(gVar, new s(cVarU, null, 26)));
        pfm.a aVarV5 = ue0.e.v(pd.b.n(gVar, new s(cVarI, null, 27)));
        int i = 6;
        pfm.a aVarV6 = ue0.e.v(pd.b.n(gVar, new n(this, null, i)));
        pfm.a aVarV7 = ue0.e.v(((zd0.b) this.K0.getValue()).a(sd0.f.FORCE_RELOAD));
        t tVarA = jte.c.a(cVarT, null, 3);
        pfm.a aVar9 = new pfm.a(((ik3.c) L().S()).r(), cVar, 1);
        nfb.b bVar = (nfb.b) this.T0.getValue();
        if (bVar == null) {
            fVarV = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(fVarV, "complete(...)");
            aVar = aVarV4;
            aVar2 = aVarV6;
        } else {
            aVar = aVarV4;
            aVar2 = aVarV6;
            fVarV = ue0.e.v(pd.b.n(elm.f.f127540b, new s(bVar, null, 29)));
        }
        int i2 = 5;
        efm.b bVarP = efm.b.p(aVar8, aVarV, tVarA, aVar7, aVarV2, aVar9, aVarV3, aVar, aVarV5, fVarV, aVar2, aVarV7);
        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
        pfm.a aVar10 = new pfm.a(bVarP, new gn.b(12, new q(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar10.w(new bo.e(13, xab.p0.f303842a), o0.f303840a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVarA, hVarW);
        ufm.n nVarE0 = w.e0(w.o0(coroutineContext, new n(this, null, i2)));
        rfm.m mVar = new rfm.m(((ang.f) ((ylg.b) this.F0.getValue())).d.c(), new x9h.d(i, new x8i.h(15)), 1);
        i.Companion.getClass();
        rfm.f0 f0VarP = mVar.p(i.f224256b);
        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
        z zVarI = ue0.e.I(f0VarP, zhm.h0.f322473a, new x8i.h(18));
        Lazy lazy = this.S0;
        z zVarD = efm.b.p(((lwl.e) lazy.getValue()).c(), ((lwl.e) lazy.getValue()).a()).D(unit);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        rfm.l lVar = new rfm.l(new f(o70.a.i(w.I0(Y(zVarD, "prefetchDataDone"), Y(zVarI, "gotUserFromCache"), Y(nVarE0, "gotOnboardingStatus"))), new x9h.d(i2, new xab.c(this, 2)), 2), new xab.d(this, 0), 5);
        Intrinsics.checkNotNullExpressionValue(lVar, "doFinally(...)");
        f9b.f fVar2 = (f9b.f) this.X0.getValue();
        fVar2.getClass();
        d0 d0VarG = lVar.g(new f9b.b(fVar2, (Function1) null, true, false));
        Intrinsics.checkNotNullExpressionValue(d0VarG, "compose(...)");
        ufm.i iVar = new ufm.i(d0VarG, new gn.b(12, new q(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        xab.c cVar2 = new xab.c(this, 7);
        xab.c cVar3 = new xab.c(this, 8);
        ufm.i iVar2 = new ufm.i(iVar, new gn.b(12, new q(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new bo.e(13, cVar2), new bo.e(13, cVar3), 0 == true ? 1 : 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        r.e("startLoginProcess", false);
    }

    public final void E0(mm0.c cVar, hc hcVar) {
        fc fcVarD;
        j2 j2Var = (j2) this.H0.getValue();
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof mm0.a) {
            fcVarD = kli.a.D(((mm0.a) cVar).c());
        } else if (cVar instanceof mm0.b) {
            fcVarD = kli.a.D(((mm0.b) cVar).b());
        } else {
            if (!(cVar instanceof mm0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            fcVarD = fc.Pin;
        }
        ((com.revolut.analytics.tracking.v3.l) j2Var).r3(fcVarD, hcVar);
    }

    public final Object F(h0 h0Var, String str) throws Throwable {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Object objE = e0.E(kotlin.coroutines.g.f186406a, new r1(h0Var, null, 19));
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (jUptimeMillis2 > 5) {
            io.c cVar = (io.c) this.f82673c1.getValue();
            io.f fVar = (io.f) cVar;
            fVar.a(Long.valueOf(jUptimeMillis2), "await".concat(str));
        }
        return objE;
    }

    public final void G(NavBarWithContainerBackground navBarWithContainerBackground) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (navBarWithContainerBackground != null && !(navBarWithContainerBackground instanceof NavBarWithContainerBackground.TransparentBackground) && this.j0 == null) {
            WallpaperAssetSwitcher wallpaperAssetSwitcher = new WallpaperAssetSwitcher(fragmentActivityRequireActivity, null, 2);
            ViewGroup viewGroup = this.f82682k0;
            if (viewGroup == null) {
                Intrinsics.r("root");
                throw null;
            }
            viewGroup.addView(wallpaperAssetSwitcher, 0, new FrameLayout.LayoutParams(-2, -2));
            wallpaperAssetSwitcher.setFixedBounds(new t4(v4.f275253a));
            v1 v1Var = yx0.h.f317529a;
            Context context = wallpaperAssetSwitcher.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            wallpaperAssetSwitcher.setForeground(yx0.h.a(context, navBarWithContainerBackground));
            this.j0 = wallpaperAssetSwitcher;
            wallpaperAssetSwitcher.setBackground(navBarWithContainerBackground, null);
            efm.r rVarH = wallpaperAssetSwitcher.h();
            xab.c cVar = new xab.c(this, 14);
            efm.r rVarOnErrorResumeNext = rVarH.onErrorResumeNext(new gn.b(12, new q(new BreadcrumbException(), 4)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new bo.e(13, cVar), new bo.e(13, xab.l.f303832a)), "subscribe(...)");
        }
        hx0.h.d(fragmentActivityRequireActivity, this, requireActivity().isTaskRoot() ? 0 : 2);
    }

    public final FeatureCommand H() {
        j70.d dVarA = ((j70.c) ((j70.a) this.Y0.getValue())).a();
        if (dVarA.compareTo(j70.d.LOW) > 0) {
            r.a("appEntryAnimation", false, Boolean.TRUE);
            return new FeatureCommand(MainScreenFeatureConfig.AppEntry.f78069a);
        }
        u uVar = new u("App entry animation unavailable. Device performance class: " + dVarA, 1);
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, uVar, h0Var);
        return (FeatureCommand) this.f82678f1.getValue();
    }

    @Override // hx0.m
    public final View H1() {
        ViewGroup viewGroup = this.l0;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.r("content");
        throw null;
    }

    public final w2l.a I() {
        Object value = this.G0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w2l.a) value;
    }

    public final rm0.j J() {
        rm0.j jVar;
        h0 h0Var = this.y0;
        if (h0Var != null && (jVar = (rm0.j) F(h0Var, "BiometricState")) != null) {
            return jVar;
        }
        c cVar = this.q0;
        if (cVar != null) {
            return cVar.c();
        }
        Intrinsics.r("biometricHelper");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LoginFragmentContract$Configuration K() {
        return (LoginFragmentContract$Configuration) this.V0.getValue();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.c0 = analyticsContext;
    }

    public final vab.d L() {
        return (vab.d) this.E0.getValue();
    }

    public final sri.m M() {
        return (sri.m) this.I0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ie9.d N() {
        return (ie9.d) this.W0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final q0 C() {
        return (q0) this.f82679g1.getValue();
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF82762b0() {
        return K().i;
    }

    public final rl0.d Q() {
        rl0.d dVar;
        h0 h0Var = this.f82689w0;
        return (h0Var == null || (dVar = (rl0.d) F(h0Var, "PrimaryAuthCredentialsType")) == null) ? (rl0.d) e0.E(kotlin.coroutines.g.f186406a, new n(this, null, 2)) : dVar;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.c0;
    }

    public final an0.c V() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        phm.a aVar = (phm.a) ue0.e.j(contextRequireContext).a().get(an0.c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (an0.c) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", an0.c.class, " is not found"));
    }

    public final void W() {
        int i = this.A0 - 1;
        this.A0 = i;
        if (i == 0) {
            b bVar = this.B0;
            if (bVar != null) {
                PinCodeView pinCodeView = this.m0;
                if (pinCodeView == null) {
                    Intrinsics.r("pinCodeView");
                    throw null;
                }
                pinCodeView.removeCallbacks(bVar);
            }
            this.B0 = null;
            PinCodeView pinCodeView2 = this.m0;
            if (pinCodeView2 != null) {
                pinCodeView2.H0("withPinCodeProgress");
            } else {
                Intrinsics.r("pinCodeView");
                throw null;
            }
        }
    }

    public final void X() {
        String string;
        yx0.e eVar;
        z2l.a aVar = z2l.a.f319097a;
        PinCodeView.a.C0445a c0445a = PinCodeView.a.C0445a.f59611a;
        e eVar2 = this.g0;
        if (eVar2 != null) {
            eVar2.b();
        }
        this.g0 = null;
        int i = xab.k.f303828a[Q().ordinal()];
        if (i == 1) {
            zm0.b bVar = this.f82684o0;
            if (bVar == null) {
                Intrinsics.r("sessionController");
                throw null;
            }
            if ((((cn0.g) bVar).d() instanceof mm0.m) || Intrinsics.f(this.i0, Boolean.TRUE)) {
                c0(c0445a);
                return;
            }
            if (((Boolean) e0.E(kotlin.coroutines.g.f186406a, new o(this, null, 2))).booleanValue()) {
                c0(c0445a);
                return;
            }
            rm0.j jVarJ = J();
            if ((jVarJ instanceof rm0.f) || (jVarJ instanceof rm0.c)) {
                c0(c0445a);
                return;
            }
            if (jVarJ instanceof rm0.g) {
                c0(c0445a);
                c cVar = this.q0;
                if (cVar == null) {
                    Intrinsics.r("biometricHelper");
                    throw null;
                }
                cVar.a();
                uab.a aVar2 = this.p0;
                if (aVar2 == null) {
                    Intrinsics.r("biometricInteractor");
                    throw null;
                }
                aVar2.f278560a.l("FINGERPRINT_USER_ASKED", false);
                ((rp0.d) this.P0.getValue()).b(new rp0.b("InvalidCertificate", null, new TextLocalisedClause(R$string.biometric_alert_invalidated_message, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_ok, null, null, 14), null, null, null, false, 1010));
                return;
            }
            if (!(jVarJ instanceof rm0.d)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zm0.b bVar2 = this.f82684o0;
            if (bVar2 == null) {
                Intrinsics.r("sessionController");
                throw null;
            }
            if ((((cn0.g) bVar2).d() instanceof mm0.m) || Intrinsics.f(this.i0, Boolean.TRUE)) {
                p0();
                return;
            }
            rm0.j jVarJ2 = J();
            if ((jVarJ2 instanceof rm0.f) || (jVarJ2 instanceof rm0.c)) {
                p0();
                return;
            }
            if (jVarJ2 instanceof rm0.g) {
                p0();
                c cVar2 = this.q0;
                if (cVar2 != null) {
                    cVar2.a();
                    return;
                } else {
                    Intrinsics.r("biometricHelper");
                    throw null;
                }
            }
            if (!(jVarJ2 instanceof rm0.d)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        c cVar3 = this.q0;
        if (cVar3 == null) {
            Intrinsics.r("biometricHelper");
            throw null;
        }
        wl0.o oVarD = cVar3.d();
        c cVar4 = this.q0;
        if (cVar4 == null) {
            Intrinsics.r("biometricHelper");
            throw null;
        }
        wl0.i iVarA = cVar4.f298341b.a();
        if (oVarD == wl0.o.FACE_UNLOCK) {
            string = aVar.getString(R$string.biometric_title);
            eVar = yx0.e.FACE_ID;
        } else {
            string = aVar.getString(R$string.fingerprint_title);
            eVar = yx0.e.FINGERPRINT;
        }
        PinCodeView.a bVar3 = iVarA == wl0.i.GOOGLE ? new com.revolut.core.ui_kit.views.pin.b(eVar) : new com.revolut.core.ui_kit.views.pin.a(eVar);
        u0a.a aVar3 = new u0a.a(string, this, 9);
        c0(bVar3);
        zl0.b bVar4 = zl0.c.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        xab.p pVar = new xab.p(C());
        bVar4.getClass();
        this.g0 = zl0.b.b(contextRequireContext, aVar3, pVar);
        qp.a.Companion.getClass();
        if (qp.a.f248226a == null || !this.f82686s0.compareAndSet(false, true)) {
            q0();
        } else {
            h1.b(new androidx.view.d(this, 25));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ufm.i Z(java.lang.String r5, boolean r6, xab.j r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L5f
            r1 = 0
            int[] r2 = xab.k.d     // Catch: java.lang.Exception -> L30
            int r7 = r7.ordinal()     // Catch: java.lang.Exception -> L30
            r7 = r2[r7]     // Catch: java.lang.Exception -> L30
            r2 = 1
            if (r7 == r2) goto L38
            r3 = 2
            if (r7 != r3) goto L32
            xab.q r7 = new xab.q     // Catch: java.lang.Exception -> L30
            r7.<init>(r4, r5, r1, r2)     // Catch: java.lang.Exception -> L30
            kotlin.coroutines.g r3 = kotlin.coroutines.g.f186406a     // Catch: java.lang.Exception -> L30
            ufm.b r7 = te0.w.o0(r3, r7)     // Catch: java.lang.Exception -> L30
            xab.f r3 = new xab.f     // Catch: java.lang.Exception -> L30
            r3.<init>(r4, r5, r2)     // Catch: java.lang.Exception -> L30
            x9h.d r5 = new x9h.d     // Catch: java.lang.Exception -> L30
            r2 = 8
            r5.<init>(r2, r3)     // Catch: java.lang.Exception -> L30
            ufm.i r2 = new ufm.i     // Catch: java.lang.Exception -> L30
            r2.<init>(r7, r5, r0)     // Catch: java.lang.Exception -> L30
        L2e:
            r1 = r2
            goto L5d
        L30:
            r5 = move-exception
            goto L54
        L32:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L30
            r5.<init>()     // Catch: java.lang.Exception -> L30
            throw r5     // Catch: java.lang.Exception -> L30
        L38:
            xab.q r7 = new xab.q     // Catch: java.lang.Exception -> L30
            r7.<init>(r4, r5, r1, r0)     // Catch: java.lang.Exception -> L30
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a     // Catch: java.lang.Exception -> L30
            ufm.b r7 = te0.w.o0(r2, r7)     // Catch: java.lang.Exception -> L30
            xab.f r2 = new xab.f     // Catch: java.lang.Exception -> L30
            r2.<init>(r4, r5, r0)     // Catch: java.lang.Exception -> L30
            x9h.d r5 = new x9h.d     // Catch: java.lang.Exception -> L30
            r3 = 7
            r5.<init>(r3, r2)     // Catch: java.lang.Exception -> L30
            ufm.i r2 = new ufm.i     // Catch: java.lang.Exception -> L30
            r2.<init>(r7, r5, r0)     // Catch: java.lang.Exception -> L30
            goto L2e
        L54:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r1, r1, r5, r7)
        L5d:
            if (r1 != 0) goto L6a
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            ufm.b r1 = efm.d0.m(r5)
            java.lang.String r5 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
        L6a:
            t9f.n r5 = new t9f.n
            r7 = 16
            r5.<init>(r4, r6, r7)
            x9h.d r6 = new x9h.d
            r7 = 9
            r6.<init>(r7, r5)
            ufm.i r5 = new ufm.i
            r5.<init>(r1, r6, r0)
            java.lang.String r6 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.legacy.login.impl.login.LoginFragment.Z(java.lang.String, boolean, xab.j):ufm.i");
    }

    public final efm.r a0() {
        u7l.c cVarL = L().L();
        efm.r rVarB = cVarL.b();
        efm.r map = nim.a.w(cVarL.f277981b.d.f(Unit.f186387a, false), new qza.q(20)).map(new pv9.b(new qza.q(12), 24));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarDistinctUntilChanged = nim.a.w(cVarL.f277982c.f207662a.k(false), new jli.f(13)).distinctUntilChanged(new u3a.q(new u4e.i(24), 15));
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r map2 = pd.b.t(kli.a.i(rVarB, map, rVarDistinctUntilChanged), new u7l.a(cVarL, 1)).map(new v3e.s(new whi.b(4), 19));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return ue0.e.H(map2, zhm.h0.f322473a, new whi.b(5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(final mm0.c authorizationCall) {
        String str;
        Intrinsics.checkNotNullParameter(authorizationCall, "authorizationCall");
        if (this.f82674d0) {
            return;
        }
        Function1 function1 = null;
        if (getActivity() == null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "LoginFragment", "Can't process " + authorizationCall + ". LoginFragment is not attached to any activity. State is " + getLifecycle().getState().name(), null, h0Var);
            return;
        }
        boolean z = true;
        char c2 = 1;
        this.f82674d0 = true;
        AtomicReference atomicReference = r.f127969a;
        r.g();
        if (authorizationCall instanceof mm0.d) {
            str = "Passcode";
        } else if (authorizationCall instanceof mm0.a) {
            str = "Biometrics";
        } else {
            if (!(authorizationCall instanceof mm0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "BiometricsSsoSdk";
        }
        r.a("authMethod", true, str);
        r.a("loginMode", true, this.f0.name());
        r.a("performanceClass", true, ((j70.c) ((j70.a) this.Y0.getValue())).a().name());
        aoi.g.a().g("LOGIN_PREPARE_DATA");
        if (authorizationCall instanceof mm0.a) {
            PinCodeView pinCodeView = this.m0;
            if (pinCodeView == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            pinCodeView.I0();
        }
        ifm.b bVar = this.f104326b0;
        rfm.l lVar = new rfm.l(new ufm.c(new wf6.w(this, authorizationCall, 2), 2), new xab.d(this, 1), 5);
        Intrinsics.checkNotNullExpressionValue(lVar, "doFinally(...)");
        rfm.l lVar2 = new rfm.l(new f(o70.a.b(lVar), new x9h.d(10, new xab.c(this, 5)), 3), new xab.d(this, 2), 5);
        Intrinsics.checkNotNullExpressionValue(lVar2, "doFinally(...)");
        f9b.f fVar = (f9b.f) this.X0.getValue();
        fVar.getClass();
        d0 d0VarG = lVar2.g(new f9b.b(fVar, function1, z, false));
        Intrinsics.checkNotNullExpressionValue(d0VarG, "compose(...)");
        final Object[] objArr = 0 == true ? 1 : 0;
        Function1 function12 = new Function1(this) { // from class: xab.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303812b;

            {
                this.f303812b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                pfm.r rVarG0;
                Continuation continuation = null;
                int i = 3;
                boolean z3 = true;
                boolean zE = false;
                zE = false;
                zE = false;
                switch (objArr) {
                    case 0:
                        LoginFragment loginFragment = this.f303812b;
                        mm0.c cVar = authorizationCall;
                        mm0.n nVar = (mm0.n) obj2;
                        AtomicReference atomicReference2 = eoi.r.f127969a;
                        eoi.r.e("sessionAuthorized", true);
                        loginFragment.E0(cVar, hc.Success);
                        Intrinsics.h(nVar);
                        ((ie9.h) loginFragment.N()).f160679a.clear();
                        int i2 = k.f303829b[loginFragment.f0.ordinal()];
                        int i3 = 6;
                        int i5 = 4;
                        if (i2 == 3) {
                            rl0.b bVar2 = nVar.f207116c;
                            if (bVar2 instanceof rl0.a) {
                                ((eli.l) loginFragment.L().e()).a(new zm0.d(((rl0.a) bVar2).f254906a, zm0.e.INTERNAL, 4));
                            } else {
                                if (!(bVar2 instanceof b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException("Retail 2FA can't be used when user signed-in with passkey. Migrate your feature to SSO Reauthentication");
                                zhm.h0 h0Var2 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                                FragmentActivity fragmentActivityRequireActivity = loginFragment.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                nii.t0 t0Var = new nii.t0(fragmentActivityRequireActivity);
                                nii.y0 y0Var = new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5);
                                ihm.f fVar2 = t0Var.f216224h;
                                c cVar2 = new c(loginFragment, i5);
                                efm.r rVarOnErrorResumeNext = fVar2.onErrorResumeNext(new gn.b(12, new x94.q(new BreadcrumbException(), i3)));
                                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new bo.e(13, cVar2), new bo.e(13, r.f303845a)), "subscribe(...)");
                                t0Var.h(y0Var);
                            }
                        } else if (i2 != 4) {
                            if (i2 != 5) {
                                if (!(loginFragment.J() instanceof rm0.d)) {
                                    wl0.c cVar3 = loginFragment.q0;
                                    if (cVar3 == null) {
                                        Intrinsics.r("biometricHelper");
                                        throw null;
                                    }
                                    if (cVar3.d() != wl0.o.NONE) {
                                        uab.a aVar = loginFragment.p0;
                                        if (aVar == null) {
                                            Intrinsics.r("biometricInteractor");
                                            throw null;
                                        }
                                        if (!aVar.f278560a.c("FINGERPRINT_USER_ASKED", false)) {
                                            wl0.c cVar4 = loginFragment.q0;
                                            if (cVar4 == null) {
                                                Intrinsics.r("biometricHelper");
                                                throw null;
                                            }
                                            zE = cVar4.e();
                                        }
                                    }
                                }
                                if (zE) {
                                    ((rp0.d) loginFragment.P0.getValue()).b(new rp0.b("DIALOG_ID_BIOMETRIC_PROMPT", new TextLocalisedClause(R$string.fingerprint_diaolg_title, null, null, 14), new TextLocalisedClause(R$string.fingerprint_diaolg_message, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), null, new TextLocalisedClause(R$string.common_action_dontallow, null, null, 14), null, false, 784));
                                    aoi.g.a().f("LOGIN_PREPARE_DATA");
                                    eoi.r.c("biometricDialogShown");
                                } else {
                                    loginFragment.C0();
                                }
                            } else {
                                ba3.h hVar = loginFragment.L().s().f150398a;
                                String cardId = loginFragment.K().f82692b;
                                if (cardId != null) {
                                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                                    hVar.getClass();
                                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                                    rVarG0 = te0.w.g0(hVar.f13892a.resetSca(cardId));
                                } else {
                                    rVarG0 = te0.w.g0(hVar.f13892a.resetScaAll());
                                }
                                ifm.b bVar3 = loginFragment.f104326b0;
                                Intrinsics.checkNotNullParameter(rVarG0, "<this>");
                                pfm.r rVarG = o70.a.g(te0.w.g0(rVarG0));
                                tpi.i iVar = (tpi.i) loginFragment.I().getProgressView();
                                iVar.getClass();
                                efm.b bVarH = rVarG.h(new com.google.firebase.messaging.r(iVar, z3));
                                f9b.f fVar3 = (f9b.f) loginFragment.X0.getValue();
                                fVar3.getClass();
                                efm.b bVarH2 = bVarH.h(new com.google.firebase.messaging.j(fVar3, continuation, zE));
                                Intrinsics.checkNotNullExpressionValue(bVarH2, "compose(...)");
                                g gVar = new g(loginFragment, zE ? 1 : 0);
                                c cVar5 = new c(loginFragment, i3);
                                pfm.a aVar2 = new pfm.a(bVarH2, new gn.b(12, new x94.q(new BreadcrumbException(), 11)), 2);
                                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                                ofm.h hVarW = aVar2.w(new bo.e(13, cVar5), new t1i.n(21, gVar));
                                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                                te0.w.j0(bVar3, hVarW);
                            }
                        } else if (loginFragment.K().f82694g != null) {
                            loginFragment.requireActivity().setResult(-1);
                            loginFragment.requireActivity().finish();
                        } else {
                            String str2 = loginFragment.K().f82692b;
                            if (str2 == null) {
                                throw new IllegalStateException("cardId cannot be null for SIGN_SHOW_PIN mode");
                            }
                            loginFragment.M().c(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new CardsFeatureConfig.ShowCardPin(str2, loginFragment.K().f82693c))));
                        }
                        return Unit.f186387a;
                    default:
                        LoginFragment loginFragment2 = this.f303812b;
                        mm0.c cVar6 = authorizationCall;
                        Throwable it8 = (Throwable) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        AtomicReference atomicReference3 = eoi.r.f127969a;
                        AtomicReference atomicReference4 = eoi.r.f127969a;
                        eoi.q qVar = eoi.q.PENDING;
                        eoi.q qVar2 = eoi.q.NOT_STARTED;
                        while (true) {
                            if (atomicReference4.compareAndSet(qVar, qVar2)) {
                                eoi.r.f127971c.clear();
                                eoi.r.f127970b.clear();
                                eoi.r.d = 0L;
                                eoi.r.e = 0L;
                                eoi.r.f = null;
                            } else if (atomicReference4.get() != qVar) {
                            }
                        }
                        loginFragment2.E0(cVar6, hc.Failure);
                        if (loginFragment2.f0 == sab.b.SIGN_CHANGED_PHONE_SHOW_CHAT) {
                            FragmentActivity fragmentActivityRequireActivity2 = loginFragment2.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                            fragmentActivityRequireActivity2.setResult(1000);
                            fragmentActivityRequireActivity2.finish();
                        } else {
                            int i6 = k.f303828a[loginFragment2.Q().ordinal()];
                            if (i6 == 1) {
                                skm.e0.E(kotlin.coroutines.g.f186406a, new n(loginFragment2, continuation, i));
                                o oVar = new o(loginFragment2, null, 1);
                                kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
                                if (((Boolean) skm.e0.E(gVar2, oVar)).booleanValue()) {
                                    PinCodeView pinCodeView2 = loginFragment2.m0;
                                    if (pinCodeView2 == null) {
                                        Intrinsics.r("pinCodeView");
                                        throw null;
                                    }
                                    pinCodeView2.o0();
                                    FragmentActivity fragmentActivityRequireActivity3 = loginFragment2.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "requireActivity(...)");
                                    nii.t0 t0Var2 = new nii.t0(fragmentActivityRequireActivity3);
                                    nii.y0 y0Var2 = new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.auth_passcode_failed_attemps_logout_title, null, null, 14), new TextLocalisedClause(R$string.auth_passcode_failed_attemps_logout_description, null, null, 14), new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5);
                                    ihm.f fVar4 = t0Var2.f216224h;
                                    c cVar7 = new c(loginFragment2, i);
                                    efm.r rVarOnErrorResumeNext2 = fVar4.onErrorResumeNext(new gn.b(12, new x94.q(new BreadcrumbException(), 8)));
                                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
                                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2.subscribe(new bo.e(13, cVar7), new bo.e(13, t.f303851a)), "subscribe(...)");
                                    t0Var2.h(y0Var2);
                                } else {
                                    PinCodeView pinCodeView3 = loginFragment2.m0;
                                    if (pinCodeView3 == null) {
                                        Intrinsics.r("pinCodeView");
                                        throw null;
                                    }
                                    pinCodeView3.o0();
                                    if (((Boolean) skm.e0.E(gVar2, new o(loginFragment2, null, 2))).booleanValue()) {
                                        loginFragment2.e0(((Number) skm.e0.E(gVar2, new o(loginFragment2, null, 0))).longValue());
                                        loginFragment2.X();
                                    }
                                }
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                loginFragment2.p0();
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        final char c3 = c2 == true ? 1 : 0;
        Function1 function13 = new Function1(this) { // from class: xab.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f303812b;

            {
                this.f303812b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                pfm.r rVarG0;
                Continuation continuation = null;
                int i = 3;
                boolean z3 = true;
                boolean zE = false;
                zE = false;
                zE = false;
                switch (c3) {
                    case 0:
                        LoginFragment loginFragment = this.f303812b;
                        mm0.c cVar = authorizationCall;
                        mm0.n nVar = (mm0.n) obj2;
                        AtomicReference atomicReference2 = eoi.r.f127969a;
                        eoi.r.e("sessionAuthorized", true);
                        loginFragment.E0(cVar, hc.Success);
                        Intrinsics.h(nVar);
                        ((ie9.h) loginFragment.N()).f160679a.clear();
                        int i2 = k.f303829b[loginFragment.f0.ordinal()];
                        int i3 = 6;
                        int i5 = 4;
                        if (i2 == 3) {
                            rl0.b bVar2 = nVar.f207116c;
                            if (bVar2 instanceof rl0.a) {
                                ((eli.l) loginFragment.L().e()).a(new zm0.d(((rl0.a) bVar2).f254906a, zm0.e.INTERNAL, 4));
                            } else {
                                if (!(bVar2 instanceof b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException("Retail 2FA can't be used when user signed-in with passkey. Migrate your feature to SSO Reauthentication");
                                zhm.h0 h0Var2 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                                FragmentActivity fragmentActivityRequireActivity = loginFragment.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                nii.t0 t0Var = new nii.t0(fragmentActivityRequireActivity);
                                nii.y0 y0Var = new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5);
                                ihm.f fVar2 = t0Var.f216224h;
                                c cVar2 = new c(loginFragment, i5);
                                efm.r rVarOnErrorResumeNext = fVar2.onErrorResumeNext(new gn.b(12, new x94.q(new BreadcrumbException(), i3)));
                                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new bo.e(13, cVar2), new bo.e(13, r.f303845a)), "subscribe(...)");
                                t0Var.h(y0Var);
                            }
                        } else if (i2 != 4) {
                            if (i2 != 5) {
                                if (!(loginFragment.J() instanceof rm0.d)) {
                                    wl0.c cVar3 = loginFragment.q0;
                                    if (cVar3 == null) {
                                        Intrinsics.r("biometricHelper");
                                        throw null;
                                    }
                                    if (cVar3.d() != wl0.o.NONE) {
                                        uab.a aVar = loginFragment.p0;
                                        if (aVar == null) {
                                            Intrinsics.r("biometricInteractor");
                                            throw null;
                                        }
                                        if (!aVar.f278560a.c("FINGERPRINT_USER_ASKED", false)) {
                                            wl0.c cVar4 = loginFragment.q0;
                                            if (cVar4 == null) {
                                                Intrinsics.r("biometricHelper");
                                                throw null;
                                            }
                                            zE = cVar4.e();
                                        }
                                    }
                                }
                                if (zE) {
                                    ((rp0.d) loginFragment.P0.getValue()).b(new rp0.b("DIALOG_ID_BIOMETRIC_PROMPT", new TextLocalisedClause(R$string.fingerprint_diaolg_title, null, null, 14), new TextLocalisedClause(R$string.fingerprint_diaolg_message, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), null, new TextLocalisedClause(R$string.common_action_dontallow, null, null, 14), null, false, 784));
                                    aoi.g.a().f("LOGIN_PREPARE_DATA");
                                    eoi.r.c("biometricDialogShown");
                                } else {
                                    loginFragment.C0();
                                }
                            } else {
                                ba3.h hVar = loginFragment.L().s().f150398a;
                                String cardId = loginFragment.K().f82692b;
                                if (cardId != null) {
                                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                                    hVar.getClass();
                                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                                    rVarG0 = te0.w.g0(hVar.f13892a.resetSca(cardId));
                                } else {
                                    rVarG0 = te0.w.g0(hVar.f13892a.resetScaAll());
                                }
                                ifm.b bVar3 = loginFragment.f104326b0;
                                Intrinsics.checkNotNullParameter(rVarG0, "<this>");
                                pfm.r rVarG = o70.a.g(te0.w.g0(rVarG0));
                                tpi.i iVar = (tpi.i) loginFragment.I().getProgressView();
                                iVar.getClass();
                                efm.b bVarH = rVarG.h(new com.google.firebase.messaging.r(iVar, z3));
                                f9b.f fVar3 = (f9b.f) loginFragment.X0.getValue();
                                fVar3.getClass();
                                efm.b bVarH2 = bVarH.h(new com.google.firebase.messaging.j(fVar3, continuation, zE));
                                Intrinsics.checkNotNullExpressionValue(bVarH2, "compose(...)");
                                g gVar = new g(loginFragment, zE ? 1 : 0);
                                c cVar5 = new c(loginFragment, i3);
                                pfm.a aVar2 = new pfm.a(bVarH2, new gn.b(12, new x94.q(new BreadcrumbException(), 11)), 2);
                                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                                ofm.h hVarW = aVar2.w(new bo.e(13, cVar5), new t1i.n(21, gVar));
                                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                                te0.w.j0(bVar3, hVarW);
                            }
                        } else if (loginFragment.K().f82694g != null) {
                            loginFragment.requireActivity().setResult(-1);
                            loginFragment.requireActivity().finish();
                        } else {
                            String str2 = loginFragment.K().f82692b;
                            if (str2 == null) {
                                throw new IllegalStateException("cardId cannot be null for SIGN_SHOW_PIN mode");
                            }
                            loginFragment.M().c(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new CardsFeatureConfig.ShowCardPin(str2, loginFragment.K().f82693c))));
                        }
                        return Unit.f186387a;
                    default:
                        LoginFragment loginFragment2 = this.f303812b;
                        mm0.c cVar6 = authorizationCall;
                        Throwable it8 = (Throwable) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        AtomicReference atomicReference3 = eoi.r.f127969a;
                        AtomicReference atomicReference4 = eoi.r.f127969a;
                        eoi.q qVar = eoi.q.PENDING;
                        eoi.q qVar2 = eoi.q.NOT_STARTED;
                        while (true) {
                            if (atomicReference4.compareAndSet(qVar, qVar2)) {
                                eoi.r.f127971c.clear();
                                eoi.r.f127970b.clear();
                                eoi.r.d = 0L;
                                eoi.r.e = 0L;
                                eoi.r.f = null;
                            } else if (atomicReference4.get() != qVar) {
                            }
                        }
                        loginFragment2.E0(cVar6, hc.Failure);
                        if (loginFragment2.f0 == sab.b.SIGN_CHANGED_PHONE_SHOW_CHAT) {
                            FragmentActivity fragmentActivityRequireActivity2 = loginFragment2.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                            fragmentActivityRequireActivity2.setResult(1000);
                            fragmentActivityRequireActivity2.finish();
                        } else {
                            int i6 = k.f303828a[loginFragment2.Q().ordinal()];
                            if (i6 == 1) {
                                skm.e0.E(kotlin.coroutines.g.f186406a, new n(loginFragment2, continuation, i));
                                o oVar = new o(loginFragment2, null, 1);
                                kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
                                if (((Boolean) skm.e0.E(gVar2, oVar)).booleanValue()) {
                                    PinCodeView pinCodeView2 = loginFragment2.m0;
                                    if (pinCodeView2 == null) {
                                        Intrinsics.r("pinCodeView");
                                        throw null;
                                    }
                                    pinCodeView2.o0();
                                    FragmentActivity fragmentActivityRequireActivity3 = loginFragment2.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "requireActivity(...)");
                                    nii.t0 t0Var2 = new nii.t0(fragmentActivityRequireActivity3);
                                    nii.y0 y0Var2 = new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.auth_passcode_failed_attemps_logout_title, null, null, 14), new TextLocalisedClause(R$string.auth_passcode_failed_attemps_logout_description, null, null, 14), new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5);
                                    ihm.f fVar4 = t0Var2.f216224h;
                                    c cVar7 = new c(loginFragment2, i);
                                    efm.r rVarOnErrorResumeNext2 = fVar4.onErrorResumeNext(new gn.b(12, new x94.q(new BreadcrumbException(), 8)));
                                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
                                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2.subscribe(new bo.e(13, cVar7), new bo.e(13, t.f303851a)), "subscribe(...)");
                                    t0Var2.h(y0Var2);
                                } else {
                                    PinCodeView pinCodeView3 = loginFragment2.m0;
                                    if (pinCodeView3 == null) {
                                        Intrinsics.r("pinCodeView");
                                        throw null;
                                    }
                                    pinCodeView3.o0();
                                    if (((Boolean) skm.e0.E(gVar2, new o(loginFragment2, null, 2))).booleanValue()) {
                                        loginFragment2.e0(((Number) skm.e0.E(gVar2, new o(loginFragment2, null, 0))).longValue());
                                        loginFragment2.X();
                                    }
                                }
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                loginFragment2.p0();
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        ufm.i iVar = new ufm.i(d0VarG, new gn.b(12, new q(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new bo.e(13, function12), new bo.e(13, function13), 0 == true ? 1 : 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        w.j0(bVar, iVar2);
    }

    public final void c0(PinCodeView.a biometricViewMode) {
        fc fcVar;
        Intrinsics.checkNotNullParameter(biometricViewMode, "biometricViewMode");
        PinCodeView pinCodeView = this.m0;
        if (pinCodeView == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        pinCodeView.setBiometricModeAndInvalidate(biometricViewMode);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SettingsUnlockContext.a aVarNewBuilder = SettingsUnlockContext.newBuilder();
        yx0.e eVarA = biometricViewMode.a();
        Intrinsics.checkNotNullParameter(eVarA, "<this>");
        int i = z0.f303867a[eVarA.ordinal()];
        if (i == 1) {
            fcVar = fc.Pin;
        } else if (i == 2) {
            fcVar = fc.Fingerprint;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fcVar = fc.Face;
        }
        aVarNewBuilder.c();
        ((SettingsUnlockContext) aVarNewBuilder.f49761b).setMethod(fcVar);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.c0 = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    public final void d0(sab.b bVar) {
        int i = xab.k.f303829b[bVar.ordinal()];
        if (i == 3) {
            PinCodeView pinCodeView = this.m0;
            if (pinCodeView != null) {
                pinCodeView.setHeader(new PinCodeView.Header.Title(4, Companion.a(INSTANCE, R$string.two_fa_enter_passcode), (TextLocalisedClause) null));
                return;
            } else {
                Intrinsics.r("pinCodeView");
                throw null;
            }
        }
        if (i == 4) {
            PinCodeView pinCodeView2 = this.m0;
            if (pinCodeView2 != null) {
                pinCodeView2.setHeader(new PinCodeView.Header.Title(4, Companion.a(INSTANCE, R$string.signin3_passcode_enter_title), (TextLocalisedClause) null));
                return;
            } else {
                Intrinsics.r("pinCodeView");
                throw null;
            }
        }
        qp.a.Companion.getClass();
        if (qp.a.f248226a != null) {
            t1 t1Var = this.z0;
            CoroutineScope coroutineScope = this.u0;
            if (t1Var == null || coroutineScope == null) {
                return;
            }
            vkm.q.G(new vkm.q0(t1Var, new xab.h0(this, null), 1), coroutineScope);
            return;
        }
        ifm.b bVar2 = this.f104326b0;
        efm.r rVarA = o70.a.a(a0());
        xab.c cVar = new xab.c(this, 15);
        efm.r rVarOnErrorResumeNext = rVarA.onErrorResumeNext(new gn.b(12, new q(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(13, cVar), new bo.e(13, g0.f303821a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        w.j0(bVar2, cVarSubscribe);
    }

    public final void e0(long j2) {
        String strN = p.a.n(j2, "New timer for ", "ms is going to be launched");
        a2 a2Var = this.f82680h0;
        a2 a2VarC = null;
        if (a2Var != null) {
            e0.l(a2Var, strN, null);
        }
        this.f82680h0 = null;
        CoroutineScope coroutineScope = this.u0;
        if (coroutineScope != null) {
            Companion companion = INSTANCE;
            PinCodeView pinCodeView = this.m0;
            if (pinCodeView == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            wma.e onUpdate = new wma.e(pinCodeView);
            wm3.j onFinish = new wm3.j(this, a2VarC, 8);
            companion.getClass();
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(onFinish, "onFinish");
            a2VarC = e0.C(coroutineScope, new b0("TOO_MANY_ATTEMPTS_TIMER"), null, new a(j2, onUpdate, onFinish, null), 2);
        }
        this.f82680h0 = a2VarC;
    }

    public final boolean n0() {
        sab.b bVar = this.f0;
        return (bVar == sab.b.SIGN_LOGIN || bVar == sab.b.NONE) && ((j70.c) ((j70.a) this.Y0.getValue())).a().compareTo(j70.d.LOW) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        NavBarWithContainerBackground navBarWithContainerBackgroundB;
        Intrinsics.checkNotNullParameter(context, "context");
        io.c.Companion.getClass();
        io.a.a("loginFragmentAttachStarted");
        super.onAttach(context);
        p0 p0Var = p0.f264001a;
        this.f82687t0 = rd0.e.a(zkm.o.f323119a.e);
        an0.c cVarV = V();
        this.f82684o0 = cVarV.i();
        this.p0 = L().K();
        this.q0 = cVarV.a();
        this.f82685r0 = cVarV.e();
        t1 t1VarM = null;
        Object[] objArr = 0;
        if (n0()) {
            if (requireActivity().isTaskRoot()) {
                navBarWithContainerBackgroundB = ((lwl.e) this.S0.getValue()).b();
            } else {
                Parcelable parcelable = K().f82695h;
                navBarWithContainerBackgroundB = parcelable instanceof NavBarWithContainerBackground ? (NavBarWithContainerBackground) parcelable : null;
                if (navBarWithContainerBackgroundB == null) {
                    navBarWithContainerBackgroundB = ((lwl.e) this.S0.getValue()).b();
                }
            }
            this.D0 = navBarWithContainerBackgroundB;
            if (navBarWithContainerBackgroundB != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                int iH = c8g.c.H(contextRequireContext);
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                int iB = d5.b(fragmentActivityRequireActivity);
                ImageView imageView = new ImageView(requireContext());
                imageView.setLayoutParams(new ViewGroup.LayoutParams(iH, iB));
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                yy0.f.e(jh.d.f(contextRequireContext2).Q(), navBarWithContainerBackgroundB.getE(), imageView, null, null, 12);
            }
        }
        if (((Boolean) e0.E(kotlin.coroutines.g.f186406a, new o(this, null, 1))).booleanValue()) {
            ((d60.a) this.Z0.getValue()).a();
        }
        io.a.a("loginFragmentLoginRequiredChecked");
        qp.a.Companion.getClass();
        if (qp.a.f248226a != null) {
            CoroutineScope coroutineScope = this.f82687t0;
            this.f82688v0 = coroutineScope != null ? e0.g(coroutineScope, elm.f.f127540b, null, new o(this, null, 3), 2) : null;
            CoroutineScope coroutineScope2 = this.f82687t0;
            this.f82689w0 = coroutineScope2 != null ? e0.g(coroutineScope2, elm.f.f127540b, null, new o(this, null, 4), 2) : null;
            CoroutineScope coroutineScope3 = this.f82687t0;
            this.f82690x0 = coroutineScope3 != null ? e0.g(coroutineScope3, elm.f.f127540b, null, new akl.w(this, objArr == true ? 1 : 0, 9), 2) : null;
            CoroutineScope coroutineScope4 = this.f82687t0;
            this.y0 = coroutineScope4 != null ? e0.g(coroutineScope4, elm.f.f127540b, null, new v(this, null, 0), 2) : null;
            CoroutineScope coroutineScope5 = this.f82687t0;
            if (coroutineScope5 != null) {
                Flow flowJ = vkm.q.j(vkm.q.q(rd0.e.b(a0())), -1, 2);
                zkm.d dVarD = e0.D(coroutineScope5, elm.f.f127540b);
                d2.Companion.getClass();
                t1VarM = vkm.q.M(flowJ, dVarD, c2.f290008b, 1);
            }
            this.z0 = t1VarM;
        }
        io.a.a("loginFragmentAttachFinished");
    }

    @Override // com.revolut.retail.legacy_ui.fragment.BaseFragment
    public final boolean onBackPressed() {
        PinCodeView pinCodeView = this.m0;
        if (pinCodeView == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        pinCodeView.r0();
        int i = xab.k.f303829b[this.f0.ordinal()];
        if (i != 3) {
            return i != 4;
        }
        requireActivity().setResult(0);
        return false;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        PinCodeView pinCodeView = this.m0;
        if (pinCodeView == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        View view = getView();
        ne9.a.a(pinCodeView, view != null ? (BasicNavBar) view.findViewById(R$id.toolbar) : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        io.c.Companion.getClass();
        io.a.a("loginFragmentCreateViewStarted");
        View viewInflate = inflater.inflate(R$layout.fragment_login_light, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R$id.loginFragment_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f82682k0 = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.login_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.l0 = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R$id.login_pin_code_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.m0 = (PinCodeView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R$id.login_biometric_only_fallback_buttons);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f82683n0 = (TwinVerticalButton) viewFindViewById4;
        io.a.a("loginFragmentCreateViewFinished");
        Intrinsics.checkNotNullExpressionValue(viewInflate, "also(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() throws Throwable {
        String str;
        a2 a2Var = this.f82680h0;
        if (a2Var != null) {
            e0.l(a2Var, "View destroyed", null);
        }
        this.f82680h0 = null;
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            n1 n1Var = this.C0;
            if (n1Var != null) {
                n1Var.b();
                this.C0 = null;
            }
        } else if (!this.f82676e0 && (str = K().d) != null) {
            this.f82676e0 = true;
            e0.E(kotlin.coroutines.g.f186406a, new xab.q(this, str, null, 2));
        }
        CoroutineScope coroutineScope = this.u0;
        if (coroutineScope != null) {
            e0.k(coroutineScope, null);
        }
        this.u0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        CoroutineScope coroutineScope = this.f82687t0;
        if (coroutineScope != null) {
            e0.k(coroutineScope, null);
        }
        this.f82687t0 = null;
        this.D0 = null;
        super.onDetach();
    }

    @Override // com.revolut.retail.legacy_ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        e eVar = this.g0;
        if (eVar != null) {
            eVar.b();
        }
        h0 h0Var = this.y0;
        if (h0Var != null) {
            h0Var.f(null);
        }
        this.y0 = null;
        opi.d.c(((xab.w0) C()).f303859m);
        super.onPause();
    }

    @Override // com.revolut.retail.legacy_ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        io.c.Companion.getClass();
        io.a.a("loginFragmentResumeStarted");
        super.onResume();
        PinCodeView pinCodeView = this.m0;
        if (pinCodeView == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        pinCodeView.p0();
        X();
        View view = getView();
        if (view != null) {
            OneShotPreDrawListener.add(view, new ch.p(view, this, 23));
        }
        io.a.a("loginFragmentResumeFinished");
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        io.c.Companion.getClass();
        io.a.a("loginFragmentStartStarted");
        super.onStart();
        PinCodeView pinCodeView = this.m0;
        if (pinCodeView == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        ihm.f fVarS0 = pinCodeView.s0();
        xab.i iVar = new xab.i(this, 2);
        efm.r rVarOnErrorResumeNext = fVarS0.onErrorResumeNext(new gn.b(12, new x(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(13, iVar), new bo.e(13, j0.f303827a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        ifm.b bVar = this.f104326b0;
        w.j0(bVar, cVarSubscribe);
        PinCodeView pinCodeView2 = this.m0;
        if (pinCodeView2 == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        ihm.f fVarX0 = pinCodeView2.x0();
        xab.i iVar2 = new xab.i(this, 3);
        efm.r rVarOnErrorResumeNext2 = fVarX0.onErrorResumeNext(new gn.b(12, new x(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new bo.e(13, iVar2), new bo.e(13, k0.f303831a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe2, "subscribe(...)");
        w.j0(bVar, cVarSubscribe2);
        PinCodeView pinCodeView3 = this.m0;
        if (pinCodeView3 == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        ihm.f fVarT0 = pinCodeView3.t0();
        xab.i iVar3 = new xab.i(this, 4);
        efm.r rVarOnErrorResumeNext3 = fVarT0.onErrorResumeNext(new gn.b(12, new l0(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new bo.e(13, iVar3), new bo.e(13, m0.f303836a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe3, "subscribe(...)");
        w.j0(bVar, cVarSubscribe3);
        PinCodeView pinCodeView4 = this.m0;
        if (pinCodeView4 == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        ihm.f fVarZ0 = pinCodeView4.z0();
        xab.i iVar4 = new xab.i(this, 5);
        efm.r rVarOnErrorResumeNext4 = fVarZ0.onErrorResumeNext(new gn.b(12, new l0(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new bo.e(13, iVar4), new bo.e(13, n0.f303838a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe4, "subscribe(...)");
        w.j0(bVar, cVarSubscribe4);
        PinCodeView pinCodeView5 = this.m0;
        if (pinCodeView5 == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        ihm.f fVarU0 = pinCodeView5.u0();
        xab.i iVar5 = new xab.i(this, 6);
        efm.r rVarOnErrorResumeNext5 = fVarU0.onErrorResumeNext(new gn.b(12, new l0(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new bo.e(13, iVar5), new bo.e(13, i0.f303826a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe5, "subscribe(...)");
        w.j0(bVar, cVarSubscribe5);
        TwinVerticalButton twinVerticalButton = this.f82683n0;
        if (twinVerticalButton == null) {
            Intrinsics.r("biometricOnlyFallbackButtons");
            throw null;
        }
        pfm.a aVar = new pfm.a(w.D(twinVerticalButton.o0(), new xab.c(this, 9)), new gn.b(12, new q(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new bo.e(13, xab.z.f303866a), y.f303865a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        pfm.a aVar2 = new pfm.a(w.D(twinVerticalButton.p0(), new xab.c(this, 10)), new gn.b(12, new q(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar2.w(new bo.e(13, xab.b0.f303804a), a0.f303801a);
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.R0;
        pfm.a aVar3 = new pfm.a(w.D(twinHorizontalButtonDelegate.p(), new xab.c(this, 11)), new gn.b(12, new q(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar3.w(new bo.e(13, xab.d0.f303810a), c0.f303807a);
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        pfm.a aVar4 = new pfm.a(w.D(twinHorizontalButtonDelegate.q(), new xab.c(this, 12)), new gn.b(12, new q(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar4.w(new bo.e(13, xab.f0.f303818a), xab.e0.f303814a);
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        ihm.f fVar = ((rp0.d) this.P0.getValue()).f256060c;
        xab.i iVar6 = new xab.i(this, 0);
        efm.r rVarOnErrorResumeNext6 = fVar.onErrorResumeNext(new gn.b(12, new x(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new bo.e(13, iVar6), new bo.e(13, xab.s.f303848a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe6, "subscribe(...)");
        w.j0(bVar, cVarSubscribe6);
        io.a.a("loginFragmentStartFinished");
    }

    @Override // com.revolut.retail.legacy_ui.fragment.BaseFragment, com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AtomicReference atomicReference = r.f127969a;
        r.c("loginFragmentStopped");
        super.onStop();
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        sab.b bVar;
        PinCodeHinter pinCodeHinterB;
        TextLocalisedClause textLocalisedClause;
        zm0.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        io.c.Companion.getClass();
        io.a.a("loginFragmentViewCreatedStarted");
        super.onViewCreated(view, bundle);
        je9.d dVar = (je9.d) this.a1.getValue();
        PinCodeView pinCodeView = this.m0;
        Continuation continuation = null;
        if (pinCodeView == null) {
            Intrinsics.r("pinCodeView");
            throw null;
        }
        dVar.a(pinCodeView);
        p0 p0Var = p0.f264001a;
        this.u0 = rd0.e.a(zkm.o.f323119a.e);
        Intent intent = requireActivity().getIntent();
        Intrinsics.h(intent);
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (Intrinsics.f(intent.getAction(), "com.revolut.revolut.action.IN_APP_VERIFICATION")) {
            bVar = sab.b.SIGN_CONFIRM_GOOGLE_PAY;
        } else {
            Intrinsics.checkNotNullParameter(intent, "<this>");
            if (Intrinsics.f(intent.getAction(), "com.revolut.revolut.a2a")) {
                bVar = sab.b.SIGN_CONFIRM_GOOGLE_PAY_VISA;
            } else if (z50.c.a(intent)) {
                bVar = sab.b.SIGN_SHOW_CHAT;
            } else {
                Intrinsics.checkNotNullParameter(intent, "intent");
                bVar = Intrinsics.f(intent.getStringExtra("serviceIdentifier"), "revolut-chat-assistant") ? sab.b.SIGN_SHOW_ASSISTANT : K().f82691a;
            }
        }
        this.f0 = bVar;
        this.i0 = Boolean.valueOf(K().e);
        BasicNavBar basicNavBar = (BasicNavBar) view.findViewById(R$id.toolbar);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        basicNavBar.setBackground(tx0.d0.TRANSPARENT);
        ihm.f fVar = basicNavBar.f59211b;
        int i = 1;
        xab.i iVar = new xab.i(this, i);
        efm.r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new gn.b(12, new q(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(13, iVar), new bo.e(13, xab.u.f303852a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        w.j0(this.f104326b0, cVarSubscribe);
        sab.b bVar2 = sab.b.NONE;
        sab.b bVar3 = sab.b.SIGN_LOGIN;
        sab.b[] elements = {bVar2, bVar3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        basicNavBar.setVisibility(kotlin.collections.d.y0(elements).contains(this.f0) ? 4 : 0);
        int i2 = xab.k.f303828a[Q().ordinal()];
        PinCodeView.BiometricBehaviorMode.Focus focus = PinCodeView.BiometricBehaviorMode.Focus.f59599a;
        PinCodeView.Mode placeholder = PinCodeView.Mode.Dynamic.f59608a;
        if (i2 == 1) {
            sab.b bVar4 = this.f0;
            sab.b[] elements2 = {sab.b.SIGN_SHOW_PIN, sab.b.SIGN_CHANGED_PHONE_SHOW_CHAT, sab.b.SIGN_2FA};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            boolean zContains = kotlin.collections.d.y0(elements2).contains(bVar4);
            od0.a aVar2 = od0.a.f224253a;
            boolean z = od0.a.e() || od0.a.d();
            int i3 = xab.k.f303829b[bVar4.ordinal()];
            if (i3 == 1 || i3 == 2) {
                PinCodeHinter.INSTANCE.getClass();
                pinCodeHinterB = PinCodeHinter.Companion.b();
            } else {
                PinCodeHinter.INSTANCE.getClass();
                pinCodeHinterB = PinCodeHinter.Companion.a();
            }
            TextLocalisedClause textLocalisedClauseA = !zContains ? Companion.a(INSTANCE, R$string.auth_action_forgot) : null;
            if (z) {
                Companion companion = INSTANCE;
                int i5 = R$string.profile_app_version;
                TextClause textClause = new TextClause(L().C().f(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                companion.getClass();
                textLocalisedClause = new TextLocalisedClause(i5, zhm.u.c(textClause), null);
            } else {
                textLocalisedClause = null;
            }
            h0 h0Var = this.f82688v0;
            if (h0Var == null || (aVar = (zm0.a) F(h0Var, "PasscodeMetadata")) == null) {
                aVar = (zm0.a) e0.E(kotlin.coroutines.g.f186406a, new n(this, continuation, i));
            }
            Integer num = aVar.f323318a;
            if (num != null) {
                placeholder = new PinCodeView.Mode.Placeholder(num.intValue());
            }
            PinCodeView pinCodeView2 = this.m0;
            if (pinCodeView2 == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            pinCodeView2.setMode(placeholder, focus);
            PinCodeView pinCodeView3 = this.m0;
            if (pinCodeView3 == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            pinCodeView3.setPinCodeHinter(pinCodeHinterB);
            PinCodeView pinCodeView4 = this.m0;
            if (pinCodeView4 == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            pinCodeView4.setBottomInfo(textLocalisedClauseA, textLocalisedClause);
            long jLongValue = ((Number) e0.E(kotlin.coroutines.g.f186406a, new o(this, null, 0))).longValue();
            if (jLongValue > 0) {
                e eVar = this.g0;
                if (eVar != null) {
                    eVar.b();
                }
                e0(jLongValue);
            } else {
                PinCodeView pinCodeView5 = this.m0;
                if (pinCodeView5 == null) {
                    Intrinsics.r("pinCodeView");
                    throw null;
                }
                pinCodeView5.setWarningText(null);
            }
            PinCodeView pinCodeView6 = this.m0;
            if (pinCodeView6 == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            Companion companion2 = INSTANCE;
            pinCodeView6.setFingerPrintModeInfo(Companion.a(companion2, R$string.fingerprint_title), Companion.a(companion2, com.revolut.retail.common.ui.R$string.pincode_use_password));
            d0(bVar4);
            pd.b.p(view, new TextLocalisedClause(R$string.passcode, null, null, 14));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sab.b bVar5 = this.f0;
            ((opi.b) this.Q0.getValue()).Y("DIALOG_LOGOUT_DELEGATES", zhm.u.c(this.R0));
            d0(bVar5);
            PinCodeView pinCodeView7 = this.m0;
            if (pinCodeView7 == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            pinCodeView7.setMode(placeholder, focus);
            PinCodeView pinCodeView8 = this.m0;
            if (pinCodeView8 == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            Companion companion3 = INSTANCE;
            pinCodeView8.setFingerPrintModeInfo(Companion.a(companion3, R$string.fingerprint_title), Companion.a(companion3, com.revolut.retail.common.ui.R$string.pincode_use_password));
            od0.a aVar3 = od0.a.f224253a;
            TextLocalisedClause textLocalisedClause2 = (od0.a.e() || od0.a.d()) ? new TextLocalisedClause(R$string.profile_app_version, zhm.u.c(L().C().f()), null) : null;
            TwinVerticalButton twinVerticalButton = this.f82683n0;
            if (twinVerticalButton == null) {
                Intrinsics.r("biometricOnlyFallbackButtons");
                throw null;
            }
            twinVerticalButton.setFabEnabled(false);
            twinVerticalButton.setGradientBackgroundEnabled(false);
            twinVerticalButton.setMainButtonText(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_biometry_buttons_unlock_title, null, null, 14));
            twinVerticalButton.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
            twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_biometry_buttons_logout_title, null, null, 14));
            twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
            if (textLocalisedClause2 != null) {
                ViewGroup.LayoutParams layoutParams = twinVerticalButton.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                marginLayoutParams.bottomMargin = kli.a.k(contextRequireContext, 32.0f);
                twinVerticalButton.setLayoutParams(marginLayoutParams);
            }
            PinCodeView pinCodeView9 = this.m0;
            if (pinCodeView9 == null) {
                Intrinsics.r("pinCodeView");
                throw null;
            }
            pinCodeView9.setBottomInfo(null, textLocalisedClause2);
        }
        if (((doi.a) this.M0.getValue()).f116575a.f25551b) {
            aoi.g.a().f("APP_TO_LOGIN_STARTUP_TIME_COLD_START");
            od0.a aVar4 = od0.a.f224253a;
            if (od0.a.f()) {
                aoi.g.a().f("APP_TO_LOGIN_STARTUP_TIME_COLD_START_NO_PARALLEL");
            } else {
                aoi.g.a().d("APP_TO_LOGIN_STARTUP_TIME_COLD_START_NO_PARALLEL");
            }
            aoi.g.a().d("APP_TO_LOGIN_STARTUP_TIME_COLD_START_PARALLEL");
        }
        if (n0()) {
            NavBarWithContainerBackground navBarWithContainerBackground = this.D0;
            if (navBarWithContainerBackground != null) {
                G(navBarWithContainerBackground);
            } else {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new n(this, continuation, 4), 3);
            }
        }
        sab.b bVar6 = this.f0;
        if ((bVar6 == bVar3 || bVar6 == bVar2) && bVar6 == bVar3) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.getWindow().setBackgroundDrawable(new ColorDrawable(kli.a.s(R$attr.uikit_windowBackground, fragmentActivityRequireActivity)));
            OneShotPreDrawListener.add(view, new r8.d(21, view, false, fragmentActivityRequireActivity));
        }
        io.a.a("loginFragmentViewCreatedFinished");
        PinCodeView pinCodeView10 = this.m0;
        if (pinCodeView10 != null) {
            ne9.a.a(pinCodeView10, basicNavBar);
        } else {
            Intrinsics.r("pinCodeView");
            throw null;
        }
    }

    public final void p0() {
        TwinVerticalButton twinVerticalButton = this.f82683n0;
        if (twinVerticalButton != null) {
            twinVerticalButton.setVisibility(0);
        } else {
            Intrinsics.r("biometricOnlyFallbackButtons");
            throw null;
        }
    }

    public final void q0() {
        if (!isResumed() || isDetached() || !isAdded() || requireActivity().getSupportFragmentManager().getFragments().size() > 1) {
            return;
        }
        e eVar = this.g0;
        rm0.j jVarA = eVar != null ? eVar.a(this) : null;
        if (jVarA instanceof rm0.d) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "LoginFragment", "biometricPromptProvider.startListening result: CertificateExistWithCipher", null, null, 16);
            return;
        }
        if (Intrinsics.f(jVarA, rm0.c.f255146a)) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "LoginFragment", "biometricPromptProvider.startListening result: CertificateAbsent", null, h0Var);
            z0(this);
            return;
        }
        if (jVarA instanceof rm0.f) {
            Throwable th10 = ((rm0.f) jVarA).f255156a;
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "LoginFragment", "biometricPromptProvider.startListening result: CertificateFail", th10, h0Var2);
            z0(this);
            return;
        }
        if (!Intrinsics.f(jVarA, rm0.g.f255157a)) {
            if (jVarA != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            zhm.h0 h0Var3 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "LoginFragment", "biometricPromptProvider.startListening result: CertificateInvalidated", null, h0Var3);
            z0(this);
        }
    }

    @Override // hx0.m
    public final View v() {
        return this.j0;
    }
}
