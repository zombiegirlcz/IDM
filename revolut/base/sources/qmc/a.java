package qmc;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f247793b;

    public /* synthetic */ a(b bVar, int i) {
        this.f247792a = i;
        this.f247793b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TradingProduct it8 = (TradingProduct) obj2;
        switch (this.f247792a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return k.l(this.f247793b.f247794a, it8.f105280a);
    }
}
