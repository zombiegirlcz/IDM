package zu0;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.transition.RevTransitionUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vu0.a0;
import vu0.w;
import vu0.y;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements i {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionLayout f325201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yu0.c f325202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f325203c;
    public final a0 d;
    public y e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f325204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f325205h;

    public m(SwipeToActionLayout layout, yu0.c itemController) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(itemController, "itemController");
        this.f325201a = layout;
        this.f325202b = itemController;
        Context context = layout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f325203c = kli.a.k(context, 4.0f);
        Context context2 = layout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.d = new a0(context2);
        a0.Companion.getClass();
        this.e = a0.f292132c;
        this.f325205h = g.f325199a;
    }

    @Override // zu0.i
    public final void a(Rect closedBounds, View mainView) {
        Intrinsics.checkNotNullParameter(closedBounds, "closedBounds");
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        if (this.f325204g == 0) {
            return;
        }
        int iH = h(this.f325201a.getWidth());
        int i = iH - this.f325204g;
        int i2 = i < 0 ? 0 : i;
        int right = closedBounds.right - mainView.getRight();
        int left = mainView.getLeft() - closedBounds.left;
        yu0.c cVar = this.f325202b;
        boolean z = !cVar.f316857g.isEmpty() && i2 > 0 && right > this.f325204g;
        boolean z3 = !cVar.e.isEmpty() && i2 > 0 && left > this.f325204g;
        m(k.END, closedBounds, right, z, i2, iH);
        m(k.START, closedBounds, left, z3, i2, iH);
    }

    @Override // zu0.i
    public final void b(int i, int i2) {
        SwipeToActionLayout swipeToActionLayout = this.f325201a;
        vu0.s dragDirection = swipeToActionLayout.getDragDirection();
        vu0.s sVar = vu0.s.BOTH;
        yu0.c cVar = this.f325202b;
        if (dragDirection == sVar || swipeToActionLayout.getDragDirection() == vu0.s.FROM_START_TO_END) {
            l(cVar.d, cVar.e, i, i2);
        }
        if (swipeToActionLayout.getDragDirection() == sVar || swipeToActionLayout.getDragDirection() == vu0.s.FROM_END_TO_START) {
            l(cVar.f, cVar.f316857g, i, i2);
        }
    }

    @Override // zu0.i
    public final void c(int i, int i2) {
        yu0.c cVar = this.f325202b;
        ArrayList arrayList = cVar.d;
        SwipeToActionLayout swipeToActionLayout = this.f325201a;
        vu0.s dragDirection = swipeToActionLayout.getDragDirection();
        vu0.s sVar = vu0.s.BOTH;
        if (dragDirection == sVar || swipeToActionLayout.getDragDirection() == vu0.s.FROM_START_TO_END) {
            k(i, i2, cVar.e, k.START);
        }
        if (swipeToActionLayout.getDragDirection() == sVar || swipeToActionLayout.getDragDirection() == vu0.s.FROM_END_TO_START) {
            k(i, i2, cVar.f316857g, k.END);
        }
        int i3 = this.e.f292187a;
        this.f = i3;
        this.f325204g = (arrayList.size() * this.f325203c) + (arrayList.size() * i3);
    }

    @Override // zu0.i
    public final float d(int i) {
        int i2 = this.f325204g;
        int i3 = this.f;
        float f = i2 - i3;
        int i5 = i - i3;
        if (i5 < 1) {
            i5 = 1;
        }
        return kotlin.ranges.f.f((f / i5) + 1.0f, 1.0f, 2.0f);
    }

    @Override // zu0.i
    public final void e(vu0.u newValue, vu0.u oldValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        if (oldValue == vu0.u.CLOSE && newValue == vu0.u.OPENING) {
            yu0.c cVar = this.f325202b;
            ArrayList arrayList = cVar.e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                View view = ((vu0.o) arrayList.get(i)).getView();
                i++;
                view.offsetLeftAndRight((-view.getWidth()) * i);
            }
            ArrayList arrayList2 = cVar.f316857g;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                View view2 = ((vu0.o) arrayList2.get(i2)).getView();
                view2.offsetLeftAndRight((arrayList2.size() - i2) * view2.getWidth());
            }
        }
    }

    @Override // zu0.i
    public final void f(boolean z, boolean z3) {
    }

    @Override // zu0.i
    public final int g() {
        return this.f325204g;
    }

    @Override // zu0.i
    public final int h(int i) {
        return Math.min(Math.max((int) (i * 0.7f), (this.f325203c * 4) + this.f325204g), i);
    }

    @Override // zu0.i
    public final h i() {
        return this.f325205h;
    }

    @Override // zu0.i
    public final void j() {
        this.f325201a.performHapticFeedback(0);
    }

    public final void k(int i, int i2, ArrayList arrayList, k kVar) {
        int i3;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            vu0.o oVar = (vu0.o) arrayList.get(i5);
            int i6 = l.f325200a[kVar.ordinal()];
            if (i6 == 1) {
                i3 = 0;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = i - this.e.f292187a;
            }
            View view = oVar.getView();
            int i21 = this.e.f292187a + i3;
            int i22 = this.f325203c;
            view.layout(i3, i22, i21, i2 - i22);
        }
    }

    public final void l(ArrayList actions, ArrayList arrayList, int i, int i2) {
        if (actions.isEmpty()) {
            return;
        }
        int iMax = Math.max(0, i2 - (this.f325203c * 2));
        Context context = this.f325201a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iMax2 = Math.max(kli.a.k(context, 76.0f), iMax);
        int i3 = (int) (i * 0.9f);
        a0 a0Var = this.d;
        Context context2 = a0Var.f292133a;
        Intrinsics.checkNotNullParameter(actions, "actions");
        int size = actions.size();
        int i5 = 1;
        int i6 = 0;
        int i21 = 0;
        boolean z = true;
        while (i6 < size) {
            SpannableStringBuilder spannableStringBuilderA = ty0.c.a(jh.d.f(context2).b0(), ((SwipeToActionDelegate.SwipeAction) actions.get(i6)).f53507c, a0Var.f292133a, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            AppCompatTextView appCompatTextView = a0Var.f292134b;
            if (appCompatTextView == null) {
                appCompatTextView = new AppCompatTextView(context2);
                w.Companion.getClass();
                jb3.l.e(appCompatTextView, w.f292178q);
                appCompatTextView.setMaxLines(i5);
                appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                a0Var.f292134b = appCompatTextView;
            }
            appCompatTextView.setText(spannableStringBuilderA);
            appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iK = (kli.a.k(context2, 8.0f) * 2) + appCompatTextView.getMeasuredWidth();
            if (iK > iMax2) {
                z = false;
            }
            if (iK > i21) {
                i21 = iK;
            }
            i6++;
            i5 = 1;
        }
        y yVar = z ? new y(iMax2, iMax) : actions.size() * i21 <= i3 ? new y(i21, iMax) : new y(Math.min((int) (((double) i21) / 1.5d), i3 / actions.size()), iMax);
        this.e = yVar;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(yVar.f292187a, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.e.f292188b, 1073741824);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((vu0.o) it8.next()).getView().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
    }

    public final void m(k kVar, Rect rect, int i, boolean z, int i2, int i3) {
        ArrayList arrayList;
        int i5;
        int iJ;
        int i6;
        int i21;
        int i22;
        int iA;
        int i32;
        float f;
        vu0.n nVar;
        int i33;
        double d;
        int i43;
        int i59;
        vu0.n nVar2;
        int[] iArr = l.f325200a;
        int i66 = iArr[kVar.ordinal()];
        yu0.c cVar = this.f325202b;
        if (i66 == 1) {
            arrayList = cVar.e;
        } else {
            if (i66 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = cVar.f316857g;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int i74 = iArr[kVar.ordinal()];
        if (i74 == 1) {
            i5 = rect.left;
        } else {
            if (i74 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = rect.right;
        }
        int i92 = iArr[kVar.ordinal()];
        if (i92 == 1) {
            iJ = 0;
        } else {
            if (i92 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iJ = zhm.v.j(arrayList);
        }
        int i96 = this.f;
        int i99 = this.f325203c;
        int i100 = i96 + i99;
        double dE = kotlin.ranges.f.e(((double) i) / ((double) this.f325204g), 0.0d, 1.0d);
        double dE2 = z ? kotlin.ranges.f.e(((double) (i - this.f325204g)) / ((double) i2), 0.0d, 1.0d) : 0.0d;
        if (z) {
            double d5 = ((double) i99) * dE2;
            i6 = 1;
            i21 = i100;
            i22 = (int) (d5 * ((double) 4));
        } else {
            i6 = 1;
            i21 = i100;
            i22 = 0;
        }
        int size = arrayList.size();
        int i101 = 0;
        while (i101 < size) {
            if (i101 != iJ) {
                vu0.o oVar = (vu0.o) arrayList.get(i101);
                View view = oVar.getView();
                d = dE;
                i33 = i22;
                i43 = i21;
                i59 = i5;
                view.offsetLeftAndRight(((kVar.a() * (((int) Math.ceil((d * ((double) (Math.abs(i101 - iJ) + i6))) * ((double) i43))) + i33)) + i59) - (kVar == k.START ? view.getRight() : view.getLeft()));
                int i102 = l.f325200a[kVar.ordinal()];
                if (i102 == 1) {
                    nVar2 = vu0.n.START;
                } else {
                    if (i102 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar2 = vu0.n.END;
                }
                oVar.O(nVar2, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false);
            } else {
                i33 = i22;
                d = dE;
                i43 = i21;
                i59 = i5;
            }
            i101++;
            i22 = i33;
            i5 = i59;
            dE = d;
            i6 = 1;
            i21 = i43;
        }
        double d6 = dE;
        int i103 = i21;
        int i104 = i5;
        vu0.o oVar2 = (vu0.o) arrayList.get(iJ);
        View view2 = oVar2.getView();
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            int iA2 = (kVar.a() * i103) + i104;
            iA = (int) ((((double) (((kVar.a() * i3) + i104) - iA2)) * dE2) + ((double) iA2));
            int i105 = this.f;
            i32 = (int) ((((double) (i3 - i105)) * dE2) + ((double) i105));
            f = (float) dE2;
        } else {
            iA = (kVar.a() * ((int) Math.ceil(d6 * ((double) i103)))) + i104;
            i32 = this.f;
            f = 0.0f;
        }
        k kVar2 = k.START;
        int i106 = kVar == kVar2 ? iA - i32 : iA;
        if (kVar != kVar2) {
            iA += i32;
        }
        if (kVar == kVar2) {
            f4 = i32 - this.f;
        }
        RevTransitionUtils.setLeftTopRightBottom(view2, i106, view2.getTop(), iA, view2.getBottom());
        int i107 = l.f325200a[kVar.ordinal()];
        if (i107 == 1) {
            nVar = vu0.n.START;
        } else {
            if (i107 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            nVar = vu0.n.END;
        }
        oVar2.O(nVar, 1.0f, f, f4, false);
    }
}
