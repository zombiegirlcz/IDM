package ox1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f230528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f230529b;

    public d(Map phoneContacts, Map emailContacts) {
        Intrinsics.checkNotNullParameter(phoneContacts, "phoneContacts");
        Intrinsics.checkNotNullParameter(emailContacts, "emailContacts");
        this.f230528a = phoneContacts;
        this.f230529b = emailContacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f230528a, dVar.f230528a) && Intrinsics.f(this.f230529b, dVar.f230529b);
    }

    public final int hashCode() {
        return this.f230529b.hashCode() + (this.f230528a.hashCode() * 31);
    }
}
