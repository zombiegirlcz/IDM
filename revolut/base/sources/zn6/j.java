package zn6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323677a;

    public j(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f323677a = institutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f323677a, ((j) obj2).f323677a);
    }

    public final int hashCode() {
        return this.f323677a.hashCode();
    }
}
