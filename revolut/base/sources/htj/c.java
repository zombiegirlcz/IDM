package htj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f155397h = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ht1.e(1)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155400c;
    public final boolean d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f155401g;

    public /* synthetic */ c(int i, String str, String str2, String str3, boolean z, List list, String str4, f0 f0Var) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(a.f155393a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f155398a = str;
        this.f155399b = str2;
        this.f155400c = str3;
        this.d = z;
        this.e = list;
        this.f = str4;
        this.f155401g = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f155398a, cVar.f155398a) && Intrinsics.f(this.f155399b, cVar.f155399b) && Intrinsics.f(this.f155400c, cVar.f155400c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f155401g, cVar.f155401g);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(p.a.c(p.a.c(this.f155398a.hashCode() * 31, 31, this.f155399b), 31, this.f155400c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        f0 f0Var = this.f155401g;
        return iHashCode + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public c(String walletId, String baseTransactionId, String type, boolean z, ArrayList destinations, String str, f0 f0Var) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(baseTransactionId, "baseTransactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        this.f155398a = walletId;
        this.f155399b = baseTransactionId;
        this.f155400c = type;
        this.d = z;
        this.e = destinations;
        this.f = str;
        this.f155401g = f0Var;
    }
}
