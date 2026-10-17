package wm4;

import dx4.g2;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f298610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f298611b;

    public a(g2 g2Var, ArrayList suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f298610a = g2Var;
        this.f298611b = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f298610a, aVar.f298610a) && this.f298611b.equals(aVar.f298611b);
    }

    public final int hashCode() {
        g2 g2Var = this.f298610a;
        return this.f298611b.hashCode() + ((g2Var == null ? 0 : g2Var.hashCode()) * 31);
    }
}
