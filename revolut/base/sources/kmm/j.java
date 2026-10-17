package kmm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f185937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f185938c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public j(boolean z, Integer num, boolean z3, Integer num2, boolean z4, boolean z6) {
        this.f185936a = z;
        this.f185937b = num;
        this.f185938c = z3;
        this.d = num2;
        this.e = z4;
        this.f = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f185936a == jVar.f185936a && Intrinsics.f(this.f185937b, jVar.f185937b) && this.f185938c == jVar.f185938c && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f185936a) * 31;
        Integer num = this.f185937b;
        int iC = j6.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f185938c);
        Integer num2 = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iC + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb6.append(this.f185936a);
        sb6.append(", clientMaxWindowBits=");
        sb6.append(this.f185937b);
        sb6.append(", clientNoContextTakeover=");
        sb6.append(this.f185938c);
        sb6.append(", serverMaxWindowBits=");
        sb6.append(this.d);
        sb6.append(", serverNoContextTakeover=");
        sb6.append(this.e);
        sb6.append(", unknownValues=");
        return j6.a.x(sb6, this.f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
