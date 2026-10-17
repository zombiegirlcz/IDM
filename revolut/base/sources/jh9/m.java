package jh9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f174172b;

    public /* synthetic */ m(p pVar, int i) {
        this.f174171a = i;
        this.f174172b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f174171a) {
            case 0:
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof dpf.a)) {
                    if (!(output instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p pVar = this.f174172b;
                    pVar.H2(pVar.v, new bg2.p(output, 6));
                }
                return Unit.f186387a;
            default:
                h1j.b bVar = (h1j.b) obj2;
                if (bVar instanceof h1j.d) {
                    p pVar2 = this.f174172b;
                    pVar2.l2(new jec.p(pVar2, (h1j.d) bVar, null, 7), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
