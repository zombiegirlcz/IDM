package ht2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f155221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f155222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f155223c;
    public final boolean d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ru.w f155224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f155225h;

    public i(Data referralWithIncentiveCampaign, Data activeCampaignState, Data inactiveCampaignState, boolean z, String str, boolean z3, ru.w wVar, boolean z4) {
        Intrinsics.checkNotNullParameter(referralWithIncentiveCampaign, "referralWithIncentiveCampaign");
        Intrinsics.checkNotNullParameter(activeCampaignState, "activeCampaignState");
        Intrinsics.checkNotNullParameter(inactiveCampaignState, "inactiveCampaignState");
        this.f155221a = referralWithIncentiveCampaign;
        this.f155222b = activeCampaignState;
        this.f155223c = inactiveCampaignState;
        this.d = z;
        this.e = str;
        this.f = z3;
        this.f155224g = wVar;
        this.f155225h = z4;
    }

    public static i a(i iVar, Data data, Data data2, Data data3, boolean z, String str, boolean z3, ru.w wVar, boolean z4, int i) {
        if ((i & 1) != 0) {
            data = iVar.f155221a;
        }
        Data referralWithIncentiveCampaign = data;
        if ((i & 2) != 0) {
            data2 = iVar.f155222b;
        }
        Data activeCampaignState = data2;
        if ((i & 4) != 0) {
            data3 = iVar.f155223c;
        }
        Data inactiveCampaignState = data3;
        if ((i & 8) != 0) {
            z = iVar.d;
        }
        boolean z6 = z;
        if ((i & 16) != 0) {
            str = iVar.e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z3 = iVar.f;
        }
        boolean z11 = z3;
        ru.w wVar2 = (i & 64) != 0 ? iVar.f155224g : wVar;
        boolean z12 = (i & 128) != 0 ? iVar.f155225h : z4;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(referralWithIncentiveCampaign, "referralWithIncentiveCampaign");
        Intrinsics.checkNotNullParameter(activeCampaignState, "activeCampaignState");
        Intrinsics.checkNotNullParameter(inactiveCampaignState, "inactiveCampaignState");
        return new i(referralWithIncentiveCampaign, activeCampaignState, inactiveCampaignState, z6, str2, z11, wVar2, z12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f155221a, iVar.f155221a) && Intrinsics.f(this.f155222b, iVar.f155222b) && Intrinsics.f(this.f155223c, iVar.f155223c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f && Intrinsics.f(this.f155224g, iVar.f155224g) && this.f155225h == iVar.f155225h;
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f155223c, kii.e.c(this.f155222b, this.f155221a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        ru.w wVar = this.f155224g;
        return Boolean.hashCode(this.f155225h) + ((iC2 + (wVar != null ? wVar.hashCode() : 0)) * 31);
    }
}
