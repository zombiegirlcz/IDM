package htj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f155435h = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ht1.e(4)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155438c;
    public final String d;
    public final long e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f155439g;

    public /* synthetic */ r(int i, String str, String str2, String str3, String str4, long j2, List list, o oVar) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(p.f155434a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f155436a = str;
        this.f155437b = str2;
        this.f155438c = str3;
        this.d = str4;
        this.e = j2;
        this.f = list;
        this.f155439g = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f155436a, rVar.f155436a) && Intrinsics.f(this.f155437b, rVar.f155437b) && Intrinsics.f(this.f155438c, rVar.f155438c) && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f155439g, rVar.f155439g);
    }

    public final int hashCode() {
        int iD = p.a.d(a0.d.c(p.a.c(p.a.c(p.a.c(this.f155436a.hashCode() * 31, 31, this.f155437b), 31, this.f155438c), 31, this.d), 31, this.e), 31, this.f);
        o oVar = this.f155439g;
        return iD + (oVar == null ? 0 : oVar.hashCode());
    }
}
