package lq0;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends m {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static void m(r rVar) {
        View view = rVar.f199180a;
        if (view.getVisibility() != 0) {
            return;
        }
        rVar.f199181b.put("view_bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
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
    public final b g(r rVar, r rVar2) {
        Object obj2 = rVar != null ? rVar.f199181b.get("view_bounds") : null;
        Rect rect = obj2 instanceof Rect ? (Rect) obj2 : null;
        Object obj3 = rVar2 != null ? rVar2.f199181b.get("view_bounds") : null;
        Rect rect2 = obj3 instanceof Rect ? (Rect) obj3 : null;
        if (rect == null || rect2 == null || rect.equals(rect2)) {
            return null;
        }
        return new u(rVar.f199180a, rect, rect2);
    }
}
