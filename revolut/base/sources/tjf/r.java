package tjf;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a9;
import tof.fc;
import tof.i7;
import tof.l9;
import tof.na;
import tof.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements z87.d {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f271699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td0.b f271700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na f271701c;
    public final o97.r d;

    public r(l0 transactionSearchSourceDelegate, td0.b currencySetsProvider) {
        Intrinsics.checkNotNullParameter(transactionSearchSourceDelegate, "transactionSearchSourceDelegate");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        this.f271699a = transactionSearchSourceDelegate;
        this.f271700b = currencySetsProvider;
        this.f271701c = fc.b(new l9(t0.SUSPICIOUS));
        this.d = o97.r.CRYPTO_RECENT_TRANSACTIONS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Set setD = this.f271700b.d();
        i7.c cVar = i7.Companion;
        Set<String> set = setD;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        for (String str : set) {
            xi0.b.Companion.getClass();
            arrayList.add(new a9(xi0.a.a(str)));
        }
        a9[] a9VarArr = (a9[]) arrayList.toArray(new a9[0]);
        i7[] i7VarArr = (i7[]) Arrays.copyOf(a9VarArr, a9VarArr.length);
        cVar.getClass();
        final int i = 0;
        efm.r rVarW = nim.a.w(shf.a.a(this.f271699a, fc.a(this.f271701c, i7.c.b(i7VarArr)), searchQuery, 3, null, null, SyslogConstants.LOG_CLOCK), new Function1(this) { // from class: tjf.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f271687b;

            {
                this.f271687b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        return this.f271687b.f271699a.f((List) pair.f186385a, (k71.q) pair.f186386b, R$string.search_block_recent_transactions_title, "CRYPTO_TRANSACTIONS_SECTION_LIST_ID", o97.r.CRYPTO_RECENT_TRANSACTIONS);
                    default:
                        Throwable it8 = (Throwable) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f271687b.f271699a.b(R$string.search_block_recent_transactions_title, "CRYPTO_TRANSACTIONS_SECTION_LIST_ID");
                }
            }
        });
        final int i2 = 1;
        return ue0.e.H(rVarW, zhm.h0.f322473a, new Function1(this) { // from class: tjf.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f271687b;

            {
                this.f271687b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        return this.f271687b.f271699a.f((List) pair.f186385a, (k71.q) pair.f186386b, R$string.search_block_recent_transactions_title, "CRYPTO_TRANSACTIONS_SECTION_LIST_ID", o97.r.CRYPTO_RECENT_TRANSACTIONS);
                    default:
                        Throwable it8 = (Throwable) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f271687b.f271699a.b(R$string.search_block_recent_transactions_title, "CRYPTO_TRANSACTIONS_SECTION_LIST_ID");
                }
            }
        });
    }

    @Override // z87.f
    public final o97.r h() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r4, o97.y r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof tjf.q
            if (r4 == 0) goto L13
            r4 = r6
            tjf.q r4 = (tjf.q) r4
            int r0 = r4.f271690w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f271690w = r0
            goto L1a
        L13:
            tjf.q r4 = new tjf.q
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f271690w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            tjf.l0 r6 = r3.f271699a
            java.lang.Object r5 = r5.f223136b
            ufm.b r5 = r6.h(r5)
            r4.f271690w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L45
            return r0
        L45:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tjf.r.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
