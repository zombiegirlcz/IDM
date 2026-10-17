package gp0;

import android.view.View;
import fp0.k;
import ix0.a2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f145198a = new b();

    private b() {
    }

    @Override // gp0.i
    public final a2 a(final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        j01.e.Companion.getClass();
        j01.d.a(view);
        return new a2() { // from class: gp0.a
            @Override // ix0.a2
            public final void cancel() {
                j01.e.Companion.getClass();
                View view2 = view;
                Intrinsics.checkNotNullParameter(view2, "view");
                view2.setOnTouchListener(null);
            }
        };
    }

    @Override // gp0.i
    public final /* bridge */ /* synthetic */ k getSurface() {
        return fp0.a.f137016a;
    }
}
