package s54;

import c84.t;
import jli.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rv3.b;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.banner.a f259917b;

    public /* synthetic */ b(com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar, int i) {
        this.f259916a = i;
        this.f259917b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f259916a;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar = this.f259917b;
        switch (i) {
            case 0:
                rv3.b output = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof b.a) {
                    t.J2(aVar, false, null, null, 7);
                } else if (output instanceof rv3.c) {
                    aVar.l2(new s09.c(aVar, output, continuation, 11), new yi5.b(26));
                } else {
                    if (!(output instanceof b.C1428b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = h.f175850a;
                }
                return Unit.f186387a;
            default:
                d84.d result = (d84.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, d84.c.f112125a)) {
                    aVar.K2(null);
                } else {
                    if (!Intrinsics.f(result, d84.b.f112124a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = h.f175850a;
                }
                return Unit.f186387a;
        }
    }
}
