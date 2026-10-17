package vfc;

import au6.u;
import com.revolut.feature.revpro.pro_merchant.toggles.impl.data.network.ProMerchantFeatureToggleService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import w4l.h;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProMerchantFeatureToggleService f288566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f288567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tfc.a f288568c;
    public final xe0.e d;
    public final x4l.c e;
    public final x4l.c f;

    public f(ProMerchantFeatureToggleService service, j cache, tfc.a mapper, xe0.e storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f288566a = service;
        this.f288567b = cache;
        this.f288568c = mapper;
        this.d = storage;
        final int i = 0;
        this.e = new x4l.c(new d(this, null, 1), new Function1(this) { // from class: vfc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f288561b;

            {
                this.f288561b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (kf1.j) this.f288561b.f288567b.get("PRO_MERCHANT_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (kf1.d) this.f288561b.f288567b.get("ProMerchantTogglesRepositoryImpl:CardReaderUsage:Memory");
                }
            }
        }, new Function2(this) { // from class: vfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f288563b;

            {
                this.f288563b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        kf1.j toggle = (kf1.j) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(toggle, "toggle");
                        this.f288563b.f288567b.f("PRO_MERCHANT_KEY", toggle);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        this.f288563b.f288567b.f("ProMerchantTogglesRepositoryImpl:CardReaderUsage:Memory", (kf1.d) obj3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, null, 1), new ska.c(this, (Continuation) null, 27));
        final int i2 = 1;
        this.f = new x4l.c(new d(this, null, 0), new Function1(this) { // from class: vfc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f288561b;

            {
                this.f288561b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (kf1.j) this.f288561b.f288567b.get("PRO_MERCHANT_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (kf1.d) this.f288561b.f288567b.get("ProMerchantTogglesRepositoryImpl:CardReaderUsage:Memory");
                }
            }
        }, new Function2(this) { // from class: vfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f288563b;

            {
                this.f288563b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        kf1.j toggle = (kf1.j) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(toggle, "toggle");
                        this.f288563b.f288567b.f("PRO_MERCHANT_KEY", toggle);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        this.f288563b.f288567b.f("ProMerchantTogglesRepositoryImpl:CardReaderUsage:Memory", (kf1.d) obj3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, null, 0), new u(this, (Continuation) null, 9));
    }

    public final vkm.d a() {
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.e.b(Unit.f186387a, loadingStrategy);
    }
}
