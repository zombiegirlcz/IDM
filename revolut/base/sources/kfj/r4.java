package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0012\u0010%R\u001c\u0010+\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b#\u0010-R\u001c\u00102\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\b\n\u00101¨\u00063"}, d2 = {"Lkfj/r4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "name", "", "b", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "initialBalanceBytes", "c", "h", "initialBalanceVoiceSeconds", "d", "g", "initialBalanceSmsCount", "", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "bytesUnlimited", "Z", "m", "()Z", "voiceSecondsUnlimited", "k", "smsCountUnlimited", "coverageType", "coverageCode", "", "j", "Ljava/util/List;", "()Ljava/util/List;", "coverageCountries", "Lkfj/v4;", "Lkfj/v4;", "l", "()Lkfj/v4;", "usage", "J", "()J", "order", "Lkfj/l3;", "Lkfj/l3;", "()Lkfj/l3;", "contextualOrder", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("initialBalanceBytes")
    private final Long initialBalanceBytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("initialBalanceVoiceSeconds")
    private final Long initialBalanceVoiceSeconds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("initialBalanceSmsCount")
    private final Long initialBalanceSmsCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bytesUnlimited")
    private final Boolean bytesUnlimited;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("voiceSecondsUnlimited")
    private final boolean voiceSecondsUnlimited;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("smsCountUnlimited")
    private final Boolean smsCountUnlimited;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageType")
    @NotNull
    private final String coverageType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("coverageCode")
    @NotNull
    private final String coverageCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageCountries")
    @NotNull
    private final List<String> coverageCountries;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("usage")
    private final v4 usage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("order")
    private final long order;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("contextualOrder")
    private final l3 contextualOrder;

    public r4(String name, Long l2, Long l3, Long l4, Boolean bool, boolean z, Boolean bool2, String coverageType, String coverageCode, ArrayList coverageCountries, v4 v4Var, long j2, l3 l3Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coverageType, "coverageType");
        Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
        Intrinsics.checkNotNullParameter(coverageCountries, "coverageCountries");
        this.name = name;
        this.initialBalanceBytes = l2;
        this.initialBalanceVoiceSeconds = l3;
        this.initialBalanceSmsCount = l4;
        this.bytesUnlimited = bool;
        this.voiceSecondsUnlimited = z;
        this.smsCountUnlimited = bool2;
        this.coverageType = coverageType;
        this.coverageCode = coverageCode;
        this.coverageCountries = coverageCountries;
        this.usage = v4Var;
        this.order = j2;
        this.contextualOrder = l3Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getBytesUnlimited() {
        return this.bytesUnlimited;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l3 getContextualOrder() {
        return this.contextualOrder;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCoverageCode() {
        return this.coverageCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getCoverageCountries() {
        return this.coverageCountries;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCoverageType() {
        return this.coverageType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj2;
        return Intrinsics.f(this.name, r4Var.name) && Intrinsics.f(this.initialBalanceBytes, r4Var.initialBalanceBytes) && Intrinsics.f(this.initialBalanceVoiceSeconds, r4Var.initialBalanceVoiceSeconds) && Intrinsics.f(this.initialBalanceSmsCount, r4Var.initialBalanceSmsCount) && Intrinsics.f(this.bytesUnlimited, r4Var.bytesUnlimited) && this.voiceSecondsUnlimited == r4Var.voiceSecondsUnlimited && Intrinsics.f(this.smsCountUnlimited, r4Var.smsCountUnlimited) && Intrinsics.f(this.coverageType, r4Var.coverageType) && Intrinsics.f(this.coverageCode, r4Var.coverageCode) && Intrinsics.f(this.coverageCountries, r4Var.coverageCountries) && Intrinsics.f(this.usage, r4Var.usage) && this.order == r4Var.order && Intrinsics.f(this.contextualOrder, r4Var.contextualOrder);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getInitialBalanceBytes() {
        return this.initialBalanceBytes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getInitialBalanceSmsCount() {
        return this.initialBalanceSmsCount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getInitialBalanceVoiceSeconds() {
        return this.initialBalanceVoiceSeconds;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Long l2 = this.initialBalanceBytes;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.initialBalanceVoiceSeconds;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.initialBalanceSmsCount;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.bytesUnlimited;
        int iC = j6.a.c((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.voiceSecondsUnlimited);
        Boolean bool2 = this.smsCountUnlimited;
        int iD = p.a.d(p.a.c(p.a.c((iC + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.coverageType), 31, this.coverageCode), 31, this.coverageCountries);
        v4 v4Var = this.usage;
        int iC2 = a0.d.c((iD + (v4Var == null ? 0 : v4Var.hashCode())) * 31, 31, this.order);
        l3 l3Var = this.contextualOrder;
        return iC2 + (l3Var != null ? l3Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getSmsCountUnlimited() {
        return this.smsCountUnlimited;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final v4 getUsage() {
        return this.usage;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getVoiceSecondsUnlimited() {
        return this.voiceSecondsUnlimited;
    }
}
