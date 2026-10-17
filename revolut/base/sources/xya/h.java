package xya;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f309684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f309685b;

    public h(Data activeReferrals, Data pastReferrals) {
        Intrinsics.checkNotNullParameter(activeReferrals, "activeReferrals");
        Intrinsics.checkNotNullParameter(pastReferrals, "pastReferrals");
        this.f309684a = activeReferrals;
        this.f309685b = pastReferrals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f309684a, hVar.f309684a) && Intrinsics.f(this.f309685b, hVar.f309685b);
    }

    public final int hashCode() {
        return this.f309685b.hashCode() + (this.f309684a.hashCode() * 31);
    }
}
