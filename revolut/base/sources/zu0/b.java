package zu0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.transition.RevTransitionUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionLayout f325188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yu0.c f325189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f325190c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f325191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f325192h;
    public final f i;

    public b(SwipeToActionLayout layout, yu0.c itemController) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(itemController, "itemController");
        this.f325188a = layout;
        this.f325189b = itemController;
        Context context = layout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f325190c = kli.a.k(context, 46.0f);
        Context context2 = layout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.d = kli.a.k(context2, 4.0f);
        Context context3 = layout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.e = kli.a.k(context3, 4.0f);
        Context context4 = layout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f = kli.a.k(context4, 73.6f);
        this.i = f.f325198a;
    }

    public static void l(int i, int i2, ArrayList arrayList, vu0.n nVar) {
        int i3;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            vu0.o oVar = (vu0.o) arrayList.get(i5);
            int measuredWidth = oVar.getView().getMeasuredWidth();
            int i6 = a.f325187a[nVar.ordinal()];
            if (i6 == 1) {
                i3 = 0;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = i - measuredWidth;
            }
            oVar.getView().layout(i3, 0, measuredWidth + i3, i2);
        }
    }

    public static void m(ArrayList arrayList, int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((vu0.o) arrayList.get(i3)).getView().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
    }

    @Override // zu0.i
    public final void a(Rect closedBounds, View mainView) {
        Intrinsics.checkNotNullParameter(closedBounds, "closedBounds");
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        if (this.f325192h == 0) {
            return;
        }
        vu0.n nVar = vu0.n.END;
        int i = closedBounds.right;
        int i2 = this.d;
        int i3 = i - i2;
        int right = i - mainView.getRight();
        yu0.c cVar = this.f325189b;
        n(i3, right, cVar.f316857g, nVar);
        n(closedBounds.left + i2, mainView.getLeft() - closedBounds.left, cVar.e, vu0.n.START);
    }

    @Override // zu0.i
    public final void b(int i, int i2) {
        SwipeToActionLayout swipeToActionLayout = this.f325188a;
        vu0.s dragDirection = swipeToActionLayout.getDragDirection();
        vu0.s sVar = vu0.s.BOTH;
        yu0.c cVar = this.f325189b;
        if (dragDirection == sVar || swipeToActionLayout.getDragDirection() == vu0.s.FROM_START_TO_END) {
            m(cVar.e, i, i2);
        }
        if (swipeToActionLayout.getDragDirection() == sVar || swipeToActionLayout.getDragDirection() == vu0.s.FROM_END_TO_START) {
            m(cVar.f316857g, i, i2);
        }
    }

    @Override // zu0.i
    public final void c(int i, int i2) {
        yu0.c cVar = this.f325189b;
        ArrayList arrayList = cVar.e;
        l(i, i2, arrayList, vu0.n.START);
        ArrayList arrayList2 = cVar.f316857g;
        l(i, i2, arrayList2, vu0.n.END);
        this.f325192h = Math.max(k(arrayList), k(arrayList2));
    }

    @Override // zu0.i
    public final float d(int i) {
        return 1.0f;
    }

    @Override // zu0.i
    public final void e(vu0.u newValue, vu0.u oldValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        vu0.u uVar = vu0.u.CLOSING;
        if (newValue == uVar) {
            this.f325191g = Math.abs(this.f325188a.getMainView().getLeft());
        } else if (oldValue == uVar) {
            this.f325191g = 0;
        }
    }

    @Override // zu0.i
    public final void f(boolean z, boolean z3) {
        if (!z3 || z) {
            return;
        }
        this.f325188a.performHapticFeedback(0);
    }

    @Override // zu0.i
    public final int g() {
        return this.f325192h;
    }

    @Override // zu0.i
    public final int h(int i) {
        int i2 = this.f325192h + this.f;
        return i2 > i ? i : i2;
    }

    @Override // zu0.i
    public final h i() {
        return this.i;
    }

    @Override // zu0.i
    public final void j() {
    }

    public final int k(ArrayList arrayList) {
        int i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = 0;
                break;
            }
            if (((vu0.o) arrayList.get(i2)).l()) {
                i = this.e;
                break;
            }
            i2++;
        }
        int size2 = arrayList.size() - 1;
        if (size2 < 0) {
            size2 = 0;
        }
        int measuredWidth = (i * size2) + this.d;
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            measuredWidth += ((vu0.o) arrayList.get(i3)).getView().getMeasuredWidth();
        }
        return measuredWidth;
    }

    public final void n(int i, int i2, ArrayList arrayList, vu0.n nVar) {
        int iJ;
        int i3;
        int iJ2;
        int i5;
        int i6;
        int i21;
        int i22;
        float f;
        float f4;
        b bVar = this;
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return;
        }
        int i32 = i2 < 0 ? 0 : i2;
        int[] iArr = a.f325187a;
        int i33 = iArr[nVar.ordinal()];
        int i43 = 1;
        if (i33 == 1) {
            iJ = 0;
        } else {
            if (i33 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iJ = zhm.v.j(arrayList2);
        }
        SwipeToActionLayout swipeToActionLayout = bVar.f325188a;
        boolean z = i32 >= bVar.h(swipeToActionLayout.getWidth());
        boolean z3 = bVar.f325191g > 0 && swipeToActionLayout.getState() == vu0.u.CLOSING;
        boolean z4 = bVar.f325191g >= bVar.h(swipeToActionLayout.getWidth());
        int size = arrayList2.size();
        int i59 = 0;
        while (true) {
            if (i59 >= size) {
                i3 = 0;
                break;
            } else {
                if (((vu0.o) arrayList2.get(i59)).l()) {
                    i3 = bVar.e;
                    break;
                }
                i59++;
            }
        }
        int i66 = bVar.f325192h;
        int i74 = i32 - i66;
        if (i74 < 0) {
            i74 = 0;
        }
        int i92 = bVar.f325191g;
        int i96 = i92 - i66;
        if (i96 < 0) {
            i96 = 0;
        }
        float f5 = z3 ? kotlin.ranges.f.f(i32 / i92, BitmapDescriptorFactory.HUE_RED, 1.0f) : 1.0f;
        int i99 = iArr[nVar.ordinal()];
        if (i99 == 1) {
            iJ2 = 0;
        } else {
            if (i99 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iJ2 = zhm.v.j(arrayList2);
        }
        int iC = 0;
        int i100 = 0;
        while (iJ2 >= 0 && iJ2 < arrayList2.size()) {
            vu0.o oVar = (vu0.o) arrayList2.get(iJ2);
            int measuredWidth = oVar.getView().getMeasuredWidth();
            int i101 = measuredWidth + (iJ2 == iJ ? i74 : 0);
            int[] iArr2 = a.f325187a;
            int i102 = iArr2[nVar.ordinal()];
            int i103 = -1;
            if (i102 != i43) {
                i5 = 2;
                if (i102 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i6 = -1;
            } else {
                i5 = 2;
                i6 = 1;
            }
            int i104 = (i6 * i100) + i;
            int i105 = iArr2[nVar.ordinal()];
            int i106 = i32;
            if (i105 == 1) {
                i21 = i104 + i101;
                i22 = i104;
            } else {
                if (i105 != i5) {
                    throw new NoWhenBranchMatchedException();
                }
                i22 = i104 - i101;
                i21 = i104;
            }
            int i107 = bVar.f325190c;
            if (z3) {
                f = f5;
                f4 = kotlin.ranges.f.f((bVar.f325191g - iC) / i107, BitmapDescriptorFactory.HUE_RED, 1.0f) * f;
            } else {
                f = f5;
                f4 = kotlin.ranges.f.f((i106 - i100) / i107, BitmapDescriptorFactory.HUE_RED, 1.0f);
            }
            boolean z6 = (z3 ? z4 : z) && iJ2 != iJ;
            RevTransitionUtils.setLeftTopRightBottom(oVar.getView(), i22, oVar.getView().getTop(), i21, oVar.getView().getBottom());
            oVar.O(nVar, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, z6);
            i100 = i101 + i3 + i100;
            iC = a10.b.C(measuredWidth, iJ2 == iJ ? i96 : 0, i3, iC);
            int i108 = iArr2[nVar.ordinal()];
            if (i108 == 1) {
                i103 = 1;
            } else if (i108 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iJ2 = i103 + iJ2;
            bVar = this;
            arrayList2 = arrayList;
            i43 = 1;
            i32 = i106;
            f5 = f;
        }
    }
}
