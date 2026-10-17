package g8a;

import com.revolut.feature.apm.core.models.recipients.PixContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixContact f141301a;

    public c(PixContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f141301a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f141301a, ((c) obj2).f141301a);
    }

    public final int hashCode() {
        return this.f141301a.hashCode();
    }
}
