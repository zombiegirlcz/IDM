package a32;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1038b;

    public q(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f1037a = items;
        this.f1038b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f1037a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f1037a, qVar.f1037a) && this.f1038b == qVar.f1038b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1038b) + (this.f1037a.hashCode() * 31);
    }
}
