package lnd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f197151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f197152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f197153c;
    public final float d;
    public final List e;

    public a(List items, int i, float f, float f4, List intervals) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        this.f197151a = items;
        this.f197152b = i;
        this.f197153c = f;
        this.d = f4;
        this.e = intervals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f197151a, aVar.f197151a) && this.f197152b == aVar.f197152b && Float.compare(this.f197153c, aVar.f197153c) == 0 && Float.compare(this.d, aVar.d) == 0 && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + m72.b.b(this.d, m72.b.b(this.f197153c, j6.a.b(this.f197152b, this.f197151a.hashCode() * 31, 31), 31), 31);
    }
}
