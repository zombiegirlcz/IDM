package uhj;

import aii.r;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimGiftRecipient f280256a;

    public e(EsimGiftRecipient giftRecipient) {
        Intrinsics.checkNotNullParameter(giftRecipient, "giftRecipient");
        this.f280256a = giftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f280256a, ((e) obj2).f280256a);
    }

    public final int hashCode() {
        return this.f280256a.hashCode();
    }
}
