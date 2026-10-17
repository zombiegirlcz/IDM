package tjf;

import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.api.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f271703b;

    public /* synthetic */ s(v vVar, int i) {
        this.f271702a = i;
        this.f271703b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f271702a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f271703b.f271705a.b(R$string.search_block_recent_transactions_title, "FIAT_TRANSACTIONS_SECTION_LIST_ID");
            default:
                l0 l0Var = this.f271703b.f271705a;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                if (data.getLoading() || data.getContent() == null) {
                    return l0Var.c(R$string.search_block_recent_transactions_title, "FIAT_TRANSACTIONS_SECTION_LIST_ID");
                }
                Object content = data.getContent();
                Intrinsics.h(content);
                Pair pair = (Pair) content;
                return zi0.c.P(l0Var.f((List) pair.f186385a, (k71.q) pair.f186386b, R$string.search_block_recent_transactions_title, "FIAT_TRANSACTIONS_SECTION_LIST_ID", o97.r.FIAT_CURRENCIES_RECENT_TRANSACTIONS), false, null, 3);
        }
    }
}
