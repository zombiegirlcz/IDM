package pti;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftConfigService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftConfigService f239741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f239742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f239743c;
    public final x4l.c d;
    public final x4l.c e;

    public k(AsftConfigService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f239741a = service;
        this.f239742b = memoryCache;
        this.f239743c = storage;
        final int i = 0;
        Continuation continuation = null;
        this.d = new x4l.c(new i(this, continuation, i), new Function1(this) { // from class: pti.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f239737b;

            {
                this.f239737b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (AsftConfig) this.f239737b.f239742b.get("KEY_CONFIG");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (String) this.f239737b.f239742b.get("KEY_PRODUCT_ARTICLE");
                }
            }
        }, new Function2(this) { // from class: pti.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f239739b;

            {
                this.f239739b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        AsftConfig data = (AsftConfig) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f239739b.f239742b.f("KEY_CONFIG", data);
                        break;
                    default:
                        String data2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f239739b.f239742b.f("KEY_PRODUCT_ARTICLE", data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, i), new p24.q(this, continuation, 10));
        final int i2 = 1;
        this.e = new x4l.c(new i(this, continuation, i2), new Function1(this) { // from class: pti.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f239737b;

            {
                this.f239737b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (AsftConfig) this.f239737b.f239742b.get("KEY_CONFIG");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (String) this.f239737b.f239742b.get("KEY_PRODUCT_ARTICLE");
                }
            }
        }, new Function2(this) { // from class: pti.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f239739b;

            {
                this.f239739b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        AsftConfig data = (AsftConfig) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f239739b.f239742b.f("KEY_CONFIG", data);
                        break;
                    default:
                        String data2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f239739b.f239742b.f("KEY_PRODUCT_ARTICLE", data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, i2), new p24.q(this, continuation, 11));
    }

    public static vkm.d a(k kVar) {
        kVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return kVar.d.b(Unit.f186387a, loadingStrategy);
    }
}
