package rvc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f257748b;

    public j(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f257747a = items;
        this.f257748b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f257747a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f257747a, jVar.f257747a) && this.f257748b == jVar.f257748b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f257748b) + (this.f257747a.hashCode() * 31);
    }
}
