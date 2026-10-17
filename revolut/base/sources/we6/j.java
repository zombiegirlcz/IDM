package we6;

import com.revolut.feature.external_accounts.api.navigation.BrazilInboundOpenbankingDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazilInboundOpenbankingDescriptor$InputData f296648a;

    public j(BrazilInboundOpenbankingDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296648a = inputData;
    }

    public final BrazilInboundOpenbankingDescriptor$InputData b() {
        return this.f296648a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f296648a, ((j) obj2).f296648a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f296648a.f72249a);
    }
}
