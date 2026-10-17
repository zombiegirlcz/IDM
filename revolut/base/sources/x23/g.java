package x23;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f302468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f302469b;

    public g(Clause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f302468a = text;
        this.f302469b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f302468a.equals(gVar.f302468a) && this.f302469b == gVar.f302469b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f302469b) + (this.f302468a.hashCode() * 31);
    }
}
