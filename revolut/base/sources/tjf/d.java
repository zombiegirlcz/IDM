package tjf;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.fc;
import tof.i7;
import tof.q7;
import tof.va;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f271646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f271647c;
    public final /* synthetic */ n38.a d;

    public /* synthetic */ d(j jVar, String str, n38.a aVar, int i) {
        this.f271645a = i;
        this.f271646b = jVar;
        this.f271647c = str;
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f271645a) {
            case 0:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                l0.Companion.getClass();
                q7 q7Var = l0.i;
                List list = pockets;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((io3.d) it8.next()).f163145a);
                }
                i7 i7VarA = fc.a(q7Var, new va(zhm.d0.i1(arrayList)));
                j jVar = this.f271646b;
                return nim.a.w(shf.a.a(jVar.d, i7VarA, this.f271647c, 4, jVar.f271668h, l38.a.c(this.d), 96), new dv5.g(i7VarA, 1));
            default:
                Data searchContentData = (Data) obj2;
                Intrinsics.checkNotNullParameter(searchContentData, "searchContentData");
                j jVar2 = this.f271646b;
                return (Data) iii.c.f(searchContentData, new e(jVar2, 0), new ta8.a(jVar2, 19), new soc.f(this.d, 3, this.f271647c, jVar2));
        }
    }
}
