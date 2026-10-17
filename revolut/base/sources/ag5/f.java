package ag5;

import com.revolut.feature.crypto.config.api.models.CryptoPersonalExchangeFeesResources;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pd5.d f4791b;

    public /* synthetic */ f(pd5.d dVar, int i) {
        this.f4790a = i;
        this.f4791b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f4790a) {
            case 0:
                d dVar = (d) obj2;
                CryptoPersonalExchangeFeesResources cryptoPersonalExchangeFeesResources = this.f4791b.k;
                return d.a(dVar, null, cryptoPersonalExchangeFeesResources != null ? cryptoPersonalExchangeFeesResources.f70780b : null, 3);
            case 1:
                return bg5.d.a((bg5.d) obj2, null, null, this.f4791b, 15);
            default:
                return zf5.g.a((zf5.g) obj2, null, null, null, null, null, this.f4791b, 63);
        }
    }
}
