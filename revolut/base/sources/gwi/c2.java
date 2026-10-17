package gwi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class c2 {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f147362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f147363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147364c;
    public final jo3.a d;
    public final jo3.a e;
    public final jo3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f147365g;

    public /* synthetic */ c2(int i, jo3.a aVar, jo3.a aVar2, String str, jo3.a aVar3, jo3.a aVar4, jo3.a aVar5, w1 w1Var) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(a2.f147335a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f147362a = aVar;
        this.f147363b = aVar2;
        this.f147364c = str;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
        this.f147365g = w1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f147362a, c2Var.f147362a) && Intrinsics.f(this.f147363b, c2Var.f147363b) && Intrinsics.f(this.f147364c, c2Var.f147364c) && Intrinsics.f(this.d, c2Var.d) && Intrinsics.f(this.e, c2Var.e) && Intrinsics.f(this.f, c2Var.f) && Intrinsics.f(this.f147365g, c2Var.f147365g);
    }

    public final int hashCode() {
        jo3.a aVar = this.f147362a;
        int iJ = v7.j(this.f147363b, (aVar == null ? 0 : aVar.hashCode()) * 31, 31);
        String str = this.f147364c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        jo3.a aVar2 = this.d;
        int iJ2 = v7.j(this.e, (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31);
        jo3.a aVar3 = this.f;
        int iHashCode2 = (iJ2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        w1 w1Var = this.f147365g;
        return iHashCode2 + (w1Var != null ? w1Var.hashCode() : 0);
    }

    public c2(jo3.a aVar, jo3.a finalPrice, String str, jo3.a aVar2, jo3.a passPrice, jo3.a aVar3, w1 w1Var) {
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        this.f147362a = aVar;
        this.f147363b = finalPrice;
        this.f147364c = str;
        this.d = aVar2;
        this.e = passPrice;
        this.f = aVar3;
        this.f147365g = w1Var;
    }
}
