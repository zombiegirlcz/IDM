package hw1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f156043a;

    public n(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f156043a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f156043a, ((n) obj2).f156043a);
    }

    public final int hashCode() {
        return this.f156043a.hashCode();
    }
}
