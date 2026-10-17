package mx0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s4 implements u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f209991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r4 f209992b;

    public s4(ArrayList options, r4 r4Var) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f209991a = options;
        this.f209992b = r4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj2;
        return this.f209991a.equals(s4Var.f209991a) && this.f209992b.equals(s4Var.f209992b);
    }

    public final int hashCode() {
        return this.f209992b.hashCode() + (this.f209991a.hashCode() * 31);
    }
}
