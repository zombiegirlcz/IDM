package rbh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f253085b;

    public /* synthetic */ n(r rVar, int i) {
        this.f253084a = i;
        this.f253085b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        switch (this.f253084a) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186386b;
                ArrayList<io3.d> arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    r rVar = this.f253085b;
                    if (!zHasNext) {
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (io3.d dVar : arrayList) {
                            rVar.getClass();
                            arrayList2.add(r.e(dVar, null));
                        }
                        return arrayList2;
                    }
                    Object next = it8.next();
                    io3.d dVar2 = (io3.d) next;
                    rVar.getClass();
                    if (dVar2.e == io3.l.CURRENT && dVar2.f == io3.k.ACTIVE && h30.l.D(xi0.b.Companion, dVar2.f163147c)) {
                        arrayList.add(next);
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fo3.c cVar = (fo3.c) pair.f186385a;
                io3.d dVar3 = (io3.d) pair.f186386b;
                String str = cVar.f136805h;
                r rVar2 = this.f253085b;
                return nim.a.v(rVar2.d(str), new afa.s(rVar2, dVar3, 19));
        }
    }
}
