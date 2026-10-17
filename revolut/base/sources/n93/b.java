package n93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213547a;

    public b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f213547a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f213547a, ((b) obj2).f213547a);
    }

    public final int hashCode() {
        return this.f213547a.hashCode();
    }
}
