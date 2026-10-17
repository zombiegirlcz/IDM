package uj6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280509a;

    public p(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f280509a = institutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f280509a, ((p) obj2).f280509a);
    }

    public final int hashCode() {
        return this.f280509a.hashCode();
    }
}
