package lca;

import com.revolut.feature.apm.core.models.recipients.PixContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixContact f193804a;

    public b(PixContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f193804a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f193804a, ((b) obj2).f193804a);
    }

    public final int hashCode() {
        return this.f193804a.hashCode();
    }
}
