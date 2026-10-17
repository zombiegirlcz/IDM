package vlg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f290432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao3.a f290433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ilg.b f290434c;

    public e(l selectedTabType, ao3.a aVar, ilg.b addressFields) {
        Intrinsics.checkNotNullParameter(selectedTabType, "selectedTabType");
        Intrinsics.checkNotNullParameter(addressFields, "addressFields");
        this.f290432a = selectedTabType;
        this.f290433b = aVar;
        this.f290434c = addressFields;
    }

    public static e a(e eVar, l selectedTabType, ao3.a aVar, ilg.b addressFields, int i) {
        if ((i & 1) != 0) {
            selectedTabType = eVar.f290432a;
        }
        if ((i & 2) != 0) {
            aVar = eVar.f290433b;
        }
        if ((i & 4) != 0) {
            addressFields = eVar.f290434c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTabType, "selectedTabType");
        Intrinsics.checkNotNullParameter(addressFields, "addressFields");
        return new e(selectedTabType, aVar, addressFields);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f290432a == eVar.f290432a && Intrinsics.f(this.f290433b, eVar.f290433b) && Intrinsics.f(this.f290434c, eVar.f290434c);
    }

    public final int hashCode() {
        int iHashCode = this.f290432a.hashCode() * 31;
        ao3.a aVar = this.f290433b;
        return this.f290434c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
