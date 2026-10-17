package hng;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.user.impl.network.service.UserService;
import com.youTransactor.uCube.rpc.Constants;
import do3.r;
import do3.u;
import do3.v;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import qe0.s;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements gng.a {

    @NotNull
    public static final m Companion = new m();
    public static final Type k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserService f154114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f154115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f154116c;
    public final sf0.h d;
    public final gm0.f e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f154117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f154118h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f154119j;

    static {
        Type type = new TypeToken<jng.l>() { // from class: com.revolut.feature.user.impl.repository.impl.UserRepositoryImpl$Companion$USER_TYPE_REFERENCE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        k = type;
    }

    public q(UserService userService, ue0.c storage, ne0.j memoryCache, sf0.h serverErrorParser, gm0.f deviceIdMigrator, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(deviceIdMigrator, "deviceIdMigrator");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f154114a = userService;
        this.f154115b = storage;
        this.f154116c = memoryCache;
        this.d = serverErrorParser;
        this.e = deviceIdMigrator;
        this.f = ((ze0.c) forceReloadStrategyFactory).b(180000L);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: hng.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154110b;

            {
                this.f154110b = this;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Boolean bool;
                String str;
                String str2;
                ArrayList arrayList;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f154110b.a();
                    case 1:
                        zlg.n usernameData = (zlg.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_USERNAME_DATA", usernameData);
                        return Unit.f186387a;
                    case 2:
                        n params = (n) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f154110b.f154116c.f(params.a(), suggestions);
                        return Unit.f186387a;
                    case 3:
                        do3.n profile = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        this.f154110b.f154116c.f("CACHE_KEY_USER", profile);
                        return Unit.f186387a;
                    case 4:
                        do3.n profile2 = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile2, "profile");
                        ue0.c cVar = this.f154110b.f154115b;
                        Intrinsics.checkNotNullParameter(profile2, "<this>");
                        String str3 = profile2.f116408a;
                        String str4 = profile2.f116409b;
                        String str5 = profile2.f116410c;
                        String str6 = profile2.d;
                        String str7 = profile2.e;
                        String str8 = profile2.f;
                        String str9 = profile2.f116411g;
                        boolean z = profile2.f116412h;
                        String str10 = profile2.i;
                        LocalDate localDate = profile2.f116413j;
                        String string = localDate != null ? localDate.toString("yyyy/MM/dd") : null;
                        Address address = profile2.k;
                        so3.c cVarB = address != null ? to3.a.b(address) : null;
                        String str11 = profile2.f116414l;
                        String str12 = string;
                        String strG = u1.g(profile2.f116415m, vmg.c.f290576a);
                        v vVar = profile2.f116416n;
                        String strName = vVar != null ? vVar.name() : null;
                        Integer num = profile2.o;
                        Boolean bool2 = profile2.f116417p;
                        Long l2 = profile2.f116418q;
                        do3.p pVar = profile2.f116419r;
                        jng.k kVarD = pVar != null ? com.bumptech.glide.c.D(pVar) : null;
                        String str13 = profile2.f116420s;
                        Boolean bool3 = profile2.f116421t;
                        String id10 = profile2.u.getId();
                        List list = profile2.v;
                        if (list != null) {
                            List list2 = list;
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                r rVar = (r) it9.next();
                                boolean zA = rVar.a();
                                List<do3.e> listB = rVar.b();
                                Iterator it10 = it9;
                                String str14 = str5;
                                String str15 = str6;
                                ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
                                for (do3.e eVar : listB) {
                                    String id11 = eVar.getId();
                                    String strName2 = eVar.h().name();
                                    long jR = oi0.d.R(eVar.c());
                                    Address addressA = eVar.a();
                                    so3.c cVarB2 = addressA != null ? to3.a.b(addressA) : null;
                                    String strName3 = eVar.i().name();
                                    do3.p pVarE = eVar.e();
                                    jng.k kVarD2 = pVarE != null ? com.bumptech.glide.c.D(pVarE) : null;
                                    v vVarL = eVar.l();
                                    String strName4 = vVarL != null ? vVarL.name() : null;
                                    String strB = eVar.b();
                                    jng.d dVarC = vmg.d.c(eVar.f());
                                    u uVarK = eVar.k();
                                    arrayList2.add(new jng.c(id11, strName2, jR, cVarB2, strName3, kVarD2, strName4, strB, dVarC, uVarK != null ? vmg.e.b(uVarK) : null, eVar.d()));
                                }
                                arrayList.add(new jng.b(arrayList2, zA));
                                str6 = str15;
                                it9 = it10;
                                str5 = str14;
                            }
                        } else {
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = null;
                        }
                        String str16 = str5;
                        String str17 = str6;
                        jng.d dVarC2 = vmg.d.c(profile2.f116422w);
                        u uVar = profile2.f116423x;
                        jng.f fVarB = uVar != null ? vmg.e.b(uVar) : null;
                        cVar.G(new jng.l(str, str2, str16, str17, str7, str8, str9, z, str10, str12, cVarB, str11, strG, strName, num, bool, l2, kVarD, str13, bool3, id10, arrayList, dVarC2, fVarB, profile2.f116424y), "STORAGE_KEY_USER", z.d(o0.b(jng.l.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<qo3.a> userAddressLocation = this.f154110b.f154114a.getUserAddressLocation();
                        hje.e eVar2 = new hje.e(new hmc.a(14), 15);
                        userAddressLocation.getClass();
                        ufm.i iVar = new ufm.i(userAddressLocation, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 6:
                        co3.a location = (co3.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(location, "location");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_LOCATION", location);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<dng.m> usernames = this.f154110b.f154114a.getUsernames();
                        hje.e eVar3 = new hje.e(new hmc.a(15), 14);
                        usernames.getClass();
                        ufm.i iVar2 = new ufm.i(usernames, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: hng.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154112b;

            {
                this.f154112b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        n it8 = (n) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f154112b.f154116c.get(it8.a());
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (do3.n) this.f154112b.f154116c.get("CACHE_KEY_USER");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        jng.l lVar = (jng.l) this.f154112b.f154115b.T2("STORAGE_KEY_USER", q.k);
                        if (lVar != null) {
                            return com.bumptech.glide.c.B(lVar);
                        }
                        return null;
                    case 3:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (co3.a) this.f154112b.f154116c.get("CACHE_KEY_USER_LOCATION");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (zlg.n) this.f154112b.f154116c.get("CACHE_KEY_USER_USERNAME_DATA");
                }
            }
        };
        final int i3 = 3;
        Function2 function22 = new Function2(this) { // from class: hng.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154110b;

            {
                this.f154110b = this;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Boolean bool;
                String str;
                String str2;
                ArrayList arrayList;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f154110b.a();
                    case 1:
                        zlg.n usernameData = (zlg.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_USERNAME_DATA", usernameData);
                        return Unit.f186387a;
                    case 2:
                        n params = (n) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f154110b.f154116c.f(params.a(), suggestions);
                        return Unit.f186387a;
                    case 3:
                        do3.n profile = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        this.f154110b.f154116c.f("CACHE_KEY_USER", profile);
                        return Unit.f186387a;
                    case 4:
                        do3.n profile2 = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile2, "profile");
                        ue0.c cVar = this.f154110b.f154115b;
                        Intrinsics.checkNotNullParameter(profile2, "<this>");
                        String str3 = profile2.f116408a;
                        String str4 = profile2.f116409b;
                        String str5 = profile2.f116410c;
                        String str6 = profile2.d;
                        String str7 = profile2.e;
                        String str8 = profile2.f;
                        String str9 = profile2.f116411g;
                        boolean z = profile2.f116412h;
                        String str10 = profile2.i;
                        LocalDate localDate = profile2.f116413j;
                        String string = localDate != null ? localDate.toString("yyyy/MM/dd") : null;
                        Address address = profile2.k;
                        so3.c cVarB = address != null ? to3.a.b(address) : null;
                        String str11 = profile2.f116414l;
                        String str12 = string;
                        String strG = u1.g(profile2.f116415m, vmg.c.f290576a);
                        v vVar = profile2.f116416n;
                        String strName = vVar != null ? vVar.name() : null;
                        Integer num = profile2.o;
                        Boolean bool2 = profile2.f116417p;
                        Long l2 = profile2.f116418q;
                        do3.p pVar = profile2.f116419r;
                        jng.k kVarD = pVar != null ? com.bumptech.glide.c.D(pVar) : null;
                        String str13 = profile2.f116420s;
                        Boolean bool3 = profile2.f116421t;
                        String id10 = profile2.u.getId();
                        List list = profile2.v;
                        if (list != null) {
                            List list2 = list;
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                r rVar = (r) it9.next();
                                boolean zA = rVar.a();
                                List<do3.e> listB = rVar.b();
                                Iterator it10 = it9;
                                String str14 = str5;
                                String str15 = str6;
                                ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
                                for (do3.e eVar : listB) {
                                    String id11 = eVar.getId();
                                    String strName2 = eVar.h().name();
                                    long jR = oi0.d.R(eVar.c());
                                    Address addressA = eVar.a();
                                    so3.c cVarB2 = addressA != null ? to3.a.b(addressA) : null;
                                    String strName3 = eVar.i().name();
                                    do3.p pVarE = eVar.e();
                                    jng.k kVarD2 = pVarE != null ? com.bumptech.glide.c.D(pVarE) : null;
                                    v vVarL = eVar.l();
                                    String strName4 = vVarL != null ? vVarL.name() : null;
                                    String strB = eVar.b();
                                    jng.d dVarC = vmg.d.c(eVar.f());
                                    u uVarK = eVar.k();
                                    arrayList2.add(new jng.c(id11, strName2, jR, cVarB2, strName3, kVarD2, strName4, strB, dVarC, uVarK != null ? vmg.e.b(uVarK) : null, eVar.d()));
                                }
                                arrayList.add(new jng.b(arrayList2, zA));
                                str6 = str15;
                                it9 = it10;
                                str5 = str14;
                            }
                        } else {
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = null;
                        }
                        String str16 = str5;
                        String str17 = str6;
                        jng.d dVarC2 = vmg.d.c(profile2.f116422w);
                        u uVar = profile2.f116423x;
                        jng.f fVarB = uVar != null ? vmg.e.b(uVar) : null;
                        cVar.G(new jng.l(str, str2, str16, str17, str7, str8, str9, z, str10, str12, cVarB, str11, strG, strName, num, bool, l2, kVarD, str13, bool3, id10, arrayList, dVarC2, fVarB, profile2.f116424y), "STORAGE_KEY_USER", z.d(o0.b(jng.l.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<qo3.a> userAddressLocation = this.f154110b.f154114a.getUserAddressLocation();
                        hje.e eVar2 = new hje.e(new hmc.a(14), 15);
                        userAddressLocation.getClass();
                        ufm.i iVar = new ufm.i(userAddressLocation, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 6:
                        co3.a location = (co3.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(location, "location");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_LOCATION", location);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<dng.m> usernames = this.f154110b.f154114a.getUsernames();
                        hje.e eVar3 = new hje.e(new hmc.a(15), 14);
                        usernames.getClass();
                        ufm.i iVar2 = new ufm.i(usernames, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: hng.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154112b;

            {
                this.f154112b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        n it8 = (n) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f154112b.f154116c.get(it8.a());
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (do3.n) this.f154112b.f154116c.get("CACHE_KEY_USER");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        jng.l lVar = (jng.l) this.f154112b.f154115b.T2("STORAGE_KEY_USER", q.k);
                        if (lVar != null) {
                            return com.bumptech.glide.c.B(lVar);
                        }
                        return null;
                    case 3:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (co3.a) this.f154112b.f154116c.get("CACHE_KEY_USER_LOCATION");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (zlg.n) this.f154112b.f154116c.get("CACHE_KEY_USER_USERNAME_DATA");
                }
            }
        };
        final int i6 = 4;
        this.f154117g = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: hng.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154110b;

            {
                this.f154110b = this;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Boolean bool;
                String str;
                String str2;
                ArrayList arrayList;
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f154110b.a();
                    case 1:
                        zlg.n usernameData = (zlg.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_USERNAME_DATA", usernameData);
                        return Unit.f186387a;
                    case 2:
                        n params = (n) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f154110b.f154116c.f(params.a(), suggestions);
                        return Unit.f186387a;
                    case 3:
                        do3.n profile = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        this.f154110b.f154116c.f("CACHE_KEY_USER", profile);
                        return Unit.f186387a;
                    case 4:
                        do3.n profile2 = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile2, "profile");
                        ue0.c cVar = this.f154110b.f154115b;
                        Intrinsics.checkNotNullParameter(profile2, "<this>");
                        String str3 = profile2.f116408a;
                        String str4 = profile2.f116409b;
                        String str5 = profile2.f116410c;
                        String str6 = profile2.d;
                        String str7 = profile2.e;
                        String str8 = profile2.f;
                        String str9 = profile2.f116411g;
                        boolean z = profile2.f116412h;
                        String str10 = profile2.i;
                        LocalDate localDate = profile2.f116413j;
                        String string = localDate != null ? localDate.toString("yyyy/MM/dd") : null;
                        Address address = profile2.k;
                        so3.c cVarB = address != null ? to3.a.b(address) : null;
                        String str11 = profile2.f116414l;
                        String str12 = string;
                        String strG = u1.g(profile2.f116415m, vmg.c.f290576a);
                        v vVar = profile2.f116416n;
                        String strName = vVar != null ? vVar.name() : null;
                        Integer num = profile2.o;
                        Boolean bool2 = profile2.f116417p;
                        Long l2 = profile2.f116418q;
                        do3.p pVar = profile2.f116419r;
                        jng.k kVarD = pVar != null ? com.bumptech.glide.c.D(pVar) : null;
                        String str13 = profile2.f116420s;
                        Boolean bool3 = profile2.f116421t;
                        String id10 = profile2.u.getId();
                        List list = profile2.v;
                        if (list != null) {
                            List list2 = list;
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                r rVar = (r) it9.next();
                                boolean zA = rVar.a();
                                List<do3.e> listB = rVar.b();
                                Iterator it10 = it9;
                                String str14 = str5;
                                String str15 = str6;
                                ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
                                for (do3.e eVar : listB) {
                                    String id11 = eVar.getId();
                                    String strName2 = eVar.h().name();
                                    long jR = oi0.d.R(eVar.c());
                                    Address addressA = eVar.a();
                                    so3.c cVarB2 = addressA != null ? to3.a.b(addressA) : null;
                                    String strName3 = eVar.i().name();
                                    do3.p pVarE = eVar.e();
                                    jng.k kVarD2 = pVarE != null ? com.bumptech.glide.c.D(pVarE) : null;
                                    v vVarL = eVar.l();
                                    String strName4 = vVarL != null ? vVarL.name() : null;
                                    String strB = eVar.b();
                                    jng.d dVarC = vmg.d.c(eVar.f());
                                    u uVarK = eVar.k();
                                    arrayList2.add(new jng.c(id11, strName2, jR, cVarB2, strName3, kVarD2, strName4, strB, dVarC, uVarK != null ? vmg.e.b(uVarK) : null, eVar.d()));
                                }
                                arrayList.add(new jng.b(arrayList2, zA));
                                str6 = str15;
                                it9 = it10;
                                str5 = str14;
                            }
                        } else {
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = null;
                        }
                        String str16 = str5;
                        String str17 = str6;
                        jng.d dVarC2 = vmg.d.c(profile2.f116422w);
                        u uVar = profile2.f116423x;
                        jng.f fVarB = uVar != null ? vmg.e.b(uVar) : null;
                        cVar.G(new jng.l(str, str2, str16, str17, str7, str8, str9, z, str10, str12, cVarB, str11, strG, strName, num, bool, l2, kVarD, str13, bool3, id10, arrayList, dVarC2, fVarB, profile2.f116424y), "STORAGE_KEY_USER", z.d(o0.b(jng.l.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<qo3.a> userAddressLocation = this.f154110b.f154114a.getUserAddressLocation();
                        hje.e eVar2 = new hje.e(new hmc.a(14), 15);
                        userAddressLocation.getClass();
                        ufm.i iVar = new ufm.i(userAddressLocation, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 6:
                        co3.a location = (co3.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(location, "location");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_LOCATION", location);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<dng.m> usernames = this.f154110b.f154114a.getUsernames();
                        hje.e eVar3 = new hje.e(new hmc.a(15), 14);
                        usernames.getClass();
                        ufm.i iVar2 = new ufm.i(usernames, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 5;
        Function2 function23 = new Function2(this) { // from class: hng.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154110b;

            {
                this.f154110b = this;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Boolean bool;
                String str;
                String str2;
                ArrayList arrayList;
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f154110b.a();
                    case 1:
                        zlg.n usernameData = (zlg.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_USERNAME_DATA", usernameData);
                        return Unit.f186387a;
                    case 2:
                        n params = (n) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f154110b.f154116c.f(params.a(), suggestions);
                        return Unit.f186387a;
                    case 3:
                        do3.n profile = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        this.f154110b.f154116c.f("CACHE_KEY_USER", profile);
                        return Unit.f186387a;
                    case 4:
                        do3.n profile2 = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile2, "profile");
                        ue0.c cVar = this.f154110b.f154115b;
                        Intrinsics.checkNotNullParameter(profile2, "<this>");
                        String str3 = profile2.f116408a;
                        String str4 = profile2.f116409b;
                        String str5 = profile2.f116410c;
                        String str6 = profile2.d;
                        String str7 = profile2.e;
                        String str8 = profile2.f;
                        String str9 = profile2.f116411g;
                        boolean z = profile2.f116412h;
                        String str10 = profile2.i;
                        LocalDate localDate = profile2.f116413j;
                        String string = localDate != null ? localDate.toString("yyyy/MM/dd") : null;
                        Address address = profile2.k;
                        so3.c cVarB = address != null ? to3.a.b(address) : null;
                        String str11 = profile2.f116414l;
                        String str12 = string;
                        String strG = u1.g(profile2.f116415m, vmg.c.f290576a);
                        v vVar = profile2.f116416n;
                        String strName = vVar != null ? vVar.name() : null;
                        Integer num = profile2.o;
                        Boolean bool2 = profile2.f116417p;
                        Long l2 = profile2.f116418q;
                        do3.p pVar = profile2.f116419r;
                        jng.k kVarD = pVar != null ? com.bumptech.glide.c.D(pVar) : null;
                        String str13 = profile2.f116420s;
                        Boolean bool3 = profile2.f116421t;
                        String id10 = profile2.u.getId();
                        List list = profile2.v;
                        if (list != null) {
                            List list2 = list;
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                r rVar = (r) it9.next();
                                boolean zA = rVar.a();
                                List<do3.e> listB = rVar.b();
                                Iterator it10 = it9;
                                String str14 = str5;
                                String str15 = str6;
                                ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
                                for (do3.e eVar : listB) {
                                    String id11 = eVar.getId();
                                    String strName2 = eVar.h().name();
                                    long jR = oi0.d.R(eVar.c());
                                    Address addressA = eVar.a();
                                    so3.c cVarB2 = addressA != null ? to3.a.b(addressA) : null;
                                    String strName3 = eVar.i().name();
                                    do3.p pVarE = eVar.e();
                                    jng.k kVarD2 = pVarE != null ? com.bumptech.glide.c.D(pVarE) : null;
                                    v vVarL = eVar.l();
                                    String strName4 = vVarL != null ? vVarL.name() : null;
                                    String strB = eVar.b();
                                    jng.d dVarC = vmg.d.c(eVar.f());
                                    u uVarK = eVar.k();
                                    arrayList2.add(new jng.c(id11, strName2, jR, cVarB2, strName3, kVarD2, strName4, strB, dVarC, uVarK != null ? vmg.e.b(uVarK) : null, eVar.d()));
                                }
                                arrayList.add(new jng.b(arrayList2, zA));
                                str6 = str15;
                                it9 = it10;
                                str5 = str14;
                            }
                        } else {
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = null;
                        }
                        String str16 = str5;
                        String str17 = str6;
                        jng.d dVarC2 = vmg.d.c(profile2.f116422w);
                        u uVar = profile2.f116423x;
                        jng.f fVarB = uVar != null ? vmg.e.b(uVar) : null;
                        cVar.G(new jng.l(str, str2, str16, str17, str7, str8, str9, z, str10, str12, cVarB, str11, strG, strName, num, bool, l2, kVarD, str13, bool3, id10, arrayList, dVarC2, fVarB, profile2.f116424y), "STORAGE_KEY_USER", z.d(o0.b(jng.l.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<qo3.a> userAddressLocation = this.f154110b.f154114a.getUserAddressLocation();
                        hje.e eVar2 = new hje.e(new hmc.a(14), 15);
                        userAddressLocation.getClass();
                        ufm.i iVar = new ufm.i(userAddressLocation, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 6:
                        co3.a location = (co3.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(location, "location");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_LOCATION", location);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<dng.m> usernames = this.f154110b.f154114a.getUsernames();
                        hje.e eVar3 = new hje.e(new hmc.a(15), 14);
                        usernames.getClass();
                        ufm.i iVar2 = new ufm.i(usernames, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i22 = 3;
        Function1 function13 = new Function1(this) { // from class: hng.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154112b;

            {
                this.f154112b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        n it8 = (n) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f154112b.f154116c.get(it8.a());
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (do3.n) this.f154112b.f154116c.get("CACHE_KEY_USER");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        jng.l lVar = (jng.l) this.f154112b.f154115b.T2("STORAGE_KEY_USER", q.k);
                        if (lVar != null) {
                            return com.bumptech.glide.c.B(lVar);
                        }
                        return null;
                    case 3:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (co3.a) this.f154112b.f154116c.get("CACHE_KEY_USER_LOCATION");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (zlg.n) this.f154112b.f154116c.get("CACHE_KEY_USER_USERNAME_DATA");
                }
            }
        };
        final int i32 = 6;
        this.f154118h = new w4l.f(function23, function13, new Function2(this) { // from class: hng.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154110b;

            {
                this.f154110b = this;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Boolean bool;
                String str;
                String str2;
                ArrayList arrayList;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f154110b.a();
                    case 1:
                        zlg.n usernameData = (zlg.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_USERNAME_DATA", usernameData);
                        return Unit.f186387a;
                    case 2:
                        n params = (n) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f154110b.f154116c.f(params.a(), suggestions);
                        return Unit.f186387a;
                    case 3:
                        do3.n profile = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        this.f154110b.f154116c.f("CACHE_KEY_USER", profile);
                        return Unit.f186387a;
                    case 4:
                        do3.n profile2 = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile2, "profile");
                        ue0.c cVar = this.f154110b.f154115b;
                        Intrinsics.checkNotNullParameter(profile2, "<this>");
                        String str3 = profile2.f116408a;
                        String str4 = profile2.f116409b;
                        String str5 = profile2.f116410c;
                        String str6 = profile2.d;
                        String str7 = profile2.e;
                        String str8 = profile2.f;
                        String str9 = profile2.f116411g;
                        boolean z = profile2.f116412h;
                        String str10 = profile2.i;
                        LocalDate localDate = profile2.f116413j;
                        String string = localDate != null ? localDate.toString("yyyy/MM/dd") : null;
                        Address address = profile2.k;
                        so3.c cVarB = address != null ? to3.a.b(address) : null;
                        String str11 = profile2.f116414l;
                        String str12 = string;
                        String strG = u1.g(profile2.f116415m, vmg.c.f290576a);
                        v vVar = profile2.f116416n;
                        String strName = vVar != null ? vVar.name() : null;
                        Integer num = profile2.o;
                        Boolean bool2 = profile2.f116417p;
                        Long l2 = profile2.f116418q;
                        do3.p pVar = profile2.f116419r;
                        jng.k kVarD = pVar != null ? com.bumptech.glide.c.D(pVar) : null;
                        String str13 = profile2.f116420s;
                        Boolean bool3 = profile2.f116421t;
                        String id10 = profile2.u.getId();
                        List list = profile2.v;
                        if (list != null) {
                            List list2 = list;
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                r rVar = (r) it9.next();
                                boolean zA = rVar.a();
                                List<do3.e> listB = rVar.b();
                                Iterator it10 = it9;
                                String str14 = str5;
                                String str15 = str6;
                                ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
                                for (do3.e eVar : listB) {
                                    String id11 = eVar.getId();
                                    String strName2 = eVar.h().name();
                                    long jR = oi0.d.R(eVar.c());
                                    Address addressA = eVar.a();
                                    so3.c cVarB2 = addressA != null ? to3.a.b(addressA) : null;
                                    String strName3 = eVar.i().name();
                                    do3.p pVarE = eVar.e();
                                    jng.k kVarD2 = pVarE != null ? com.bumptech.glide.c.D(pVarE) : null;
                                    v vVarL = eVar.l();
                                    String strName4 = vVarL != null ? vVarL.name() : null;
                                    String strB = eVar.b();
                                    jng.d dVarC = vmg.d.c(eVar.f());
                                    u uVarK = eVar.k();
                                    arrayList2.add(new jng.c(id11, strName2, jR, cVarB2, strName3, kVarD2, strName4, strB, dVarC, uVarK != null ? vmg.e.b(uVarK) : null, eVar.d()));
                                }
                                arrayList.add(new jng.b(arrayList2, zA));
                                str6 = str15;
                                it9 = it10;
                                str5 = str14;
                            }
                        } else {
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = null;
                        }
                        String str16 = str5;
                        String str17 = str6;
                        jng.d dVarC2 = vmg.d.c(profile2.f116422w);
                        u uVar = profile2.f116423x;
                        jng.f fVarB = uVar != null ? vmg.e.b(uVar) : null;
                        cVar.G(new jng.l(str, str2, str16, str17, str7, str8, str9, z, str10, str12, cVarB, str11, strG, strName, num, bool, l2, kVarD, str13, bool3, id10, arrayList, dVarC2, fVarB, profile2.f116424y), "STORAGE_KEY_USER", z.d(o0.b(jng.l.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<qo3.a> userAddressLocation = this.f154110b.f154114a.getUserAddressLocation();
                        hje.e eVar2 = new hje.e(new hmc.a(14), 15);
                        userAddressLocation.getClass();
                        ufm.i iVar = new ufm.i(userAddressLocation, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 6:
                        co3.a location = (co3.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(location, "location");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_LOCATION", location);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<dng.m> usernames = this.f154110b.f154114a.getUsernames();
                        hje.e eVar3 = new hje.e(new hmc.a(15), 14);
                        usernames.getClass();
                        ufm.i iVar2 = new ufm.i(usernames, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i33 = 7;
        Function2 function24 = new Function2(this) { // from class: hng.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154110b;

            {
                this.f154110b = this;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Boolean bool;
                String str;
                String str2;
                ArrayList arrayList;
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f154110b.a();
                    case 1:
                        zlg.n usernameData = (zlg.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_USERNAME_DATA", usernameData);
                        return Unit.f186387a;
                    case 2:
                        n params = (n) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f154110b.f154116c.f(params.a(), suggestions);
                        return Unit.f186387a;
                    case 3:
                        do3.n profile = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        this.f154110b.f154116c.f("CACHE_KEY_USER", profile);
                        return Unit.f186387a;
                    case 4:
                        do3.n profile2 = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile2, "profile");
                        ue0.c cVar = this.f154110b.f154115b;
                        Intrinsics.checkNotNullParameter(profile2, "<this>");
                        String str3 = profile2.f116408a;
                        String str4 = profile2.f116409b;
                        String str5 = profile2.f116410c;
                        String str6 = profile2.d;
                        String str7 = profile2.e;
                        String str8 = profile2.f;
                        String str9 = profile2.f116411g;
                        boolean z = profile2.f116412h;
                        String str10 = profile2.i;
                        LocalDate localDate = profile2.f116413j;
                        String string = localDate != null ? localDate.toString("yyyy/MM/dd") : null;
                        Address address = profile2.k;
                        so3.c cVarB = address != null ? to3.a.b(address) : null;
                        String str11 = profile2.f116414l;
                        String str12 = string;
                        String strG = u1.g(profile2.f116415m, vmg.c.f290576a);
                        v vVar = profile2.f116416n;
                        String strName = vVar != null ? vVar.name() : null;
                        Integer num = profile2.o;
                        Boolean bool2 = profile2.f116417p;
                        Long l2 = profile2.f116418q;
                        do3.p pVar = profile2.f116419r;
                        jng.k kVarD = pVar != null ? com.bumptech.glide.c.D(pVar) : null;
                        String str13 = profile2.f116420s;
                        Boolean bool3 = profile2.f116421t;
                        String id10 = profile2.u.getId();
                        List list = profile2.v;
                        if (list != null) {
                            List list2 = list;
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                r rVar = (r) it9.next();
                                boolean zA = rVar.a();
                                List<do3.e> listB = rVar.b();
                                Iterator it10 = it9;
                                String str14 = str5;
                                String str15 = str6;
                                ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
                                for (do3.e eVar : listB) {
                                    String id11 = eVar.getId();
                                    String strName2 = eVar.h().name();
                                    long jR = oi0.d.R(eVar.c());
                                    Address addressA = eVar.a();
                                    so3.c cVarB2 = addressA != null ? to3.a.b(addressA) : null;
                                    String strName3 = eVar.i().name();
                                    do3.p pVarE = eVar.e();
                                    jng.k kVarD2 = pVarE != null ? com.bumptech.glide.c.D(pVarE) : null;
                                    v vVarL = eVar.l();
                                    String strName4 = vVarL != null ? vVarL.name() : null;
                                    String strB = eVar.b();
                                    jng.d dVarC = vmg.d.c(eVar.f());
                                    u uVarK = eVar.k();
                                    arrayList2.add(new jng.c(id11, strName2, jR, cVarB2, strName3, kVarD2, strName4, strB, dVarC, uVarK != null ? vmg.e.b(uVarK) : null, eVar.d()));
                                }
                                arrayList.add(new jng.b(arrayList2, zA));
                                str6 = str15;
                                it9 = it10;
                                str5 = str14;
                            }
                        } else {
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = null;
                        }
                        String str16 = str5;
                        String str17 = str6;
                        jng.d dVarC2 = vmg.d.c(profile2.f116422w);
                        u uVar = profile2.f116423x;
                        jng.f fVarB = uVar != null ? vmg.e.b(uVar) : null;
                        cVar.G(new jng.l(str, str2, str16, str17, str7, str8, str9, z, str10, str12, cVarB, str11, strG, strName, num, bool, l2, kVarD, str13, bool3, id10, arrayList, dVarC2, fVarB, profile2.f116424y), "STORAGE_KEY_USER", z.d(o0.b(jng.l.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<qo3.a> userAddressLocation = this.f154110b.f154114a.getUserAddressLocation();
                        hje.e eVar2 = new hje.e(new hmc.a(14), 15);
                        userAddressLocation.getClass();
                        ufm.i iVar = new ufm.i(userAddressLocation, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 6:
                        co3.a location = (co3.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(location, "location");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_LOCATION", location);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<dng.m> usernames = this.f154110b.f154114a.getUsernames();
                        hje.e eVar3 = new hje.e(new hmc.a(15), 14);
                        usernames.getClass();
                        ufm.i iVar2 = new ufm.i(usernames, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i43 = 4;
        Function1 function14 = new Function1(this) { // from class: hng.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154112b;

            {
                this.f154112b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i43) {
                    case 0:
                        n it8 = (n) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f154112b.f154116c.get(it8.a());
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (do3.n) this.f154112b.f154116c.get("CACHE_KEY_USER");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        jng.l lVar = (jng.l) this.f154112b.f154115b.T2("STORAGE_KEY_USER", q.k);
                        if (lVar != null) {
                            return com.bumptech.glide.c.B(lVar);
                        }
                        return null;
                    case 3:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (co3.a) this.f154112b.f154116c.get("CACHE_KEY_USER_LOCATION");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (zlg.n) this.f154112b.f154116c.get("CACHE_KEY_USER_USERNAME_DATA");
                }
            }
        };
        final int i59 = 1;
        this.i = new w4l.f(function24, function14, new Function2(this) { // from class: hng.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154110b;

            {
                this.f154110b = this;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Boolean bool;
                String str;
                String str2;
                ArrayList arrayList;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f154110b.a();
                    case 1:
                        zlg.n usernameData = (zlg.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_USERNAME_DATA", usernameData);
                        return Unit.f186387a;
                    case 2:
                        n params = (n) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f154110b.f154116c.f(params.a(), suggestions);
                        return Unit.f186387a;
                    case 3:
                        do3.n profile = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        this.f154110b.f154116c.f("CACHE_KEY_USER", profile);
                        return Unit.f186387a;
                    case 4:
                        do3.n profile2 = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile2, "profile");
                        ue0.c cVar = this.f154110b.f154115b;
                        Intrinsics.checkNotNullParameter(profile2, "<this>");
                        String str3 = profile2.f116408a;
                        String str4 = profile2.f116409b;
                        String str5 = profile2.f116410c;
                        String str6 = profile2.d;
                        String str7 = profile2.e;
                        String str8 = profile2.f;
                        String str9 = profile2.f116411g;
                        boolean z = profile2.f116412h;
                        String str10 = profile2.i;
                        LocalDate localDate = profile2.f116413j;
                        String string = localDate != null ? localDate.toString("yyyy/MM/dd") : null;
                        Address address = profile2.k;
                        so3.c cVarB = address != null ? to3.a.b(address) : null;
                        String str11 = profile2.f116414l;
                        String str12 = string;
                        String strG = u1.g(profile2.f116415m, vmg.c.f290576a);
                        v vVar = profile2.f116416n;
                        String strName = vVar != null ? vVar.name() : null;
                        Integer num = profile2.o;
                        Boolean bool2 = profile2.f116417p;
                        Long l2 = profile2.f116418q;
                        do3.p pVar = profile2.f116419r;
                        jng.k kVarD = pVar != null ? com.bumptech.glide.c.D(pVar) : null;
                        String str13 = profile2.f116420s;
                        Boolean bool3 = profile2.f116421t;
                        String id10 = profile2.u.getId();
                        List list = profile2.v;
                        if (list != null) {
                            List list2 = list;
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                r rVar = (r) it9.next();
                                boolean zA = rVar.a();
                                List<do3.e> listB = rVar.b();
                                Iterator it10 = it9;
                                String str14 = str5;
                                String str15 = str6;
                                ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
                                for (do3.e eVar : listB) {
                                    String id11 = eVar.getId();
                                    String strName2 = eVar.h().name();
                                    long jR = oi0.d.R(eVar.c());
                                    Address addressA = eVar.a();
                                    so3.c cVarB2 = addressA != null ? to3.a.b(addressA) : null;
                                    String strName3 = eVar.i().name();
                                    do3.p pVarE = eVar.e();
                                    jng.k kVarD2 = pVarE != null ? com.bumptech.glide.c.D(pVarE) : null;
                                    v vVarL = eVar.l();
                                    String strName4 = vVarL != null ? vVarL.name() : null;
                                    String strB = eVar.b();
                                    jng.d dVarC = vmg.d.c(eVar.f());
                                    u uVarK = eVar.k();
                                    arrayList2.add(new jng.c(id11, strName2, jR, cVarB2, strName3, kVarD2, strName4, strB, dVarC, uVarK != null ? vmg.e.b(uVarK) : null, eVar.d()));
                                }
                                arrayList.add(new jng.b(arrayList2, zA));
                                str6 = str15;
                                it9 = it10;
                                str5 = str14;
                            }
                        } else {
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = null;
                        }
                        String str16 = str5;
                        String str17 = str6;
                        jng.d dVarC2 = vmg.d.c(profile2.f116422w);
                        u uVar = profile2.f116423x;
                        jng.f fVarB = uVar != null ? vmg.e.b(uVar) : null;
                        cVar.G(new jng.l(str, str2, str16, str17, str7, str8, str9, z, str10, str12, cVarB, str11, strG, strName, num, bool, l2, kVarD, str13, bool3, id10, arrayList, dVarC2, fVarB, profile2.f116424y), "STORAGE_KEY_USER", z.d(o0.b(jng.l.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<qo3.a> userAddressLocation = this.f154110b.f154114a.getUserAddressLocation();
                        hje.e eVar2 = new hje.e(new hmc.a(14), 15);
                        userAddressLocation.getClass();
                        ufm.i iVar = new ufm.i(userAddressLocation, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 6:
                        co3.a location = (co3.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(location, "location");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_LOCATION", location);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<dng.m> usernames = this.f154110b.f154114a.getUsernames();
                        hje.e eVar3 = new hje.e(new hmc.a(15), 14);
                        usernames.getClass();
                        ufm.i iVar2 = new ufm.i(usernames, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i66 = 0;
        final int i74 = 2;
        this.f154119j = new x4l.c(new ghl.l(this, null, 3), new Function1(this) { // from class: hng.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154112b;

            {
                this.f154112b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i66) {
                    case 0:
                        n it8 = (n) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f154112b.f154116c.get(it8.a());
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (do3.n) this.f154112b.f154116c.get("CACHE_KEY_USER");
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        jng.l lVar = (jng.l) this.f154112b.f154115b.T2("STORAGE_KEY_USER", q.k);
                        if (lVar != null) {
                            return com.bumptech.glide.c.B(lVar);
                        }
                        return null;
                    case 3:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (co3.a) this.f154112b.f154116c.get("CACHE_KEY_USER_LOCATION");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (zlg.n) this.f154112b.f154116c.get("CACHE_KEY_USER_USERNAME_DATA");
                }
            }
        }, new Function2(this) { // from class: hng.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f154110b;

            {
                this.f154110b = this;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Boolean bool;
                String str;
                String str2;
                ArrayList arrayList;
                switch (i74) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f154110b.a();
                    case 1:
                        zlg.n usernameData = (zlg.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_USERNAME_DATA", usernameData);
                        return Unit.f186387a;
                    case 2:
                        n params = (n) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f154110b.f154116c.f(params.a(), suggestions);
                        return Unit.f186387a;
                    case 3:
                        do3.n profile = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        this.f154110b.f154116c.f("CACHE_KEY_USER", profile);
                        return Unit.f186387a;
                    case 4:
                        do3.n profile2 = (do3.n) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(profile2, "profile");
                        ue0.c cVar = this.f154110b.f154115b;
                        Intrinsics.checkNotNullParameter(profile2, "<this>");
                        String str3 = profile2.f116408a;
                        String str4 = profile2.f116409b;
                        String str5 = profile2.f116410c;
                        String str6 = profile2.d;
                        String str7 = profile2.e;
                        String str8 = profile2.f;
                        String str9 = profile2.f116411g;
                        boolean z = profile2.f116412h;
                        String str10 = profile2.i;
                        LocalDate localDate = profile2.f116413j;
                        String string = localDate != null ? localDate.toString("yyyy/MM/dd") : null;
                        Address address = profile2.k;
                        so3.c cVarB = address != null ? to3.a.b(address) : null;
                        String str11 = profile2.f116414l;
                        String str12 = string;
                        String strG = u1.g(profile2.f116415m, vmg.c.f290576a);
                        v vVar = profile2.f116416n;
                        String strName = vVar != null ? vVar.name() : null;
                        Integer num = profile2.o;
                        Boolean bool2 = profile2.f116417p;
                        Long l2 = profile2.f116418q;
                        do3.p pVar = profile2.f116419r;
                        jng.k kVarD = pVar != null ? com.bumptech.glide.c.D(pVar) : null;
                        String str13 = profile2.f116420s;
                        Boolean bool3 = profile2.f116421t;
                        String id10 = profile2.u.getId();
                        List list = profile2.v;
                        if (list != null) {
                            List list2 = list;
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                r rVar = (r) it9.next();
                                boolean zA = rVar.a();
                                List<do3.e> listB = rVar.b();
                                Iterator it10 = it9;
                                String str14 = str5;
                                String str15 = str6;
                                ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
                                for (do3.e eVar : listB) {
                                    String id11 = eVar.getId();
                                    String strName2 = eVar.h().name();
                                    long jR = oi0.d.R(eVar.c());
                                    Address addressA = eVar.a();
                                    so3.c cVarB2 = addressA != null ? to3.a.b(addressA) : null;
                                    String strName3 = eVar.i().name();
                                    do3.p pVarE = eVar.e();
                                    jng.k kVarD2 = pVarE != null ? com.bumptech.glide.c.D(pVarE) : null;
                                    v vVarL = eVar.l();
                                    String strName4 = vVarL != null ? vVarL.name() : null;
                                    String strB = eVar.b();
                                    jng.d dVarC = vmg.d.c(eVar.f());
                                    u uVarK = eVar.k();
                                    arrayList2.add(new jng.c(id11, strName2, jR, cVarB2, strName3, kVarD2, strName4, strB, dVarC, uVarK != null ? vmg.e.b(uVarK) : null, eVar.d()));
                                }
                                arrayList.add(new jng.b(arrayList2, zA));
                                str6 = str15;
                                it9 = it10;
                                str5 = str14;
                            }
                        } else {
                            bool = bool2;
                            str = str3;
                            str2 = str4;
                            arrayList = null;
                        }
                        String str16 = str5;
                        String str17 = str6;
                        jng.d dVarC2 = vmg.d.c(profile2.f116422w);
                        u uVar = profile2.f116423x;
                        jng.f fVarB = uVar != null ? vmg.e.b(uVar) : null;
                        cVar.G(new jng.l(str, str2, str16, str17, str7, str8, str9, z, str10, str12, cVarB, str11, strG, strName, num, bool, l2, kVarD, str13, bool3, id10, arrayList, dVarC2, fVarB, profile2.f116424y), "STORAGE_KEY_USER", z.d(o0.b(jng.l.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<qo3.a> userAddressLocation = this.f154110b.f154114a.getUserAddressLocation();
                        hje.e eVar2 = new hje.e(new hmc.a(14), 15);
                        userAddressLocation.getClass();
                        ufm.i iVar = new ufm.i(userAddressLocation, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 6:
                        co3.a location = (co3.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(location, "location");
                        this.f154110b.f154116c.f("CACHE_KEY_USER_LOCATION", location);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<dng.m> usernames = this.f154110b.f154114a.getUsernames();
                        hje.e eVar3 = new hje.e(new hmc.a(15), 14);
                        usernames.getClass();
                        ufm.i iVar2 = new ufm.i(usernames, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new e31.i(24), new eci.a());
    }

    public final ufm.f a() {
        d0<dng.h> currentUser = this.f154114a.getCurrentUser();
        hje.e eVar = new hje.e(new hmc.a(16), 17);
        currentUser.getClass();
        ufm.f fVar = new ufm.f(new ufm.i(currentUser, eVar, 1), new hje.e(new j(this, 1), 18), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return fVar;
    }

    @Override // od0.e
    public final void clear() {
        this.f154115b.clear();
        this.f154116c.clear();
    }
}
