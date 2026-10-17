package au6;

import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxProfileService;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r3 {

    @NotNull
    public static final p3 Companion = new p3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f9612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerTaxProfileService f9613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final os6.d f9614c;
    public final xe0.e d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f9615g;

    public r3(ne0.j memoryCache, FreelancerTaxProfileService taxProfileApi, os6.d taxProfilesDao, xe0.e storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(taxProfileApi, "taxProfileApi");
        Intrinsics.checkNotNullParameter(taxProfilesDao, "taxProfilesDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9612a = memoryCache;
        this.f9613b = taxProfileApi;
        this.f9614c = taxProfilesDao;
        this.d = storage;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new a09.o(this, continuation, 15), new Function1(this) { // from class: au6.n3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r3 f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f9585b.f9612a.get("MEMORY_CACHE_KEY_TAX_PROFILE");
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        FreelancerTaxProfile freelancerTaxProfile = (FreelancerTaxProfile) v7.r("MEMORY_CACHE_KEY_TAX_PROFILE", id10, this.f9585b.f9612a);
                        if (freelancerTaxProfile == null) {
                            return null;
                        }
                        od0.i.Companion.getClass();
                        return od0.h.a(freelancerTaxProfile);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        return (TaxHubVatSummary) v7.r("freelancer:taxProfile:taxCalendarEvents:eventVatSummary:", id11, this.f9585b.f9612a);
                }
            }
        }, new Function2(this) { // from class: au6.o3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r3 f9590b;

            {
                this.f9590b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List<FreelancerTaxProfile> profiles = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profiles, "profiles");
                        r3 r3Var = this.f9590b;
                        ne0.j jVar = r3Var.f9612a;
                        jVar.f("MEMORY_CACHE_KEY_TAX_PROFILE", profiles);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (FreelancerTaxProfile freelancerTaxProfile : profiles) {
                            String str = freelancerTaxProfile.f73474a;
                            if (((FreelancerTaxProfile) v7.r("MEMORY_CACHE_KEY_TAX_PROFILE", str, jVar)) != null) {
                                linkedHashSet.add(str);
                                jVar.f("MEMORY_CACHE_KEY_TAX_PROFILE" + str, freelancerTaxProfile);
                            }
                        }
                        x4l.c.a(r3Var.f, new an9.t(linkedHashSet, 2));
                        break;
                    case 1:
                        od0.i profile = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        FreelancerTaxProfile freelancerTaxProfile2 = (FreelancerTaxProfile) profile.f224257a;
                        if (freelancerTaxProfile2 != null) {
                            String str2 = freelancerTaxProfile2.f73474a;
                            r3 r3Var2 = this.f9590b;
                            ne0.j jVar2 = r3Var2.f9612a;
                            jVar2.f("MEMORY_CACHE_KEY_TAX_PROFILE" + str2, freelancerTaxProfile2);
                            List list = (List) jVar2.get("MEMORY_CACHE_KEY_TAX_PROFILE");
                            if (list != null) {
                                int size = list.size();
                                ArrayList arrayListF1 = zhm.d0.f1(list);
                                Iterator it8 = arrayListF1.iterator();
                                int i2 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i2 = -1;
                                    } else if (!Intrinsics.f(((FreelancerTaxProfile) it8.next()).f73474a, str2)) {
                                        i2++;
                                    }
                                }
                                if (i2 >= 0) {
                                    arrayListF1.set(i2, freelancerTaxProfile2);
                                } else {
                                    arrayListF1.add(size, freelancerTaxProfile2);
                                }
                                jVar2.f("MEMORY_CACHE_KEY_TAX_PROFILE", arrayListF1);
                                x4l.c.a(r3Var2.e, new e2(3));
                            }
                        }
                        break;
                    default:
                        String id10 = (String) obj2;
                        TaxHubVatSummary summary = (TaxHubVatSummary) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f9590b.f9612a.f("freelancer:taxProfile:taxCalendarEvents:eventVatSummary:" + id10, summary);
                        break;
                }
                return Unit.f186387a;
            }
        }, new akl.e0(this, continuation, 17), new a09.p(this, continuation, 26));
        final int i2 = 1;
        this.f = new x4l.c(new a3(this, continuation, i2), new Function1(this) { // from class: au6.n3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r3 f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f9585b.f9612a.get("MEMORY_CACHE_KEY_TAX_PROFILE");
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        FreelancerTaxProfile freelancerTaxProfile = (FreelancerTaxProfile) v7.r("MEMORY_CACHE_KEY_TAX_PROFILE", id10, this.f9585b.f9612a);
                        if (freelancerTaxProfile == null) {
                            return null;
                        }
                        od0.i.Companion.getClass();
                        return od0.h.a(freelancerTaxProfile);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        return (TaxHubVatSummary) v7.r("freelancer:taxProfile:taxCalendarEvents:eventVatSummary:", id11, this.f9585b.f9612a);
                }
            }
        }, new Function2(this) { // from class: au6.o3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r3 f9590b;

            {
                this.f9590b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List<FreelancerTaxProfile> profiles = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profiles, "profiles");
                        r3 r3Var = this.f9590b;
                        ne0.j jVar = r3Var.f9612a;
                        jVar.f("MEMORY_CACHE_KEY_TAX_PROFILE", profiles);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (FreelancerTaxProfile freelancerTaxProfile : profiles) {
                            String str = freelancerTaxProfile.f73474a;
                            if (((FreelancerTaxProfile) v7.r("MEMORY_CACHE_KEY_TAX_PROFILE", str, jVar)) != null) {
                                linkedHashSet.add(str);
                                jVar.f("MEMORY_CACHE_KEY_TAX_PROFILE" + str, freelancerTaxProfile);
                            }
                        }
                        x4l.c.a(r3Var.f, new an9.t(linkedHashSet, 2));
                        break;
                    case 1:
                        od0.i profile = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        FreelancerTaxProfile freelancerTaxProfile2 = (FreelancerTaxProfile) profile.f224257a;
                        if (freelancerTaxProfile2 != null) {
                            String str2 = freelancerTaxProfile2.f73474a;
                            r3 r3Var2 = this.f9590b;
                            ne0.j jVar2 = r3Var2.f9612a;
                            jVar2.f("MEMORY_CACHE_KEY_TAX_PROFILE" + str2, freelancerTaxProfile2);
                            List list = (List) jVar2.get("MEMORY_CACHE_KEY_TAX_PROFILE");
                            if (list != null) {
                                int size = list.size();
                                ArrayList arrayListF1 = zhm.d0.f1(list);
                                Iterator it8 = arrayListF1.iterator();
                                int i22 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i22 = -1;
                                    } else if (!Intrinsics.f(((FreelancerTaxProfile) it8.next()).f73474a, str2)) {
                                        i22++;
                                    }
                                }
                                if (i22 >= 0) {
                                    arrayListF1.set(i22, freelancerTaxProfile2);
                                } else {
                                    arrayListF1.add(size, freelancerTaxProfile2);
                                }
                                jVar2.f("MEMORY_CACHE_KEY_TAX_PROFILE", arrayListF1);
                                x4l.c.a(r3Var2.e, new e2(3));
                            }
                        }
                        break;
                    default:
                        String id10 = (String) obj2;
                        TaxHubVatSummary summary = (TaxHubVatSummary) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f9590b.f9612a.f("freelancer:taxProfile:taxCalendarEvents:eventVatSummary:" + id10, summary);
                        break;
                }
                return Unit.f186387a;
            }
        }, new q3(this, continuation, 0), new a09.p(this, continuation, 25));
        final int i3 = 2;
        this.f9615g = new x4l.c(new a72.k(this, continuation, 15), new Function1(this) { // from class: au6.n3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r3 f9585b;

            {
                this.f9585b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f9585b.f9612a.get("MEMORY_CACHE_KEY_TAX_PROFILE");
                    case 1:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        FreelancerTaxProfile freelancerTaxProfile = (FreelancerTaxProfile) v7.r("MEMORY_CACHE_KEY_TAX_PROFILE", id10, this.f9585b.f9612a);
                        if (freelancerTaxProfile == null) {
                            return null;
                        }
                        od0.i.Companion.getClass();
                        return od0.h.a(freelancerTaxProfile);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        return (TaxHubVatSummary) v7.r("freelancer:taxProfile:taxCalendarEvents:eventVatSummary:", id11, this.f9585b.f9612a);
                }
            }
        }, new Function2(this) { // from class: au6.o3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r3 f9590b;

            {
                this.f9590b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List<FreelancerTaxProfile> profiles = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profiles, "profiles");
                        r3 r3Var = this.f9590b;
                        ne0.j jVar = r3Var.f9612a;
                        jVar.f("MEMORY_CACHE_KEY_TAX_PROFILE", profiles);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (FreelancerTaxProfile freelancerTaxProfile : profiles) {
                            String str = freelancerTaxProfile.f73474a;
                            if (((FreelancerTaxProfile) v7.r("MEMORY_CACHE_KEY_TAX_PROFILE", str, jVar)) != null) {
                                linkedHashSet.add(str);
                                jVar.f("MEMORY_CACHE_KEY_TAX_PROFILE" + str, freelancerTaxProfile);
                            }
                        }
                        x4l.c.a(r3Var.f, new an9.t(linkedHashSet, 2));
                        break;
                    case 1:
                        od0.i profile = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        FreelancerTaxProfile freelancerTaxProfile2 = (FreelancerTaxProfile) profile.f224257a;
                        if (freelancerTaxProfile2 != null) {
                            String str2 = freelancerTaxProfile2.f73474a;
                            r3 r3Var2 = this.f9590b;
                            ne0.j jVar2 = r3Var2.f9612a;
                            jVar2.f("MEMORY_CACHE_KEY_TAX_PROFILE" + str2, freelancerTaxProfile2);
                            List list = (List) jVar2.get("MEMORY_CACHE_KEY_TAX_PROFILE");
                            if (list != null) {
                                int size = list.size();
                                ArrayList arrayListF1 = zhm.d0.f1(list);
                                Iterator it8 = arrayListF1.iterator();
                                int i22 = 0;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        i22 = -1;
                                    } else if (!Intrinsics.f(((FreelancerTaxProfile) it8.next()).f73474a, str2)) {
                                        i22++;
                                    }
                                }
                                if (i22 >= 0) {
                                    arrayListF1.set(i22, freelancerTaxProfile2);
                                } else {
                                    arrayListF1.add(size, freelancerTaxProfile2);
                                }
                                jVar2.f("MEMORY_CACHE_KEY_TAX_PROFILE", arrayListF1);
                                x4l.c.a(r3Var2.e, new e2(3));
                            }
                        }
                        break;
                    default:
                        String id10 = (String) obj2;
                        TaxHubVatSummary summary = (TaxHubVatSummary) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        this.f9590b.f9612a.f("freelancer:taxProfile:taxCalendarEvents:eventVatSummary:" + id10, summary);
                        break;
                }
                return Unit.f186387a;
            }
        }, new q3(this, continuation, 1), new a0e.o(this, continuation, 16));
    }
}
