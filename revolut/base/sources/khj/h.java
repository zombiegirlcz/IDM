package khj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimGiftRecipient f184153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184155c;

    public h(EsimGiftRecipient recipient, int i) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f184153a = recipient;
        this.f184154b = i;
        this.f184155c = recipient.f100268a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f184153a, hVar.f184153a) && this.f184154b == hVar.f184154b;
    }

    @Override // khj.i
    public final String getId() {
        return this.f184155c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184154b) + (this.f184153a.hashCode() * 31);
    }
}
