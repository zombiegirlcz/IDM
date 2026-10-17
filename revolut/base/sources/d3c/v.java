package d3c;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f111067b;

    public v(LinkedHashMap colours, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(colours, "colours");
        this.f111066a = title;
        this.f111067b = colours;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f111066a, vVar.f111066a) && this.f111067b.equals(vVar.f111067b);
    }

    public final int hashCode() {
        return this.f111067b.hashCode() + (this.f111066a.hashCode() * 31);
    }
}
