package yud;

import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w4l.k;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f317003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f317004c;

    public /* synthetic */ a(g gVar, k kVar, int i) {
        this.f317002a = i;
        this.f317003b = gVar;
        this.f317004c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f317002a) {
            case 0:
                if (!((Boolean) obj2).booleanValue()) {
                    return zi0.c.i(f0.f322471a);
                }
                awd.c cVar = this.f317003b.e;
                cVar.getClass();
                k loadingStrategy = this.f317004c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(cVar.e.b(Unit.f186387a, loadingStrategy), new ysk.a(14));
            default:
                StakingProduct stakingProduct = (StakingProduct) obj2;
                Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
                yvd.c cVar2 = this.f317003b.d;
                cVar2.getClass();
                k loadingStrategy2 = this.f317004c;
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                return nim.a.v(cVar2.f317167h.b(Unit.f186387a, loadingStrategy2), new c(0, stakingProduct));
        }
    }
}
