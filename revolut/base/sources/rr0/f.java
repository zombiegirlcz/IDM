package rr0;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements sy0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f256611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f256612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f256613c;

    public f(WeakReference helperRef) {
        Intrinsics.checkNotNullParameter(helperRef, "helperRef");
        this.f256611a = helperRef;
    }

    public final boolean a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        g gVar = (g) this.f256611a.get();
        return gVar != null && view == gVar.f256614a;
    }

    public final void b(boolean z) {
        if (this.f256612b != z) {
            this.f256612b = z;
            g gVar = (g) this.f256611a.get();
            if (gVar == null) {
                return;
            }
            int i = gVar.o + (z ? 1 : -1);
            gVar.o = i;
            if (i == 1) {
                g.b(gVar, true);
            } else if (i == 0) {
                g.b(gVar, false);
            }
        }
    }

    public final void c(boolean z) {
        if (this.f256613c != z) {
            this.f256613c = z;
            g gVar = (g) this.f256611a.get();
            if (gVar == null) {
                return;
            }
            int i = gVar.f256623p + (z ? 1 : -1);
            gVar.f256623p = i;
            if (i == 1) {
                g.h(gVar, false, true, 1);
            } else if (i == 0) {
                g.h(gVar, false, false, 1);
            }
        }
    }
}
