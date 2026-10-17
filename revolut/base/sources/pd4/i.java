package pd4;

import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingReferralFlag;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f235072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ManualUnderwritingReferralFlag f235073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f235074c;
    public final List d;
    public final Map e;
    public final String f;

    public i(boolean z, ManualUnderwritingReferralFlag referralFlag, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, List documentValidationConfigs, Map uploadedDocuments, String str) {
        Intrinsics.checkNotNullParameter(referralFlag, "referralFlag");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(documentValidationConfigs, "documentValidationConfigs");
        Intrinsics.checkNotNullParameter(uploadedDocuments, "uploadedDocuments");
        this.f235072a = z;
        this.f235073b = referralFlag;
        this.f235074c = pluginConfiguration;
        this.d = documentValidationConfigs;
        this.e = uploadedDocuments;
        this.f = str;
    }

    public static i a(i iVar, List list, Map map, String str, int i) {
        boolean z = iVar.f235072a;
        ManualUnderwritingReferralFlag referralFlag = iVar.f235073b;
        CreditApplicationPluginFlowContract$Configuration pluginConfiguration = iVar.f235074c;
        if ((i & 8) != 0) {
            list = iVar.d;
        }
        List documentValidationConfigs = list;
        if ((i & 16) != 0) {
            map = iVar.e;
        }
        Map uploadedDocuments = map;
        if ((i & 32) != 0) {
            str = iVar.f;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(referralFlag, "referralFlag");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(documentValidationConfigs, "documentValidationConfigs");
        Intrinsics.checkNotNullParameter(uploadedDocuments, "uploadedDocuments");
        return new i(z, referralFlag, pluginConfiguration, documentValidationConfigs, uploadedDocuments, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f235072a == iVar.f235072a && Intrinsics.f(this.f235073b, iVar.f235073b) && Intrinsics.f(this.f235074c, iVar.f235074c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iE = p.a.e(p.a.d(org.bouncycastle.jcajce.provider.digest.a.c(this.f235074c, (this.f235073b.hashCode() + (Boolean.hashCode(this.f235072a) * 31)) * 31, 31), 31, this.d), 31, this.e);
        String str = this.f;
        return iE + (str == null ? 0 : str.hashCode());
    }
}
