package vr4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.create.b f291490b;

    public /* synthetic */ l(com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar, int i) {
        this.f291489a = i;
        this.f291490b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291489a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                oki.h.D2(this.f291490b.f69348x);
                return Boolean.FALSE;
            case 1:
                rr4.k result = (rr4.k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof rr4.i;
                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar = this.f291490b;
                if (z) {
                    bVar.B2();
                } else {
                    if (!(result instanceof rr4.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.l2(new vmf.k(bVar, null, 4), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                gu4.d result2 = (gu4.d) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof gu4.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f291490b.B2();
                return Unit.f186387a;
        }
    }
}
