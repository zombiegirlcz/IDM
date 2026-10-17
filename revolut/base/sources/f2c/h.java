package f2c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f131498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f131499c;
    public final Data d;
    public final Data e;

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(0, null, 0 == true ? 1 : 0, 31);
    }

    public static h a(h hVar, int i, k kVar, Data data, Data data2, Data data3, int i2) {
        if ((i2 & 1) != 0) {
            i = hVar.f131497a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            kVar = hVar.f131498b;
        }
        k selectedMultiplier = kVar;
        if ((i2 & 4) != 0) {
            data = hVar.f131499c;
        }
        Data autoInvests = data;
        if ((i2 & 8) != 0) {
            data2 = hVar.d;
        }
        Data calculations = data2;
        if ((i2 & 16) != 0) {
            data3 = hVar.e;
        }
        Data userCompany = data3;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        return new h(i3, selectedMultiplier, autoInvests, calculations, userCompany);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f131497a == hVar.f131497a && Intrinsics.f(this.f131498b, hVar.f131498b) && Intrinsics.f(this.f131499c, hVar.f131499c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f131499c, (this.f131498b.hashCode() + (Integer.hashCode(this.f131497a) * 31)) * 31, 31), 31);
    }

    public h(int i, k selectedMultiplier, Data autoInvests, Data calculations, Data userCompany) {
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f131497a = i;
        this.f131498b = selectedMultiplier;
        this.f131499c = autoInvests;
        this.d = calculations;
        this.e = userCompany;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h(int i, k kVar, Data data, int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : i;
        this(i3, (i2 & 2) != 0 ? new i(i3) : kVar, (i2 & 4) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
