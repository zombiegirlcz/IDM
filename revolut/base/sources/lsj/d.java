package lsj;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import efm.d0;
import h30.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import ufm.i;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f199688b;

    public /* synthetic */ d(f fVar, int i) {
        this.f199687a = i;
        this.f199688b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        uzi.c cVar;
        int i = this.f199687a;
        f fVar = this.f199688b;
        switch (i) {
            case 0:
                String str = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                d0<ksj.c> analyticsCycle = fVar.f199693c.getAnalyticsCycle(str);
                c cVar2 = c.f;
                o0 o0Var = new o0(6);
                analyticsCycle.getClass();
                i iVar = new i(analyticsCycle, o0Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 1:
                String str2 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                ne0.d dVar = fVar.f199692b;
                f.Companion.getClass();
                return (uzi.b) dVar.get(a.a(str2));
            case 2:
                String str3 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                ue0.c cVar3 = fVar.f199691a;
                f.Companion.getClass();
                msj.b bVar = (msj.b) cVar3.T2(a.a(str3), msj.b.class);
                if (bVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                String period = bVar.getPeriod();
                if (Intrinsics.f(period, "MONTHLY")) {
                    cVar = uzi.c.MONTHLY;
                } else {
                    if (!Intrinsics.f(period, "WEEKLY")) {
                        throw new IllegalStateException(l.r("Unexpected cycle period: ", bVar.getPeriod()));
                    }
                    cVar = uzi.c.WEEKLY;
                }
                return new uzi.b(cVar, bVar.getStart());
            default:
                String str4 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str4, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                ne0.d dVar2 = fVar.f199692b;
                f.Companion.getClass();
                Intrinsics.checkNotNullParameter(str4, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                return (b) dVar2.get("KEY_SELECTED_PERIOD_" + str4);
        }
    }
}
