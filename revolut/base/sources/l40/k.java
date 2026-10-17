package l40;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f192000w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, r rVar, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f192000w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f192000w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r7 == r0) goto L25;
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
            l40.r r4 = r6.f192000w
            l40.q r5 = r6.v
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            yhm.o.b(r7)
            goto L5f
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L40
        L20:
            yhm.o.b(r7)
            be7.k r7 = r5.f192013l
            com.revolut.feature.in_app_calls.b r7 = (com.revolut.feature.in_app_calls.b) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto L37
            be7.h r7 = r5.f192014m
            com.revolut.feature.in_app_calls.a r7 = (com.revolut.feature.in_app_calls.a) r7
            r7.c()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L37:
            r6.u = r3
            java.lang.Object r7 = l40.q.h3(r5, r6)
            if (r7 != r0) goto L40
            goto L5e
        L40:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L4b
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L4b:
            java.lang.String r7 = r4.d
            if (r7 != 0) goto L78
            l40.j r7 = new l40.j
            r1 = 0
            r3 = 0
            r7.<init>(r5, r1, r3)
            r6.u = r2
            java.lang.Object r7 = r5.Y2(r6, r7)
            if (r7 != r0) goto L5f
        L5e:
            return r0
        L5f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L78
            com.revolut.chat.ui.callcategory.CallCategoryScreen r7 = new com.revolut.chat.ui.callcategory.CallCategoryScreen
            r7.<init>()
            l40.b r0 = new l40.b
            r1 = 1
            r0.<init>(r5, r4, r1)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r5.N2(r7, r1, r0)
            goto L7b
        L78:
            l40.q.g3(r5, r4)
        L7b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
