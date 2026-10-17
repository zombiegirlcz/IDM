package f0d;

import gzc.r;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f131084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gzc.c f131085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f131086c;

    public d(r question, gzc.c cVar, e level) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f131084a = question;
        this.f131085b = cVar;
        this.f131086c = level;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f131084a, dVar.f131084a) && Intrinsics.f(this.f131085b, dVar.f131085b) && this.f131086c == dVar.f131086c;
    }

    public final int hashCode() {
        int iHashCode = this.f131084a.hashCode() * 31;
        gzc.c cVar = this.f131085b;
        return this.f131086c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
