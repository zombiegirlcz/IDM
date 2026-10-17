package j6a;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f171700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f171702c;
    public final xi0.b d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f171703g;

    public g() {
        this(false, CertificateBody.profileType);
    }

    public static g a(g gVar, Data data, String str, wi0.b bVar, xi0.b bVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            data = gVar.f171700a;
        }
        Data accountDetails = data;
        if ((i & 2) != 0) {
            str = gVar.f171701b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            bVar = gVar.f171702c;
        }
        wi0.b bVar3 = bVar;
        if ((i & 8) != 0) {
            bVar2 = gVar.d;
        }
        xi0.b bVar4 = bVar2;
        boolean z3 = (i & 16) != 0 ? gVar.e : true;
        if ((i & 32) != 0) {
            z = gVar.f;
        }
        boolean z4 = gVar.f171703g;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        return new g(accountDetails, str2, bVar3, bVar4, z3, z, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f171700a, gVar.f171700a) && Intrinsics.f(this.f171701b, gVar.f171701b) && Intrinsics.f(this.f171702c, gVar.f171702c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && this.f171703g == gVar.f171703g;
    }

    public final int hashCode() {
        int iHashCode = this.f171700a.hashCode() * 31;
        String str = this.f171701b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        wi0.b bVar = this.f171702c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        xi0.b bVar2 = this.d;
        return Boolean.hashCode(this.f171703g) + j6.a.c(j6.a.c((iHashCode3 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public g(Data accountDetails, String str, wi0.b bVar, xi0.b bVar2, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        this.f171700a = accountDetails;
        this.f171701b = str;
        this.f171702c = bVar;
        this.d = bVar2;
        this.e = z;
        this.f = z3;
        this.f171703g = z4;
    }

    public /* synthetic */ g(boolean z, int i) {
        this(new Data(null, null, true, 3, null), null, null, null, false, false, (i & 64) != 0 ? false : z);
    }
}
