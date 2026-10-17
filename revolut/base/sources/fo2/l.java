package fo2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f136791c;

    public l(String id10, String str, ArrayList sections) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f136789a = id10;
        this.f136790b = str;
        this.f136791c = sections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f136789a, lVar.f136789a) && Intrinsics.f(this.f136790b, lVar.f136790b) && this.f136791c.equals(lVar.f136791c);
    }

    public final int hashCode() {
        int iHashCode = this.f136789a.hashCode() * 31;
        String str = this.f136790b;
        return this.f136791c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
