package com.revolut.core.ui_kit.views;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import mx0.ad;
import mx0.bd;
import mx0.cd;
import mx0.fd;
import mx0.yc;
import mx0.zc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0003\n\u0010\u0011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/views/TwoTextSwitcherView;", "Lcom/revolut/core/ui_kit/views/TwoViewsSwitcherView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/yc;", "model", "", "setModel", "(Lmx0/yc;)V", "Companion", "mx0/cd", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TwoTextSwitcherView extends TwoViewsSwitcherView {

    @NotNull
    private static final a Companion = new a();
    public static final o0 k = new o0(14);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o0 f58922l = new o0(15);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f58923h;
    public final UIKitTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cd f58924j;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoTextSwitcherView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setModel(@NotNull yc model) {
        Intrinsics.checkNotNullParameter(model, "model");
        cd cdVar = this.f58924j;
        AnimatorSet animatorSet = this.d;
        ad adVar = ad.f209588a;
        if (animatorSet != null) {
            if (model.f210132b) {
                Clause clause = model.f210131a;
                if (cdVar instanceof zc) {
                    if (Intrinsics.f(((zc) cdVar).f210151a, clause)) {
                        return;
                    }
                    this.f58924j = new zc(clause);
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ty0.c.b(jh.d.f(context).b0(), clause, this.f58923h, null, null, 12);
                    return;
                }
                if (!(cdVar instanceof bd)) {
                    if (!Intrinsics.f(cdVar, adVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    if (Intrinsics.f(((bd) cdVar).f209619a, clause)) {
                        return;
                    }
                    this.f58924j = new bd(clause);
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    ty0.c.b(jh.d.f(context2).b0(), clause, this.i, null, null, 12);
                    return;
                }
            }
            animatorSet.end();
        }
        if (Intrinsics.f(cdVar, adVar)) {
            this.f58924j = new zc(model.f210131a);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ty0.c.b(jh.d.f(context3).b0(), model.f210131a, this.f58923h, null, null, 12);
            return;
        }
        if (cdVar instanceof zc) {
            Clause clause2 = ((zc) cdVar).f210151a;
            Clause clause3 = model.f210131a;
            if (Intrinsics.f(clause2, clause3)) {
                return;
            }
            if (!model.f210132b) {
                this.f58924j = new zc(clause3);
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                ty0.c.b(jh.d.f(context4).b0(), model.f210131a, this.f58923h, null, null, 12);
                return;
            }
            UIKitTextView uIKitTextView = this.i;
            if (uIKitTextView.getParent() == null) {
                addView(uIKitTextView, new FrameLayout.LayoutParams(-2, -2, 17));
            }
            this.f58924j = new bd(clause3);
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            ty0.c.b(jh.d.f(context5).b0(), model.f210131a, this.i, null, null, 12);
            uIKitTextView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            uIKitTextView.setScaleX(BitmapDescriptorFactory.HUE_RED);
            uIKitTextView.setScaleY(BitmapDescriptorFactory.HUE_RED);
            d(true);
            return;
        }
        if (!(cdVar instanceof bd)) {
            throw new NoWhenBranchMatchedException();
        }
        Clause clause4 = ((bd) cdVar).f209619a;
        Clause clause5 = model.f210131a;
        if (Intrinsics.f(clause4, clause5)) {
            return;
        }
        if (!model.f210132b) {
            this.f58924j = new bd(clause5);
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            ty0.c.b(jh.d.f(context6).b0(), model.f210131a, this.i, null, null, 12);
            return;
        }
        this.f58924j = new zc(clause5);
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        ty0.c.b(jh.d.f(context7).b0(), model.f210131a, this.f58923h, null, null, 12);
        UIKitTextView uIKitTextView2 = this.f58923h;
        uIKitTextView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        uIKitTextView2.setScaleX(BitmapDescriptorFactory.HUE_RED);
        uIKitTextView2.setScaleY(BitmapDescriptorFactory.HUE_RED);
        c(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoTextSwitcherView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoTextSwitcherView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        UIKitTextView uIKitTextView = new UIKitTextView(context, attributeSet, i);
        uIKitTextView.setId(View.generateViewId());
        this.f58923h = uIKitTextView;
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, attributeSet, i);
        uIKitTextView2.setId(View.generateViewId());
        this.i = uIKitTextView2;
        this.f58924j = ad.f209588a;
        setPlayStrategy(fd.TOGETHER);
        addView(uIKitTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        setOutAnimatorFactory(k);
        setInAnimatorFactory(f58922l);
    }

    public /* synthetic */ TwoTextSwitcherView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
