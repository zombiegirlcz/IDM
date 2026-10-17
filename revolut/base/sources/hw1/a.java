package hw1;

import com.revolut.feature.apm.core.models.recipients.BrebContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrebContact f156031a;

    public a(BrebContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f156031a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f156031a, ((a) obj2).f156031a);
    }

    public final int hashCode() {
        return this.f156031a.hashCode();
    }
}
