package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l implements v8.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v8.e f26102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f26103b;

    public l(View view) {
        y8.f.c(view, "Argument must not be null");
        this.f26103b = view;
        this.f26102a = new v8.e(view);
    }

    @Override // v8.l
    public final void a(u8.j jVar) {
        v8.e eVar = this.f26102a;
        ArrayList arrayList = eVar.f286693b;
        View view = eVar.f286692a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = eVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = eVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            jVar.k(iA, iA2);
            return;
        }
        if (!arrayList.contains(jVar)) {
            arrayList.add(jVar);
        }
        if (eVar.f286694c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            v8.d dVar = new v8.d(eVar);
            eVar.f286694c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    @Override // v8.l
    public final void b(Drawable drawable) {
        v8.e eVar = this.f26102a;
        ViewTreeObserver viewTreeObserver = eVar.f286692a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(eVar.f286694c);
        }
        eVar.f286694c = null;
        eVar.f286693b.clear();
    }

    @Override // v8.l
    public final void c(u8.c cVar) {
        this.f26103b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // v8.l
    public final void d(Object obj2, w8.d dVar) {
    }

    @Override // v8.l
    public final void e(u8.j jVar) {
        this.f26102a.f286693b.remove(jVar);
    }

    @Override // v8.l
    public final void f(Drawable drawable) {
    }

    @Override // v8.l
    public final void g(Drawable drawable) {
    }

    @Override // v8.l
    public final u8.c getRequest() {
        Object tag2 = this.f26103b.getTag(R.id.glide_custom_view_target_tag);
        if (tag2 == null) {
            return null;
        }
        if (tag2 instanceof u8.c) {
            return (u8.c) tag2;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // r8.j
    public final void onDestroy() {
    }

    @Override // r8.j
    public final void onStart() {
    }

    @Override // r8.j
    public final void onStop() {
    }

    public final String toString() {
        return "Target for: " + this.f26103b;
    }
}
