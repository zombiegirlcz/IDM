package dl3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f115696a;

    public c(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f115696a = contact;
    }

    public final zm3.a a() {
        return this.f115696a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f115696a, ((c) obj2).f115696a);
    }

    public final int hashCode() {
        return this.f115696a.hashCode();
    }
}
