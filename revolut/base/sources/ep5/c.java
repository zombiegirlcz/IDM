package ep5;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f128078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f128079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f128080c;
    public final jo3.a d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.a f128081g;

    public /* synthetic */ c(int i, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, jo3.a aVar4, String str, Long l2, jo3.a aVar5) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(a.f128077a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f128078a = aVar;
        this.f128079b = aVar2;
        this.f128080c = aVar3;
        this.d = aVar4;
        this.e = str;
        this.f = l2;
        this.f128081g = aVar5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f128078a, cVar.f128078a) && Intrinsics.f(this.f128079b, cVar.f128079b) && Intrinsics.f(this.f128080c, cVar.f128080c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f128081g, cVar.f128081g);
    }

    public final int hashCode() {
        int iJ = v7.j(this.d, v7.j(this.f128080c, v7.j(this.f128079b, this.f128078a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        jo3.a aVar = this.f128081g;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public c(jo3.a dailyWithdrawalLimit, jo3.a dailyWithdrawalUsage, jo3.a monthlyWithdrawalLimit, jo3.a monthlyWithdrawalUsage, String str, Long l2, jo3.a aVar) {
        Intrinsics.checkNotNullParameter(dailyWithdrawalLimit, "dailyWithdrawalLimit");
        Intrinsics.checkNotNullParameter(dailyWithdrawalUsage, "dailyWithdrawalUsage");
        Intrinsics.checkNotNullParameter(monthlyWithdrawalLimit, "monthlyWithdrawalLimit");
        Intrinsics.checkNotNullParameter(monthlyWithdrawalUsage, "monthlyWithdrawalUsage");
        this.f128078a = dailyWithdrawalLimit;
        this.f128079b = dailyWithdrawalUsage;
        this.f128080c = monthlyWithdrawalLimit;
        this.d = monthlyWithdrawalUsage;
        this.e = str;
        this.f = l2;
        this.f128081g = aVar;
    }
}
