package jt0;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import bw0.n;
import com.revolut.core.ui_kit.internal.views.dual_amount.AmountForDualEditView;
import kotlin.jvm.internal.Intrinsics;
import yr0.k;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f178271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f178272c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ View e;

    public /* synthetic */ d(boolean z, ViewGroup viewGroup, View view, n nVar, int i) {
        this.f178270a = i;
        this.f178271b = z;
        this.f178272c = viewGroup;
        this.e = view;
        this.d = nVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        xv0.c cVar;
        switch (this.f178270a) {
            case 0:
                n nVar = (n) this.d;
                AmountForDualEditView amountForDualEditView = (AmountForDualEditView) this.e;
                view.removeOnLayoutChangeListener(this);
                if (!this.f178271b) {
                    amountForDualEditView.getOrCreateCompositeTouchDelegate().b(nVar.name());
                } else {
                    Rect rect = new Rect();
                    View view2 = this.f178272c;
                    view2.getHitRect(rect);
                    int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(view2, "getContext(...)", 16.0f);
                    rect.left -= iA;
                    rect.right += iA;
                    rect.bottom += iA;
                    amountForDualEditView.getOrCreateCompositeTouchDelegate().a(nVar.name(), new TouchDelegate(rect, view2));
                }
                break;
            case 1:
                n nVar2 = (n) this.d;
                view.removeOnLayoutChangeListener(this);
                boolean z = this.f178271b;
                View view3 = this.e;
                if (!z) {
                    TouchDelegate touchDelegate = view3.getTouchDelegate();
                    cVar = touchDelegate instanceof xv0.c ? (xv0.c) touchDelegate : null;
                    if (cVar != null) {
                        cVar.b(nVar2.name());
                    }
                } else {
                    Rect rect2 = new Rect();
                    View view4 = this.f178272c;
                    view4.getHitRect(rect2);
                    int i33 = rect2.left;
                    Context context = view4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    rect2.left = i33 - kli.a.k(context, 16.0f);
                    int i43 = rect2.right;
                    Context context2 = view4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    rect2.right = kli.a.k(context2, 16.0f) + i43;
                    int i59 = rect2.bottom;
                    Context context3 = view4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    rect2.bottom = kli.a.k(context3, 16.0f) + i59;
                    TouchDelegate touchDelegate2 = new TouchDelegate(rect2, view4);
                    TouchDelegate touchDelegate3 = view3.getTouchDelegate();
                    cVar = touchDelegate3 instanceof xv0.c ? (xv0.c) touchDelegate3 : null;
                    if (cVar == null) {
                        xv0.c cVar2 = new xv0.c(view4);
                        cVar2.a(nVar2.name(), touchDelegate2);
                        view3.setTouchDelegate(cVar2);
                    } else {
                        cVar.a(nVar2.name(), touchDelegate2);
                    }
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                k.a((k) this.e, this.f178272c, (View) this.d, this.f178271b);
                break;
        }
    }

    public d(k kVar, View view, View view2, boolean z) {
        this.f178270a = 2;
        this.e = kVar;
        this.f178272c = view;
        this.d = view2;
        this.f178271b = z;
    }
}
