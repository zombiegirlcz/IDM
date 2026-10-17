package auc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lauc/b1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "", "b", "Z", "c", "()Z", "enabled", "currency", "Lauc/b1$a;", "d", "Lauc/b1$a;", "()Lauc/b1$a;", "dailyAllowance", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "minimumAmount", "Lauc/t0;", "f", "Lauc/t0;", "()Lauc/t0;", "suggestedAmount", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dailyAllowance")
    private final a dailyAllowance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("minimumAmount")
    private final Long minimumAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("suggestedAmount")
    private final t0 suggestedAmount;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lauc/b1$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "maxAmount", "b", "usedAmount", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("maxAmount")
        private final long maxAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("usedAmount")
        private final long usedAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getMaxAmount() {
            return this.maxAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getUsedAmount() {
            return this.usedAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.maxAmount == aVar.maxAmount && this.usedAmount == aVar.usedAmount;
        }

        public final int hashCode() {
            return Long.hashCode(this.usedAmount) + (Long.hashCode(this.maxAmount) * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getDailyAllowance() {
        return this.dailyAllowance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getMinimumAmount() {
        return this.minimumAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.name, b1Var.name) && this.enabled == b1Var.enabled && Intrinsics.f(this.currency, b1Var.currency) && Intrinsics.f(this.dailyAllowance, b1Var.dailyAllowance) && Intrinsics.f(this.minimumAmount, b1Var.minimumAmount) && Intrinsics.f(this.suggestedAmount, b1Var.suggestedAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t0 getSuggestedAmount() {
        return this.suggestedAmount;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(this.name.hashCode() * 31, 31, this.enabled), 31, this.currency);
        a aVar = this.dailyAllowance;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Long l2 = this.minimumAmount;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        t0 t0Var = this.suggestedAmount;
        return iHashCode2 + (t0Var != null ? t0Var.hashCode() : 0);
    }
}
