package s63;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f260118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f260119c;

    public f(List list, q qVar, boolean z) {
        this.f260117a = list;
        this.f260118b = qVar;
        this.f260119c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f260117a, fVar.f260117a) && Intrinsics.f(this.f260118b, fVar.f260118b) && this.f260119c == fVar.f260119c;
    }

    public final int hashCode() {
        List list = this.f260117a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        q qVar = this.f260118b;
        return Boolean.hashCode(this.f260119c) + ((iHashCode + (qVar != null ? qVar.hashCode() : 0)) * 31);
    }
}
