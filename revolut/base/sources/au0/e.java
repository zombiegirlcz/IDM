package au0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools$SimplePool;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import java.util.ArrayList;
import java.util.List;
import jo0.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends ViewGroup {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9172g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp0.p f9173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo0.h f9174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9175c;
    public final Pools$SimplePool d;
    public f e;
    public ifm.c f;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        fp0.p.Companion.getClass();
        this.f9173a = fp0.m.a(this, gp0.b.f145198a);
        jo0.h.Companion.getClass();
        this.f9174b = h.a.a();
        this.f9175c = new ArrayList();
        this.d = new Pools$SimplePool(8);
        setPadding(0, kli.a.k(context, 4.0f), 0, 0);
    }

    public final void a(boolean z) {
        ArrayList arrayList = this.f9175c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g gVar = (g) arrayList.get(i);
            gVar.f9206b.f9214a.getPaint().setUnderlineText(z && gVar.f9205a.f57868b != null);
            gVar.f9206b.f9214a.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = this.f9174b.f176841b.subscribe(new atg.n(8, new a08.e(1, this, e.class, "updateClickablePartsUnderline", "updateClickablePartsUnderline(Z)V", 0, 26)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ifm.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        ArrayList arrayList = this.f9175c;
        int size = arrayList.size();
        int i6 = 0;
        int measuredWidth = 0;
        for (int i21 = 0; i21 < size; i21++) {
            measuredWidth += ((g) arrayList.get(i21)).f9206b.f9214a.getMeasuredWidth();
        }
        if (getLayoutDirection() != 1) {
            int iA = a10.b.a(width, measuredWidth, 2, getPaddingStart());
            int size2 = arrayList.size();
            while (i6 < size2) {
                UIKitTextView uIKitTextView = ((g) arrayList.get(i6)).f9206b.f9214a;
                if (uIKitTextView.getMeasuredWidth() != 0) {
                    int measuredHeight = ((height - uIKitTextView.getMeasuredHeight()) / 2) + getPaddingTop();
                    Rect rect = rr0.c.f256608a;
                    rr0.c.d(uIKitTextView, iA, measuredHeight);
                    iA = uIKitTextView.getMeasuredWidth() + iA;
                }
                i6++;
            }
            return;
        }
        int paddingEnd = ((width + measuredWidth) / 2) + getPaddingEnd();
        int size3 = arrayList.size();
        while (i6 < size3) {
            UIKitTextView uIKitTextView2 = ((g) arrayList.get(i6)).f9206b.f9214a;
            if (uIKitTextView2.getMeasuredWidth() != 0) {
                paddingEnd -= uIKitTextView2.getMeasuredWidth();
                int measuredHeight2 = ((height - uIKitTextView2.getMeasuredHeight()) / 2) + getPaddingTop();
                Rect rect2 = rr0.c.f256608a;
                rr0.c.d(uIKitTextView2, paddingEnd, measuredHeight2);
            }
            i6++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd();
        if (size < 0) {
            size = 0;
        }
        ArrayList arrayList = this.f9175c;
        int size2 = arrayList.size();
        int iMax = 0;
        int measuredWidth = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            g gVar = (g) arrayList.get(i3);
            int i5 = size - measuredWidth;
            if (i5 < 0) {
                i5 = 0;
            }
            UIKitTextView uIKitTextView = gVar.f9206b.f9214a;
            if (i5 == 0) {
                uIKitTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            } else {
                uIKitTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredWidth += uIKitTextView.getMeasuredWidth();
                iMax = Math.max(iMax, uIKitTextView.getMeasuredHeight());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingEnd() + getPaddingStart() + size, i, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + iMax, i2, 0));
    }

    public final void setModel(@NotNull f model) {
        Pools$SimplePool pools$SimplePool;
        Intrinsics.checkNotNullParameter(model, "model");
        f fVar = this.e;
        this.e = model;
        List list = fVar != null ? fVar.f9191a : null;
        List list2 = model.f9191a;
        boolean z = model.e;
        float f = model.d;
        int i = model.f9193c;
        int i2 = model.f9192b;
        boolean zF = Intrinsics.f(list, list2);
        boolean z3 = fVar != null && fVar.f9192b == i2;
        boolean z4 = fVar != null && fVar.f9193c == i;
        boolean zD = Intrinsics.d(fVar != null ? Float.valueOf(fVar.d) : null, f);
        boolean z6 = fVar != null && fVar.e == z;
        boolean z11 = (fVar != null ? fVar.f : null) != model.f;
        if (!zD) {
            setAlpha(f);
        }
        if (!z6 || z11) {
            fp0.p pVar = this.f9173a;
            fp0.p.b(pVar, z);
            View view = pVar.f137029a;
            or0.m.a(view);
            if (z) {
                view.setOnClickListener(new i(this, 1));
            } else {
                or0.u.o(view);
            }
        }
        ArrayList arrayList = this.f9175c;
        if (zF) {
            if (!z3) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jb3.l.e(((g) arrayList.get(i3)).f9206b.f9214a, i2);
                }
            }
            if (z4) {
                return;
            }
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((g) arrayList.get(i5)).f9206b.f9214a.setTextColor(ColorStateList.valueOf(i));
            }
            return;
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (true) {
            pools$SimplePool = this.d;
            if (i6 >= size3) {
                break;
            }
            h hVar = ((g) arrayList.get(i6)).f9206b;
            View view2 = hVar.f9214a;
            fp0.p pVar2 = hVar.f9215b;
            fp0.p.b(pVar2, false);
            View view3 = pVar2.f137029a;
            or0.m.a(view3);
            or0.u.o(view3);
            view2.setOnLongClickListener(null);
            removeView(view2);
            pools$SimplePool.release(hVar);
            i6++;
        }
        arrayList.clear();
        f fVar2 = this.e;
        if (fVar2 == null) {
            return;
        }
        List list3 = fVar2.f9191a;
        int size4 = list3.size();
        for (int i21 = 0; i21 < size4; i21++) {
            NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart subtitlePart = (NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart) list3.get(i21);
            f fVar3 = this.e;
            if (fVar3 == null) {
                throw new IllegalStateException("Model must be set before creating parts");
            }
            boolean z12 = subtitlePart.f57868b != null;
            h hVar2 = (h) pools$SimplePool.acquire();
            if (hVar2 == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
                uIKitTextView.setGravity(8388627);
                uIKitTextView.setTextAlignment(5);
                uIKitTextView.setIncludeFontPadding(false);
                uIKitTextView.setMaxLines(1);
                uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
                fp0.p.Companion.getClass();
                hVar2 = new h(uIKitTextView, fp0.m.a(uIKitTextView, gp0.b.f145198a));
            }
            UIKitTextView uIKitTextView2 = hVar2.f9214a;
            jb3.l.e(uIKitTextView2, fVar3.f9192b);
            uIKitTextView2.setTextColor(ColorStateList.valueOf(fVar3.f9193c));
            kli.a.b(uIKitTextView2, subtitlePart.f57867a, ty0.f.f275450a);
            addView(uIKitTextView2);
            if (z12) {
                uIKitTextView2.setOnLongClickListener(new j(this, subtitlePart, 0));
            } else {
                or0.u.p(uIKitTextView2);
            }
            fp0.p pVar3 = hVar2.f9215b;
            fp0.p.b(pVar3, z12);
            View view4 = pVar3.f137029a;
            or0.m.a(view4);
            if (z12) {
                view4.setOnClickListener(new i(this, 0));
            } else {
                or0.u.o(view4);
            }
            arrayList.add(new g(subtitlePart, hVar2));
        }
        a(this.f9174b.d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
