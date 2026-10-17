package td4;

import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingReferralFlag;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jv3.b f269924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ManualUnderwritingReferralFlag f269925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f269926c;

    public g(jv3.b type, ManualUnderwritingReferralFlag referralFlag, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(referralFlag, "referralFlag");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f269924a = type;
        this.f269925b = referralFlag;
        this.f269926c = pluginConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f269924a == gVar.f269924a && Intrinsics.f(this.f269925b, gVar.f269925b) && Intrinsics.f(this.f269926c, gVar.f269926c);
    }

    public final int hashCode() {
        return this.f269926c.hashCode() + ((this.f269925b.hashCode() + (this.f269924a.hashCode() * 31)) * 31);
    }
}
