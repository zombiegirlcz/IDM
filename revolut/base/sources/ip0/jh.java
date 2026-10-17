package ip0;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes19.dex */
public final class jh implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f164836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164837c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ jh(ImageView imageView, int i, int i2, int i3, View view, int i5) {
        this.f164835a = i5;
        this.f164836b = imageView;
        this.f164837c = i;
        this.d = i2;
        this.e = i3;
        this.f = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        switch (this.f164835a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                Rect rect = new Rect();
                ImageView imageView = this.f164836b;
                imageView.getHitRect(rect);
                int i33 = rect.right;
                int i43 = this.f164837c;
                int i59 = this.d;
                rect.right = Math.min(i43, i59) + i33 + i33;
                rect.top -= Math.min(this.e, i59);
                rect.left -= i59;
                rect.bottom += i59;
                TouchDelegate touchDelegate = new TouchDelegate(rect, imageView);
                View view2 = this.f;
                TouchDelegate touchDelegate2 = view2.getTouchDelegate();
                xv0.c cVar = touchDelegate2 instanceof xv0.c ? (xv0.c) touchDelegate2 : null;
                if (cVar == null) {
                    xv0.c cVar2 = new xv0.c(imageView);
                    cVar2.a("closeButtonHitZone", touchDelegate);
                    view2.setTouchDelegate(cVar2);
                } else {
                    cVar.a("closeButtonHitZone", touchDelegate);
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                Rect rect2 = new Rect();
                ImageView imageView2 = this.f164836b;
                imageView2.getHitRect(rect2);
                int i66 = rect2.right;
                int i74 = this.f164837c;
                int i92 = this.d;
                rect2.right = Math.min(i74, i92) + i66 + i66;
                rect2.top -= Math.min(this.e, i92);
                rect2.left -= i92;
                rect2.bottom += i92;
                TouchDelegate touchDelegate3 = new TouchDelegate(rect2, imageView2);
                View view3 = this.f;
                TouchDelegate touchDelegate4 = view3.getTouchDelegate();
                xv0.c cVar3 = touchDelegate4 instanceof xv0.c ? (xv0.c) touchDelegate4 : null;
                if (cVar3 == null) {
                    xv0.c cVar4 = new xv0.c(imageView2);
                    cVar4.a("closeButtonHitZone", touchDelegate3);
                    view3.setTouchDelegate(cVar4);
                } else {
                    cVar3.a("closeButtonHitZone", touchDelegate3);
                }
                break;
        }
    }
}
