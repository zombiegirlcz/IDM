package os9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f229261a;

    public b(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f229261a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f229261a, ((b) obj2).f229261a);
    }

    public final int hashCode() {
        return this.f229261a.hashCode();
    }
}
