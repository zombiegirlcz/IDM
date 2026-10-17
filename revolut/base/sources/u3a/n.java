package u3a;

import cie.x0;
import com.revolut.data.model.Data;
import com.revolut.domain.models.beneficiary.BeneficiarySortingStrategy;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import om4.d0;
import te0.w;
import tx0.g4;
import vkm.q0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements d3a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f276858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3j.b f276859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lra.d f276860c;
    public final mq9.f d;
    public final ap5.b e;
    public final kgm.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jul.o f276861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final aa6.c f276862h;
    public final a31.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lx1.d f276863j;
    public final xx9.p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f276864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final co9.b f276865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f276866n;
    public final sz5.f o;

    public n(cl3.a contactsInteractor, d3j.b beneficiaryInteractor, lra.d cardsInteractor, mq9.f paymentsGroupsInteractor, ap5.b cryptoWithdrawInteractor, kgm.i usernameSearchInteractor, jul.o virtualSearchInteractor, aa6.c donationsInteractor, a31.a donationsAvailabilityInteractor, lx1.d apmContactsInteractor, xx9.p recentRecipientInteractor, h3a.o configHelper, d0 juniorContactsInteractor, co9.b counterpartyInteractor, c beneficiarySearchResultsProvider, sz5.f recipientFilterInteractor) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(paymentsGroupsInteractor, "paymentsGroupsInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(usernameSearchInteractor, "usernameSearchInteractor");
        Intrinsics.checkNotNullParameter(virtualSearchInteractor, "virtualSearchInteractor");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(configHelper, "configHelper");
        Intrinsics.checkNotNullParameter(juniorContactsInteractor, "juniorContactsInteractor");
        Intrinsics.checkNotNullParameter(counterpartyInteractor, "counterpartyInteractor");
        Intrinsics.checkNotNullParameter(beneficiarySearchResultsProvider, "beneficiarySearchResultsProvider");
        Intrinsics.checkNotNullParameter(recipientFilterInteractor, "recipientFilterInteractor");
        this.f276858a = contactsInteractor;
        this.f276859b = beneficiaryInteractor;
        this.f276860c = cardsInteractor;
        this.d = paymentsGroupsInteractor;
        this.e = cryptoWithdrawInteractor;
        this.f = usernameSearchInteractor;
        this.f276861g = virtualSearchInteractor;
        this.f276862h = donationsInteractor;
        this.i = donationsAvailabilityInteractor;
        this.f276863j = apmContactsInteractor;
        this.k = recentRecipientInteractor;
        this.f276864l = juniorContactsInteractor;
        this.f276865m = counterpartyInteractor;
        this.f276866n = beneficiarySearchResultsProvider;
        this.o = recipientFilterInteractor;
    }

    public final Flow b(d3a.a aVar, n02.b kind, String str, List list) {
        if (!list.contains(aVar)) {
            return new go.g(f0.f322471a, 2);
        }
        fy1.o oVar = (fy1.o) this.f276863j;
        Intrinsics.checkNotNullParameter(kind, "kind");
        ky1.a aVarB = oVar.f138869b.b(kind);
        return rd0.e.e(aVarB != null ? aVarB.a(str) : vkm.i.f290039a, h0.f322473a, new tc6.d(3, 19, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Set r5, com.revolut.feature.payments.who_to_transfer.api.common.RecipientCountryCurrencyConfig r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof u3a.l
            if (r0 == 0) goto L13
            r0 = r7
            u3a.l r0 = (u3a.l) r0
            int r1 = r0.f276856w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276856w = r1
            goto L18
        L13:
            u3a.l r0 = new u3a.l
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f276856w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L56
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = zhm.d0.d1(r5)
            jq9.a r7 = jq9.a.NONE
            r2 = 0
            efm.r r5 = r4.d(r2, r5, r7)
            tx0.p4 r7 = new tx0.p4
            r7.<init>(r4, r6)
            efm.r r5 = nim.a.w(r5, r7)
            r6 = 3
            efm.r r5 = m70.a.g(r5, r2, r2, r6)
            r0.f276856w = r3
            java.lang.Object r7 = nim.a.c(r5, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            java.lang.String r5 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u3a.n.c(java.util.Set, com.revolut.feature.payments.who_to_transfer.api.common.RecipientCountryCurrencyConfig, gim.c):java.lang.Object");
    }

    public final efm.r d(final String str, List searchInSections, jq9.a juniorIncludingMode) {
        boolean z;
        efm.r rVarO;
        efm.r rVarC;
        efm.r rVarZ;
        efm.r bVar;
        efm.r rVarO2;
        efm.r rVarJust;
        efm.r rVarJust2;
        efm.r rVarO3;
        efm.r rVarO4;
        efm.r rVarO5;
        efm.r rVarO6;
        efm.r rVarO7;
        Intrinsics.checkNotNullParameter(searchInSections, "searchInSections");
        Intrinsics.checkNotNullParameter(juniorIncludingMode, "juniorIncludingMode");
        boolean zContains = searchInSections.contains(d3a.a.REVOLUT);
        boolean zContains2 = searchInSections.contains(d3a.a.DEVICE);
        if (zContains || zContains2) {
            int[] iArr = k.f276855a;
            int i = iArr[juniorIncludingMode.ordinal()];
            if (i == 1) {
                z = true;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            cl3.a aVar = this.f276858a;
            if (z) {
                m70.a.c(t0.f186434a);
                rVarO = ((wl3.h) aVar).p("");
            } else {
                m70.a.c(t0.f186434a);
                rVarO = ((wl3.h) aVar).o("");
            }
            f0 f0Var = f0.f322471a;
            efm.r map = ue0.e.E(rVarO, f0Var).map(new u21.a(27, new g(2)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            cl3.c[] cVarArr = {cl3.c.ON_REVOLUT, cl3.c.NOT_REVOLUT};
            t0 t0Var = t0.f186434a;
            m70.a.c(t0Var);
            efm.r rVarL = ((wl3.h) aVar).l(cVarArr, new cl3.e(""));
            int i2 = iArr[juniorIncludingMode.ordinal()];
            if (i2 == 1) {
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                Intrinsics.checkNotNullParameter("", "searchQuery");
                d0 d0Var = this.f276864l;
                q0 q0VarN = rd0.e.n(nim.a.v(nim.a.v(((nj8.n) ((hj8.a) d0Var.f226551b)).l(w4l.h.f294642c), new u21.b(24)), new u21.b(d0Var, 25)), h0.f322473a);
                Intrinsics.checkNotNullParameter(q0VarN, "<this>");
                rVarC = rd0.e.c(new zfd.e(q0VarN, 3), kotlin.coroutines.g.f186406a);
                efm.r rVarE = mif.a.e(map, rVarL, rVarC);
                Intrinsics.checkNotNullParameter(rVarE, "<this>");
                final int i3 = 0;
                rVarZ = nim.a.z(ue0.e.p(nim.a.w(pd.b.t(nim.a.w(rVarE, new g(3)), new Function1(this) { // from class: u3a.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n f276841b;

                    {
                        this.f276841b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                i contactRecipients = (i) obj2;
                                Intrinsics.checkNotNullParameter(contactRecipients, "contacts");
                                sz5.f fVar = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(contactRecipients, "contactRecipients");
                                List list = contactRecipients.f276849a;
                                zm3.b contactGroups = contactRecipients.f276850b;
                                List list2 = contactRecipients.f276851c;
                                final r rVar = (r) fVar.f266767c;
                                Intrinsics.checkNotNullParameter(list, "list");
                                v vVar = rVar.f276875b;
                                final int i5 = 0;
                                Function1 function1 = new Function1() { // from class: u3a.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i5) {
                                            case 0:
                                                zm3.j contact = (zm3.j) obj3;
                                                Intrinsics.checkNotNullParameter(contact, "contact");
                                                return rVar.a(contact);
                                            default:
                                                e juniorContact = (e) obj3;
                                                Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                                r rVar2 = rVar;
                                                ne0.n nVar = rVar2.d;
                                                String strE = hx7.q.E(juniorContact.f276838a);
                                                Object objK0 = nVar.get(strE);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar2.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(strE, objK0);
                                                }
                                                return (String) objK0;
                                        }
                                    }
                                };
                                String str2 = str;
                                ufm.n nVarA = vVar.a(list, str2, function1);
                                Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
                                int i6 = 0;
                                ufm.n nVarA2 = vVar.a(contactGroups.f323334c, str2, new g4(1, rVar, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i6, 4));
                                ufm.n nVarA3 = vVar.a(contactGroups.d, str2, new g4(1, rVar, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i6, 5));
                                int i21 = 0;
                                efm.d0 d0VarD = efm.d0.D(nVarA2, nVarA3, new q(new p(contactGroups, str2, i21), i21));
                                Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
                                Intrinsics.checkNotNullParameter(list2, "list");
                                final int i22 = 1;
                                ufm.i iVar = new ufm.i(w.I0(nVarA, d0VarD, vVar.a(list2, str2, new Function1() { // from class: u3a.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i22) {
                                            case 0:
                                                zm3.j contact = (zm3.j) obj3;
                                                Intrinsics.checkNotNullParameter(contact, "contact");
                                                return rVar.a(contact);
                                            default:
                                                e juniorContact = (e) obj3;
                                                Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                                r rVar2 = rVar;
                                                ne0.n nVar = rVar2.d;
                                                String strE = hx7.q.E(juniorContact.f276838a);
                                                Object objK0 = nVar.get(strE);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar2.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(strE, objK0);
                                                }
                                                return (String) objK0;
                                        }
                                    }
                                })), new q(new g(15), 1), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                return iVar;
                            case 1:
                                List cards = (List) obj2;
                                Intrinsics.checkNotNullParameter(cards, "cards");
                                final sz5.f fVar2 = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(cards, "cards");
                                final int i32 = 2;
                                return ((v) fVar2.d).a(cards, str, new Function1() { // from class: u3a.s
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i32) {
                                            case 0:
                                                PaymentGroup group = (PaymentGroup) obj3;
                                                Intrinsics.checkNotNullParameter(group, "group");
                                                sz5.f fVar3 = fVar2;
                                                Map map2 = (Map) fVar3.f266766b;
                                                d dVar = d.GROUPS;
                                                Object obj4 = map2.get(dVar);
                                                if (obj4 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar);
                                                }
                                                ne0.n nVar = (ne0.n) obj4;
                                                String str3 = group.f79285a;
                                                Object objK0 = nVar.get(str3);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar3.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(str3, objK0);
                                                }
                                                return (String) objK0;
                                            case 1:
                                                CryptoAddress crypto = (CryptoAddress) obj3;
                                                Intrinsics.checkNotNullParameter(crypto, "crypto");
                                                sz5.f fVar4 = fVar2;
                                                Map map3 = (Map) fVar4.f266766b;
                                                d dVar2 = d.CRYPTO;
                                                Object obj5 = map3.get(dVar2);
                                                if (obj5 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                                }
                                                ne0.n nVar2 = (ne0.n) obj5;
                                                String str4 = crypto.f71059a;
                                                Object objK02 = nVar2.get(str4);
                                                if (objK02 == null) {
                                                    objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar4.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                    nVar2.f(str4, objK02);
                                                }
                                                return (String) objK02;
                                            default:
                                                CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                                Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                                sz5.f fVar5 = fVar2;
                                                Map map4 = (Map) fVar5.f266766b;
                                                d dVar3 = d.CARDS;
                                                Object obj6 = map4.get(dVar3);
                                                if (obj6 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                                }
                                                ne0.n nVar3 = (ne0.n) obj6;
                                                CardOwner cardOwner = cardWithStats.f81495a;
                                                String str5 = cardOwner.f81490a;
                                                Object objK03 = nVar3.get(str5);
                                                if (objK03 == null) {
                                                    objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar5.f).getValue()), "|", null, null, 0, null, 62);
                                                    nVar3.f(str5, objK03);
                                                }
                                                return (String) objK03;
                                        }
                                    }
                                });
                            case 2:
                                List cryptos = (List) obj2;
                                Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                                final sz5.f fVar3 = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                                final int i33 = 1;
                                return ((v) fVar3.d).a(cryptos, str, new Function1() { // from class: u3a.s
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i33) {
                                            case 0:
                                                PaymentGroup group = (PaymentGroup) obj3;
                                                Intrinsics.checkNotNullParameter(group, "group");
                                                sz5.f fVar32 = fVar3;
                                                Map map2 = (Map) fVar32.f266766b;
                                                d dVar = d.GROUPS;
                                                Object obj4 = map2.get(dVar);
                                                if (obj4 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar);
                                                }
                                                ne0.n nVar = (ne0.n) obj4;
                                                String str3 = group.f79285a;
                                                Object objK0 = nVar.get(str3);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(str3, objK0);
                                                }
                                                return (String) objK0;
                                            case 1:
                                                CryptoAddress crypto = (CryptoAddress) obj3;
                                                Intrinsics.checkNotNullParameter(crypto, "crypto");
                                                sz5.f fVar4 = fVar3;
                                                Map map3 = (Map) fVar4.f266766b;
                                                d dVar2 = d.CRYPTO;
                                                Object obj5 = map3.get(dVar2);
                                                if (obj5 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                                }
                                                ne0.n nVar2 = (ne0.n) obj5;
                                                String str4 = crypto.f71059a;
                                                Object objK02 = nVar2.get(str4);
                                                if (objK02 == null) {
                                                    objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar4.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                    nVar2.f(str4, objK02);
                                                }
                                                return (String) objK02;
                                            default:
                                                CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                                Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                                sz5.f fVar5 = fVar3;
                                                Map map4 = (Map) fVar5.f266766b;
                                                d dVar3 = d.CARDS;
                                                Object obj6 = map4.get(dVar3);
                                                if (obj6 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                                }
                                                ne0.n nVar3 = (ne0.n) obj6;
                                                CardOwner cardOwner = cardWithStats.f81495a;
                                                String str5 = cardOwner.f81490a;
                                                Object objK03 = nVar3.get(str5);
                                                if (objK03 == null) {
                                                    objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar5.f).getValue()), "|", null, null, 0, null, 62);
                                                    nVar3.f(str5, objK03);
                                                }
                                                return (String) objK03;
                                        }
                                    }
                                });
                            case 3:
                                List beneficiaries = (List) obj2;
                                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaryList");
                                sz5.f fVar4 = this.f276841b.o;
                                d cacheContext = d.SELF_BENEFICIARIES_PAY_ID;
                                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                                Intrinsics.checkNotNullParameter(cacheContext, "cacheContext");
                                ufm.i iVar2 = new ufm.i(((v) fVar4.d).a(beneficiaries, str, new twg.a(fVar4, cacheContext, 19)), new u21.a(28, new g(8)), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                return iVar2;
                            default:
                                List groups = (List) obj2;
                                Intrinsics.checkNotNullParameter(groups, "groups");
                                final sz5.f fVar5 = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(groups, "groups");
                                final int i43 = 0;
                                return ((v) fVar5.d).a(groups, str, new Function1() { // from class: u3a.s
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i43) {
                                            case 0:
                                                PaymentGroup group = (PaymentGroup) obj3;
                                                Intrinsics.checkNotNullParameter(group, "group");
                                                sz5.f fVar32 = fVar5;
                                                Map map2 = (Map) fVar32.f266766b;
                                                d dVar = d.GROUPS;
                                                Object obj4 = map2.get(dVar);
                                                if (obj4 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar);
                                                }
                                                ne0.n nVar = (ne0.n) obj4;
                                                String str3 = group.f79285a;
                                                Object objK0 = nVar.get(str3);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(str3, objK0);
                                                }
                                                return (String) objK0;
                                            case 1:
                                                CryptoAddress crypto = (CryptoAddress) obj3;
                                                Intrinsics.checkNotNullParameter(crypto, "crypto");
                                                sz5.f fVar42 = fVar5;
                                                Map map3 = (Map) fVar42.f266766b;
                                                d dVar2 = d.CRYPTO;
                                                Object obj5 = map3.get(dVar2);
                                                if (obj5 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                                }
                                                ne0.n nVar2 = (ne0.n) obj5;
                                                String str4 = crypto.f71059a;
                                                Object objK02 = nVar2.get(str4);
                                                if (objK02 == null) {
                                                    objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                    nVar2.f(str4, objK02);
                                                }
                                                return (String) objK02;
                                            default:
                                                CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                                Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                                sz5.f fVar52 = fVar5;
                                                Map map4 = (Map) fVar52.f266766b;
                                                d dVar3 = d.CARDS;
                                                Object obj6 = map4.get(dVar3);
                                                if (obj6 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                                }
                                                ne0.n nVar3 = (ne0.n) obj6;
                                                CardOwner cardOwner = cardWithStats.f81495a;
                                                String str5 = cardOwner.f81490a;
                                                Object objK03 = nVar3.get(str5);
                                                if (objK03 == null) {
                                                    objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                    nVar3.f(str5, objK03);
                                                }
                                                return (String) objK03;
                                        }
                                    }
                                });
                        }
                    }
                }), new x0(zContains, z, zContains2, 1)), h0.f322473a), new u21.b(29));
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                Intrinsics.checkNotNullParameter("", "searchQuery");
                d0 d0Var2 = this.f276864l;
                q0 q0VarN2 = rd0.e.n(nim.a.v(nim.a.v(((nj8.n) ((hj8.a) d0Var2.f226551b)).l(w4l.h.f294642c), new u21.b(24)), new u21.b(d0Var2, 25)), h0.f322473a);
                Intrinsics.checkNotNullParameter(q0VarN2, "<this>");
                rVarC = rd0.e.c(new zfd.e(q0VarN2, 3), kotlin.coroutines.g.f186406a);
                efm.r rVarE2 = mif.a.e(map, rVarL, rVarC);
                Intrinsics.checkNotNullParameter(rVarE2, "<this>");
                final int i32 = 0;
                rVarZ = nim.a.z(ue0.e.p(nim.a.w(pd.b.t(nim.a.w(rVarE2, new g(3)), new Function1(this) { // from class: u3a.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n f276841b;

                    {
                        this.f276841b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i32) {
                            case 0:
                                i contactRecipients = (i) obj2;
                                Intrinsics.checkNotNullParameter(contactRecipients, "contacts");
                                sz5.f fVar = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(contactRecipients, "contactRecipients");
                                List list = contactRecipients.f276849a;
                                zm3.b contactGroups = contactRecipients.f276850b;
                                List list2 = contactRecipients.f276851c;
                                final r rVar = (r) fVar.f266767c;
                                Intrinsics.checkNotNullParameter(list, "list");
                                v vVar = rVar.f276875b;
                                final int i5 = 0;
                                Function1 function1 = new Function1() { // from class: u3a.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i5) {
                                            case 0:
                                                zm3.j contact = (zm3.j) obj3;
                                                Intrinsics.checkNotNullParameter(contact, "contact");
                                                return rVar.a(contact);
                                            default:
                                                e juniorContact = (e) obj3;
                                                Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                                r rVar2 = rVar;
                                                ne0.n nVar = rVar2.d;
                                                String strE = hx7.q.E(juniorContact.f276838a);
                                                Object objK0 = nVar.get(strE);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar2.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(strE, objK0);
                                                }
                                                return (String) objK0;
                                        }
                                    }
                                };
                                String str2 = str;
                                ufm.n nVarA = vVar.a(list, str2, function1);
                                Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
                                int i6 = 0;
                                ufm.n nVarA2 = vVar.a(contactGroups.f323334c, str2, new g4(1, rVar, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i6, 4));
                                ufm.n nVarA3 = vVar.a(contactGroups.d, str2, new g4(1, rVar, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i6, 5));
                                int i21 = 0;
                                efm.d0 d0VarD = efm.d0.D(nVarA2, nVarA3, new q(new p(contactGroups, str2, i21), i21));
                                Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
                                Intrinsics.checkNotNullParameter(list2, "list");
                                final int i22 = 1;
                                ufm.i iVar = new ufm.i(w.I0(nVarA, d0VarD, vVar.a(list2, str2, new Function1() { // from class: u3a.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i22) {
                                            case 0:
                                                zm3.j contact = (zm3.j) obj3;
                                                Intrinsics.checkNotNullParameter(contact, "contact");
                                                return rVar.a(contact);
                                            default:
                                                e juniorContact = (e) obj3;
                                                Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                                r rVar2 = rVar;
                                                ne0.n nVar = rVar2.d;
                                                String strE = hx7.q.E(juniorContact.f276838a);
                                                Object objK0 = nVar.get(strE);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar2.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(strE, objK0);
                                                }
                                                return (String) objK0;
                                        }
                                    }
                                })), new q(new g(15), 1), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                return iVar;
                            case 1:
                                List cards = (List) obj2;
                                Intrinsics.checkNotNullParameter(cards, "cards");
                                final sz5.f fVar2 = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(cards, "cards");
                                final int i322 = 2;
                                return ((v) fVar2.d).a(cards, str, new Function1() { // from class: u3a.s
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i322) {
                                            case 0:
                                                PaymentGroup group = (PaymentGroup) obj3;
                                                Intrinsics.checkNotNullParameter(group, "group");
                                                sz5.f fVar32 = fVar2;
                                                Map map2 = (Map) fVar32.f266766b;
                                                d dVar = d.GROUPS;
                                                Object obj4 = map2.get(dVar);
                                                if (obj4 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar);
                                                }
                                                ne0.n nVar = (ne0.n) obj4;
                                                String str3 = group.f79285a;
                                                Object objK0 = nVar.get(str3);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(str3, objK0);
                                                }
                                                return (String) objK0;
                                            case 1:
                                                CryptoAddress crypto = (CryptoAddress) obj3;
                                                Intrinsics.checkNotNullParameter(crypto, "crypto");
                                                sz5.f fVar42 = fVar2;
                                                Map map3 = (Map) fVar42.f266766b;
                                                d dVar2 = d.CRYPTO;
                                                Object obj5 = map3.get(dVar2);
                                                if (obj5 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                                }
                                                ne0.n nVar2 = (ne0.n) obj5;
                                                String str4 = crypto.f71059a;
                                                Object objK02 = nVar2.get(str4);
                                                if (objK02 == null) {
                                                    objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                    nVar2.f(str4, objK02);
                                                }
                                                return (String) objK02;
                                            default:
                                                CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                                Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                                sz5.f fVar52 = fVar2;
                                                Map map4 = (Map) fVar52.f266766b;
                                                d dVar3 = d.CARDS;
                                                Object obj6 = map4.get(dVar3);
                                                if (obj6 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                                }
                                                ne0.n nVar3 = (ne0.n) obj6;
                                                CardOwner cardOwner = cardWithStats.f81495a;
                                                String str5 = cardOwner.f81490a;
                                                Object objK03 = nVar3.get(str5);
                                                if (objK03 == null) {
                                                    objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                    nVar3.f(str5, objK03);
                                                }
                                                return (String) objK03;
                                        }
                                    }
                                });
                            case 2:
                                List cryptos = (List) obj2;
                                Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                                final sz5.f fVar3 = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                                final int i33 = 1;
                                return ((v) fVar3.d).a(cryptos, str, new Function1() { // from class: u3a.s
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i33) {
                                            case 0:
                                                PaymentGroup group = (PaymentGroup) obj3;
                                                Intrinsics.checkNotNullParameter(group, "group");
                                                sz5.f fVar32 = fVar3;
                                                Map map2 = (Map) fVar32.f266766b;
                                                d dVar = d.GROUPS;
                                                Object obj4 = map2.get(dVar);
                                                if (obj4 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar);
                                                }
                                                ne0.n nVar = (ne0.n) obj4;
                                                String str3 = group.f79285a;
                                                Object objK0 = nVar.get(str3);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(str3, objK0);
                                                }
                                                return (String) objK0;
                                            case 1:
                                                CryptoAddress crypto = (CryptoAddress) obj3;
                                                Intrinsics.checkNotNullParameter(crypto, "crypto");
                                                sz5.f fVar42 = fVar3;
                                                Map map3 = (Map) fVar42.f266766b;
                                                d dVar2 = d.CRYPTO;
                                                Object obj5 = map3.get(dVar2);
                                                if (obj5 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                                }
                                                ne0.n nVar2 = (ne0.n) obj5;
                                                String str4 = crypto.f71059a;
                                                Object objK02 = nVar2.get(str4);
                                                if (objK02 == null) {
                                                    objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                    nVar2.f(str4, objK02);
                                                }
                                                return (String) objK02;
                                            default:
                                                CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                                Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                                sz5.f fVar52 = fVar3;
                                                Map map4 = (Map) fVar52.f266766b;
                                                d dVar3 = d.CARDS;
                                                Object obj6 = map4.get(dVar3);
                                                if (obj6 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                                }
                                                ne0.n nVar3 = (ne0.n) obj6;
                                                CardOwner cardOwner = cardWithStats.f81495a;
                                                String str5 = cardOwner.f81490a;
                                                Object objK03 = nVar3.get(str5);
                                                if (objK03 == null) {
                                                    objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                    nVar3.f(str5, objK03);
                                                }
                                                return (String) objK03;
                                        }
                                    }
                                });
                            case 3:
                                List beneficiaries = (List) obj2;
                                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaryList");
                                sz5.f fVar4 = this.f276841b.o;
                                d cacheContext = d.SELF_BENEFICIARIES_PAY_ID;
                                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                                Intrinsics.checkNotNullParameter(cacheContext, "cacheContext");
                                ufm.i iVar2 = new ufm.i(((v) fVar4.d).a(beneficiaries, str, new twg.a(fVar4, cacheContext, 19)), new u21.a(28, new g(8)), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                return iVar2;
                            default:
                                List groups = (List) obj2;
                                Intrinsics.checkNotNullParameter(groups, "groups");
                                final sz5.f fVar5 = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(groups, "groups");
                                final int i43 = 0;
                                return ((v) fVar5.d).a(groups, str, new Function1() { // from class: u3a.s
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i43) {
                                            case 0:
                                                PaymentGroup group = (PaymentGroup) obj3;
                                                Intrinsics.checkNotNullParameter(group, "group");
                                                sz5.f fVar32 = fVar5;
                                                Map map2 = (Map) fVar32.f266766b;
                                                d dVar = d.GROUPS;
                                                Object obj4 = map2.get(dVar);
                                                if (obj4 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar);
                                                }
                                                ne0.n nVar = (ne0.n) obj4;
                                                String str3 = group.f79285a;
                                                Object objK0 = nVar.get(str3);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(str3, objK0);
                                                }
                                                return (String) objK0;
                                            case 1:
                                                CryptoAddress crypto = (CryptoAddress) obj3;
                                                Intrinsics.checkNotNullParameter(crypto, "crypto");
                                                sz5.f fVar42 = fVar5;
                                                Map map3 = (Map) fVar42.f266766b;
                                                d dVar2 = d.CRYPTO;
                                                Object obj5 = map3.get(dVar2);
                                                if (obj5 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                                }
                                                ne0.n nVar2 = (ne0.n) obj5;
                                                String str4 = crypto.f71059a;
                                                Object objK02 = nVar2.get(str4);
                                                if (objK02 == null) {
                                                    objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                    nVar2.f(str4, objK02);
                                                }
                                                return (String) objK02;
                                            default:
                                                CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                                Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                                sz5.f fVar52 = fVar5;
                                                Map map4 = (Map) fVar52.f266766b;
                                                d dVar3 = d.CARDS;
                                                Object obj6 = map4.get(dVar3);
                                                if (obj6 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                                }
                                                ne0.n nVar3 = (ne0.n) obj6;
                                                CardOwner cardOwner = cardWithStats.f81495a;
                                                String str5 = cardOwner.f81490a;
                                                Object objK03 = nVar3.get(str5);
                                                if (objK03 == null) {
                                                    objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                    nVar3.f(str5, objK03);
                                                }
                                                return (String) objK03;
                                        }
                                    }
                                });
                        }
                    }
                }), new x0(zContains, z, zContains2, 1)), h0.f322473a), new u21.b(29));
            } else {
                rVarC = efm.r.just(new Data(f0Var, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(rVarC, "just(...)");
                efm.r rVarE22 = mif.a.e(map, rVarL, rVarC);
                Intrinsics.checkNotNullParameter(rVarE22, "<this>");
                final int i322 = 0;
                rVarZ = nim.a.z(ue0.e.p(nim.a.w(pd.b.t(nim.a.w(rVarE22, new g(3)), new Function1(this) { // from class: u3a.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n f276841b;

                    {
                        this.f276841b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i322) {
                            case 0:
                                i contactRecipients = (i) obj2;
                                Intrinsics.checkNotNullParameter(contactRecipients, "contacts");
                                sz5.f fVar = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(contactRecipients, "contactRecipients");
                                List list = contactRecipients.f276849a;
                                zm3.b contactGroups = contactRecipients.f276850b;
                                List list2 = contactRecipients.f276851c;
                                final r rVar = (r) fVar.f266767c;
                                Intrinsics.checkNotNullParameter(list, "list");
                                v vVar = rVar.f276875b;
                                final int i5 = 0;
                                Function1 function1 = new Function1() { // from class: u3a.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i5) {
                                            case 0:
                                                zm3.j contact = (zm3.j) obj3;
                                                Intrinsics.checkNotNullParameter(contact, "contact");
                                                return rVar.a(contact);
                                            default:
                                                e juniorContact = (e) obj3;
                                                Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                                r rVar2 = rVar;
                                                ne0.n nVar = rVar2.d;
                                                String strE = hx7.q.E(juniorContact.f276838a);
                                                Object objK0 = nVar.get(strE);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar2.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(strE, objK0);
                                                }
                                                return (String) objK0;
                                        }
                                    }
                                };
                                String str2 = str;
                                ufm.n nVarA = vVar.a(list, str2, function1);
                                Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
                                int i6 = 0;
                                ufm.n nVarA2 = vVar.a(contactGroups.f323334c, str2, new g4(1, rVar, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i6, 4));
                                ufm.n nVarA3 = vVar.a(contactGroups.d, str2, new g4(1, rVar, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i6, 5));
                                int i21 = 0;
                                efm.d0 d0VarD = efm.d0.D(nVarA2, nVarA3, new q(new p(contactGroups, str2, i21), i21));
                                Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
                                Intrinsics.checkNotNullParameter(list2, "list");
                                final int i22 = 1;
                                ufm.i iVar = new ufm.i(w.I0(nVarA, d0VarD, vVar.a(list2, str2, new Function1() { // from class: u3a.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i22) {
                                            case 0:
                                                zm3.j contact = (zm3.j) obj3;
                                                Intrinsics.checkNotNullParameter(contact, "contact");
                                                return rVar.a(contact);
                                            default:
                                                e juniorContact = (e) obj3;
                                                Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                                r rVar2 = rVar;
                                                ne0.n nVar = rVar2.d;
                                                String strE = hx7.q.E(juniorContact.f276838a);
                                                Object objK0 = nVar.get(strE);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar2.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(strE, objK0);
                                                }
                                                return (String) objK0;
                                        }
                                    }
                                })), new q(new g(15), 1), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                return iVar;
                            case 1:
                                List cards = (List) obj2;
                                Intrinsics.checkNotNullParameter(cards, "cards");
                                final sz5.f fVar2 = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(cards, "cards");
                                final int i3222 = 2;
                                return ((v) fVar2.d).a(cards, str, new Function1() { // from class: u3a.s
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i3222) {
                                            case 0:
                                                PaymentGroup group = (PaymentGroup) obj3;
                                                Intrinsics.checkNotNullParameter(group, "group");
                                                sz5.f fVar32 = fVar2;
                                                Map map2 = (Map) fVar32.f266766b;
                                                d dVar = d.GROUPS;
                                                Object obj4 = map2.get(dVar);
                                                if (obj4 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar);
                                                }
                                                ne0.n nVar = (ne0.n) obj4;
                                                String str3 = group.f79285a;
                                                Object objK0 = nVar.get(str3);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(str3, objK0);
                                                }
                                                return (String) objK0;
                                            case 1:
                                                CryptoAddress crypto = (CryptoAddress) obj3;
                                                Intrinsics.checkNotNullParameter(crypto, "crypto");
                                                sz5.f fVar42 = fVar2;
                                                Map map3 = (Map) fVar42.f266766b;
                                                d dVar2 = d.CRYPTO;
                                                Object obj5 = map3.get(dVar2);
                                                if (obj5 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                                }
                                                ne0.n nVar2 = (ne0.n) obj5;
                                                String str4 = crypto.f71059a;
                                                Object objK02 = nVar2.get(str4);
                                                if (objK02 == null) {
                                                    objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                    nVar2.f(str4, objK02);
                                                }
                                                return (String) objK02;
                                            default:
                                                CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                                Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                                sz5.f fVar52 = fVar2;
                                                Map map4 = (Map) fVar52.f266766b;
                                                d dVar3 = d.CARDS;
                                                Object obj6 = map4.get(dVar3);
                                                if (obj6 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                                }
                                                ne0.n nVar3 = (ne0.n) obj6;
                                                CardOwner cardOwner = cardWithStats.f81495a;
                                                String str5 = cardOwner.f81490a;
                                                Object objK03 = nVar3.get(str5);
                                                if (objK03 == null) {
                                                    objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                    nVar3.f(str5, objK03);
                                                }
                                                return (String) objK03;
                                        }
                                    }
                                });
                            case 2:
                                List cryptos = (List) obj2;
                                Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                                final sz5.f fVar3 = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                                final int i33 = 1;
                                return ((v) fVar3.d).a(cryptos, str, new Function1() { // from class: u3a.s
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i33) {
                                            case 0:
                                                PaymentGroup group = (PaymentGroup) obj3;
                                                Intrinsics.checkNotNullParameter(group, "group");
                                                sz5.f fVar32 = fVar3;
                                                Map map2 = (Map) fVar32.f266766b;
                                                d dVar = d.GROUPS;
                                                Object obj4 = map2.get(dVar);
                                                if (obj4 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar);
                                                }
                                                ne0.n nVar = (ne0.n) obj4;
                                                String str3 = group.f79285a;
                                                Object objK0 = nVar.get(str3);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(str3, objK0);
                                                }
                                                return (String) objK0;
                                            case 1:
                                                CryptoAddress crypto = (CryptoAddress) obj3;
                                                Intrinsics.checkNotNullParameter(crypto, "crypto");
                                                sz5.f fVar42 = fVar3;
                                                Map map3 = (Map) fVar42.f266766b;
                                                d dVar2 = d.CRYPTO;
                                                Object obj5 = map3.get(dVar2);
                                                if (obj5 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                                }
                                                ne0.n nVar2 = (ne0.n) obj5;
                                                String str4 = crypto.f71059a;
                                                Object objK02 = nVar2.get(str4);
                                                if (objK02 == null) {
                                                    objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                    nVar2.f(str4, objK02);
                                                }
                                                return (String) objK02;
                                            default:
                                                CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                                Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                                sz5.f fVar52 = fVar3;
                                                Map map4 = (Map) fVar52.f266766b;
                                                d dVar3 = d.CARDS;
                                                Object obj6 = map4.get(dVar3);
                                                if (obj6 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                                }
                                                ne0.n nVar3 = (ne0.n) obj6;
                                                CardOwner cardOwner = cardWithStats.f81495a;
                                                String str5 = cardOwner.f81490a;
                                                Object objK03 = nVar3.get(str5);
                                                if (objK03 == null) {
                                                    objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                    nVar3.f(str5, objK03);
                                                }
                                                return (String) objK03;
                                        }
                                    }
                                });
                            case 3:
                                List beneficiaries = (List) obj2;
                                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaryList");
                                sz5.f fVar4 = this.f276841b.o;
                                d cacheContext = d.SELF_BENEFICIARIES_PAY_ID;
                                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                                Intrinsics.checkNotNullParameter(cacheContext, "cacheContext");
                                ufm.i iVar2 = new ufm.i(((v) fVar4.d).a(beneficiaries, str, new twg.a(fVar4, cacheContext, 19)), new u21.a(28, new g(8)), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                return iVar2;
                            default:
                                List groups = (List) obj2;
                                Intrinsics.checkNotNullParameter(groups, "groups");
                                final sz5.f fVar5 = this.f276841b.o;
                                Intrinsics.checkNotNullParameter(groups, "groups");
                                final int i43 = 0;
                                return ((v) fVar5.d).a(groups, str, new Function1() { // from class: u3a.s
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) throws IOException {
                                        switch (i43) {
                                            case 0:
                                                PaymentGroup group = (PaymentGroup) obj3;
                                                Intrinsics.checkNotNullParameter(group, "group");
                                                sz5.f fVar32 = fVar5;
                                                Map map2 = (Map) fVar32.f266766b;
                                                d dVar = d.GROUPS;
                                                Object obj4 = map2.get(dVar);
                                                if (obj4 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar);
                                                }
                                                ne0.n nVar = (ne0.n) obj4;
                                                String str3 = group.f79285a;
                                                Object objK0 = nVar.get(str3);
                                                if (objK0 == null) {
                                                    objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                    nVar.f(str3, objK0);
                                                }
                                                return (String) objK0;
                                            case 1:
                                                CryptoAddress crypto = (CryptoAddress) obj3;
                                                Intrinsics.checkNotNullParameter(crypto, "crypto");
                                                sz5.f fVar42 = fVar5;
                                                Map map3 = (Map) fVar42.f266766b;
                                                d dVar2 = d.CRYPTO;
                                                Object obj5 = map3.get(dVar2);
                                                if (obj5 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                                }
                                                ne0.n nVar2 = (ne0.n) obj5;
                                                String str4 = crypto.f71059a;
                                                Object objK02 = nVar2.get(str4);
                                                if (objK02 == null) {
                                                    objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                    nVar2.f(str4, objK02);
                                                }
                                                return (String) objK02;
                                            default:
                                                CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                                Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                                sz5.f fVar52 = fVar5;
                                                Map map4 = (Map) fVar52.f266766b;
                                                d dVar3 = d.CARDS;
                                                Object obj6 = map4.get(dVar3);
                                                if (obj6 == null) {
                                                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                                }
                                                ne0.n nVar3 = (ne0.n) obj6;
                                                CardOwner cardOwner = cardWithStats.f81495a;
                                                String str5 = cardOwner.f81490a;
                                                Object objK03 = nVar3.get(str5);
                                                if (objK03 == null) {
                                                    objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                    nVar3.f(str5, objK03);
                                                }
                                                return (String) objK03;
                                        }
                                    }
                                });
                        }
                    }
                }), new x0(zContains, z, zContains2, 1)), h0.f322473a), new u21.b(29));
            }
        } else {
            rVarZ = efm.r.just(new Data(new j(0), null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarZ, "just(...)");
        }
        efm.r rVar = rVarZ;
        Intrinsics.checkNotNullParameter(searchInSections, "searchInSections");
        List<d3a.a> list = searchInSections;
        if ((list instanceof Collection) && list.isEmpty()) {
            c.Companion.getClass();
            f0 f0Var2 = f0.f322471a;
            bVar = w.h(zi0.c.P(new a(f0Var2, f0Var2, f0Var2), false, null, 3));
        } else {
            for (d3a.a aVar2 : list) {
                d3a.a[] elements = {d3a.a.ACCOUNTS, d3a.a.APM_PIX, d3a.a.MOBILE_WALLET};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (kotlin.collections.d.y0(elements).contains(aVar2)) {
                    c cVar = this.f276866n;
                    bVar = new sfm.b(((ty1.b) cVar.f276837c).c(yoj.c.PIX_BRL), new u21.a(24, new twg.a(zi0.c.o(nim.a.z(ue0.e.p(pd.b.t(w2j.a.d(cVar.f276835a, null, true, BeneficiarySortingStrategy.NO_SORTING, 1), new twg.a(cVar, str, 16)), h0.f322473a), new u21.b(22))), cVar, 17)), 2);
                    Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                    break;
                }
            }
            c.Companion.getClass();
            f0 f0Var22 = f0.f322471a;
            bVar = w.h(zi0.c.P(new a(f0Var22, f0Var22, f0Var22), false, null, 3));
        }
        efm.r rVar2 = bVar;
        if (searchInSections.contains(d3a.a.CARDS)) {
            final int i5 = 1;
            rVarO2 = zi0.c.o(nim.a.z(ue0.e.p(pd.b.t(this.f276860c.c(), new Function1(this) { // from class: u3a.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f276841b;

                {
                    this.f276841b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            i contactRecipients = (i) obj2;
                            Intrinsics.checkNotNullParameter(contactRecipients, "contacts");
                            sz5.f fVar = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(contactRecipients, "contactRecipients");
                            List list2 = contactRecipients.f276849a;
                            zm3.b contactGroups = contactRecipients.f276850b;
                            List list22 = contactRecipients.f276851c;
                            final r rVar3 = (r) fVar.f266767c;
                            Intrinsics.checkNotNullParameter(list2, "list");
                            v vVar = rVar3.f276875b;
                            final int i59 = 0;
                            Function1 function1 = new Function1() { // from class: u3a.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i59) {
                                        case 0:
                                            zm3.j contact = (zm3.j) obj3;
                                            Intrinsics.checkNotNullParameter(contact, "contact");
                                            return rVar3.a(contact);
                                        default:
                                            e juniorContact = (e) obj3;
                                            Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                            r rVar22 = rVar3;
                                            ne0.n nVar = rVar22.d;
                                            String strE = hx7.q.E(juniorContact.f276838a);
                                            Object objK0 = nVar.get(strE);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar22.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(strE, objK0);
                                            }
                                            return (String) objK0;
                                    }
                                }
                            };
                            String str2 = str;
                            ufm.n nVarA = vVar.a(list2, str2, function1);
                            Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
                            int i6 = 0;
                            ufm.n nVarA2 = vVar.a(contactGroups.f323334c, str2, new g4(1, rVar3, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i6, 4));
                            ufm.n nVarA3 = vVar.a(contactGroups.d, str2, new g4(1, rVar3, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i6, 5));
                            int i21 = 0;
                            efm.d0 d0VarD = efm.d0.D(nVarA2, nVarA3, new q(new p(contactGroups, str2, i21), i21));
                            Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
                            Intrinsics.checkNotNullParameter(list22, "list");
                            final int i22 = 1;
                            ufm.i iVar = new ufm.i(w.I0(nVarA, d0VarD, vVar.a(list22, str2, new Function1() { // from class: u3a.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i22) {
                                        case 0:
                                            zm3.j contact = (zm3.j) obj3;
                                            Intrinsics.checkNotNullParameter(contact, "contact");
                                            return rVar3.a(contact);
                                        default:
                                            e juniorContact = (e) obj3;
                                            Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                            r rVar22 = rVar3;
                                            ne0.n nVar = rVar22.d;
                                            String strE = hx7.q.E(juniorContact.f276838a);
                                            Object objK0 = nVar.get(strE);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar22.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(strE, objK0);
                                            }
                                            return (String) objK0;
                                    }
                                }
                            })), new q(new g(15), 1), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        case 1:
                            List cards = (List) obj2;
                            Intrinsics.checkNotNullParameter(cards, "cards");
                            final sz5.f fVar2 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(cards, "cards");
                            final int i3222 = 2;
                            return ((v) fVar2.d).a(cards, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i3222) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar2;
                                            Map map2 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map2.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar2;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar2;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                        case 2:
                            List cryptos = (List) obj2;
                            Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                            final sz5.f fVar3 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                            final int i33 = 1;
                            return ((v) fVar3.d).a(cryptos, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i33) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar3;
                                            Map map2 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map2.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar3;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar3;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                        case 3:
                            List beneficiaries = (List) obj2;
                            Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaryList");
                            sz5.f fVar4 = this.f276841b.o;
                            d cacheContext = d.SELF_BENEFICIARIES_PAY_ID;
                            Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                            Intrinsics.checkNotNullParameter(cacheContext, "cacheContext");
                            ufm.i iVar2 = new ufm.i(((v) fVar4.d).a(beneficiaries, str, new twg.a(fVar4, cacheContext, 19)), new u21.a(28, new g(8)), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        default:
                            List groups = (List) obj2;
                            Intrinsics.checkNotNullParameter(groups, "groups");
                            final sz5.f fVar5 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(groups, "groups");
                            final int i43 = 0;
                            return ((v) fVar5.d).a(groups, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i43) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar5;
                                            Map map2 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map2.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar5;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar5;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                    }
                }
            }), h0.f322473a), new g(9)));
        } else {
            rVarO2 = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarO2, "just(...)");
        }
        efm.r rVar3 = rVarO2;
        if (!searchInSections.contains(d3a.a.REVTAG) || str == null || kotlin.text.d0.W(str)) {
            rVarJust = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        } else {
            rVarJust = this.f.q(str).map(new u21.a(26, new u21.b(28)));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "map(...)");
        }
        efm.r rVar4 = rVarJust;
        if (!searchInSections.contains(d3a.a.VIRTUAL_CONTACTS) || str == null || kotlin.text.d0.W(str)) {
            rVarJust2 = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
        } else {
            efm.r map2 = this.f276861g.p(str).map(new u21.a(29, new g(11)));
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            rVarJust2 = zi0.c.o(map2);
        }
        efm.r rVar5 = rVarJust2;
        if (searchInSections.contains(d3a.a.GROUPS)) {
            final int i6 = 4;
            rVarO3 = zi0.c.o(nim.a.z(ue0.e.p(pd.b.t(((mr9.a) this.d).i(false), new Function1(this) { // from class: u3a.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f276841b;

                {
                    this.f276841b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i6) {
                        case 0:
                            i contactRecipients = (i) obj2;
                            Intrinsics.checkNotNullParameter(contactRecipients, "contacts");
                            sz5.f fVar = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(contactRecipients, "contactRecipients");
                            List list2 = contactRecipients.f276849a;
                            zm3.b contactGroups = contactRecipients.f276850b;
                            List list22 = contactRecipients.f276851c;
                            final r rVar32 = (r) fVar.f266767c;
                            Intrinsics.checkNotNullParameter(list2, "list");
                            v vVar = rVar32.f276875b;
                            final int i59 = 0;
                            Function1 function1 = new Function1() { // from class: u3a.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i59) {
                                        case 0:
                                            zm3.j contact = (zm3.j) obj3;
                                            Intrinsics.checkNotNullParameter(contact, "contact");
                                            return rVar32.a(contact);
                                        default:
                                            e juniorContact = (e) obj3;
                                            Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                            r rVar22 = rVar32;
                                            ne0.n nVar = rVar22.d;
                                            String strE = hx7.q.E(juniorContact.f276838a);
                                            Object objK0 = nVar.get(strE);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar22.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(strE, objK0);
                                            }
                                            return (String) objK0;
                                    }
                                }
                            };
                            String str2 = str;
                            ufm.n nVarA = vVar.a(list2, str2, function1);
                            Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
                            int i66 = 0;
                            ufm.n nVarA2 = vVar.a(contactGroups.f323334c, str2, new g4(1, rVar32, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i66, 4));
                            ufm.n nVarA3 = vVar.a(contactGroups.d, str2, new g4(1, rVar32, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i66, 5));
                            int i21 = 0;
                            efm.d0 d0VarD = efm.d0.D(nVarA2, nVarA3, new q(new p(contactGroups, str2, i21), i21));
                            Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
                            Intrinsics.checkNotNullParameter(list22, "list");
                            final int i22 = 1;
                            ufm.i iVar = new ufm.i(w.I0(nVarA, d0VarD, vVar.a(list22, str2, new Function1() { // from class: u3a.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i22) {
                                        case 0:
                                            zm3.j contact = (zm3.j) obj3;
                                            Intrinsics.checkNotNullParameter(contact, "contact");
                                            return rVar32.a(contact);
                                        default:
                                            e juniorContact = (e) obj3;
                                            Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                            r rVar22 = rVar32;
                                            ne0.n nVar = rVar22.d;
                                            String strE = hx7.q.E(juniorContact.f276838a);
                                            Object objK0 = nVar.get(strE);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar22.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(strE, objK0);
                                            }
                                            return (String) objK0;
                                    }
                                }
                            })), new q(new g(15), 1), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        case 1:
                            List cards = (List) obj2;
                            Intrinsics.checkNotNullParameter(cards, "cards");
                            final sz5.f fVar2 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(cards, "cards");
                            final int i3222 = 2;
                            return ((v) fVar2.d).a(cards, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i3222) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar2;
                                            Map map22 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map22.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar2;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar2;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                        case 2:
                            List cryptos = (List) obj2;
                            Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                            final sz5.f fVar3 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                            final int i33 = 1;
                            return ((v) fVar3.d).a(cryptos, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i33) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar3;
                                            Map map22 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map22.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar3;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar3;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                        case 3:
                            List beneficiaries = (List) obj2;
                            Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaryList");
                            sz5.f fVar4 = this.f276841b.o;
                            d cacheContext = d.SELF_BENEFICIARIES_PAY_ID;
                            Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                            Intrinsics.checkNotNullParameter(cacheContext, "cacheContext");
                            ufm.i iVar2 = new ufm.i(((v) fVar4.d).a(beneficiaries, str, new twg.a(fVar4, cacheContext, 19)), new u21.a(28, new g(8)), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        default:
                            List groups = (List) obj2;
                            Intrinsics.checkNotNullParameter(groups, "groups");
                            final sz5.f fVar5 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(groups, "groups");
                            final int i43 = 0;
                            return ((v) fVar5.d).a(groups, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i43) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar5;
                                            Map map22 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map22.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar5;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar5;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                    }
                }
            }), h0.f322473a), new g(12)));
        } else {
            rVarO3 = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarO3, "just(...)");
        }
        efm.r rVar6 = rVarO3;
        if (searchInSections.contains(d3a.a.CRYPTO_WALLET)) {
            final int i21 = 2;
            rVarO4 = zi0.c.o(nim.a.z(ue0.e.p(pd.b.t(this.e.e(true, ho5.a.ADDRESS_TYPE, false), new Function1(this) { // from class: u3a.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f276841b;

                {
                    this.f276841b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i21) {
                        case 0:
                            i contactRecipients = (i) obj2;
                            Intrinsics.checkNotNullParameter(contactRecipients, "contacts");
                            sz5.f fVar = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(contactRecipients, "contactRecipients");
                            List list2 = contactRecipients.f276849a;
                            zm3.b contactGroups = contactRecipients.f276850b;
                            List list22 = contactRecipients.f276851c;
                            final r rVar32 = (r) fVar.f266767c;
                            Intrinsics.checkNotNullParameter(list2, "list");
                            v vVar = rVar32.f276875b;
                            final int i59 = 0;
                            Function1 function1 = new Function1() { // from class: u3a.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i59) {
                                        case 0:
                                            zm3.j contact = (zm3.j) obj3;
                                            Intrinsics.checkNotNullParameter(contact, "contact");
                                            return rVar32.a(contact);
                                        default:
                                            e juniorContact = (e) obj3;
                                            Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                            r rVar22 = rVar32;
                                            ne0.n nVar = rVar22.d;
                                            String strE = hx7.q.E(juniorContact.f276838a);
                                            Object objK0 = nVar.get(strE);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar22.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(strE, objK0);
                                            }
                                            return (String) objK0;
                                    }
                                }
                            };
                            String str2 = str;
                            ufm.n nVarA = vVar.a(list2, str2, function1);
                            Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
                            int i66 = 0;
                            ufm.n nVarA2 = vVar.a(contactGroups.f323334c, str2, new g4(1, rVar32, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i66, 4));
                            ufm.n nVarA3 = vVar.a(contactGroups.d, str2, new g4(1, rVar32, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i66, 5));
                            int i212 = 0;
                            efm.d0 d0VarD = efm.d0.D(nVarA2, nVarA3, new q(new p(contactGroups, str2, i212), i212));
                            Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
                            Intrinsics.checkNotNullParameter(list22, "list");
                            final int i22 = 1;
                            ufm.i iVar = new ufm.i(w.I0(nVarA, d0VarD, vVar.a(list22, str2, new Function1() { // from class: u3a.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i22) {
                                        case 0:
                                            zm3.j contact = (zm3.j) obj3;
                                            Intrinsics.checkNotNullParameter(contact, "contact");
                                            return rVar32.a(contact);
                                        default:
                                            e juniorContact = (e) obj3;
                                            Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                            r rVar22 = rVar32;
                                            ne0.n nVar = rVar22.d;
                                            String strE = hx7.q.E(juniorContact.f276838a);
                                            Object objK0 = nVar.get(strE);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar22.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(strE, objK0);
                                            }
                                            return (String) objK0;
                                    }
                                }
                            })), new q(new g(15), 1), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        case 1:
                            List cards = (List) obj2;
                            Intrinsics.checkNotNullParameter(cards, "cards");
                            final sz5.f fVar2 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(cards, "cards");
                            final int i3222 = 2;
                            return ((v) fVar2.d).a(cards, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i3222) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar2;
                                            Map map22 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map22.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar2;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar2;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                        case 2:
                            List cryptos = (List) obj2;
                            Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                            final sz5.f fVar3 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                            final int i33 = 1;
                            return ((v) fVar3.d).a(cryptos, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i33) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar3;
                                            Map map22 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map22.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar3;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar3;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                        case 3:
                            List beneficiaries = (List) obj2;
                            Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaryList");
                            sz5.f fVar4 = this.f276841b.o;
                            d cacheContext = d.SELF_BENEFICIARIES_PAY_ID;
                            Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                            Intrinsics.checkNotNullParameter(cacheContext, "cacheContext");
                            ufm.i iVar2 = new ufm.i(((v) fVar4.d).a(beneficiaries, str, new twg.a(fVar4, cacheContext, 19)), new u21.a(28, new g(8)), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        default:
                            List groups = (List) obj2;
                            Intrinsics.checkNotNullParameter(groups, "groups");
                            final sz5.f fVar5 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(groups, "groups");
                            final int i43 = 0;
                            return ((v) fVar5.d).a(groups, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i43) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar5;
                                            Map map22 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map22.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar5;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar5;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                    }
                }
            }), h0.f322473a), new g(13)));
        } else {
            rVarO4 = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarO4, "just(...)");
        }
        efm.r rVar7 = rVarO4;
        ae8.c cVarJ = this.i.j();
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarO8 = zi0.c.o(pd.b.r(rd0.e.c(cVarJ, gVar), new toh.h(searchInSections, str, this)));
        efm.r rVarC2 = rd0.e.c(new rv6.e(yh5.b.j(b(d3a.a.APM_AANI, n02.b.AANI, str, searchInSections), b(d3a.a.APM_BIZUM, n02.b.BIZUM, str, searchInSections), b(d3a.a.APM_BLIK, n02.b.BLIK, str, searchInSections), b(d3a.a.APM_BREB, n02.b.BREB, str, searchInSections), b(d3a.a.APM_IRIS, n02.b.IRIS, str, searchInSections), b(d3a.a.APM_MULTIBANCO, n02.b.MBWAY, str, searchInSections), b(d3a.a.APM_QVIK, n02.b.QVIK, str, searchInSections), b(d3a.a.APM_SPIN, n02.b.SPIN, str, searchInSections), b(d3a.a.APM_WERO, n02.b.WERO, str, searchInSections)), 19), gVar);
        if (searchInSections.contains(d3a.a.APM_PAYID)) {
            final int i22 = 3;
            rVarO5 = zi0.c.o(nim.a.w(nim.a.z(ue0.e.p(pd.b.t(w2j.a.c(this.f276859b, BeneficiarySpecialPurpose.PAYID_ALIAS, BeneficiarySortingStrategy.NO_SORTING, 5), new Function1(this) { // from class: u3a.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f276841b;

                {
                    this.f276841b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i22) {
                        case 0:
                            i contactRecipients = (i) obj2;
                            Intrinsics.checkNotNullParameter(contactRecipients, "contacts");
                            sz5.f fVar = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(contactRecipients, "contactRecipients");
                            List list2 = contactRecipients.f276849a;
                            zm3.b contactGroups = contactRecipients.f276850b;
                            List list22 = contactRecipients.f276851c;
                            final r rVar32 = (r) fVar.f266767c;
                            Intrinsics.checkNotNullParameter(list2, "list");
                            v vVar = rVar32.f276875b;
                            final int i59 = 0;
                            Function1 function1 = new Function1() { // from class: u3a.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i59) {
                                        case 0:
                                            zm3.j contact = (zm3.j) obj3;
                                            Intrinsics.checkNotNullParameter(contact, "contact");
                                            return rVar32.a(contact);
                                        default:
                                            e juniorContact = (e) obj3;
                                            Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                            r rVar22 = rVar32;
                                            ne0.n nVar = rVar22.d;
                                            String strE = hx7.q.E(juniorContact.f276838a);
                                            Object objK0 = nVar.get(strE);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar22.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(strE, objK0);
                                            }
                                            return (String) objK0;
                                    }
                                }
                            };
                            String str2 = str;
                            ufm.n nVarA = vVar.a(list2, str2, function1);
                            Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
                            int i66 = 0;
                            ufm.n nVarA2 = vVar.a(contactGroups.f323334c, str2, new g4(1, rVar32, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i66, 4));
                            ufm.n nVarA3 = vVar.a(contactGroups.d, str2, new g4(1, rVar32, r.class, "createContactItemsContent", "createContactItemsContent(Lcom/revolut/feature/contacts/models/Contact;)Ljava/lang/String;", i66, 5));
                            int i212 = 0;
                            efm.d0 d0VarD = efm.d0.D(nVarA2, nVarA3, new q(new p(contactGroups, str2, i212), i212));
                            Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
                            Intrinsics.checkNotNullParameter(list22, "list");
                            final int i222 = 1;
                            ufm.i iVar = new ufm.i(w.I0(nVarA, d0VarD, vVar.a(list22, str2, new Function1() { // from class: u3a.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i222) {
                                        case 0:
                                            zm3.j contact = (zm3.j) obj3;
                                            Intrinsics.checkNotNullParameter(contact, "contact");
                                            return rVar32.a(contact);
                                        default:
                                            e juniorContact = (e) obj3;
                                            Intrinsics.checkNotNullParameter(juniorContact, "juniorContact");
                                            r rVar22 = rVar32;
                                            ne0.n nVar = rVar22.d;
                                            String strE = hx7.q.E(juniorContact.f276838a);
                                            Object objK0 = nVar.get(strE);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(l9.l.b(juniorContact.f276838a), (String) rVar22.f276876c.getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(strE, objK0);
                                            }
                                            return (String) objK0;
                                    }
                                }
                            })), new q(new g(15), 1), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        case 1:
                            List cards = (List) obj2;
                            Intrinsics.checkNotNullParameter(cards, "cards");
                            final sz5.f fVar2 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(cards, "cards");
                            final int i3222 = 2;
                            return ((v) fVar2.d).a(cards, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i3222) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar2;
                                            Map map22 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map22.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar2;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar2;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                        case 2:
                            List cryptos = (List) obj2;
                            Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                            final sz5.f fVar3 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(cryptos, "cryptos");
                            final int i33 = 1;
                            return ((v) fVar3.d).a(cryptos, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i33) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar3;
                                            Map map22 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map22.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar3;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar3;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                        case 3:
                            List beneficiaries = (List) obj2;
                            Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaryList");
                            sz5.f fVar4 = this.f276841b.o;
                            d cacheContext = d.SELF_BENEFICIARIES_PAY_ID;
                            Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                            Intrinsics.checkNotNullParameter(cacheContext, "cacheContext");
                            ufm.i iVar2 = new ufm.i(((v) fVar4.d).a(beneficiaries, str, new twg.a(fVar4, cacheContext, 19)), new u21.a(28, new g(8)), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        default:
                            List groups = (List) obj2;
                            Intrinsics.checkNotNullParameter(groups, "groups");
                            final sz5.f fVar5 = this.f276841b.o;
                            Intrinsics.checkNotNullParameter(groups, "groups");
                            final int i43 = 0;
                            return ((v) fVar5.d).a(groups, str, new Function1() { // from class: u3a.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    switch (i43) {
                                        case 0:
                                            PaymentGroup group = (PaymentGroup) obj3;
                                            Intrinsics.checkNotNullParameter(group, "group");
                                            sz5.f fVar32 = fVar5;
                                            Map map22 = (Map) fVar32.f266766b;
                                            d dVar = d.GROUPS;
                                            Object obj4 = map22.get(dVar);
                                            if (obj4 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar);
                                            }
                                            ne0.n nVar = (ne0.n) obj4;
                                            String str3 = group.f79285a;
                                            Object objK0 = nVar.get(str3);
                                            if (objK0 == null) {
                                                objK0 = zhm.d0.k0(zhm.v.k(ngm.n.I(group.f79286b), (String) ((Lazy) fVar32.f266769h).getValue()), "|", null, null, 0, null, 62);
                                                nVar.f(str3, objK0);
                                            }
                                            return (String) objK0;
                                        case 1:
                                            CryptoAddress crypto = (CryptoAddress) obj3;
                                            Intrinsics.checkNotNullParameter(crypto, "crypto");
                                            sz5.f fVar42 = fVar5;
                                            Map map3 = (Map) fVar42.f266766b;
                                            d dVar2 = d.CRYPTO;
                                            Object obj5 = map3.get(dVar2);
                                            if (obj5 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar2);
                                            }
                                            ne0.n nVar2 = (ne0.n) obj5;
                                            String str4 = crypto.f71059a;
                                            Object objK02 = nVar2.get(str4);
                                            if (objK02 == null) {
                                                objK02 = zhm.d0.k0(zhm.v.k(ngm.n.I(CryptoAddress.e(crypto, 0, 3).f186223a), (String) ((Lazy) fVar42.f266768g).getValue()), "|", null, null, 0, null, 62);
                                                nVar2.f(str4, objK02);
                                            }
                                            return (String) objK02;
                                        default:
                                            CardOwnerWithStats cardWithStats = (CardOwnerWithStats) obj3;
                                            Intrinsics.checkNotNullParameter(cardWithStats, "cardWithStats");
                                            sz5.f fVar52 = fVar5;
                                            Map map4 = (Map) fVar52.f266766b;
                                            d dVar3 = d.CARDS;
                                            Object obj6 = map4.get(dVar3);
                                            if (obj6 == null) {
                                                throw new IllegalArgumentException("No cache for cache context " + dVar3);
                                            }
                                            ne0.n nVar3 = (ne0.n) obj6;
                                            CardOwner cardOwner = cardWithStats.f81495a;
                                            String str5 = cardOwner.f81490a;
                                            Object objK03 = nVar3.get(str5);
                                            if (objK03 == null) {
                                                objK03 = zhm.d0.k0(zhm.v.k(ngm.n.I(cardOwner.a()), cardOwner.f81493g.f81485a, (String) ((Lazy) fVar52.f).getValue()), "|", null, null, 0, null, 62);
                                                nVar3.f(str5, objK03);
                                            }
                                            return (String) objK03;
                                    }
                                }
                            });
                    }
                }
            }), h0.f322473a), new g(0)), new g(1)));
        } else {
            rVarO5 = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarO5, "just(...)");
        }
        efm.r rVarH = kli.a.h(rVarC2, rVarO5);
        boolean zContains3 = searchInSections.contains(d3a.a.BILLERS);
        co9.b bVar2 = this.f276865m;
        if (zContains3) {
            PaymentCounterpartyInfo.INSTANCE.getClass();
            Set types = PaymentCounterpartyInfo.f79059j;
            Intrinsics.checkNotNullParameter(types, "types");
            rVarO6 = zi0.c.o(nim.a.z(ue0.e.p(rd0.e.c(bVar2.c(str, types), gVar), h0.f322473a), new g(10)));
        } else {
            rVarO6 = zi0.c.j(f0.f322471a);
        }
        if (searchInSections.contains(d3a.a.APM_UPI)) {
            Set types2 = y0.b(ho9.b.UPI_CONTACT);
            Intrinsics.checkNotNullParameter(types2, "types");
            rVarO7 = zi0.c.o(nim.a.z(ue0.e.p(rd0.e.c(bVar2.c(str, types2), gVar), h0.f322473a), new u21.b(27)));
        } else {
            rVarO7 = zi0.c.j(f0.f322471a);
        }
        efm.r rVarDistinctUntilChanged = mif.a.k(rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVarO8, rVarH, kli.a.h(rVarO6, rVarO7)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return nim.a.z(ue0.e.p(nim.a.w(rVarDistinctUntilChanged, new u21.b(this, 26)), h0.f322473a), new g(4));
    }
}
