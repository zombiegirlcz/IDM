package hu7;

import bu7.b0;
import com.revolut.feature.insurance_embedded.impl.data.model.l0;
import com.revolut.feature.insurance_embedded.impl.data.network.InsuranceEmbeddedService;
import g2e.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceEmbeddedService f155582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f155583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f155584c;
    public final x4l.c d;
    public final x4l.c e;

    public j(InsuranceEmbeddedService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f155582a = service;
        this.f155583b = memoryCache;
        this.f155584c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new ghl.l(this, continuation, 6), new Function1(this) { // from class: hu7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f155573b;

            {
                this.f155573b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        h params = (h) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (b0) this.f155573b.f155583b.get(params.a());
                    default:
                        f params2 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (l0) this.f155573b.f155583b.get(params2.a());
                }
            }
        }, new Function2(this) { // from class: hu7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f155575b;

            {
                this.f155575b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        h params = (h) obj2;
                        b0 domain = (b0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f155575b.f155583b.f(params.a(), domain);
                        break;
                    default:
                        f params2 = (f) obj2;
                        l0 domain2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f155575b.f155583b.f(params2.a(), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new i(this, continuation, 1), new m0(this, continuation, 19));
        final int i2 = 1;
        this.e = new x4l.c(new ghl.l(this, continuation, 5), new Function1(this) { // from class: hu7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f155573b;

            {
                this.f155573b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        h params = (h) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (b0) this.f155573b.f155583b.get(params.a());
                    default:
                        f params2 = (f) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (l0) this.f155573b.f155583b.get(params2.a());
                }
            }
        }, new Function2(this) { // from class: hu7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f155575b;

            {
                this.f155575b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        h params = (h) obj2;
                        b0 domain = (b0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f155575b.f155583b.f(params.a(), domain);
                        break;
                    default:
                        f params2 = (f) obj2;
                        l0 domain2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f155575b.f155583b.f(params2.a(), domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new i(this, continuation, 0), new m0(this, continuation, 18));
    }

    public final Object a(String str, gim.i iVar) {
        hg0.n nVar = new hg0.n(this, str, null, 26);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, nVar, iVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final vkm.d b(String insuranceId, dl7.a subtype) {
        Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        return this.d.c(new h(insuranceId, u1.g(subtype, fu7.k.f138114b)), false);
    }
}
