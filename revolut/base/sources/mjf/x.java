package mjf;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.ac;
import tof.cc;
import tof.fc;
import tof.gb;
import tof.i7;
import tof.k2;
import tof.k9;
import tof.l9;
import tof.na;
import tof.oa;
import tof.qb;
import tof.r7;
import tof.t0;
import tof.u9;
import tof.v6;
import tof.w6;
import tof.y6;
import tof.za;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements mhf.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qb f206036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oa f206037c;
    public static final u9 d;
    public static final oa e;
    public static final oa f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final na f206038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final na f206039h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f206040a;

    public static final class a {
        private a() {
        }
    }

    static {
        i7.c cVar = i7.Companion;
        v6 v6Var = v6.PENDING;
        v6 v6Var2 = v6.COMPLETED;
        v6 v6Var3 = v6.REVERTED;
        v6[] v6VarArr = {v6Var, v6Var2, v6Var3, v6.DECLINED, v6.FAILED, v6.CANCELLED};
        cVar.getClass();
        f206036b = i7.c.c(v6VarArr);
        f206037c = i7.c.b(fc.b(new r7(yvh.f.SPARE_CHANGE)), new gb(null));
        d = new u9(false);
        t0 t0Var = t0.SUSPICIOUS;
        l9 l9Var = new l9(t0Var);
        za zaVar = new za("suspicious_transaction_user_action_required");
        za zaVar2 = new za("suspicious_transaction_counterparty_action_required");
        za zaVar3 = new za("suspicious_transaction_pending_confirmation");
        y6 y6Var = y6.TOPUP;
        cc ccVarD = i7.c.d(y6Var);
        w6 w6Var = w6.CRYPTO_WALLET;
        e = i7.c.b(l9Var, zaVar, zaVar2, zaVar3, i7.c.a(ccVarD, new ac(w6Var), i7.c.c(v6Var3)));
        na naVarB = fc.b(new l9(t0Var));
        za zaVar4 = new za("suspicious_transaction_user_action_required");
        za zaVar5 = new za("suspicious_transaction_counterparty_action_required");
        za zaVar6 = new za("suspicious_transaction_pending_confirmation");
        za zaVar7 = new za("suspicious_transaction_tm_declined");
        Intrinsics.checkNotNullParameter("DECLINED_BY_SHERLOCK", "fraudReason");
        f = i7.c.b(naVarB, zaVar4, zaVar5, zaVar6, zaVar7, new k9(), fc.b(i7.c.a(i7.c.d(y6Var), new ac(w6Var), i7.c.c(v6Var3))));
        f206038g = fc.b(i7.c.a(i7.o.f272821a, i7.c.d(y6.EXCHANGE)));
        f206039h = fc.b(i7.c.a(i7.c.d(y6.CARD_REFUND), i7.c.c(v6Var)));
    }

    public x() {
        Pair pair = new Pair(k2.VALID_STATES, f206036b);
        Pair pair2 = new Pair(k2.NOT_SPARE_CHANGE, f206037c);
        Pair pair3 = new Pair(k2.NOT_HIDDEN, d);
        k2 k2Var = k2.SUSPICIOUS_BY_FRAUD_STATE;
        oa oaVar = e;
        this.f206040a = r0.k(pair, pair2, pair3, new Pair(k2Var, oaVar), new Pair(k2.SUSPICIOUS_BY_REASON_CODE, f), new Pair(k2.NOT_SUSPICIOUS, fc.b(oaVar)), new Pair(k2.NOT_COLLECTION_EXCHANGE, f206038g), new Pair(k2.NOT_PENDING_CARD_REFUND, f206039h));
    }
}
