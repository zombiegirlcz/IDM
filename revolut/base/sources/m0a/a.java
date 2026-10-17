package m0a;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f201111a;

    public a(FeatureCommand kycPromptCommand) {
        Intrinsics.checkNotNullParameter(kycPromptCommand, "kycPromptCommand");
        this.f201111a = kycPromptCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f201111a.equals(((a) obj2).f201111a);
    }

    public final int hashCode() {
        return this.f201111a.f98638a.hashCode();
    }
}
