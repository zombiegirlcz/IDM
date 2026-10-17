package jqk;

import anf.o;
import com.revolut.domain.interactors.transactions.TransactionContext;
import java.util.List;
import k71.p;
import k71.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import thf.k;
import thf.l;
import tof.i7;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f177750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i7 f177751c;
    public final /* synthetic */ TransactionContext d;

    public /* synthetic */ f(g gVar, i7 i7Var, TransactionContext transactionContext, int i) {
        this.f177749a = i;
        this.f177750b = gVar;
        this.f177751c = i7Var;
        this.d = transactionContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f177749a) {
            case 0:
                qsi.f fVar = (qsi.f) obj2;
                Intrinsics.checkNotNullParameter(fVar, "<destruct>");
                List list = fVar.f248862a;
                q qVar = fVar.f248863b;
                g gVar = this.f177750b;
                return ((o) gVar.f177753b).q(list, qVar, k.a(gVar.f), this.f177751c, this.d);
            default:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                g gVar2 = this.f177750b;
                l lVar = gVar2.f177753b;
                q.Companion.getClass();
                return ((o) lVar).q(transactions, p.a(), k.a(gVar2.f), this.f177751c, this.d);
        }
    }
}
