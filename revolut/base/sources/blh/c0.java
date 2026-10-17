package blh;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f16642b;

    public /* synthetic */ c0(f0 f0Var, int i) {
        this.f16641a = i;
        this.f16642b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        List list;
        switch (this.f16641a) {
            case 0:
                List results = (List) obj2;
                Intrinsics.checkNotNullParameter(results, "results");
                Iterator it8 = results.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((o97.o) next).f223122a == o97.m.INVEST) {
                        }
                    } else {
                        next = null;
                    }
                }
                o97.o oVar = (o97.o) next;
                if (oVar == null || (list = oVar.f223123b) == null) {
                    return zhm.f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (this.f16642b.f16649b.b((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                Data remoteRefsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(remoteRefsData, "remoteRefsData");
                return nim.a.w(ybl.b.c(this.f16642b.f16650c), new y(3)).map(new bjg.d(29, new beb.p(remoteRefsData, 28)));
        }
    }
}
