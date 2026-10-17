package ap8;

import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorSettingsKompotFeatureConfig.InitialStep f8119b;

    public c(String juniorId, JuniorSettingsKompotFeatureConfig.InitialStep initialStep) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f8118a = juniorId;
        this.f8119b = initialStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f8118a, cVar.f8118a) && Intrinsics.f(this.f8119b, cVar.f8119b);
    }

    public final int hashCode() {
        return this.f8119b.hashCode() + (this.f8118a.hashCode() * 31);
    }
}
