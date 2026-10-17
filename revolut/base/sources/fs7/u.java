package fs7;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137649c;
    public final t d;
    public final h e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f137650g;

    public /* synthetic */ u(int i, String str, String str2, String str3, t tVar, h hVar, e eVar, m mVar) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(a.f137615a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f137647a = str;
        this.f137648b = str2;
        this.f137649c = str3;
        this.d = tVar;
        this.e = hVar;
        this.f = eVar;
        this.f137650g = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f137647a, uVar.f137647a) && Intrinsics.f(this.f137648b, uVar.f137648b) && Intrinsics.f(this.f137649c, uVar.f137649c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && Intrinsics.f(this.f, uVar.f) && Intrinsics.f(this.f137650g, uVar.f137650g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f137647a.hashCode() * 31, 31, this.f137648b);
        String str = this.f137649c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.d;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.f137645a.hashCode())) * 31;
        h hVar = this.e;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        e eVar = this.f;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.f137621a.hashCode())) * 31;
        m mVar = this.f137650g;
        return iHashCode4 + (mVar != null ? mVar.hashCode() : 0);
    }

    public u(String id10, String title, String str, t tVar, h hVar, e eVar, m mVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f137647a = id10;
        this.f137648b = title;
        this.f137649c = str;
        this.d = tVar;
        this.e = hVar;
        this.f = eVar;
        this.f137650g = mVar;
    }
}
