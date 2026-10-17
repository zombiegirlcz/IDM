package yg1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lyg1/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "opc", "Lyg1/b;", "Lyg1/b;", "()Lyg1/b;", "error", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("opc")
    private final String opc;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("error")
    private final b error;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOpc() {
        return this.opc;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.opc, fVar.opc) && Intrinsics.f(this.error, fVar.error);
    }

    public final int hashCode() {
        String str = this.opc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b bVar = this.error;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
