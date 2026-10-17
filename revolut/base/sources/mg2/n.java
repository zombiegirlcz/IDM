package mg2;

import blj.s;
import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2f.b0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f205151b;

    public /* synthetic */ n(p pVar, int i) {
        this.f205150a = i;
        this.f205151b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f205150a) {
            case 0:
                df2.o it8 = (df2.o) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f205151b.I2(it8.f113778a);
            default:
                p pVar = this.f205151b;
                y yVar = pVar.v;
                kg2.i output = (kg2.i) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, kg2.g.f183909a)) {
                    Long l2 = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    if (Intrinsics.f(output, kg2.h.f183910a)) {
                        pVar.H2(yVar, new s(l2, 3));
                        pVar.l2(new b0(pVar, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 24), new yi5.b(26));
                    } else {
                        if (!(output instanceof kg2.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Long lValueOf = Long.valueOf(((kg2.f) output).f183908a);
                        pVar.H2(yVar, new s(lValueOf, 3));
                        pVar.l2(new b0(pVar, lValueOf, objArr == true ? 1 : 0, 24), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
        }
    }
}
