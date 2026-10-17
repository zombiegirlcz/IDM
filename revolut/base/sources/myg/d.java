package myg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jyg.a f210499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yhh.a f210500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f210501c;
    public final Integer d;
    public final String e;

    public d(jyg.a label, yhh.a order, Integer num, Integer num2, String id10) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f210499a = label;
        this.f210500b = order;
        this.f210501c = num;
        this.d = num2;
        this.e = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f210499a == dVar.f210499a && this.f210500b == dVar.f210500b && Intrinsics.f(this.f210501c, dVar.f210501c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f210500b.hashCode() + (this.f210499a.hashCode() * 31)) * 31;
        Integer num = this.f210501c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return this.e.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
