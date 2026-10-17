package vt8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lvt8/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "element", "b", "d", "status", "c", "reviewMethod", "failReason", "feature_kyc_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("element")
    @NotNull
    private final String element;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("method_in_progress")
    private final String reviewMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fail_reason")
    private final String failReason;

    public c(String element, String status, String str, String str2) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(status, "status");
        this.element = element;
        this.status = status;
        this.reviewMethod = str;
        this.failReason = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getElement() {
        return this.element;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReviewMethod() {
        return this.reviewMethod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.element, cVar.element) && Intrinsics.f(this.status, cVar.status) && Intrinsics.f(this.reviewMethod, cVar.reviewMethod) && Intrinsics.f(this.failReason, cVar.failReason);
    }

    public final int hashCode() {
        int iC = p.a.c(this.element.hashCode() * 31, 31, this.status);
        String str = this.reviewMethod;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.failReason;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
