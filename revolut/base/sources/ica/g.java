package ica;

import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f160224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160226c;
    public final String d;
    public final dj0.d e;
    public final Instant f;

    public g(dj0.d amount, dj0.d originalAmount, String reference, String groupId, String payerName, Instant instant) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
        this.f160224a = amount;
        this.f160225b = reference;
        this.f160226c = groupId;
        this.d = payerName;
        this.e = originalAmount;
        this.f = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f160224a, gVar.f160224a) && Intrinsics.f(this.f160225b, gVar.f160225b) && Intrinsics.f(this.f160226c, gVar.f160226c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(p.a.c(p.a.c(this.f160224a.hashCode() * 31, 31, this.f160225b), 31, this.f160226c), 31, this.d), 31, this.e);
        Instant instant = this.f;
        return iC + (instant == null ? 0 : instant.hashCode());
    }
}
