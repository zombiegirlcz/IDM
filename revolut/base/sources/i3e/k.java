package i3e;

import com.revolut.feature.store.api.navigation.StoreTab;
import com.revolut.feature.store.impl.ui.home.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.store.impl.ui.home.b f158197b;

    public /* synthetic */ k(com.revolut.feature.store.impl.ui.home.b bVar, int i) {
        this.f158196a = i;
        this.f158197b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158196a) {
            case 0:
                a3e.e result = (a3e.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof a3e.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                a3e.d dVar = (a3e.d) result;
                this.f158197b.C2(new h(dVar.f1106a, dVar.f1107b, null));
                return Unit.f186387a;
            case 1:
                y2e.c result2 = (y2e.c) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof y2e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                y2e.b bVar = (y2e.b) result2;
                this.f158197b.C2(new h(bVar.f310635a, bVar.f310636b, bVar.f310637c));
                return Unit.f186387a;
            case 2:
                l3e.e result3 = (l3e.e) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                boolean z = result3 instanceof l3e.d;
                com.revolut.feature.store.impl.ui.home.b bVar2 = this.f158197b;
                if (z) {
                    bVar2.C2(a.c.f88701a);
                } else if (result3 instanceof l3e.c) {
                    bVar2.C2(a.b.f88700a);
                } else {
                    if (!(result3 instanceof l3e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.H2(bVar2.f88706t, new k(bVar2, 3));
                }
                return Unit.f186387a;
            default:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, this.f158197b.I2(StoreTab.Brands.f88622a), false, null, 13);
        }
    }
}
