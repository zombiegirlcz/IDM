package shl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zel.g;
import zel.i;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f263504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f263505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f263506c;
    public final List d;
    public final i e;
    public final Integer f;

    public a(List instrumentTypes, List list, g gVar, List extraMetrics, i iVar, Integer num) {
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        Intrinsics.checkNotNullParameter(extraMetrics, "extraMetrics");
        this.f263504a = instrumentTypes;
        this.f263505b = list;
        this.f263506c = gVar;
        this.d = extraMetrics;
        this.e = iVar;
        this.f = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f263504a, aVar.f263504a) && Intrinsics.f(this.f263505b, aVar.f263505b) && this.f263506c == aVar.f263506c && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f263504a.hashCode() * 31;
        List list = this.f263505b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.f263506c;
        int iD = p.a.d((iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.d);
        i iVar = this.e;
        int iHashCode3 = (iD + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Integer num = this.f;
        return (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31;
    }
}
