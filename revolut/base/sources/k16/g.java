package k16;

import java.time.Instant;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f180109h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180112c;
    public final List d;
    public final List e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f180113g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f180109h = new Lazy[]{null, null, null, yhm.j.c(kVar, new jxi.a(29)), yhm.j.c(kVar, new d(0)), null, null};
    }

    public /* synthetic */ g(int i, String str, String str2, String str3, List list, List list2, Instant instant, Instant instant2) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(e.f180108a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f180110a = str;
        this.f180111b = str2;
        this.f180112c = str3;
        this.d = list;
        this.e = list2;
        this.f = instant;
        this.f180113g = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f180110a, gVar.f180110a) && Intrinsics.f(this.f180111b, gVar.f180111b) && Intrinsics.f(this.f180112c, gVar.f180112c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f180113g, gVar.f180113g);
    }

    public final int hashCode() {
        return this.f180113g.hashCode() + r6.b.c(p.a.d(p.a.d(p.a.c(p.a.c(this.f180110a.hashCode() * 31, 31, this.f180111b), 31, this.f180112c), 31, this.d), 31, this.e), 31, this.f);
    }
}
