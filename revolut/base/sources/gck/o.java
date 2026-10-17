package gck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f142507a;

    public o(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f142507a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f142507a, ((o) obj2).f142507a);
    }

    public final int hashCode() {
        return this.f142507a.hashCode();
    }
}
