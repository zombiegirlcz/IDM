package bec;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.shared.ui.pay_with_any.a f14783b;

    public /* synthetic */ h0(com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar, int i) {
        this.f14782a = i;
        this.f14783b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14782a) {
            case 0:
                w6c.e result = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, w6c.a.f295411a);
                com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar = this.f14783b;
                if (zF) {
                    aVar.C2(j.f14790a);
                } else if (Intrinsics.f(result, w6c.b.f295412a)) {
                    aVar.C2(k.f14792a);
                } else if (result instanceof w6c.c) {
                    aVar.C2(new m(((w6c.c) result).f295413a));
                } else {
                    if (!(result instanceof w6c.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(new o(((w6c.d) result).f295414a));
                }
                return Unit.f186387a;
            case 1:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, null, null, ((i) ((j2) this.f14783b.v.f22677a).getValue()).d, null, 3823);
            default:
                gdc.b it8 = (gdc.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar2 = this.f14783b;
                cli.y yVar = aVar2.v;
                int i = j0.f14791a[((i) ((j2) yVar.f22677a).getValue()).f14789j.ordinal()];
                if (i == 1) {
                    aVar2.H2(yVar, new b9i.f(it8, 19));
                } else {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C2(new m(it8.f143126a));
                }
                return Unit.f186387a;
        }
    }
}
