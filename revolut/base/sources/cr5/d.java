package cr5;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ SwipeToActionDelegate.SwipeAction v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f5j.a f108198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f108199x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SwipeToActionDelegate.SwipeAction swipeAction, f5j.a aVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = swipeAction;
        this.f108198w = aVar;
        this.f108199x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f108198w, this.f108199x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r8.emit(r1, r7) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r6.Y2(r7, r8) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            f5j.a r0 = r7.f108198w
            java.lang.String r1 = r0.f132329a
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1d
            if (r3 == r5) goto L19
            if (r3 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            yhm.o.b(r8)
            goto L6e
        L1d:
            yhm.o.b(r8)
            com.revolut.core.ui_kit.delegates.SwipeToActionDelegate$SwipeAction r8 = r7.v
            java.lang.String r8 = r8.f53505a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "CryptoSendWalletsListController_SwipeAction_Details_"
            r3.<init>(r6)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r8, r3)
            cr5.e r6 = r7.f108199x
            if (r3 == 0) goto L4a
            vkm.z1 r8 = r6.o
            lo5.w r1 = new lo5.w
            r1.<init>(r0)
            r7.u = r5
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r2) goto L6e
            goto L6d
        L4a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "CryptoSendWalletsListController_SwipeAction_Send_"
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r1)
            if (r8 == 0) goto L6e
            cr5.c r8 = new cr5.c
            r1 = 0
            r3 = 1
            r8.<init>(r6, r0, r1, r3)
            r7.u = r4
            java.lang.Object r8 = r6.Y2(r7, r8)
            if (r8 != r2) goto L6e
        L6d:
            return r2
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cr5.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
