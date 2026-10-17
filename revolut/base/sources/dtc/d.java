package dtc;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.h3;
import tof.j5;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        j5 j5Var;
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        h3 h3Var = instance.A;
        String str = (h3Var == null || (j5Var = h3Var.f272779a) == null) ? null : j5Var.f272851g;
        if (str != null) {
            targetCollection.add(str);
        }
    }
}
