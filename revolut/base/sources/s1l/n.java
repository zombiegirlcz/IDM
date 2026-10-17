package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259195c;
    public final String d;
    public final String e;
    public final q f;

    public /* synthetic */ n(int i, String str, String str2, String str3, String str4, String str5, q qVar) {
        if (15 != (i & 15)) {
            j1.f(l.f259188a.getDescriptor(), i, 15);
            throw null;
        }
        this.f259193a = str;
        this.f259194b = str2;
        this.f259195c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = qVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f259193a, nVar.f259193a) && Intrinsics.f(this.f259194b, nVar.f259194b) && Intrinsics.f(this.f259195c, nVar.f259195c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f259193a.hashCode() * 31, 31, this.f259194b), 31, this.f259195c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        q qVar = this.f;
        return iHashCode + (qVar != null ? qVar.f259201a.hashCode() : 0);
    }

    public n(String backgroundImageUrl, String partnerName, String tier, String partnerIconUrl, String str, q qVar) {
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.checkNotNullParameter(partnerName, "partnerName");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(partnerIconUrl, "partnerIconUrl");
        this.f259193a = backgroundImageUrl;
        this.f259194b = partnerName;
        this.f259195c = tier;
        this.d = partnerIconUrl;
        this.e = str;
        this.f = qVar;
    }
}
