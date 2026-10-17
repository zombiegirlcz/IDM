package z5f;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f319619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f319620b;

    public f(e eVar, ArrayList groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f319619a = eVar;
        this.f319620b = groups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f319619a, fVar.f319619a) && this.f319620b.equals(fVar.f319620b);
    }

    public final int hashCode() {
        e eVar = this.f319619a;
        return this.f319620b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31);
    }
}
