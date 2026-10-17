package qfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245350c;
    public final String d;
    public final String e;

    public o(String id10, String type, String str, String str2, String topUpId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(topUpId, "topUpId");
        this.f245348a = id10;
        this.f245349b = type;
        this.f245350c = str;
        this.d = str2;
        this.e = topUpId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f245348a, oVar.f245348a) && Intrinsics.f(this.f245349b, oVar.f245349b) && Intrinsics.f(this.f245350c, oVar.f245350c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f245348a.hashCode() * 31, 31, this.f245349b);
        String str = this.f245350c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
