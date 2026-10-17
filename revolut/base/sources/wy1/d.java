package wy1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lwy1/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "code", "Ljava/lang/String;", "aliasName", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final Integer code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("aliasName")
    private final String aliasName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAliasName() {
        return this.aliasName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.code, dVar.code) && Intrinsics.f(this.aliasName, dVar.aliasName);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.aliasName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
