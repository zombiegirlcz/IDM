package ru;

import com.revolut.business.feature.referrals.model.ReferralWithIncentiveCampaign$CampaignType;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralWithIncentiveCampaign$CampaignType f257387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257389c;
    public final String d;
    public final String e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f257390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f257391h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f257392j;
    public final String k;

    public y(ReferralWithIncentiveCampaign$CampaignType type, String referralCode, String campaignCode, String referralUrl, String str, ArrayList steps, j jVar, Long l2, Long l3, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        Intrinsics.checkNotNullParameter(campaignCode, "campaignCode");
        Intrinsics.checkNotNullParameter(referralUrl, "referralUrl");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f257387a = type;
        this.f257388b = referralCode;
        this.f257389c = campaignCode;
        this.d = referralUrl;
        this.e = str;
        this.f = steps;
        this.f257390g = jVar;
        this.f257391h = l2;
        this.i = l3;
        this.f257392j = str2;
        this.k = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f257387a.equals(yVar.f257387a) && Intrinsics.f(this.f257388b, yVar.f257388b) && Intrinsics.f(this.f257389c, yVar.f257389c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && this.f.equals(yVar.f) && Intrinsics.f(this.f257390g, yVar.f257390g) && Intrinsics.f(this.f257391h, yVar.f257391h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f257392j, yVar.f257392j) && Intrinsics.f(this.k, yVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f257387a.hashCode() * 31, 31, this.f257388b), 31, this.f257389c), 31, this.d);
        String str = this.e;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        j jVar = this.f257390g;
        int iHashCode = (iB + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Long l2 = this.f257391h;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.f257392j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
