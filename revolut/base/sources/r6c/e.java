package r6c;

import kotlin.jvm.internal.Intrinsics;
import q6c.n;
import u6c.k;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f251659c;
    public final n d;
    public final d e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f251660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f251661h;

    public e(String orderToken, String paymentToken, String paymentId, n paymentState, d dVar, b bVar, k kVar, String str) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        this.f251657a = orderToken;
        this.f251658b = paymentToken;
        this.f251659c = paymentId;
        this.d = paymentState;
        this.e = dVar;
        this.f = bVar;
        this.f251660g = kVar;
        this.f251661h = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f251657a, eVar.f251657a) && Intrinsics.f(this.f251658b, eVar.f251658b) && Intrinsics.f(this.f251659c, eVar.f251659c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && this.f251660g == eVar.f251660g && Intrinsics.f(this.f251661h, eVar.f251661h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f251657a.hashCode() * 31, 31, this.f251658b), 31, this.f251659c)) * 31;
        d dVar = this.e;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.f;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        k kVar = this.f251660g;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.f251661h;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
