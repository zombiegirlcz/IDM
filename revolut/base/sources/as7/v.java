package as7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f8870h = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ar0.b(15)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f8873c;
    public final p d;
    public final c e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8874g;

    public /* synthetic */ v(int i, String str, String str2, g gVar, p pVar, c cVar, c cVar2, String str3) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(t.f8869a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f8871a = str;
        this.f8872b = str2;
        this.f8873c = gVar;
        this.d = pVar;
        this.e = cVar;
        this.f = cVar2;
        this.f8874g = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f8871a, vVar.f8871a) && Intrinsics.f(this.f8872b, vVar.f8872b) && Intrinsics.f(this.f8873c, vVar.f8873c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f8874g, vVar.f8874g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f8871a.hashCode() * 31, 31, this.f8872b);
        g gVar = this.f8873c;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        p pVar = this.d;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        c cVar = this.e;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        String str = this.f8874g;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public v(String title, String description, g gVar, p pVar, c cVar, c cVar2, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f8871a = title;
        this.f8872b = description;
        this.f8873c = gVar;
        this.d = pVar;
        this.e = cVar;
        this.f = cVar2;
        this.f8874g = str;
    }
}
