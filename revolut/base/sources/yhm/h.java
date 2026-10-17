package yhm;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lyhm/h;", "", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements Comparable<h> {
    public static final h e = new h(2, 2, 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f314189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f314190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f314191c;
    public final int d;

    public h(int i, int i2, int i3) {
        this.f314189a = i;
        this.f314190b = i2;
        this.f314191c = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.d = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + CoreConstants.DOT + i2 + CoreConstants.DOT + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        h other = hVar;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.d - other.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        h hVar = obj2 instanceof h ? (h) obj2 : null;
        return hVar != null && this.d == hVar.d;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f314189a);
        sb6.append(CoreConstants.DOT);
        sb6.append(this.f314190b);
        sb6.append(CoreConstants.DOT);
        sb6.append(this.f314191c);
        return sb6.toString();
    }
}
