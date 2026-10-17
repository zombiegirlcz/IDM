package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkfj/r3;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "initialBalanceVoiceSeconds", "b", "e", "initialBalanceSmsCount", "c", "d", "currentBalanceVoiceSeconds", "currentBalanceSmsCount", "", "Ljava/util/List;", "()Ljava/util/List;", "coverageCountriesVoice", "coverageCountriesSms", "", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "smsUnlimited", "h", "voiceSecondsUnlimited", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("initialBalanceVoiceSeconds")
    private final Long initialBalanceVoiceSeconds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("initialBalanceSmsCount")
    private final Long initialBalanceSmsCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentBalanceVoiceSeconds")
    private final Long currentBalanceVoiceSeconds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currentBalanceSmsCount")
    private final Long currentBalanceSmsCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("coverageCountriesVoice")
    private final List<String> coverageCountriesVoice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("coverageCountriesSms")
    private final List<String> coverageCountriesSms;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("smsUnlimited")
    private final Boolean smsUnlimited;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("voiceSecondsUnlimited")
    private final Boolean voiceSecondsUnlimited;

    public r3(Long l2, Long l3, Long l4, Long l5, ArrayList arrayList, ArrayList arrayList2, Boolean bool, Boolean bool2) {
        this.initialBalanceVoiceSeconds = l2;
        this.initialBalanceSmsCount = l3;
        this.currentBalanceVoiceSeconds = l4;
        this.currentBalanceSmsCount = l5;
        this.coverageCountriesVoice = arrayList;
        this.coverageCountriesSms = arrayList2;
        this.smsUnlimited = bool;
        this.voiceSecondsUnlimited = bool2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCoverageCountriesSms() {
        return this.coverageCountriesSms;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCoverageCountriesVoice() {
        return this.coverageCountriesVoice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getCurrentBalanceSmsCount() {
        return this.currentBalanceSmsCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getCurrentBalanceVoiceSeconds() {
        return this.currentBalanceVoiceSeconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getInitialBalanceSmsCount() {
        return this.initialBalanceSmsCount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj2;
        return Intrinsics.f(this.initialBalanceVoiceSeconds, r3Var.initialBalanceVoiceSeconds) && Intrinsics.f(this.initialBalanceSmsCount, r3Var.initialBalanceSmsCount) && Intrinsics.f(this.currentBalanceVoiceSeconds, r3Var.currentBalanceVoiceSeconds) && Intrinsics.f(this.currentBalanceSmsCount, r3Var.currentBalanceSmsCount) && Intrinsics.f(this.coverageCountriesVoice, r3Var.coverageCountriesVoice) && Intrinsics.f(this.coverageCountriesSms, r3Var.coverageCountriesSms) && Intrinsics.f(this.smsUnlimited, r3Var.smsUnlimited) && Intrinsics.f(this.voiceSecondsUnlimited, r3Var.voiceSecondsUnlimited);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getInitialBalanceVoiceSeconds() {
        return this.initialBalanceVoiceSeconds;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getSmsUnlimited() {
        return this.smsUnlimited;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getVoiceSecondsUnlimited() {
        return this.voiceSecondsUnlimited;
    }

    public final int hashCode() {
        Long l2 = this.initialBalanceVoiceSeconds;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.initialBalanceSmsCount;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.currentBalanceVoiceSeconds;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.currentBalanceSmsCount;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List<String> list = this.coverageCountriesVoice;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.coverageCountriesSms;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.smsUnlimited;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.voiceSecondsUnlimited;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
