package sne;

import com.revolut.feature.tax_residency.impl.exemption.services.TaxExemptionService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pti.s;
import sek.q;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxExemptionService f264566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f264567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f264568c;
    public final x4l.c d;
    public final x4l.c e;

    public g(TaxExemptionService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f264566a = service;
        this.f264567b = memoryCache;
        this.f264568c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new pti.d(this, continuation, 23), new Function1(this) { // from class: sne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f264560b;

            {
                this.f264560b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (one.d) this.f264560b.f264567b.get(g.a(params));
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (xme.f) this.f264560b.f264567b.get("KEY_PROFILES");
                }
            }
        }, new Function2(this) { // from class: sne.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f264562b;

            {
                this.f264562b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        one.d exemption = (one.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(exemption, "exemption");
                        this.f264562b.f264567b.f(g.a(params), exemption);
                        break;
                    default:
                        xme.f profiles = (xme.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profiles, "profiles");
                        this.f264562b.f264567b.f("KEY_PROFILES", profiles);
                        break;
                }
                return Unit.f186387a;
            }
        }, new q(this, continuation, 10), new e(this, continuation, 0));
        final int i2 = 1;
        this.e = new x4l.c(new s(this, continuation, 12), new Function1(this) { // from class: sne.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f264560b;

            {
                this.f264560b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (one.d) this.f264560b.f264567b.get(g.a(params));
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (xme.f) this.f264560b.f264567b.get("KEY_PROFILES");
                }
            }
        }, new Function2(this) { // from class: sne.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f264562b;

            {
                this.f264562b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        d params = (d) obj2;
                        one.d exemption = (one.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(exemption, "exemption");
                        this.f264562b.f264567b.f(g.a(params), exemption);
                        break;
                    default:
                        xme.f profiles = (xme.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profiles, "profiles");
                        this.f264562b.f264567b.f("KEY_PROFILES", profiles);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, 0), new ska.c(this, continuation, 2), new f(this, continuation, 1));
    }

    public static String a(d dVar) {
        String str = dVar.f264563a;
        if (str == null) {
            str = "all";
        }
        return "KEY_EXEMPTION_".concat(str);
    }
}
