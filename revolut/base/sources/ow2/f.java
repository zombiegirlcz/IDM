package ow2;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f230280a;

    public f(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f230280a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f230280a, ((f) obj2).f230280a);
    }

    public final int hashCode() {
        return this.f230280a.hashCode();
    }
}
