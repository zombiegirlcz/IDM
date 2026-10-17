package hk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f152876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f152877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152878c;
    public final String d;
    public final boolean e;

    public j(Data feeSettings, Data purchaseSimulation, int i, String str, boolean z) {
        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
        Intrinsics.checkNotNullParameter(purchaseSimulation, "purchaseSimulation");
        this.f152876a = feeSettings;
        this.f152877b = purchaseSimulation;
        this.f152878c = i;
        this.d = str;
        this.e = z;
    }

    public static j a(j jVar, Data data, Data data2, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            data = jVar.f152876a;
        }
        Data feeSettings = data;
        if ((i & 2) != 0) {
            data2 = jVar.f152877b;
        }
        Data purchaseSimulation = data2;
        int i2 = jVar.f152878c;
        if ((i & 8) != 0) {
            str = jVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = jVar.e;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
        Intrinsics.checkNotNullParameter(purchaseSimulation, "purchaseSimulation");
        return new j(feeSettings, purchaseSimulation, i2, str2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        boolean z = this.e;
        if (z || !(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f152876a, jVar.f152876a) && Intrinsics.f(this.f152877b, jVar.f152877b) && this.f152878c == jVar.f152878c && Intrinsics.f(this.d, jVar.d) && z == jVar.e;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f152878c, kii.e.c(this.f152877b, this.f152876a.hashCode() * 31, 31), 31);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
