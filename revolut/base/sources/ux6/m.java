package ux6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a f283886b;

    public /* synthetic */ m(com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar, int i) {
        this.f283885a = i;
        this.f283886b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f283885a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, null, null, false, !((j) ((j2) this.f283886b.v.f22677a).getValue()).d, false, 23);
            case 1:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar = this.f283886b;
                aVar.H2(aVar.v, new rk.b(zBooleanValue, 28));
                return Unit.f186387a;
            default:
                zv6.e result = (zv6.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar2 = this.f283886b;
                aVar2.n2(new un8.j(aVar2, result.f325578a, null, 17), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
