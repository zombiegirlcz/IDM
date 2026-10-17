package dp5;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f116738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f116739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f116740c;
    public final jo3.a d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.a f116741g;

    public /* synthetic */ d0(int i, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, jo3.a aVar4, String str, Long l2, jo3.a aVar5) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(b0.f116727a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f116738a = aVar;
        this.f116739b = aVar2;
        this.f116740c = aVar3;
        this.d = aVar4;
        this.e = str;
        this.f = l2;
        this.f116741g = aVar5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f116738a, d0Var.f116738a) && Intrinsics.f(this.f116739b, d0Var.f116739b) && Intrinsics.f(this.f116740c, d0Var.f116740c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f116741g, d0Var.f116741g);
    }

    public final int hashCode() {
        int iJ = v7.j(this.d, v7.j(this.f116740c, v7.j(this.f116739b, this.f116738a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        jo3.a aVar = this.f116741g;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
