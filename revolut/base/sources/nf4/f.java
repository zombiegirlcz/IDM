package nf4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214807a;

    public f(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f214807a = actionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f214807a, ((f) obj2).f214807a);
    }

    public final int hashCode() {
        return this.f214807a.hashCode();
    }
}
