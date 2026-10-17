package b6a;

import a09.o;
import az.i;
import com.revolut.feature.payments_migration.impl.network.PaymentsMigrationService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import w5a.f;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentsMigrationService f12552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f12554c;
    public final x4l.c d;
    public final x4l.c e;

    public e(PaymentsMigrationService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f12552a = service;
        this.f12553b = memoryCache;
        this.f12554c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new o(this, continuation, 18), new Function1(this) { // from class: b6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f12547b;

            {
                this.f12547b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (f) this.f12547b.f12553b.get("payments_migration_cache_key");
                    default:
                        y5a.a params = (y5a.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (y5a.d) this.f12547b.f12553b.get(e.a(params));
                }
            }
        }, new Function2(this) { // from class: b6a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f12549b;

            {
                this.f12549b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f domain = (f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f12549b.f12553b.f("payments_migration_cache_key", domain);
                        break;
                    default:
                        y5a.a params = (y5a.a) obj2;
                        y5a.d domain2 = (y5a.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f12549b.f12553b.f(e.a(params), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new i(this, continuation, 10), new awd.b(this, continuation, 4));
        final int i2 = 1;
        this.e = new x4l.c(new d(this, continuation, 0), new Function1(this) { // from class: b6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f12547b;

            {
                this.f12547b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (f) this.f12547b.f12553b.get("payments_migration_cache_key");
                    default:
                        y5a.a params = (y5a.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (y5a.d) this.f12547b.f12553b.get(e.a(params));
                }
            }
        }, new Function2(this) { // from class: b6a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f12549b;

            {
                this.f12549b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f domain = (f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f12549b.f12553b.f("payments_migration_cache_key", domain);
                        break;
                    default:
                        y5a.a params = (y5a.a) obj2;
                        y5a.d domain2 = (y5a.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f12549b.f12553b.f(e.a(params), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new avk.i(this, continuation, 28), new a0e.o(this, continuation, 21));
    }

    public static String a(y5a.a aVar) {
        String str = aVar.f311015a;
        String str2 = aVar.f311016b;
        if (str2 == null) {
            str2 = "null";
        }
        return a0.d.s("query:", str, "_blockId:", str2);
    }
}
