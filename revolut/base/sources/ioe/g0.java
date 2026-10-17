package ioe;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\r\u0010\u0017¨\u0006\u001b"}, d2 = {"Lioe/g0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "f", "()Z", "tinInputRequired", "", "Lioe/f;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "tinExemptions", "c", "d", "residencyExemptions", "Lioe/h;", "Lioe/h;", "()Lioe/h;", "beforeSubmitPopup", "beforeDeclinePopup", "beforeRemovePopup", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tinInputRequired")
    private final boolean tinInputRequired;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tinExemptions")
    private final List<f> tinExemptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("residencyExemptions")
    private final List<f> residencyExemptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("beforeSubmitPopup")
    private final h beforeSubmitPopup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("beforeDeclinePopup")
    private final h beforeDeclinePopup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("beforeRemovePopup")
    private final h beforeRemovePopup;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getBeforeDeclinePopup() {
        return this.beforeDeclinePopup;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getBeforeRemovePopup() {
        return this.beforeRemovePopup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h getBeforeSubmitPopup() {
        return this.beforeSubmitPopup;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getResidencyExemptions() {
        return this.residencyExemptions;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getTinExemptions() {
        return this.tinExemptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.tinInputRequired == g0Var.tinInputRequired && Intrinsics.f(this.tinExemptions, g0Var.tinExemptions) && Intrinsics.f(this.residencyExemptions, g0Var.residencyExemptions) && Intrinsics.f(this.beforeSubmitPopup, g0Var.beforeSubmitPopup) && Intrinsics.f(this.beforeDeclinePopup, g0Var.beforeDeclinePopup) && Intrinsics.f(this.beforeRemovePopup, g0Var.beforeRemovePopup);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getTinInputRequired() {
        return this.tinInputRequired;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.tinInputRequired) * 31;
        List<f> list = this.tinExemptions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<f> list2 = this.residencyExemptions;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        h hVar = this.beforeSubmitPopup;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h hVar2 = this.beforeDeclinePopup;
        int iHashCode5 = (iHashCode4 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        h hVar3 = this.beforeRemovePopup;
        return iHashCode5 + (hVar3 != null ? hVar3.hashCode() : 0);
    }
}
