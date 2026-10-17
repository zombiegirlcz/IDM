package rz1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Lrz1/a;", "", "", "toString", "()Ljava/lang/String;", "Lt02/d;", "a", "Lt02/d;", "getSource", "()Lt02/d;", "source", "Ljo3/a;", "b", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "c", "Ljava/lang/String;", "getReference", "reference", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    private final t02.d source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reference")
    private final String reference;

    public a(t02.d dVar, jo3.a aVar, String str) {
        this.source = dVar;
        this.amount = aVar;
        this.reference = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.source, aVar.source) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.reference, aVar.reference);
    }

    public final int hashCode() {
        t02.d dVar = this.source;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        jo3.a aVar = this.amount;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.reference;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
