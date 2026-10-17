package sp9;

import io3.i;
import io3.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.cc;
import tof.fc;
import tof.i7;
import tof.na;
import tof.o7;
import tof.qb;
import tof.v6;
import tof.wa;
import tof.xa;
import tof.y6;
import tof.z9;
import wsg.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final i7 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final opf.b f264907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f264908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f264909c;
    public final nhf.a d;
    public final n e;

    static {
        o7 o7Var = new o7();
        i7.c cVar = i7.Companion;
        v6[] v6VarArr = {v6.PENDING, v6.COMPLETED};
        cVar.getClass();
        qb qbVarC = i7.c.c(v6VarArr);
        cc ccVarD = i7.c.d(y6.CARD_PAYMENT, y6.REV_PAYMENT, y6.TRANSFER, y6.ATM);
        na naVar = new na(new xa(l.MERCHANT));
        f = fc.a(fc.a(fc.a(fc.a(fc.a(o7Var, qbVarC), ccVarD), naVar), new z9(null)), new na(new wa(i.EXTERNAL)));
    }

    public b(opf.b paymentsPocketInteractor, fk3.a configurationInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(paymentsPocketInteractor, "paymentsPocketInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f264907a = paymentsPocketInteractor;
        this.f264908b = configurationInteractor;
        this.f264909c = transactionsInteractor;
        this.d = unitedWalletInteractor;
        this.e = walletInteractor;
    }
}
