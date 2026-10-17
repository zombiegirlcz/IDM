package xn8;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f307337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307338b;

    public d(boolean z, String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f307337a = z;
        this.f307338b = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f307337a == dVar.f307337a && Intrinsics.f(this.f307338b, dVar.f307338b);
    }

    public final int hashCode() {
        return this.f307338b.hashCode() + (Boolean.hashCode(this.f307337a) * 31);
    }
}
