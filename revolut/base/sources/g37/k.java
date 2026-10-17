package g37;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds6.k f140218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do3.n f140219c;

    public k(List calendarEvents, ds6.k taxTypeInfo, do3.n user) {
        Intrinsics.checkNotNullParameter(calendarEvents, "calendarEvents");
        Intrinsics.checkNotNullParameter(taxTypeInfo, "taxTypeInfo");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f140217a = calendarEvents;
        this.f140218b = taxTypeInfo;
        this.f140219c = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f140217a, kVar.f140217a) && Intrinsics.f(this.f140218b, kVar.f140218b) && Intrinsics.f(this.f140219c, kVar.f140219c);
    }

    public final int hashCode() {
        return this.f140219c.hashCode() + ((this.f140218b.hashCode() + (this.f140217a.hashCode() * 31)) * 31);
    }
}
