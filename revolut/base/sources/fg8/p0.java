package fg8;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f134984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f134985c;
    public final /* synthetic */ com.revolut.feature.junior_profile.api.models.a d;
    public final /* synthetic */ psg.a e;

    public /* synthetic */ p0(t0 t0Var, String str, com.revolut.feature.junior_profile.api.models.a aVar, psg.a aVar2, int i) {
        this.f134983a = i;
        this.f134984b = t0Var;
        this.f134985c = str;
        this.d = aVar;
        this.e = aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f134983a) {
            case 0:
                in8.g referralSettings = (in8.g) obj2;
                Intrinsics.checkNotNullParameter(referralSettings, "referralSettings");
                boolean z = referralSettings.f162693a;
                t0 t0Var = this.f134984b;
                String value = this.f134985c;
                if (z) {
                    efm.r rVarX = te0.w.o0(skm.p0.f264003c, new r0(t0Var, value, null, 2)).x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    return rVarX;
                }
                wk8.a aVar = t0Var.f134999a;
                Intrinsics.checkNotNullParameter(value, "value");
                return pd.b.s(rd0.e.c(aVar.a(value, w4l.h.f294642c), skm.p0.f264003c), new p0(t0Var, value, this.d, this.e, 2));
            case 1:
                sk8.b referralCampaign = (sk8.b) obj2;
                Intrinsics.checkNotNullParameter(referralCampaign, "referralCampaign");
                efm.r rVarX2 = te0.w.o0(skm.p0.f264003c, new s0(referralCampaign, this.f134984b, this.f134985c, this.d, this.e, null)).x();
                Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
                return rVarX2;
            default:
                ReferralCampaignV4 referralCampaign2 = (ReferralCampaignV4) obj2;
                Intrinsics.checkNotNullParameter(referralCampaign2, "referralCampaign");
                efm.r rVarX3 = te0.w.o0(skm.p0.f264003c, new ac8.h(5, this.f134985c, this.f134984b, this.d, this.e, referralCampaign2, null)).x();
                Intrinsics.checkNotNullExpressionValue(rVarX3, "toObservable(...)");
                return rVarX3;
        }
    }
}
