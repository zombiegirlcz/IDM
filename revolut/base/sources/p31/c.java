package p31;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public interface c {

    @NotNull
    public static final b Companion = b.f232560a;

    default void a(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    default void b(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    default void c(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    void d(Canvas canvas, View view, RecyclerView recyclerView, RecyclerView.State state);

    void e(Canvas canvas, View view, RecyclerView recyclerView, RecyclerView.State state);

    default void f(Canvas canvas, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state);

    void h(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state);

    void i(Canvas canvas, View view, RecyclerView recyclerView, RecyclerView.State state);

    void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state);

    void k(Canvas canvas, View view, RecyclerView recyclerView, RecyclerView.State state);

    void l(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state);
}
