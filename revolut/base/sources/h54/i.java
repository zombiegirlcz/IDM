package h54;

import h15.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149474b;

    public /* synthetic */ i(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, int i) {
        this.f149473a = i;
        this.f149474b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f149473a) {
            case 0:
                l84.e output = (l84.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof l84.b;
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar = this.f149474b;
                Continuation continuation = null;
                if (z) {
                    dVar.n2(new l(dVar, null, 0), new whi.b(6));
                } else if (output instanceof l84.d) {
                    dVar.n2(new l(dVar, null, 1), new whi.b(6));
                } else {
                    if (!(output instanceof l84.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.n2(new gm6.j(dVar, output, continuation, 29), new whi.b(6));
                }
                return Unit.f186387a;
            default:
                h15.c result = (h15.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, c.C0856c.f148466a);
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar2 = this.f149474b;
                if (zF || Intrinsics.f(result, c.b.f148465a)) {
                    dVar2.n2(new l(dVar2, null, 3), new whi.b(6));
                } else {
                    if (!Intrinsics.f(result, c.a.f148464a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar2.n2(new l(dVar2, null, 4), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
