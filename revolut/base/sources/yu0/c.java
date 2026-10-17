package yu0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import fp0.p;
import ip0.xh0;
import java.util.ArrayList;
import java.util.List;
import jh.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import vu0.i;
import vu0.j;
import vu0.m;
import vu0.n;
import vu0.o;
import vu0.s;
import vu0.u;
import vu0.w;
import zhm.v;
import zu0.e;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionLayout f316854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh9.b f316855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f316856c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f316857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f316858h;
    public s i;

    public c(SwipeToActionLayout layout, vh9.b onActionClickListener, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(onActionClickListener, "onActionClickListener");
        this.f316854a = layout;
        this.f316855b = onActionClickListener;
        this.f316856c = z;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.f316857g = new ArrayList();
    }

    public final ArrayList a(ArrayList arrayList, n nVar) {
        SwipeToActionDelegate.SwipeAction swipeAction;
        kotlin.ranges.c cVarM;
        o wVar;
        int iK;
        SwipeToActionDelegate.SwipeAction swipeAction2;
        int iS;
        int i;
        c cVar = this;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        int i2 = b.f316852b[nVar.ordinal()];
        Object obj2 = null;
        int i3 = 2;
        int i5 = 1;
        if (i2 == 1) {
            int size = arrayList2.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                }
                Object obj3 = arrayList2.get(i6);
                if (((SwipeToActionDelegate.SwipeAction) obj3).d == xh0.PRIMARY) {
                    obj2 = obj3;
                    break;
                }
                i6++;
            }
            swipeAction = (SwipeToActionDelegate.SwipeAction) obj2;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int iJ = v.j(arrayList2);
            while (true) {
                if (-1 >= iJ) {
                    break;
                }
                Object obj4 = arrayList2.get(iJ);
                if (((SwipeToActionDelegate.SwipeAction) obj4).d == xh0.PRIMARY) {
                    obj2 = obj4;
                    break;
                }
                iJ--;
            }
            swipeAction = (SwipeToActionDelegate.SwipeAction) obj2;
        }
        int i21 = b.f316852b[nVar.ordinal()];
        if (i21 == 1) {
            cVarM = f.m(v.i(arrayList2));
        } else {
            if (i21 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cVarM = v.i(arrayList2);
        }
        int i22 = cVarM.f186448a;
        int i32 = cVarM.f186449b;
        int i33 = cVarM.f186450c;
        if ((i33 > 0 && i22 <= i32) || (i33 < 0 && i32 <= i22)) {
            while (true) {
                SwipeToActionDelegate.SwipeAction swipeAction3 = (SwipeToActionDelegate.SwipeAction) arrayList2.get(i22);
                boolean zF = Intrinsics.f(swipeAction3, swipeAction);
                SwipeToActionLayout swipeToActionLayout = cVar.f316854a;
                i appearance = swipeToActionLayout.getAppearance();
                int[] iArr = b.f316853c;
                int i43 = iArr[appearance.ordinal()];
                if (i43 == i5) {
                    Context context = swipeToActionLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    wVar = new w(context);
                } else {
                    if (i43 != i3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context2 = swipeToActionLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    wVar = new j(context2);
                }
                View view = wVar.getView();
                view.setTag(R$id.internal_swipe_action_tag, swipeAction3);
                String str = swipeAction3.e;
                xh0 xh0Var = swipeAction3.d;
                view.setTag(str);
                cVar.d(wVar, swipeAction3);
                int i59 = iArr[swipeToActionLayout.getAppearance().ordinal()];
                if (i59 == 1) {
                    Context context3 = swipeToActionLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    iK = kli.a.k(context3, 4.0f);
                } else {
                    if (i59 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iK = 0;
                }
                int i66 = i33;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -1);
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(iK);
                layoutParams.topMargin = iK;
                layoutParams.bottomMargin = iK;
                view.setLayoutParams(layoutParams);
                if (b.d[xh0Var.ordinal()] == 1) {
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = arrayList2.size();
                    int i74 = 0;
                    while (i74 < size2) {
                        Object obj5 = arrayList2.get(i74);
                        SwipeToActionDelegate.SwipeAction swipeAction4 = swipeAction;
                        if (((SwipeToActionDelegate.SwipeAction) obj5).d == xh0.PRIMARY) {
                            arrayList4.add(obj5);
                        }
                        i74++;
                        arrayList2 = arrayList;
                        swipeAction = swipeAction4;
                    }
                    swipeAction2 = swipeAction;
                    int size3 = arrayList4.size();
                    int iIndexOf = arrayList4.indexOf(swipeAction3);
                    Context context4 = swipeToActionLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    if (d.k(context4)) {
                        iIndexOf = (size3 - 1) - iIndexOf;
                    }
                    int i92 = (size3 - 1) - iIndexOf;
                    if (i92 == 0) {
                        Context context5 = swipeToActionLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        iS = kli.a.s(R$attr.uikit_colorAccentNeutral, context5);
                    } else if (i92 == 1) {
                        Context context6 = swipeToActionLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                        iS = io0.a.b(0.8f, kli.a.s(R$attr.uikit_colorAccentNeutral, context6));
                    } else if (i92 != 2) {
                        Context context7 = swipeToActionLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                        iS = io0.a.b(0.6f, kli.a.s(R$attr.uikit_colorAccentNeutral, context7));
                    } else {
                        Context context8 = swipeToActionLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                        iS = io0.a.b(0.6f, kli.a.s(R$attr.uikit_colorAccentNeutral, context8));
                    }
                } else {
                    swipeAction2 = swipeAction;
                    Context context9 = swipeToActionLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                    iS = kli.a.s(xh0Var.a(), context9);
                }
                Context context10 = swipeToActionLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                wVar.setModel(new m(swipeAction3, iS, kli.a.s(xh0Var.b(), context10), zF));
                swipeToActionLayout.addView(wVar.getView(), wVar.getView().getLayoutParams());
                int i96 = b.f316852b[nVar.ordinal()];
                if (i96 != 1) {
                    i = 2;
                    if (i96 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList3.add(wVar);
                } else {
                    i = 2;
                    arrayList3.add(0, wVar);
                }
                if (i22 == i32) {
                    break;
                }
                i22 += i66;
                cVar = this;
                i3 = i;
                i5 = 1;
                i33 = i66;
                swipeAction = swipeAction2;
                arrayList2 = arrayList;
            }
        }
        return arrayList3;
    }

    public final void b() {
        s sVar;
        List list = this.f316858h;
        s sVar2 = this.i;
        if (list == null || sVar2 == null) {
            return;
        }
        this.f316858h = null;
        this.i = null;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int size2 = list.size();
        ArrayList arrayList2 = this.f316857g;
        ArrayList arrayList3 = this.e;
        if (size == size2) {
            int size3 = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size3) {
                    if (arrayList.size() == list.size()) {
                        int size4 = arrayList.size();
                        for (int i2 = 0; i2 < size4; i2++) {
                            if (Intrinsics.f(((SwipeToActionDelegate.SwipeAction) arrayList.get(i2)).f, ((SwipeToActionDelegate.SwipeAction) list.get(i2)).f)) {
                            }
                        }
                    }
                    c(list);
                    int size5 = list.size();
                    for (int i3 = 0; i3 < size5; i3++) {
                        SwipeToActionDelegate.SwipeAction swipeAction = (SwipeToActionDelegate.SwipeAction) list.get(i3);
                        int size6 = arrayList3.size();
                        for (int i5 = 0; i5 < size6; i5++) {
                            o oVar = (o) arrayList3.get(i5);
                            Object tag2 = oVar.getView().getTag(R$id.internal_swipe_action_tag);
                            SwipeToActionDelegate.SwipeAction swipeAction2 = tag2 instanceof SwipeToActionDelegate.SwipeAction ? (SwipeToActionDelegate.SwipeAction) tag2 : null;
                            if (Intrinsics.f(swipeAction2 != null ? swipeAction2.f53505a : null, swipeAction.f53505a)) {
                                oVar.getView().setTag(R$id.internal_swipe_action_tag, swipeAction);
                                d(oVar, swipeAction);
                            }
                        }
                        int size7 = arrayList2.size();
                        for (int i6 = 0; i6 < size7; i6++) {
                            o oVar2 = (o) arrayList2.get(i6);
                            Object tag3 = oVar2.getView().getTag(R$id.internal_swipe_action_tag);
                            SwipeToActionDelegate.SwipeAction swipeAction3 = tag3 instanceof SwipeToActionDelegate.SwipeAction ? (SwipeToActionDelegate.SwipeAction) tag3 : null;
                            if (Intrinsics.f(swipeAction3 != null ? swipeAction3.f53505a : null, swipeAction.f53505a)) {
                                oVar2.getView().setTag(R$id.internal_swipe_action_tag, swipeAction);
                                d(oVar2, swipeAction);
                            }
                        }
                    }
                    return;
                }
                SwipeToActionDelegate.SwipeAction swipeAction4 = (SwipeToActionDelegate.SwipeAction) arrayList.get(i);
                SwipeToActionDelegate.SwipeAction swipeAction5 = (SwipeToActionDelegate.SwipeAction) list.get(i);
                if (!Intrinsics.f(swipeAction4.f53505a, swipeAction5.f53505a) || !Intrinsics.f(swipeAction4.f53506b, swipeAction5.f53506b) || !Intrinsics.f(swipeAction4.f53507c, swipeAction5.f53507c) || swipeAction4.d != swipeAction5.d || !Intrinsics.f(swipeAction4.e, swipeAction5.e)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        SwipeToActionLayout swipeToActionLayout = this.f316854a;
        ifm.c cVar = swipeToActionLayout.f57616g;
        if (cVar != null) {
            cVar.dispose();
        }
        swipeToActionLayout.f57616g = null;
        int size8 = arrayList3.size();
        for (int i21 = 0; i21 < size8; i21++) {
            swipeToActionLayout.removeView(((o) arrayList3.get(i21)).getView());
        }
        int size9 = arrayList2.size();
        for (int i22 = 0; i22 < size9; i22++) {
            swipeToActionLayout.removeView(((o) arrayList2.get(i22)).getView());
        }
        ArrayList arrayList4 = this.d;
        arrayList4.clear();
        arrayList.clear();
        arrayList3.clear();
        arrayList2.clear();
        swipeToActionLayout.getTouchController().d();
        if (swipeToActionLayout.getMainView().getLeft() > 0 || swipeToActionLayout.getMainView().getRight() < swipeToActionLayout.getLayoutController().f325197c.width()) {
            e layoutController = swipeToActionLayout.getLayoutController();
            Rect rect = layoutController.f325197c;
            int i32 = rect.left;
            layoutController.f325195a.getMainView().layout(i32, rect.top, rect.width() + i32, rect.bottom);
            layoutController.e();
            swipeToActionLayout.setState$ui_kit_components_release(u.CLOSE);
            swipeToActionLayout.getLayoutController().d = 0;
            swipeToActionLayout.getTouchController().f308871p.f();
        }
        if (!list.isEmpty()) {
            int i33 = b.f316851a[sVar2.ordinal()];
            boolean z = this.f316856c;
            if (i33 == 1) {
                sVar = z ? s.FROM_START_TO_END : s.FROM_END_TO_START;
            } else if (i33 == 2) {
                sVar = z ? s.FROM_END_TO_START : s.FROM_START_TO_END;
            } else {
                if (i33 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar = s.BOTH;
            }
            swipeToActionLayout.setDragDirection$ui_kit_components_release(sVar);
            c(list);
            s sVar3 = s.BOTH;
            if (sVar == sVar3 || sVar == s.FROM_START_TO_END) {
                arrayList3.addAll(a(arrayList4, n.START));
            }
            if (sVar == sVar3 || sVar == s.FROM_END_TO_START) {
                arrayList2.addAll(a(arrayList, n.END));
            }
            swipeToActionLayout.bringChildToFront(swipeToActionLayout.getMainView());
        }
        swipeToActionLayout.requestLayout();
    }

    public final void c(List list) {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            arrayList.add(list.get(size));
            arrayList2.add(list.get((list.size() - size) - 1));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void d(o oVar, SwipeToActionDelegate.SwipeAction swipeAction) {
        p clickHandler = oVar.getClickHandler();
        p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new wx0.d(this, 2, oVar, swipeAction));
    }
}
