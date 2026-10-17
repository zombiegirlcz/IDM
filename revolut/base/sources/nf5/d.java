package nf5;

import com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacadeV2;
import com.revolut.feature.crypto.exchange.fees.impl.service.CryptoExchangeFeesService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lp6.g;
import mtj.k;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f214832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f214833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoExchangeFeesService f214834c;
    public final x4l.c d;
    public final x4l.c e;

    public d(ue0.c storage, j memoryCache, CryptoExchangeFeesService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f214832a = storage;
        this.f214833b = memoryCache;
        this.f214834c = service;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new k(this, continuation, 9), new Function1(this) { // from class: nf5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214829b;

            {
                this.f214829b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        List params = (List) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f214829b.f214833b.get(String.valueOf(params.hashCode()));
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (CryptoExchangeFeesFacadeV2) this.f214829b.f214833b.get("CURRENT_CRYPTO_EXCHANGE_FEES_KEY");
                }
            }
        }, new Function2(this) { // from class: nf5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214831b;

            {
                this.f214831b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List params = (List) obj2;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f214831b.f214833b.f(String.valueOf(params.hashCode()), domain);
                        break;
                    default:
                        CryptoExchangeFeesFacadeV2 domain2 = (CryptoExchangeFeesFacadeV2) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f214831b.f214833b.f("CURRENT_CRYPTO_EXCHANGE_FEES_KEY", domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new naf.j(this, continuation, 8), new g(this, continuation, 20));
        final int i2 = 1;
        this.e = new x4l.c(new k3c.k(this, continuation, 17), new Function1(this) { // from class: nf5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214829b;

            {
                this.f214829b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        List params = (List) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f214829b.f214833b.get(String.valueOf(params.hashCode()));
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (CryptoExchangeFeesFacadeV2) this.f214829b.f214833b.get("CURRENT_CRYPTO_EXCHANGE_FEES_KEY");
                }
            }
        }, new Function2(this) { // from class: nf5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214831b;

            {
                this.f214831b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List params = (List) obj2;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f214831b.f214833b.f(String.valueOf(params.hashCode()), domain);
                        break;
                    default:
                        CryptoExchangeFeesFacadeV2 domain2 = (CryptoExchangeFeesFacadeV2) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f214831b.f214833b.f("CURRENT_CRYPTO_EXCHANGE_FEES_KEY", domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new mta.c(this, continuation, 27), new l05.b(this, continuation, 20));
    }
}
