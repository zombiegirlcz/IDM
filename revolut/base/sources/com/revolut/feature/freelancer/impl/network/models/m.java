package com.revolut.feature.freelancer.impl.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "feature", "c", "reason", "Lcom/revolut/feature/freelancer/impl/network/models/p;", "Lcom/revolut/feature/freelancer/impl/network/models/p;", "()Lcom/revolut/feature/freelancer/impl/network/models/p;", "enableStep", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("feature")
    @NotNull
    private final String feature;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("enableStep")
    private final p enableStep;

    public m(String feature, String str, p pVar) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.feature = feature;
        this.reason = str;
        this.enableStep = pVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p getEnableStep() {
        return this.enableStep;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFeature() {
        return this.feature;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.feature, mVar.feature) && Intrinsics.f(this.reason, mVar.reason) && Intrinsics.f(this.enableStep, mVar.enableStep);
    }

    public final int hashCode() {
        int iHashCode = this.feature.hashCode() * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        p pVar = this.enableStep;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }
}
