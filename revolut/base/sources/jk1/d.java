package jk1;

import kg.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0011"}, d2 = {"Ljk1/d;", "", "", "toString", "()Ljava/lang/String;", "Ljk1/e;", "a", "Ljk1/e;", "()Ljk1/e;", "result", "Lkg/u;", "b", "Lkg/u;", "c", "()Lkg/u;", "sdkResponseHeader", "sdkResponseData", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("result")
    private final e result = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sdkResponseHeader")
    private final u sdkResponseHeader = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sdkResponseData")
    private final u sdkResponseData = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u getSdkResponseData() {
        return this.sdkResponseData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u getSdkResponseHeader() {
        return this.sdkResponseHeader;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.result, dVar.result) && Intrinsics.f(this.sdkResponseHeader, dVar.sdkResponseHeader) && Intrinsics.f(this.sdkResponseData, dVar.sdkResponseData);
    }

    public final int hashCode() {
        e eVar = this.result;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        u uVar = this.sdkResponseHeader;
        int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        u uVar2 = this.sdkResponseData;
        return iHashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
    }
}
