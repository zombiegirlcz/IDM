package nu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219210a;

    public h(String selectedOfferId) {
        Intrinsics.checkNotNullParameter(selectedOfferId, "selectedOfferId");
        this.f219210a = selectedOfferId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f219210a, ((h) obj2).f219210a);
    }

    public final int hashCode() {
        return this.f219210a.hashCode();
    }
}
