package wx0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_resources.R$attr;
import efm.r;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.p6;
import mx0.q6;
import mx0.r6;
import ny0.i;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tsk.t;
import wrj.p;
import wsg.k;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends NestedScrollView implements b, ny0.h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f300722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f300723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f300724c;
    public final ifm.b d;
    public List e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ny0.g f300725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableScatterSet f300726h;
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f300727j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f300728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f300729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f300730n;
    public final float o;

    public static final class a {
        private a() {
        }

        public static ColorStateList a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{kli.a.s(R$attr.uikit_colorAccentNeutral, context), kli.a.s(R$attr.uikit_colorGreyTone50, context)});
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getContent$ui_kit_components_release$annotations() {
    }

    @Override // wx0.b
    public final r a() {
        return this.f300723b;
    }

    @Override // wx0.b
    public final void b(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        m(itemId, false);
    }

    @Override // wx0.b
    public final void d(String itemId, boolean z) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        MutableScatterSet mutableScatterSet = this.f300726h;
        if (z ? mutableScatterSet.add(itemId) : mutableScatterSet.remove(itemId)) {
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float x3;
        int right;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        LinearLayout linearLayout = this.i;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            Object tag2 = childAt.getTag();
            String str = tag2 instanceof String ? (String) tag2 : null;
            if (str != null && this.f300726h.contains(str)) {
                c cVar = childAt instanceof c ? (c) childAt : null;
                if (cVar != null) {
                    View iconView = cVar.getIconView();
                    float y2 = childAt.getY() + linearLayout.getY() + iconView.getTop();
                    if (z) {
                        x3 = childAt.getX() + linearLayout.getX();
                        right = iconView.getLeft();
                    } else {
                        x3 = childAt.getX() + linearLayout.getX();
                        right = iconView.getRight();
                    }
                    canvas.drawCircle(x3 + right, y2, this.f300730n, this.f300729m);
                }
            }
        }
    }

    @Override // wx0.b
    public final r f() {
        return this.f300722a;
    }

    public final void g() {
        int i = this.f300727j;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 2.0f) + i;
        int i2 = this.k;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.i.setPaddingRelative(0, iK, 0, kli.a.k(context2, 2.0f) + i2);
    }

    @NotNull
    public final LinearLayout getContent$ui_kit_components_release() {
        return this.i;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    @Override // wx0.b
    public final void i(b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        List list = this.e;
        if (list != null) {
            other.setItems(list);
        }
        String str = this.f;
        if (str != null) {
            other.b(str);
        }
        List list2 = this.e;
        if (list2 != null) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                String str2 = ((FloatingBottomBarView.Item) it8.next()).f58588a;
                other.d(str2, this.f300726h.contains(str2));
            }
        }
    }

    @Override // wx0.b
    public final r j() {
        return this.f300724c;
    }

    @Override // wx0.b
    public final r k() {
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View, mx0.z4] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final void l() {
        ?? eVar;
        ifm.b bVar = this.d;
        bVar.d();
        List list = this.e;
        if (list == null) {
            return;
        }
        ?? r2 = this.i;
        r2.removeAllViews();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ny0.g gVarA = i.a(context);
        this.f300725g = gVarA;
        if (gVarA instanceof ny0.f) {
            return;
        }
        boolean z = gVarA instanceof ny0.e;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 4.0f);
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            FloatingBottomBarView.Item item = (FloatingBottomBarView.Item) obj2;
            if (z) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                eVar = new f(context3);
            } else {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                eVar = new e(context4);
            }
            eVar.setModel(item);
            eVar.setSelected(Intrinsics.f(item.f58588a, this.f));
            r rVarA = eVar.a();
            wwa.a aVar = new wwa.a(this, item, 1);
            r rVarOnErrorResumeNext = rVarA.onErrorResumeNext(new t(new p(new BreadcrumbException(), 1)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o9h.d(26, aVar), new o9h.d(26, h.f300731a));
            Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
            w.j0(bVar, cVarSubscribe);
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            int iK2 = kli.a.k(context5, z ? 24.0f : 16.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(iK2);
            layoutParams.setMarginEnd(iK2);
            layoutParams.topMargin = i == 0 ? 0 : iK;
            r2.addView(eVar, layoutParams);
            i = i2;
        }
    }

    public final void m(String str, boolean z) {
        String str2 = this.f;
        if (Intrinsics.f(str2, str)) {
            if (z) {
                this.f300724c.onNext(new q6(str));
                return;
            }
            return;
        }
        LinearLayout linearLayout = this.i;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            childAt.setSelected(Intrinsics.f(childAt.getTag(), str));
        }
        this.f = str;
        this.f300722a.onNext(new p6(str2, str));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float scrollY = getScrollY();
        float height = getHeight() + getScrollY();
        int layoutDirection = getLayoutDirection();
        Paint paint = this.f300728l;
        if (layoutDirection == 1) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, scrollY, this.o, height, paint);
        } else {
            canvas.drawRect(getWidth() - this.o, scrollY, getWidth(), height, paint);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ny0.g gVarA = i.a(context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iA = gVarA.a(context2);
        if (iA > 0) {
            if (size > 0) {
                iA = Math.min(iA, size);
            }
            i = View.MeasureSpec.makeMeasureSpec(iA, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // wx0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setItems(@org.jetbrains.annotations.NotNull java.util.List<com.revolut.core.ui_kit.views.FloatingBottomBarView.Item> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r0 = r2.e
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r3, r0)
            if (r0 == 0) goto Le
            return
        Le:
            java.lang.String r0 = r2.f
            r2.e = r3
            if (r0 == 0) goto L3d
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r1 = r3 instanceof java.util.Collection
            if (r1 == 0) goto L24
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L24
            goto L3d
        L24:
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            com.revolut.core.ui_kit.views.FloatingBottomBarView$Item r1 = (com.revolut.core.ui_kit.views.FloatingBottomBarView.Item) r1
            java.lang.String r1 = r1.f58588a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r0)
            if (r1 == 0) goto L28
            goto L3e
        L3d:
            r0 = 0
        L3e:
            r2.f = r0
            r2.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.g.setItems(java.util.List):void");
    }

    @Override // wx0.b
    public void setScrollAnimationMode(@NotNull r6 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
    }

    @Override // wx0.b
    public void setWithLabels(boolean z) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f300722a = v0.a.d("create(...)");
        this.f300723b = v0.a.d("create(...)");
        this.f300724c = v0.a.d("create(...)");
        this.d = new ifm.b();
        this.f300725g = ny0.f.f220593a;
        this.f300726h = ScatterSetKt.mutableScatterSetOf();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.i = linearLayout;
        Paint paint = new Paint();
        paint.setColor(kli.a.s(R$attr.uikit_colorGreyTone20, context));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f300728l = paint;
        Paint paint2 = new Paint();
        paint2.setColor(kli.a.s(R$attr.uikit_colorStatusDanger, context));
        paint2.setStyle(style);
        this.f300729m = paint2;
        this.f300730n = kli.a.l(context, 2.5f);
        this.o = kli.a.k(context, 1.0f);
        setBackgroundColor(kli.a.s(R$attr.uikit_colorGroupedBackground, context));
        setWillNotDraw(false);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        g();
        setClipToPadding(false);
        ViewCompat.setOnApplyWindowInsetsListener(this, new k(this, 25));
        c8g.a.a(this, ny0.a.f220589a, new wwa.a(context, this, 2));
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
