package c12;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipient f20355a;

    public w(ApmContact recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f20355a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f20355a, ((w) obj2).f20355a);
    }

    public final int hashCode() {
        return this.f20355a.hashCode();
    }
}
