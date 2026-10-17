package zn6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323676a;

    public i(String authUrl) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.f323676a = authUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f323676a, ((i) obj2).f323676a);
    }

    public final int hashCode() {
        return this.f323676a.hashCode();
    }
}
