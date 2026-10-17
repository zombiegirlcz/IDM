package d13;

import dj0.d;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f110482a;

    public a(d fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f110482a = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f110482a, ((a) obj2).f110482a);
    }

    public final int hashCode() {
        return this.f110482a.hashCode();
    }
}
