package uqk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f282211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f282212c;
    public final Integer d;
    public final ArrayList e;

    public f(String ref2, l type, int i, Integer num, ArrayList items) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f282210a = ref2;
        this.f282211b = type;
        this.f282212c = i;
        this.d = num;
        this.e = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f282210a, fVar.f282210a) && this.f282211b == fVar.f282211b && this.f282212c == fVar.f282212c && Intrinsics.f(this.d, fVar.d) && this.e.equals(fVar.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f282212c, (this.f282211b.hashCode() + (this.f282210a.hashCode() * 31)) * 31, 31);
        Integer num = this.d;
        return this.e.hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31);
    }
}
