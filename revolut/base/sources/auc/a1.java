package auc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lauc/a1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "b", "currency", "", "c", "Z", "()Z", "enabled", "Lauc/e;", "d", "Lauc/e;", "()Lauc/e;", "dailyAllowance", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "minimumAmount", "Lauc/t0;", "f", "Lauc/t0;", "()Lauc/t0;", "suggestedAmount", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dailyAllowance")
    private final e dailyAllowance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("minimumAmount")
    private final Long minimumAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("suggestedAmount")
    private final t0 suggestedAmount;

    public a1(String name, String currency, boolean z, e eVar, Long l2, t0 t0Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.name = name;
        this.currency = currency;
        this.enabled = z;
        this.dailyAllowance = eVar;
        this.minimumAmount = l2;
        this.suggestedAmount = t0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getDailyAllowance() {
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
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.name, a1Var.name) && Intrinsics.f(this.currency, a1Var.currency) && this.enabled == a1Var.enabled && Intrinsics.f(this.dailyAllowance, a1Var.dailyAllowance) && Intrinsics.f(this.minimumAmount, a1Var.minimumAmount) && Intrinsics.f(this.suggestedAmount, a1Var.suggestedAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t0 getSuggestedAmount() {
        return this.suggestedAmount;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.name.hashCode() * 31, 31, this.currency), 31, this.enabled);
        e eVar = this.dailyAllowance;
        int iHashCode = (iC + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Long l2 = this.minimumAmount;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        t0 t0Var = this.suggestedAmount;
        return iHashCode2 + (t0Var != null ? t0Var.hashCode() : 0);
    }
}
