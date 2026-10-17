package im9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f162317b;

    public a(ArrayList arrayList, ArrayList blockedContacts) {
        Intrinsics.checkNotNullParameter(blockedContacts, "blockedContacts");
        this.f162316a = arrayList;
        this.f162317b = blockedContacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f162316a, aVar.f162316a) && this.f162317b.equals(aVar.f162317b);
    }

    public final int hashCode() {
        List list = this.f162316a;
        return this.f162317b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }
}
