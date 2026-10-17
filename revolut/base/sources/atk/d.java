package atk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f9085a;

    public d(Data instrumentIsRisky) {
        Intrinsics.checkNotNullParameter(instrumentIsRisky, "instrumentIsRisky");
        this.f9085a = instrumentIsRisky;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f9085a, ((d) obj2).f9085a);
    }

    public final int hashCode() {
        return this.f9085a.hashCode();
    }
}
