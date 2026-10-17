package qca;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f244674a;

    public i(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f244674a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f244674a, ((i) obj2).f244674a);
    }

    public final int hashCode() {
        return this.f244674a.hashCode();
    }
}
