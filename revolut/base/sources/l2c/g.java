package l2c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f191743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f191744c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(0, null, 0 == true ? 1 : 0, 63);
    }

    public static g a(g gVar, int i, j jVar, Data data, Data data2, Data data3, Data data4, int i2) {
        if ((i2 & 1) != 0) {
            i = gVar.f191742a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            jVar = gVar.f191743b;
        }
        j selectedMultiplier = jVar;
        if ((i2 & 4) != 0) {
            data = gVar.f191744c;
        }
        Data autoInvests = data;
        if ((i2 & 8) != 0) {
            data2 = gVar.d;
        }
        Data calculations = data2;
        if ((i2 & 16) != 0) {
            data3 = gVar.e;
        }
        Data revPointsCardSpendRate = data3;
        if ((i2 & 32) != 0) {
            data4 = gVar.f;
        }
        Data userCompany = data4;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(revPointsCardSpendRate, "revPointsCardSpendRate");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        return new g(i3, selectedMultiplier, autoInvests, calculations, revPointsCardSpendRate, userCompany);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f191742a == gVar.f191742a && Intrinsics.f(this.f191743b, gVar.f191743b) && Intrinsics.f(this.f191744c, gVar.f191744c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f191744c, (this.f191743b.hashCode() + (Integer.hashCode(this.f191742a) * 31)) * 31, 31), 31), 31);
    }

    public g(int i, j selectedMultiplier, Data autoInvests, Data calculations, Data revPointsCardSpendRate, Data userCompany) {
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(revPointsCardSpendRate, "revPointsCardSpendRate");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f191742a = i;
        this.f191743b = selectedMultiplier;
        this.f191744c = autoInvests;
        this.d = calculations;
        this.e = revPointsCardSpendRate;
        this.f = userCompany;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(int i, j jVar, Data data, int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : i;
        this(i3, (i2 & 2) != 0 ? new h(i3) : jVar, (i2 & 4) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
