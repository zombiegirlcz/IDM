package fji;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingContentDelegate.Model f135645a;

    public j(PromptMarketingContentDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f135645a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f135645a, ((j) obj2).f135645a);
    }

    public final int hashCode() {
        return this.f135645a.hashCode();
    }
}
