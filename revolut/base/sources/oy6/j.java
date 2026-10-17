package oy6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sr6.l f230897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f230898b;

    public j(Integer num, sr6.l period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f230897a = period;
        this.f230898b = num;
    }

    public static j a(j jVar, sr6.l period, Integer num, int i) {
        if ((i & 1) != 0) {
            period = jVar.f230897a;
        }
        if ((i & 2) != 0) {
            num = jVar.f230898b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(period, "period");
        return new j(num, period);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f230897a == jVar.f230897a && Intrinsics.f(this.f230898b, jVar.f230898b);
    }

    public final int hashCode() {
        int iHashCode = this.f230897a.hashCode() * 31;
        Integer num = this.f230898b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
