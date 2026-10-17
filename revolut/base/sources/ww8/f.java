package ww8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f300623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f300624b;

    public f(Data addressData, Data locationData) {
        Intrinsics.checkNotNullParameter(addressData, "addressData");
        Intrinsics.checkNotNullParameter(locationData, "locationData");
        this.f300623a = addressData;
        this.f300624b = locationData;
    }

    public static f a(f fVar, Data addressData, Data locationData, int i) {
        if ((i & 1) != 0) {
            addressData = fVar.f300623a;
        }
        if ((i & 2) != 0) {
            locationData = fVar.f300624b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(addressData, "addressData");
        Intrinsics.checkNotNullParameter(locationData, "locationData");
        return new f(addressData, locationData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f300623a, fVar.f300623a) && Intrinsics.f(this.f300624b, fVar.f300624b);
    }

    public final int hashCode() {
        return this.f300624b.hashCode() + (this.f300623a.hashCode() * 31);
    }
}
