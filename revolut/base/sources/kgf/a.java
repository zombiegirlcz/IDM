package kgf;

import com.revolut.domain.models.topup.AutoTopUpState;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f183976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AutoTopUpState f183977x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ProducerScope producerScope, AutoTopUpState autoTopUpState, Continuation continuation) {
        super(2, continuation);
        this.f183976w = producerScope;
        this.f183977x = autoTopUpState;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f183976w, this.f183977x, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((com.revolut.domain.models.topup.methods.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r9.send(od0.i.f224256b, r8) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9.send(r0, r8) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.v
            com.revolut.domain.models.topup.methods.b r0 = (com.revolut.domain.models.topup.methods.b) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            yhm.o.b(r9)
            goto L77
        L1d:
            yhm.o.b(r9)
            java.util.List r9 = r0.f60525a
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L28:
            boolean r0 = r9.hasNext()
            com.revolut.domain.models.topup.AutoTopUpState r2 = r8.f183977x
            r5 = 0
            if (r0 == 0) goto L45
            java.lang.Object r0 = r9.next()
            r6 = r0
            com.revolut.domain.models.topup.methods.TopupMethod$StoredMethod r6 = (com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod) r6
            java.lang.String r6 = r6.getF60502a()
            java.lang.String r7 = r2.f60423c
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L28
            goto L46
        L45:
            r0 = r5
        L46:
            com.revolut.domain.models.topup.methods.TopupMethod$StoredMethod r0 = (com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod) r0
            kotlinx.coroutines.channels.ProducerScope r9 = r8.f183976w
            if (r0 != 0) goto L5e
            od0.h r0 = od0.i.Companion
            r0.getClass()
            r8.v = r5
            r8.u = r4
            od0.i r0 = od0.i.f224256b
            java.lang.Object r9 = r9.send(r0, r8)
            if (r9 != r1) goto L77
            goto L76
        L5e:
            od0.h r4 = od0.i.Companion
            lgf.a r6 = new lgf.a
            r6.<init>(r0, r2)
            r4.getClass()
            od0.i r0 = od0.h.a(r6)
            r8.v = r5
            r8.u = r3
            java.lang.Object r9 = r9.send(r0, r8)
            if (r9 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kgf.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
