package my0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f210292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f210293b;

    public i(List items) {
        j type = j.NON_SCROLLABLE;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(type, "type");
        h items2 = new h(u.c(items));
        Intrinsics.checkNotNullParameter(items2, "items");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f210292a = items2;
        this.f210293b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f210292a, iVar.f210292a) && this.f210293b == iVar.f210293b;
    }

    public final int hashCode() {
        return this.f210293b.hashCode() + (this.f210292a.f210291a.hashCode() * 31);
    }
}
