package rp0;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.p5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomExpandableDialogView.b f256117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f256118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f256119c;
    public LifecycleOwner d;
    public mki.c e;
    public o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f256120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f256121h;
    public p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f256122j;
    public Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f256123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function0 f256124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function0 f256125n;
    public final ihm.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.f f256126p;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f256127a;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f256127a, ((a) obj2).f256127a);
        }

        public final int hashCode() {
            Object obj2 = this.f256127a;
            if (obj2 == null) {
                return 0;
            }
            return obj2.hashCode();
        }

        public a(Object obj2) {
            this.f256127a = obj2;
        }
    }

    public static final class b {
        private b() {
        }
    }

    public m(BottomExpandableDialogView.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f256117a = config;
        this.f256120g = true;
        this.f256121h = v0.a.d("create(...)");
        this.i = p.USER;
        this.o = v0.a.d("create(...)");
        this.f256126p = v0.a.d("create(...)");
    }

    public final boolean a() {
        BottomExpandableDialogView bottomExpandableDialogViewC;
        o oVar = this.f;
        if (oVar == null || (bottomExpandableDialogViewC = oVar.c()) == null) {
            return false;
        }
        return bottomExpandableDialogViewC.isShown();
    }

    public final void b(boolean z) {
        this.i = p.PROGRAMMATICALLY;
        o oVar = this.f;
        if (oVar != null) {
            oVar.d(z ? 300L : 0L);
        }
    }

    public final efm.b c() {
        if (this.f == null) {
            return pfm.m.f235744a;
        }
        efm.r rVarFilter = h().filter(new rof.e(14, new rnd.k(29)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        efm.r rVarFromCallable = efm.r.fromCallable(new nc0.a(this, 27));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        efm.d0 d0VarFirstOrError = te0.w.F0(rVarFilter, rVarFromCallable).firstOrError();
        d0VarFirstOrError.getClass();
        return new pfm.h(d0VarFirstOrError, 4);
    }

    public final void d(ViewGroup holderView) {
        Intrinsics.checkNotNullParameter(holderView, "holderView");
        Context context = holderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        if (activityI == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c0 c0Var = new c0(this, holderView, activityI);
        if (holderView.isAttachedToWindow()) {
            c0Var.onViewAttachedToWindow(holderView);
        }
        holderView.addOnAttachStateChangeListener(c0Var);
    }

    public final void e(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        mki.c cVar = this.e;
        if (cVar != null) {
            LifecycleOwner lifecycleOwner = this.d;
            if (lifecycleOwner == null) {
                Intrinsics.r("lifecycleOwner");
                throw null;
            }
            lifecycleOwner.getLifecycle().removeObserver(cVar);
        }
        this.e = null;
        o oVar = this.f;
        if (oVar != null) {
            this.f = null;
            oVar.b();
        }
        this.f256118b = viewGroup;
        this.d = activity;
        this.f256119c = activity;
    }

    public final efm.r f() {
        efm.r map = h().skip(1L).filter(new rof.e(11, new rnd.k(25))).map(new rof.e(13, new k(this, 2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r g() {
        efm.r map = h().skip(1L).filter(new rof.e(6, new rnd.k(26))).map(new rof.e(7, new rnd.k(27)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r h() {
        efm.r rVarStartWith = this.f256121h.startWith((efm.w) efm.r.fromCallable(new af.d(new eki.e(this), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        efm.r rVarDistinctUntilChanged = rVarStartWith.map(new pv9.b(new no.f2(this, 12), 16)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final void i(Function0 delegatesProvider) {
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
        this.f256125n = null;
        this.f256124m = delegatesProvider;
        o oVar = this.f;
        if (oVar != null) {
            j(oVar.c());
        }
    }

    public final void j(BottomExpandableDialogView bottomExpandableDialogView) {
        z4l.j jVar;
        List<? extends koi.k> list;
        Function0 function0 = this.f256124m;
        if (function0 != null) {
            if (function0 == null || (list = (List) function0.invoke()) == null) {
                return;
            }
            bottomExpandableDialogView.setupRecyclerView(list, new DefaultItemAnimator());
            return;
        }
        Function0 function02 = this.f256125n;
        if (function02 == null || function02 == null || (jVar = (z4l.j) function02.invoke()) == null) {
            return;
        }
        bottomExpandableDialogView.setupRecyclerView(jVar, new DefaultItemAnimator());
    }

    public final void k(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        l(model, true);
    }

    public final void l(y model, boolean z) {
        Context contextThemeWrapper;
        int i;
        Intrinsics.checkNotNullParameter(model, "model");
        this.i = p.USER;
        this.k = model.d();
        this.f256123l = model.c();
        BottomExpandableDialogView.b bVar = this.f256117a;
        boolean z3 = bVar instanceof BottomExpandableDialogView.b.C0433b;
        if (z3) {
            Context context = this.f256119c;
            if (context == null) {
                Intrinsics.r("context");
                throw null;
            }
            contextThemeWrapper = new ContextThemeWrapper(context, R$style.UiKitThemeOverlay_Elevated);
        } else {
            if (!(bVar instanceof BottomExpandableDialogView.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = b0.f256048a[model.b().ordinal()];
            if (i2 == 1) {
                Context context2 = this.f256119c;
                if (context2 == null) {
                    Intrinsics.r("context");
                    throw null;
                }
                contextThemeWrapper = new ContextThemeWrapper(context2, R$style.UiKitThemeOverlay_Elevated);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                contextThemeWrapper = this.f256119c;
                if (contextThemeWrapper == null) {
                    Intrinsics.r("context");
                    throw null;
                }
            }
        }
        o oVar = this.f;
        if (oVar == null) {
            ViewGroup viewGroup = this.f256118b;
            if (viewGroup == null) {
                Intrinsics.r("parentView");
                throw null;
            }
            oVar = new o(contextThemeWrapper, viewGroup, bVar);
            this.f = oVar;
            j(oVar.c());
            oVar.c().i0();
            oVar.c().setNeedDrawToolbarShadow(this.f256120g);
            oVar.c().getStateChangeEvents().subscribe(new rof.e(8, new rgf.m(oVar, this, 18)));
            oVar.c().n0().subscribe(new rof.e(9, new k(this, 0)));
            oVar.c().o0().subscribe(new rof.e(10, new k(this, 1)));
        }
        if (z3) {
            i = R$attr.uikit_colorElevatedGroupedBackground;
        } else {
            if (!(bVar instanceof BottomExpandableDialogView.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = b0.f256048a[model.b().ordinal()];
            if (i3 == 1) {
                i = R$attr.uikit_colorElevatedGroupedBackground;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$attr.uikit_colorElevatedBackground;
            }
        }
        oVar.a(model, !z);
        oVar.e(model, i, z);
        if (this.e == null) {
            mki.c cVar = new mki.c(this, 1);
            LifecycleOwner lifecycleOwner = this.d;
            if (lifecycleOwner == null) {
                Intrinsics.r("lifecycleOwner");
                throw null;
            }
            lifecycleOwner.getLifecycle().addObserver(cVar);
            this.e = cVar;
        }
    }

    public final void m(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        o oVar = this.f;
        if (oVar == null) {
            return;
        }
        if (!Intrinsics.f(model.c(), this.f256123l)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.s("Trying to update bottom sheet with the different delegates set. Expected=", this.f256123l, ", given=", model.c()));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            return;
        }
        this.k = model.d();
        oVar.h(model);
        if (this.f256122j) {
            this.f256122j = false;
            b(true);
        }
    }

    public m() {
        this(new BottomExpandableDialogView.b.a(0, (p5) null, 7));
    }
}
