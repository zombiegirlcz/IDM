package ol0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f226294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f226295c;

    public k(String url2, List children, boolean z) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f226293a = url2;
        this.f226294b = z;
        this.f226295c = children;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f226293a, kVar.f226293a) && this.f226294b == kVar.f226294b && Intrinsics.f(this.f226295c, kVar.f226295c);
    }

    public final int hashCode() {
        return this.f226295c.hashCode() + j6.a.c(this.f226293a.hashCode() * 31, 31, this.f226294b);
    }
}
