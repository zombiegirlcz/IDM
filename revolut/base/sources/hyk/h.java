package hyk;

import com.revolut.retail.feature.trading_onboarding.impl.data.network.SpouseConsentService;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import te0.w;
import wim.z;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f156897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpouseConsentService f156898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f156899c;
    public final w4l.f d;
    public final w4l.f e;

    public h(ne0.j memoryCache, SpouseConsentService spouseConsentService, ue0.c storage, final b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(spouseConsentService, "spouseConsentService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f156897a = memoryCache;
        this.f156898b = spouseConsentService;
        this.f156899c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: hyk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f156895b;

            {
                this.f156895b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                Unit it8 = (Unit) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<fyk.h> applicant = this.f156895b.f156898b.getApplicant();
                        hy2.l lVar = new hy2.l(new hy2.k(5), 9);
                        applicant.getClass();
                        ufm.i iVar = new ufm.i(applicant, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return w.n0(iVar, networkStateRepository);
                    default:
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<fyk.j> consentStatus = this.f156895b.f156898b.getConsentStatus();
                        hy2.l lVar2 = new hy2.l(new hy2.k(6), 10);
                        consentStatus.getClass();
                        ufm.i iVar2 = new ufm.i(consentStatus, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return w.n0(iVar2, networkStateRepository);
                }
            }
        };
        final int i2 = 2;
        this.d = new w4l.f(function2, new Function1(this) { // from class: hyk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f156891b;

            {
                this.f156891b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pxk.c) this.f156891b.f156897a.get("MEMORY_CACHE_KEY_STATUS");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pxk.c) this.f156891b.f156899c.T2("STORAGE_KEY_STATUS", pxk.c.class);
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pxk.b) this.f156891b.f156897a.get("MEMORY_CACHE_KEY_APPLICANT");
                }
            }
        }, new Function2(this) { // from class: hyk.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f156893b;

            {
                this.f156893b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        pxk.c domain = (pxk.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f156893b.f156897a.f("MEMORY_CACHE_KEY_STATUS", domain);
                        break;
                    case 1:
                        pxk.c domain2 = (pxk.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f156893b.f156899c.G(domain2, "STORAGE_KEY_STATUS", z.d(o0.b(pxk.c.class)));
                        break;
                    default:
                        pxk.b domain3 = (pxk.b) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f156893b.f156897a.f("MEMORY_CACHE_KEY_APPLICANT", domain3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new hy2.k(7), new hy2.b(8), null, null, null, BERTags.FLAGS);
        final int i3 = 1;
        Function2 function22 = new Function2(this) { // from class: hyk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f156895b;

            {
                this.f156895b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                Unit it8 = (Unit) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<fyk.h> applicant = this.f156895b.f156898b.getApplicant();
                        hy2.l lVar = new hy2.l(new hy2.k(5), 9);
                        applicant.getClass();
                        ufm.i iVar = new ufm.i(applicant, lVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return w.n0(iVar, networkStateRepository);
                    default:
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<fyk.j> consentStatus = this.f156895b.f156898b.getConsentStatus();
                        hy2.l lVar2 = new hy2.l(new hy2.k(6), 10);
                        consentStatus.getClass();
                        ufm.i iVar2 = new ufm.i(consentStatus, lVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return w.n0(iVar2, networkStateRepository);
                }
            }
        };
        final int i5 = 0;
        Function1 function1 = new Function1(this) { // from class: hyk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f156891b;

            {
                this.f156891b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pxk.c) this.f156891b.f156897a.get("MEMORY_CACHE_KEY_STATUS");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pxk.c) this.f156891b.f156899c.T2("STORAGE_KEY_STATUS", pxk.c.class);
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pxk.b) this.f156891b.f156897a.get("MEMORY_CACHE_KEY_APPLICANT");
                }
            }
        };
        Function2 function23 = new Function2(this) { // from class: hyk.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f156893b;

            {
                this.f156893b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i5) {
                    case 0:
                        pxk.c domain = (pxk.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f156893b.f156897a.f("MEMORY_CACHE_KEY_STATUS", domain);
                        break;
                    case 1:
                        pxk.c domain2 = (pxk.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f156893b.f156899c.G(domain2, "STORAGE_KEY_STATUS", z.d(o0.b(pxk.c.class)));
                        break;
                    default:
                        pxk.b domain3 = (pxk.b) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f156893b.f156897a.f("MEMORY_CACHE_KEY_APPLICANT", domain3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i6 = 1;
        this.e = new w4l.f(function22, function1, function23, new Function1(this) { // from class: hyk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f156891b;

            {
                this.f156891b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pxk.c) this.f156891b.f156897a.get("MEMORY_CACHE_KEY_STATUS");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pxk.c) this.f156891b.f156899c.T2("STORAGE_KEY_STATUS", pxk.c.class);
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pxk.b) this.f156891b.f156897a.get("MEMORY_CACHE_KEY_APPLICANT");
                }
            }
        }, new Function2(this) { // from class: hyk.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f156893b;

            {
                this.f156893b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i6) {
                    case 0:
                        pxk.c domain = (pxk.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f156893b.f156897a.f("MEMORY_CACHE_KEY_STATUS", domain);
                        break;
                    case 1:
                        pxk.c domain2 = (pxk.c) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f156893b.f156899c.G(domain2, "STORAGE_KEY_STATUS", z.d(o0.b(pxk.c.class)));
                        break;
                    default:
                        pxk.b domain3 = (pxk.b) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f156893b.f156897a.f("MEMORY_CACHE_KEY_APPLICANT", domain3);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static final void a(h hVar, Response response) {
        hVar.getClass();
        if (!response.isSuccessful() && response.code() != 409) {
            throw new HttpException(response);
        }
    }
}
