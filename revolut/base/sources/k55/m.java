package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lk55/m;", "", "", "toString", "()Ljava/lang/String;", "Lk55/o;", "a", "Lk55/o;", "b", "()Lk55/o;", "info", "contactUs", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("info")
    private final o info;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactUs")
    private final o contactUs;

    public m(o oVar, o oVar2) {
        this.info = oVar;
        this.contactUs = oVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o getContactUs() {
        return this.contactUs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o getInfo() {
        return this.info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.info, mVar.info) && Intrinsics.f(this.contactUs, mVar.contactUs);
    }

    public final int hashCode() {
        o oVar = this.info;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        o oVar2 = this.contactUs;
        return iHashCode + (oVar2 != null ? oVar2.hashCode() : 0);
    }
}
