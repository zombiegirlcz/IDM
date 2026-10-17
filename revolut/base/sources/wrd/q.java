package wrd;

import com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function2 {
    public Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f299566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f299567x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ValueHistoryEntry f299568y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, ValueHistoryEntry valueHistoryEntry, Continuation continuation) {
        super(2, continuation);
        this.f299567x = sVar;
        this.f299568y = valueHistoryEntry;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.f299567x, this.f299568y, continuation);
        qVar.f299566w = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[PHI: r1
      0x009d: PHI (r1v3 java.lang.Object) = (r1v2 java.lang.Object), (r1v2 java.lang.Object), (r1v12 java.lang.Object) binds: [B:30:0x0080, B:32:0x009a, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f299566w
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 3
            r3 = 2
            r4 = 1
            wrd.s r5 = r8.f299567x
            r6 = 0
            if (r1 == 0) goto L39
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r8.u
            yhm.o.b(r9)
            goto Lb3
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L25:
            java.lang.Object r1 = r8.u
            yhm.o.b(r9)
            goto L9d
        L2c:
            java.lang.Object r1 = r8.u
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            goto L61
        L34:
            r9 = move-exception
            goto L77
        L36:
            r9 = move-exception
            goto Lba
        L39:
            yhm.o.b(r9)
            com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry r9 = r8.f299568y
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            tsj.g r1 = r5.f299570p     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            cli.y r7 = r5.f299571q     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.Object r7 = r7.f22677a     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            vkm.j2 r7 = (vkm.j2) r7     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            wrd.a r7 = (wrd.a) r7     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            com.revolut.retail.feature.api.custom_assets.models.CustomAsset r7 = r7.f299549a     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.String r7 = r7.f99216a     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.time.LocalDate r9 = r9.f99233a     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            r8.f299566w = r6     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            r8.u = r6     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            r8.v = r4     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.Object r9 = r1.j(r7, r9, r6, r8)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            if (r9 != r0) goto L61
            goto Lb1
        L61:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            if (r9 == 0) goto L6f
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
        L6d:
            r1 = r9
            goto L7e
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            java.lang.String r1 = "Unsuccessful operation"
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
            throw r9     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L36
        L77:
            yhm.m$a r1 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
            goto L6d
        L7e:
            boolean r9 = r1 instanceof yhm.n
            if (r9 != 0) goto L9d
            r9 = r1
            kotlin.Unit r9 = (kotlin.Unit) r9
            aii.o r9 = r5.l1()
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.a$a r4 = com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.a.C0550a.f87988b
            r9.M0(r4)
            int r9 = com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_historical_value_updated
            r8.f299566w = r6
            r8.u = r1
            r8.v = r3
            java.lang.Object r9 = wrd.s.J2(r5, r9, r8)
            if (r9 != r0) goto L9d
            goto Lb1
        L9d:
            java.lang.Throwable r9 = yhm.m.a(r1)
            if (r9 == 0) goto Lb4
            int r9 = com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_error_update
            r8.f299566w = r6
            r8.u = r1
            r8.v = r2
            java.lang.Object r9 = wrd.s.I2(r5, r9, r8)
            if (r9 != r0) goto Lb2
        Lb1:
            return r0
        Lb2:
            r0 = r1
        Lb3:
            r1 = r0
        Lb4:
            yhm.m r9 = new yhm.m
            r9.<init>(r1)
            return r9
        Lba:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wrd.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
