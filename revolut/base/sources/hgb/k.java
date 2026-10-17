package hgb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f152145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do3.g f152146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152147c;

    public k() {
        this(0);
    }

    public static k a(k kVar, Data salaryHubData, do3.g gVar, boolean z, int i) {
        if ((i & 1) != 0) {
            salaryHubData = kVar.f152145a;
        }
        if ((i & 2) != 0) {
            gVar = kVar.f152146b;
        }
        if ((i & 4) != 0) {
            z = kVar.f152147c;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(salaryHubData, "salaryHubData");
        return new k(salaryHubData, gVar, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f152145a, kVar.f152145a) && this.f152146b == kVar.f152146b && this.f152147c == kVar.f152147c;
    }

    public final int hashCode() {
        int iHashCode = this.f152145a.hashCode() * 31;
        do3.g gVar = this.f152146b;
        return Boolean.hashCode(this.f152147c) + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }

    public k(Data salaryHubData, do3.g gVar, boolean z) {
        Intrinsics.checkNotNullParameter(salaryHubData, "salaryHubData");
        this.f152145a = salaryHubData;
        this.f152146b = gVar;
        this.f152147c = z;
    }

    public /* synthetic */ k(int i) {
        this(new Data(null, null, true, 3, null), null, false);
    }
}
