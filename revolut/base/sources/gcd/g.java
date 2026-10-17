package gcd;

import com.revolut.feature.shared.savings.impl.product.data.network.SavingsProductService;
import com.revolut.feature.shared.savings.models.product.SavingsOnboardingData;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import g2e.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductService f142414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f142415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f142416c;
    public final lob.a d;
    public final x4l.c e;
    public final x4l.c f;

    public g(SavingsProductService service, j memoryCache, ue0.c savingsStorage, lob.a sharedSavingsToggles) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(savingsStorage, "savingsStorage");
        Intrinsics.checkNotNullParameter(sharedSavingsToggles, "sharedSavingsToggles");
        this.f142414a = service;
        this.f142415b = memoryCache;
        this.f142416c = savingsStorage;
        this.d = sharedSavingsToggles;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new frk.a(this, continuation, 25), new Function1(this) { // from class: gcd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142407b;

            {
                this.f142407b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (SavingsOnboardingData) this.f142407b.f142415b.get(g.b(params));
                    default:
                        String productId = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        return (SavingsProductData) this.f142407b.f142415b.get(g.a(productId));
                }
            }
        }, new Function2(this) { // from class: gcd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142409b;

            {
                this.f142409b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        SavingsOnboardingData onboardingData = (SavingsOnboardingData) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(onboardingData, "onboardingData");
                        this.f142409b.f142415b.f(g.b(params), onboardingData);
                        break;
                    default:
                        String productId = (String) obj2;
                        SavingsProductData productData = (SavingsProductData) obj3;
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        Intrinsics.checkNotNullParameter(productData, "productData");
                        this.f142409b.f142415b.f(g.a(productId), productData);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, i), new m0(this, continuation, 6));
        final int i2 = 1;
        this.f = new x4l.c(new frk.a(this, continuation, 26), new Function1(this) { // from class: gcd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142407b;

            {
                this.f142407b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (SavingsOnboardingData) this.f142407b.f142415b.get(g.b(params));
                    default:
                        String productId = (String) obj2;
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        return (SavingsProductData) this.f142407b.f142415b.get(g.a(productId));
                }
            }
        }, new Function2(this) { // from class: gcd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142409b;

            {
                this.f142409b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        d params = (d) obj2;
                        SavingsOnboardingData onboardingData = (SavingsOnboardingData) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(onboardingData, "onboardingData");
                        this.f142409b.f142415b.f(g.b(params), onboardingData);
                        break;
                    default:
                        String productId = (String) obj2;
                        SavingsProductData productData = (SavingsProductData) obj3;
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        Intrinsics.checkNotNullParameter(productData, "productData");
                        this.f142409b.f142415b.f(g.a(productId), productData);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, i2), new m0(this, continuation, 7));
    }

    public static String a(String str) {
        return j6.a.q("savings_product_data_key_", str);
    }

    public static String b(d dVar) {
        return "savings_onboarding_data_key_" + dVar.f142410a + dVar.f142411b;
    }
}
