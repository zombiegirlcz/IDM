package ly9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.l f200763a;

    public i(zm3.l contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f200763a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f200763a, ((i) obj2).f200763a);
    }

    public final int hashCode() {
        return this.f200763a.hashCode();
    }
}
