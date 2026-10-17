package bvb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f18980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rub.j f18981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18982c;
    public final boolean d;
    public final boolean e;
    public final Data f;

    public e(Data pointsBuyingPackagesResponseContent, rub.j jVar, String idempotencyKey, boolean z, boolean z3, Data userCompany) {
        Intrinsics.checkNotNullParameter(pointsBuyingPackagesResponseContent, "pointsBuyingPackagesResponseContent");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f18980a = pointsBuyingPackagesResponseContent;
        this.f18981b = jVar;
        this.f18982c = idempotencyKey;
        this.d = z;
        this.e = z3;
        this.f = userCompany;
    }

    public static e a(e eVar, Data data, rub.j jVar, String str, boolean z, boolean z3, Data data2, int i) {
        if ((i & 1) != 0) {
            data = eVar.f18980a;
        }
        Data pointsBuyingPackagesResponseContent = data;
        if ((i & 2) != 0) {
            jVar = eVar.f18981b;
        }
        rub.j jVar2 = jVar;
        if ((i & 4) != 0) {
            str = eVar.f18982c;
        }
        String idempotencyKey = str;
        if ((i & 8) != 0) {
            z = eVar.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z3 = eVar.e;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            data2 = eVar.f;
        }
        Data userCompany = data2;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pointsBuyingPackagesResponseContent, "pointsBuyingPackagesResponseContent");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        return new e(pointsBuyingPackagesResponseContent, jVar2, idempotencyKey, z4, z6, userCompany);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f18980a, eVar.f18980a) && Intrinsics.f(this.f18981b, eVar.f18981b) && Intrinsics.f(this.f18982c, eVar.f18982c) && this.d == eVar.d && this.e == eVar.e && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f18980a.hashCode() * 31;
        rub.j jVar = this.f18981b;
        return this.f.hashCode() + j6.a.c(j6.a.c(p.a.c((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.f18982c), 31, this.d), 31, this.e);
    }
}
