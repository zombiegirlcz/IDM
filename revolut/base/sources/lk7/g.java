package lk7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f196275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl7.b f196276b;

    public g(Data insuranceDetailsData, dl7.b subtypeInfo) {
        Intrinsics.checkNotNullParameter(insuranceDetailsData, "insuranceDetailsData");
        Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
        this.f196275a = insuranceDetailsData;
        this.f196276b = subtypeInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f196275a, gVar.f196275a) && Intrinsics.f(this.f196276b, gVar.f196276b);
    }

    public final int hashCode() {
        return this.f196276b.hashCode() + (this.f196275a.hashCode() * 31);
    }
}
