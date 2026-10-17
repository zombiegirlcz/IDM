package kyc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\f\u0010 R \u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u000f\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b\u0005\u0010)¨\u0006+"}, d2 = {"Lkyc/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "i", "title", "c", "description", "Lkyc/j;", "d", "Lkyc/j;", "g", "()Lkyc/j;", "originRef", "Lkyc/o;", "e", "Lkyc/o;", "()Lkyc/o;", "evidenceType", "Lkyc/n;", "Lkyc/n;", "h", "()Lkyc/n;", "reviewState", "Lkyc/b;", "Lkyc/b;", "()Lkyc/b;", "details", "", "Lkyc/d;", "Ljava/util/List;", "()Ljava/util/List;", "documents", "Lkyc/l;", "Lkyc/l;", "()Lkyc/l;", "actionToDoId", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("originRef")
    @NotNull
    private final j originRef;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final o evidenceType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reviewState")
    @NotNull
    private final n reviewState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    @NotNull
    private final b details;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<d> documents;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("actionToDo")
    private final l actionToDoId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getActionToDoId() {
        return this.actionToDoId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o getEvidenceType() {
        return this.evidenceType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.id, mVar.id) && Intrinsics.f(this.title, mVar.title) && Intrinsics.f(this.description, mVar.description) && Intrinsics.f(this.originRef, mVar.originRef) && Intrinsics.f(this.evidenceType, mVar.evidenceType) && Intrinsics.f(this.reviewState, mVar.reviewState) && Intrinsics.f(this.details, mVar.details) && Intrinsics.f(this.documents, mVar.documents) && Intrinsics.f(this.actionToDoId, mVar.actionToDoId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j getOriginRef() {
        return this.originRef;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final n getReviewState() {
        return this.reviewState;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iD = p.a.d((this.details.hashCode() + ((this.reviewState.hashCode() + ((this.evidenceType.hashCode() + ((this.originRef.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.documents);
        l lVar = this.actionToDoId;
        return iD + (lVar != null ? lVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
