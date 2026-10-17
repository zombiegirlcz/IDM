package uhj;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f280255a;

    public d(Data giftRecipients) {
        Intrinsics.checkNotNullParameter(giftRecipients, "giftRecipients");
        this.f280255a = giftRecipients;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f280255a, ((d) obj2).f280255a);
    }

    public final int hashCode() {
        return this.f280255a.hashCode();
    }
}
