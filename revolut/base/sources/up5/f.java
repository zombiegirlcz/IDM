package up5;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.flow.CryptoWithdrawToAddressContract$FundingSourceInput;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import com.revolut.feature.transfer.core.models.FundingSource;
import eq5.n1;
import eq5.x0;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import vkm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f281888b;

    public /* synthetic */ f(a0 a0Var, int i) {
        this.f281887a = i;
        this.f281888b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVar;
        switch (this.f281887a) {
            case 0:
                CryptoAddress beneficiary = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                return te0.w.o0(p0.f264003c, new un8.j(this.f281888b, beneficiary, null, 5));
            case 1:
                od0.i inputOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(inputOptional, "inputOptional");
                if (inputOptional.d()) {
                    return te0.w.o0(p0.f264003c, new twb.b0(this.f281888b, (CryptoWithdrawToAddressContract$FundingSourceInput) inputOptional.c(), (Continuation) null, 25));
                }
                od0.i.Companion.getClass();
                ufm.b bVarM = efm.d0.m(od0.i.f224256b);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 2:
                xi0.b withdrawCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(withdrawCurrency, "withdrawCurrency");
                a0 a0Var = this.f281888b;
                return te0.w.m(m70.a.g(pd.b.r(a0Var.n3(), new f(a0Var, 21)), null, new k(0), 1), a0Var.A3(), m70.a.g(bk5.a.c(a0Var.i, withdrawCurrency), null, null, 3)).switchMapCompletable(new uoe.a(22, new i(a0Var, withdrawCurrency, 0)));
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xi0.b bVar = (xi0.b) pair.f186385a;
                xi0.b bVar2 = (xi0.b) pair.f186386b;
                a0 a0Var2 = this.f281888b;
                efm.r rVarDoOnNext = rd0.e.c(a0Var2.f281859n.i(bVar, bVar2), kotlin.coroutines.g.f186406a).doOnNext(new uoe.a(28, new f(a0Var2, 19)));
                Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
                return rVarDoOnNext;
            case 4:
                xi0.b initialWithdrawCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(initialWithdrawCurrency, "initialWithdrawCurrency");
                a0 a0Var3 = this.f281888b;
                efm.d0 d0VarFirstOrError = m70.a.g(a0Var3.n3(), null, null, 3).firstOrError();
                j jVar = new j(new i(a0Var3, initialWithdrawCurrency, 1), 2);
                d0VarFirstOrError.getClass();
                return new ufm.i(new ufm.i(d0VarFirstOrError, jVar, 0), new j(new ou5.a(25, initialWithdrawCurrency), 9), 1);
            case 5:
                c cVar = this.f281888b.f281852b;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Object obj3 = pair2.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                io3.d dVar2 = (io3.d) obj3;
                Object obj4 = pair2.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                xi0.b currency = (xi0.b) obj4;
                CryptoWithdrawToAddressContract$FundingSourceInput input = new CryptoWithdrawToAddressContract$FundingSourceInput(r6.b.B(xi0.b.Companion, dVar2.f163147c) ? k1j.a.CRYPTO : k1j.a.POCKETS, AccountId.Personal.f51414a, dVar2.f163145a);
                Intrinsics.checkNotNullParameter(input, "input");
                e eVar = (e) cVar;
                pfm.t tVarA0 = te0.w.A0(eVar.f281886t.getValue(eVar, e.v[18]), input);
                Intrinsics.checkNotNullParameter(currency, "currency");
                return tVarA0.e(te0.w.A0(((e) cVar).E0(), currency));
            case 6:
                Data fiatCryptoMoneyData = (Data) obj2;
                Intrinsics.checkNotNullParameter(fiatCryptoMoneyData, "fiatCryptoMoneyData");
                FiatCryptoMoney fiatCryptoMoney = (FiatCryptoMoney) fiatCryptoMoneyData.getContent();
                if (fiatCryptoMoney == null) {
                    return pfm.m.f235744a;
                }
                e eVar2 = (e) this.f281888b.f281852b;
                return te0.w.z0(eVar2.f281880m.getValue(eVar2, e.v[11]), fiatCryptoMoney.f71113b);
            case 7:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                List list = (List) hVar.f288433a;
                xi0.b bVar3 = (xi0.b) hVar.f288434b;
                xi0.b bVar4 = (xi0.b) hVar.f288435c;
                nqi.c cVar2 = (nqi.c) hVar.d;
                a0 a0Var4 = this.f281888b;
                c cVar3 = a0Var4.f281852b;
                if (((e) cVar3).D0().get() == d.SUMMARY) {
                    e eVar3 = (e) cVar3;
                    dVar = (dj0.d) eVar3.f281880m.getValue(eVar3, e.v[11]).get();
                } else {
                    dVar = cVar2.f218471a;
                }
                return rd0.e.c(a0Var4.f281859n.d(dVar, list, bVar3, bVar4), kotlin.coroutines.g.f186406a);
            case 8:
                xi0.b it8 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f281888b.f281853c.i(it8, true);
            case 9:
                CryptoAddress cryptoAddress = (CryptoAddress) obj2;
                e eVar4 = (e) this.f281888b.f281852b;
                if (((Boolean) eVar4.i.getValue(eVar4, e.v[7]).get()).booleanValue()) {
                    nqi.c cVar4 = (nqi.c) eVar4.B0().get();
                    dj0.d dVar3 = cVar4.f218471a;
                    if (!Intrinsics.f(dVar3.f115083b, cryptoAddress.f71060b)) {
                        te0.e eVarB0 = eVar4.B0();
                        dj0.d money = dj0.d.c(dVar3, 0L, cryptoAddress.f71060b, 1);
                        String moneyAmountInput = cVar4.f218472b;
                        Intrinsics.checkNotNullParameter(money, "money");
                        Intrinsics.checkNotNullParameter(moneyAmountInput, "moneyAmountInput");
                        eVarB0.set(new nqi.c(money, moneyAmountInput));
                    }
                }
                return Unit.f186387a;
            case 10:
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                dj0.d recipientAmount = (dj0.d) hVar2.f288433a;
                FundingSource fundingSource = (FundingSource) hVar2.f288434b;
                CryptoAddress cryptoAddress2 = (CryptoAddress) hVar2.f288435c;
                wk5.a blockchain = (wk5.a) hVar2.d;
                x0 x0Var = this.f281888b.f281859n;
                String beneficiaryId = cryptoAddress2.f71059a;
                x0Var.getClass();
                Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
                Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
                Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                ko5.k request = new ko5.k(recipientAmount, x5d.b.h(fundingSource), beneficiaryId, blockchain);
                hp5.o oVar = (hp5.o) x0Var.f128347g;
                Intrinsics.checkNotNullParameter(request, "request");
                return rd0.e.c(t1.E(new v1(new g0a.e(oVar, request, null, 22))), kotlin.coroutines.g.f186406a);
            case 11:
                ko5.l lVar = (ko5.l) obj2;
                a0 a0Var5 = this.f281888b;
                te0.e eVarY0 = ((e) a0Var5.f281852b).y0();
                Intrinsics.h(lVar);
                ko5.h hVar3 = lVar.f;
                eVarY0.set(new CryptoWithdrawFeesBreakdown(null, null, null, null, hVar3.f186228a, hVar3.f186229b.f186231b));
                te0.e eVarG0 = ((e) a0Var5.f281852b).G0();
                od0.i.Companion.getClass();
                eVarG0.set(od0.h.a(lVar));
                return Unit.f186387a;
            case 12:
                Intrinsics.checkNotNullParameter((d) obj2, "it");
                a0 a0Var6 = this.f281888b;
                return a0Var6.v3().switchMapCompletable(new uoe.a(13, new f(a0Var6, 6)));
            case 13:
                CryptoAddress cryptoAddress3 = (CryptoAddress) ((Data) obj2).getContent();
                if (cryptoAddress3 != null) {
                    e eVar5 = (e) this.f281888b.f281852b;
                    te0.e value = eVar5.f281875c.getValue(eVar5, e.v[1]);
                    od0.h hVar4 = od0.i.Companion;
                    String str = cryptoAddress3.f71061c;
                    hVar4.getClass();
                    value.set(od0.h.a(str));
                }
                return Unit.f186387a;
            case 14:
                CryptoAddress address = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(address, "address");
                a0 a0Var7 = this.f281888b;
                return te0.w.m(a0Var7.w3(), a0Var7.C3(), a0Var7.B3()).distinctUntilChanged().switchMap(new uoe.a(23, new uif.d(address, a0Var7, 10)));
            case 15:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                od0.i iVar = (od0.i) pair3.f186385a;
                if (!iVar.d()) {
                    return z9h.n.f(null, null, true, 3, null);
                }
                a0 a0Var8 = this.f281888b;
                return a0Var8.f281853c.c((String) iVar.c(), true, ho5.a.NONE).doOnNext(new uoe.a(21, new f(a0Var8, 13)));
            case 16:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return rd0.e.c(this.f281888b.f281859n.e((dj0.d) rVar.f314202b, (List) rVar.f314203c, (xi0.b) rVar.f314201a), kotlin.coroutines.g.f186406a);
            case 17:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                return te0.w.o0(p0.f264003c, new sxe.g(9, this.f281888b, (xi0.b) rVar2.f314202b, (CryptoAddress) rVar2.f314203c, (od0.i) rVar2.f314201a, (Continuation) null));
            case 18:
                wk5.a aVar = (wk5.a) obj2;
                c cVar5 = this.f281888b.f281852b;
                if (aVar != ((od0.i) ((e) cVar5).C0().get()).f224257a) {
                    te0.e eVarC0 = ((e) cVar5).C0();
                    od0.i.Companion.getClass();
                    eVarC0.set(od0.h.a(aVar));
                }
                return Unit.f186387a;
            case 19:
                n1 n1Var = (n1) ((Data) obj2).getContent();
                if (n1Var != null) {
                    ((e) this.f281888b.f281852b).A0().set(n1Var.f128295a);
                }
                return Unit.f186387a;
            case 20:
                ((e) this.f281888b.f281852b).y0().set(((ko5.g) obj2).f186227a);
                return Unit.f186387a;
            case 21:
                CryptoAddress address2 = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(address2, "address");
                ap5.b bVar5 = this.f281888b.f281853c;
                String id10 = address2.f71059a;
                ho5.a mergeBy = ho5.a.ADDRESS_TYPE;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(mergeBy, "mergeBy");
                hp5.o oVar2 = (hp5.o) bVar5.f8094a;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(mergeBy, "mergeBy");
                return nim.a.w(no5.b.a(oVar2, false, ho5.a.NONE, false, 12), new hm3.b(mergeBy, id10, 16));
            case 22:
                eq5.q amount = (eq5.q) obj2;
                Intrinsics.checkNotNullParameter(amount, "amount");
                return this.f281888b.f281857l.c(new UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering.Transfer(amount.f128303c.f71112a));
            case 23:
                vf0.h hVar5 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar5, "<destruct>");
                CryptoAddress cryptoAddress4 = (CryptoAddress) hVar5.f288433a;
                return new ufm.i(te0.w.o0(p0.f264003c, new s56.d0((Object) this.f281888b, (Object) cryptoAddress4, (xi0.b) hVar5.f288435c, (Serializable) hVar5.d, hVar5.f288434b, (Continuation) null, 12)), new j(new fp5.b(cryptoAddress4, 3), 17), 1);
            case 24:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                Object obj5 = pair4.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj5, "component1(...)");
                nqi.c cVar6 = (nqi.c) obj5;
                xi0.b bVar6 = (xi0.b) pair4.f186386b;
                a0 a0Var9 = this.f281888b;
                pfm.t tVarD3 = a0Var9.D3(cVar6);
                e eVar6 = (e) a0Var9.f281852b;
                return tVarD3.e(te0.w.z0(eVar6.i.getValue(eVar6, e.v[7]), Boolean.valueOf(Intrinsics.f(cVar6.f218471a.f115083b, bVar6))));
            case 25:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                return rd0.e.c(this.f281888b.f281859n.f((CryptoAddress) pair5.f186385a, (List) pair5.f186386b), kotlin.coroutines.g.f186406a);
            case 26:
                yhm.r rVar3 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar3, "<destruct>");
                return this.f281888b.f281859n.c((xi0.b) rVar3.f314202b, (CryptoWithdrawLimits) rVar3.f314201a, (List) rVar3.f314203c);
            case 27:
                vf0.h hVar6 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar6, "<destruct>");
                CryptoAddress cryptoAddress5 = (CryptoAddress) hVar6.f288433a;
                dj0.d dVar4 = (dj0.d) hVar6.f288434b;
                xi0.b bVar7 = (xi0.b) hVar6.f288435c;
                xi0.b bVar8 = (xi0.b) hVar6.d;
                if (!Intrinsics.f(bVar7, cryptoAddress5.f71060b)) {
                    return pfm.m.f235744a;
                }
                a0 a0Var10 = this.f281888b;
                return te0.w.b(m70.a.g(a0Var10.f281853c.h(cryptoAddress5.f71059a, dVar4, bVar8, cryptoAddress5.f71063h), null, new k(6), 1), new l(a0Var10, 1));
            case 28:
                ko5.l lVar2 = (ko5.l) obj2;
                c cVar7 = this.f281888b.f281852b;
                te0.e eVarY02 = ((e) cVar7).y0();
                Intrinsics.h(lVar2);
                ko5.h hVar7 = lVar2.f;
                eVarY02.set(new CryptoWithdrawFeesBreakdown(null, null, null, null, hVar7.f186228a, hVar7.f186229b.f186231b));
                te0.e eVarG02 = ((e) cVar7).G0();
                od0.i.Companion.getClass();
                eVarG02.set(od0.h.a(lVar2));
                return Unit.f186387a;
            default:
                od0.i fundingSourceOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(fundingSourceOptional, "fundingSourceOptional");
                FundingSource fundingSource2 = (FundingSource) fundingSourceOptional.f224257a;
                if (fundingSource2 == null) {
                    return z9h.n.f(null, null, false, 6, null);
                }
                return rd0.e.c(((yt9.g) this.f281888b.f281860p).g(fundingSource2, fundingSource2.getK()), kotlin.coroutines.g.f186406a).map(new j(new h(24), 21)).onErrorReturn(new j(new h(25), 22));
        }
    }
}
