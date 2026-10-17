package fji;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingContentDelegate.Model f135648a;

    public m(PromptMarketingContentDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f135648a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f135648a, ((m) obj2).f135648a);
    }

    public final int hashCode() {
        return this.f135648a.hashCode();
    }
}
