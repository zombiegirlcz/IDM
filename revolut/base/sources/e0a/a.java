package e0a;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f121472a;

    public a(FeatureCommand kycPromptCommand) {
        Intrinsics.checkNotNullParameter(kycPromptCommand, "kycPromptCommand");
        this.f121472a = kycPromptCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f121472a.equals(((a) obj2).f121472a);
    }

    public final int hashCode() {
        return this.f121472a.f98638a.hashCode();
    }
}
