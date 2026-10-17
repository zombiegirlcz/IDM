package pgb;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f235841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f235842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f235843c;

    public i() {
        this(0);
    }

    public static i a(i iVar, Data salaryHubData, List slotManagerItems, boolean z, int i) {
        if ((i & 1) != 0) {
            salaryHubData = iVar.f235841a;
        }
        if ((i & 2) != 0) {
            slotManagerItems = iVar.f235842b;
        }
        if ((i & 4) != 0) {
            z = iVar.f235843c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(salaryHubData, "salaryHubData");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        return new i(salaryHubData, slotManagerItems, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f235841a, iVar.f235841a) && Intrinsics.f(this.f235842b, iVar.f235842b) && this.f235843c == iVar.f235843c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f235843c) + p.a.d(this.f235841a.hashCode() * 31, 31, this.f235842b);
    }

    public i(Data salaryHubData, List slotManagerItems, boolean z) {
        Intrinsics.checkNotNullParameter(salaryHubData, "salaryHubData");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        this.f235841a = salaryHubData;
        this.f235842b = slotManagerItems;
        this.f235843c = z;
    }

    public i(int i) {
        this(new Data(null, null, true, 3, null), f0.f322471a, false);
    }
}
