package z27;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f318978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds6.j f318979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f318980c;

    public f(Data taxInfo, ds6.j taxType, boolean z) {
        Intrinsics.checkNotNullParameter(taxInfo, "taxInfo");
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        this.f318978a = taxInfo;
        this.f318979b = taxType;
        this.f318980c = z;
    }

    public static f a(f fVar, Data taxInfo, boolean z, int i) {
        if ((i & 1) != 0) {
            taxInfo = fVar.f318978a;
        }
        ds6.j taxType = fVar.f318979b;
        if ((i & 4) != 0) {
            z = fVar.f318980c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(taxInfo, "taxInfo");
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        return new f(taxInfo, taxType, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f318978a, fVar.f318978a) && this.f318979b == fVar.f318979b && this.f318980c == fVar.f318980c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f318980c) + ((this.f318979b.hashCode() + (this.f318978a.hashCode() * 31)) * 31);
    }
}
