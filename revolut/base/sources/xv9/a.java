package xv9;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipient f309224a;

    public a(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f309224a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f309224a, ((a) obj2).f309224a);
    }

    public final int hashCode() {
        return this.f309224a.hashCode();
    }
}
