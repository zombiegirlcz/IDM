package cea;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f23442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f23443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f23444c;

    public f(io3.d pocket, Data linkedAccountDetailsData, Data externalInstitutionStatus) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(linkedAccountDetailsData, "linkedAccountDetailsData");
        Intrinsics.checkNotNullParameter(externalInstitutionStatus, "externalInstitutionStatus");
        this.f23442a = pocket;
        this.f23443b = linkedAccountDetailsData;
        this.f23444c = externalInstitutionStatus;
    }

    public static f a(f fVar, Data linkedAccountDetailsData, Data externalInstitutionStatus, int i) {
        io3.d pocket = fVar.f23442a;
        if ((i & 2) != 0) {
            linkedAccountDetailsData = fVar.f23443b;
        }
        if ((i & 4) != 0) {
            externalInstitutionStatus = fVar.f23444c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(linkedAccountDetailsData, "linkedAccountDetailsData");
        Intrinsics.checkNotNullParameter(externalInstitutionStatus, "externalInstitutionStatus");
        return new f(pocket, linkedAccountDetailsData, externalInstitutionStatus);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f23442a, fVar.f23442a) && Intrinsics.f(this.f23443b, fVar.f23443b) && Intrinsics.f(this.f23444c, fVar.f23444c);
    }

    public final int hashCode() {
        return this.f23444c.hashCode() + kii.e.c(this.f23443b, this.f23442a.hashCode() * 31, 31);
    }
}
