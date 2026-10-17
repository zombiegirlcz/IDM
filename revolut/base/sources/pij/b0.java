package pij;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimGiftRecipient f236529a;

    public b0(EsimGiftRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f236529a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f236529a, ((b0) obj2).f236529a);
    }

    public final int hashCode() {
        return this.f236529a.hashCode();
    }
}
