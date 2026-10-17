package gwi;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f147544h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147547c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f147548g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f147544h = new Lazy[]{yhm.j.c(kVar, new gvi.b(11)), yhm.j.c(kVar, new gvi.b(12)), yhm.j.c(kVar, new gvi.b(13)), yhm.j.c(kVar, new gvi.b(14)), yhm.j.c(kVar, new gvi.b(15)), yhm.j.c(kVar, new gvi.b(16)), yhm.j.c(kVar, new gvi.b(17))};
    }

    public /* synthetic */ w(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(u.f147527a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f147545a = list;
        this.f147546b = list2;
        this.f147547c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.f147548g = list7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f147545a, wVar.f147545a) && Intrinsics.f(this.f147546b, wVar.f147546b) && Intrinsics.f(this.f147547c, wVar.f147547c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f) && Intrinsics.f(this.f147548g, wVar.f147548g);
    }

    public final int hashCode() {
        List list = this.f147545a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f147546b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f147547c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List list7 = this.f147548g;
        return iHashCode6 + (list7 != null ? list7.hashCode() : 0);
    }
}
