package dp4;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.api.resume.ResumeCheckoutFeatureConfig;
import com.revolut.feature.checkout.models.Checkout;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import e0f.r1;
import et6.h3;
import ft3.h1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f116674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f116675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f116676y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f116675x = obj2;
        this.f116674w = obj3;
        this.f116676y = obj4;
        this.z = obj5;
    }

    private final Object b(Object obj2) {
        f23.b bVar = (f23.b) this.z;
        CheckoutOrder checkoutOrder = (CheckoutOrder) this.f116676y;
        f23.m mVar = (f23.m) this.f116674w;
        n1 n1Var = (n1) this.f116675x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            if (n1Var instanceof l1) {
                this.f116675x = null;
                this.v = 1;
                if (f23.m.Z2(mVar, checkoutOrder, bVar, this) == aVar) {
                    return aVar;
                }
            } else if (n1Var instanceof m1) {
                mVar.A2(zh9.u0.c(new ResumeCheckoutFeatureConfig(new Checkout.Order(checkoutOrder), bVar.f131350a, bVar.f131351b, 4)));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c cVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c) this.f116675x;
        afa.u uVar = new afa.u(cVar, (PeerToPeerTransferData) this.f116676y, (PeerToPeerRecipient) this.z, (String) this.f116674w, (Continuation) null, 17);
        this.v = 1;
        Object objB = pu7.a.B(cVar.k, "schedule_submit", uVar, this);
        return objB == aVar ? aVar : objB;
    }

    private final Object n(Object obj2) {
        p pVar;
        fg8.m mVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            fg8.m mVar2 = (fg8.m) this.f116676y;
            String str = (String) this.f116674w;
            this.f116675x = mVar2;
            this.v = 1;
            pVar = this;
            Object objB = u68.b.b(mVar2.A, str, null, null, pVar, 14);
            if (objB == aVar) {
                return aVar;
            }
            mVar = mVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (fg8.m) this.f116675x;
            yhm.o.b(obj2);
            pVar = this;
        }
        mVar.f134953j.c(com.revolut.retail.core.navigation.a.c((NaviCommand) obj2, (FeatureCommand) pVar.z));
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        p pVar;
        sri.m mVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            fg8.g0 g0Var = (fg8.g0) this.f116676y;
            sri.m mVar2 = g0Var.f134931b;
            String str = (String) this.f116674w;
            this.f116675x = mVar2;
            this.v = 1;
            pVar = this;
            obj2 = u68.b.b(g0Var.f134932c, str, null, null, pVar, 14);
            if (obj2 == aVar) {
                return aVar;
            }
            mVar = mVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (sri.m) this.f116675x;
            yhm.o.b(obj2);
            pVar = this;
        }
        mVar.c(com.revolut.retail.core.navigation.a.c((NaviCommand) obj2, (NaviCommand) pVar.z));
        return Unit.f186387a;
    }

    private final Object p(Object obj2) {
        fo1.e0 e0Var;
        h1j.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            h1j.d dVar2 = (h1j.d) this.f116676y;
            e0Var = (fo1.e0) this.z;
            efm.d0 d0VarZ = e0Var.f136744r.z(dVar2.f148582c, dVar2.f148580a);
            this.f116675x = e0Var;
            this.f116674w = dVar2;
            this.v = 1;
            Object objB = nim.a.b(d0VarZ, this);
            if (objB == aVar) {
                return aVar;
            }
            dVar = dVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (h1j.d) this.f116674w;
            e0Var = (fo1.e0) this.f116675x;
            yhm.o.b(obj2);
        }
        io3.d dVar3 = (io3.d) obj2;
        Intrinsics.h(dVar3);
        e0Var.getClass();
        Continuation continuation = null;
        e0Var.l2(new fjd.g0(e0Var, dVar3, continuation, 9), new yi5.b(26));
        AccountId accountId = dVar.f148582c;
        fo1.e0 e0Var2 = e0Var;
        yji.l.a1(e0Var2, vo9.a.a(e0Var.f136749y, dVar3, accountId, 4), null, null, new a9h.a(e0Var2, dVar3, accountId, continuation, 8), 3);
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(0, (q) this.f116675x, (String) this.f116674w, (dj0.d) this.f116676y, (Set) this.z, continuation);
            case 1:
                return new p(1, (c0) this.f116675x, (String) this.f116674w, (String) this.f116676y, (ql4.v) this.z, continuation);
            case 2:
                return new p((c0) this.f116675x, (String) this.f116674w, (String) this.z, (dj0.d) this.f116676y, continuation);
            case 3:
                return new p(3, (c0) this.f116675x, (String) this.f116674w, (dj0.d) this.f116676y, (Set) this.z, continuation);
            case 4:
                p pVar = new p((skm.r) this.f116676y, (dpd.k) this.z, continuation, 4);
                pVar.f116674w = obj2;
                return pVar;
            case 5:
                int i = 5;
                p pVar2 = new p(i, (dwi.d) this.f116676y, (svi.s) this.z, (String) this.f116674w, continuation);
                pVar2.f116675x = obj2;
                return pVar2;
            case 6:
                p pVar3 = new p(6, (dwi.k) this.z, (String) this.f116674w, continuation);
                pVar3.f116676y = obj2;
                return pVar3;
            case 7:
                return new p((e0a.w) this.f116675x, (dv9.m) this.f116676y, (String) this.f116674w, (ChatItem) this.z, continuation);
            case 8:
                int i2 = 8;
                p pVar4 = new p(i2, (r1) this.f116676y, (String) this.z, (String) this.f116674w, continuation);
                pVar4.f116675x = obj2;
                return pVar4;
            case 9:
                int i3 = 9;
                p pVar5 = new p(i3, (r1) this.f116676y, (yte.n) this.z, (String) this.f116674w, continuation);
                pVar5.f116675x = obj2;
                return pVar5;
            case 10:
                return new p(10, (e44.b) this.f116676y, (h1) this.z, (String) this.f116674w, continuation);
            case 11:
                return new p((e44.b) this.f116674w, (h1) this.f116676y, (y14.b) this.z, continuation, 11);
            case 12:
                return new p((e44.b) this.f116674w, (h1) this.f116676y, (y14.c) this.z, continuation, 12);
            case 13:
                return new p((e44.b) this.f116674w, (h1) this.f116676y, (y14.e) this.z, continuation, 13);
            case 14:
                p pVar6 = new p((ReverywhereMiniAppName) this.f116676y, (efb.g) this.z, continuation, 14);
                pVar6.f116674w = obj2;
                return pVar6;
            case 15:
                p pVar7 = new p((List) this.f116674w, (ei3.m) this.f116676y, (AccountId) this.z, continuation, 15);
                pVar7.f116675x = obj2;
                return pVar7;
            case 16:
                p pVar8 = new p((zq.a) this.f116676y, (ProductAccountDescriptor$Value) this.z, continuation, 16);
                pVar8.f116674w = obj2;
                return pVar8;
            case 17:
                return new p(17, (com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e) this.f116675x, (String) this.f116674w, (String) this.f116676y, (String) this.z, continuation);
            case 18:
                return new p(18, (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f116675x, (CryptoAddress) this.f116674w, (List) this.f116676y, (wk5.a) this.z, continuation);
            case 19:
                p pVar9 = new p((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f116674w, (Map) this.f116676y, (nq.j0) this.z, continuation, 19);
                pVar9.f116675x = obj2;
                return pVar9;
            case 20:
                p pVar10 = new p((h3) this.z, continuation, 20);
                pVar10.f116676y = obj2;
                return pVar10;
            case 21:
                p pVar11 = new p((com.revolut.feature.card_add_to_googlepay.impl.a) this.z, continuation, 21);
                pVar11.f116676y = obj2;
                return pVar11;
            case 22:
                p pVar12 = new p(22, (ewh.v) this.z, (String) this.f116674w, continuation);
                pVar12.f116676y = obj2;
                return pVar12;
            case 23:
                p pVar13 = new p((ex3.a) this.f116676y, (h1) this.z, continuation, 23);
                pVar13.f116674w = obj2;
                return pVar13;
            case 24:
                p pVar14 = new p((f23.m) this.f116674w, (CheckoutOrder) this.f116676y, (f23.b) this.z, continuation, 24);
                pVar14.f116675x = obj2;
                return pVar14;
            case 25:
                return new p(25, (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c) this.f116675x, (String) this.f116674w, (PeerToPeerTransferData) this.f116676y, (PeerToPeerRecipient) this.z, continuation);
            case 26:
                return new p(26, (fg8.m) this.f116676y, (FeatureCommand) this.z, (String) this.f116674w, continuation);
            case 27:
                return new p(27, (fg8.g0) this.f116676y, (NaviCommand) this.z, (String) this.f116674w, continuation);
            case 28:
                return new p((h1j.d) this.f116676y, (fo1.e0) this.z, continuation, 28);
            default:
                return new p((fo1.e0) this.z, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:508:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:517:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:538:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:539:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:542:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.feature.credit.card.impl.network.CreditCardService] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp4.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f116676y = obj2;
        this.f116674w = str;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
        this.f116674w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c0 c0Var, String str, String str2, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f116675x = c0Var;
        this.f116674w = str;
        this.z = str2;
        this.f116676y = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e0a.w wVar, dv9.m mVar, String str, ChatItem chatItem, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.f116675x = wVar;
        this.f116676y = mVar;
        this.f116674w = str;
        this.z = chatItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116674w = obj2;
        this.f116676y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116676y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
    }
}
