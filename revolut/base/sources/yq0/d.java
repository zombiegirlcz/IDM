package yq0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import aw0.d0;
import aw0.v4;
import aw0.w4;
import aw0.x4;
import aw0.y4;
import ix0.c1;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xq0.l;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f315959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4 f315960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f315961c;
    public final l d;
    public final List e;
    public final Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f315962g;

    public d(LinearLayoutManager lm6, x4 heightMode, int i, l spaceType, List itemHeightCalculators) {
        Intrinsics.checkNotNullParameter(lm6, "lm");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(spaceType, "spaceType");
        Intrinsics.checkNotNullParameter(itemHeightCalculators, "itemHeightCalculators");
        this.f315959a = lm6;
        this.f315960b = heightMode;
        this.f315961c = i;
        this.d = spaceType;
        this.e = itemHeightCalculators;
        this.f = new Rect();
        this.f315962g = -1;
    }

    public final int a(int i, int i2, int i3, int i5) {
        int i6 = c.f315958a[this.d.ordinal()];
        int i21 = this.f315961c;
        if (i6 == 1) {
            return (((i / i2) - i3) - i21) - i5;
        }
        if (i6 == 2 || i6 == 3) {
            return (((i - ((i2 - 1) * i21)) / i2) - i5) - i3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(View child, int i, int i2, int i3, int i5, int i6, b outSpecs, int i21, List items) {
        Object next;
        int height;
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(outSpecs, "outSpecs");
        Intrinsics.checkNotNullParameter(items, "items");
        LinearLayoutManager linearLayoutManager = this.f315959a;
        Rect rect = this.f;
        linearLayoutManager.calculateItemDecorationsForChild(child, rect);
        int i22 = i3 + rect.top + rect.bottom;
        int iA = a(((linearLayoutManager.getWidth() - linearLayoutManager.getPaddingStart()) - linearLayoutManager.getPaddingEnd()) - (i21 * 2), i, i2, i5);
        x4 x4Var = this.f315960b;
        if (x4Var instanceof y4) {
            d0 d0Var = ((y4) x4Var).f10628a;
            height = (((int) ((d0Var.f10275b / d0Var.f10274a) * iA)) - i22) - i6;
        } else if (x4Var instanceof v4) {
            if (this.f315962g <= 0) {
                Context context = child.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.f315962g = kli.a.k(context, ((v4) x4Var).f10571a);
            }
            height = this.f315962g;
        } else if (x4Var instanceof w4) {
            if (this.f315962g <= 0) {
                Function2 function2 = ((w4) x4Var).f10585a;
                Context context2 = child.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.f315962g = ((Number) function2.invoke(context2, Integer.valueOf(iA))).intValue();
            }
            height = this.f315962g;
        } else if (x4Var instanceof x4.c) {
            if (this.f315962g <= 0) {
                this.f315962g = -1;
            }
            height = this.f315962g;
        } else if (x4Var instanceof x4.a) {
            height = linearLayoutManager.getHeight();
        } else {
            if (!(x4Var instanceof x4.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it8 = this.e.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (((c1) next).l((j) zhm.d0.b0(items))) {
                        break;
                    }
                }
            }
            c1 c1Var = (c1) next;
            if (c1Var == null) {
                throw new IllegalStateException("Delegate able to calculate item's height is not provided");
            }
            Iterator it9 = items.iterator();
            if (!it9.hasNext()) {
                throw new NoSuchElementException();
            }
            j jVar = (j) it9.next();
            Context context3 = child.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iE = c1Var.e(context3, iA, jVar);
            while (it9.hasNext()) {
                j jVar2 = (j) it9.next();
                Context context4 = child.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int iE2 = c1Var.e(context4, iA, jVar2);
                if (iE < iE2) {
                    iE = iE2;
                }
            }
            height = iE;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iA, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        outSpecs.f315956a = iMakeMeasureSpec;
        outSpecs.f315957b = iMakeMeasureSpec2;
    }
}
