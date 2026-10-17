package ta8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f269160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f269161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f269162c;
    public final String d;

    public i(Data taxResidenciesData, String updatedDocumentNumber, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(taxResidenciesData, "taxResidenciesData");
        Intrinsics.checkNotNullParameter(updatedDocumentNumber, "updatedDocumentNumber");
        this.f269160a = taxResidenciesData;
        this.f269161b = z;
        this.f269162c = z3;
        this.d = updatedDocumentNumber;
    }

    public static i a(i iVar, Data taxResidenciesData, boolean z, boolean z3, String updatedDocumentNumber, int i) {
        if ((i & 1) != 0) {
            taxResidenciesData = iVar.f269160a;
        }
        if ((i & 2) != 0) {
            z = iVar.f269161b;
        }
        if ((i & 4) != 0) {
            z3 = iVar.f269162c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(taxResidenciesData, "taxResidenciesData");
        Intrinsics.checkNotNullParameter(updatedDocumentNumber, "updatedDocumentNumber");
        return new i(taxResidenciesData, updatedDocumentNumber, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f269160a, iVar.f269160a) && this.f269161b == iVar.f269161b && this.f269162c == iVar.f269162c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f269160a.hashCode() * 31, 31, this.f269161b), 31, this.f269162c);
    }
}
