package dtc;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.f0;
import tof.a3;
import tof.o3;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends atc.b {
    public static void b(dj0.d dVar, Collection collection) {
        if (dVar == null) {
            return;
        }
        long jAbs = Math.abs(dVar.f115082a);
        int iP = cp5.d.p(dVar.f115083b);
        if (iP == 0) {
            collection.add(String.valueOf(jAbs));
            return;
        }
        String strB0 = d0.b0(String.valueOf(jAbs), iP + 1, '0');
        String strO0 = f0.O0(iP, strB0);
        String strV0 = f0.V0(iP, strB0);
        collection.add(strO0 + "." + strV0);
        collection.add(strO0 + "," + strV0);
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        b(instance.k, targetCollection);
        o3 o3Var = instance.J;
        b(o3Var != null ? o3Var.f272965a : null, targetCollection);
    }
}
