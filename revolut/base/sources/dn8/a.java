package dn8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f116233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f116234c;
    public final Data d;
    public final Data e;

    public a(Data juniorProfiles, Data savingsRequests, Data user, Data juniorSavingProduct, String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
        Intrinsics.checkNotNullParameter(savingsRequests, "savingsRequests");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(juniorSavingProduct, "juniorSavingProduct");
        this.f116232a = requestId;
        this.f116233b = juniorProfiles;
        this.f116234c = savingsRequests;
        this.d = user;
        this.e = juniorSavingProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f116232a, aVar.f116232a) && Intrinsics.f(this.f116233b, aVar.f116233b) && Intrinsics.f(this.f116234c, aVar.f116234c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f116234c, kii.e.c(this.f116233b, this.f116232a.hashCode() * 31, 31), 31), 31);
    }
}
