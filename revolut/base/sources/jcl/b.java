package jcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Ljcl/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "redeemable", "b", "d", "redeemableWithFee", "locked", "", "Ljcl/c;", "Ljava/util/List;", "e", "()Ljava/util/List;", "seriesHoldings", "Ljcl/c;", "()Ljcl/c;", "mainHolding", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("redeemable")
    @NotNull
    private final String redeemable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("redeemableWithFee")
    @NotNull
    private final String redeemableWithFee;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("locked")
    @NotNull
    private final String locked;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("seriesHoldings")
    private final List<c> seriesHoldings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("mainHolding")
    private final c mainHolding;

    public b(String redeemable, String redeemableWithFee, String locked, ArrayList arrayList, c cVar) {
        Intrinsics.checkNotNullParameter(redeemable, "redeemable");
        Intrinsics.checkNotNullParameter(redeemableWithFee, "redeemableWithFee");
        Intrinsics.checkNotNullParameter(locked, "locked");
        this.redeemable = redeemable;
        this.redeemableWithFee = redeemableWithFee;
        this.locked = locked;
        this.seriesHoldings = arrayList;
        this.mainHolding = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLocked() {
        return this.locked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getMainHolding() {
        return this.mainHolding;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRedeemable() {
        return this.redeemable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRedeemableWithFee() {
        return this.redeemableWithFee;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getSeriesHoldings() {
        return this.seriesHoldings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.redeemable, bVar.redeemable) && Intrinsics.f(this.redeemableWithFee, bVar.redeemableWithFee) && Intrinsics.f(this.locked, bVar.locked) && Intrinsics.f(this.seriesHoldings, bVar.seriesHoldings) && Intrinsics.f(this.mainHolding, bVar.mainHolding);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.redeemable.hashCode() * 31, 31, this.redeemableWithFee), 31, this.locked);
        List<c> list = this.seriesHoldings;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.mainHolding;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
