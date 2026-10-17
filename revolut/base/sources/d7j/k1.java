package d7j;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f112017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112018c;

    public /* synthetic */ k1(Object obj2, boolean z, int i) {
        this.f112016a = i;
        this.f112018c = obj2;
        this.f112017b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f112016a) {
            case 0:
                w update = (w) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return w.a(update, null, null, null, null, null, null, new c0(this.f112017b, (Throwable) this.f112018c), null, null, 959);
            case 1:
                String str = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                krj.d dVar = ((grj.i) this.f112018c).f146036a;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                pfm.n nVar = new pfm.n(new h4d.d(dVar, 15), 1);
                Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                pfm.t tVarL = te0.w.g0(nVar).e(dVar.d.g(new WalletId(str), this.f112017b)).l(new i1i.a(dVar, 9));
                Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                return tVarL;
            default:
                String str2 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-nonNullWalletId$0");
                return ((le3.b0) this.f112018c).d.b(str2, this.f112017b);
        }
    }

    public k1(boolean z, Throwable th10) {
        this.f112016a = 0;
        this.f112017b = z;
        this.f112018c = th10;
    }
}
