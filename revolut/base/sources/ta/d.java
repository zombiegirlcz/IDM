package ta;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f269066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269067b;

    public d(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f269066a = items;
        this.f269067b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f269066a.equals(dVar.f269066a) && Intrinsics.f(this.f269067b, dVar.f269067b);
    }

    public final int hashCode() {
        int iHashCode = this.f269066a.hashCode() * 31;
        String str = this.f269067b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Consents(items=" + this.f269066a + ", note=" + this.f269067b + ")";
    }
}
