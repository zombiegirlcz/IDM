package hw1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f156048b;

    public t(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f156047a = items;
        this.f156048b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f156047a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f156047a, tVar.f156047a) && this.f156048b == tVar.f156048b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156048b) + (this.f156047a.hashCode() * 31);
    }
}
