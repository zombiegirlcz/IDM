package u4e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jel.e2;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f277329b;

    public /* synthetic */ j(m mVar, int i) {
        this.f277328a = i;
        this.f277329b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f277328a) {
            case 0:
                if (((Boolean) obj2).booleanValue()) {
                    m mVar = this.f277329b;
                }
                break;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                e2 e2Var = (e2) pair.f186385a;
                List list = (List) pair.f186386b;
                if (e2Var != null && !list.isEmpty()) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (true) {
                        boolean zHasNext = it8.hasNext();
                        m mVar2 = this.f277329b;
                        if (zHasNext) {
                            arrayList.add(nim.a.v(mVar2.o.b((String) it8.next(), w4l.i.f294643c), new i(2)));
                        }
                    }
                }
                break;
        }
        return m.b3();
    }
}
