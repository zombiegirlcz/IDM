package nhg;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f215461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f215462b;

    public c(ViewGroup view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f215461a = view;
        this.f215462b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f215461a.equals(cVar.f215461a) && this.f215462b == cVar.f215462b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f215462b) + (this.f215461a.hashCode() * 31);
    }
}
