package sgm;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes14.dex */
public final class p4 implements l4, w8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f263073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f263074b;

    public /* synthetic */ p4(int i, boolean z) {
        this.f263073a = i;
        this.f263074b = z;
    }

    @Override // w8.d
    public boolean a(Object obj2, v8.h hVar) {
        Drawable drawable = (Drawable) obj2;
        ImageView imageView = hVar.f286695b;
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f263074b);
        transitionDrawable.startTransition(this.f263073a);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }

    @Override // sgm.l4
    public o4 call() {
        return new u4(this.f263073a, this.f263074b);
    }
}
