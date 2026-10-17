package u6l;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lu6l/l;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "enabled", "b", "k0", "editable", "Lu6l/r;", "c", "Lu6l/r;", "()Lu6l/r;", "transactionLimit", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("editable")
    private final boolean editable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionLimit")
    private final r transactionLimit;

    public l(boolean z, boolean z3, r rVar) {
        this.enabled = z;
        this.editable = z3;
        this.transactionLimit = rVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r getTransactionLimit() {
        return this.transactionLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.enabled == lVar.enabled && this.editable == lVar.editable && Intrinsics.f(this.transactionLimit, lVar.transactionLimit);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.enabled) * 31, 31, this.editable);
        r rVar = this.transactionLimit;
        return iC + (rVar == null ? 0 : rVar.hashCode());
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }
}
