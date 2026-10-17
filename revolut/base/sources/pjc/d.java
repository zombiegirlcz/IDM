package pjc;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f236725a;

    public d(Set selectedLinkedPaymentIds) {
        Intrinsics.checkNotNullParameter(selectedLinkedPaymentIds, "selectedLinkedPaymentIds");
        this.f236725a = selectedLinkedPaymentIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f236725a, ((d) obj2).f236725a);
    }

    public final int hashCode() {
        return this.f236725a.hashCode();
    }
}
