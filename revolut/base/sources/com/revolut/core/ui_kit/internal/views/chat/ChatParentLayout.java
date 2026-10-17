package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import au0.r2;
import au0.t1;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import dr0.l;
import dw0.a;
import es.e;
import et0.f0;
import et0.g0;
import et0.h0;
import et0.i0;
import et0.m0;
import et0.n0;
import fp0.g;
import fp0.m;
import fp0.p;
import gp0.f;
import gp0.h;
import hp0.c;
import ix0.l0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.u;
import org.jetbrains.annotations.NotNull;
import pd.b;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0014\u0010:;B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R(\u00103\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatParentLayout;", "Landroid/view/ViewGroup;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "setAvatar", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Let0/h0;", "badgeModel", "setSideStatusBadge", "(Let0/h0;)V", "Let0/g0;", "newModel", "setModel", "(Let0/g0;)V", "Landroid/view/View;", "view", "setBottomAnchorView", "(Landroid/view/View;)V", "Landroid/os/Parcelable;", "a", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getOnAvatarClick", "()Lkotlin/jvm/functions/Function0;", "setOnAvatarClick", "(Lkotlin/jvm/functions/Function0;)V", "onAvatarClick", "c", "getOnSideStatusBadgeClick", "setOnSideStatusBadgeClick", "onSideStatusBadgeClick", "d", "getOnSideStatusBadgeLongClick", "setOnSideStatusBadgeLongClick", "onSideStatusBadgeLongClick", "Lix0/l0;", "l", "Lkotlin/Lazy;", "getCutoutStage", "()Lix0/l0;", "cutoutStage", "et0/m0", "et0/n0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatParentLayout extends ViewGroup implements TrackableItem {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f56823n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Function0 onAvatarClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Function0 onSideStatusBadgeClick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Function0 onSideStatusBadgeLongClick;
    public g0 e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f56827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CircleBadgeView f56828h;
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56829j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Lazy cutoutStage;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p f56831m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatParentLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final l0 getCutoutStage() {
        return (l0) this.cutoutStage.getValue();
    }

    private final void setAvatar(Image image) {
        if (image == null && this.f56827g == null) {
            return;
        }
        ImageView imageView = this.f56827g;
        if (imageView == null) {
            imageView = new ImageView(getContext());
            imageView.setId(R$id.chatBubbleDelegate_avatarView);
            b.q(imageView, false);
            this.f56827g = imageView;
            m mVar = p.Companion;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            h hVar = new h(new c(null, l.c(context, new Color.Solid(R$attr.uikit_colorForeground)), 1), new f(gp0.c.FOREGROUND, 2), new g(new Color.Solid(R$attr.uikit_colorForeground)));
            mVar.getClass();
            this.f56831m = m.a(imageView, hVar);
            addView(this.f56827g);
        }
        ImageView imageView2 = imageView;
        yy0.f.e(u.k(this).Q(), image, imageView2, null, null, 12);
        imageView2.setVisibility(image == null ? 8 : 0);
    }

    private final void setSideStatusBadge(h0 badgeModel) {
        DangerCircleBadge dangerCircleBadge;
        int i = i0.f129049a[badgeModel.f129034a.ordinal()];
        SpannableStringBuilder spannableStringBuilderA = null;
        if (i == 1) {
            dangerCircleBadge = new DangerCircleBadge(a.Suspicious);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dangerCircleBadge = null;
        }
        if (dangerCircleBadge == null && this.f56828h == null) {
            return;
        }
        CircleBadgeView circleBadgeView = this.f56828h;
        if (circleBadgeView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CircleBadgeView circleBadgeView2 = new CircleBadgeView(context, null, 0, null, 14);
            circleBadgeView2.setId(R$id.chatBubbleDelegate_statusIcon);
            circleBadgeView2.setBadgeSize(os0.a.SMALL);
            or0.m.a(circleBadgeView2);
            circleBadgeView2.setOnClickListener(new r2(this, this, 1));
            circleBadgeView2.setOnLongClickListener(new f0(this, 0));
            this.f56828h = circleBadgeView2;
            addView(circleBadgeView2);
            circleBadgeView = circleBadgeView2;
        }
        circleBadgeView.setBadgeAndVisibility(dangerCircleBadge, getCutoutStage());
        if (dangerCircleBadge != null && badgeModel.f129035b != null) {
            ty0.c cVarB0 = u.k(this).b0();
            Clause clause = badgeModel.f129035b;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            spannableStringBuilderA = ty0.c.a(cVarB0, clause, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        circleBadgeView.setContentDescription(spannableStringBuilderA);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        View view2;
        if (view == null || view == (view2 = this.f)) {
            return;
        }
        if (view2 != null && view != this.f56827g && view != this.f56828h) {
            removeView(view2);
        }
        super.addView(view);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF51669t() {
        return this.analyticsContext;
    }

    @NotNull
    public final Function0<Unit> getOnAvatarClick() {
        return this.onAvatarClick;
    }

    @NotNull
    public final Function0<Unit> getOnSideStatusBadgeClick() {
        return this.onSideStatusBadgeClick;
    }

    @NotNull
    public final Function0<Unit> getOnSideStatusBadgeLongClick() {
        return this.onSideStatusBadgeLongClick;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int i6;
        int i21;
        int measuredWidth;
        int i22;
        int i32;
        int measuredWidth2;
        cam.f fVar;
        View view = this.f;
        if (view == null) {
            return;
        }
        ImageView imageView = this.f56827g;
        CircleBadgeView circleBadgeView = this.f56828h;
        boolean z3 = true;
        boolean z4 = imageView != null && imageView.getVisibility() == 0;
        boolean z6 = circleBadgeView != null && circleBadgeView.getVisibility() == 0;
        int i33 = this.k;
        int i43 = z4 ? i33 : 0;
        if (!z4) {
            i33 = 0;
        }
        int i59 = z6 ? this.f56829j : 0;
        int measuredHeight = z6 ? circleBadgeView.getMeasuredHeight() : 0;
        boolean z11 = getLayoutDirection() == 1;
        g0 g0Var = this.e;
        if (!((g0Var == null || (fVar = g0Var.f129028a) == null) ? true : s.s(fVar))) {
            z3 = z11;
        } else if (z11) {
            z3 = false;
        }
        if (z3) {
            measuredWidth2 = getPaddingLeft();
            if (z6) {
                i21 = i59 + measuredWidth2;
                i6 = measuredWidth2;
                measuredWidth2 = i21;
            } else {
                i6 = 0;
                i21 = 0;
            }
            if (z4) {
                i32 = i43 + measuredWidth2;
                i22 = measuredWidth2;
                measuredWidth2 = i32;
            } else {
                i22 = 0;
                i32 = 0;
            }
            measuredWidth = view.getMeasuredWidth() + measuredWidth2;
        } else {
            int measuredWidth3 = getMeasuredWidth() - getPaddingRight();
            if (z6) {
                i6 = measuredWidth3 - i59;
                i21 = measuredWidth3;
                measuredWidth3 = i6;
            } else {
                i6 = 0;
                i21 = 0;
            }
            if (z4) {
                i22 = measuredWidth3 - i43;
                i32 = measuredWidth3;
                measuredWidth = i22;
            } else {
                measuredWidth = measuredWidth3;
                i22 = 0;
                i32 = 0;
            }
            measuredWidth2 = measuredWidth - view.getMeasuredWidth();
        }
        int paddingTop = getPaddingTop();
        int measuredHeight2 = view.getMeasuredHeight() + paddingTop;
        view.layout(measuredWidth2, paddingTop, measuredWidth, measuredHeight2);
        View view2 = this.i;
        if (view2 != null && view2.getHeight() > 0) {
            measuredHeight2 = view2.getHeight() + knm.b.g(this, view2, false);
        }
        if (z4) {
            imageView.layout(i22, measuredHeight2 - i33, i32, measuredHeight2);
        }
        if (z6) {
            circleBadgeView.layout(i6, measuredHeight2 - measuredHeight, i21, measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int iB;
        int iMakeMeasureSpec;
        int i3;
        int i5;
        int i6;
        int iC;
        m0 m0Var;
        m0 m0Var2;
        int iMakeMeasureSpec2;
        m0 m0Var3;
        m0 m0Var4;
        n0 n0VarA;
        m0 m0Var5;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        ImageView imageView = this.f56827g;
        CircleBadgeView circleBadgeView = this.f56828h;
        View view = this.f;
        boolean z3 = imageView != null && imageView.getVisibility() == 0;
        boolean z4 = circleBadgeView != null && circleBadgeView.getVisibility() == 0;
        g0 g0Var = this.e;
        n0 n0VarA2 = (g0Var == null || (m0Var5 = g0Var.e) == null) ? null : m0Var5.a();
        n0 n0Var = n0.FULL;
        int i21 = this.f56829j;
        if (n0VarA2 == n0Var && !z4) {
            i21 = 0;
        }
        int i22 = this.k;
        int i32 = z3 ? i22 : 0;
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int i33 = (size - paddingEnd) - i21;
        float f = i33 < 0 ? 0 : i33;
        boolean z6 = z4;
        g0 g0Var2 = this.e;
        if (g0Var2 != null && (m0Var4 = g0Var2.e) != null && (n0VarA = m0Var4.a()) != null) {
            n0Var = n0VarA;
        }
        int iA = ((int) (n0Var.a() * f)) - i32;
        if (iA < 0) {
            iA = 0;
        }
        g0 g0Var3 = this.e;
        if (g0Var3 == null || (m0Var3 = g0Var3.e) == null) {
            z = z3;
            iB = Integer.MAX_VALUE;
        } else {
            z = z3;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iB = m0Var3.b(context);
        }
        if (iA > iB) {
            iA = iB;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                int i43 = size2 - paddingBottom;
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i43 >= 0 ? i43 : 0, 1073741824);
            }
            iMakeMeasureSpec = iMakeMeasureSpec2;
        } else {
            int i59 = size2 - paddingBottom;
            if (i59 < 0) {
                i59 = 0;
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i59, Integer.MIN_VALUE);
        }
        if (view == null) {
            i3 = size2;
            i5 = 1073741824;
        } else {
            g0 g0Var4 = this.e;
            if ((g0Var4 == null || (m0Var2 = g0Var4.e) == null) ? false : m0Var2.d()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(iA, 1073741824), iMakeMeasureSpec);
                i3 = size2;
                i5 = 1073741824;
            } else {
                i3 = size2;
                view.measure(View.MeasureSpec.makeMeasureSpec(iA, Integer.MIN_VALUE), iMakeMeasureSpec);
                g0 g0Var5 = this.e;
                if (g0Var5 == null || (m0Var = g0Var5.e) == null) {
                    iC = 0;
                } else {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    iC = m0Var.c(context2);
                }
                if (iC <= 0 || view.getMeasuredWidth() >= iC) {
                    i5 = 1073741824;
                } else {
                    if (iC <= iA) {
                        iA = iC;
                    }
                    i5 = 1073741824;
                    view.measure(View.MeasureSpec.makeMeasureSpec(iA, 1073741824), iMakeMeasureSpec);
                }
            }
        }
        if (z) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i22, i5);
            imageView.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
        }
        if (z6) {
            circleBadgeView.measure(View.MeasureSpec.makeMeasureSpec(i21, i5), iMakeMeasureSpec);
        }
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        if (!z) {
            i22 = 0;
        }
        int iMax = Math.max(measuredHeight, Math.max(i22, z6 ? circleBadgeView.getMeasuredHeight() : 0));
        int iC2 = a10.b.C(view != null ? view.getMeasuredWidth() : 0, paddingEnd, i21, i32);
        if (mode != Integer.MIN_VALUE) {
            i6 = 1073741824;
            if (mode != 1073741824) {
                size = iC2;
            }
        } else {
            i6 = 1073741824;
            size = Math.min(iC2, size);
        }
        setMeasuredDimension(size, mode2 != Integer.MIN_VALUE ? mode2 != i6 ? getPaddingBottom() + getPaddingTop() + iMax : i3 : Math.min(getPaddingBottom() + getPaddingTop() + iMax, i3));
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.onViewAdded(child);
        if (child == this.f56827g || child == this.f56828h) {
            return;
        }
        if (this.f != null) {
            throw new IllegalStateException("Only one content child is allowed inside ChatParentLayout. Use addView() to replace the existing content.");
        }
        this.f = child;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.f) {
            this.f = null;
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setBottomAnchorView(View view) {
        if (Intrinsics.f(this.i, view)) {
            return;
        }
        this.i = view;
        requestLayout();
    }

    public final void setModel(@NotNull g0 newModel) {
        p pVar;
        g0 g0Var;
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        if (Intrinsics.f(newModel, this.e)) {
            return;
        }
        Image image = newModel.f129029b;
        boolean z = newModel.f129030c;
        h0 h0Var = newModel.d;
        g0 g0Var2 = this.e;
        if (!Intrinsics.f(image, g0Var2 != null ? g0Var2.f129029b : null)) {
            setAvatar(image);
        }
        g0 g0Var3 = this.e;
        if (!Intrinsics.f(h0Var, g0Var3 != null ? g0Var3.d : null)) {
            setSideStatusBadge(h0Var);
        }
        g0 g0Var4 = this.e;
        if ((!Intrinsics.f(image, g0Var4 != null ? g0Var4.f129029b : null) || (g0Var = this.e) == null || z != g0Var.f129030c) && (pVar = this.f56831m) != null) {
            py0.b bVar = image != null ? new py0.b(image) : null;
            p.b(pVar, z);
            View view = pVar.f137029a;
            or0.m.a(view);
            if (z) {
                view.setOnClickListener(new t1(this, 3, bVar, this));
            } else {
                u.o(view);
            }
        }
        this.e = newModel;
        requestLayout();
    }

    public final void setOnAvatarClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onAvatarClick = function0;
    }

    public final void setOnSideStatusBadgeClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onSideStatusBadgeClick = function0;
    }

    public final void setOnSideStatusBadgeLongClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onSideStatusBadgeLongClick = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatParentLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatParentLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onAvatarClick = new ekd.i0(24);
        this.onSideStatusBadgeClick = new ekd.i0(25);
        this.onSideStatusBadgeLongClick = new ekd.i0(26);
        this.f56829j = kli.a.k(context, 24.0f);
        this.k = kli.a.k(context, 32.0f);
        this.cutoutStage = j.b(new e(this, 3));
    }

    public /* synthetic */ ChatParentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
