package x15;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o35.e f302299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f302300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f302301c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f302302g;

    public t(o35.e details, List types) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(types, "types");
        this.f302299a = details;
        this.f302300b = types;
        this.f302301c = types.contains(s.LOAN);
        this.d = types.contains(s.REFINANCING_LOAN);
        this.e = types.contains(s.HOME_IMPROVEMENT);
        this.f = types.contains(s.MORTGAGE);
        this.f302302g = types.contains(s.REFINANCING_MORTGAGE);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f302299a, tVar.f302299a) && Intrinsics.f(this.f302300b, tVar.f302300b);
    }

    public final int hashCode() {
        return this.f302300b.hashCode() + (this.f302299a.hashCode() * 31);
    }
}
