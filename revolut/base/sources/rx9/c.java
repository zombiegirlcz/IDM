package rx9;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import cu8.r0;
import dj0.d;
import efm.d0;
import jq9.k;
import jq9.l;
import jq9.m;
import jq9.n;
import jq9.o;
import jq9.p;
import jq9.q;
import jq9.r;
import jq9.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements fx9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f258086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rq9.a f258087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz9.a f258088c;

    public c(r0 kycTransformer, rq9.a groupBillsNaviCommandProvider, kz9.a chatNaviProvider) {
        Intrinsics.checkNotNullParameter(kycTransformer, "kycTransformer");
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(chatNaviProvider, "chatNaviProvider");
        this.f258086a = kycTransformer;
        this.f258087b = groupBillsNaviCommandProvider;
        this.f258088c = chatNaviProvider;
    }

    public final ufm.b a(CryptoAddress cryptoAddress) {
        ufm.b bVarM = d0.m(gc0.c.f(((uz9.a) this.f258088c).a(new ChatTransferRecipient.CryptoAddressRecipient(cryptoAddress, jz9.a.PAYMENTS, 2), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final d0 b(k paymentRecipient, d dVar) {
        Intrinsics.checkNotNullParameter(paymentRecipient, "paymentRecipient");
        boolean z = paymentRecipient instanceof m;
        kz9.a aVar = this.f258088c;
        if (z) {
            ufm.b bVarM = d0.m(gc0.c.f(((uz9.a) aVar).a(new ChatTransferRecipient.BeneficiaryRecipient(((m) paymentRecipient).f177508b, null), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (paymentRecipient instanceof n) {
            ufm.b bVarM2 = d0.m(gc0.c.f(((uz9.a) aVar).a(new ChatTransferRecipient.CardRecipient(((n) paymentRecipient).f177510b.f81495a), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (paymentRecipient instanceof r) {
            return a(((r) paymentRecipient).f177518b);
        }
        if (paymentRecipient instanceof p) {
            return w.o0(p0.f264002b, new a(this, ((p) paymentRecipient).f177514b, dVar, null));
        }
        if (paymentRecipient instanceof s) {
            return w.o0(p0.f264002b, new b(this, ((s) paymentRecipient).f177520b, null));
        }
        if (paymentRecipient instanceof o) {
            ufm.b bVarM3 = d0.m(gc0.c.f(((uz9.a) aVar).a(new ChatTransferRecipient.CharityRecipient(((o) paymentRecipient).f177512b), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
            return bVarM3;
        }
        if (paymentRecipient instanceof l) {
            ufm.b bVarM4 = d0.m(gc0.c.f(((uz9.a) aVar).a(new ChatTransferRecipient.ApmTransferRecipient(((l) paymentRecipient).f177506b), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
            return bVarM4;
        }
        if (!(paymentRecipient instanceof q)) {
            throw new NoWhenBranchMatchedException();
        }
        ufm.b bVarM5 = d0.m(gc0.c.f(((uz9.a) aVar).a(new ChatTransferRecipient.PaymentCounterpartyRecipient(((q) paymentRecipient).f177516b), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
        return bVarM5;
    }
}
