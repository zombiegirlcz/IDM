package gyl;

import hyl.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f147915j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f147916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147918c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f147919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f147920h;
    public final List i;

    static {
        k kVar = k.PUBLICATION;
        f147915j = new Lazy[]{j.c(kVar, new gx2.a(1)), j.c(kVar, new gx2.a(2)), j.c(kVar, new gx2.a(3)), null, null, null, null, null, j.c(kVar, new gx2.a(4))};
    }

    public c(int i, l lVar, List list, List list2, boolean z, boolean z3, String str, Integer num, boolean z4, List list3) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(a.f147914a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f147916a = lVar;
        this.f147917b = list;
        this.f147918c = list2;
        this.d = z;
        this.e = z3;
        this.f = str;
        this.f147919g = num;
        if ((i & 128) == 0) {
            this.f147920h = false;
        } else {
            this.f147920h = z4;
        }
        if ((i & 256) == 0) {
            this.i = f0.f322471a;
        } else {
            this.i = list3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f147916a == cVar.f147916a && Intrinsics.f(this.f147917b, cVar.f147917b) && Intrinsics.f(this.f147918c, cVar.f147918c) && this.d == cVar.d && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f147919g, cVar.f147919g) && this.f147920h == cVar.f147920h && Intrinsics.f(this.i, cVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.d(p.a.d(this.f147916a.hashCode() * 31, 31, this.f147917b), 31, this.f147918c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f147919g;
        return this.i.hashCode() + j6.a.c((iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f147920h);
    }

    public c(l quality, List activeCountries, ArrayList markers, String str, List edgeFade) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(activeCountries, "activeCountries");
        Intrinsics.checkNotNullParameter(markers, "markers");
        Intrinsics.checkNotNullParameter(edgeFade, "edgeFade");
        this.f147916a = quality;
        this.f147917b = activeCountries;
        this.f147918c = markers;
        this.d = true;
        this.e = false;
        this.f = str;
        this.f147919g = null;
        this.f147920h = false;
        this.i = edgeFade;
    }
}
