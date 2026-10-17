package bp1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f17543b;

    public a(LinkedHashMap linkedHashMap, String billerId) {
        Intrinsics.checkNotNullParameter(billerId, "billerId");
        this.f17542a = billerId;
        this.f17543b = linkedHashMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f17542a, aVar.f17542a) && this.f17543b.equals(aVar.f17543b);
    }

    public final int hashCode() {
        return this.f17543b.hashCode() + (this.f17542a.hashCode() * 31);
    }
}
