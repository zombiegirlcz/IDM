package tjf;

import com.revolut.feature.globalsearch.api.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f271638b;

    public /* synthetic */ a0(d0 d0Var, int i) {
        this.f271637a = i;
        this.f271638b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f271637a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f271638b.f271648a.b(R$string.search_block_recent_transactions_title, "PAYMENTS_TRANSACTIONS_SECTION_LIST_ID");
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                k71.q qVar = (k71.q) pair.f186386b;
                d0 d0Var = this.f271638b;
                return d0Var.f271648a.f(list, qVar, R$string.search_block_recent_transactions_title, "PAYMENTS_TRANSACTIONS_SECTION_LIST_ID", d0Var.f271649b);
        }
    }
}
