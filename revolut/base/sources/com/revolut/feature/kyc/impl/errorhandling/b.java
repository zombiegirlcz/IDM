package com.revolut.feature.kyc.impl.errorhandling;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004R$\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0015\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/revolut/feature/kyc/impl/errorhandling/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "code", "b", "Ljava/lang/String;", "getMessage", "message", "", "Lmy8/k;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "consents", "Lcom/revolut/feature/kyc/impl/errorhandling/c;", "d", "missingConsents", "e", "timeoutMinutes", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final Integer code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    private final Set<k> consents;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("missingConsents")
    private final Set<c> missingConsents;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("timeoutMinutes")
    private final Integer timeoutMinutes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Set getConsents() {
        return this.consents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Set getMissingConsents() {
        return this.missingConsents;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getTimeoutMinutes() {
        return this.timeoutMinutes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.code, bVar.code) && Intrinsics.f(this.message, bVar.message) && Intrinsics.f(this.consents, bVar.consents) && Intrinsics.f(this.missingConsents, bVar.missingConsents) && Intrinsics.f(this.timeoutMinutes, bVar.timeoutMinutes);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Set<k> set = this.consents;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Set<c> set2 = this.missingConsents;
        int iHashCode4 = (iHashCode3 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Integer num2 = this.timeoutMinutes;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }
}
