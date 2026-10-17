package nfa;

import gfa.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final gfa.a a(ofa.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (a.f214884a[bVar.ordinal()]) {
            case 1:
                return a.C0829a.f143371a;
            case 2:
                return a.e.f143375a;
            case 3:
                return a.f.f143376a;
            case 4:
                return a.k.f143381a;
            case 5:
                return a.j.f143380a;
            case 6:
                return a.c.f143373a;
            case 7:
                return a.h.f143378a;
            case 8:
                return a.g.f143377a;
            case 9:
                return a.b.f143372a;
            case 10:
                return a.i.f143379a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
