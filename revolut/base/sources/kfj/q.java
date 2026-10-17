package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\n\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006#"}, d2 = {"Lkfj/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "name", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "allowanceBytes", "c", "e", "allowanceVoiceSeconds", "d", "allowanceSmsCount", "", "Z", "()Z", "allowanceBytesUnlimited", "f", "allowanceVoiceSecondsUnlimited", "g", "allowanceSmsCountUnlimited", "h", "i", "coverageType", "coverageCode", "", "Ljava/util/List;", "()Ljava/util/List;", "coverageCountries", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceBytes")
    private final Long allowanceBytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceVoiceSeconds")
    private final Long allowanceVoiceSeconds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("allowanceSmsCount")
    private final Long allowanceSmsCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("allowanceBytesUnlimited")
    private final boolean allowanceBytesUnlimited;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("allowanceVoiceSecondsUnlimited")
    private final boolean allowanceVoiceSecondsUnlimited;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceSmsCountUnlimited")
    private final boolean allowanceSmsCountUnlimited;

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

    public q(String name, Long l2, Long l3, Long l4, boolean z, boolean z3, boolean z4, String coverageType, String coverageCode, ArrayList coverageCountries) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coverageType, "coverageType");
        Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
        Intrinsics.checkNotNullParameter(coverageCountries, "coverageCountries");
        this.name = name;
        this.allowanceBytes = l2;
        this.allowanceVoiceSeconds = l3;
        this.allowanceSmsCount = l4;
        this.allowanceBytesUnlimited = z;
        this.allowanceVoiceSecondsUnlimited = z3;
        this.allowanceSmsCountUnlimited = z4;
        this.coverageType = coverageType;
        this.coverageCode = coverageCode;
        this.coverageCountries = coverageCountries;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAllowanceBytes() {
        return this.allowanceBytes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowanceBytesUnlimited() {
        return this.allowanceBytesUnlimited;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getAllowanceSmsCount() {
        return this.allowanceSmsCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAllowanceSmsCountUnlimited() {
        return this.allowanceSmsCountUnlimited;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getAllowanceVoiceSeconds() {
        return this.allowanceVoiceSeconds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.name, qVar.name) && Intrinsics.f(this.allowanceBytes, qVar.allowanceBytes) && Intrinsics.f(this.allowanceVoiceSeconds, qVar.allowanceVoiceSeconds) && Intrinsics.f(this.allowanceSmsCount, qVar.allowanceSmsCount) && this.allowanceBytesUnlimited == qVar.allowanceBytesUnlimited && this.allowanceVoiceSecondsUnlimited == qVar.allowanceVoiceSecondsUnlimited && this.allowanceSmsCountUnlimited == qVar.allowanceSmsCountUnlimited && Intrinsics.f(this.coverageType, qVar.coverageType) && Intrinsics.f(this.coverageCode, qVar.coverageCode) && Intrinsics.f(this.coverageCountries, qVar.coverageCountries);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getAllowanceVoiceSecondsUnlimited() {
        return this.allowanceVoiceSecondsUnlimited;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCoverageCode() {
        return this.coverageCode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getCoverageCountries() {
        return this.coverageCountries;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Long l2 = this.allowanceBytes;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.allowanceVoiceSeconds;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.allowanceSmsCount;
        return this.coverageCountries.hashCode() + p.a.c(p.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31, 31, this.allowanceBytesUnlimited), 31, this.allowanceVoiceSecondsUnlimited), 31, this.allowanceSmsCountUnlimited), 31, this.coverageType), 31, this.coverageCode);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCoverageType() {
        return this.coverageType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
