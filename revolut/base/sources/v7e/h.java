package v7e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f286593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f286594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f286595c;

    public h(List list, boolean z, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f286593a = currency;
        this.f286594b = list;
        this.f286595c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f286593a, hVar.f286593a) && Intrinsics.f(this.f286594b, hVar.f286594b) && this.f286595c == hVar.f286595c;
    }

    public final int hashCode() {
        int iHashCode = this.f286593a.hashCode() * 31;
        List list = this.f286594b;
        return Boolean.hashCode(this.f286595c) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }
}
