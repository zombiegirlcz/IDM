package x0i;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f301644b;

    public /* synthetic */ h(j jVar, int i) {
        this.f301643a = i;
        this.f301644b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ExchangeOrder.Active order = (ExchangeOrder.Active) obj2;
        switch (this.f301643a) {
            case 0:
                Intrinsics.checkNotNullParameter(order, "order");
                nd.k kVar = this.f301644b.f301648b;
                break;
            default:
                Intrinsics.checkNotNullParameter(order, "order");
                nd.k kVar2 = this.f301644b.f301648b;
                break;
        }
        return nd.k.l(order, null, null);
    }
}
