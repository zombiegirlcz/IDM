package hw1;

import com.revolut.feature.apm.core.models.recipients.BrebContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrebContact f156045a;

    public p(BrebContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f156045a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f156045a, ((p) obj2).f156045a);
    }

    public final int hashCode() {
        return this.f156045a.hashCode();
    }
}
