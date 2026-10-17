package tjf;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.transactions.impl.R$string;
import g48.r0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements z87.d {

    @NotNull
    public static final f Companion = new f();
    public static final ArrayList i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f271664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f271665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.l f271666c;
    public final l0 d;
    public final ujf.h e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o97.r f271667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zsc.h f271668h;

    static {
        uhf.c[] cVarArrValues = uhf.c.values();
        ArrayList arrayList = new ArrayList(cVarArrValues.length);
        for (uhf.c cVar : cVarArrValues) {
            arrayList.add(cVar.name());
        }
        i = arrayList;
    }

    public j(r0 jointAccountsInteractor, wsg.n walletInteractor, thf.l transactionsItemMapper, l0 transactionSearchSourceDelegate, ujf.h transactionSwipeActionHandler, f01.c uikitResources) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(transactionSearchSourceDelegate, "transactionSearchSourceDelegate");
        Intrinsics.checkNotNullParameter(transactionSwipeActionHandler, "transactionSwipeActionHandler");
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        this.f271664a = jointAccountsInteractor;
        this.f271665b = walletInteractor;
        this.f271666c = transactionsItemMapper;
        this.d = transactionSearchSourceDelegate;
        this.e = transactionSwipeActionHandler;
        this.f = yhm.j.b(new th9.t(this, 5));
        this.f271667g = o97.r.JOINT_TRANSACTIONS;
        this.f271668h = new zsc.h(new Pair(tz4.d.a(uikitResources, R$string.search_block_joint_transactions_title), zsc.p.WORD_PREFIX));
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        return pd.b.r((efm.r) this.f.getValue(), new t8e.c(this, searchQuery, 21));
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f271667g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r9, o97.y r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tjf.j.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
