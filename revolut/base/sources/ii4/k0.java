package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpinnerConfiguration.Content.SpinnerContent f161533a;

    public k0(SpinnerConfiguration.Content.SpinnerContent spinnerContent) {
        Intrinsics.checkNotNullParameter(spinnerContent, "spinnerContent");
        this.f161533a = spinnerContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f161533a, ((k0) obj2).f161533a);
    }

    public final int hashCode() {
        return this.f161533a.hashCode();
    }
}
