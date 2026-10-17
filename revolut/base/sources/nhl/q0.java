package nhl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class q0 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f215552h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f215554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215555c;
    public final List d;
    public final String e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f215556g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f215552h = new Lazy[]{yhm.j.c(kVar, new s(5)), yhm.j.c(kVar, new s(6)), null, yhm.j.c(kVar, new s(7)), null, null, yhm.j.c(kVar, new s(8))};
    }

    public /* synthetic */ q0(int i, List list, List list2, String str, List list3, String str2, Integer num, List list4) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(o0.f215543a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f215553a = list;
        this.f215554b = list2;
        this.f215555c = str;
        this.d = list3;
        this.e = str2;
        this.f = num;
        this.f215556g = list4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f215553a, q0Var.f215553a) && Intrinsics.f(this.f215554b, q0Var.f215554b) && Intrinsics.f(this.f215555c, q0Var.f215555c) && Intrinsics.f(this.d, q0Var.d) && Intrinsics.f(this.e, q0Var.e) && Intrinsics.f(this.f, q0Var.f) && Intrinsics.f(this.f215556g, q0Var.f215556g);
    }

    public final int hashCode() {
        int iHashCode = this.f215553a.hashCode() * 31;
        List list = this.f215554b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f215555c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List list3 = this.f215556g;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public q0(ArrayList instrumentTypes, ArrayList arrayList, String str, ArrayList arrayList2, String str2, Integer num, ArrayList arrayList3) {
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        this.f215553a = instrumentTypes;
        this.f215554b = arrayList;
        this.f215555c = str;
        this.d = arrayList2;
        this.e = str2;
        this.f = num;
        this.f215556g = arrayList3;
    }
}
