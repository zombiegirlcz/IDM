package ip0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f166650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f166651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166652c;
    public final float d;

    public uf(ArrayList entries, List yAxisLegends, int i, float f) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(yAxisLegends, "yAxisLegends");
        this.f166650a = entries;
        this.f166651b = yAxisLegends;
        this.f166652c = i;
        this.d = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj2;
        return this.f166650a.equals(ufVar.f166650a) && Intrinsics.f(this.f166651b, ufVar.f166651b) && this.f166652c == ufVar.f166652c && Float.compare(this.d, ufVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + j6.a.b(this.f166652c, p.a.d(this.f166650a.hashCode() * 31, 31, this.f166651b), 31);
    }
}
