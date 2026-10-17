package tjf;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.pocket_details.api.R$string;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 implements z87.d {

    @NotNull
    public static final n0 Companion = new n0();
    public static final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f271691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f271692m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.l f271693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f271694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ujf.h f271695c;
    public final mhf.j d;
    public final aoi.c e;
    public final com.revolut.analytics.tracking.v3.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i7 f271696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f271697h;
    public final zsc.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o97.r f271698j;

    static {
        uhf.c[] cVarArrValues = uhf.c.values();
        ArrayList arrayList = new ArrayList(cVarArrValues.length);
        for (uhf.c cVar : cVarArrValues) {
            arrayList.add(cVar.name());
        }
        k = arrayList;
        f271691l = "txn_global_search";
        f271692m = -1;
    }

    public q0(thf.l transactionsItemMapper, l0 transactionSearchSourceDelegate, ujf.h transactionSwipeActionHandler, mhf.j transactionsSearchIndexInteractor, f01.c uikitResources, aoi.c performanceAnalyticsInteractor, com.revolut.analytics.tracking.v3.d diagnosticEventsTracker) {
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(transactionSearchSourceDelegate, "transactionSearchSourceDelegate");
        Intrinsics.checkNotNullParameter(transactionSwipeActionHandler, "transactionSwipeActionHandler");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(performanceAnalyticsInteractor, "performanceAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        this.f271693a = transactionsItemMapper;
        this.f271694b = transactionSearchSourceDelegate;
        this.f271695c = transactionSwipeActionHandler;
        this.d = transactionsSearchIndexInteractor;
        this.e = performanceAnalyticsInteractor;
        this.f = diagnosticEventsTracker;
        this.i = new zsc.h(new Pair(tz4.d.a(uikitResources, R$string.revolut_accounts_home_transactions_title), zsc.p.WORD_PREFIX));
        this.f271698j = o97.r.TRANSACTIONS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r rVarSwitchMap = this.f271694b.g(false, null, null).switchMap(new tid.a(new t8e.c(searchQuery, this, 26), 28));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return ue0.e.H(rVarSwitchMap, zhm.h0.f322473a, new e(this, 2));
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f271698j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r10, o97.y r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tjf.q0.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
