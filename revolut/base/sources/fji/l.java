package fji;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingContentDelegate.Model f135647a;

    public l(PromptMarketingContentDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f135647a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f135647a, ((l) obj2).f135647a);
    }

    public final int hashCode() {
        return this.f135647a.hashCode();
    }
}
