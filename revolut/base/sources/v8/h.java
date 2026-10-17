package v8;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f286695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f286696c;
    public Animatable d;

    public h(ImageView imageView) {
        y8.f.c(imageView, "Argument must not be null");
        this.f286695b = imageView;
        this.f286696c = new m(imageView);
    }

    @Override // v8.l
    public final void a(u8.j jVar) {
        m mVar = this.f286696c;
        ArrayList arrayList = mVar.f286698b;
        View view = mVar.f286697a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = mVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = mVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            jVar.k(iA, iA2);
            return;
        }
        if (!arrayList.contains(jVar)) {
            arrayList.add(jVar);
        }
        if (mVar.f286699c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            d dVar = new d(mVar);
            mVar.f286699c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    @Override // v8.a, v8.l
    public final void b(Drawable drawable) {
        m mVar = this.f286696c;
        ViewTreeObserver viewTreeObserver = mVar.f286697a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(mVar.f286699c);
        }
        mVar.f286699c = null;
        mVar.f286698b.clear();
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
        h(null);
        this.d = null;
        this.f286695b.setImageDrawable(drawable);
    }

    @Override // v8.a, v8.l
    public final void c(u8.c cVar) {
        this.f286695b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // v8.l
    public final void d(Object obj2, w8.d dVar) {
        if (dVar != null && dVar.a(obj2, this)) {
            if (!(obj2 instanceof Animatable)) {
                this.d = null;
                return;
            }
            Animatable animatable = (Animatable) obj2;
            this.d = animatable;
            animatable.start();
            return;
        }
        h(obj2);
        if (!(obj2 instanceof Animatable)) {
            this.d = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj2;
        this.d = animatable2;
        animatable2.start();
    }

    @Override // v8.l
    public final void e(u8.j jVar) {
        this.f286696c.f286698b.remove(jVar);
    }

    @Override // v8.a, v8.l
    public final void f(Drawable drawable) {
        h(null);
        this.d = null;
        this.f286695b.setImageDrawable(drawable);
    }

    @Override // v8.a, v8.l
    public void g(Drawable drawable) {
        h(null);
        this.d = null;
        this.f286695b.setImageDrawable(drawable);
    }

    @Override // v8.a, v8.l
    public final u8.c getRequest() {
        Object tag2 = this.f286695b.getTag(R.id.glide_custom_view_target_tag);
        if (tag2 == null) {
            return null;
        }
        if (tag2 instanceof u8.c) {
            return (u8.c) tag2;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public abstract void h(Object obj2);

    @Override // v8.a, r8.j
    public final void onStart() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // v8.a, r8.j
    public final void onStop() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final String toString() {
        return "Target for: " + this.f286695b;
    }
}
