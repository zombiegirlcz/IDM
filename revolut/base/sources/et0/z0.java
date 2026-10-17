package et0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 extends View implements fs0.q {
    public static final /* synthetic */ int O = 0;
    public boolean A;
    public int B;
    public int C;
    public final OverScroller D;
    public final GestureDetector E;
    public final EdgeEffect F;
    public final EdgeEffect G;
    public final vu0.d H;
    public final ty0.c I;
    public final jo0.h J;
    public final fs0.p K;
    public final v0 L;
    public Function1 M;
    public boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f129164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f129165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f129166c;
    public final int d;
    public final int e;
    public final TextPaint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextPaint f129167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f129168h;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f129169j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearGradient f129170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearGradient f129171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f129172n;
    public final Path o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f129173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f129174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f129175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f129176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f129177t;
    public int[] u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Pair f129180y;
    public boolean z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LinearGradient getLeftFadeGradient() {
        LinearGradient linearGradient = this.f129170l;
        if (linearGradient != null) {
            return linearGradient;
        }
        int i = this.k;
        LinearGradient linearGradient2 = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f129172n, BitmapDescriptorFactory.HUE_RED, i, ColorUtils.setAlphaComponent(i, 0), Shader.TileMode.CLAMP);
        this.f129170l = linearGradient2;
        return linearGradient2;
    }

    private final int getMaxScrollX() {
        return Math.max(0, this.v - getWidth());
    }

    private final LinearGradient getRightFadeGradient() {
        LinearGradient linearGradient = this.f129171m;
        if (linearGradient != null) {
            return linearGradient;
        }
        LinearGradient linearGradient2 = new LinearGradient(getWidth() - this.f129172n, BitmapDescriptorFactory.HUE_RED, getWidth(), BitmapDescriptorFactory.HUE_RED, ColorUtils.setAlphaComponent(this.k, 0), this.k, Shader.TileMode.CLAMP);
        this.f129171m = linearGradient2;
        return linearGradient2;
    }

    public final void a() {
        Pair pair = this.f129180y;
        if (pair != null) {
            ix0.b0 b0Var = (ix0.b0) pair.f186385a;
            Spannable spannable = (Spannable) pair.f186386b;
            int i = ix0.b0.o;
            b0Var.b(3, this, spannable, false);
        }
        this.f129180y = null;
    }

    public final Pair b(float f, float f4) {
        float scrollX = f + getScrollX();
        float paddingTop = getPaddingTop();
        int i = this.f129179x;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            int i5 = this.u[i3];
            if (f4 >= paddingTop) {
                float f5 = i5;
                if (f4 < paddingTop + f5) {
                    float f6 = (f5 / 2.0f) + paddingTop;
                    float paddingStart = getPaddingStart();
                    int size = this.f129176s.size();
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        int i6 = this.f129177t[i2];
                        if (scrollX < paddingStart || scrollX >= i6 + paddingStart) {
                            paddingStart += i6;
                            i2++;
                        } else {
                            Layout layout = (Layout) kotlin.collections.d.W(i3, ((y0) this.f129176s.get(i2)).f129149a);
                            if (layout != null) {
                                float f32 = scrollX - (paddingStart + this.e);
                                float height = f4 - (f6 - (layout.getHeight() / 2.0f));
                                CharSequence text = layout.getText();
                                Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
                                if (spannable != null) {
                                    ix0.c0.f169220a.getClass();
                                    ix0.b0 b0VarA = ix0.c0.a(layout, spannable, f32, height);
                                    if (b0VarA != null) {
                                        Pair pair = this.f129180y;
                                        return (pair != null && b0VarA.equals(pair.f186385a) && spannable.equals(pair.f186386b)) ? pair : new Pair(b0VarA, spannable);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            paddingTop += i5;
            i3++;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 == r2) goto L31
            r2 = 2
            if (r0 == r2) goto L15
            r6 = 3
            if (r0 == r6) goto L11
            goto L6a
        L11:
            r5.a()
            return r1
        L15:
            kotlin.Pair r0 = r5.f129180y
            if (r0 == 0) goto L6a
            float r0 = r6.getX()
            float r6 = r6.getY()
            kotlin.Pair r6 = r5.b(r0, r6)
            kotlin.Pair r0 = r5.f129180y
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            if (r6 != 0) goto L6a
            r5.a()
            return r1
        L31:
            kotlin.Pair r6 = r5.f129180y
            r0 = 0
            r5.f129180y = r0
            if (r6 == 0) goto L45
            java.lang.Object r0 = r6.f186385a
            ix0.b0 r0 = (ix0.b0) r0
            java.lang.Object r3 = r6.f186386b
            android.text.Spannable r3 = (android.text.Spannable) r3
            int r4 = ix0.b0.o
            r0.b(r2, r5, r3, r1)
        L45:
            if (r6 == 0) goto L6a
            goto L69
        L48:
            float r0 = r6.getX()
            float r6 = r6.getY()
            kotlin.Pair r6 = r5.b(r0, r6)
            r5.f129180y = r6
            if (r6 == 0) goto L65
            java.lang.Object r0 = r6.f186385a
            ix0.b0 r0 = (ix0.b0) r0
            java.lang.Object r6 = r6.f186386b
            android.text.Spannable r6 = (android.text.Spannable) r6
            int r3 = ix0.b0.o
            r0.b(r1, r5, r6, r1)
        L65:
            kotlin.Pair r6 = r5.f129180y
            if (r6 == 0) goto L6a
        L69:
            return r2
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: et0.z0.c(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return i < 0 ? getScrollX() > 0 : getScrollX() < Math.max(0, this.v - getWidth());
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return getWidth();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return getScrollX();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return this.v;
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.D;
        if (overScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int iMax = Math.max(0, this.v - getWidth());
            scrollTo(overScroller.getCurrX(), overScroller.getCurrY());
            int currVelocity = (int) overScroller.getCurrVelocity();
            if (scrollX <= 0 && getScrollX() <= 0 && currVelocity > 0) {
                if (!this.N) {
                    this.F.onAbsorb(currVelocity);
                }
                overScroller.abortAnimation();
            } else if (scrollX >= iMax && getScrollX() >= iMax && currVelocity > 0) {
                if (!this.N) {
                    this.G.onAbsorb(currVelocity);
                }
                overScroller.abortAnimation();
            }
            awakenScrollBars();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.H.d(event);
        return super.dispatchTouchEvent(event);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.N) {
            super.draw(canvas);
            boolean z = getScrollX() > 0;
            zDraw = getScrollX() < getMaxScrollX();
            if (z || zDraw) {
                int iSave = canvas.save();
                canvas.translate(getScrollX(), BitmapDescriptorFactory.HUE_RED);
                Paint paint = this.f129169j;
                if (z) {
                    paint.setShader(getLeftFadeGradient());
                    canvas2 = canvas;
                    canvas2.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f129172n, getHeight(), paint);
                } else {
                    canvas2 = canvas;
                }
                if (zDraw) {
                    paint.setShader(getRightFadeGradient());
                    canvas2.drawRect(getWidth() - this.f129172n, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), paint);
                }
                canvas2.restoreToCount(iSave);
                return;
            }
            return;
        }
        super.draw(canvas);
        EdgeEffect edgeEffect = this.F;
        if (!edgeEffect.isFinished()) {
            int iSave2 = canvas.save();
            canvas.rotate(270.0f);
            canvas.translate(-getHeight(), BitmapDescriptorFactory.HUE_RED);
            edgeEffect.setSize(getHeight(), getWidth());
            zDraw = edgeEffect.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect2 = this.G;
        if (!edgeEffect2.isFinished()) {
            int iSave3 = canvas.save();
            canvas.translate(getWidth(), BitmapDescriptorFactory.HUE_RED);
            canvas.rotate(90.0f);
            edgeEffect2.setSize(getHeight(), getWidth());
            boolean z3 = edgeEffect2.draw(canvas) ? true : zDraw;
            canvas.restoreToCount(iSave3);
            zDraw = z3;
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @NotNull
    public final List<x0> getCachedColumns$ui_kit_components_release() {
        return this.f129175r;
    }

    @NotNull
    public final int[] getColWidths$ui_kit_components_release() {
        return this.f129177t;
    }

    public final int getInnerHorPadding$ui_kit_components_release() {
        return this.e;
    }

    public final Function1<ty0.a, Unit> getOnClauseClick() {
        return this.M;
    }

    public final Function3 getOnSelectionAction() {
        return this.K.J;
    }

    @NotNull
    public final List<y0> getRenderColumns$ui_kit_components_release() {
        return this.f129176s;
    }

    @NotNull
    public final int[] getRowHeights$ui_kit_components_release() {
        return this.u;
    }

    @NotNull
    public final List<pw0.b> getSelectionMenuItems() {
        return this.K.I;
    }

    @Override // fs0.q
    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0175  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et0.z0.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i5;
        int i6;
        if (this.f129175r.isEmpty()) {
            super.onMeasure(i, i2);
            return;
        }
        if (!this.A && i == this.B && i2 == this.C) {
            setMeasuredDimension(View.resolveSize(this.v, i), View.resolveSize(this.f129178w, i2));
            return;
        }
        this.B = i;
        this.C = i2;
        int i21 = 0;
        this.A = false;
        int size = (View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd();
        if (this.f129175r.size() >= 3 || !this.N) {
            i3 = this.f129165b;
        } else {
            int size2 = this.f129175r.size();
            i3 = size / size2;
            if ((size ^ size2) < 0 && size2 * i3 != size) {
                i3--;
            }
        }
        zhm.p.q(0, this.u);
        int size3 = this.f129175r.size();
        int i22 = 0;
        int i32 = 0;
        while (true) {
            i5 = this.e;
            if (i22 >= size3) {
                break;
            }
            x0 x0Var = (x0) this.f129175r.get(i22);
            int length = x0Var.f129146a.length;
            int i33 = this.f129164a;
            int iMax = i33;
            for (int i43 = i21; i43 < length; i43++) {
                iMax = Math.max(iMax, Math.min(i3 - (i5 * 2), x0Var.f129146a[i43].f1988b + 1));
            }
            int iMax2 = Math.max(i33, Math.min(i3, (i5 * 2) + iMax));
            this.f129177t[i22] = iMax2;
            i32 += iMax2;
            i22++;
            i21 = 0;
        }
        if (i32 < size) {
            int i59 = size - i32;
            int i66 = 0;
            for (int i74 : this.f129177t) {
                if (i74 < i3) {
                    i66++;
                }
            }
            while (i59 > 0 && i66 > 0) {
                int i92 = i59 / i66;
                if (i92 == 0) {
                    break;
                }
                int length2 = this.f129177t.length;
                i66 = 0;
                int i96 = 0;
                for (int i99 = 0; i99 < length2; i99++) {
                    int i100 = this.f129177t[i99];
                    if (i100 < i3) {
                        int iMin = Math.min(i92, i3 - i100);
                        int[] iArr = this.f129177t;
                        int i101 = iArr[i99] + iMin;
                        iArr[i99] = i101;
                        i96 += iMin;
                        if (i101 < i3) {
                            i66++;
                        }
                    }
                }
                i59 -= i96;
                if (i96 == 0) {
                    break;
                }
            }
        }
        List list = this.f129175r;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        int i102 = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            int i103 = i102 + 1;
            if (i102 < 0) {
                zhm.v.s();
                throw null;
            }
            x0 x0Var2 = (x0) next;
            int length3 = x0Var2.f129146a.length;
            Layout[] layoutArr = new Layout[length3];
            int i104 = 0;
            while (i104 < length3) {
                Spannable spannable = (Spannable) x0Var2.f129146a[i104].f1989c;
                Iterator it9 = it8;
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), i104 == 0 ? this.f : this.f129167g, this.f129177t[i102] - (i5 * 2)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).build();
                Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
                int height = staticLayoutBuild.getHeight();
                int i105 = this.d;
                if (i104 == 0) {
                    i6 = (i105 * 2) + height;
                    height = (int) this.f129166c;
                } else {
                    i6 = i105 * 2;
                }
                int i106 = i6 + height;
                int[] iArr2 = this.u;
                iArr2[i104] = Math.max(iArr2[i104], i106);
                layoutArr[i104] = staticLayoutBuild;
                i104++;
                it8 = it9;
            }
            arrayList.add(new y0(layoutArr));
            i102 = i103;
            it8 = it8;
        }
        this.f129176s = arrayList;
        int[] iArr3 = this.f129177t;
        Intrinsics.checkNotNullParameter(iArr3, "<this>");
        int i107 = 0;
        for (int i108 : iArr3) {
            i107 += i108;
        }
        this.v = getPaddingEnd() + getPaddingStart() + i107;
        int[] iArr4 = this.u;
        Intrinsics.checkNotNullParameter(iArr4, "<this>");
        int i109 = 0;
        for (int i110 : iArr4) {
            i109 += i110;
        }
        this.f129178w = getPaddingBottom() + getPaddingTop() + i109;
        setMeasuredDimension(View.resolveSize(this.v, i), View.resolveSize(this.f129178w, i2));
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        this.f129170l = null;
        this.f129171m = null;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i5) {
        super.onScrollChanged(i, i2, i3, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.z = true;
        this.f129170l = null;
        this.f129171m = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        fs0.p pVar = this.K;
        boolean z = pVar.H;
        EdgeEffect edgeEffect = this.G;
        EdgeEffect edgeEffect2 = this.F;
        vu0.d dVar = this.H;
        if (z && pVar.k(event)) {
            if (event.getActionMasked() == 1 || event.getActionMasked() == 3) {
                dVar.f();
                a();
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
                return true;
            }
        } else if (this.v > getWidth()) {
            boolean zA = dVar.a(event);
            OverScroller overScroller = this.D;
            if (!zA) {
                if (event.getActionMasked() == 0 && !overScroller.isFinished()) {
                    overScroller.abortAnimation();
                }
                a();
                return false;
            }
            boolean zOnTouchEvent = this.E.onTouchEvent(event);
            if (event.getActionMasked() == 1 || event.getActionMasked() == 3) {
                dVar.f();
                if (!overScroller.isFinished()) {
                    awakenScrollBars();
                }
                a();
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
                if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                    postInvalidateOnAnimation();
                }
            }
            if (!zOnTouchEvent && !super.onTouchEvent(event)) {
                return false;
            }
        } else if (!c(event) && (!pVar.H || event.getActionMasked() != 0)) {
            return super.onTouchEvent(event);
        }
        return true;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(Math.max(0, Math.min(i, Math.max(0, this.v - getWidth()))), i2);
    }

    public final void setCachedColumns$ui_kit_components_release(@NotNull List<x0> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f129175r = list;
    }

    public final void setColWidths$ui_kit_components_release(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f129177t = iArr;
    }

    public final void setOnClauseClick(Function1<? super ty0.a, Unit> function1) {
        this.M = function1;
    }

    public final void setOnSelectionAction(Function3 function3) {
        this.K.J = function3;
    }

    public final void setRenderColumns$ui_kit_components_release(@NotNull List<y0> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f129176s = list;
    }

    public final void setRowHeights$ui_kit_components_release(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.u = iArr;
    }

    public final void setSelectionEnabled(boolean z) {
        fs0.p pVar = this.K;
        if (pVar.j() && !z) {
            pVar.f137540h = fs0.m.NONE;
            pVar.g();
        }
        if (!z && pVar.H && pVar.j()) {
            pVar.f137540h = fs0.m.NONE;
            pVar.g();
        }
        pVar.H = z;
    }

    public final void setSelectionMenuItems(@NotNull List<pw0.b> value) {
        ActionMode actionMode;
        Intrinsics.checkNotNullParameter(value, "value");
        fs0.p pVar = this.K;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        pVar.I = value;
        if (!pVar.j() || (actionMode = pVar.d) == null) {
            return;
        }
        actionMode.invalidate();
    }

    public final void setUncontained(boolean z) {
        if (this.N != z) {
            this.N = z;
            this.A = true;
            requestLayout();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r12v6, types: [et0.v0] */
    public z0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129164a = kli.a.k(context, 40.0f);
        this.f129165b = kli.a.k(context, 180.0f);
        float fL = kli.a.l(context, 24.0f);
        float fL2 = kli.a.l(context, 4.0f);
        float fL3 = kli.a.l(context, 2.0f);
        this.f129166c = fL3;
        this.d = kli.a.k(context, 12.0f);
        this.e = kli.a.k(context, 16.0f);
        final int i2 = 1;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        jb3.l.d(textPaint, context, R$attr.internal_textAppearanceBody2);
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(kli.a.s(R$attr.uikit_colorForeground, context));
        jb3.l.d(textPaint2, context, R$attr.internal_textAppearanceBody2);
        this.f129167g = textPaint2;
        Paint paint = new Paint(1);
        paint.setColor(kli.a.s(R$attr.uikit_colorWidgetBackground, context));
        paint.setStyle(Paint.Style.FILL);
        this.f129168h = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(kli.a.s(R$attr.uikit_colorGreyTone5, context));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fL3);
        this.i = paint2;
        this.f129169j = new Paint(1);
        this.k = kli.a.s(R$attr.uikit_colorBackground, context);
        this.f129172n = kli.a.l(context, 32.0f);
        this.o = new Path();
        final int i3 = 0;
        this.f129173p = new float[]{fL, fL, fL, fL, fL2, fL2, fL2, fL2};
        this.f129174q = new float[]{fL2, fL2, fL2, fL2, fL, fL, fL, fL};
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f129175r = f0Var;
        this.f129176s = f0Var;
        this.f129177t = new int[0];
        this.u = new int[0];
        this.z = true;
        this.A = true;
        this.B = -1;
        this.C = -1;
        setNestedScrollingEnabled(true);
        this.D = new OverScroller(context);
        this.E = new GestureDetector(context, new bx0.q(this, 1));
        this.F = new EdgeEffect(context);
        this.G = new EdgeEffect(context);
        this.H = new vu0.d(this, new vu0.a(Float.valueOf(ViewConfiguration.get(context).getScaledTouchSlop()), null, null, null, new Function1(this) { // from class: et0.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f129134b;

            {
                this.f129134b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i5 = i3;
                z0 z0Var = this.f129134b;
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) obj2).floatValue();
                        int i6 = z0.O;
                        return Boolean.valueOf(z0Var.canScrollHorizontally(fFloatValue < BitmapDescriptorFactory.HUE_RED ? 1 : -1));
                    default:
                        ty0.a it8 = (ty0.a) obj2;
                        int i21 = z0.O;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        Function1 function1 = z0Var.M;
                        if (function1 != null) {
                            function1.invoke(it8);
                        }
                        return Unit.f186387a;
                }
            }
        }, 14));
        ty0.c cVarB0 = or0.u.k(this).b0();
        this.I = cVarB0;
        this.J = new jo0.h();
        this.K = new fs0.p(this, cVarB0);
        this.L = new Function1(this) { // from class: et0.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f129134b;

            {
                this.f129134b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i5 = i2;
                z0 z0Var = this.f129134b;
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) obj2).floatValue();
                        int i6 = z0.O;
                        return Boolean.valueOf(z0Var.canScrollHorizontally(fFloatValue < BitmapDescriptorFactory.HUE_RED ? 1 : -1));
                    default:
                        ty0.a it8 = (ty0.a) obj2;
                        int i21 = z0.O;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        Function1 function1 = z0Var.M;
                        if (function1 != null) {
                            function1.invoke(it8);
                        }
                        return Unit.f186387a;
                }
            }
        };
    }

    public /* synthetic */ z0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
