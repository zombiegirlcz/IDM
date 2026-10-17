package m90;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f203605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f203606b;

    public a(boolean z, Map attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f203605a = z;
        this.f203606b = attributes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f203605a == aVar.f203605a && Intrinsics.f(this.f203606b, aVar.f203606b);
    }

    public final int hashCode() {
        return this.f203606b.hashCode() + (Boolean.hashCode(this.f203605a) * 31);
    }
}
