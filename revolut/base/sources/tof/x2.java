package tof;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273157c;
    public final Instant d;
    public final Instant e;

    public x2(String invoiceId, String subscriptionId, String serviceProviderName, Instant instant, Instant instant2) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(serviceProviderName, "serviceProviderName");
        this.f273155a = invoiceId;
        this.f273156b = subscriptionId;
        this.f273157c = serviceProviderName;
        this.d = instant;
        this.e = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return Intrinsics.f(this.f273155a, x2Var.f273155a) && Intrinsics.f(this.f273156b, x2Var.f273156b) && Intrinsics.f(this.f273157c, x2Var.f273157c) && Intrinsics.f(this.d, x2Var.d) && Intrinsics.f(this.e, x2Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f273155a.hashCode() * 31, 31, this.f273156b), 31, this.f273157c);
        Instant instant = this.d;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.e;
        return iHashCode + (instant2 != null ? instant2.hashCode() : 0);
    }
}
