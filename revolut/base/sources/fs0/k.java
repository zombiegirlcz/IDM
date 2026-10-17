package fs0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import et0.w0;
import et0.z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f137533b;

    public /* synthetic */ k(p pVar, int i) {
        this.f137532a = i;
        this.f137533b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar;
        Drawable drawable;
        switch (this.f137532a) {
            case 0:
                p.b(this.f137533b);
                break;
            default:
                p pVar = this.f137533b;
                Rect rect = pVar.A;
                z0 z0Var = pVar.f137536a;
                if (pVar.j()) {
                    boolean z = z0Var.getView().getScrollX() != pVar.B;
                    pVar.B = z0Var.getView().getScrollX();
                    boolean z3 = (z0Var.getView().getGlobalVisibleRect(rect) && Intrinsics.f(pVar.C, rect)) ? false : true;
                    if (z3) {
                        Rect rect2 = pVar.C;
                        if (rect2 != null) {
                            rect2.set(rect);
                        } else {
                            rect2 = new Rect(rect);
                        }
                        pVar.C = rect2;
                    }
                    if (z || z3) {
                        ActionMode actionMode = pVar.d;
                        if (actionMode != null) {
                            actionMode.invalidate();
                        }
                        z0Var.getView().postInvalidateOnAnimation();
                    }
                    int[] iArr = pVar.z;
                    f fVar = pVar.E;
                    w0 w0Var = pVar.f137538c;
                    if (w0Var == null || (nVar = pVar.f137539g) == n.SELECTION_ANCHORED || nVar == n.DRAG_EXPANDING) {
                        e eVar = pVar.f137551x;
                        if (eVar != null) {
                            eVar.a();
                        }
                        e eVar2 = pVar.f137552y;
                        if (eVar2 != null) {
                            eVar2.a();
                        }
                    } else {
                        pVar.h();
                        Drawable drawable2 = pVar.u;
                        if (drawable2 != null && (drawable = pVar.v) != null) {
                            if (!pVar.f(w0Var)) {
                                e eVar3 = pVar.f137551x;
                                if (eVar3 != null) {
                                    eVar3.a();
                                }
                                e eVar4 = pVar.f137552y;
                                if (eVar4 != null) {
                                    eVar4.a();
                                }
                            } else {
                                boolean z4 = fVar.f137524c;
                                Drawable drawable3 = z4 ? drawable : drawable2;
                                if (!z4) {
                                    drawable2 = drawable;
                                }
                                float intrinsicWidth = (z4 ? drawable3.getIntrinsicWidth() : drawable3.getIntrinsicWidth() * 3.0f) / 4.0f;
                                float intrinsicWidth2 = fVar.f137524c ? (drawable2.getIntrinsicWidth() * 3.0f) / 4.0f : drawable2.getIntrinsicWidth() / 4.0f;
                                z0Var.getView().getLocationOnScreen(iArr);
                                int scrollX = ((iArr[0] + w0Var.f129140c) + w0Var.e) - z0Var.getView().getScrollX();
                                int i = iArr[1] + w0Var.d + w0Var.f;
                                float f = scrollX;
                                int i2 = (int) ((fVar.f137522a + f) - intrinsicWidth);
                                float f4 = i;
                                int i3 = (int) (fVar.f137523b + f4);
                                f fVar2 = pVar.F;
                                int i5 = (int) ((f + fVar2.f137522a) - intrinsicWidth2);
                                int i6 = (int) (f4 + fVar2.f137523b);
                                if (pVar.f137551x == null) {
                                    Context context = z0Var.getView().getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    pVar.f137551x = new e(context);
                                }
                                if (pVar.f137552y == null) {
                                    Context context2 = z0Var.getView().getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    pVar.f137552y = new e(context2);
                                }
                                e eVar5 = pVar.f137551x;
                                if (eVar5 != null) {
                                    eVar5.c(drawable3, z0Var.getView(), i2, i3);
                                }
                                e eVar6 = pVar.f137552y;
                                if (eVar6 != null) {
                                    eVar6.c(drawable2, z0Var.getView(), i5, i6);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }
}
