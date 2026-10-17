package nz9;

import kotlin.jvm.internal.Intrinsics;
import zm3.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f221004a;

    public a(l contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f221004a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f221004a, ((a) obj2).f221004a);
    }

    public final int hashCode() {
        return this.f221004a.hashCode();
    }
}
