package n29;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o implements s {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f211483h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211486c;
    public final h d;
    public final v e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f211487g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f211483h = new Lazy[]{null, null, null, yhm.j.c(kVar, new n08.b(17)), null, yhm.j.c(kVar, new n08.b(18)), null};
    }

    public /* synthetic */ o(int i, String str, String str2, String str3, h hVar, v vVar, List list, String str4) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(m.f211482a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f211484a = str;
        this.f211485b = str2;
        this.f211486c = str3;
        this.d = hVar;
        this.e = vVar;
        this.f = list;
        this.f211487g = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f211484a, oVar.f211484a) && Intrinsics.f(this.f211485b, oVar.f211485b) && Intrinsics.f(this.f211486c, oVar.f211486c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f211487g, oVar.f211487g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f211484a.hashCode() * 31, 31, this.f211485b);
        String str = this.f211486c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.d;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        v vVar = this.e;
        return this.f211487g.hashCode() + p.a.d((iHashCode2 + (vVar != null ? vVar.hashCode() : 0)) * 31, 31, this.f);
    }

    public o(String header, String title, String str, h hVar, v vVar, ArrayList questions, String revealText) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(revealText, "revealText");
        this.f211484a = header;
        this.f211485b = title;
        this.f211486c = str;
        this.d = hVar;
        this.e = vVar;
        this.f = questions;
        this.f211487g = revealText;
    }
}
