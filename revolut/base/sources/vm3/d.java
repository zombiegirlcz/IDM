package vm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f290526a;

    public d(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f290526a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f290526a, ((d) obj2).f290526a);
    }

    public final int hashCode() {
        return this.f290526a.hashCode();
    }
}
