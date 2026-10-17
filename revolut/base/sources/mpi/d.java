package mpi;

import akl.s;
import android.app.Activity;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import c86.f;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import e0f.m;
import efm.r;
import ie.b0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m08.i;
import ml3.y;
import mx0.xb;
import mx0.yb;
import mx0.zb;
import nii.e0;
import nii.t0;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends fsi.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final fsi.b f207819m = new fsi.b("CONNECTIVITY_DELEGATE_ID");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final zb f207820n = new zb(new TextLocalisedClause(R$string.connection_view_no_connection, null, null, 14), yb.Grey, Long.valueOf(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS));
    public static final zb o = new zb(new TextLocalisedClause(R$string.connection_view_back_online, null, null, 14), yb.LightBlue, 1000L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f207821h;
    public final b80.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f207822j;
    public xb k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t0 f207823l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, b80.c networkStateRepository) {
        super(f207819m);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f207821h = activity;
        this.i = networkStateRepository;
        this.f207822j = new AtomicBoolean(true);
    }

    public final xb N() {
        xb xbVar = this.k;
        if (xbVar != null) {
            return xbVar;
        }
        Activity activity = this.f207821h;
        View rootView = activity.getWindow().getDecorView().getRootView();
        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        xb xbVar2 = (xb) viewGroup.findViewWithTag("ConnectionStatusBarBannerView");
        if (xbVar2 == null) {
            xbVar2 = new xb(activity, null, 6, 0);
            xbVar2.setTag("ConnectionStatusBarBannerView");
            viewGroup.addView(xbVar2);
        }
        this.k = xbVar2;
        return xbVar2;
    }

    public final void O() {
        xb xbVar = this.k;
        if (xbVar != null) {
            xbVar.a();
        }
        t0 t0Var = this.f207823l;
        if (t0Var != null) {
            t0Var.j(true);
        }
    }

    public final void Q(b viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        int i = c.f207818b[viewType.ordinal()];
        if (i == 1) {
            if (this.f207822j.compareAndSet(true, false)) {
                N().c(f207820n);
                return;
            }
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        O();
        boolean zB = this.i.b();
        y0 y0Var = new y0(null, new e0((Clause) new TextLocalisedClause(!zB ? R$string.offline_widget_title : R$string.connection_error_title, null, null, 14), (Clause) new TextLocalisedClause(!zB ? R$string.offline_widget_description : R$string.connection_error_description, null, null, 14), new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), (Parcelable) null, true, (AnalyticsProduct) null, 980), false, 5);
        t0 t0Var = this.f207823l;
        if (t0Var == null) {
            t0Var = new t0(this.f207821h);
            this.f207823l = t0Var;
            y yVar = new y(this, 24);
            Function1 function1M = M();
            Function0 function0L = L();
            r rVarOnErrorResumeNext = t0Var.f216224h.onErrorResumeNext(new m(4, new i(new BreadcrumbException(), 29)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new gn.b(4, yVar), new gn.b(4, function1M), new f(7, function0L));
            w.j0(this.d, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
        }
        t0Var.h(y0Var);
    }

    @Override // fsi.a
    public final void onStart() {
        efm.i flowable = this.i.c(true).toFlowable(efm.a.DROP);
        flowable.getClass();
        r rVarSwitchMap = new j01.b(flowable, 7).switchMap(new b0(new jli.f(14), 8));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r rVarF = o70.a.f(rVarSwitchMap);
        s sVar = new s(this, 26);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new m(4, new bo.c(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new gn.b(4, sVar), new gn.b(4, function1M), new f(7, function0L));
        w.j0(this.f137706c, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        O();
        super.onStop();
    }
}
