package q97;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f243758b;

    public /* synthetic */ o2(m1 m1Var, int i) {
        this.f243757a = i;
        this.f243758b = m1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f243757a) {
            case 0:
                Data savingsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(savingsData, "savingsData");
                if (pd.b.j((Boolean) savingsData.getContent())) {
                    m1 m1Var = this.f243758b;
                    return rd0.e.c(((elb.b) m1Var.d).a(w4l.j.f294644c), kotlin.coroutines.g.f186406a).map(new h2(5, new l1(m1Var, 8)));
                }
                od0.i.Companion.getClass();
                return te0.w.h(od0.i.f224256b);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                Data data2 = (Data) pair.f186386b;
                od0.i iVar = (od0.i) data.getContent();
                boolean z = (iVar != null ? (n38.a) iVar.g() : null) == null;
                boolean zJ = pd.b.j((Boolean) data2.getContent());
                if (z || !zJ) {
                    od0.i.Companion.getClass();
                    return te0.w.h(od0.i.f224256b);
                }
                m1 m1Var2 = this.f243758b;
                return rd0.e.c(((elb.b) m1Var2.d).a(w4l.j.f294644c), kotlin.coroutines.g.f186406a).map(new h2(4, new l1(m1Var2, 7)));
        }
    }
}
