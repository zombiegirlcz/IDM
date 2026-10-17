package com.revolut.core.ui_kit.internal.views.dual_amount;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import au0.m4;
import bw0.h;
import bw0.l;
import bw0.m;
import bw0.n;
import bx0.v;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$dimen;
import com.revolut.core.ui_kit_resources.R$drawable;
import e8.q;
import efm.r;
import ifm.c;
import ihm.f;
import ip0.l0;
import ip0.ws;
import ix0.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jlh.g;
import jpl.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rim.d;
import rr0.i;
import te0.w;
import yz0.b;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0002\u007f;B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b'\u0010\u0019J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J!\u00100\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u0010\u0013J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u0010\u0013J\u0017\u00106\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b6\u0010+J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010<\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010<\u001a\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010<\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010<\u001a\u0004\bY\u0010RR\u001b\u0010]\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010<\u001a\u0004\b\\\u0010MR\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010<\u001a\u0004\b`\u0010aR\u001b\u0010e\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010<\u001a\u0004\bd\u0010MR\u001b\u0010h\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010<\u001a\u0004\bg\u0010MR\u001b\u0010k\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010<\u001a\u0004\bj\u0010CR\u001b\u0010n\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010<\u001a\u0004\bm\u0010HR\u001b\u0010q\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010<\u001a\u0004\bp\u0010MR\u001b\u0010t\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010<\u001a\u0004\bs\u0010RR\u0014\u0010v\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010aR(\u0010}\u001a\u0004\u0018\u00010w2\b\u0010x\u001a\u0004\u0018\u00010w8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006\u0080\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/dual_amount/AmountForDualEditView;", "Landroid/widget/FrameLayout;", "Lnx0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lip0/l0;", "fieldPosition", "", "setInputPosition", "(Lip0/l0;)V", "", "enabled", "setEnabled", "(Z)V", "focusable", "setFocusable", "", "uniqueSuggestionsId", "setSuggestionsSourceId", "(Ljava/lang/String;)V", "Lnx0/e;", "chevron", "setChevron", "(Lnx0/e;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "amountTypeClause", "setAmountType", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "typeImage", "setAmountTypeImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "customId", "setAmountTypeE2ECustomId", "Lbw0/h;", "amountInputModel", "setAmountInput", "(Lbw0/h;)V", "Lbw0/m;", "hintModel", "Lbw0/n;", "hintType", "setHint", "(Lbw0/m;Lbw0/n;)V", "visible", "setAmountChevronVisibility", "focus", "setFocus", "setInputFilters", "Lxv0/c;", "getOrCreateCompositeTouchDelegate", "()Lxv0/c;", "Lcom/revolut/core/ui_kit/internal/views/LabelView;", "a", "Le8/q;", "getAmountTypeView", "()Lcom/revolut/core/ui_kit/internal/views/LabelView;", "amountTypeView", "Landroid/view/ViewGroup;", "b", "getStartHintContainer", "()Landroid/view/ViewGroup;", "startHintContainer", "Landroid/widget/ImageView;", "c", "getStartHintIcon", "()Landroid/widget/ImageView;", "startHintIcon", "Landroid/widget/TextView;", "d", "getStartHintText", "()Landroid/widget/TextView;", "startHintText", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "e", "getStartHintShimmer", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "startHintShimmer", "f", "getAmountInputContainer", "()Landroid/widget/FrameLayout;", "amountInputContainer", "g", "getAmountInputShimmer", "amountInputShimmer", "h", "getAmountInputPrefix", "amountInputPrefix", "Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "i", "getAmountInputText", "()Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "amountInputText", "j", "getAmountInputResult", "amountInputResult", "k", "getAmountInputSuffix", "amountInputSuffix", "l", "getEndHintContainer", "endHintContainer", "m", "getEndHintIcon", "endHintIcon", "n", "getEndHintText", "endHintText", "o", "getEndHintShimmer", "endHintShimmer", "getEditText", "editText", "Lyz0/b;", "value", "getMaskingDelegate", "()Lyz0/b;", "setMaskingDelegate", "(Lyz0/b;)V", "maskingDelegate", "Companion", "jt0/b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountForDualEditView extends FrameLayout implements nx0.a {
    public static final /* synthetic */ int C = 0;

    @NotNull
    private static final a Companion = new a();
    public final t A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q amountTypeView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q startHintContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q startHintIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q startHintText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q startHintShimmer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q amountInputContainer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q amountInputShimmer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q amountInputPrefix;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q amountInputText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q amountInputResult;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q amountInputSuffix;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q endHintContainer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final q endHintIcon;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final q endHintText;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q endHintShimmer;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f56914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f56915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f56916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f56917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h f56918t;
    public final float u;
    public final float v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f56919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f56920x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f56921y;
    public c z;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountForDualEditView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(AmountForDualEditView amountForDualEditView, CharSequence charSequence) {
        amountForDualEditView.getAmountInputText().setContentDescription(charSequence);
        return Unit.f186387a;
    }

    public static void d(ViewGroup viewGroup, int i) {
        if (viewGroup.getMeasuredWidth() <= i) {
            return;
        }
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private final FrameLayout getAmountInputContainer() {
        return (FrameLayout) this.amountInputContainer.f();
    }

    private final TextView getAmountInputPrefix() {
        return (TextView) this.amountInputPrefix.f();
    }

    private final TextView getAmountInputResult() {
        return (TextView) this.amountInputResult.f();
    }

    private final ShimmerFrameLayout getAmountInputShimmer() {
        return (ShimmerFrameLayout) this.amountInputShimmer.f();
    }

    private final TextView getAmountInputSuffix() {
        return (TextView) this.amountInputSuffix.f();
    }

    private final MaskedTextInputEditText getAmountInputText() {
        return (MaskedTextInputEditText) this.amountInputText.f();
    }

    private final LabelView getAmountTypeView() {
        return (LabelView) this.amountTypeView.f();
    }

    private final ViewGroup getEndHintContainer() {
        return (ViewGroup) this.endHintContainer.f();
    }

    private final ImageView getEndHintIcon() {
        return (ImageView) this.endHintIcon.f();
    }

    private final ShimmerFrameLayout getEndHintShimmer() {
        return (ShimmerFrameLayout) this.endHintShimmer.f();
    }

    private final TextView getEndHintText() {
        return (TextView) this.endHintText.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xv0.c getOrCreateCompositeTouchDelegate() {
        TouchDelegate touchDelegate = getTouchDelegate();
        xv0.c cVar = touchDelegate instanceof xv0.c ? (xv0.c) touchDelegate : null;
        if (cVar != null) {
            return cVar;
        }
        xv0.c cVar2 = new xv0.c(this);
        setTouchDelegate(cVar2);
        return cVar2;
    }

    private final ViewGroup getStartHintContainer() {
        return (ViewGroup) this.startHintContainer.f();
    }

    private final ImageView getStartHintIcon() {
        return (ImageView) this.startHintIcon.f();
    }

    private final ShimmerFrameLayout getStartHintShimmer() {
        return (ShimmerFrameLayout) this.startHintShimmer.f();
    }

    private final TextView getStartHintText() {
        return (TextView) this.startHintText.f();
    }

    private final void setAmountChevronVisibility(boolean visible) {
        if (visible) {
            getAmountTypeView().setEndIcon(new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246));
            getAmountTypeView().setOnClickListener(new jt0.a(this, 0));
        } else {
            getAmountTypeView().setEndIcon(null);
            u.o(getAmountTypeView());
        }
    }

    private final void setFocus(boolean focus) {
        if (focus && !getAmountInputText().isFocused()) {
            e();
        } else {
            if (focus || !getAmountInputText().isFocused()) {
                return;
            }
            getAmountInputText().clearFocus();
        }
    }

    private final void setInputFilters(h amountInputModel) {
        InputFilter[] inputFilterArr = (InputFilter[]) amountInputModel.e.toArray(new InputFilter[0]);
        if (Arrays.equals(getAmountInputText().getFilters(), inputFilterArr)) {
            return;
        }
        getAmountInputText().setFilters(inputFilterArr);
    }

    @Override // nx0.a
    public final View F() {
        return this;
    }

    @Override // nx0.a
    public final r I() {
        return this.f56916r;
    }

    public final int c(int i) {
        return Math.min(i, getPaddingBottom() + getPaddingTop() + Math.max(getStartHintContainer().getMeasuredHeight() + getAmountTypeView().getMeasuredHeight(), getEndHintContainer().getMeasuredHeight() + getAmountInputContainer().getMeasuredHeight()));
    }

    public final void e() {
        getAmountInputText().requestFocus();
        kli.c.d(getAmountInputText(), 0L);
    }

    public final void f() {
        h hVar;
        bw0.c cVar;
        getAmountInputText().setEnabled(isEnabled() && ((hVar = this.f56918t) == null || (cVar = hVar.o) == null || cVar.b()));
    }

    @Override // nx0.a
    /* JADX INFO: renamed from: g, reason: from getter */
    public final f getF58932b() {
        return this.f56914p;
    }

    @Override // nx0.a
    @NotNull
    public MaskedTextInputEditText getEditText() {
        return getAmountInputText();
    }

    public b getMaskingDelegate() {
        return this.A.f169296c.u();
    }

    public final void h(float f) {
        this.B = true;
        getAmountInputPrefix().setTextSize(0, f);
        getAmountInputSuffix().setTextSize(0, f);
        getAmountInputResult().setTextSize(0, f);
        getAmountInputText().setTextSize(0, f);
        this.B = false;
    }

    public final void i() {
        LinkedHashMap linkedHashMap = this.f56917s;
        boolean z = false;
        if (!linkedHashMap.isEmpty()) {
            Iterator it8 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                m mVar = (m) ((Map.Entry) it8.next()).getValue();
                if ((mVar != null ? mVar.f19189b : null) == l.ERROR) {
                    z = true;
                    break;
                }
            }
        }
        setActivated(z);
        setSelected(getAmountInputText().isFocused());
        or0.m.c(this, isActivated() ? getContext().getString(R$string.common_accessibility_trait_invalid) : null);
        t tVar = this.A;
        tVar.r();
        tVar.q();
        h hVar = tVar.f169300l;
        if (hVar != null) {
            tVar.f169296c.F(tVar.d.q(hVar));
        }
        float f = isSelected() ? this.v : this.u;
        if (f == this.f56920x) {
            return;
        }
        this.f56920x = f;
        requestLayout();
    }

    @Override // nx0.a
    public final r k() {
        r map = this.f56915q.distinctUntilChanged().filter(new jof.a(23, new e(23))).map(new jof.a(24, new e(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t tVar = this.A;
        tVar.i();
        this.z = tVar.h().subscribe(new jof.a(22, new g(this, 19)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t tVar = this.A;
        d01.g gVarE0 = tVar.f169297g.e0();
        if (gVarE0 != null) {
            ((iz0.e) gVarE0).c(tVar.f169305r);
        }
        tVar.f169303p.d();
        c cVar = tVar.o;
        if (cVar != null) {
            cVar.dispose();
        }
        w.p0(this.z);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() || motionEvent == null || motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int i6;
        ViewGroup startHintContainer;
        int i21;
        ViewGroup endHintContainer;
        super.onLayout(z, i, i2, i3, i5);
        Rect rect = rr0.c.f256608a;
        rr0.c.b(getStartHintContainer(), this, this, 2304, getPaddingStart(), 0, getPaddingBottom(), 48);
        if (getStartHintContainer().getVisibility() == 0) {
            i6 = 272;
            startHintContainer = getStartHintContainer();
        } else {
            i6 = 8448;
            startHintContainer = this;
        }
        rr0.c.b(getAmountTypeView(), this, startHintContainer, i6, getPaddingStart(), 0, 0, 112);
        rr0.c.b(getEndHintContainer(), this, this, 2560, 0, getPaddingEnd(), getPaddingBottom(), 24);
        if (getEndHintContainer().getVisibility() == 0) {
            i21 = 528;
            endHintContainer = getEndHintContainer();
        } else {
            i21 = 8704;
            endHintContainer = this;
        }
        rr0.c.b(getAmountInputContainer(), this, endHintContainer, i21, 0, getPaddingEnd(), 0, 88);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iD = i.d(i);
        int iD2 = i.d(i2);
        int paddingLeft = (iD - getPaddingLeft()) - getPaddingRight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        h(this.f56920x);
        getAmountTypeView().measure(iMakeMeasureSpec, iMakeMeasureSpec);
        getStartHintContainer().measure(iMakeMeasureSpec, iMakeMeasureSpec);
        getAmountInputContainer().measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.f56921y, 1073741824));
        getEndHintContainer().measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int iMax = Math.max(getAmountTypeView().getMeasuredWidth(), getStartHintContainer().getMeasuredWidth());
        int iMax2 = Math.max(getAmountInputContainer().getMeasuredWidth(), getEndHintContainer().getMeasuredWidth());
        if (iMax + iMax2 <= paddingLeft) {
            setMeasuredDimension(iD, c(iD2));
            return;
        }
        int iC = d.c(paddingLeft * 0.4f);
        int i3 = paddingLeft - iC;
        if (iMax > iC && iMax2 > i3) {
            iMax = iC;
            iMax2 = i3;
        } else if (iMax > iC) {
            iMax = paddingLeft - iMax2;
        } else {
            iMax2 = paddingLeft - iMax;
        }
        d(getAmountTypeView(), iMax);
        d(getStartHintContainer(), iMax);
        if (getAmountInputContainer().getMeasuredWidth() > iMax2) {
            int paddingRight = getAmountInputContainer().getPaddingRight() + getAmountInputContainer().getPaddingLeft();
            int i5 = iMax2 - paddingRight;
            int measuredWidth = getAmountInputContainer().getMeasuredWidth() - paddingRight;
            float f = this.f56920x;
            float f4 = (i5 * f) / measuredWidth;
            float f5 = this.f56919w;
            float f6 = kotlin.ranges.f.f(f4, f5, f);
            h(f6);
            getAmountInputContainer().measure(f6 == f5 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(this.f56921y, 1073741824));
        }
        d(getEndHintContainer(), iMax2);
        setMeasuredDimension(iD, c(iD2));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.B) {
            return;
        }
        super.requestLayout();
    }

    @Override // nx0.a
    public final r s() {
        return this.A.g();
    }

    @Override // nx0.a
    public void setAmountInput(@NotNull h amountInputModel) {
        Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
        this.f56918t = amountInputModel;
        setInputFilters(amountInputModel);
        this.A.j(amountInputModel);
        boolean z = amountInputModel.f19184j;
        getAmountInputPrefix().setVisibility(!z ? 0 : 8);
        getAmountInputText().setVisibility(!z ? 0 : 8);
        getAmountInputShimmer().setVisibility(z ? 0 : 8);
        Boolean bool = amountInputModel.f;
        if (bool != null) {
            setFocus(bool.booleanValue());
        }
        f();
    }

    @Override // nx0.a
    public void setAmountType(@NotNull Clause amountTypeClause) {
        Intrinsics.checkNotNullParameter(amountTypeClause, "amountTypeClause");
        LabelView.setText$default(getAmountTypeView(), amountTypeClause, 0, 2, null);
        pd.b.p(getAmountTypeView(), amountTypeClause);
    }

    @Override // nx0.a
    public void setAmountTypeE2ECustomId(String customId) {
        hx7.b.v(getAmountTypeView(), customId);
    }

    @Override // nx0.a
    public void setAmountTypeImage(Image typeImage) {
        LabelView.setStartIcon$default(getAmountTypeView(), typeImage, null, null, false, 0, 0L, 62, null);
    }

    @Override // nx0.a
    public void setChevron(@NotNull nx0.e chevron) {
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        setAmountChevronVisibility(chevron == nx0.e.AMOUNT);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        f();
        getAmountInputPrefix().setEnabled(enabled);
        getAmountTypeView().setEnabled(enabled);
        getStartHintText().setEnabled(enabled);
        setFocusable(enabled);
        t tVar = this.A;
        tVar.q();
        tVar.r();
        float f = !enabled ? 0.4f : 1.0f;
        getAmountTypeView().setAlpha(f);
        getAmountInputContainer().setAlpha(f);
    }

    @Override // android.view.View
    public void setFocusable(boolean focusable) {
        super.setFocusable(focusable);
        getAmountInputText().setFocusable(focusable);
        getAmountInputText().setFocusableInTouchMode(focusable);
        if (focusable) {
            getAmountInputContainer().setOnClickListener(new jt0.a(this, 1));
        } else {
            u.o(getAmountInputContainer());
        }
    }

    @Override // nx0.a
    public void setHint(m hintModel, @NotNull n hintType) {
        ViewGroup startHintContainer;
        TextView startHintText;
        ImageView startHintIcon;
        ShimmerFrameLayout startHintShimmer;
        int i;
        Intrinsics.checkNotNullParameter(hintType, "hintType");
        this.f56917s.put(hintType, hintModel);
        i();
        int i2 = jt0.c.f178268b[hintType.ordinal()];
        if (i2 == 1) {
            startHintContainer = getStartHintContainer();
            startHintText = getStartHintText();
            startHintIcon = getStartHintIcon();
            startHintShimmer = getStartHintShimmer();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            startHintContainer = getEndHintContainer();
            startHintText = getEndHintText();
            startHintIcon = getEndHintIcon();
            startHintShimmer = getEndHintShimmer();
        }
        ShimmerFrameLayout shimmerFrameLayout = startHintShimmer;
        TextView textView = startHintText;
        ImageView imageView = startHintIcon;
        l lVar = hintModel != null ? hintModel.f19189b : null;
        switch (lVar == null ? -1 : jt0.c.f178269c[lVar.ordinal()]) {
            case -1:
                startHintContainer.setVisibility(8);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                startHintContainer.setVisibility(0);
                imageView.setVisibility(8);
                textView.setVisibility(8);
                shimmerFrameLayout.setVisibility(0);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                switch (jt0.c.f178269c[hintModel.f19189b.ordinal()]) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = R$attr.uikit_colorGreyTone50;
                        break;
                    case 3:
                        i = R$attr.uikit_colorStatusWarning;
                        break;
                    case 4:
                        i = R$attr.uikit_colorStatusDanger;
                        break;
                    case 5:
                        i = R$attr.uikit_colorGreyTone50;
                        break;
                    case 6:
                        i = R$attr.uikit_colorStatusDanger;
                        break;
                    case 7:
                        i = R$attr.uikit_colorAccent;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iS = kli.a.s(i, context);
                startHintContainer.setVisibility(0);
                textView.setVisibility(hintModel.f19188a == null ? 4 : 0);
                shimmerFrameLayout.setVisibility(8);
                ty0.c.b(u.k(textView).b0(), hintModel.f19188a, textView, null, null, 12);
                textView.setTextColor(iS);
                zi0.c.g(imageView, hintModel.f19190c);
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.setTint(iS);
                }
                startHintContainer.setOnTouchListener(new j01.e(new View[]{startHintContainer}));
                if (!hintModel.d) {
                    u.o(startHintContainer);
                } else {
                    startHintContainer.setOnClickListener(new ws(this, hintType, 28));
                }
                break;
        }
        boolean z = hintModel != null && hintModel.d;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new jt0.d(z, startHintContainer, this, hintType, 0));
            return;
        }
        if (!z) {
            getOrCreateCompositeTouchDelegate().b(hintType.name());
            return;
        }
        Rect rect = new Rect();
        startHintContainer.getHitRect(rect);
        Context context2 = startHintContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 16.0f);
        rect.left -= iK;
        rect.right += iK;
        rect.bottom += iK;
        getOrCreateCompositeTouchDelegate().a(hintType.name(), new TouchDelegate(rect, startHintContainer));
    }

    @Override // nx0.a
    public void setInputPosition(@NotNull l0 fieldPosition) {
        Pair pair;
        Intrinsics.checkNotNullParameter(fieldPosition, "fieldPosition");
        int i = jt0.c.f178267a[fieldPosition.ordinal()];
        if (i == 1) {
            Companion.getClass();
            pair = new Pair(Float.valueOf(qv0.h.EXTRA_LARGE.a()), Float.valueOf(qv0.h.SMALL.a()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Companion.getClass();
            pair = new Pair(Float.valueOf(qv0.h.SMALL.a()), Float.valueOf(qv0.h.EXTRA_LARGE.a()));
        }
        float fFloatValue = ((Number) pair.f186385a).floatValue();
        float fFloatValue2 = ((Number) pair.f186386b).floatValue();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackground(dr0.l.f117054a.b(context, fFloatValue, fFloatValue2));
    }

    @Override // nx0.a
    public void setMaskingDelegate(b bVar) {
        t tVar = this.A;
        b bVarU = tVar.f169296c.u();
        if (Intrinsics.f(bVarU, bVar)) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            if (bVarU != null) {
                bVarU.a();
            }
            tVar.l(bVar);
        }
    }

    @Override // nx0.a
    public void setSuggestionsSourceId(@NotNull String uniqueSuggestionsId) {
        Intrinsics.checkNotNullParameter(uniqueSuggestionsId, "uniqueSuggestionsId");
        t tVar = this.A;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(uniqueSuggestionsId, "uniqueSuggestionsId");
        tVar.f169305r = uniqueSuggestionsId;
    }

    @Override // nx0.a
    public void setSwitcher(@NotNull nx0.g switcher) {
        Intrinsics.checkNotNullParameter(switcher, "switcher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountForDualEditView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountForDualEditView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.amountTypeView = kli.a.J(R$id.amountForDualEdit_amountTypeView, this);
        this.startHintContainer = kli.a.J(R$id.amountForDualEdit_startHintContainer, this);
        this.startHintIcon = kli.a.J(R$id.amountForDualEdit_startHintIcon, this);
        this.startHintText = kli.a.J(R$id.amountForDualEdit_startHintText, this);
        this.startHintShimmer = kli.a.J(R$id.amountForDualEdit_startHintShimmer, this);
        this.amountInputContainer = kli.a.J(R$id.amountForDualEdit_amountInputContainer, this);
        this.amountInputShimmer = kli.a.J(R$id.amountForDualEdit_amountInputShimmer, this);
        this.amountInputPrefix = kli.a.J(R$id.amountForDualEdit_amountInputPrefix, this);
        this.amountInputText = kli.a.J(R$id.amountForDualEdit_amountInputText, this);
        this.amountInputResult = kli.a.J(R$id.amountForDualEdit_amountInputResult, this);
        this.amountInputSuffix = kli.a.J(R$id.amountForDualEdit_amountInputSuffix, this);
        this.endHintContainer = kli.a.J(R$id.amountForDualEdit_endHintContainer, this);
        this.endHintIcon = kli.a.J(R$id.amountForDualEdit_endHintIcon, this);
        this.endHintText = kli.a.J(R$id.amountForDualEdit_endHintText, this);
        this.endHintShimmer = kli.a.J(R$id.amountForDualEdit_endHintShimmer, this);
        this.f56914p = v0.a.d("create(...)");
        this.f56915q = v0.a.d("create(...)");
        this.f56916r = v0.a.d("create(...)");
        this.f56917s = new LinkedHashMap();
        this.u = context.getResources().getDimension(R$dimen.internal_heading2_text_size);
        float dimension = context.getResources().getDimension(R$dimen.internal_heading1_text_size);
        this.v = dimension;
        this.f56919w = kli.a.B(context, 12.0f);
        View.inflate(context, R$layout.internal_amount_for_dual_edit_view, this);
        sz5.f fVar = new sz5.f(getAmountInputPrefix(), getAmountInputText(), getAmountInputResult(), getAmountInputSuffix(), jh.d.f(context).b0());
        this.A = new t(context, false, fVar, new jt0.b(this, context, fVar));
        i();
        getAmountInputText().a(new m4(this, 6));
        FrameLayout amountInputContainer = getAmountInputContainer();
        if (isLaidOut() && !isLayoutRequested()) {
            Rect rect = new Rect();
            amountInputContainer.getHitRect(rect);
            Context context2 = amountInputContainer.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 16.0f);
            if (amountInputContainer.getLayoutDirection() == 1) {
                rect.left -= iK;
            } else {
                rect.right += iK;
            }
            rect.top -= iK;
            getOrCreateCompositeTouchDelegate().a("inputContainer", new TouchDelegate(rect, amountInputContainer));
        } else {
            addOnLayoutChangeListener(new v(amountInputContainer, this, 9));
        }
        getAmountInputContainer().setOnClickListener(new jt0.a(this, 1));
        int iK2 = kli.a.k(context, 16.0f);
        setPadding(iK2, iK2, iK2, iK2);
        getAmountInputText().setTextSize(0, dimension);
        Paint.FontMetrics fontMetrics = getAmountInputText().getPaint().getFontMetrics();
        this.f56921y = d.c((fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading);
        setMinimumHeight(kli.a.k(context, 100.0f));
    }

    public /* synthetic */ AmountForDualEditView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
