package el3;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f127236a;

    public c(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f127236a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f127236a, ((c) obj2).f127236a);
    }

    public final int hashCode() {
        return this.f127236a.hashCode();
    }
}
