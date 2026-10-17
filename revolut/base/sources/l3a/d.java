package l3a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3a.a f191868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f191870c;

    public d(d3a.a section, String str, List items) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f191868a = section;
        this.f191869b = str;
        this.f191870c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f191868a == dVar.f191868a && Intrinsics.f(this.f191869b, dVar.f191869b) && Intrinsics.f(this.f191870c, dVar.f191870c);
    }

    public final int hashCode() {
        int iHashCode = this.f191868a.hashCode() * 31;
        String str = this.f191869b;
        return this.f191870c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
