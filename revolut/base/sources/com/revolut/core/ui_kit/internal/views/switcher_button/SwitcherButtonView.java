package com.revolut.core.ui_kit.internal.views.switcher_button;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import aw0.v1;
import bv0.c;
import bv0.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import efm.r;
import fp0.m;
import fp0.p;
import gp0.g;
import ihm.f;
import jb3.l;
import jr0.i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ur0.a;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001DB\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010#\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010$J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u0011H\u0007¢\u0006\u0004\b5\u00106R$\u0010>\u001a\u0004\u0018\u0001078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/switcher_button/SwitcherButtonView;", "Landroid/widget/FrameLayout;", "Lbv0/c;", "Lur0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Ljr0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View$OnClickListener;", "l", "", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "leftPart", "rightPart", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setLeftImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "", "chevronVisible", "setChevronVisible", "(Z)V", "", "left", "top", "right", "bottom", "setPadding", "(IIII)V", "start", "end", "setPaddingRelative", "Lbv0/a;", "state", "setState", "(Lbv0/a;)V", "Lbv0/b;", "model", "setModel", "(Lbv0/b;)V", "Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "content", "setBadgeContent", "(Lcom/revolut/core/ui_kit/models/NewBadgeContent;)V", "title", "setHint", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Landroid/os/Parcelable;", "j", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Ljr0/g;", "getGlowHighlightManager", "()Ljr0/g;", "glowHighlightManager", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwitcherButtonView extends FrameLayout implements c, a, TrackableItem, i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f57623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoundedBackgroundDrawable f57624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f57625c;
    public TextView d;
    public final f e;
    public NewBadgeView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NewBadgeContent f57626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f57627h;
    public v1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;
    public int k;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intrinsics.h(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitcherButtonView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57623a = new Handler(Looper.getMainLooper());
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, 0, 6);
        this.f57624b = roundedBackgroundDrawable;
        d dVar = new d(context, null);
        this.f57625c = dVar;
        this.e = v0.a.d("create(...)");
        m mVar = p.Companion;
        g gVar = new g(0);
        mVar.getClass();
        p pVarA = m.a(this, gVar);
        this.i = v1.LIGHT;
        setBackground(roundedBackgroundDrawable);
        dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(dVar);
        p.b(pVarA, true);
        View view = pVarA.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new b());
    }

    @Override // mx0.z4
    public final r a() {
        r rVarHide = this.e.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    public final void b(int i) {
        int i2 = this.f57627h;
        if (i2 == i) {
            return;
        }
        this.f57627h = i;
        setClipToPadding(i == 0);
        setClipChildren(i == 0);
        if (isPaddingRelative()) {
            super.setPaddingRelative((getPaddingStart() - i2) + i, (getPaddingTop() - i2) + i, (getPaddingEnd() - i2) + i, (getPaddingBottom() - i2) + i);
        } else {
            super.setPadding((getPaddingLeft() - i2) + i, (getPaddingTop() - i2) + i, (getPaddingRight() - i2) + i, (getPaddingBottom() - i2) + i);
        }
        int i3 = this.f57627h;
        RoundedBackgroundDrawable roundedBackgroundDrawable = this.f57624b;
        if (i3 == 0) {
            setBackground(roundedBackgroundDrawable);
        } else {
            LayerDrawable layerDrawable = new LayerDrawable(new RoundedBackgroundDrawable[]{roundedBackgroundDrawable});
            int i5 = this.f57627h;
            layerDrawable.setLayerInset(0, i5, i5, i5, i5);
            setBackground(layerDrawable);
        }
        requestLayout();
    }

    public final void d() {
        int iS;
        d dVar = this.f57625c;
        switch (bv0.g.f18938a[dVar.getCurrentState().ordinal()]) {
            case 1:
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorInputError, context);
                break;
            case 2:
            case 3:
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorActionBackgroundNeutral, context2);
                break;
            case 4:
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorWhite, context3);
                break;
            case 5:
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorGreyTone5, context4);
                break;
            case 6:
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorActionBackgroundNeutral, context5);
                break;
            case 7:
                iS = this.k;
                break;
            case 8:
                iS = this.k;
                break;
            case 9:
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorGreyTone8, context6);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f57624b.e(iS);
        TextView textView = this.d;
        if (textView != null) {
            bv0.a currentState = dVar.getCurrentState();
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            textView.setTextColor(c6d.b.m(currentState, context7, this.i));
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Override // jr0.i
    @NotNull
    public jr0.g getGlowHighlightManager() {
        jr0.g.Companion.getClass();
        return jr0.f.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57625c.setVisibility(0);
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f57623a.removeCallbacksAndMessages(null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        NewBadgeView newBadgeView = this.f;
        if (newBadgeView != null) {
            if (this.f57627h > 0) {
                newBadgeView.setTranslationX(getLayoutDirection() == 1 ? -this.f57627h : this.f57627h);
                newBadgeView.setTranslationY(-this.f57627h);
            } else {
                newBadgeView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                newBadgeView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((this.f57627h * 2) + View.MeasureSpec.getSize(i), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec((this.f57627h * 2) + View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2)));
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.i = colorScheme;
        this.k = i;
        this.f57624b.e(i);
        d();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setBadgeContent(NewBadgeContent content) {
        float f;
        if (Intrinsics.f(this.f57626g, content)) {
            return;
        }
        this.f57626g = content;
        int i = 0;
        if (content == null) {
            NewBadgeView newBadgeView = this.f;
            if (newBadgeView != null) {
                newBadgeView.setVisibility(8);
            }
            b(0);
            return;
        }
        NewBadgeView newBadgeView2 = this.f;
        if (newBadgeView2 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            newBadgeView2 = new NewBadgeView(context, null, 6, i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            this.f = newBadgeView2;
            newBadgeView2.setId(R$id.uikit_switcherButton_badge);
            addView(newBadgeView2, layoutParams);
        }
        newBadgeView2.setVisibility(0);
        newBadgeView2.setContent(content);
        if (content instanceof NewBadgeContent.Dot) {
            f = 10.0f;
        } else if (content instanceof NewBadgeContent.WithText) {
            f = 8.0f;
        } else {
            if (!(content instanceof NewBadgeContent.WithNumber)) {
                throw new NoWhenBranchMatchedException();
            }
            f = 6.0f;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b(kli.a.k(context2, f));
    }

    @yhm.d
    public void setChevronVisible(boolean chevronVisible) {
        this.f57625c.setChevronVisible(chevronVisible);
    }

    public final void setHint(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextView appCompatTextView = this.d;
        if (appCompatTextView == null) {
            appCompatTextView = new AppCompatTextView(getContext());
            Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, kli.a.k(context, 40.0f));
            layoutParams.gravity = 1;
            appCompatTextView.setLayoutParams(layoutParams);
            Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context2));
            l.e(appCompatTextView, R$attr.internal_textAppearanceEmphasis2);
            appCompatTextView.setMaxLines(1);
            Context context3 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(context3, "context");
            int iK = kli.a.k(context3, 12.0f);
            appCompatTextView.setPadding(iK, 0, iK, 0);
            appCompatTextView.setGravity(17);
        }
        TextView textView = appCompatTextView;
        this.d = textView;
        removeView(textView);
        addView(textView);
        ty0.c.b(u.k(this).b0(), title, textView, null, null, 12);
        this.f57625c.setVisibility(8);
        textView.setVisibility(0);
        d();
    }

    @yhm.d
    public void setLeftImage(Image image) {
        this.f57625c.setLeftImage(image);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l2) {
        if (!isClickable()) {
            setClickable(true);
        }
        super.setOnClickListener(new ap0.f(this, l2, 3));
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        int i = this.f57627h;
        super.setPadding(left + i, top + i, right + i, bottom + i);
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end2, int bottom) {
        int i = this.f57627h;
        super.setPaddingRelative(start + i, top + i, end2 + i, bottom + i);
    }

    @yhm.d
    public void setState(@NotNull bv0.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f57625c.setState(state);
        d();
    }

    @Override // bv0.c
    @yhm.d
    public void setText(Clause leftPart, Clause rightPart) {
        this.f57625c.setText(leftPart, rightPart);
    }

    @Override // mx0.z4
    public void setModel(@NotNull bv0.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f57625c.setModel(model);
        d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitcherButtonView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
