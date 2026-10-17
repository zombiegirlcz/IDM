package com.revolut.feature.revolutpay.impl.external;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/external/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "supportedMethods", "Ljava/lang/String;", "stringifiedData", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportedMethods")
    @NotNull
    private final List<String> supportedMethods;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("data")
    @NotNull
    private final String stringifiedData;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getStringifiedData() {
        return this.stringifiedData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSupportedMethods() {
        return this.supportedMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.supportedMethods, bVar.supportedMethods) && Intrinsics.f(this.stringifiedData, bVar.stringifiedData);
    }

    public final int hashCode() {
        return this.stringifiedData.hashCode() + (this.supportedMethods.hashCode() * 31);
    }
}
