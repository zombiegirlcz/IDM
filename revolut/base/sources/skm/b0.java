package skm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class b0 extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nd.k f263956c = new nd.k(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f263957b;

    public b0(String str) {
        super(f263956c);
        this.f263957b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f263957b, ((b0) obj2).f263957b);
    }

    public final int hashCode() {
        return this.f263957b.hashCode();
    }

    public final String m() {
        return this.f263957b;
    }

    public final String toString() {
        return j6.a.u(new StringBuilder("CoroutineName("), this.f263957b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
