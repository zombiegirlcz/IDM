package dwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f120433b;

    public /* synthetic */ j0(n0 n0Var, int i) {
        this.f120432a = i;
        this.f120433b = n0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f120432a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                Sequence sequence = (Sequence) pair.f186386b;
                return str.length() == 0 ? nkm.y.J(nkm.y.x(sequence, new f(9))) : nkm.y.J(nkm.y.x(nkm.y.F(nkm.y.n(nkm.y.x(sequence, new d7a.p(25, str, this.f120433b)), new f(10)), new m0()), new f(11)));
            case 1:
                String query = (String) obj2;
                Intrinsics.checkNotNullParameter(query, "query");
                n0 n0Var = this.f120433b;
                Regex regex = n0Var.f120443c;
                m70.a.t(kotlin.jvm.internal.t0.f186434a);
                return zi0.c.P(n0Var.b(kotlin.text.d0.F0(regex.replace(query, " ")).toString()), false, null, 3);
            default:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List<svi.a> list = it8;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (svi.a aVar : list) {
                    String str2 = aVar.f265870c;
                    n0 n0Var2 = this.f120433b;
                    arrayList.add(new k0(aVar, n0Var2.b(str2), n0Var2.b(aVar.d), n0Var2.b(aVar.e)));
                }
                return zhm.d0.Q(arrayList);
        }
    }
}
