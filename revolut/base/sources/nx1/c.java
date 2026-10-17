package nx1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmContact f220055a;

    public c(ApmContact apmContact) {
        Intrinsics.checkNotNullParameter(apmContact, "apmContact");
        this.f220055a = apmContact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f220055a, ((c) obj2).f220055a);
    }

    public final int hashCode() {
        return this.f220055a.hashCode();
    }
}
