package nx0;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import ux0.s0;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220049a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f220050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f220051c;
    public final /* synthetic */ View d;

    public i(s0 s0Var, RecyclerView recyclerView, boolean z) {
        this.f220051c = s0Var;
        this.d = recyclerView;
        this.f220050b = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        xv0.c cVar;
        switch (this.f220049a) {
            case 0:
                ImageView imageView = (ImageView) this.f220051c;
                view.removeOnLayoutChangeListener(this);
                boolean z = this.f220050b;
                View view2 = this.d;
                if (!z) {
                    TouchDelegate touchDelegate = view2.getTouchDelegate();
                    cVar = touchDelegate instanceof xv0.c ? (xv0.c) touchDelegate : null;
                    if (cVar != null) {
                        cVar.b("switcher");
                    }
                } else {
                    Rect rect = new Rect();
                    imageView.getHitRect(rect);
                    int i33 = rect.left;
                    Context context = imageView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    rect.left = i33 - kli.a.k(context, 16.0f);
                    int i43 = rect.right;
                    Context context2 = imageView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    rect.right = kli.a.k(context2, 16.0f) + i43;
                    int i59 = rect.bottom;
                    Context context3 = imageView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    rect.bottom = kli.a.k(context3, 16.0f) + i59;
                    TouchDelegate touchDelegate2 = new TouchDelegate(rect, imageView);
                    TouchDelegate touchDelegate3 = view2.getTouchDelegate();
                    cVar = touchDelegate3 instanceof xv0.c ? (xv0.c) touchDelegate3 : null;
                    if (cVar == null) {
                        xv0.c cVar2 = new xv0.c(imageView);
                        cVar2.a("switcher", touchDelegate2);
                        view2.setTouchDelegate(cVar2);
                    } else {
                        cVar.a("switcher", touchDelegate2);
                    }
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                s0.a((s0) this.f220051c, (RecyclerView) this.d, this.f220050b);
                break;
        }
    }

    public i(boolean z, ImageView imageView, View view) {
        this.f220050b = z;
        this.f220051c = imageView;
        this.d = view;
    }
}
