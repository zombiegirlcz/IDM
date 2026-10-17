package c04;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u000f\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0015\u0010$¨\u0006&"}, d2 = {"Lc04/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "title", "", "b", "J", "h", "()J", "minAmount", "c", "f", "maxAmount", "d", "defaultAmount", "", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "increment", "i", "minAmountLabel", "g", "maxAmountLabel", "currentAmountTemplate", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "enabled", "Lnx4/s1;", "Lnx4/s1;", "()Lnx4/s1;", "info", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minAmount")
    private final long minAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxAmount")
    private final long maxAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("defaultAmount")
    private final long defaultAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("increment")
    private final Integer increment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("minAmountLabel")
    private final String minAmountLabel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxAmountLabel")
    private final String maxAmountLabel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentAmountTemplate")
    private final String currentAmountTemplate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("enabled")
    private final Boolean enabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("info")
    private final s1 info;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrentAmountTemplate() {
        return this.currentAmountTemplate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDefaultAmount() {
        return this.defaultAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getIncrement() {
        return this.increment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final s1 getInfo() {
        return this.info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.title, cVar.title) && this.minAmount == cVar.minAmount && this.maxAmount == cVar.maxAmount && this.defaultAmount == cVar.defaultAmount && Intrinsics.f(this.increment, cVar.increment) && Intrinsics.f(this.minAmountLabel, cVar.minAmountLabel) && Intrinsics.f(this.maxAmountLabel, cVar.maxAmountLabel) && Intrinsics.f(this.currentAmountTemplate, cVar.currentAmountTemplate) && Intrinsics.f(this.enabled, cVar.enabled) && Intrinsics.f(this.info, cVar.info);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getMaxAmountLabel() {
        return this.maxAmountLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getMinAmount() {
        return this.minAmount;
    }

    public final int hashCode() {
        int iC = d.c(d.c(d.c(this.title.hashCode() * 31, 31, this.minAmount), 31, this.maxAmount), 31, this.defaultAmount);
        Integer num = this.increment;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.minAmountLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxAmountLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentAmountTemplate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.enabled;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        s1 s1Var = this.info;
        return iHashCode5 + (s1Var != null ? s1Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMinAmountLabel() {
        return this.minAmountLabel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
