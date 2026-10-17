package yu5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f316886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f316887b;

    public g(List filters, boolean z) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f316886a = filters;
        this.f316887b = z;
    }

    public static g a(g gVar, ArrayList filters) {
        boolean z = gVar.f316887b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new g(filters, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f316886a, gVar.f316886a) && this.f316887b == gVar.f316887b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f316887b) + (this.f316886a.hashCode() * 31);
    }
}
