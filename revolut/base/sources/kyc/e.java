package kyc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkyc/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "fileName", "c", "e", "mimeType", "fileUrl", "Lkyc/l;", "Lkyc/l;", "()Lkyc/l;", "actionToDoId", "Lkyc/n;", "f", "Lkyc/n;", "()Lkyc/n;", "reviewState", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fileName")
    @NotNull
    private final String fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mimeType")
    private final String mimeType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fileUrl")
    private final String fileUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("actionToDo")
    private final l actionToDoId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reviewState")
    @NotNull
    private final n reviewState;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getActionToDoId() {
        return this.actionToDoId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.fileName, eVar.fileName) && Intrinsics.f(this.mimeType, eVar.mimeType) && Intrinsics.f(this.fileUrl, eVar.fileUrl) && Intrinsics.f(this.actionToDoId, eVar.actionToDoId) && Intrinsics.f(this.reviewState, eVar.reviewState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n getReviewState() {
        return this.reviewState;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.fileName);
        String str = this.mimeType;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        l lVar = this.actionToDoId;
        return this.reviewState.hashCode() + ((iHashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }
}
