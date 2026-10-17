package au6;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxConfigurationService;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k3 implements d3 {

    @NotNull
    public static final g3 Companion = new g3();
    public static final Type f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f9558g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerTaxConfigurationService f9559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f9561c;
    public final x4l.c d;
    public final x4l.c e;

    static {
        Type type = new TypeToken<Set<? extends ds6.j>>() { // from class: com.revolut.feature.freelancer.impl.repositories.FreelancerTaxConfigurationRepositoryImpl$Companion$RESOLVED_TYPES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f = type;
        Type type2 = new TypeToken<Boolean>() { // from class: com.revolut.feature.freelancer.impl.repositories.FreelancerTaxConfigurationRepositoryImpl$Companion$RESOLVED_TAX_POCKET_BANNER_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f9558g = type2;
    }

    public k3(FreelancerTaxConfigurationService taxConfigApi, ne0.j memoryCache, xe0.e storage) {
        Intrinsics.checkNotNullParameter(taxConfigApi, "taxConfigApi");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9559a = taxConfigApi;
        this.f9560b = memoryCache;
        this.f9561c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new a09.o(this, continuation, 13), new Function1(this) { // from class: au6.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f9522b;

            {
                this.f9522b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Set) this.f9522b.f9560b.get("MEMORY_CACHE_KEY_TAX_TYPE");
                    default:
                        ds6.j type = (ds6.j) obj2;
                        Intrinsics.checkNotNullParameter(type, "type");
                        return (ds6.i) v7.r("MEMORY_CACHE_KEY_SCHEDULE_OPTION", type.name(), this.f9522b.f9560b);
                }
            }
        }, new Function2(this) { // from class: au6.f3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f9530b;

            {
                this.f9530b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        Set types = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(types, "types");
                        this.f9530b.f9560b.f("MEMORY_CACHE_KEY_TAX_TYPE", types);
                        break;
                    default:
                        ds6.j type = (ds6.j) obj2;
                        ds6.i options = (ds6.i) obj3;
                        Intrinsics.checkNotNullParameter(type, "type");
                        Intrinsics.checkNotNullParameter(options, "options");
                        this.f9530b.f9560b.f("MEMORY_CACHE_KEY_SCHEDULE_OPTION" + type.name(), options);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j3(this, null, 1), new a09.p(this, continuation, 23));
        final int i2 = 1;
        this.e = new x4l.c(new a72.k(this, continuation, 14), new Function1(this) { // from class: au6.e3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f9522b;

            {
                this.f9522b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Set) this.f9522b.f9560b.get("MEMORY_CACHE_KEY_TAX_TYPE");
                    default:
                        ds6.j type = (ds6.j) obj2;
                        Intrinsics.checkNotNullParameter(type, "type");
                        return (ds6.i) v7.r("MEMORY_CACHE_KEY_SCHEDULE_OPTION", type.name(), this.f9522b.f9560b);
                }
            }
        }, new Function2(this) { // from class: au6.f3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f9530b;

            {
                this.f9530b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        Set types = (Set) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(types, "types");
                        this.f9530b.f9560b.f("MEMORY_CACHE_KEY_TAX_TYPE", types);
                        break;
                    default:
                        ds6.j type = (ds6.j) obj2;
                        ds6.i options = (ds6.i) obj3;
                        Intrinsics.checkNotNullParameter(type, "type");
                        Intrinsics.checkNotNullParameter(options, "options");
                        this.f9530b.f9560b.f("MEMORY_CACHE_KEY_SCHEDULE_OPTION" + type.name(), options);
                        break;
                }
                return Unit.f186387a;
            }
        }, new ap7.k(this, continuation, 19), new a0e.o(this, continuation, 15));
    }
}
