package bg5;

import com.revolut.feature.crypto.zero_fees.api.models.CryptoZeroFeesPromotion;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoZeroFeesPromotion f15131b;

    public /* synthetic */ f(CryptoZeroFeesPromotion cryptoZeroFeesPromotion, int i) {
        this.f15130a = i;
        this.f15131b = cryptoZeroFeesPromotion;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f15130a) {
            case 0:
                return d.a((d) obj2, null, this.f15131b, null, 23);
            default:
                return nje.f.a((nje.f) obj2, null, null, null, null, null, null, ((CryptoZeroFeesPromotion.Active) this.f15131b).f71351a, 63);
        }
    }
}
