package c12;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipient f20327a;

    public d0(ApmRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f20327a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f20327a, ((d0) obj2).f20327a);
    }

    public final int hashCode() {
        return this.f20327a.hashCode();
    }
}
