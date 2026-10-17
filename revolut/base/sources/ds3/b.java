package ds3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f117191b;

    public b(String text, a aVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f117190a = text;
        this.f117191b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f117190a, bVar.f117190a) && this.f117191b == bVar.f117191b;
    }

    public final int hashCode() {
        int iHashCode = this.f117190a.hashCode() * 31;
        a aVar = this.f117191b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
