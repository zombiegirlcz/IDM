package vm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f290528a;

    public f(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f290528a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f290528a, ((f) obj2).f290528a);
    }

    public final int hashCode() {
        return this.f290528a.hashCode();
    }
}
