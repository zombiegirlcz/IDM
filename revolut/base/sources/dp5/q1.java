package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@mlm.g
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116797c;
    public final long d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f116798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f116799h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f116800j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f116801l;

    public /* synthetic */ q1(int i, String str, String str2, String str3, long j2, String str4, long j3, Long l2, Long l3, Long l4, boolean z, String str5, String str6) {
        if (4095 != (i & 4095)) {
            qlm.j1.f(o1.f116790a.getDescriptor(), i, 4095);
            throw null;
        }
        this.f116795a = str;
        this.f116796b = str2;
        this.f116797c = str3;
        this.d = j2;
        this.e = str4;
        this.f = j3;
        this.f116798g = l2;
        this.f116799h = l3;
        this.i = l4;
        this.f116800j = z;
        this.k = str5;
        this.f116801l = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f116795a, q1Var.f116795a) && Intrinsics.f(this.f116796b, q1Var.f116796b) && Intrinsics.f(this.f116797c, q1Var.f116797c) && this.d == q1Var.d && Intrinsics.f(this.e, q1Var.e) && this.f == q1Var.f && Intrinsics.f(this.f116798g, q1Var.f116798g) && Intrinsics.f(this.f116799h, q1Var.f116799h) && Intrinsics.f(this.i, q1Var.i) && this.f116800j == q1Var.f116800j && Intrinsics.f(this.k, q1Var.k) && Intrinsics.f(this.f116801l, q1Var.f116801l);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(a0.d.c(p.a.c(p.a.c(this.f116795a.hashCode() * 31, 31, this.f116796b), 31, this.f116797c), 31, this.d), 31, this.e), 31, this.f);
        Long l2 = this.f116798g;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f116799h;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        int iC2 = j6.a.c((iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f116800j);
        String str = this.k;
        int iHashCode3 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f116801l;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public q1(String cryptoAddressId, String blockchain, String currency, long j2, String requestId, long j3, Long l2, Long l3, Long l4, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f116795a = cryptoAddressId;
        this.f116796b = blockchain;
        this.f116797c = currency;
        this.d = j2;
        this.e = requestId;
        this.f = j3;
        this.f116798g = l2;
        this.f116799h = l3;
        this.i = l4;
        this.f116800j = z;
        this.k = str;
        this.f116801l = str2;
    }
}
