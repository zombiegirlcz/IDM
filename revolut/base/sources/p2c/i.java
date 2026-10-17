package p2c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f232211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f232212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f232213c;
    public final Data d;
    public final Data e;
    public final Data f;

    public i() {
        this(0, null, false, null, 63);
    }

    public static i a(i iVar, int i, l lVar, Data data, Data data2, Data data3, int i2) {
        if ((i2 & 1) != 0) {
            i = iVar.f232211a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            lVar = iVar.f232212b;
        }
        l selectedMultiplier = lVar;
        boolean z = iVar.f232213c;
        if ((i2 & 8) != 0) {
            data = iVar.d;
        }
        Data autoInvests = data;
        if ((i2 & 16) != 0) {
            data2 = iVar.e;
        }
        Data calculations = data2;
        if ((i2 & 32) != 0) {
            data3 = iVar.f;
        }
        Data userCompany = data3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        return new i(i3, selectedMultiplier, z, autoInvests, calculations, userCompany);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f232211a == iVar.f232211a && Intrinsics.f(this.f232212b, iVar.f232212b) && this.f232213c == iVar.f232213c && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, j6.a.c((this.f232212b.hashCode() + (Integer.hashCode(this.f232211a) * 31)) * 31, 31, this.f232213c), 31), 31);
    }

    public i(int i, l selectedMultiplier, boolean z, Data autoInvests, Data calculations, Data userCompany) {
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f232211a = i;
        this.f232212b = selectedMultiplier;
        this.f232213c = z;
        this.d = autoInvests;
        this.e = calculations;
        this.f = userCompany;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(int i, j jVar, boolean z, Data data, int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : i;
        this(i3, (i2 & 2) != 0 ? new j(i3) : jVar, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
