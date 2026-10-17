package c7i;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.automation.screen.c f22035b;

    public /* synthetic */ x(com.revolut.feature_move_money.impl.automation.screen.c cVar, int i) {
        this.f22034a = i;
        this.f22035b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f22034a) {
            case 0:
                r state = (r) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                if (((p) state.f22022a.getContent()) == null) {
                    return null;
                }
                p pVarK2 = this.f22035b.K2();
                return new m7i.i(pVarK2.f22020a, pVarK2.f22021b, state.f22023b, state.f22024c, state.d, state.f, state.e, state.f22025g);
            default:
                com.revolut.feature_move_money.impl.automation.screen.c cVar = this.f22035b;
                cli.y yVar = cVar.D;
                e7i.m output = (e7i.m) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof e7i.l) {
                    cVar.H2(yVar, new c69.v(output, 6));
                } else {
                    if (!(output instanceof e7i.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.H2(yVar, new c42.j(24));
                }
                return Unit.f186387a;
        }
    }
}
