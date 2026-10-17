package r18;

import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ FeedFilter v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f250918w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(FeedFilter feedFilter, m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = feedFilter;
        this.f250918w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f250918w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            yhm.o.b(r7)
            goto L68
        L19:
            yhm.o.b(r7)
            com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter r7 = r6.v
            boolean r1 = r7 instanceof com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter.ByAssetFilter
            r4 = 50
            r18.m r5 = r6.f250918w
            if (r1 == 0) goto L45
            jt0.b r1 = r5.f250920l
            r18.d r2 = r18.m.Companion
            r2.getClass()
            java.util.List r2 = r18.m.f250919r
            com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter$ByAssetFilter r7 = (com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter.ByAssetFilter) r7
            java.util.Set r7 = r7.f76423a
            r6.u = r3
            java.lang.Object r1 = r1.f178266c
            k18.c r1 = (k18.c) r1
            java.lang.Object r7 = r1.g(r2, r7, r4, r6)
            if (r7 != r0) goto L40
            goto L42
        L40:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L42:
            if (r7 != r0) goto L68
            goto L67
        L45:
            boolean r1 = r7 instanceof com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter.ByRef
            if (r1 == 0) goto L6b
            jt0.b r1 = r5.f250920l
            r18.d r3 = r18.m.Companion
            r3.getClass()
            java.util.List r3 = r18.m.f250919r
            com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter$ByRef r7 = (com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter.ByRef) r7
            java.lang.String r7 = r7.f76424a
            r6.u = r2
            java.lang.Object r1 = r1.f178266c
            k18.c r1 = (k18.c) r1
            java.lang.Object r7 = r1.e(r3, r7, r4, r6)
            if (r7 != r0) goto L63
            goto L65
        L63:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L65:
            if (r7 != r0) goto L68
        L67:
            return r0
        L68:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L6b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r18.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
