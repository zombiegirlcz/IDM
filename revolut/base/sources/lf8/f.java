package lf8;

import com.revolut.feature.junior_core.models.configuration.Links;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f194669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f194670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f194671c;
    public final ArrayList d;
    public final a e;
    public final b f;

    public f(Links links, c featureFlags, g onboardingPaywallType, ArrayList planConfigurations, a consentPromptsEligibility, b featureConfigurations) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
        Intrinsics.checkNotNullParameter(onboardingPaywallType, "onboardingPaywallType");
        Intrinsics.checkNotNullParameter(planConfigurations, "planConfigurations");
        Intrinsics.checkNotNullParameter(consentPromptsEligibility, "consentPromptsEligibility");
        Intrinsics.checkNotNullParameter(featureConfigurations, "featureConfigurations");
        this.f194669a = links;
        this.f194670b = featureFlags;
        this.f194671c = onboardingPaywallType;
        this.d = planConfigurations;
        this.e = consentPromptsEligibility;
        this.f = featureConfigurations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f194669a.equals(fVar.f194669a) && this.f194670b.equals(fVar.f194670b) && this.f194671c == fVar.f194671c && this.d.equals(fVar.d) && this.e.equals(fVar.e) && this.f.equals(fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f194671c.hashCode() + j6.a.c(this.f194669a.hashCode() * 31, 31, this.f194670b.f194666a)) * 31, 31)) * 31);
    }
}
