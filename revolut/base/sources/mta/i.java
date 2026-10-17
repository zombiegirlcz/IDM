package mta;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public j u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f208784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kad.a f208785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a f208786y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, kad.a aVar, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f208784w = jVar;
        this.f208785x = aVar;
        this.f208786y = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.f208784w, this.f208785x, this.f208786y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.v
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            mta.j r0 = r6.u
            yhm.o.b(r7)
            goto L5d
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            yhm.o.b(r7)
            mta.j r7 = r6.f208784w
            nad.c r1 = r7.o
            r6.u = r7
            r6.v = r2
            kad.a r2 = r6.f208785x
            boolean r3 = r2 instanceof kad.e
            if (r3 == 0) goto L42
            a19.a r3 = r1.f213856c
            r4 = r2
            kad.e r4 = (kad.e) r4
            boolean r3 = r3.a(r4)
            if (r3 != 0) goto L45
            yp.b r1 = r1.e
            ui0.b r2 = new ui0.b
            java.lang.String r3 = r4.f182463a
            r4 = 0
            r2.<init>(r3, r4)
            com.revolut.kompot.common.ExternalDestination$ByIntent r1 = r1.b(r2)
            goto L58
        L42:
            r1.getClass()
        L45:
            kad.f r3 = new kad.f
            mta.a r4 = r6.f208786y
            java.lang.Object r4 = r4.invoke()
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.String r5 = "raffleImage"
            r3.<init>(r4, r5)
            java.lang.Object r1 = r1.a(r2, r3, r6)
        L58:
            if (r1 != r0) goto L5b
            return r0
        L5b:
            r0 = r7
            r7 = r1
        L5d:
            aii.u r7 = (aii.u) r7
            aii.n r7 = r0.C1(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mta.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
