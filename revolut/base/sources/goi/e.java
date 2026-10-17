package goi;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f145166a;

    public e(View navbarView) {
        Intrinsics.checkNotNullParameter(navbarView, "navbarView");
        this.f145166a = navbarView;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f145166a, ((e) obj2).f145166a);
    }

    public final int hashCode() {
        return this.f145166a.hashCode();
    }
}
