package com.revolut.feature.credit.application.plugins.impl.ui.form;

import c93.j;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b;
import dj0.d;
import dk9.a0;
import e0a.w;
import f0d.l;
import f33.h;
import f33.m;
import ffk.k;
import ffk.t;
import gim.i;
import hha.u;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import m1c.l0;
import o9k.j0;
import pfk.p0;
import q8k.n;
import qh4.y;
import qua.p;
import skm.r;
import vkm.j2;
import vkm.q;
import yhm.o;
import zh9.r0;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f67767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f67768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f67769y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = 8;
        this.f67769y = eVar;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            b bVar = (b) this.f67767w;
            com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.a aVar2 = new com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.a(bVar, (d) this.f67768x, (Long) this.f67769y, null);
            this.v = 1;
            if (u0.b0(bVar.X(), "CONTINUE_BUTTON_TAG", aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        h hVar = (h) this.f67767w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            t tVar = hVar.f131884p;
            u.Companion.getClass();
            u feature = u.f152351j;
            tVar.getClass();
            Intrinsics.checkNotNullParameter(feature, "feature");
            vkm.d dVarB = rd0.e.b(nim.a.w(nim.a.w(((p0) tVar.f134850a).b(), new k(tVar, 2)), new l(tVar, feature, 29)));
            this.v = 1;
            obj2 = q.x(dVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        j jVar = ((f33.j) ((j2) hVar.f131888t.f22677a).getValue()).f131890b;
        List list = (List) ((Data) obj2).getContent();
        if (list == null) {
            list = f0.f322471a;
        }
        hVar.C2(new m((d93.b) this.f67768x, (d93.b) this.f67769y, list, jVar));
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        a aVar;
        c cVar = (c) this.f67767w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            j0 j0Var = cVar.f102350r;
            PeerToPeerTransferData peerToPeerTransferData = (PeerToPeerTransferData) this.f67768x;
            PeerToPeerRecipient peerToPeerRecipient = (PeerToPeerRecipient) this.f67769y;
            p e = cVar.o.getE();
            boolean zL2 = cVar.L2();
            this.v = 1;
            aVar = this;
            obj2 = j0Var.e3(peerToPeerTransferData, peerToPeerRecipient, e, zL2, aVar);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            aVar = this;
        }
        cVar.I2((n) obj2, (PeerToPeerTransferData) aVar.f67768x, false);
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) this.f67767w;
        ack.n nVar = new ack.n(19);
        com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.a aVar2 = new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.a(bVar, this.f67768x, (String) this.f67769y, null);
        this.v = 1;
        Object objQ = n14.k.Q(bVar, null, null, nVar, aVar2, this, 3);
        return objQ == aVar ? aVar : objQ;
    }

    private final Object p(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            jl8.e eVar = ((fo8.b) this.f67767w).f136838l;
            String value = (String) this.f67768x;
            Intrinsics.checkNotNullParameter(value, "value");
            String value2 = ((JuniorBankingProfile) this.f67769y).f77098a;
            Intrinsics.checkNotNullParameter(value2, "value");
            dl8.a aVar2 = new dl8.a(value2);
            this.v = 1;
            if (eVar.a(value, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r3.x(r10, r9) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (skm.e0.J(elm.f.f127540b, r1, r9) == r4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f67769y
            g57.g r0 = (g57.g) r0
            java.lang.Object r1 = r9.f67767w
            od0.i r1 = (od0.i) r1
            java.lang.Object r2 = r9.f67768x
            com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a r2 = (com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a) r2
            zjh.j r3 = r2.o
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r9.v
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L2a
            if (r5 == r7) goto L26
            if (r5 != r6) goto L1e
            yhm.o.b(r10)
            goto L7d
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L26:
            yhm.o.b(r10)
            goto L52
        L2a:
            yhm.o.b(r10)
            boolean r10 = r1.d()
            if (r10 == 0) goto L58
            fs6.h r10 = new fs6.h
            java.lang.Object r1 = r1.c()
            com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatReminder r1 = (com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatReminder) r1
            fs6.g r5 = new fs6.g
            boolean r6 = r0.f140670a
            fs6.b r8 = r0.f140671b
            java.time.Month r0 = r0.f140672c
            r5.<init>(r6, r8, r0)
            r10.<init>(r1, r5)
            r9.v = r7
            java.lang.Object r10 = r3.x(r10, r9)
            if (r10 != r4) goto L52
            goto L7c
        L52:
            g57.j r10 = g57.j.f140676a
            r2.C2(r10)
            goto L82
        L58:
            fs6.c r10 = new fs6.c
            fs6.b r1 = r0.f140671b
            java.time.Month r0 = r0.f140672c
            r10.<init>(r1, r0)
            r9.v = r6
            java.lang.Object r0 = r3.f322839a
            au6.y3 r0 = (au6.y3) r0
            r0.getClass()
            ald.l r1 = new ald.l
            r3 = 0
            r5 = 26
            r1.<init>(r0, r10, r3, r5)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r1, r9)
            if (r10 != r4) goto L7d
        L7c:
            return r4
        L7d:
            g57.i r10 = g57.i.f140675a
            r2.C2(r10)
        L82:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.form.a.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((m90.b) this.f67767w, (FormFlowContract$Step) this.f67768x, (cc4.c) this.f67769y, continuation, 0);
            case 1:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c) this.f67767w, (List) this.f67768x, (ukm.q) this.f67769y, continuation, 1);
            case 2:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.rollee.c) this.f67768x, (y) this.f67769y, continuation, 2);
            case 3:
                return new a((com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) this.f67767w, (String) this.f67768x, (String) this.f67769y, continuation, 3);
            case 4:
                return new a((com.revolut.feature.paynow.impl.screens.qr.a) this.f67767w, (Long) this.f67768x, (xi0.b) this.f67769y, continuation, 4);
            case 5:
                return new a((g) this.f67767w, (f7j.l) this.f67768x, (String) this.f67769y, continuation, 5);
            case 6:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e) this.f67767w, (ny3.k) this.f67768x, (Map) this.f67769y, continuation, 6);
            case 7:
                return new a((r0) this.f67768x, (a0) this.f67769y, continuation, 7);
            case 8:
                return new a((e) this.f67769y, continuation);
            case 9:
                return new a((dy6.b) this.f67767w, (FreelancerInvoiceSettings) this.f67768x, (Set) this.f67769y, continuation, 9);
            case 10:
                return new a((dy6.g) this.f67767w, (FreelancerInvoice) this.f67768x, (Set) this.f67769y, continuation, 10);
            case 11:
                return new a((w) this.f67768x, (P2PChatItem) this.f67769y, continuation, 11);
            case 12:
                return new a((e7b.h) this.f67768x, (String) this.f67769y, continuation, 12);
            case 13:
                return new a((e7e.a) this.f67768x, (k6e.d) this.f67769y, continuation, 13);
            case 14:
                return new a((eg2.n) this.f67767w, (eg2.u) this.f67768x, (io3.d) this.f67769y, continuation, 14);
            case 15:
                return new a((eg2.u) this.f67767w, (CoroutineScope) this.f67768x, (eg2.n) this.f67769y, continuation, 15);
            case 16:
                return new a((com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e) this.f67767w, (String) this.f67768x, (se6.b) this.f67769y, continuation, 16);
            case 17:
                return new a((er5.d) this.f67768x, (String) this.f67769y, continuation, 17);
            case 18:
                return new a((es.a0) this.f67767w, (Long) this.f67768x, (r) this.f67769y, continuation, 18);
            case 19:
                return new a((com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a) this.f67767w, (CardOwner) this.f67768x, (gpf.a) this.f67769y, continuation, 19);
            case 20:
                return new a((ew1.m) this.f67768x, (Alias) this.f67769y, continuation, 20);
            case 21:
                return new a((com.revolut.feature.rev_points.impl.ui.challenges.home.b) this.f67767w, (String) this.f67768x, (l0) this.f67769y, continuation, 21);
            case 22:
                return new a((b) this.f67767w, (d) this.f67768x, (Long) this.f67769y, continuation, 22);
            case 23:
                return new a((h) this.f67767w, (d93.b) this.f67768x, (d93.b) this.f67769y, continuation, 23);
            case 24:
                return new a((c) this.f67767w, (PeerToPeerTransferData) this.f67768x, (PeerToPeerRecipient) this.f67769y, continuation, 24);
            case 25:
                return new a((fia.g) this.f67768x, (Function1) this.f67769y, continuation, 25);
            case 26:
                return new a((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) this.f67767w, this.f67768x, (String) this.f67769y, continuation, 26);
            case 27:
                return new a((fo8.b) this.f67767w, (String) this.f67768x, (JuniorBankingProfile) this.f67769y, continuation, 27);
            case 28:
                return new a((od0.i) this.f67767w, (com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a) this.f67768x, (g57.g) this.f67769y, continuation, 28);
            default:
                return new a((g6k.r) this.f67767w, (String) this.f67768x, (Function1) this.f67769y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:543:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [com.revolut.core.ui_kit.models.Style, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r6v59, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.form.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(g6k.r rVar, String str, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 29;
        this.f67767w = rVar;
        this.f67768x = str;
        this.f67769y = (i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f67767w = obj2;
        this.f67768x = obj3;
        this.f67769y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f67768x = obj2;
        this.f67769y = obj3;
    }
}
