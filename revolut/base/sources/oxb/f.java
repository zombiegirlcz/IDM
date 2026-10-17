package oxb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsPersonalisationService;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandsResponse;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferencesResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPersonalisationService f230761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f230762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f230763c;
    public final x4l.c d;
    public final x4l.c e;

    public f(RevPointsPersonalisationService service, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f230761a = service;
        this.f230762b = storage;
        this.f230763c = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new d(this, continuation, 1), new Function1(this) { // from class: oxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f230757b;

            {
                this.f230757b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (RevPointsPersonalisationPreferencesResponse) this.f230757b.f230763c.get("PERSONALISATION_PREFERENCES_MEM_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (RevPointsPersonalisationBrandsResponse) this.f230757b.f230763c.get("PERSONALISATION_BRANDS_MEM_KEY");
                }
            }
        }, new Function2(this) { // from class: oxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f230759b;

            {
                this.f230759b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        RevPointsPersonalisationPreferencesResponse preferences = (RevPointsPersonalisationPreferencesResponse) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(preferences, "preferences");
                        this.f230759b.f230763c.f("PERSONALISATION_PREFERENCES_MEM_KEY", preferences);
                        break;
                    default:
                        RevPointsPersonalisationBrandsResponse brands = (RevPointsPersonalisationBrandsResponse) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(brands, "brands");
                        this.f230759b.f230763c.f("PERSONALISATION_BRANDS_MEM_KEY", brands);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 1), new l05.b(this, continuation, 28));
        final int i2 = 1;
        this.e = new x4l.c(new d(this, continuation, 0), new Function1(this) { // from class: oxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f230757b;

            {
                this.f230757b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (RevPointsPersonalisationPreferencesResponse) this.f230757b.f230763c.get("PERSONALISATION_PREFERENCES_MEM_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (RevPointsPersonalisationBrandsResponse) this.f230757b.f230763c.get("PERSONALISATION_BRANDS_MEM_KEY");
                }
            }
        }, new Function2(this) { // from class: oxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f230759b;

            {
                this.f230759b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        RevPointsPersonalisationPreferencesResponse preferences = (RevPointsPersonalisationPreferencesResponse) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(preferences, "preferences");
                        this.f230759b.f230763c.f("PERSONALISATION_PREFERENCES_MEM_KEY", preferences);
                        break;
                    default:
                        RevPointsPersonalisationBrandsResponse brands = (RevPointsPersonalisationBrandsResponse) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(brands, "brands");
                        this.f230759b.f230763c.f("PERSONALISATION_BRANDS_MEM_KEY", brands);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, 0), new l05.b(this, continuation, 27));
    }
}
