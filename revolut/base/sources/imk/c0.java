package imk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 extends com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f162503a;

    public c0(e0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f162503a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f162503a, ((c0) obj2).f162503a);
    }

    public final int hashCode() {
        return this.f162503a.f162508a.hashCode();
    }
}
