package fa1;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f133217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f133219c;

    public v(DateTime timestamp, String message, k level) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f133217a = timestamp;
        this.f133218b = message;
        this.f133219c = level;
    }

    @Override // fa1.x
    public final k a() {
        return this.f133219c;
    }

    @Override // fa1.x
    public final String b() {
        return this.f133218b;
    }

    @Override // fa1.x
    public final DateTime c() {
        return this.f133217a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f133217a, vVar.f133217a) && Intrinsics.f(this.f133218b, vVar.f133218b) && this.f133219c == vVar.f133219c;
    }

    public final int hashCode() {
        return this.f133219c.hashCode() + p.a.c(this.f133217a.hashCode() * 31, 31, this.f133218b);
    }
}
