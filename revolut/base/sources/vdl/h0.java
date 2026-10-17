package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.PaperTradingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f287973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f287974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaperTradingService f287975c;

    public h0(ne0.j memoryCache, ue0.c storageCache, PaperTradingService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f287973a = memoryCache;
        this.f287974b = storageCache;
        this.f287975c = service;
        Continuation continuation = null;
        final int i = 0;
        new x4l.c(new pti.s(this, continuation, 27), new Function1(this) { // from class: vdl.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f287960b;

            {
                this.f287960b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (uel.a) this.f287960b.f287973a.get("INDUSTRIES_CACHE_KEY");
                    default:
                        String securityRef = (String) obj2;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        ne0.j jVar = this.f287960b.f287973a;
                        h0.Companion.getClass();
                        return (uel.c) jVar.get(g0.a(securityRef));
                }
            }
        }, new Function2(this) { // from class: vdl.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f287967b;

            {
                this.f287967b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        uel.a industries = (uel.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(industries, "industries");
                        this.f287967b.f287973a.f("INDUSTRIES_CACHE_KEY", industries);
                        break;
                    default:
                        String securityRef = (String) obj2;
                        uel.c industry = (uel.c) obj3;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        Intrinsics.checkNotNullParameter(industry, "industry");
                        ne0.j jVar = this.f287967b.f287973a;
                        h0.Companion.getClass();
                        jVar.f(g0.a(securityRef), industry);
                        break;
                }
                return Unit.f186387a;
            }
        }, new uwe.f(this, null, 24), new ska.c(this, continuation, 26));
        final int i2 = 1;
        new x4l.c(new th6.p(this, (Continuation) null, 19), new Function1(this) { // from class: vdl.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f287960b;

            {
                this.f287960b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (uel.a) this.f287960b.f287973a.get("INDUSTRIES_CACHE_KEY");
                    default:
                        String securityRef = (String) obj2;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        ne0.j jVar = this.f287960b.f287973a;
                        h0.Companion.getClass();
                        return (uel.c) jVar.get(g0.a(securityRef));
                }
            }
        }, new Function2(this) { // from class: vdl.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f287967b;

            {
                this.f287967b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        uel.a industries = (uel.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(industries, "industries");
                        this.f287967b.f287973a.f("INDUSTRIES_CACHE_KEY", industries);
                        break;
                    default:
                        String securityRef = (String) obj2;
                        uel.c industry = (uel.c) obj3;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        Intrinsics.checkNotNullParameter(industry, "industry");
                        ne0.j jVar = this.f287967b.f287973a;
                        h0.Companion.getClass();
                        jVar.f(g0.a(securityRef), industry);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v44.e(this, null, 24), new sne.e(this, continuation, 21));
    }
}
