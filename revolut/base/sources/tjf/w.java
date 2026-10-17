package tjf;

import com.revolut.feature.globalsearch.api.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f271709b;

    public /* synthetic */ w(z zVar, int i) {
        this.f271708a = i;
        this.f271709b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f271708a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f271709b.f271711a.b(R$string.search_block_recent_transactions_title, "LINKED_TRANSACTIONS_SECTION_LIST_ID");
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return this.f271709b.f271711a.f((List) pair.f186385a, (k71.q) pair.f186386b, R$string.search_block_recent_transactions_title, "LINKED_TRANSACTIONS_SECTION_LIST_ID", o97.r.LINKED_ACCOUNTS_RECENT_TRANSACTIONS);
        }
    }
}
