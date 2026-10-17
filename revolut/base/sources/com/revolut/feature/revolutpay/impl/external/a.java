package com.revolut.feature.revolutpay.impl.external;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/external/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "appLink", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("appLink")
    @NotNull
    private final String appLink;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppLink() {
        return this.appLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.appLink, ((a) obj2).appLink);
    }

    public final int hashCode() {
        return this.appLink.hashCode();
    }
}
