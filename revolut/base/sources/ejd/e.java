package ejd;

import com.revolut.feature.shops.api.navigation.AdsFullScreenPromptType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdsFullScreenPromptType f126856a;

    public e(AdsFullScreenPromptType currentPrompt) {
        Intrinsics.checkNotNullParameter(currentPrompt, "currentPrompt");
        this.f126856a = currentPrompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f126856a, ((e) obj2).f126856a);
    }

    public final int hashCode() {
        return this.f126856a.hashCode();
    }
}
