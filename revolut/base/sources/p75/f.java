package p75;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f233552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f233553b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f233552a = items;
        this.f233553b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f233552a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f233552a, fVar.f233552a) && this.f233553b == fVar.f233553b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233553b) + (this.f233552a.hashCode() * 31);
    }
}
