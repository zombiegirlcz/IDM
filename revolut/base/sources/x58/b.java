package x58;

import android.net.Uri;
import com.revolut.feature.junior.account_activation.api.JuniorAccountActivationApi$Toggles$JuniorActivationDeeplinkRefactoring;
import com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f302918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f80.a f302919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f302920c;

    public b(gte.a featureToggleInteractor, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f302918a = featureToggleInteractor;
        this.f302919b = uriHelper;
        String[] elements = {"youth/activate", "youth/activate/country-mismatch", "youth/activate/company-mismatch"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f302920c = d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f302920c;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!this.f302918a.a(JuniorAccountActivationApi$Toggles$JuniorActivationDeeplinkRefactoring.f76616c)) {
            Uri uriG = ((f80.b) this.f302919b).g(deeplink.f195039a);
            String lastPathSegment = uriG != null ? uriG.getLastPathSegment() : null;
            if (lastPathSegment != null) {
                int iHashCode = lastPathSegment.hashCode();
                if (iHashCode != -648440546) {
                    if (iHashCode == -251402715 && lastPathSegment.equals("country-mismatch")) {
                        return JuniorAccountActivationFeatureConfig.CountryMismatchDestination.f76622a;
                    }
                } else if (lastPathSegment.equals("company-mismatch")) {
                    return JuniorAccountActivationFeatureConfig.CompanyMismatchDestination.f76621a;
                }
                String strA = g.a("code", deeplink.f195041c);
                if (strA != null) {
                    return new JuniorAccountActivationFeatureConfig.ClaimDestination(strA);
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(c.ERROR, "ACCOUNT_ACTIVATION_DEEPLINK_GATEWAY_TAG", "handle: query parameter 'code' is missing for activation deeplink.", null, h0Var);
                return null;
            }
        }
        return null;
    }
}
