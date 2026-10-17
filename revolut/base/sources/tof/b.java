package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f272635b;

    public b(String id10, n2 type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f272634a = id10;
        this.f272635b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f272634a, bVar.f272634a) && this.f272635b == bVar.f272635b;
    }

    public final int hashCode() {
        return this.f272635b.hashCode() + (this.f272634a.hashCode() * 31);
    }
}
