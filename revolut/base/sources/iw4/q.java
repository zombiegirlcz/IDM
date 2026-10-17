package iw4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ll4.u;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b f168958b;

    public /* synthetic */ q(com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b bVar, int i) {
        this.f168957a = i;
        this.f168958b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f168957a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                dj0.d dVar = (dj0.d) pair.f186385a;
                u uVar = (u) pair.f186386b;
                return nim.a.v(ngm.n.K(new inh.g(this.f168958b, dVar, null, 4)), new is6.t(dVar, uVar, 16));
            default:
                fw4.g result = (fw4.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof fw4.e)) {
                    if (!(result instanceof fw4.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f168958b.K2(((fw4.f) result).f138577a);
                }
                return Unit.f186387a;
        }
    }
}
