package oq5;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227746b;

    public d(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f227745a = items;
        this.f227746b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f227745a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f227745a, dVar.f227745a) && this.f227746b == dVar.f227746b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227746b) + (this.f227745a.hashCode() * 31);
    }
}
