package dej;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r3 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimGiftRecipient f113643a;

    public r3(EsimGiftRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f113643a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r3) && Intrinsics.f(this.f113643a, ((r3) obj2).f113643a);
    }

    public final int hashCode() {
        return this.f113643a.hashCode();
    }
}
