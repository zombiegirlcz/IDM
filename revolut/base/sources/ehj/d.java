package ehj;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static String a(EsimProfile esimProfile) {
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
        EsimProfileDetails.InstallationType installationTypeA = esimProfileDetails != null ? esimProfileDetails.a() : null;
        EsimProfileDetails.InstallationType.InstallationLink installationLink = installationTypeA instanceof EsimProfileDetails.InstallationType.InstallationLink ? (EsimProfileDetails.InstallationType.InstallationLink) installationTypeA : null;
        if (installationLink != null) {
            return installationLink.f100439a;
        }
        return null;
    }
}
