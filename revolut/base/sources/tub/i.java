package tub;

import com.revolut.feature.rev_points.buying.impl.data.network.RevPointsBuyingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import rub.m;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsBuyingService f274568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f274569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f274570c;
    public final x4l.c d;
    public final x4l.c e;

    public i(RevPointsBuyingService revPointsBuyingService, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(revPointsBuyingService, "revPointsBuyingService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f274568a = revPointsBuyingService;
        this.f274569b = memoryCache;
        this.f274570c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new g(this, null, 1), new Function1(this) { // from class: tub.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f274561b;

            {
                this.f274561b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (m) this.f274561b.f274569b.get("POINTS_BUYING_PACKAGES_RESPONSE_MEM_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (rub.c) this.f274561b.f274569b.get("POINTS_BUYING_ACTIVE_PACKAGE_RESPONSE_MEM_KEY");
                }
            }
        }, new Function2(this) { // from class: tub.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f274563b;

            {
                this.f274563b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        m pointsBuyingPackages = (m) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(pointsBuyingPackages, "pointsBuyingPackages");
                        this.f274563b.f274569b.f("POINTS_BUYING_PACKAGES_RESPONSE_MEM_KEY", pointsBuyingPackages);
                        break;
                    default:
                        rub.c pointsBuyingActivePackage = (rub.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(pointsBuyingActivePackage, "pointsBuyingActivePackage");
                        this.f274563b.f274569b.f("POINTS_BUYING_ACTIVE_PACKAGE_RESPONSE_MEM_KEY", pointsBuyingActivePackage);
                        break;
                }
                return Unit.f186387a;
            }
        }, new h(this, null, 1), new ska.c(this, continuation, 11));
        final int i2 = 1;
        this.e = new x4l.c(new g(this, null, 0), new Function1(this) { // from class: tub.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f274561b;

            {
                this.f274561b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (m) this.f274561b.f274569b.get("POINTS_BUYING_PACKAGES_RESPONSE_MEM_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (rub.c) this.f274561b.f274569b.get("POINTS_BUYING_ACTIVE_PACKAGE_RESPONSE_MEM_KEY");
                }
            }
        }, new Function2(this) { // from class: tub.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f274563b;

            {
                this.f274563b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        m pointsBuyingPackages = (m) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(pointsBuyingPackages, "pointsBuyingPackages");
                        this.f274563b.f274569b.f("POINTS_BUYING_PACKAGES_RESPONSE_MEM_KEY", pointsBuyingPackages);
                        break;
                    default:
                        rub.c pointsBuyingActivePackage = (rub.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(pointsBuyingActivePackage, "pointsBuyingActivePackage");
                        this.f274563b.f274569b.f("POINTS_BUYING_ACTIVE_PACKAGE_RESPONSE_MEM_KEY", pointsBuyingActivePackage);
                        break;
                }
                return Unit.f186387a;
            }
        }, new h(this, null, 0), new ska.c(this, continuation, 10));
    }

    public static final Object a(i iVar, Response response) {
        iVar.getClass();
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
        Object objBody = response.body();
        if (objBody != null) {
            return objBody;
        }
        throw new HttpException(response);
    }
}
