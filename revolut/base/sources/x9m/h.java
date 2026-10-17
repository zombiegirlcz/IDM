package x9m;

import ch.qos.logback.core.CoreConstants;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f303759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f303760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f303761c;
    public float d;

    public h(float f, float f4, float f5, float f6) {
        this.f303759a = f;
        this.f303760b = f4;
        this.f303761c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Float.compare(this.f303759a, hVar.f303759a) == 0 && Float.compare(this.f303760b, hVar.f303760b) == 0 && Float.compare(this.f303761c, hVar.f303761c) == 0 && Float.compare(this.d, hVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f303761c, m72.b.b(this.f303760b, Float.hashCode(this.f303759a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Quaternion(x=");
        sb6.append(this.f303759a);
        sb6.append(", y=");
        sb6.append(this.f303760b);
        sb6.append(", z=");
        sb6.append(this.f303761c);
        sb6.append(", w=");
        return m72.b.s(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
