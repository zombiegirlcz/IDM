package okl;

import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.domain.models.Claim;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f226169c;

    public /* synthetic */ e(com.revolut.sso.impl.ui.auth.n nVar, String str, int i) {
        this.f226167a = i;
        this.f226168b = nVar;
        this.f226169c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f226167a;
        String str = this.f226169c;
        switch (i) {
            case 0:
                lni.i result = (lni.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof lni.d;
                com.revolut.sso.impl.ui.auth.n nVar = this.f226168b;
                if (z || (result instanceof lni.e)) {
                    nVar.y3();
                    Unit unit = Unit.f186387a;
                } else if (result instanceof lni.f) {
                    nVar.l2(new n0(nVar, str, result, null), new yi5.b(26));
                } else if (result instanceof lni.g) {
                    nVar.l2(new o0(nVar, str, result, null), new yi5.b(26));
                } else {
                    if (!(result instanceof lni.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.l2(new p0(nVar, str, result, null), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                kql.e result2 = (kql.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean zF = Intrinsics.f(result2, kql.a.f188440a);
                com.revolut.sso.impl.ui.auth.n nVar2 = this.f226168b;
                if (zF) {
                    yji.l.a1(nVar2, nVar2.X1(((jol.c) nVar2.D).a(new Claim.Phone(str))), null, null, new s0(nVar2, null), 3);
                } else if (Intrinsics.f(result2, kql.b.f188441a)) {
                    nVar2.l2(new t0(nVar2, str, null), new yi5.b(26));
                } else if (Intrinsics.f(result2, kql.c.f188442a)) {
                    RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState(p.a.p("Unexpected ", result2.getClass().getName(), " result"));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
                } else if (!Intrinsics.f(result2, kql.d.f188443a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
