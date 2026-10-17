package h2c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f148774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f148775c;
    public final Data d;
    public final Data e;

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(0, null, 0 == true ? 1 : 0, 31);
    }

    public static i a(i iVar, int i, l lVar, Data data, Data data2, Data data3, int i2) {
        if ((i2 & 1) != 0) {
            i = iVar.f148773a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            lVar = iVar.f148774b;
        }
        l selectedMultiplier = lVar;
        if ((i2 & 4) != 0) {
            data = iVar.f148775c;
        }
        Data autoInvests = data;
        if ((i2 & 8) != 0) {
            data2 = iVar.d;
        }
        Data calculations = data2;
        if ((i2 & 16) != 0) {
            data3 = iVar.e;
        }
        Data userCompany = data3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        return new i(i3, selectedMultiplier, autoInvests, calculations, userCompany);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f148773a == iVar.f148773a && Intrinsics.f(this.f148774b, iVar.f148774b) && Intrinsics.f(this.f148775c, iVar.f148775c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f148775c, (this.f148774b.hashCode() + (Integer.hashCode(this.f148773a) * 31)) * 31, 31), 31);
    }

    public i(int i, l selectedMultiplier, Data autoInvests, Data calculations, Data userCompany) {
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f148773a = i;
        this.f148774b = selectedMultiplier;
        this.f148775c = autoInvests;
        this.d = calculations;
        this.e = userCompany;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(int i, l lVar, Data data, int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : i;
        this(i3, (i2 & 2) != 0 ? new j(i3) : lVar, (i2 & 4) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
