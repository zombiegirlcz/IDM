package com.revolut.core.ui_kit.internal.views.pincode;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import aw0.v1;
import cli.u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$string;
import iu0.b;
import iu0.c;
import iu0.e;
import iu0.j;
import iu0.k;
import iu0.l;
import iu0.m;
import iu0.n;
import iu0.o;
import iu0.p;
import iu0.q;
import iu0.r;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/pincode/PlaceholderDotsView;", "Landroid/view/View;", "Liu0/b;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "length", "", "setPlaceholderLength", "(I)V", "amount", "setDotsSelected", "(Ljava/lang/Integer;)V", "getView", "()Landroid/view/View;", "view", "iu0/q", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlaceholderDotsView extends View implements b, ur0.a {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f57450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f57451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f57452c;
    public final Paint d;
    public final Paint e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f57453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f57454h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f57455j;
    public ValueAnimator k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ValueAnimator f57456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f57457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v1 f57458n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaceholderDotsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // iu0.b
    public final void a() {
        int i = this.i;
        g();
        this.f57455j = l.f168448a;
        for (int i2 = 0; i2 < i; i2++) {
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // iu0.b
    public final void b() {
        clearAnimation();
        Object value = this.f57450a.f168435g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        startAnimation((Animation) value);
    }

    @Override // iu0.b
    public final void c() {
        int i = this.i;
        if (i == 0) {
            return;
        }
        this.i = i - 1;
        this.f57455j = new m(this.e);
        h();
        j onAnimationUpdate = new j(this, 1);
        e eVar = this.f57450a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(onAnimationUpdate, "onAnimationUpdate");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        ap0.q qVar = new ap0.q(valueAnimatorOfFloat, new isd.a(22), eVar, onAnimationUpdate, 1);
        valueAnimatorOfFloat.addListener(qVar);
        valueAnimatorOfFloat.addUpdateListener(qVar);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.f57456l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    @Override // iu0.b
    public final void d() {
        int i = this.i;
        if (i == this.f57454h) {
            return;
        }
        this.i = i + 1;
        this.f57455j = new k();
        h();
        j jVar = new j(this, 2);
        ValueAnimator valueAnimatorB = e.b(this.f57450a, new float[]{1.0f, 1.2f, 1.0f}, jVar);
        this.k = valueAnimatorB;
        valueAnimatorB.start();
    }

    @Override // iu0.b
    public final void e() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new u(this, 6));
            return;
        }
        if (this.f57457m.isRunning()) {
            return;
        }
        this.i = this.f57454h;
        g();
        this.f57455j = new o(this.e);
        ValueAnimator valueAnimatorC = this.f57450a.c(new r(this, 0), new r(this, 1));
        this.f57457m = valueAnimatorC;
        valueAnimatorC.start();
    }

    @Override // iu0.b
    public final void f() {
        h();
        this.f57455j = p.f168454a;
        invalidate();
    }

    public final void g() {
        this.k.cancel();
        this.f57456l.cancel();
        this.f57457m.cancel();
    }

    @Override // iu0.b
    @NotNull
    public View getView() {
        return this;
    }

    public final void h() {
        if (this.k.isRunning()) {
            this.k.end();
        }
        if (this.f57456l.isRunning()) {
            this.f57456l.end();
        }
        if (this.f57457m.isRunning()) {
            this.f57457m.end();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.pincode.PlaceholderDotsView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        String string = getView().getContext().getString(R$string.passcode_field_accessibility_value, Integer.valueOf(this.i), Integer.valueOf(this.f57454h));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c.a(context, info, string);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(e.d(View.MeasureSpec.getSize(i) - (this.f57453g * 2), i), e.d(getPaddingBottom() + getPaddingTop() + ((int) (this.f57450a.f + 1)), i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.f57451b.set(new PointF(i / 2.0f, i2 / 2.0f));
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.f57458n == colorScheme) {
            return;
        }
        this.f57458n = colorScheme;
        e eVar = this.f57450a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        int iS = kli.a.s(colorScheme.a(), eVar.f168432a);
        eVar.f168433b = iS;
        eVar.f168434c = io0.a.d(0.4f, iS);
        this.e.setColor(eVar.f168433b);
        this.f.setColor(eVar.f168434c);
        invalidate();
    }

    @Override // iu0.b
    public void setDotsSelected(Integer amount) {
        int iIntValue;
        if (amount != null) {
            iIntValue = amount.intValue();
            int i = this.f57454h;
            if (iIntValue > i) {
                iIntValue = i;
            }
        } else {
            iIntValue = this.f57454h;
        }
        this.i = iIntValue;
        this.f57455j = new n(amount);
        h();
        j jVar = new j(this, 0);
        ValueAnimator valueAnimatorB = e.b(this.f57450a, new float[]{1.0f, 1.2f, 1.0f}, jVar);
        this.k = valueAnimatorB;
        valueAnimatorB.start();
    }

    public final void setPlaceholderLength(int length) {
        if (this.f57454h > 12) {
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.b(rd0.c.WARNING, "DotsFixedModeDelegate", "View might work not as expected for 12+ dots", null, null, 16);
        }
        this.f57454h = length;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaceholderDotsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderDotsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        e eVar = new e(context);
        this.f57450a = eVar;
        this.f57451b = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.f57452c = e.a(eVar.f168433b);
        this.d = e.a(eVar.f168433b);
        this.e = e.a(eVar.f168433b);
        this.f = e.a(eVar.f168434c);
        this.f57453g = kli.a.k(context, 48.0f);
        this.f57455j = new k();
        this.k = new ValueAnimator();
        this.f57456l = new ValueAnimator();
        this.f57457m = new ValueAnimator();
        pd.b.q(this, true);
    }

    public /* synthetic */ PlaceholderDotsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
