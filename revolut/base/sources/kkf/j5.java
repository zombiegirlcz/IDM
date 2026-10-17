package kkf;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j5 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f184774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z6c.a f184775n;

    public j5(klf.h0 commonDataSource, gte.a featureToggleInteractor, z6c.a mitInsufficientFundsWidgetMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mitInsufficientFundsWidgetMapper, "mitInsufficientFundsWidgetMapper");
        this.f184773l = commonDataSource;
        this.f184774m = featureToggleInteractor;
        this.f184775n = mitInsufficientFundsWidgetMapper;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        dj0.d dVar;
        xi0.b bVar;
        boolean z = true;
        boolean z3 = false;
        if (Intrinsics.f(str, "ID_NOTE_DELEGATE_CLAUSE")) {
            ty0.a aVar = obj2 instanceof ty0.a ? (ty0.a) obj2 : null;
            if (aVar != null && Intrinsics.f(aVar.f275445a, "ID_MIT_INSUFFICIENT_FUNDS_ADD_MONEY")) {
                tof.a3 a3VarB = this.f184773l.b();
                if (a3VarB != null && (dVar = a3VarB.k) != null && (bVar = dVar.f115083b) != null) {
                    A2(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, bVar, null, null, pte.a.NESTED_TOP_UP, 22)));
                }
            } else {
                z = false;
            }
            z3 = z;
        } else if (Intrinsics.f(str, "MIT_INSUFFICIENT_FUNDS_COMPLETE_PAYMENT_LIST_ID")) {
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null || kotlin.text.d0.W(str2)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No url provided for complete payment action");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                z = false;
                z3 = z;
            } else {
                A2(new ExternalDestination.Browser(str2, null));
                z3 = z;
            }
        }
        return Boolean.valueOf(z3);
    }
}
