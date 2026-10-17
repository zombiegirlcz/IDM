package rzj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f258697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f258698b;

    public k(List articles, int i) {
        Intrinsics.checkNotNullParameter(articles, "articles");
        this.f258697a = articles;
        this.f258698b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f258697a, kVar.f258697a) && this.f258698b == kVar.f258698b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f258698b) + (this.f258697a.hashCode() * 31);
    }
}
