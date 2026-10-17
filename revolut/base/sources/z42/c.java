package z42;

import cli.j;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferRecipient f319307a;

    public c(ApmTransferRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f319307a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f319307a, ((c) obj2).f319307a);
    }

    public final int hashCode() {
        return this.f319307a.hashCode();
    }
}
