package j64;

import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f171669a;

    public a(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f171669a = pluginConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f171669a, ((a) obj2).f171669a);
    }

    public final int hashCode() {
        return j6.a.c(this.f171669a.hashCode() * 31, 31, true);
    }
}
