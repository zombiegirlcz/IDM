package z7c;

import android.os.Bundle;
import com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ jnm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IsReadyToPayService f319953w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Bundle f319954x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Set f319955y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jnm.a aVar, IsReadyToPayService isReadyToPayService, Bundle bundle, Set set, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f319953w = isReadyToPayService;
        this.f319954x = bundle;
        this.f319955y = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f319953w, this.f319954x, this.f319955y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(1:43)|(1:(1:5)(2:11|12))(13:13|14|(2:18|(1:20))|24|25|(1:29)|42|30|40|31|32|36|37)|21|(1:23)(1:24)|25|(0)|42|30|40|31|32|36|37|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 != r4) goto L14
            yhm.o.b(r9)     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            goto L4a
        Lf:
            r9 = move-exception
            goto L5a
        L11:
            r9 = move-exception
            goto L8c
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            yhm.o.b(r9)
            com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService r9 = r8.f319953w
            android.os.Bundle r1 = r8.f319954x
            java.util.Set r5 = r8.f319955y
            gte.a r6 = com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService.a(r9)     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles$WebPayments r7 = com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles.WebPayments.f84299c     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            jte.d r6 = (jte.d) r6     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            boolean r6 = r6.c(r7)     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            if (r6 == 0) goto L54
            zm0.c r6 = com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService.b(r9)     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            cn0.g r6 = (cn0.g) r6     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            mm0.o r6 = r6.d()     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            boolean r6 = r6 instanceof mm0.m     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            if (r6 != 0) goto L54
            r8.u = r4     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            java.lang.Object r9 = com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService.c(r9, r1, r5, r8)     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            if (r9 != r0) goto L4a
            return r0
        L4a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            if (r9 == 0) goto L54
            r9 = r4
            goto L55
        L54:
            r9 = r3
        L55:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Exception -> Lf java.util.concurrent.CancellationException -> L11
            goto L64
        L5a:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r2, r2, r9, r0)
            r9 = r2
        L64:
            if (r9 == 0) goto L6a
            boolean r3 = r9.booleanValue()
        L6a:
            jnm.a r9 = r8.v     // Catch: android.os.RemoteException -> L89
            r9.getClass()     // Catch: android.os.RemoteException -> L89
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L89
            java.lang.String r1 = "org.chromium.IsReadyToPayServiceCallback"
            r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L84
            r0.writeInt(r3)     // Catch: java.lang.Throwable -> L84
            android.os.IBinder r9 = r9.f176818a     // Catch: java.lang.Throwable -> L84
            r9.transact(r4, r0, r2, r4)     // Catch: java.lang.Throwable -> L84
            r0.recycle()     // Catch: android.os.RemoteException -> L89
            goto L89
        L84:
            r9 = move-exception
            r0.recycle()     // Catch: android.os.RemoteException -> L89
            throw r9     // Catch: android.os.RemoteException -> L89
        L89:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L8c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z7c.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
