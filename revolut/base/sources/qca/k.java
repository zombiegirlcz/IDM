package qca;

import com.revolut.feature.apm.core.models.recipients.PixContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixContact f244676a;

    public k(PixContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f244676a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f244676a, ((k) obj2).f244676a);
    }

    public final int hashCode() {
        return this.f244676a.hashCode();
    }
}
