package m98;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f203638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f203639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f203640c;
    public final Data d;
    public final boolean e;

    public f(Data juniorProfile, Data parentAddress, Data cardRequest, Data cardConfig, boolean z) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(parentAddress, "parentAddress");
        Intrinsics.checkNotNullParameter(cardRequest, "cardRequest");
        Intrinsics.checkNotNullParameter(cardConfig, "cardConfig");
        this.f203638a = juniorProfile;
        this.f203639b = parentAddress;
        this.f203640c = cardRequest;
        this.d = cardConfig;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f203638a, fVar.f203638a) && Intrinsics.f(this.f203639b, fVar.f203639b) && Intrinsics.f(this.f203640c, fVar.f203640c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + kii.e.c(this.d, kii.e.c(this.f203640c, kii.e.c(this.f203639b, this.f203638a.hashCode() * 31, 31), 31), 31);
    }
}
