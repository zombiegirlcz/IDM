package dm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.l f115838a;

    public h(zm3.l contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f115838a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f115838a, ((h) obj2).f115838a);
    }

    public final int hashCode() {
        return this.f115838a.hashCode();
    }
}
