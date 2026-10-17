package rp0;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.layouts.UIKitCoordinatorLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import com.revolut.core.ui_kit_resources.R$color;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f256133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f256134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BottomExpandableDialogView.b f256135c;
    public final View d;
    public final View e;
    public final BottomExpandableDialogView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitCoordinatorLayout f256136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f256137h;
    public final rlh.d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q2j.k f256138j;
    public final n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f256139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f256140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f256141n;
    public Clause o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Clause f256142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f0 f256143q;

    public o(Context context, ViewGroup parentView, BottomExpandableDialogView.b config) {
        Window window;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f256133a = context;
        this.f256134b = parentView;
        this.f256135c = config;
        View decorView = null;
        View viewInflate = View.inflate(context, R$layout.internal_view_bottom_expandable_dialog_container, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.d = viewInflate;
        Context context2 = viewInflate.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Activity activityM = kli.a.m(context2);
        if (activityM != null && (window = activityM.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        this.e = decorView;
        View viewFindViewById = viewInflate.findViewById(R$id.bottomExpandableDialog);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        BottomExpandableDialogView bottomExpandableDialogView = (BottomExpandableDialogView) viewFindViewById;
        this.f = bottomExpandableDialogView;
        View viewFindViewById2 = viewInflate.findViewById(R$id.bottomDialogCoordinatorLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        UIKitCoordinatorLayout uIKitCoordinatorLayout = (UIKitCoordinatorLayout) viewFindViewById2;
        this.f256136g = uIKitCoordinatorLayout;
        View viewFindViewById3 = viewInflate.findViewById(R$id.bottomDialogDimOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f256137h = viewFindViewById3;
        this.i = new rlh.d0(this, 15);
        this.f256138j = new q2j.k(24);
        this.k = new n(this, 0);
        this.f256139l = new n(this, 1);
        this.f256140m = new Handler(Looper.getMainLooper());
        this.f256143q = new f0(context);
        bottomExpandableDialogView.setHideable(true);
        bottomExpandableDialogView.r0(cr0.h.HIDDEN, false);
        bottomExpandableDialogView.setDisableExpandingForShortContent(true);
        bottomExpandableDialogView.setCalculateHeightOnce(false);
        bottomExpandableDialogView.setUpdateImportantForAccessibilityOnSiblings(true);
        bottomExpandableDialogView.setupDialog(config);
        uIKitCoordinatorLayout.setReadableAreaGuidelinesEnabled(true);
    }

    public static cr0.g f(u uVar) {
        x xVar;
        DialogHeaderView.a aVar;
        DialogHeaderView.b gVar;
        boolean z = uVar instanceof s;
        DialogHeaderView.b bVar = null;
        if (z) {
            xVar = null;
        } else {
            if (!(uVar instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
            xVar = ((t) uVar).f256176c;
        }
        if (z) {
            aVar = ((s) uVar).f256161a;
        } else {
            if (!(uVar instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = null;
        }
        Clause title = uVar.getTitle();
        Clause description = uVar.getDescription();
        Parcelable analyticsContext = uVar.getAnalyticsContext();
        if (xVar != null) {
            if (xVar instanceof w) {
                w wVar = (w) xVar;
                gVar = new com.revolut.core.ui_kit.views.h(wVar.f256207b, wVar.f256206a);
            } else {
                if (!(xVar instanceof v)) {
                    throw new NoWhenBranchMatchedException();
                }
                v vVar = (v) xVar;
                gVar = new com.revolut.core.ui_kit.views.g(vVar.f256200a, vVar.f256201b);
            }
            bVar = gVar;
        }
        return new cr0.g(title, description, bVar, aVar, analyticsContext);
    }

    public final void a(y model, boolean z) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (this.f256141n) {
            return;
        }
        this.f256141n = true;
        this.f256143q.b();
        n nVar = this.f256139l;
        ViewGroup viewGroup = this.f256134b;
        viewGroup.removeCallbacks(nVar);
        n nVar2 = this.k;
        if (z) {
            nVar2.run();
            j(model.d);
        } else if (viewGroup.isInLayout()) {
            viewGroup.post(nVar2);
            viewGroup.post(new p6.e(this, model, 10));
        } else if (!viewGroup.isLaidOut()) {
            viewGroup.addOnLayoutChangeListener(new bx0.v(this, model, 13));
        } else {
            nVar2.run();
            j(model.d);
        }
    }

    public final void b() {
        if (this.f256141n) {
            this.f256141n = false;
            this.f256143q.a();
            BottomExpandableDialogView bottomExpandableDialogView = this.f;
            if (bottomExpandableDialogView.getFocusedChild() != null) {
                bottomExpandableDialogView.clearFocus();
            }
            n nVar = this.k;
            ViewGroup viewGroup = this.f256134b;
            viewGroup.removeCallbacks(nVar);
            boolean zIsInLayout = viewGroup.isInLayout();
            n nVar2 = this.f256139l;
            if (zIsInLayout) {
                viewGroup.post(nVar2);
            } else {
                nVar2.run();
            }
        }
    }

    public final BottomExpandableDialogView c() {
        return this.f;
    }

    public final void d(long j2) {
        this.f256143q.a();
        cr0.h state = cr0.h.HIDDEN;
        Intrinsics.checkNotNullParameter(state, "state");
        Handler handler = this.f256140m;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new p6.e(this, state, 11), j2);
        pd.b.p(this.d, null);
    }

    public final void e(y model, int i, boolean z) {
        int iK;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f256143q.b();
        boolean z3 = this.f256135c instanceof BottomExpandableDialogView.b.a;
        BottomExpandableDialogView bottomExpandableDialogView = this.f;
        if (z3) {
            Integer num = model.f;
            if (num != null) {
                iK = num.intValue();
            } else {
                Context context = bottomExpandableDialogView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, 160.0f);
            }
            bottomExpandableDialogView.setAnchoredStateOffset(iK);
        }
        Context context2 = bottomExpandableDialogView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        knm.b.A(kli.a.s(i, context2), bottomExpandableDialogView);
        List<? extends koi.j> list = model.f256217a;
        u uVar = model.f256218b;
        bottomExpandableDialogView.setItems(list, uVar != null ? f(uVar) : null);
        bottomExpandableDialogView.setTag(model.f256221h);
        pd.b.p(this.d, model.f256223l);
        i(model);
        cr0.h state = cr0.h.ANCHORED;
        Handler handler = this.f256140m;
        if (z) {
            Intrinsics.checkNotNullParameter(state, "state");
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new p6.e(this, state, 11), 0L);
        } else {
            Intrinsics.checkNotNullParameter(state, "state");
            handler.removeCallbacksAndMessages(null);
            bottomExpandableDialogView.r0(state, true);
        }
        g(model);
    }

    public final void g(y yVar) {
        Clause title;
        u uVar = yVar.f256218b;
        Clause clause = yVar.f256223l;
        Parcelable parcelable = yVar.k;
        Object obj2 = yVar.f256222j;
        if (uVar == null || (title = uVar.getTitle()) == null) {
            Iterator it8 = yVar.f256217a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    title = null;
                    break;
                }
                koi.j jVar = (koi.j) it8.next();
                PromptContentDelegate.Model model = jVar instanceof PromptContentDelegate.Model ? (PromptContentDelegate.Model) jVar : null;
                title = model != null ? model.f53057b : null;
                if (title != null) {
                    break;
                }
            }
        }
        BottomExpandableDialogView bottomExpandableDialogView = this.f;
        if (title != null && !title.equals(this.f256142p)) {
            Clause clause2 = title;
            or0.u.k(bottomExpandableDialogView).n0().d(this.d, clause2, "BottomSheet", obj2, parcelable);
            this.f256142p = clause2;
        } else if (clause != null && !clause.equals(this.f256142p)) {
            or0.u.k(bottomExpandableDialogView).n0().d(this.d, null, "BottomSheet", obj2, parcelable);
            this.f256142p = clause;
        } else if (this.f256142p == null) {
            or0.u.k(bottomExpandableDialogView).n0().d(this.d, null, "BottomSheet", obj2, parcelable);
            this.f256142p = new TextClause("BottomSheet", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
    }

    public final void h(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        List<? extends koi.j> list = model.f256217a;
        u uVar = model.f256218b;
        cr0.g gVarF = uVar != null ? f(uVar) : null;
        BottomExpandableDialogView bottomExpandableDialogView = this.f;
        bottomExpandableDialogView.setItems(list, gVarF);
        bottomExpandableDialogView.setTag(model.f256221h);
        pd.b.p(this.d, model.f256223l);
        i(model);
        g(model);
    }

    public final void i(y yVar) {
        Clause title = yVar.f256223l;
        if (title == null) {
            u uVar = yVar.f256218b;
            title = uVar != null ? uVar.getTitle() : null;
        }
        if (Intrinsics.f(this.o, title)) {
            return;
        }
        this.o = title;
        View view = this.d;
        if (title != null) {
            pd.b.o(view, new TextLocalisedClause(R$string.uikit_dialog_description, zhm.u.c(title), null, 12));
        } else {
            pd.b.o(view, title);
        }
    }

    public final void j(boolean z) {
        BottomExpandableDialogView bottomExpandableDialogView = this.f;
        if (!z) {
            View view = bottomExpandableDialogView.K;
            if (view != null) {
                view.setBackgroundColor(0);
            }
            View view2 = bottomExpandableDialogView.J;
            if (view2 != null) {
                view2.setBackgroundColor(0);
                return;
            }
            return;
        }
        int color = this.f256133a.getColor(R$color.internal_background_80_night);
        View view3 = bottomExpandableDialogView.K;
        if (view3 != null) {
            view3.setBackgroundColor(color);
        }
        View view4 = bottomExpandableDialogView.J;
        if (view4 != null) {
            view4.setBackgroundColor(color);
        }
    }
}
