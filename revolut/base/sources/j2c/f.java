package j2c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f170806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f170807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f170808c;
    public final Data d;
    public final Data e;

    public f() {
        this(0);
    }

    public static f a(f fVar, int i, l lVar, Data data, Data data2, Data data3, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f170806a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            lVar = fVar.f170807b;
        }
        l selectedMultiplier = lVar;
        if ((i2 & 4) != 0) {
            data = fVar.f170808c;
        }
        Data autoInvests = data;
        if ((i2 & 8) != 0) {
            data2 = fVar.d;
        }
        Data calculations = data2;
        if ((i2 & 16) != 0) {
            data3 = fVar.e;
        }
        Data userCompany = data3;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        return new f(i3, selectedMultiplier, autoInvests, calculations, userCompany);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f170806a == fVar.f170806a && Intrinsics.f(this.f170807b, fVar.f170807b) && Intrinsics.f(this.f170808c, fVar.f170808c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f170808c, (this.f170807b.hashCode() + (Integer.hashCode(this.f170806a) * 31)) * 31, 31), 31);
    }

    public f(int i, l selectedMultiplier, Data autoInvests, Data calculations, Data userCompany) {
        Intrinsics.checkNotNullParameter(selectedMultiplier, "selectedMultiplier");
        Intrinsics.checkNotNullParameter(autoInvests, "autoInvests");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f170806a = i;
        this.f170807b = selectedMultiplier;
        this.f170808c = autoInvests;
        this.d = calculations;
        this.e = userCompany;
    }

    public /* synthetic */ f(int i) {
        this(1, new k(1), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
