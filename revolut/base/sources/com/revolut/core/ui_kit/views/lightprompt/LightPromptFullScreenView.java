package com.revolut.core.ui_kit.views.lightprompt;

import a5.a;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import aw0.y9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel;
import dx0.c;
import h30.q;
import ihm.f;
import ix0.n1;
import ix0.o1;
import ix0.r1;
import java.util.List;
import koi.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import org.jetbrains.annotations.NotNull;
import vt0.d;
import vt0.h;
import vt0.l;
import vt0.m;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\f\u0012\u0006\b\u0001\u0012\u00020\r0\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/views/lightprompt/LightPromptFullScreenView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lkoi/k;", "Lkoi/j;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "delegates", "", "setDelegates", "(Ljava/util/List;)V", "Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel;", "model", "setModel", "(Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LightPromptFullScreenView extends FrameLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f59148s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f59149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f59150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f59151c;
    public d d;
    public LightPromptViewModel e;
    public y9 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f59152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n1 f59153h;
    public n1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f59154j;
    public final f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f59155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f59156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f59157n;
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f59158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pak.h f59159q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c9 f59160r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightPromptFullScreenView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        n1 n1Var;
        n1 n1Var2;
        y9 y9Var = this.f;
        if (y9Var != null && (n1Var2 = this.f59153h) != null) {
            n1Var2.a(y9Var);
        }
        c cVar = this.f59152g;
        if (cVar == null || (n1Var = this.i) == null) {
            return;
        }
        n1Var.a(cVar);
    }

    public final d b() {
        d dVar = this.d;
        if (dVar != null) {
            return dVar;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d dVar2 = new d(context, null, 6, 0);
        dVar2.setId(R$id.internal_light_prompt_full_screen_content);
        dVar2.setVisibility(8);
        addView(dVar2, 0, new FrameLayout.LayoutParams(-1, -1));
        dVar2.setDelegates(this.f59158p);
        dVar2.f291864n.subscribe(this.f59157n);
        dVar2.g().subscribe(this.f59155l);
        dVar2.setCloseButtonClickListener(this.f59160r);
        dVar2.f291862l.subscribe(this.o);
        dVar2.setEventsListener$ui_kit_components_release(this.f59159q);
        this.d = dVar2;
        return dVar2;
    }

    public final h c() {
        h hVar = this.f59151c;
        if (hVar != null) {
            return hVar;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        h hVar2 = new h(context, null, 6, 0);
        hVar2.setId(R$id.internal_light_prompt_full_screen_content);
        hVar2.setVisibility(8);
        addView(hVar2, 0, new FrameLayout.LayoutParams(-1, -1));
        hVar2.setDelegates(this.f59158p);
        hVar2.z.subscribe(this.f59157n);
        hVar2.q0().subscribe(this.f59155l);
        hVar2.setCloseButtonClickListener(this.f59160r);
        hVar2.f291887t.subscribe(this.o);
        hVar2.setEventsListener$ui_kit_components_release(this.f59159q);
        this.f59151c = hVar2;
        return hVar2;
    }

    public final m d() {
        m mVar = this.f59149a;
        if (mVar != null) {
            return mVar;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        m mVar2 = new m(context, null, 6, 0);
        mVar2.setId(R$id.internal_light_prompt_full_screen_loading);
        mVar2.setVisibility(8);
        addView(mVar2, new FrameLayout.LayoutParams(-1, -1));
        mVar2.setCloseButtonClickListener(this.f59160r);
        this.f59149a = mVar2;
        return mVar2;
    }

    public final void e(ViewGroup viewGroup) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.setVisibility(childAt == viewGroup ? 0 : 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        q qVar;
        q qVar2;
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = R$id.internal_status_bar_controller_tag;
        y9 y9Var = y9.THEME;
        a styleApplicator = new a(19);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
        Activity activityI = z92.f.i(context);
        View viewFindViewById = (activityI == null || (window2 = activityI.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) ? null : decorView2.findViewById(R.id.content);
        if (activityI == null || viewFindViewById == null) {
            qVar = null;
        } else {
            Object tag2 = viewFindViewById.getTag(i);
            r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
            if (r1Var == null) {
                r1Var = new r1();
                viewFindViewById.setTag(i, r1Var);
            }
            qVar = new q(y9Var, styleApplicator, r1Var, context);
        }
        o1 priority = o1.OVERLAY;
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f59153h = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority)) : null);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        int i2 = R$id.internal_navigation_bar_controller_tag;
        c cVar = c.DEFAULT;
        h35.c styleApplicator2 = new h35.c(25);
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(styleApplicator2, "styleApplicator");
        Activity activityI2 = z92.f.i(context2);
        View viewFindViewById2 = (activityI2 == null || (window = activityI2.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
        if (activityI2 == null || viewFindViewById2 == null) {
            qVar2 = null;
        } else {
            Object tag3 = viewFindViewById2.getTag(i2);
            r1 r1Var2 = tag3 instanceof r1 ? (r1) tag3 : null;
            if (r1Var2 == null) {
                r1Var2 = new r1();
                viewFindViewById2.setTag(i2, r1Var2);
            }
            qVar2 = new q(cVar, styleApplicator2, r1Var2, context2);
        }
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.i = new n1(qVar2, qVar2 != null ? Long.valueOf(qVar2.K0(priority)) : null);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n1 n1Var = this.f59153h;
        if (n1Var != null) {
            n1Var.b();
        }
        n1 n1Var2 = this.i;
        if (n1Var2 != null) {
            n1Var2.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f59154j || super.onInterceptTouchEvent(motionEvent);
    }

    public final void setDelegates(@NotNull List<? extends k> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f59158p = delegates;
        h hVar = this.f59151c;
        if (hVar != null) {
            hVar.setDelegates(delegates);
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.setDelegates(delegates);
        }
    }

    public final void setModel(@NotNull LightPromptViewModel model) {
        ViewGroup viewGroupC;
        Intrinsics.checkNotNullParameter(model, "model");
        this.e = model;
        if (model instanceof LightPromptViewModel.Loading) {
            m mVarD = d();
            mVarD.setAlpha(1.0f);
            e(mVarD);
            this.f = y9.THEME;
            this.f59152g = c.TRANSPARENT;
            a();
            return;
        }
        if (!(model instanceof LightPromptViewModel.Error)) {
            if (!(model instanceof LightPromptViewModel.Content)) {
                throw new NoWhenBranchMatchedException();
            }
            LightPromptViewModel.Content content = (LightPromptViewModel.Content) model;
            if (!this.f59154j) {
                if (model instanceof LightPromptViewModel.V2Content) {
                    viewGroupC = b();
                } else if (model instanceof LightPromptViewModel.V1Content) {
                    viewGroupC = c();
                }
                e(viewGroupC);
            }
            if (content instanceof LightPromptViewModel.V2Content) {
                b().setModel((LightPromptViewModel.V2Content) content);
                return;
            } else {
                if (content instanceof LightPromptViewModel.V1Content) {
                    c().setModel((LightPromptViewModel.V1Content) content);
                    return;
                }
                return;
            }
        }
        LightPromptViewModel.Error error = (LightPromptViewModel.Error) model;
        l lVar = this.f59150b;
        if (lVar == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            lVar = new l(context, null, 6, 0);
            lVar.setId(R$id.internal_light_prompt_full_screen_error);
            lVar.setVisibility(8);
            addView(lVar, 0, new FrameLayout.LayoutParams(-1, -1));
            lVar.a().subscribe(this.f59156m);
            lVar.setCloseButtonClickListener(this.f59160r);
            this.f59150b = lVar;
        }
        lVar.setAlpha(1.0f);
        e(lVar);
        this.f = y9.THEME;
        this.f59152g = c.TRANSPARENT;
        a();
        lVar.setModel(error);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightPromptFullScreenView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightPromptFullScreenView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.k = v0.a.d("create(...)");
        this.f59155l = v0.a.d("create(...)");
        this.f59156m = v0.a.d("create(...)");
        this.f59157n = v0.a.d("create(...)");
        this.o = v0.a.d("create(...)");
        this.f59158p = f0.f322471a;
        this.f59159q = new pak.h(this, 25);
        this.f59160r = new c9(this, 18);
    }

    public /* synthetic */ LightPromptFullScreenView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
