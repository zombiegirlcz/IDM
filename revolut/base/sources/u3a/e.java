package u3a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.j f276838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276839b;

    public e(zm3.j contact, String phoneNumber) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f276838a = contact;
        this.f276839b = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276838a, eVar.f276838a) && Intrinsics.f(this.f276839b, eVar.f276839b);
    }

    public final int hashCode() {
        return this.f276839b.hashCode() + (this.f276838a.hashCode() * 31);
    }
}
