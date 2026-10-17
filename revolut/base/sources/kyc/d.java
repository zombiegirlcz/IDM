package kyc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\u0005\u0010 ¨\u0006\""}, d2 = {"Lkyc/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "Lkyc/f;", "b", "Lkyc/f;", "f", "()Lkyc/f;", "type", "", "Lkyc/e;", "Ljava/util/List;", "d", "()Ljava/util/List;", "pages", "Lkyc/c;", "Lkyc/c;", "()Lkyc/c;", "details", "Lkyc/n;", "e", "Lkyc/n;", "()Lkyc/n;", "reviewState", "Lkyc/l;", "Lkyc/l;", "()Lkyc/l;", "actionToDoId", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final f type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pages")
    @NotNull
    private final List<e> pages;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("details")
    private final c details;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("reviewState")
    @NotNull
    private final n reviewState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("actionToDo")
    private final l actionToDoId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getActionToDoId() {
        return this.actionToDoId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getPages() {
        return this.pages;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n getReviewState() {
        return this.reviewState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.type, dVar.type) && Intrinsics.f(this.pages, dVar.pages) && Intrinsics.f(this.details, dVar.details) && Intrinsics.f(this.reviewState, dVar.reviewState) && Intrinsics.f(this.actionToDoId, dVar.actionToDoId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getType() {
        return this.type;
    }

    public final int hashCode() {
        int iD = p.a.d((this.type.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.pages);
        c cVar = this.details;
        int iHashCode = (this.reviewState.hashCode() + ((iD + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        l lVar = this.actionToDoId;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
