package ks8;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f189312a;

    public i(FeatureCommand kycPromptCommand) {
        Intrinsics.checkNotNullParameter(kycPromptCommand, "kycPromptCommand");
        this.f189312a = kycPromptCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f189312a.equals(((i) obj2).f189312a);
    }

    public final int hashCode() {
        return this.f189312a.f98638a.hashCode();
    }
}
