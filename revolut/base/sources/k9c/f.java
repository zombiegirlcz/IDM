package k9c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f182310a;

    public f(Data pendingCashbackDetailsData) {
        Intrinsics.checkNotNullParameter(pendingCashbackDetailsData, "pendingCashbackDetailsData");
        this.f182310a = pendingCashbackDetailsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f182310a, ((f) obj2).f182310a);
    }

    public final int hashCode() {
        return this.f182310a.hashCode();
    }
}
