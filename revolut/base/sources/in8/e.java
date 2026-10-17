package in8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f162690c;
    public final Long d;
    public final Double e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f162691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f162692h;
    public final f i;

    public e(String type, String str, Long l2, Long l3, Double d, Boolean bool, Long l4, Long l5, f fVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f162688a = type;
        this.f162689b = str;
        this.f162690c = l2;
        this.d = l3;
        this.e = d;
        this.f = bool;
        this.f162691g = l4;
        this.f162692h = l5;
        this.i = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f162688a, eVar.f162688a) && Intrinsics.f(this.f162689b, eVar.f162689b) && Intrinsics.f(this.f162690c, eVar.f162690c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f162691g, eVar.f162691g) && Intrinsics.f(this.f162692h, eVar.f162692h) && this.i == eVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f162688a.hashCode() * 31;
        String str = this.f162689b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f162690c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d = this.e;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l4 = this.f162691g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f162692h;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        f fVar = this.i;
        return iHashCode8 + (fVar != null ? fVar.hashCode() : 0);
    }
}
