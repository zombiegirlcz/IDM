package ngd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f215135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f215136b;

    public c(b type, a range) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f215135a = type;
        this.f215136b = range;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f215135a == cVar.f215135a && this.f215136b == cVar.f215136b;
    }

    public final int hashCode() {
        return this.f215136b.hashCode() + (this.f215135a.hashCode() * 31);
    }

    public c() {
        this(b.LINE, a.ONE_DAY);
    }
}
