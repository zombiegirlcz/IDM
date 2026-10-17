package nwd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lnwd/b;", "", "", "toString", "()Ljava/lang/String;", "Lnwd/c;", "a", "Lnwd/c;", "b", "()Lnwd/c;", "manual", "Lnwd/a;", "Lnwd/a;", "()Lnwd/a;", "auto", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("manual")
    private final c manual;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("auto")
    private final a auto;

    public b(c cVar, a aVar) {
        this.manual = cVar;
        this.auto = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAuto() {
        return this.auto;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getManual() {
        return this.manual;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.manual, bVar.manual) && Intrinsics.f(this.auto, bVar.auto);
    }

    public final int hashCode() {
        c cVar = this.manual;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        a aVar = this.auto;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
