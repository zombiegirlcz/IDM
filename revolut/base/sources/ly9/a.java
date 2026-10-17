package ly9;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipient f200755a;

    public a(ApmRecipient apmRecipient) {
        Intrinsics.checkNotNullParameter(apmRecipient, "apmRecipient");
        this.f200755a = apmRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f200755a, ((a) obj2).f200755a);
    }

    public final int hashCode() {
        return this.f200755a.hashCode();
    }
}
