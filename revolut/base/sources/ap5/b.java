package ap5;

import an4.g;
import aoa.h;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingPreCheckInput;
import com.revolut.feature.crypto.withdraw.impl.network.CryptoWithdrawService;
import dp5.n1;
import efm.d0;
import hp3.r;
import hp5.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mp.p;
import ne0.k;
import pfm.z;
import te0.w;
import ufm.i;
import ufm.n;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final no5.b f8094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final po5.a f8095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f8096c;
    public final k d;

    public b(no5.b cryptoWithdrawRepository, po5.a cryptoWithdrawEnabledStateChecker, p paymentsLocationInteractor) {
        Intrinsics.checkNotNullParameter(cryptoWithdrawRepository, "cryptoWithdrawRepository");
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(paymentsLocationInteractor, "paymentsLocationInteractor");
        this.f8094a = cryptoWithdrawRepository;
        this.f8095b = cryptoWithdrawEnabledStateChecker;
        this.f8096c = paymentsLocationInteractor;
        this.d = new k(new a(this, 1), null);
    }

    public final n a(xi0.b currency, wk5.a blockchain, String address, String str, String str2, CryptoAddressHostingInfo cryptoAddressHostingInfo) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(address, "address");
        o oVar = (o) this.f8094a;
        CryptoWithdrawService cryptoWithdrawService = oVar.f154482a;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(address, "address");
        dp5.c cVar = new dp5.c(currency.f306286a, u1.h(blockchain, wk5.b.a()), address, str, str2, cryptoAddressHostingInfo != null ? uc0.b.z(cryptoAddressHostingInfo) : null);
        d0<dp5.f> d0VarAddAddressWithCounterparty = cryptoAddressHostingInfo != null ? cryptoWithdrawService.addAddressWithCounterparty(cVar) : cryptoWithdrawService.addAddress(cVar);
        hje.e eVar = new hje.e(new hp5.a(oVar, 1), 29);
        d0VarAddAddressWithCounterparty.getClass();
        i iVar = new i(d0VarAddAddressWithCounterparty, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return w.i0(iVar);
    }

    public final n b(CryptoAddressHostingPreCheckInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        o oVar = (o) this.f8094a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        d0<cl5.a> d0VarExecuteCryptoRecipientPreCheck = oVar.f154482a.executeCryptoRecipientPreCheck(ue8.c.c0(input));
        hp5.b bVar = new hp5.b(new r(12), 7);
        d0VarExecuteCryptoRecipientPreCheck.getClass();
        i iVar = new i(d0VarExecuteCryptoRecipientPreCheck, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    public final efm.r c(String id10, boolean z, ho5.a mergeBy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(mergeBy, "mergeBy");
        o oVar = (o) this.f8094a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(mergeBy, "mergeBy");
        return nim.a.w(no5.b.a(oVar, z, mergeBy, true, 8), new ho6.n(id10, 1));
    }

    public final efm.r e(boolean z, ho5.a mergeBy, boolean z3) {
        Intrinsics.checkNotNullParameter(mergeBy, "mergeBy");
        return no5.b.a(this.f8094a, z, mergeBy, z3, 8);
    }

    public final efm.r g() {
        sfm.b bVar = new sfm.b(this.f8095b.d(), new h(new a(this, 0), 4), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        zk5.c.Companion.getClass();
        return ue0.e.E(bVar, zk5.b.a());
    }

    public final efm.r h(String addressId, dj0.d inputMoney, xi0.b senderCurrency, wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(inputMoney, "inputMoney");
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        o oVar = (o) this.f8094a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(inputMoney, "inputMoney");
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        return oVar.f154487j.e(new hp5.h(inputMoney, addressId, u1.h(blockchain, wk5.b.a()), senderCurrency), w4l.i.f294643c);
    }

    public final efm.r i(xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        o oVar = (o) this.f8094a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return oVar.f154493r.f(currency, z);
    }

    public final pfm.r j(String addressId, String str) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        o oVar = (o) this.f8094a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        return oVar.c(oVar.f154482a.updateAddress(addressId, new n1(str)));
    }

    public final z k() {
        efm.r rVarE = m70.a.e(zi0.c.J(((o) this.f8094a).f154494s.e(Unit.f186387a, w4l.h.f294642c)), new g(24), new g(25));
        wk5.n nVar = wk5.n.NOT_RESTRICTED;
        d0 d0VarFirst = rVarE.first(nVar);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return ue0.e.F(d0VarFirst, nVar);
    }
}
