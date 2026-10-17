package gp0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import fp0.k;
import ix0.a2;
import ix0.z1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp0.e f145205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f145206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fp0.i f145207c;

    public h(hp0.e rippleContent, f attachStrategy, fp0.i surface) {
        Intrinsics.checkNotNullParameter(rippleContent, "rippleContent");
        Intrinsics.checkNotNullParameter(attachStrategy, "attachStrategy");
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f145205a = rippleContent;
        this.f145206b = attachStrategy;
        this.f145207c = surface;
    }

    @Override // gp0.i
    public final a2 a(final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawable = this.f145205a.a(context, this.f145207c).b();
        f fVar = this.f145206b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (view.isAttachedToWindow()) {
            fVar.a(view, drawable);
            a2.Companion.getClass();
            return z1.f169326b;
        }
        final as0.d dVar = new as0.d(fVar, drawable, 1);
        view.addOnAttachStateChangeListener(dVar);
        return new a2() { // from class: gp0.d
            @Override // ix0.a2
            public final void cancel() {
                view.removeOnAttachStateChangeListener(dVar);
            }
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f145205a, hVar.f145205a) && Intrinsics.f(this.f145206b, hVar.f145206b) && Intrinsics.f(this.f145207c, hVar.f145207c);
    }

    @Override // gp0.i
    public final k getSurface() {
        return this.f145207c;
    }

    public final int hashCode() {
        return this.f145207c.hashCode() + ((this.f145206b.hashCode() + (this.f145205a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ h(f fVar, fp0.i iVar) {
        this(new hp0.c(null, null, 3), fVar, iVar);
    }
}
