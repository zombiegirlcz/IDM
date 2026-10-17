package ij4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f161700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f161702c;

    public g(Data valuatorsData, String str, boolean z) {
        Intrinsics.checkNotNullParameter(valuatorsData, "valuatorsData");
        this.f161700a = valuatorsData;
        this.f161701b = str;
        this.f161702c = z;
    }

    public static g a(g gVar, String str, boolean z, int i) {
        Data valuatorsData = gVar.f161700a;
        if ((i & 2) != 0) {
            str = gVar.f161701b;
        }
        if ((i & 4) != 0) {
            z = gVar.f161702c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(valuatorsData, "valuatorsData");
        return new g(valuatorsData, str, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f161700a, gVar.f161700a) && Intrinsics.f(this.f161701b, gVar.f161701b) && this.f161702c == gVar.f161702c;
    }

    public final int hashCode() {
        int iHashCode = this.f161700a.hashCode() * 31;
        String str = this.f161701b;
        return Boolean.hashCode(this.f161702c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
