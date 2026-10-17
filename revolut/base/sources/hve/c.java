package hve;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.topup_screen.impl.data.repository.topup_methods.TopUpMethodsRequest;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopUpMethodsContext f155822b;

    public /* synthetic */ c(TopUpMethodsContext topUpMethodsContext, int i) {
        this.f155821a = i;
        this.f155822b = topUpMethodsContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean zF;
        TopUpMethodsRequest it8 = (TopUpMethodsRequest) obj2;
        switch (this.f155821a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                zF = Intrinsics.f(hx7.b.q(it8.f90581a), hx7.b.q(this.f155822b.f90551b));
                break;
            default:
                zF = Intrinsics.f(hx7.b.q(it8.f90581a), hx7.b.q(this.f155822b.f90551b));
                break;
        }
        return Boolean.valueOf(zF);
    }
}
