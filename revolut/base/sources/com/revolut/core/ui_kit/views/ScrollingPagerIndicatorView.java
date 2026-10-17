package com.revolut.core.ui_kit.views;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.sb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u00019B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u000eJ\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\f2\b\b\u0001\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u000eJ\u001f\u0010&\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u0017R\u001c\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b*\u0010+\u0012\u0004\b,\u0010-R&\u00105\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010-\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/revolut/core/ui_kit/views/ScrollingPagerIndicatorView;", "Landroid/view/View;", "Ltx0/x;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "count", "", "setDotCount", "(I)V", "", "looped", "setLooped", "(Z)V", "color", "setDotColor", "setSelectedDotColor", "getVisibleDotCount", "()I", "visibleDotCount", "setVisibleDotCount", "getVisibleDotThreshold", "visibleDotThreshold", "setVisibleDotThreshold", "getOrientation", "orientation", "setOrientation", "position", "setCurrentPosition", "setTotalPages", "setCurrentPage", "normalColor", "selectedColor", "setIndicatorColors", "(II)V", "getPagesCount", "getDotCount", "h", "I", "getOrientation$annotations", "()V", "Landroid/util/SparseArray;", "", "s", "Landroid/util/SparseArray;", "getDotScale", "()Landroid/util/SparseArray;", "getDotScale$annotations", "dotScale", "getView", "()Landroid/view/View;", "view", "mx0/sb", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScrollingPagerIndicatorView extends View implements tx0.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f58853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58855c;
    public final int d;
    public final int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f58856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int orientation;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f58858j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f58859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f58860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f58861n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0.d f58862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public sb f58863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f58864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final SparseArray dotScale;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f58866t;
    public final ArgbEvaluator u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollingPagerIndicatorView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getDotCount() {
        return (!this.o || this.f58859l <= this.f) ? this.f58859l : this.f58853a;
    }

    public static /* synthetic */ void getDotScale$annotations() {
    }

    private static /* synthetic */ void getOrientation$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // tx0.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(float r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 < 0) goto L79
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L79
            r1 = 1
            if (r11 < 0) goto L14
            if (r11 == 0) goto L35
            int r2 = r9.f58859l
            if (r11 < r2) goto L35
        L14:
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r3 = rd0.c.WARNING
            int r2 = r9.f58859l
            java.lang.String r4 = ". page must be [0, adapter.getItemCount()) which is [0, "
            java.lang.String r5 = ") atm."
            java.lang.String r6 = "page = "
            java.lang.String r5 = com.google.android.gms.internal.mlkit_vision_face.a.m(r6, r11, r2, r4, r5)
            r7 = 0
            r8 = 16
            java.lang.String r4 = "ScrollingPagerIndicatorView#onPageScrolled"
            r6 = 0
            rd0.d.b(r3, r4, r5, r6, r7, r8)
            int r2 = r9.f58859l
            int r2 = r2 - r1
            r3 = 0
            int r11 = kotlin.ranges.f.g(r11, r3, r2)
        L35:
            boolean r2 = r9.o
            if (r2 == 0) goto L42
            int r2 = r9.f
            int r3 = r9.f58859l
            r4 = 2
            if (r4 > r3) goto L72
            if (r3 > r2) goto L72
        L42:
            android.util.SparseArray r2 = r9.dotScale
            r2.clear()
            int r2 = r9.f58859l
            int r2 = r2 - r1
            if (r11 != r2) goto L4d
            goto L4e
        L4d:
            r0 = r10
        L4e:
            float r1 = (float) r1
            float r2 = r1 - r10
            int r3 = r9.getDotCount()
            if (r3 != 0) goto L58
            goto L61
        L58:
            float r0 = java.lang.Math.abs(r0)
            float r0 = r1 - r0
            r9.f(r0, r11)
        L61:
            int r0 = r11 + 1
            int r3 = r9.getDotCount()
            if (r3 != 0) goto L6a
            goto L72
        L6a:
            float r2 = java.lang.Math.abs(r2)
            float r1 = r1 - r2
            r9.f(r1, r0)
        L72:
            r9.b(r10, r11)
            r9.invalidate()
            return
        L79:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Offset must be [0, 1]"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView.K(float, int):void");
    }

    @Override // tx0.x
    public final void P(ViewPager2 pager) {
        Intrinsics.checkNotNullParameter(pager, "pager");
        c(pager, new gu0.i());
    }

    @Override // tx0.x
    public final void a() {
        sb sbVar = this.f58863q;
        if (sbVar != null) {
            sbVar.a();
        }
        this.f58863q = null;
        this.f58862p = null;
        this.f58864r = false;
        this.o = false;
    }

    public final void b(float f, int i) {
        if (this.f58859l <= this.f) {
            this.i = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        boolean z = this.o;
        int i2 = this.e;
        if (z) {
            this.i = ((i2 * f) + d(this.f58853a / 2)) - (this.f58858j / 2);
            return;
        }
        float fD = (i2 * f) + d(i);
        float f4 = 2;
        this.i = fD - (this.f58858j / f4);
        int i3 = this.f / 2;
        float fD2 = d((getDotCount() - 1) - i3);
        if ((this.f58858j / f4) + this.i < d(i3)) {
            this.i = d(i3) - (this.f58858j / f4);
            return;
        }
        float f5 = this.i;
        float f6 = this.f58858j;
        if ((f6 / f4) + f5 > fD2) {
            this.i = fD2 - (f6 / f4);
        }
    }

    public final void c(Object obj2, sb attacher) {
        Intrinsics.checkNotNullParameter(attacher, "attacher");
        a();
        attacher.b(this, obj2);
        this.f58863q = attacher;
        this.f58862p = new b0.d(this, 16, obj2, attacher);
    }

    public final float d(int i) {
        return this.k + (i * this.e);
    }

    public final void e(float f, int i, int i2) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        }
        int i3 = this.f58859l;
        if (i3 == 0 || i < 0 || i >= i3 || i2 < 0 || i2 >= i3) {
            return;
        }
        if (i == i2) {
            setCurrentPosition(i);
            return;
        }
        if (i3 > this.f) {
            K(f, i);
            return;
        }
        this.dotScale.clear();
        f(1.0f - f, i);
        f(f, i2);
        b(BitmapDescriptorFactory.HUE_RED, i);
        invalidate();
    }

    public final void f(float f, int i) {
        SparseArray sparseArray = this.dotScale;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, Float.valueOf(f));
        }
    }

    @NotNull
    public final SparseArray<Float> getDotScale() {
        return this.dotScale;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public int getPagesCount() {
        return getDotCount();
    }

    @Override // tx0.x
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: getVisibleDotCount, reason: from getter */
    public final int getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: getVisibleDotThreshold, reason: from getter */
    public final int getF58856g() {
        return this.f58856g;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.orientation
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r5.e
            int r4 = r5.d
            if (r0 != 0) goto L34
            boolean r6 = r5.isInEditMode()
            if (r6 == 0) goto L19
            int r6 = r5.f
        L14:
            int r6 = r6 + (-1)
            int r6 = r6 * r3
            int r6 = r6 + r4
            goto L22
        L19:
            int r6 = r5.f58859l
            int r0 = r5.f
            if (r6 < r0) goto L14
            float r6 = r5.f58858j
            int r6 = (int) r6
        L22:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 == r2) goto L2f
            if (r0 == r1) goto L5e
            goto L5f
        L2f:
            int r4 = java.lang.Math.min(r4, r7)
            goto L5f
        L34:
            boolean r7 = r5.isInEditMode()
            if (r7 == 0) goto L41
            int r7 = r5.f
        L3c:
            int r7 = r7 + (-1)
            int r7 = r7 * r3
            int r7 = r7 + r4
            goto L4a
        L41:
            int r7 = r5.f58859l
            int r0 = r5.f
            if (r7 < r0) goto L3c
            float r7 = r5.f58858j
            int r7 = (int) r7
        L4a:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            if (r0 == r2) goto L59
            if (r0 == r1) goto L57
            goto L5d
        L57:
            r4 = r6
            goto L5d
        L59:
            int r4 = java.lang.Math.min(r4, r6)
        L5d:
            r6 = r4
        L5e:
            r4 = r7
        L5f:
            r5.setMeasuredDimension(r6, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView.onMeasure(int, int):void");
    }

    public void setCurrentPage(int position) {
        setCurrentPosition(position);
    }

    public final void setCurrentPosition(int position) {
        if ((position == 0 || (position >= 0 && position < this.f58859l)) && this.f58859l != 0) {
            b(BitmapDescriptorFactory.HUE_RED, position);
            if (!this.o || this.f58859l < this.f) {
                SparseArray sparseArray = this.dotScale;
                sparseArray.clear();
                sparseArray.put(position, Float.valueOf(1.0f));
                invalidate();
            }
        }
    }

    public final void setDotColor(int color) {
        this.f58860m = color;
        invalidate();
    }

    public final void setDotCount(int count) {
        if (this.f58859l == count && this.f58864r) {
            return;
        }
        this.f58864r = true;
        this.f58859l = count;
        this.dotScale.clear();
        if (count < this.f58856g) {
            requestLayout();
            invalidate();
            return;
        }
        this.k = (!this.o || this.f58859l <= this.f) ? this.d / 2.0f : BitmapDescriptorFactory.HUE_RED;
        this.f58858j = ((this.f - 1) * this.e) + r1;
        requestLayout();
        invalidate();
    }

    @Override // tx0.x
    public void setIndicatorColors(int normalColor, int selectedColor) {
        setDotColor(normalColor);
        setSelectedDotColor(selectedColor);
    }

    public final void setLooped(boolean looped) throws ExecutionException, InterruptedException {
        this.o = looped;
        b0.d dVar = this.f58862p;
        if (dVar != null) {
            dVar.run();
        }
        invalidate();
        invalidate();
    }

    public final void setOrientation(int orientation) throws ExecutionException, InterruptedException {
        this.orientation = orientation;
        b0.d dVar = this.f58862p;
        if (dVar == null) {
            requestLayout();
            return;
        }
        if (dVar != null) {
            dVar.run();
        }
        invalidate();
    }

    public final void setSelectedDotColor(int color) {
        this.f58861n = color;
        invalidate();
    }

    @Override // tx0.x
    public void setTotalPages(int count) {
        setDotCount(count);
    }

    public final void setVisibleDotCount(int visibleDotCount) throws ExecutionException, InterruptedException {
        if (visibleDotCount % 2 == 0) {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
        this.f = visibleDotCount;
        this.f58853a = visibleDotCount + 2;
        b0.d dVar = this.f58862p;
        if (dVar == null) {
            requestLayout();
            return;
        }
        if (dVar != null) {
            dVar.run();
        }
        invalidate();
    }

    public final void setVisibleDotThreshold(int visibleDotThreshold) throws ExecutionException, InterruptedException {
        this.f58856g = visibleDotThreshold;
        b0.d dVar = this.f58862p;
        if (dVar == null) {
            requestLayout();
            return;
        }
        if (dVar != null) {
            dVar.run();
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollingPagerIndicatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingPagerIndicatorView(@NotNull Context context, AttributeSet attributeSet, int i) throws ExecutionException, InterruptedException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dotScale = new SparseArray();
        this.f58866t = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.u = new ArgbEvaluator();
        this.f58860m = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        this.f58861n = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        this.f58855c = kli.a.k(context, 4.0f);
        this.d = kli.a.k(context, 6.0f);
        this.f58854b = kli.a.k(context, 2.0f);
        this.e = kli.a.k(context, 8.0f);
        this.o = false;
        setVisibleDotCount(5);
        this.f58856g = 2;
        this.orientation = 0;
        if (isInEditMode()) {
            setDotCount(this.f);
            K(BitmapDescriptorFactory.HUE_RED, this.f / 2);
        }
    }

    public /* synthetic */ ScrollingPagerIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
