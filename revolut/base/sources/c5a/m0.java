package c5a;

import android.view.View;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.feature.address.models.AddressVerificationUseCase;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.product.lifecycle.data.ProductLifecycleService;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import dfj.i1;
import dfj.q1;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import nfj.a2;
import nfj.s2;
import vkm.c2;
import vkm.d2;
import vkm.t1;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f21514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f21515x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f21516y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f21514w = obj2;
        this.f21515x = obj3;
        this.f21516y = obj4;
        this.z = obj5;
    }

    private final Object b(Object obj2) {
        w4l.k kVar = (w4l.k) this.f21516y;
        dfj.g0 g0Var = (dfj.g0) this.f21515x;
        ProducerScope producerScope = (ProducerScope) this.f21514w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            vkm.y yVarB = g0Var.f113975b.b(kVar);
            d2.Companion.getClass();
            t1 t1VarM = vkm.q.M(yVarB, producerScope, c2.f290008b, 1);
            Continuation continuation = null;
            akg.n nVarV = nim.a.v(zh9.u0.m(t1VarM, new vkm.y(new a35.j(2, 15, continuation), vkm.q.Q(vkm.q.q(new a83.j0(new dfj.e0(t1VarM, 0), 22)), new a67.c(continuation, g0Var, (String) this.z, kVar, 14)))), new dee.x(8));
            cua.b bVar = new cua.b(producerScope, 1);
            this.f21514w = null;
            this.v = 1;
            if (nVarV.collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5a.m0.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) throws Throwable {
        i1 i1Var = (i1) this.f21515x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            nfj.k0 k0Var = i1Var.f113996a;
            String str = (String) this.f21516y;
            this.v = 1;
            nfj.u0 u0Var = (nfj.u0) k0Var;
            u0Var.getClass();
            n3j.w wVar = new n3j.w(u0Var, str, (Continuation) null, 23);
            skm.p0 p0Var = skm.p0.f264001a;
            obj2 = skm.e0.J(elm.f.f127540b, wVar, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = (EsimSubscriptionPhoneNumber) this.f21514w;
            yhm.o.b(obj2);
            return esimSubscriptionPhoneNumber;
        }
        yhm.o.b(obj2);
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber2 = (EsimSubscriptionPhoneNumber) obj2;
        a2 a2Var = i1Var.f113997b;
        String str2 = (String) this.z;
        this.f21514w = esimSubscriptionPhoneNumber2;
        this.v = 2;
        return ((s2) a2Var).p(str2, esimSubscriptionPhoneNumber2, this) == aVar ? aVar : esimSubscriptionPhoneNumber2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0118, code lost:
    
        if (r14.emit(r3, r22) == r15) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
    
        if (r14.emit(r3, r22) != r15) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[Catch: Exception -> 0x00c0, PHI: r2 r3
      0x008e: PHI (r2v13 com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortOutCredentials) = 
      (r2v12 com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortOutCredentials)
      (r2v14 com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortOutCredentials)
     binds: [B:21:0x008a, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r3v5 java.lang.Object) = (r3v4 java.lang.Object), (r3v9 java.lang.Object) binds: [B:21:0x008a, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00c0, blocks: (B:40:0x00e5, B:42:0x00ea, B:45:0x00ff, B:33:0x00bd, B:23:0x008e, B:25:0x0094, B:30:0x00a1, B:37:0x00c3, B:20:0x0082), top: B:55:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:40:0x00e5, B:42:0x00ea, B:45:0x00ff, B:33:0x00bd, B:23:0x008e, B:25:0x0094, B:30:0x00a1, B:37:0x00c3, B:20:0x0082), top: B:55:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5 A[Catch: Exception -> 0x00c0, PHI: r0
      0x00e5: PHI (r0v13 java.lang.Object) = (r0v9 java.lang.Object), (r0v19 java.lang.Object) binds: [B:38:0x00e2, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00c0, blocks: (B:40:0x00e5, B:42:0x00ea, B:45:0x00ff, B:33:0x00bd, B:23:0x008e, B:25:0x0094, B:30:0x00a1, B:37:0x00c3, B:20:0x0082), top: B:55:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:40:0x00e5, B:42:0x00ea, B:45:0x00ff, B:33:0x00bd, B:23:0x008e, B:25:0x0094, B:30:0x00a1, B:37:0x00c3, B:20:0x0082), top: B:55:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff A[Catch: Exception -> 0x00c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c0, blocks: (B:40:0x00e5, B:42:0x00ea, B:45:0x00ff, B:33:0x00bd, B:23:0x008e, B:25:0x0094, B:30:0x00a1, B:37:0x00c3, B:20:0x0082), top: B:55:0x0082 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5a.m0.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2) throws Throwable {
        q1 q1Var = (q1) this.f21515x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        int i2 = 1;
        if (i == 0) {
            yhm.o.b(obj2);
            nfj.j0 j0Var = q1Var.f114074a;
            String str = (String) this.f21516y;
            this.v = 1;
            j0Var.getClass();
            nfj.i0 i0Var = new nfj.i0(j0Var, str, null, i2);
            skm.p0 p0Var = skm.p0.f264001a;
            obj2 = skm.e0.J(elm.f.f127540b, i0Var, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = (EsimSubscriptionPhoneNumber) this.f21514w;
            yhm.o.b(obj2);
            return esimSubscriptionPhoneNumber;
        }
        yhm.o.b(obj2);
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber2 = (EsimSubscriptionPhoneNumber) obj2;
        a2 a2Var = q1Var.f114075b;
        String str2 = (String) this.z;
        this.f21514w = esimSubscriptionPhoneNumber2;
        this.v = 2;
        return ((s2) a2Var).p(str2, esimSubscriptionPhoneNumber2, this) == aVar ? aVar : esimSubscriptionPhoneNumber2;
    }

    private final Object s(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ProductLifecycleService productLifecycleService = ((dja.f) this.f21514w).f115267a;
            fja.a aVar2 = new fja.a((String) this.f21515x, (String) this.f21516y, (String) this.z);
            this.v = 1;
            obj2 = productLifecycleService.createProductLifecycle(aVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return ((fja.b) obj2).getProcessId();
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.z, continuation, 0);
            case 1:
                return new m0(1, (c84.t) this.f21514w, (a3i.q) this.f21515x, (String) this.f21516y, (NaviCommand) this.z, continuation);
            case 2:
                return new m0(2, (c8i.s) this.f21514w, (BalanceWrapper) this.f21515x, (x5i.d) this.f21516y, (AccountWrapper) this.z, continuation);
            case 3:
                m0 m0Var = new m0((sak.g) this.f21515x, (sak.a) this.f21516y, (cbk.a) this.z, continuation, 3);
                m0Var.f21514w = obj2;
                return m0Var;
            case 4:
                return new m0(4, (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d) this.f21514w, (MortgageOfferFlowContract$OfferUpdateContext) this.f21515x, (cv3.u) this.f21516y, (Function0) this.z, continuation);
            case 5:
                return new m0((cfa.g) this.f21515x, (RemoveAccountContract$InputData) this.f21516y, (dj0.d) this.z, continuation, 5);
            case 6:
                m0 m0Var2 = new m0((r10.r) this.f21515x, (cfj.b) this.f21516y, (String) this.z, continuation, 6);
                m0Var2.f21514w = obj2;
                return m0Var2;
            case 7:
                m0 m0Var3 = new m0((cge.h) this.f21515x, (Function1) this.f21516y, this.z, continuation, 7);
                m0Var3.f21514w = obj2;
                return m0Var3;
            case 8:
                return new m0(8, (ci2.e) this.f21514w, (RegisterAlias$Alias) this.f21515x, (jx1.g) this.f21516y, (Function1) this.z, continuation);
            case 9:
                m0 m0Var4 = new m0((com.revolut.feature.tab.accounts.impl.ui.tab.d) this.z, continuation, 9);
                m0Var4.f21516y = obj2;
                return m0Var4;
            case 10:
                return new m0(10, (cj1.c) this.f21514w, (String) this.f21515x, (AddressFormat) this.f21516y, (String) this.z, continuation);
            case 11:
                return new m0(11, (cj1.k) this.f21514w, (AddressVerificationUseCase) this.f21515x, (Address) this.f21516y, (AddressFormat) this.z, continuation);
            case 12:
                return new m0(12, (com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) this.f21514w, (dj0.d) this.f21515x, (Boolean) this.f21516y, (hl4.g) this.z, continuation);
            case 13:
                return new m0((com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) this.f21515x, (String) this.f21516y, (String) this.z, continuation, 13);
            case 14:
                m0 m0Var5 = new m0((r10.f) this.f21516y, (String) this.z, continuation, 14);
                m0Var5.f21515x = obj2;
                return m0Var5;
            case 15:
                return new m0((cuc.r) this.f21515x, (String) this.f21516y, (String) this.z, continuation, 15);
            case 16:
                return new m0((cuc.e0) this.f21515x, (LocationDomain) this.f21516y, (wj0.b) this.z, continuation, 16);
            case 17:
                return new m0(17, (cuh.b) this.f21514w, (String) this.f21515x, (List) this.f21516y, (String) this.z, continuation);
            case 18:
                m0 m0Var6 = new m0((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.z, continuation, 18);
                m0Var6.f21516y = obj2;
                return m0Var6;
            case 19:
                return new m0(19, (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.f21514w, (xi0.b) this.f21515x, (String) this.f21516y, (wd6.i) this.z, continuation);
            case 20:
                return new m0((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f21516y, (qua.p) this.z, continuation, 20);
            case 21:
                return new m0(21, (View) this.f21514w, (View) this.f21515x, (View) this.f21516y, (Function0) this.z, continuation);
            case 22:
                m0 m0Var7 = new m0((dfj.j) this.f21516y, (String) this.z, continuation, 22);
                m0Var7.f21515x = obj2;
                return m0Var7;
            case 23:
                m0 m0Var8 = new m0((dfj.g0) this.f21515x, (w4l.k) this.f21516y, (String) this.z, continuation, 23);
                m0Var8.f21514w = obj2;
                return m0Var8;
            case 24:
                m0 m0Var9 = new m0((dfj.k0) this.z, continuation, 24);
                m0Var9.f21516y = obj2;
                return m0Var9;
            case 25:
                return new m0((i1) this.f21515x, (String) this.f21516y, (String) this.z, continuation, 25);
            case 26:
                m0 m0Var10 = new m0((q1) this.f21515x, (String) this.f21516y, (Set) this.z, continuation, 26);
                m0Var10.f21514w = obj2;
                return m0Var10;
            case 27:
                return new m0((q1) this.f21515x, (String) this.f21516y, (String) this.z, continuation, 27);
            case 28:
                return new m0(28, (dja.f) this.f21514w, (String) this.f21515x, (String) this.f21516y, (String) this.z, continuation);
            default:
                return new m0(29, (dp4.e) this.f21514w, (String) this.f21515x, (String) this.f21516y, (el4.g) this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((m0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:79:0x013e, B:82:0x014b], limit reached: 544 */
    /* JADX WARN: Path cross not found for [B:82:0x014b, B:79:0x013e], limit reached: 544 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:554:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:576:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:582:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:594:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:595:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc A[PHI: r3
      0x00fc: PHI (r3v93 java.lang.Object) = (r3v100 java.lang.Object), (r3v104 java.lang.Object) binds: [B:60:0x00f9, B:57:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x015c -> B:59:0x00ed). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5a.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj2, Serializable serializable, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21516y = obj2;
        this.z = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21515x = obj2;
        this.f21516y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
    }
}
