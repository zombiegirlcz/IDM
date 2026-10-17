package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkfj/c5;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "newSubscription", "c", "topUpSubscription", "esimNotInstalled", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isTopUp", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("newSubscription")
    @NotNull
    private final String newSubscription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("topUpSubscription")
    @NotNull
    private final String topUpSubscription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("esimNotInstalled")
    @NotNull
    private final String esimNotInstalled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("isTopUp")
    private final Boolean isTopUp;

    public c5(String newSubscription, String topUpSubscription, String esimNotInstalled, Boolean bool) {
        Intrinsics.checkNotNullParameter(newSubscription, "newSubscription");
        Intrinsics.checkNotNullParameter(topUpSubscription, "topUpSubscription");
        Intrinsics.checkNotNullParameter(esimNotInstalled, "esimNotInstalled");
        this.newSubscription = newSubscription;
        this.topUpSubscription = topUpSubscription;
        this.esimNotInstalled = esimNotInstalled;
        this.isTopUp = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEsimNotInstalled() {
        return this.esimNotInstalled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNewSubscription() {
        return this.newSubscription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTopUpSubscription() {
        return this.topUpSubscription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getIsTopUp() {
        return this.isTopUp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj2;
        return Intrinsics.f(this.newSubscription, c5Var.newSubscription) && Intrinsics.f(this.topUpSubscription, c5Var.topUpSubscription) && Intrinsics.f(this.esimNotInstalled, c5Var.esimNotInstalled) && Intrinsics.f(this.isTopUp, c5Var.isTopUp);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.newSubscription.hashCode() * 31, 31, this.topUpSubscription), 31, this.esimNotInstalled);
        Boolean bool = this.isTopUp;
        return iC + (bool == null ? 0 : bool.hashCode());
    }
}
