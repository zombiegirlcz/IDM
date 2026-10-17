package com.revolut.feature.kyc.impl.errorhandling;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/revolut/feature/kyc/impl/errorhandling/c;", "", "", "toString", "()Ljava/lang/String;", "Lmy8/k;", "a", "Lmy8/k;", "b", "()Lmy8/k;", "type", "Ljava/lang/String;", "scope", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final k type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("scope")
    private final String scope;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.type == cVar.type && Intrinsics.f(this.scope, cVar.scope);
    }

    public final int hashCode() {
        k kVar = this.type;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        String str = this.scope;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
