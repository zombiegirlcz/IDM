package v2e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f285725a;

    public r(Data offers) {
        Intrinsics.checkNotNullParameter(offers, "offers");
        this.f285725a = offers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f285725a, ((r) obj2).f285725a);
    }

    public final int hashCode() {
        return this.f285725a.hashCode();
    }
}
