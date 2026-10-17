package fji;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingContentDelegate.Model f135642a;

    public g(PromptMarketingContentDelegate.Model promptModel) {
        Intrinsics.checkNotNullParameter(promptModel, "promptModel");
        this.f135642a = promptModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f135642a, ((g) obj2).f135642a);
    }

    public final int hashCode() {
        return this.f135642a.hashCode();
    }
}
