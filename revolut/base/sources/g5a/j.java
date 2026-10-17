package g5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.l f140707a;

    public j(zm3.l contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f140707a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f140707a, ((j) obj2).f140707a);
    }

    public final int hashCode() {
        return this.f140707a.hashCode();
    }
}
