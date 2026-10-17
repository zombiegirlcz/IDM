package gca;

import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f142375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f142377c;
    public final dj0.d d;
    public final dj0.d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f142378g;

    public f(dj0.d amount, String payerName, String groupId, dj0.d limit, dj0.d pocketBalance, String reference, Instant until) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(until, "until");
        this.f142375a = amount;
        this.f142376b = payerName;
        this.f142377c = groupId;
        this.d = limit;
        this.e = pocketBalance;
        this.f = reference;
        this.f142378g = until;
    }

    public static f a(f fVar, dj0.d dVar, dj0.d dVar2, String str, int i) {
        if ((i & 1) != 0) {
            dVar = fVar.f142375a;
        }
        dj0.d amount = dVar;
        String payerName = fVar.f142376b;
        String groupId = fVar.f142377c;
        dj0.d limit = fVar.d;
        if ((i & 16) != 0) {
            dVar2 = fVar.e;
        }
        dj0.d pocketBalance = dVar2;
        if ((i & 32) != 0) {
            str = fVar.f;
        }
        String reference = str;
        Instant until = fVar.f142378g;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(until, "until");
        return new f(amount, payerName, groupId, limit, pocketBalance, reference, until);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f142375a, fVar.f142375a) && Intrinsics.f(this.f142376b, fVar.f142376b) && Intrinsics.f(this.f142377c, fVar.f142377c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f142378g, fVar.f142378g);
    }

    public final int hashCode() {
        return this.f142378g.hashCode() + p.a.c(v7.c(v7.c(p.a.c(p.a.c(this.f142375a.hashCode() * 31, 31, this.f142376b), 31, this.f142377c), 31, this.d), 31, this.e), 31, this.f);
    }
}
