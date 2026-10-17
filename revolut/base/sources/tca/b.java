package tca;

import com.revolut.feature.apm.core.models.recipients.PixContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixContact f269768a;

    public b(PixContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f269768a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f269768a, ((b) obj2).f269768a);
    }

    public final int hashCode() {
        return this.f269768a.hashCode();
    }
}
