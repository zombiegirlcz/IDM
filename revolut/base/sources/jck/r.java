package jck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.l f172866a;

    public r(zm3.l contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f172866a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f172866a, ((r) obj2).f172866a);
    }

    public final int hashCode() {
        return this.f172866a.hashCode();
    }
}
