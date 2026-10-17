package qre;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lqre/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "createDate", "b", "Ljava/lang/String;", "scope", "feature_terms_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("createDate")
    private final long createDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsType")
    @NotNull
    private final String scope;

    public c(long j2, String scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.createDate = j2;
        this.scope = scope;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.createDate == cVar.createDate && Intrinsics.f(this.scope, cVar.scope);
    }

    public final int hashCode() {
        return this.scope.hashCode() + (Long.hashCode(this.createDate) * 31);
    }
}
