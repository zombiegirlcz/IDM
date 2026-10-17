package uj6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280502b;

    public m(String url2, String institutionName) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f280501a = url2;
        this.f280502b = institutionName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f280501a, mVar.f280501a) && Intrinsics.f(this.f280502b, mVar.f280502b);
    }

    public final int hashCode() {
        return this.f280502b.hashCode() + (this.f280501a.hashCode() * 31);
    }
}
