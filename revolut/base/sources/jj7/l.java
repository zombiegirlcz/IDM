package jj7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Ljj7/l;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "date", "Ljava/lang/String;", "cancellerCode", "", "Ljj7/h;", "c", "Ljava/util/List;", "()Ljava/util/List;", "documents", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("date")
    private final long date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellerCode")
    @NotNull
    private final String cancellerCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<h> documents;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCancellerCode() {
        return this.cancellerCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.date == lVar.date && Intrinsics.f(this.cancellerCode, lVar.cancellerCode) && Intrinsics.f(this.documents, lVar.documents);
    }

    public final int hashCode() {
        return this.documents.hashCode() + p.a.c(Long.hashCode(this.date) * 31, 31, this.cancellerCode);
    }
}
