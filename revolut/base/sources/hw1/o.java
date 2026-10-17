package hw1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f156044a;

    public o(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f156044a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f156044a, ((o) obj2).f156044a);
    }

    public final int hashCode() {
        return this.f156044a.hashCode();
    }
}
