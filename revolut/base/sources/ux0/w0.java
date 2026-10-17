package ux0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.OneShotPreDrawListener;
import aw0.a9;
import aw0.x8;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV1;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.l2;
import ms0.o2;
import ms0.q2;
import ms0.r2;
import ms0.s2;
import mx0.d2;
import org.jetbrains.annotations.NotNull;
import tx0.g4;
import tx0.u2;

/* JADX INFO: loaded from: classes20.dex */
public class w0 extends t0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductIntroView f283831b;
    public final ActionsView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HorizontalStepsProgressView f283832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FooterTextView f283833h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b1 f283834j;
    public b1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u2 f283835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f283836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Set f283837n;
    public OneShotPreDrawListener o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f283838p;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int iK = kli.a.k(context, 570.0f);
        this.i = te0.w.y0(new ts0.t(context, 3));
        int i = R$id.productIntroNavBarContent_introView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ProductIntroView productIntroView = new ProductIntroView(context2, null, 0, s2.REGULAR, 6);
        productIntroView.setId(i);
        productIntroView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, iK));
        productIntroView.setVideoPlayerDetachBehaviour$ui_kit_components_release(jv0.s.STOP_ON_DETACH);
        productIntroView.setErrorStateBehaviour(l2.FINISH);
        this.f283831b = productIntroView;
        int i2 = R$id.productIntroNavBarContent_actionsView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ActionsView actionsView = new ActionsView(context3, null, 6, 0);
        actionsView.setId(i2);
        actionsView.setLayoutType(mx0.l.HEADER_CIRCLE_ACTIONS);
        actionsView.setLongClickable(true);
        actionsView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        this.f = actionsView;
        int i3 = R$id.productIntroNavBarContent_progressView;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        HorizontalStepsProgressView horizontalStepsProgressView = new HorizontalStepsProgressView(context4, null, 6, 0);
        horizontalStepsProgressView.setId(i3);
        Context context5 = horizontalStepsProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int iK2 = kli.a.k(context5, 200.0f);
        Context context6 = horizontalStepsProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        horizontalStepsProgressView.setLayoutParams(new ViewGroup.MarginLayoutParams(iK2, kli.a.k(context6, 4.0f)));
        Context context7 = horizontalStepsProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        horizontalStepsProgressView.setBaseColor(kli.a.s(R$attr.uikit_colorGreyTone20, context7));
        Context context8 = horizontalStepsProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        horizontalStepsProgressView.setProgressColor(kli.a.s(R$attr.uikit_colorAccent, context8));
        horizontalStepsProgressView.setProgressBarRadiusDp(100.0f);
        this.f283832g = horizontalStepsProgressView;
        int i5 = R$id.internal_productIntroNavBarContent_disclaimerTextView;
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        FooterTextView footerTextView = new FooterTextView(context9, null, 6, 0);
        footerTextView.setId(i5);
        Context context10 = footerTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        int iK3 = kli.a.k(context10, 16.0f);
        Context context11 = footerTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        footerTextView.setPadding(iK3, 0, kli.a.k(context11, 16.0f), 0);
        this.f283833h = footerTextView;
        addView(productIntroView);
        addView(actionsView);
        addView(horizontalStepsProgressView);
        addView(footerTextView);
        actionsView.setVisibility(8);
        horizontalStepsProgressView.setVisibility(8);
        footerTextView.setVisibility(8);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(productIntroView.getId(), 3, 0, 3);
        int iK4 = kli.a.k(context, 16.0f);
        actionsView.setPadding(actionsView.getPaddingLeft(), iK4, actionsView.getPaddingRight(), actionsView.getPaddingBottom());
        constraintSet.connect(actionsView.getId(), 3, productIntroView.getId(), 4);
        constraintSet.setMargin(actionsView.getId(), 3, -iK4);
        constraintSet.connect(horizontalStepsProgressView.getId(), 4, 0, 4);
        constraintSet.connect(horizontalStepsProgressView.getId(), 6, 0, 6);
        constraintSet.connect(horizontalStepsProgressView.getId(), 7, 0, 7);
        constraintSet.connect(horizontalStepsProgressView.getId(), 3, productIntroView.getId(), 4);
        constraintSet.connect(footerTextView.getId(), 3, actionsView.getId(), 4);
        constraintSet.connect(footerTextView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
        setMinimumHeight(iK);
        int i6 = 6;
        productIntroView.f56312x.subscribe(new uwf.b(i6, new g4(1, this, w0.class, "handleIntroViewState", "handleIntroViewState(Lcom/revolut/core/ui_kit/internal/views/ProductIntroView$State;)V", 0, 28)));
    }

    public static /* synthetic */ void getOneShotPreDrawListener$ui_kit_components_release$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final x8 getProductIntroColorPalette() {
        return (x8) this.i.getValue();
    }

    @Override // tx0.x2
    public final void H(int i) {
        this.f283836m = i;
        i0();
    }

    @Override // ux0.t0, tx0.x2
    public final ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ViewGroup.LayoutParams(-1, -2);
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
    }

    @Override // ux0.t0, tx0.x2
    public final void d0(int i) {
        this.f283831b.d0(i);
    }

    @Override // ux0.t0
    public final efm.r f0() {
        return this.f.f58296a.f121375b;
    }

    @Override // ux0.t0
    public final efm.r g0() {
        return this.f.d.f121375b;
    }

    @Override // ux0.t0
    @NotNull
    public View getActionsForTransition() {
        return this.f;
    }

    @Override // ux0.t0
    public int getDisclaimerHeightForTransition() {
        FooterTextView footerTextView = this.f283833h;
        if (footerTextView.getVisibility() == 0) {
            return footerTextView.getHeight() - this.f283836m;
        }
        return 0;
    }

    public final OneShotPreDrawListener getOneShotPreDrawListener$ui_kit_components_release() {
        return this.o;
    }

    @Override // ux0.t0
    public final efm.r h0() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    public final void i0() {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        ActionsView actionsView = this.f;
        actionsView.setPadding(actionsView.getPaddingLeft(), actionsView.getPaddingTop(), actionsView.getPaddingRight(), 0);
        or0.u.y(this.f283832g, 0, 0, 0, 0, 7);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 16.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        kli.a.k(context2, 24.0f);
        b1 b1Var = this.f283834j;
        if (b1Var instanceof a1) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.f283836m + iK);
            return;
        }
        if (b1Var instanceof z0) {
            FooterTextView footerTextView = this.f283833h;
            if (footerTextView.getVisibility() == 0) {
                footerTextView.setPadding(footerTextView.getPaddingLeft(), footerTextView.getPaddingTop(), footerTextView.getPaddingRight(), this.f283836m + iK);
                actionsView.setPadding(actionsView.getPaddingLeft(), actionsView.getPaddingTop(), actionsView.getPaddingRight(), iK);
                return;
            }
        }
        if ((this.f283834j instanceof z0) && actionsView.getVisibility() == 0) {
            actionsView.setPadding(actionsView.getPaddingLeft(), actionsView.getPaddingTop(), actionsView.getPaddingRight(), this.f283836m + iK);
        } else {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.f283836m);
        }
    }

    public final void j0(b1 b1Var) throws Throwable {
        b1 b1Var2 = b1Var;
        if (b1Var2 != null) {
            boolean z = b1Var2 instanceof a1;
            b1 x0Var = b1Var2;
            if (!z) {
                boolean z3 = b1Var2 instanceof y0;
                x0Var = b1Var2;
                if (!z3) {
                    if (!(b1Var2 instanceof x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x0 x0Var2 = (x0) b1Var2;
                    List list = x0Var2.f283843c;
                    tx0.u uVar = x0Var2.f283841a;
                    ActionsView actionsView = this.f;
                    uVar.a(actionsView);
                    ArrayList arrayListU = zhm.w.u(actionsView.getHiddenActions$ui_kit_components_release());
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it8 = arrayListU.iterator();
                    while (it8.hasNext()) {
                        linkedHashSet.add(((ActionsView.Item) it8.next()).f58316a);
                    }
                    List list2 = x0Var2.f283842b;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        linkedHashSet2.add(((ActionsView.Item) it9.next()).f58316a);
                    }
                    Object layoutManager = actionsView.f58305p.getLayoutManager();
                    boolean z4 = (layoutManager instanceof mx0.h ? (mx0.h) layoutManager : null) == null ? false : !r6.a().isEmpty();
                    ArrayList stories = new ArrayList();
                    for (Object obj2 : list) {
                        Set set = ((NavBarProductIntro$StoryV1) obj2).d;
                        if (!set.isEmpty()) {
                            Set<String> set2 = set;
                            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                for (String str : set2) {
                                    if ((!linkedHashSet2.contains(str) || linkedHashSet.contains(str)) && (!Intrinsics.f(str, actionsView.getMoreActionState().f209895a) || !z4)) {
                                    }
                                }
                            }
                        }
                        stories.add(obj2);
                    }
                    x0Var = x0Var2;
                    if (list.size() != stories.size()) {
                        tx0.u moreActionId = x0Var2.f283841a;
                        List actions = x0Var2.f283842b;
                        a9 storiesPlaybackStrategy = x0Var2.d;
                        Clause clause = x0Var2.e;
                        Intrinsics.checkNotNullParameter(moreActionId, "moreActionId");
                        Intrinsics.checkNotNullParameter(actions, "actions");
                        Intrinsics.checkNotNullParameter(stories, "stories");
                        Intrinsics.checkNotNullParameter(storiesPlaybackStrategy, "storiesPlaybackStrategy");
                        x0Var = new x0(moreActionId, actions, stories, storiesPlaybackStrategy, clause);
                    }
                }
            }
            if (x0Var.equals(this.k)) {
                return;
            }
            this.k = x0Var;
            boolean z6 = x0Var instanceof y0;
            q2 q2Var = q2.f208383a;
            ProductIntroView productIntroView = this.f283831b;
            if (z6 || (x0Var instanceof a1)) {
                productIntroView.setModel$ui_kit_components_release(q2Var, true);
            } else {
                if (!(x0Var instanceof x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                x0 x0Var3 = (x0) x0Var;
                List list3 = x0Var3.f283843c;
                a9 a9Var = x0Var3.d;
                List<NavBarProductIntro$StoryV1> list4 = list3;
                ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
                for (NavBarProductIntro$StoryV1 navBarProductIntro$StoryV1 : list4) {
                    arrayList.add(new r2(navBarProductIntro$StoryV1.f57870a, navBarProductIntro$StoryV1.f57871b, navBarProductIntro$StoryV1.f57872c, null, null));
                }
                productIntroView.setModel$ui_kit_components_release(new o2(arrayList, a9Var, (d2) null, 12), true);
                Clause clause2 = x0Var3.e;
                int i = clause2 == null ? 8 : 0;
                FooterTextView footerTextView = this.f283833h;
                footerTextView.setVisibility(i);
                footerTextView.setTextClause(clause2);
            }
            i0();
        }
    }

    @Override // ux0.c1
    public final efm.r o() {
        return te0.w.a0(this.f283831b.f56312x, new mqg.b(18));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u2 u2Var = this.f283835l;
        if (u2Var != null) {
            u2Var.a(getProductIntroColorPalette().f10609a, getProductIntroColorPalette().f10610b, getProductIntroColorPalette().f10611c, getProductIntroColorPalette().e);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) throws Throwable {
        super.onLayout(z, i, i2, i3, i5);
        j0(this.f283834j);
    }

    @Override // ms0.j2
    public final void pause() {
        this.f283838p = true;
        this.f283831b.pause();
    }

    @Override // ms0.j2
    public final void resume() {
        this.f283838p = false;
        this.f283831b.resume();
        if (this.f283838p) {
            return;
        }
        Set ids = this.f283837n;
        if (ids != null) {
            ActionsView actionsView = this.f;
            actionsView.getClass();
            Intrinsics.checkNotNullParameter(ids, "ids");
            actionsView.h(ids, mx0.z.f);
        }
        this.f283837n = null;
    }

    @Override // ux0.t0, tx0.x2
    public void setBackgroundOffset(int i) {
    }

    @Override // ux0.t0, tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f283835l = listener;
    }

    @Override // ux0.t0
    public void setModel(@NotNull u0 model) throws Throwable {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!(model instanceof b1)) {
            throw new IllegalStateException("Wrong model received");
        }
        if (Intrinsics.f(this.f283834j, model)) {
            return;
        }
        b1 b1Var = (b1) model;
        this.f283834j = b1Var;
        j0(b1Var);
    }

    public final void setOneShotPreDrawListener$ui_kit_components_release(OneShotPreDrawListener oneShotPreDrawListener) {
        this.o = oneShotPreDrawListener;
    }

    @Override // ux0.t0
    public void setStoriesAlpha(float f) {
        this.f283831b.setAlpha(f);
    }

    public final void setVideoPlayerDetachBehaviour$ui_kit_components_release(@NotNull jv0.s behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.f283831b.setVideoPlayerDetachBehaviour$ui_kit_components_release(behavior);
    }

    @Override // tx0.x2
    public final int w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
