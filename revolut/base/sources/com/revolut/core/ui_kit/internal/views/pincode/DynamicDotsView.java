package com.revolut.core.ui_kit.internal.views.pincode;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import aw0.v1;
import bx0.v;
import cli.u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$plurals;
import com.revolut.core.ui_kit.internal.views.pincode.a;
import iu0.b;
import iu0.c;
import iu0.e;
import iu0.g;
import iu0.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rim.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/pincode/DynamicDotsView;", "Landroid/view/View;", "Liu0/b;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "amount", "", "setDotsSelected", "(Ljava/lang/Integer;)V", "setDotsSelectedInternal", "getView", "()Landroid/view/View;", "view", "iu0/h", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DynamicDotsView extends View implements b, ur0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f57437n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f57438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f57439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f57440c;
    public final Paint d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f57441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f57442h;
    public h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ValueAnimator f57443j;
    public ValueAnimator k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ValueAnimator f57444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v1 f57445m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicDotsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void h(DynamicDotsView dynamicDotsView) {
        e eVar = dynamicDotsView.f57438a;
        if (dynamicDotsView.f57444l.isRunning()) {
            return;
        }
        dynamicDotsView.f57443j.cancel();
        dynamicDotsView.k.cancel();
        if (dynamicDotsView.f57442h == 0) {
            dynamicDotsView.f57442h = dynamicDotsView.f57441g;
        }
        a.b bVar = new a.b(0);
        Paint paint = dynamicDotsView.d;
        paint.setColor(eVar.f168433b);
        Unit unit = Unit.f186387a;
        dynamicDotsView.i = dynamicDotsView.i(bVar, paint, null);
        ValueAnimator valueAnimatorC = eVar.c(new g(dynamicDotsView, 0), new g(dynamicDotsView, 1));
        dynamicDotsView.f57444l = valueAnimatorC;
        valueAnimatorC.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDotsSelectedInternal(Integer amount) {
        int iIntValue;
        int i = this.f57442h;
        int i2 = this.f57441g;
        if (amount != null && (iIntValue = amount.intValue()) <= i2) {
            i2 = iIntValue;
        }
        this.f57442h = i2;
        if (i2 == i && (this.i.d instanceof a.d)) {
            return;
        }
        this.i = i(a.d.f57462a, this.f57440c, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        if (this.f57443j.isRunning()) {
            this.f57443j.end();
        }
        ValueAnimator valueAnimatorB = e.b(this.f57438a, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, new g(this, 2));
        this.f57443j = valueAnimatorB;
        valueAnimatorB.start();
    }

    @Override // iu0.b
    public final void a() {
        int i = this.f57442h;
        for (int i2 = 0; i2 < i; i2++) {
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // iu0.b
    public final void b() {
        clearAnimation();
        Object value = this.f57438a.f168435g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        startAnimation((Animation) value);
    }

    @Override // iu0.b
    public final void c() {
        if (this.f57442h == 0) {
            return;
        }
        this.i = i(a.c.f57461a, this.f57440c, null);
        if (this.f57443j.isRunning()) {
            this.f57443j.end();
        }
        ValueAnimator valueAnimatorB = e.b(this.f57438a, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}, new g(this, 3));
        this.k = valueAnimatorB;
        valueAnimatorB.start();
        this.f57442h--;
    }

    @Override // iu0.b
    public final void d() {
        this.f57442h++;
        this.i = i(a.C0437a.f57459a, this.f57440c, null);
        if (this.f57443j.isRunning()) {
            this.f57443j.end();
        }
        ValueAnimator valueAnimatorB = e.b(this.f57438a, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, new g(this, 4));
        this.f57443j = valueAnimatorB;
        valueAnimatorB.start();
    }

    @Override // iu0.b
    public final void e() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new u(this, 5));
        } else {
            h(this);
        }
    }

    @Override // iu0.b
    public final void f() {
        this.f57444l.end();
        this.i = i(a.d.f57462a, this.f57440c, Float.valueOf(1.0f));
        invalidate();
    }

    @Override // iu0.b
    @NotNull
    public View getView() {
        return this;
    }

    public final h i(a operation, Paint lastDotPaint, Float f) {
        float f4 = this.f57442h * this.f57438a.f;
        h hVar = this.i;
        float f5 = ((f4 / 2) + this.f57439b.x) - this.e;
        if (lastDotPaint == null) {
            lastDotPaint = hVar.f168442c;
        }
        float fFloatValue = f != null ? f.floatValue() : hVar.f168441b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(lastDotPaint, "lastDotPaint");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return new h(f5, fFloatValue, lastDotPaint, operation);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.pincode.DynamicDotsView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        Resources resources = getView().getContext().getResources();
        int i = R$plurals.passcode_dynamic_field_accessibility_value;
        int i2 = this.f57442h;
        String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c.a(context, info, quantityString);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f57441g + 1;
        e eVar = this.f57438a;
        setMeasuredDimension(e.d(getPaddingRight() + getPaddingLeft() + d.c(eVar.f * i3), i), e.d(getPaddingBottom() + getPaddingTop() + ((int) (eVar.f + 1)), i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.f57439b.set(new PointF(i / 2.0f, i2 / 2.0f));
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.f57445m == colorScheme) {
            return;
        }
        this.f57445m = colorScheme;
        e eVar = this.f57438a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        int iS = kli.a.s(colorScheme.a(), eVar.f168432a);
        eVar.f168433b = iS;
        eVar.f168434c = io0.a.d(0.4f, iS);
        this.f57440c.setColor(eVar.f168433b);
        invalidate();
    }

    @Override // iu0.b
    public void setDotsSelected(Integer amount) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new v(this, amount, 8));
        } else {
            setDotsSelectedInternal(amount);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicDotsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicDotsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        e eVar = new e(context);
        this.f57438a = eVar;
        this.f57439b = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Paint paintA = e.a(eVar.f168433b);
        this.f57440c = paintA;
        this.d = e.a(eVar.f168433b);
        float f = eVar.f;
        this.e = f / 2;
        this.f = f;
        this.f57441g = 8;
        this.i = new h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paintA, a.C0437a.f57459a);
        this.f57443j = new ValueAnimator();
        this.k = new ValueAnimator();
        this.f57444l = new ValueAnimator();
        pd.b.q(this, true);
    }

    public /* synthetic */ DynamicDotsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
