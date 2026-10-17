package bxg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f19696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19697b;

    public o(n nVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f19696a = nVar;
        this.f19697b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f19697b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f19696a, oVar.f19696a) && Intrinsics.f(this.f19697b, oVar.f19697b);
    }

    public final int hashCode() {
        n nVar = this.f19696a;
        return this.f19697b.hashCode() + ((nVar == null ? 0 : nVar.hashCode()) * 31);
    }
}
