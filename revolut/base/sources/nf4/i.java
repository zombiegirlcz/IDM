package nf4;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f214812a;

    public i(FeatureCommand redirectDestination) {
        Intrinsics.checkNotNullParameter(redirectDestination, "redirectDestination");
        this.f214812a = redirectDestination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f214812a.equals(((i) obj2).f214812a);
    }

    public final int hashCode() {
        return this.f214812a.f98638a.hashCode();
    }
}
