package ob0;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f223817b;

    public d(String itemId, wi0.b code) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f223816a = itemId;
        this.f223817b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f223816a, dVar.f223816a) && Intrinsics.f(this.f223817b, dVar.f223817b);
    }

    public final int hashCode() {
        return this.f223817b.f297794a.hashCode() + (this.f223816a.hashCode() * 31);
    }
}
