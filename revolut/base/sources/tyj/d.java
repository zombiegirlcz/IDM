package tyj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f275670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f275671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f275672c;

    public d(Data data, Data totalEarnedData, Data userBaseCurrencyData) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(totalEarnedData, "totalEarnedData");
        Intrinsics.checkNotNullParameter(userBaseCurrencyData, "userBaseCurrencyData");
        this.f275670a = data;
        this.f275671b = totalEarnedData;
        this.f275672c = userBaseCurrencyData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f275670a, dVar.f275670a) && Intrinsics.f(this.f275671b, dVar.f275671b) && Intrinsics.f(this.f275672c, dVar.f275672c);
    }

    public final int hashCode() {
        return this.f275672c.hashCode() + kii.e.c(this.f275671b, this.f275670a.hashCode() * 31, 31);
    }
}
