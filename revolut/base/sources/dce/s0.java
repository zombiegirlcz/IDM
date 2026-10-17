package dce;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import dfj.q1;
import dx4.k3;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import sgm.c1;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f112895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f112896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f112897y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, Continuation continuation, qua.p pVar) {
        super(2, continuation);
        this.u = 1;
        this.f112895w = cVar;
        this.f112896x = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f112895w
            r1 = r0
            dtl.m r1 = (dtl.m) r1
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.v
            r8 = 2
            r3 = 1
            if (r2 == 0) goto L23
            if (r2 == r3) goto L1e
            if (r2 != r8) goto L16
            yhm.o.b(r10)
            r6 = r9
            goto L61
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            yhm.o.b(r10)
            r6 = r9
            goto L46
        L23:
            yhm.o.b(r10)
            java.lang.Object r10 = r9.f112897y
            com.revolut.retail.trading.core.domain.orders.InvestOrder r10 = (com.revolut.retail.trading.core.domain.orders.InvestOrder) r10
            r2 = r3
            a3b.h r3 = new a3b.h
            r3.<init>(r1, r10)
            an1.d r4 = new an1.d
            r4.<init>(r1, r10)
            java.lang.Object r10 = r9.f112896x
            r5 = r10
            dg4.c r5 = (dg4.c) r5
            r9.v = r2
            r2 = 0
            r7 = 1
            r6 = r9
            java.lang.Object r10 = n14.k.W(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L46
            goto L60
        L46:
            nii.h r10 = (nii.h) r10
            boolean r2 = r10 instanceof nii.g
            if (r2 == 0) goto L61
            nii.g r10 = (nii.g) r10
            nii.n1 r10 = r10.f216153b
            boolean r10 = r10 instanceof nii.k1
            if (r10 == 0) goto L61
            vkm.z1 r10 = r1.f117483n
            kotlin.Unit r1 = kotlin.Unit.f186387a
            r6.v = r8
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L61
        L60:
            return r0
        L61:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dce.s0.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            lv9.d dVar = ((e0a.w) this.f112895w).u;
            dv9.l conversation = new dv9.l(((zm3.l) this.f112896x).getCode());
            P2PChatItem chatItem = (P2PChatItem) this.f112897y;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            Intrinsics.checkNotNullParameter(chatItem, "chatItem");
            dVar.f200342c.getClass();
            pfm.a aVarB = dVar.b(chatItem, conversation, "❤️");
            this.v = 1;
            if (nim.a.a(aVarB, this) == aVar) {
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

    private final Object n(Object obj2) {
        List items;
        zz9.v vVar = (zz9.v) this.f112896x;
        e0a.w wVar = (e0a.w) this.f112895w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.i iVarA = wVar.v.a(vVar.f326634b, new dv9.l(((zm3.l) this.f112897y).getCode()));
            this.v = 1;
            obj2 = nim.a.b(iVarA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        mw0.c topBar = (mw0.c) obj2;
        P2PChatItem p2PChatItem = vVar.f326634b;
        if (p2PChatItem instanceof MessageItem) {
            items = ((ju9.a) wVar.f121528l).b((MessageItem) p2PChatItem);
        } else {
            items = zhm.f0.f322471a;
        }
        rp0.l0 l0Var = wVar.f121535t;
        String str = vVar.f326633a;
        Intrinsics.h(topBar);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(topBar, "topBar");
        rp0.l0.f(l0Var, str, zi0.c.c(zhm.u.c(items), topBar, null), null, mw0.m.f209296a, 4);
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            e0a.b0 b0Var = (e0a.b0) this.f112895w;
            MessageType.Sticker sticker = (MessageType.Sticker) this.f112896x;
            zm3.a aVar2 = (zm3.a) this.f112897y;
            this.v = 1;
            if (e0a.b0.Z2(b0Var, sticker, aVar2, this) == aVar) {
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

    private final Object p(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            z1 z1Var = ((e0a.b0) this.f112895w).u;
            e0a.g0 g0Var = new e0a.g0((MessageType) this.f112896x, (String) this.f112897y);
            this.v = 1;
            if (z1Var.emit(g0Var, this) == aVar) {
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

    private final Object s(Object obj2) {
        e17.e eVar = (e17.e) this.f112896x;
        OnboardingInputDataValidator$ValidationState onboardingInputDataValidator$ValidationState = (OnboardingInputDataValidator$ValidationState) this.f112895w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            if (onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Valid) {
                tji.f fVarQ2 = eVar.q2();
                e17.d dVar = new e17.d(eVar, (c17.h) this.f112897y, null);
                this.f112895w = null;
                this.v = 1;
                if (zh9.u0.b0(fVarQ2, "SAVE_BUTTON_TAG", dVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s0((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f112895w, (qua.p) this.f112896x, (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) this.f112897y, continuation, 0);
            case 1:
                return new s0((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f112895w, continuation, (qua.p) this.f112896x);
            case 2:
                s0 s0Var = new s0((q1) this.f112896x, (String) this.f112897y, continuation, 2);
                s0Var.f112895w = obj2;
                return s0Var;
            case 3:
                return new s0((dgd.d) this.f112895w, (Set) this.f112896x, (Set) this.f112897y, continuation, 3);
            case 4:
                return new s0((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a) this.f112895w, (k3) this.f112896x, (String) this.f112897y, continuation, 4);
            case 5:
                return new s0((com.revolut.feature.pay_bills_taxes.impl.ui_payment.a) this.f112895w, (k71.c) this.f112896x, (String) this.f112897y, continuation, 5);
            case 6:
                return new s0((dja.f) this.f112895w, (String) this.f112896x, (jja.a) this.f112897y, continuation, 6);
            case 7:
                s0 s0Var2 = new s0((Flow) this.f112896x, (c1) this.f112897y, continuation, 7);
                s0Var2.f112895w = obj2;
                return s0Var2;
            case 8:
                return new s0((com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d) this.f112895w, (ExternalInstitution) this.f112896x, (String) this.f112897y, continuation, 8);
            case 9:
                return new s0((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b) this.f112896x, (aii.m) this.f112897y, continuation, 9);
            case 10:
                return new s0((dp4.e) this.f112895w, (String) this.f112896x, (String) this.f112897y, continuation, 10);
            case 11:
                return new s0((dp4.j) this.f112895w, (String) this.f112896x, (String) this.f112897y, continuation, 11);
            case 12:
                return new s0((dp4.j) this.f112895w, (dj0.d) this.f112896x, (String) this.f112897y, continuation, 12);
            case 13:
                return new s0((dp4.l) this.f112895w, (String) this.f112896x, (String) this.f112897y, continuation, 13);
            case 14:
                return new s0((zjh.c) this.f112895w, (String) this.f112896x, (String) this.f112897y, continuation, 14);
            case 15:
                return new s0((dp4.c0) this.f112895w, (String) this.f112896x, (dj0.d) this.f112897y, continuation, 15);
            case 16:
                return new s0((dp4.c1) this.f112895w, (String) this.f112896x, (rl4.a) this.f112897y, continuation, 16);
            case 17:
                return new s0((dp4.c1) this.f112895w, (String) this.f112896x, (String) this.f112897y, continuation, 17);
            case 18:
                return new s0((dp4.c1) this.f112896x, (String) this.f112897y, continuation, 18);
            case 19:
                return new s0((dp4.c1) this.f112896x, (String) this.f112897y, continuation, 19);
            case 20:
                return new s0((a5h.g) this.f112896x, (String) this.f112897y, continuation, 20);
            case 21:
                s0 s0Var3 = new s0((com.revolut.feature.insurance_credit.impl.ui.flow.a) this.f112896x, (String) this.f112897y, continuation, 21);
                s0Var3.f112895w = obj2;
                return s0Var3;
            case 22:
                return new s0((dtl.m) this.f112895w, (InvestOrder) this.f112896x, (dtl.c) this.f112897y, continuation, 22);
            case 23:
                return new s0((dtl.m) this.f112895w, (dg4.c) this.f112896x, (InvestOrder) this.f112897y, continuation, 23);
            case 24:
                return new s0((e0a.w) this.f112895w, (zm3.l) this.f112896x, (P2PChatItem) this.f112897y, continuation, 24);
            case 25:
                return new s0((e0a.w) this.f112895w, (zz9.v) this.f112896x, (zm3.l) this.f112897y, continuation, 25);
            case 26:
                return new s0((e0a.b0) this.f112895w, (MessageType.Sticker) this.f112896x, (zm3.a) this.f112897y, continuation, 26);
            case 27:
                return new s0((e0a.b0) this.f112895w, (MessageType) this.f112896x, (String) this.f112897y, continuation, 27);
            case 28:
                s0 s0Var4 = new s0((e17.e) this.f112896x, (c17.h) this.f112897y, continuation, 28);
                s0Var4.f112895w = obj2;
                return s0Var4;
            default:
                return new s0((e34.c) this.f112895w, (String) this.f112896x, (String) this.f112897y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((s0) create((OnboardingInputDataValidator$ValidationState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x08cc A[Catch: Exception -> 0x0862, CancellationException -> 0x0866, TryCatch #6 {CancellationException -> 0x0866, Exception -> 0x0862, blocks: (B:448:0x085d, B:453:0x0869, B:475:0x08ed, B:476:0x08f0, B:454:0x0870, B:463:0x08b5, B:465:0x08c1, B:472:0x08cc, B:460:0x0896), top: B:539:0x0846 }] */
    /* JADX WARN: Removed duplicated region for block: B:591:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Type inference failed for: r25v0, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v17, types: [com.revolut.feature.credit.card.api.models.limits.CreditCardLimits$Direction] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dce.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112895w = obj2;
        this.f112896x = obj3;
        this.f112897y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112896x = obj2;
        this.f112897y = obj3;
    }
}
