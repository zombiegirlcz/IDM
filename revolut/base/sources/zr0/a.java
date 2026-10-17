package zr0;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import lq0.m;
import lq0.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends m {

    @NotNull
    private static final C1800a Companion = new C1800a();

    /* JADX INFO: renamed from: zr0.a$a, reason: collision with other inner class name */
    public static final class C1800a {
        private C1800a() {
        }
    }

    public static void m(r rVar) {
        View view = rVar.f199180a;
        if (view.getVisibility() != 0) {
            return;
        }
        rVar.f199181b.put("rv_child_bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
    }

    @Override // lq0.m
    public final void c(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m(holder);
    }

    @Override // lq0.m
    public final void e(r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m(holder);
    }

    @Override // lq0.m
    public final lq0.b g(r rVar, r rVar2) {
        Object obj2 = rVar != null ? rVar.f199181b.get("rv_child_bounds") : null;
        Rect rect = obj2 instanceof Rect ? (Rect) obj2 : null;
        Object obj3 = rVar2 != null ? rVar2.f199181b.get("rv_child_bounds") : null;
        Rect rect2 = obj3 instanceof Rect ? (Rect) obj3 : null;
        if (rect == null || rect2 == null || rect.equals(rect2)) {
            return null;
        }
        return new b(rVar.f199180a, rect.width(), rect.height(), rect2.width(), rect2.height());
    }
}
