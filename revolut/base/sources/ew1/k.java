package ew1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f129992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f129993b;

    public k(List items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f129992a = items;
        this.f129993b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f129992a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f129992a, kVar.f129992a) && this.f129993b.equals(kVar.f129993b);
    }

    public final int hashCode() {
        return this.f129993b.hashCode() + (this.f129992a.hashCode() * 31);
    }
}
