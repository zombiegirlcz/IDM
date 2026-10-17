package fji;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingContentDelegate.Model f135646a;

    public k(PromptMarketingContentDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f135646a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f135646a, ((k) obj2).f135646a);
    }

    public final int hashCode() {
        return this.f135646a.hashCode();
    }
}
