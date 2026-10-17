package kbj;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import java.util.concurrent.CopyOnWriteArrayList;
import k5e.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import q06.i;
import yhm.r;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f182611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf0.c f182612c;

    public /* synthetic */ a(c cVar, jf0.c cVar2, int i) {
        this.f182610a = i;
        this.f182611b = cVar;
        this.f182612c = cVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object iVar;
        int i = this.f182610a;
        jf0.c cVar = this.f182612c;
        c cVar2 = this.f182611b;
        r rVar = (r) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) rVar.f314202b).booleanValue();
                yoj.a aVar = (yoj.a) rVar.f314203c;
                if (yoj.b.l(aVar)) {
                    iVar = new i(new q06.b(new MainScreenTab("crypto"), null));
                } else if (!yoj.b.k(aVar)) {
                    iVar = new i(new q06.b(new MainScreenTab("accounts"), null));
                } else if (!zBooleanValue || zBooleanValue2) {
                    iVar = new i(new q06.b(new MainScreenTab("crypto"), null));
                } else if (c.h(cVar)) {
                    iVar = new h(c.l(cVar, com.revolut.retail.feature.crypto_deposits.api.navigation.a.WALLET), null);
                } else if (c.j(cVar)) {
                    iVar = new h(c.l(cVar, com.revolut.retail.feature.crypto_deposits.api.navigation.a.FRIENDS), null);
                } else if (c.i(cVar)) {
                    iVar = new h(new CryptoDepositDestination(new CryptoDepositInput.DirectDeposit.AllOptions(true)), new q06.b(new MainScreenTab("crypto"), null));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected deeplink passed to CryptoDepositsDeeplinkActionPerformerImpl");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    iVar = new i(new q06.b(new MainScreenTab("crypto"), null));
                }
                return new ufm.i(cVar2.m(cVar, zBooleanValue, zBooleanValue2, aVar), new k64.a(17, new k(iVar, 21)), 1);
            default:
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return cVar2.m(cVar, ((Boolean) rVar.f314201a).booleanValue(), ((Boolean) rVar.f314202b).booleanValue(), (yoj.a) rVar.f314203c);
        }
    }
}
