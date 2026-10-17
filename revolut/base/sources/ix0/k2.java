package ix0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k2 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f169254a;

    public /* synthetic */ k2(View view) {
        this.f169254a = view;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof k2) {
            return Intrinsics.f(this.f169254a, ((k2) obj2).f169254a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f169254a.hashCode();
    }

    @Override // ix0.b2
    public final String j() {
        return j6.a.l(this.f169254a.getId(), "ViewRefTarget(view.id=", ")");
    }

    public final String toString() {
        return "ViewRefTarget(view=" + this.f169254a + ")";
    }
}
