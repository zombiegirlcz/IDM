package wff;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterAction;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends jki.g implements o {

    @NotNull
    private static final u Companion = new u();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ie.a f297106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ep6.n f297107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TroubleshooterDetailScreenContract$InputData f297108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mde.e f297109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bef.b f297110t;
    public final f80.a u;
    public final m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(jki.p stateMapper, ie.a cardsTroubleshooterInteractor, ep6.n feedbackExtension, TroubleshooterDetailScreenContract$InputData input, mde.e sharedHelpDestinationProvider, bef.b transactionItemProvider, f80.a uriHelper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cardsTroubleshooterInteractor, "cardsTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(transactionItemProvider, "transactionItemProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f297106p = cardsTroubleshooterInteractor;
        this.f297107q = feedbackExtension;
        this.f297108r = input;
        this.f297109s = sharedHelpDestinationProvider;
        this.f297110t = transactionItemProvider;
        this.u = uriHelper;
        this.v = new m(input.f91884a, input.f91885b, null, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        l2(new w76.a(this, null, 7), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yo6.c bVar;
        ep6.n nVar = this.f297107q;
        Continuation continuation = null;
        yji.l.b1(this, nVar.F1(), null, new w50.g(this, continuation, 20), 3);
        TroubleshooterDetailScreenContract$InputData troubleshooterDetailScreenContract$InputData = this.f297108r;
        Troubleshooter troubleshooter = troubleshooterDetailScreenContract$InputData.f91885b;
        String str = troubleshooterDetailScreenContract$InputData.f91884a;
        String str2 = troubleshooter.f91840a;
        yo6.d dVar = yo6.d.TROUBLESHOOTER;
        int i = v.f297104a[troubleshooterDetailScreenContract$InputData.d.ordinal()];
        if (i == 1) {
            bVar = new yo6.b(str);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new yo6.a(str);
        }
        yji.l.b1(this, nVar.I1(str2, dVar, bVar), null, new w3k.i(this, continuation, 29), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void y2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (obj2 instanceof TroubleshooterAction) {
            String str = ((TroubleshooterAction) obj2).f91848c;
            if (str != null) {
                z2(str);
                return;
            }
            return;
        }
        if (obj2 != null) {
            mde.e eVar = this.f297109s;
            if (eVar.a(obj2)) {
                C1(eVar.i(obj2));
            }
        }
    }

    public final void z2(String str) {
        if (C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) this.u).f(str), 0, null, 494)) instanceof aii.w) {
            return;
        }
        C1(new ExternalDestination.Browser(str, null));
    }
}
