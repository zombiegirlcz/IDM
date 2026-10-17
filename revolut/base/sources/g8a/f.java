package g8a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f141304a;

    public f(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f141304a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f141304a, ((f) obj2).f141304a);
    }

    public final int hashCode() {
        return this.f141304a.hashCode();
    }
}
