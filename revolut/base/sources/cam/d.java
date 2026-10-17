package cam;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f22671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22673c;

    public d(int i, Function2 handler) {
        boolean z = (i & 2) != 0;
        boolean z3 = (i & 4) == 0;
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f22671a = handler;
        this.f22672b = z;
        this.f22673c = z3;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof d)) {
            return super.equals(obj2);
        }
        return Intrinsics.f(this.f22671a, ((d) obj2).f22671a);
    }

    public final int hashCode() {
        return this.f22671a.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Item(handler=");
        sb6.append(this.f22671a);
        sb6.append(", removable=");
        sb6.append(this.f22672b);
        sb6.append(", once=");
        return j6.a.x(sb6, this.f22673c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
