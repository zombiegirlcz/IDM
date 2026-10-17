package dgc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f114616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114618c;

    public b(String str, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f114616a = items;
        this.f114617b = str;
        this.f114618c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f114616a.equals(bVar.f114616a) && Intrinsics.f(this.f114617b, bVar.f114617b) && Intrinsics.f(this.f114618c, bVar.f114618c);
    }

    public final int hashCode() {
        int iHashCode = this.f114616a.hashCode() * 31;
        String str = this.f114617b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f114618c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
