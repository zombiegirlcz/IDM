package com.revolut.feature.freelancer.impl.network.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/n0;", "", "", "toString", "()Ljava/lang/String;", "", "Lcom/revolut/feature/freelancer/impl/network/models/o0;", "a", "Ljava/util/List;", "getTransactions", "()Ljava/util/List;", "transactions", "b", "Ljava/lang/String;", "getDescription", "description", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactions")
    @NotNull
    private final List<o0> transactions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    public n0(String description, ArrayList transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(description, "description");
        this.transactions = transactions;
        this.description = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.transactions, n0Var.transactions) && Intrinsics.f(this.description, n0Var.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.transactions.hashCode() * 31);
    }
}
