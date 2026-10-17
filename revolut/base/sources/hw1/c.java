package hw1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f156033a;

    public c(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f156033a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f156033a, ((c) obj2).f156033a);
    }

    public final int hashCode() {
        return this.f156033a.hashCode();
    }
}
