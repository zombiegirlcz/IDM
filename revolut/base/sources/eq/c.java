package eq;

import com.revolut.kompot.common.ExternalDestination;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.appupdate.ui.a f128216b;

    public /* synthetic */ c(com.revolut.appupdate.ui.a aVar, int i) {
        this.f128215a = i;
        this.f128216b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f128215a;
        t tVar = t.f111465a;
        r rVar = r.f111463a;
        q qVar = q.f111462a;
        s sVar = s.f111464a;
        com.revolut.appupdate.ui.a aVar = this.f128216b;
        u result = (u) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, sVar)) {
                    aVar.C1(new ExternalDestination.ByIntent(aVar.f50364t.t(null), null));
                    aVar.I2();
                } else if (Intrinsics.f(result, qVar)) {
                    aVar.I2();
                } else {
                    if (!(result instanceof p) && !Intrinsics.f(result, rVar) && !Intrinsics.f(result, tVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected result: " + result);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, sVar)) {
                    aVar.C1(new ExternalDestination.ByIntent(aVar.f50364t.t(null), null));
                } else {
                    if (!(result instanceof p) && !Intrinsics.f(result, qVar) && !Intrinsics.f(result, rVar) && !Intrinsics.f(result, tVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected result: " + result);
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                    d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
                return Unit.f186387a;
        }
    }
}
