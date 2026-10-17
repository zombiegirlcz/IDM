package fji;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingContentDelegate.Model f135643a;

    public h(PromptMarketingContentDelegate.Model promptModel) {
        Intrinsics.checkNotNullParameter(promptModel, "promptModel");
        this.f135643a = promptModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f135643a, ((h) obj2).f135643a);
    }

    public final int hashCode() {
        return this.f135643a.hashCode();
    }
}
