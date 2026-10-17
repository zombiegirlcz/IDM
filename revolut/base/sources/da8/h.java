package da8;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.junior_profile.api.models.a f112479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f112480b;

    public h(com.revolut.feature.junior_profile.api.models.a juniorProfile, LinkedHashMap consentUiState) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(consentUiState, "consentUiState");
        this.f112479a = juniorProfile;
        this.f112480b = consentUiState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f112479a, hVar.f112479a) && this.f112480b.equals(hVar.f112480b);
    }

    public final int hashCode() {
        return this.f112480b.hashCode() + (this.f112479a.hashCode() * 31);
    }
}
