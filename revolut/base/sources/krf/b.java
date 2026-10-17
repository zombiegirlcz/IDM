package krf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188859b;

    public b(String type, String label) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f188858a = type;
        this.f188859b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f188858a, bVar.f188858a) && Intrinsics.f(this.f188859b, bVar.f188859b);
    }

    public final int hashCode() {
        return this.f188859b.hashCode() + (this.f188858a.hashCode() * 31);
    }
}
