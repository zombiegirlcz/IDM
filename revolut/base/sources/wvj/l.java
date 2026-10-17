package wvj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f300527h = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new wq1.a(21)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f300529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f300530c;
    public final String d;
    public final List e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f300531g;

    public /* synthetic */ l(int i, String str, Long l2, Long l3, String str2, List list, Boolean bool, long j2) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(j.f300526a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f300528a = str;
        this.f300529b = l2;
        this.f300530c = l3;
        this.d = str2;
        this.e = list;
        this.f = bool;
        this.f300531g = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f300528a, lVar.f300528a) && Intrinsics.f(this.f300529b, lVar.f300529b) && Intrinsics.f(this.f300530c, lVar.f300530c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f300531g == lVar.f300531g;
    }

    public final int hashCode() {
        int iHashCode = this.f300528a.hashCode() * 31;
        Long l2 = this.f300529b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f300530c;
        int iD = p.a.d(p.a.c((iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.d), 31, this.e);
        Boolean bool = this.f;
        return Long.hashCode(this.f300531g) + ((iD + (bool != null ? bool.hashCode() : 0)) * 31);
    }
}
