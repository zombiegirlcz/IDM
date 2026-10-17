package qta;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f249043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f249044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f249045c;
    public final dj0.d d;
    public final List e;

    public b(dj0.d startClose, dj0.d endClose, List sticks, DateTime from, DateTime to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(startClose, "startClose");
        Intrinsics.checkNotNullParameter(endClose, "endClose");
        Intrinsics.checkNotNullParameter(sticks, "sticks");
        this.f249043a = from;
        this.f249044b = to6;
        this.f249045c = startClose;
        this.d = endClose;
        this.e = sticks;
    }

    public final List a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f249043a, bVar.f249043a) && Intrinsics.f(this.f249044b, bVar.f249044b) && Intrinsics.f(this.f249045c, bVar.f249045c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(m72.b.f(this.f249044b, this.f249043a.hashCode() * 31, 31), 31, this.f249045c), 31, this.d);
    }
}
