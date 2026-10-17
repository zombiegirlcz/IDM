package gwc;

import com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$FlowState;
import fwc.o;
import fwc.p;
import fwc.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends oki.h implements ali.h {
    public final buc.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f147313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final iwc.b f147314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cli.h f147315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ali.b f147316s;

    public i(com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.c stateMapper, buc.g transactionLimitsFlowTypeProvider, gte.a featureToggleInteractor, iwc.b transactionLimitsFlowProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transactionLimitsFlowTypeProvider, "transactionLimitsFlowTypeProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transactionLimitsFlowProvider, "transactionLimitsFlowProvider");
        this.o = transactionLimitsFlowTypeProvider;
        this.f147313p = featureToggleInteractor;
        this.f147314q = transactionLimitsFlowProvider;
        Intrinsics.checkNotNullParameter("TransactionsLimitsFlow", "keyValue");
        this.f147315r = mra.d.e(this, "TransactionsLimitsFlow", new TransactionsLimitsFlowContract$FlowState(0), stateMapper, null, 24);
        this.f147316s = s.b(this, new ghl.c(this, 21));
    }

    public static final void I2(i iVar, q qVar) {
        iVar.getClass();
        if (qVar instanceof o) {
            o oVar = (o) qVar;
            iVar.C2(new c(oVar.f138611a, oVar.f138612b));
        } else {
            if (!(qVar instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            iVar.C2(new e(((p) qVar).f138613a));
        }
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f147316s;
    }

    @Override // yji.l
    public final void I1() {
        l2(new com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.a(this, null), new yi5.b(26));
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f147315r;
    }
}
