package m6f;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f203065c;
    public final List d;

    public i(String name, String ref2, BigDecimal allocation, List list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f203063a = name;
        this.f203064b = ref2;
        this.f203065c = allocation;
        this.d = list;
    }

    @Override // m6f.j
    public final List U0() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f203063a, iVar.f203063a) && Intrinsics.f(this.f203064b, iVar.f203064b) && Intrinsics.f(this.f203065c, iVar.f203065c) && Intrinsics.f(this.d, iVar.d);
    }

    @Override // m6f.j
    public final BigDecimal getAllocation() {
        return this.f203065c;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f203065c, p.a.c(this.f203063a.hashCode() * 31, 31, this.f203064b), 31);
        List list = this.d;
        return iD + (list == null ? 0 : list.hashCode());
    }

    @Override // m6f.j
    public final String i() {
        return this.f203064b;
    }
}
