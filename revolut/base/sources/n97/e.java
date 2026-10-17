package n97;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f213588a;

    public e(g gVar, k kVar) {
        this.f213588a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            r1 = r8
            koi.j r1 = (koi.j) r1
            n97.g r8 = r7.f213588a
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.d
            boolean r9 = r9.get()
            if (r9 == 0) goto L10
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L10:
            boolean r9 = r1 instanceof com.revolut.core.ui_kit_core.actionshandler.TrackableItem
            r6 = 0
            if (r9 == 0) goto L19
            r9 = r1
            com.revolut.core.ui_kit_core.actionshandler.TrackableItem r9 = (com.revolut.core.ui_kit_core.actionshandler.TrackableItem) r9
            goto L1a
        L19:
            r9 = r6
        L1a:
            if (r9 == 0) goto L30
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r0 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            com.revolut.tracking.v3.IdContext$a r2 = com.revolut.tracking.v3.IdContext.newBuilder()
            java.lang.String r3 = r8.f213591b
            com.google.protobuf.w0 r0 = kii.e.d(r2, r3, r0)
            com.revolut.analytics.tracking.v3.AnalyticsContext r2 = new com.revolut.analytics.tracking.v3.AnalyticsContext
            r2.<init>(r0)
            r9.setAnalyticsContext(r2)
        L30:
            boolean r9 = r1 instanceof qv0.p
            if (r9 == 0) goto L42
            r9 = r1
            qv0.p r9 = (qv0.p) r9
            java.lang.Object r9 = r9.getK()
            boolean r0 = r9 instanceof o97.y
            if (r0 == 0) goto L42
            o97.y r9 = (o97.y) r9
            goto L43
        L42:
            r9 = r6
        L43:
            if (r9 == 0) goto L47
            r9.f = r8
        L47:
            vkm.j2 r8 = r8.f
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r8.getClass()
            r8.g(r6, r0)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n97.e.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
