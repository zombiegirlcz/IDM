package ugc;

import android.content.pm.PackageManager;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentController;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.feature.payments.messaging.data.api.model.Bill;
import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.Reminder;
import com.revolut.feature.payments.messaging.data.api.model.Settlement;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import dej.x0;
import h93.f0;
import h93.h0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o97.d0;
import o97.e0;
import o97.g0;
import o97.y;
import oq9.c0;
import r10.q;
import skm.p0;
import up5.s;
import uqh.l0;
import vx5.r;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements o, wc.e, xx8.e, zp0.c, yc.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f279998b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f279997a = i;
        this.f279998b = obj2;
    }

    public static boolean c(f0 card, yt8.i kycStatus) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        return (card.f150126y || card.U() || !ngm.n.p(kycStatus) || h0.e(card)) ? false : true;
    }

    public static String f(EsimGiftRecipient esimGiftRecipient) {
        String str = esimGiftRecipient != null ? esimGiftRecipient.d : null;
        return str == null ? "" : str;
    }

    public static vkm.d m(a aVar) {
        aVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        mhc.b bVar = (mhc.b) aVar.f279998b;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return bVar.d.b(Unit.f186387a, loadingStrategy);
    }

    public static String n(EsimGiftRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        String str = recipient.f100269b;
        return str == null ? recipient.f100270c : str;
    }

    public static Clause p(a aVar, String text, EsimGiftRecipient esimGiftRecipient) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        wnj.a aVar2 = (wnj.a) aVar.f279998b;
        zhm.f0 f0Var = zhm.f0.f322471a;
        x0 x0Var = x0.RECEIVER_NAME;
        return aVar2.b(text, f0Var, u.c(x0Var), q0.c(new Pair(x0Var, f(esimGiftRecipient))), null);
    }

    @Override // wc.e
    public void a(MessageDigest[] messageDigestArr, long j2, int i) {
        ByteBuffer byteBufferSlice;
        synchronized (((ByteBuffer) this.f279998b)) {
            int i2 = (int) j2;
            ((ByteBuffer) this.f279998b).position(i2);
            ((ByteBuffer) this.f279998b).limit(i2 + i);
            byteBufferSlice = ((ByteBuffer) this.f279998b).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f279997a) {
            case 4:
                break;
            case 7:
                break;
            case 10:
                break;
        }
        return ((r) this.f279998b).invoke(obj2);
    }

    @Override // xx8.e
    public boolean b(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            ((n80.e) this.f279998b).c(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public String d(koi.j sectionItem) {
        py0.d dVarD;
        lo0.a aVar = (lo0.a) this.f279998b;
        Intrinsics.checkNotNullParameter(sectionItem, "sectionItem");
        try {
            gx0.a aVar2 = sectionItem instanceof gx0.a ? (gx0.a) sectionItem : null;
            if (aVar2 != null && (dVarD = aVar2.d()) != null) {
                if (dVarD instanceof py0.c) {
                    return aVar.a(((py0.c) dVarD).f240642a, true);
                }
                if (dVarD instanceof py0.b) {
                    return aVar.b(((py0.b) dVarD).f240641a);
                }
            }
            return null;
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, "Failed to extract section name", e, h0Var);
            return null;
        }
    }

    public String e(w3g.e measure) {
        MeasureUnit measureUnit;
        Intrinsics.checkNotNullParameter(measure, "measure");
        MeasureFormat measureFormat = (MeasureFormat) this.f279998b;
        Number number = measure.f294392a;
        int i = w3g.a.f294390a[measure.f294393b.ordinal()];
        if (i == 1) {
            measureUnit = MeasureUnit.FOOT;
        } else if (i == 2) {
            measureUnit = MeasureUnit.POUND;
        } else if (i == 3) {
            measureUnit = MeasureUnit.KILOGRAM;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            measureUnit = MeasureUnit.CENTIMETER;
        }
        String measures = measureFormat.formatMeasures(new Measure(number, measureUnit));
        Intrinsics.checkNotNullExpressionValue(measures, "formatMeasures(...)");
        return measures;
    }

    public gw0.u g(GroupChatItem chatItem) {
        yu9.e eVar = (yu9.e) this.f279998b;
        Intrinsics.checkNotNullParameter(chatItem, "chatItem");
        if (chatItem instanceof Bill) {
            Bill bill = (Bill) chatItem;
            boolean z = bill.e;
            oq9.i iVar = bill.f79516h;
            return z ? eVar.b(R$drawable.uikit_icn_24_split, R$string.chat_bubble_tag_bill_lent, null) : bill.d ? yu9.e.c(eVar, R$drawable.uikit_icn_24_split, new TextLocalisedClause(R$string.bubble_tag_group_bill_you_involved, u.c(new TextClause(oi0.d.r(iVar.c()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 12) : yu9.e.c(eVar, R$drawable.uikit_icn_24_split, new TextLocalisedClause(R$string.bubble_tag_group_bill_party_added, u.c(new TextClause(oi0.d.r(iVar.c()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 12);
        }
        if (!(chatItem instanceof Settlement)) {
            if ((chatItem instanceof Reminder) || (chatItem instanceof MessageItem)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        Settlement settlement = (Settlement) chatItem;
        c0 c0Var = settlement.e;
        int i = yu9.a.f316920a[c0Var.k().ordinal()];
        if (i == 1) {
            return eVar.d(R$drawable.uikit_icn_24_check, new TextLocalisedClause(R$string.chat_bubble_tag_settlement_marked_as_paid_facelifted, null, null, 14), null, R$attr.uikit_colorStatusSuccess, R$attr.uikit_colorStatusSuccess_10, false);
        }
        if (i == 2) {
            return settlement.d ? eVar.b(R$drawable.uikit_icn_24_arrow_request, R$string.chat_bubble_tag_received, null) : settlement.f79572c == dv9.n.OUTGOING ? eVar.b(R$drawable.uikit_icn_24_arrow_send, R$string.chat_bubble_tag_sent, null) : yu9.e.c(eVar, R$drawable.uikit_icn_24_arrow_send, new TextLocalisedClause(R$string.bubble_tag_group_settlement_party_sent, u.c(new TextClause(oi0.d.r(c0Var.b()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (kotlin.Unit.f186387a == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum h(gim.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f279998b
            se3.c r0 = (se3.c) r0
            boolean r1 = r7 instanceof ve3.c
            if (r1 == 0) goto L17
            r1 = r7
            ve3.c r1 = (ve3.c) r1
            int r2 = r1.f288110w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f288110w = r2
            goto L1c
        L17:
            ve3.c r1 = new ve3.c
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f288110w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r7)
            goto L5b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            yhm.o.b(r7)
            goto L46
        L3a:
            yhm.o.b(r7)
            r1.f288110w = r5
            java.lang.Object r7 = r0.a(r1)
            if (r7 != r2) goto L46
            goto L5a
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L51
            we3.c r7 = we3.c.BOOSTS_OVERVIEW
            return r7
        L51:
            r1.f288110w = r4
            r0.getClass()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            if (r7 != r2) goto L5b
        L5a:
            return r2
        L5b:
            we3.c r7 = we3.c.BOOST_SELECTION
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ugc.a.h(gim.c):java.lang.Enum");
    }

    public List i(ArrayList orders, boolean z) {
        d0 f0Var;
        List list;
        Intrinsics.checkNotNullParameter(orders, "orders");
        ArrayList arrayList = new ArrayList(w.t(orders, 10));
        Iterator it8 = orders.iterator();
        while (it8.hasNext()) {
            InvestOrderExtended investOrderExtended = (InvestOrderExtended) it8.next();
            arrayList.add(((htl.k) ((htl.f) this.f279998b)).a(investOrderExtended, false, new y(o97.r.WEALTH_ASSETS_ORDERS, investOrderExtended, null, 60)));
        }
        if (arrayList.isEmpty()) {
            return zhm.f0.f322471a;
        }
        if (arrayList.size() > 3) {
            f0Var = new g0(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.search_block_orders_name, null, null, 14), new TextLocalisedClause(z ? com.revolut.feature.globalsearch.api.R$string.search_block_header_show_less : com.revolut.feature.globalsearch.api.R$string.search_block_header_show_more, null, null, 14), "orders-list-id", new y(o97.r.WEALTH_ASSETS_ORDERS, new clh.u("orders-list-id", !z), null, 60));
        } else {
            f0Var = new o97.f0(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.search_block_orders_name, null, null, 14), "orders-list-id");
        }
        d0 d0Var = f0Var;
        if (z) {
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            list = arrayList;
        } else {
            List listV0 = zhm.d0.V0(arrayList, 3);
            yp0.b.k(listV0, 0, 0, 0, 0, 31);
            list = listV0;
        }
        return v.k(d0Var, new e0(list));
    }

    public vkm.d j(String accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        tjb.g gVar = (tjb.g) this.f279998b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.f.b(accountId, loadingStrategy);
    }

    @Override // zp0.c
    public void k(String extractedValue, String newAmount, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(newAmount, "formattedValue");
        ya5.l lVarE3 = ((PostTerminationPlanManualRepaymentController) this.f279998b).k3();
        lVarE3.getClass();
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        lVarE3.H2(lVarE3.u, new y9d.c(newAmount, 1));
    }

    public vkm.d l(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        tjb.g gVar = (tjb.g) this.f279998b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.d.b(Unit.f186387a, loadingStrategy);
    }

    public Clause o(EsimHyperText hyperText, EsimGiftRecipient esimGiftRecipient, Integer num) {
        Intrinsics.checkNotNullParameter(hyperText, "hyperText");
        wnj.a aVar = (wnj.a) this.f279998b;
        String str = hyperText.f100276a;
        List list = hyperText.f100277b;
        x0 x0Var = x0.RECEIVER_NAME;
        return aVar.b(str, list, u.c(x0Var), q0.c(new Pair(x0Var, f(esimGiftRecipient))), num);
    }

    public KompotDestination q(InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        oc.f fVar = (oc.f) this.f279998b;
        WealthAccountType accountType = transaction.getF85125a().b();
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return fVar.a(accountType).a().b(transaction);
    }

    public Object r(String str, qib.a aVar, gim.i iVar) throws Throwable {
        tjb.g gVar = (tjb.g) this.f279998b;
        Continuation continuation = null;
        String strName = aVar != null ? aVar.name() : null;
        gVar.getClass();
        sma.f fVar = new sma.f(gVar, str, strName, continuation, 19);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, fVar, iVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.lang.String r11, com.revolut.feature.masav.impl.model.DirectDebitData r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof x59.a
            if (r0 == 0) goto L13
            r0 = r13
            x59.a r0 = (x59.a) r0
            int r1 = r0.f302921w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302921w = r1
            goto L18
        L13:
            x59.a r0 = new x59.a
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302921w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L56
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            java.lang.Object r13 = r10.f279998b
            r5 = r13
            vz1.g r5 = (vz1.g) r5
            j02.q r7 = new j02.q
            java.time.LocalDate r13 = r12.d
            dj0.d r12 = r12.e
            r7.<init>(r12, r13)
            r0.f302921w = r3
            vq5.w r4 = new vq5.w
            r8 = 0
            r9 = 14
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r11, r4, r0)
            if (r13 != r1) goto L56
            return r1
        L56:
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r13 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary) r13
            java.lang.String r11 = r13.f61992a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ugc.a.s(java.lang.String, com.revolut.feature.masav.impl.model.DirectDebitData, gim.c):java.lang.Object");
    }

    @Override // wc.e
    public long zza() {
        return ((ByteBuffer) this.f279998b).capacity();
    }

    public a(s function) {
        this.f279997a = 4;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f279998b = function;
    }

    @Override // yc.h
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo3809zza() {
        yc.b bVar = (yc.b) this.f279998b;
        bVar.b("split-install-errors", new t1j.b(bVar, 25));
    }

    public a(s function, byte b4) {
        this.f279997a = 7;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f279998b = function;
    }

    public a(r function) {
        this.f279997a = 10;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f279998b = function;
    }

    public a(r function, byte b4) {
        this.f279997a = 12;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f279998b = function;
    }

    public a(ByteBuffer byteBuffer) {
        this.f279997a = 9;
        this.f279998b = byteBuffer.slice();
    }

    public a(l0 modelExtension) {
        this.f279997a = 2;
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f279998b = modelExtension;
    }

    public a(lr.a repository) {
        this.f279997a = 24;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f279998b = repository;
    }

    public a(n80.e packageManager) {
        this.f279997a = 17;
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        this.f279998b = packageManager;
    }

    public a(se3.c repository) {
        this.f279997a = 5;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f279998b = repository;
    }

    public a(lo0.a resourceIdParser) {
        this.f279997a = 1;
        Intrinsics.checkNotNullParameter(resourceIdParser, "resourceIdParser");
        this.f279998b = resourceIdParser;
    }

    public a(rh1.b interactor) {
        this.f279997a = 22;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f279998b = interactor;
    }

    public a(u1l.b repository) {
        this.f279997a = 26;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f279998b = repository;
    }

    public a(vy9.a revPointsSpareChangeResultDialogExtension) {
        this.f279997a = 18;
        Intrinsics.checkNotNullParameter(revPointsSpareChangeResultDialogExtension, "revPointsSpareChangeResultDialogExtension");
        this.f279998b = revPointsSpareChangeResultDialogExtension;
    }

    public a(SalarySwitchAssistantService salarySwitchAssistantService) {
        this.f279997a = 6;
        Intrinsics.checkNotNullParameter(salarySwitchAssistantService, "salarySwitchAssistantService");
        this.f279998b = salarySwitchAssistantService;
    }

    public a(vz1.g apmPaymentsAuthorisationsRepository) {
        this.f279997a = 13;
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        this.f279998b = apmPaymentsAuthorisationsRepository;
    }

    public a(h12.h provider) {
        this.f279997a = 3;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f279998b = provider;
    }

    public a(mhc.b repository) {
        this.f279997a = 0;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f279998b = repository;
    }

    public a(oc.f transactionsDependenciesProvider) {
        this.f279997a = 15;
        Intrinsics.checkNotNullParameter(transactionsDependenciesProvider, "transactionsDependenciesProvider");
        this.f279998b = transactionsDependenciesProvider;
    }

    public a(wnj.a descriptorApplier) {
        this.f279997a = 23;
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        this.f279998b = descriptorApplier;
    }

    public a(a9e.b commonSubscriptionMapper, mae.e automationMapper) {
        this.f279997a = 27;
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(automationMapper, "automationMapper");
        this.f279998b = commonSubscriptionMapper;
    }

    public a(e8h.c0 recurringBuyHubCollectionRepository) {
        this.f279997a = 14;
        Intrinsics.checkNotNullParameter(recurringBuyHubCollectionRepository, "recurringBuyHubCollectionRepository");
        this.f279998b = recurringBuyHubCollectionRepository;
    }

    public a(q userRegisteredIdentitiesInteractor) {
        this.f279997a = 28;
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        this.f279998b = userRegisteredIdentitiesInteractor;
    }

    public a(tjb.g repository) {
        this.f279997a = 11;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f279998b = repository;
    }

    public a(k63.a uiConfigurationProvider, j63.a selectedCardUiConfigProvider) {
        this.f279997a = 19;
        Intrinsics.checkNotNullParameter(uiConfigurationProvider, "uiConfigurationProvider");
        Intrinsics.checkNotNullParameter(selectedCardUiConfigProvider, "selectedCardUiConfigProvider");
        this.f279998b = selectedCardUiConfigProvider;
    }

    public a(jnd.e analyticsBudgetInfoMapper, l80.e dateProvider) {
        this.f279997a = 16;
        Intrinsics.checkNotNullParameter(analyticsBudgetInfoMapper, "analyticsBudgetInfoMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f279998b = dateProvider;
    }

    public a(yu9.e paymentBubbleTagFactory) {
        this.f279997a = 25;
        Intrinsics.checkNotNullParameter(paymentBubbleTagFactory, "paymentBubbleTagFactory");
        this.f279998b = paymentBubbleTagFactory;
    }

    public a(MeasureFormat measureFormat) {
        this.f279997a = 8;
        Intrinsics.checkNotNullParameter(measureFormat, "measureFormat");
        this.f279998b = measureFormat;
    }

    public a(htl.f investOrdersCommonMapper) {
        this.f279997a = 29;
        Intrinsics.checkNotNullParameter(investOrdersCommonMapper, "investOrdersCommonMapper");
        this.f279998b = investOrdersCommonMapper;
    }
}
