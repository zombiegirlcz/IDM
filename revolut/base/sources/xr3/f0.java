package xr3;

import com.revolut.feature.credit.application.impl.network.CreditOnboardingService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditOnboardingService f308214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f308215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve0.c f308216c;
    public final qe0.s d;
    public final x4l.c e;
    public final x4l.c f;

    public f0(CreditOnboardingService api2, ne0.d memoryCache, ve0.c storage, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f308214a = api2;
        this.f308215b = memoryCache;
        this.f308216c = storage;
        this.d = ((ze0.c) forceReloadStrategyFactory).a(storage, 300000L);
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new wqj.g(this, continuation, 12), new Function1(this) { // from class: xr3.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f308248b;

            {
                this.f308248b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        b0 params = (b0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.d dVar = this.f308248b.f308215b;
                        params.getClass();
                        return (List) dVar.get("PRIMARY_ENTRY_POINTS_KEY");
                    default:
                        c0 params2 = (c0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f308248b.f308215b.get(params2.f308207b);
                }
            }
        }, new Function2(this) { // from class: xr3.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f308203b;

            {
                this.f308203b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        b0 params = (b0) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        ne0.d dVar = this.f308203b.f308215b;
                        params.getClass();
                        dVar.f("PRIMARY_ENTRY_POINTS_KEY", data);
                        break;
                    default:
                        c0 params2 = (c0) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f308203b.f308215b.f(params2.f308207b, data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e0(this, continuation, i), new wvg.i(this, continuation, 20));
        final int i2 = 1;
        this.f = new x4l.c(new wqj.g(this, continuation, 13), new Function1(this) { // from class: xr3.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f308248b;

            {
                this.f308248b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        b0 params = (b0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.d dVar = this.f308248b.f308215b;
                        params.getClass();
                        return (List) dVar.get("PRIMARY_ENTRY_POINTS_KEY");
                    default:
                        c0 params2 = (c0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (List) this.f308248b.f308215b.get(params2.f308207b);
                }
            }
        }, new Function2(this) { // from class: xr3.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f308203b;

            {
                this.f308203b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        b0 params = (b0) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        ne0.d dVar = this.f308203b.f308215b;
                        params.getClass();
                        dVar.f("PRIMARY_ENTRY_POINTS_KEY", data);
                        break;
                    default:
                        c0 params2 = (c0) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f308203b.f308215b.f(params2.f308207b, data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e0(this, continuation, i2), new wvg.i(this, continuation, 21));
    }
}
