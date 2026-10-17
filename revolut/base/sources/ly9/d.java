package ly9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f200758a;

    public d(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f200758a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f200758a, ((d) obj2).f200758a);
    }

    public final int hashCode() {
        return this.f200758a.hashCode();
    }
}
