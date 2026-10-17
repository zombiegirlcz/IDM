package lpd;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f198977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f198978b;

    public l(k configuration, HashMap savedConfigurations) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(savedConfigurations, "savedConfigurations");
        this.f198977a = configuration;
        this.f198978b = savedConfigurations;
    }

    public static l a(l lVar, k configuration) {
        HashMap savedConfigurations = lVar.f198978b;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(savedConfigurations, "savedConfigurations");
        return new l(configuration, savedConfigurations);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f198977a, lVar.f198977a) && Intrinsics.f(this.f198978b, lVar.f198978b);
    }

    public final int hashCode() {
        return this.f198978b.hashCode() + (this.f198977a.hashCode() * 31);
    }
}
