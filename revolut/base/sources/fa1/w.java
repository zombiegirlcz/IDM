package fa1;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f133220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f133222c;

    public w(DateTime timestamp, String message, k level) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f133220a = timestamp;
        this.f133221b = message;
        this.f133222c = level;
    }

    @Override // fa1.x
    public final k a() {
        return this.f133222c;
    }

    @Override // fa1.x
    public final String b() {
        return this.f133221b;
    }

    @Override // fa1.x
    public final DateTime c() {
        return this.f133220a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f133220a, wVar.f133220a) && Intrinsics.f(this.f133221b, wVar.f133221b) && this.f133222c == wVar.f133222c;
    }

    public final int hashCode() {
        return this.f133222c.hashCode() + p.a.c(this.f133220a.hashCode() * 31, 31, this.f133221b);
    }
}
