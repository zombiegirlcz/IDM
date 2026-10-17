package c42;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20980b;

    public b(List apmRecipients, List phoneContacts) {
        Intrinsics.checkNotNullParameter(apmRecipients, "apmRecipients");
        Intrinsics.checkNotNullParameter(phoneContacts, "phoneContacts");
        this.f20979a = apmRecipients;
        this.f20980b = phoneContacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f20979a, bVar.f20979a) && Intrinsics.f(this.f20980b, bVar.f20980b);
    }

    public final int hashCode() {
        return this.f20980b.hashCode() + (this.f20979a.hashCode() * 31);
    }
}
