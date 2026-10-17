package ha3;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import efm.d0;
import h93.l0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v6l.a0;
import v6l.b0;
import v6l.b1;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f150420b;

    public /* synthetic */ p(x xVar, int i) {
        this.f150419a = i;
        this.f150420b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listC;
        switch (this.f150419a) {
            case 0:
                this.f150420b.d.a();
                return Unit.f186387a;
            case 1:
                od0.i jointWalletId = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(jointWalletId, "jointWalletId");
                String str = (String) jointWalletId.g();
                if (str == null || (listC = zhm.v.k(null, str)) == null) {
                    listC = zhm.u.c(null);
                }
                return ue0.e.E(l93.f.b(this.f150420b, listC, null, 10), new Data(f0.f322471a, null, false, 6, null));
            case 2:
                String cardNumber = (String) obj2;
                Intrinsics.checkNotNullParameter(cardNumber, "encryptedNumber");
                b1 b1Var = (b1) this.f150420b.f150432a;
                Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
                d0<p6l.q> d0VarLinkNewCard = b1Var.f286424a.linkNewCard("GCM", new q6l.m(cardNumber));
                a0 a0Var = new a0(17, new b0(5));
                d0VarLinkNewCard.getClass();
                ufm.i iVar = new ufm.i(new ufm.i(d0VarLinkNewCard, a0Var, 1), new a0(18, new v6l.d0(b1Var, 2)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return te0.w.i0(iVar);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str2 = (String) pair.f186385a;
                l0 l0Var = (l0) pair.f186386b;
                l0 l0Var2 = l0.INDIA_LOCAL;
                x xVar = this.f150420b;
                return l0Var == l0Var2 ? new pfm.a(xVar.f150433b.y(AccountId.Personal.f51414a), new ha1.s(22, new q(xVar, str2, 1)), 4) : new pfm.h(xVar.K(str2, i93.d.ALL_FIAT, null), 4);
        }
    }
}
