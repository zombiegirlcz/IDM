package kyc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkyc/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "f", "message", "c", "action", "d", "entityVariant", "Lkyc/s;", "Lkyc/s;", "()Lkyc/s;", "entityVariantDetails", "", "Lkyc/m;", "Ljava/util/List;", "()Ljava/util/List;", "evidences", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("message")
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    @NotNull
    private final String action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("entityVariant")
    private final String entityVariant;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("entityVariantDetails")
    private final s entityVariantDetails;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("evidences")
    private final List<m> evidences;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEntityVariant() {
        return this.entityVariant;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s getEntityVariantDetails() {
        return this.entityVariantDetails;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getEvidences() {
        return this.evidences;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.id, lVar.id) && Intrinsics.f(this.message, lVar.message) && Intrinsics.f(this.action, lVar.action) && Intrinsics.f(this.entityVariant, lVar.entityVariant) && Intrinsics.f(this.entityVariantDetails, lVar.entityVariantDetails) && Intrinsics.f(this.evidences, lVar.evidences);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.message), 31, this.action);
        String str = this.entityVariant;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        s sVar = this.entityVariantDetails;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        List<m> list = this.evidences;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
