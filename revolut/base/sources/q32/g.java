package q32;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241776b;

    public g(List data, String visibleCodeId) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(visibleCodeId, "visibleCodeId");
        this.f241775a = data;
        this.f241776b = visibleCodeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f241775a, gVar.f241775a) && Intrinsics.f(this.f241776b, gVar.f241776b);
    }

    public final int hashCode() {
        return this.f241776b.hashCode() + (this.f241775a.hashCode() * 31);
    }
}
