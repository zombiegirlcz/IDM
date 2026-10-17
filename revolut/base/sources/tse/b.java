package tse;

import com.revolut.feature.tickets.api.models.TicketDetails;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f274094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TicketDetails f274095c;

    public /* synthetic */ b(FlowCollector flowCollector, TicketDetails ticketDetails, int i) {
        this.f274093a = i;
        this.f274094b = flowCollector;
        this.f274095c = ticketDetails;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f274093a
            switch(r0) {
                case 0: goto L50;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof tse.g
            if (r0 == 0) goto L18
            r0 = r6
            tse.g r0 = (tse.g) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            tse.g r0 = new tse.g
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            com.revolut.feature.tickets.api.models.TicketDetails r6 = r4.f274095c
            java.lang.String r6 = r6.f90447a
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f274094b
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L4d
            goto L4f
        L4d:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4f:
            return r1
        L50:
            boolean r0 = r6 instanceof tse.a
            if (r0 == 0) goto L63
            r0 = r6
            tse.a r0 = (tse.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L63
            int r1 = r1 - r2
            r0.v = r1
            goto L68
        L63:
            tse.a r0 = new tse.a
            r0.<init>(r4, r6)
        L68:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7f
            if (r2 != r3) goto L77
            yhm.o.b(r6)
            goto L9a
        L77:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7f:
            yhm.o.b(r6)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            com.revolut.feature.tickets.api.models.TicketDetails r2 = r4.f274095c
            java.lang.String r2 = r2.f90447a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 == 0) goto L9a
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f274094b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L9a
            goto L9c
        L9a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tse.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
