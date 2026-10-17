package u3a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f276853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f276854c;
    public final List d;

    public j() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f276852a, jVar.f276852a) && Intrinsics.f(this.f276853b, jVar.f276853b) && Intrinsics.f(this.f276854c, jVar.f276854c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f276852a.hashCode() * 31, 31, this.f276853b), 31, this.f276854c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(int i) {
        f0 f0Var = f0.f322471a;
        this(f0Var, f0Var, f0Var, f0Var);
    }

    public j(List revolutLocal, List revolutRemote, List device, List junior) {
        Intrinsics.checkNotNullParameter(revolutLocal, "revolutLocal");
        Intrinsics.checkNotNullParameter(revolutRemote, "revolutRemote");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(junior, "junior");
        this.f276852a = revolutLocal;
        this.f276853b = revolutRemote;
        this.f276854c = device;
        this.d = junior;
    }
}
