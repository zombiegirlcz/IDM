package g14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import st3.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lg14/g;", "", "", "toString", "()Ljava/lang/String;", "Lst3/u;", "a", "Lst3/u;", "b", "()Lst3/u;", "requirements", "Lx04/g;", "Lx04/g;", "()Lx04/g;", "documentsUpload", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("requirements")
    private final u requirements;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentsUpload")
    @NotNull
    private final x04.g documentsUpload;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final x04.g getDocumentsUpload() {
        return this.documentsUpload;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u getRequirements() {
        return this.requirements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.requirements, gVar.requirements) && Intrinsics.f(this.documentsUpload, gVar.documentsUpload);
    }

    public final int hashCode() {
        u uVar = this.requirements;
        return this.documentsUpload.hashCode() + ((uVar == null ? 0 : uVar.hashCode()) * 31);
    }
}
