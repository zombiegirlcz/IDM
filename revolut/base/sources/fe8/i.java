package fe8;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_coparent.impl.services.JuniorCoparentService;
import efm.d0;
import fag.m0;
import fag.o0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.time.b;
import le.u1;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f134467j = new TypeToken<List<? extends de8.a>>() { // from class: com.revolut.feature.junior_coparent.impl.repositories.JuniorCoparentRepositoryImpl$Companion$COPARENT_LIST_TYPE$1
    }.getType();
    public static final Type k = new TypeToken<List<? extends de8.c>>() { // from class: com.revolut.feature.junior_coparent.impl.repositories.JuniorCoparentRepositoryImpl$Companion$INVITATION_APPLICATIONS_LIST_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Type f134468l = new TypeToken<List<? extends de8.b>>() { // from class: com.revolut.feature.junior_coparent.impl.repositories.JuniorCoparentRepositoryImpl$Companion$COPARENT_REQUESTS_LIST_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorCoparentService f134469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f134470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf0.h f134471c;
    public final ue0.c d;
    public final w4l.f e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f134472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f134473h;
    public final x4l.c i;

    public i(JuniorCoparentService service, j memoryCache, sf0.h serverErrorParser, ue0.c storage, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f134469a = service;
        this.f134470b = memoryCache;
        this.f134471c = serverErrorParser;
        this.d = storage;
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        final int i5 = 3;
        this.e = new w4l.f(new Function2(this) { // from class: fe8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134460b;

            {
                this.f134460b = this;
            }

            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i6 = i;
                i iVar = this.f134460b;
                switch (i6) {
                    case 0:
                        List coparentRequests = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(coparentRequests, "coparentRequests");
                        iVar.f134470b.f("COPARENT_REQUESTS_LIST_KEY", coparentRequests);
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<ce8.a>> coparents = iVar.f134469a.getCoparents(juniorId);
                        m0 m0Var = new m0(new o0(27), 23);
                        coparents.getClass();
                        ufm.i iVar2 = new ufm.i(coparents, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String juniorId2 = (String) obj2;
                        List coparents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents2, "coparents");
                        iVar.f134470b.f(i.a(juniorId2), coparents2);
                        break;
                    case 3:
                        String juniorId3 = (String) obj2;
                        List coparents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents3, "coparents");
                        ue0.c cVar = iVar.d;
                        String strA = i.a(juniorId3);
                        Object obj4 = be8.a.f14717a;
                        Intrinsics.checkNotNullParameter(coparents3, "<this>");
                        List<vd8.a> list = coparents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (vd8.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new de8.a(aVar.f287813a, aVar.f287814b, aVar.f287815c, aVar.d, aVar.e, u1.g(aVar.f, be8.a.f14717a), u1.g(aVar.f287816g, be8.a.f14718b), aVar.f287817h, aVar.i));
                        }
                        cVar.G(arrayList, strA, kii.e.o(de8.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        List invitationApplications = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitationApplications, "invitationApplications");
                        iVar.f134470b.f("INVITATION_APPLICATIONS_LIST_KEY", invitationApplications);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: fe8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134462b;

            {
                this.f134462b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i6 = i2;
                i iVar = this.f134462b;
                switch (i6) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (List) iVar.f134470b.get(i.a(juniorId));
                    case 1:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        ue0.c cVar = iVar.d;
                        String strA = i.a(juniorId2);
                        Type COPARENT_LIST_TYPE = i.f134467j;
                        Intrinsics.checkNotNullExpressionValue(COPARENT_LIST_TYPE, "COPARENT_LIST_TYPE");
                        List list = (List) cVar.T2(strA, COPARENT_LIST_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = be8.a.f14717a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<de8.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (de8.a aVar : list2) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new vd8.a(aVar.getId(), aVar.getFirstName(), aVar.getLastName(), aVar.getUsername(), aVar.getCode(), (vd8.d) u1.u(aVar.getRole(), be8.a.f14717a), (vd8.e) u1.u(aVar.getState(), be8.a.f14718b), aVar.getPhone(), aVar.getEmail()));
                        }
                        return arrayList;
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) iVar.f134470b.get("INVITATION_APPLICATIONS_LIST_KEY");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) iVar.f134470b.get("COPARENT_REQUESTS_LIST_KEY");
                }
            }
        }, new Function2(this) { // from class: fe8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134460b;

            {
                this.f134460b = this;
            }

            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i6 = i3;
                i iVar = this.f134460b;
                switch (i6) {
                    case 0:
                        List coparentRequests = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(coparentRequests, "coparentRequests");
                        iVar.f134470b.f("COPARENT_REQUESTS_LIST_KEY", coparentRequests);
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<ce8.a>> coparents = iVar.f134469a.getCoparents(juniorId);
                        m0 m0Var = new m0(new o0(27), 23);
                        coparents.getClass();
                        ufm.i iVar2 = new ufm.i(coparents, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String juniorId2 = (String) obj2;
                        List coparents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents2, "coparents");
                        iVar.f134470b.f(i.a(juniorId2), coparents2);
                        break;
                    case 3:
                        String juniorId3 = (String) obj2;
                        List coparents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents3, "coparents");
                        ue0.c cVar = iVar.d;
                        String strA = i.a(juniorId3);
                        Object obj4 = be8.a.f14717a;
                        Intrinsics.checkNotNullParameter(coparents3, "<this>");
                        List<vd8.a> list = coparents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (vd8.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new de8.a(aVar.f287813a, aVar.f287814b, aVar.f287815c, aVar.d, aVar.e, u1.g(aVar.f, be8.a.f14717a), u1.g(aVar.f287816g, be8.a.f14718b), aVar.f287817h, aVar.i));
                        }
                        cVar.G(arrayList, strA, kii.e.o(de8.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        List invitationApplications = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitationApplications, "invitationApplications");
                        iVar.f134470b.f("INVITATION_APPLICATIONS_LIST_KEY", invitationApplications);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: fe8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134462b;

            {
                this.f134462b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i6 = i;
                i iVar = this.f134462b;
                switch (i6) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (List) iVar.f134470b.get(i.a(juniorId));
                    case 1:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        ue0.c cVar = iVar.d;
                        String strA = i.a(juniorId2);
                        Type COPARENT_LIST_TYPE = i.f134467j;
                        Intrinsics.checkNotNullExpressionValue(COPARENT_LIST_TYPE, "COPARENT_LIST_TYPE");
                        List list = (List) cVar.T2(strA, COPARENT_LIST_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = be8.a.f14717a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<de8.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (de8.a aVar : list2) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new vd8.a(aVar.getId(), aVar.getFirstName(), aVar.getLastName(), aVar.getUsername(), aVar.getCode(), (vd8.d) u1.u(aVar.getRole(), be8.a.f14717a), (vd8.e) u1.u(aVar.getState(), be8.a.f14718b), aVar.getPhone(), aVar.getEmail()));
                        }
                        return arrayList;
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) iVar.f134470b.get("INVITATION_APPLICATIONS_LIST_KEY");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) iVar.f134470b.get("COPARENT_REQUESTS_LIST_KEY");
                }
            }
        }, new Function2(this) { // from class: fe8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134460b;

            {
                this.f134460b = this;
            }

            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i6 = i5;
                i iVar = this.f134460b;
                switch (i6) {
                    case 0:
                        List coparentRequests = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(coparentRequests, "coparentRequests");
                        iVar.f134470b.f("COPARENT_REQUESTS_LIST_KEY", coparentRequests);
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<ce8.a>> coparents = iVar.f134469a.getCoparents(juniorId);
                        m0 m0Var = new m0(new o0(27), 23);
                        coparents.getClass();
                        ufm.i iVar2 = new ufm.i(coparents, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String juniorId2 = (String) obj2;
                        List coparents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents2, "coparents");
                        iVar.f134470b.f(i.a(juniorId2), coparents2);
                        break;
                    case 3:
                        String juniorId3 = (String) obj2;
                        List coparents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents3, "coparents");
                        ue0.c cVar = iVar.d;
                        String strA = i.a(juniorId3);
                        Object obj4 = be8.a.f14717a;
                        Intrinsics.checkNotNullParameter(coparents3, "<this>");
                        List<vd8.a> list = coparents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (vd8.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new de8.a(aVar.f287813a, aVar.f287814b, aVar.f287815c, aVar.d, aVar.e, u1.g(aVar.f, be8.a.f14717a), u1.g(aVar.f287816g, be8.a.f14718b), aVar.f287817h, aVar.i));
                        }
                        cVar.G(arrayList, strA, kii.e.o(de8.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        List invitationApplications = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitationApplications, "invitationApplications");
                        iVar.f134470b.f("INVITATION_APPLICATIONS_LIST_KEY", invitationApplications);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.MINUTES;
        ze0.c cVar = (ze0.c) forceReloadStrategyFactory;
        this.f = cVar.b(kotlin.time.b.f(kotlin.time.c.g(1, eVar)));
        Continuation continuation = null;
        f fVar = new f(this, continuation, i);
        Function1 function1 = new Function1(this) { // from class: fe8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134462b;

            {
                this.f134462b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i6 = i3;
                i iVar = this.f134462b;
                switch (i6) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (List) iVar.f134470b.get(i.a(juniorId));
                    case 1:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        ue0.c cVar2 = iVar.d;
                        String strA = i.a(juniorId2);
                        Type COPARENT_LIST_TYPE = i.f134467j;
                        Intrinsics.checkNotNullExpressionValue(COPARENT_LIST_TYPE, "COPARENT_LIST_TYPE");
                        List list = (List) cVar2.T2(strA, COPARENT_LIST_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = be8.a.f14717a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<de8.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (de8.a aVar : list2) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new vd8.a(aVar.getId(), aVar.getFirstName(), aVar.getLastName(), aVar.getUsername(), aVar.getCode(), (vd8.d) u1.u(aVar.getRole(), be8.a.f14717a), (vd8.e) u1.u(aVar.getState(), be8.a.f14718b), aVar.getPhone(), aVar.getEmail()));
                        }
                        return arrayList;
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) iVar.f134470b.get("INVITATION_APPLICATIONS_LIST_KEY");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) iVar.f134470b.get("COPARENT_REQUESTS_LIST_KEY");
                }
            }
        };
        final int i6 = 4;
        this.f134472g = new x4l.c(fVar, function1, new Function2(this) { // from class: fe8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134460b;

            {
                this.f134460b = this;
            }

            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i66 = i6;
                i iVar = this.f134460b;
                switch (i66) {
                    case 0:
                        List coparentRequests = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(coparentRequests, "coparentRequests");
                        iVar.f134470b.f("COPARENT_REQUESTS_LIST_KEY", coparentRequests);
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<ce8.a>> coparents = iVar.f134469a.getCoparents(juniorId);
                        m0 m0Var = new m0(new o0(27), 23);
                        coparents.getClass();
                        ufm.i iVar2 = new ufm.i(coparents, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String juniorId2 = (String) obj2;
                        List coparents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents2, "coparents");
                        iVar.f134470b.f(i.a(juniorId2), coparents2);
                        break;
                    case 3:
                        String juniorId3 = (String) obj2;
                        List coparents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents3, "coparents");
                        ue0.c cVar2 = iVar.d;
                        String strA = i.a(juniorId3);
                        Object obj4 = be8.a.f14717a;
                        Intrinsics.checkNotNullParameter(coparents3, "<this>");
                        List<vd8.a> list = coparents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (vd8.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new de8.a(aVar.f287813a, aVar.f287814b, aVar.f287815c, aVar.d, aVar.e, u1.g(aVar.f, be8.a.f14717a), u1.g(aVar.f287816g, be8.a.f14718b), aVar.f287817h, aVar.i));
                        }
                        cVar2.G(arrayList, strA, kii.e.o(de8.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        List invitationApplications = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitationApplications, "invitationApplications");
                        iVar.f134470b.f("INVITATION_APPLICATIONS_LIST_KEY", invitationApplications);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, i), new h(this, continuation, i));
        this.f134473h = cVar.b(kotlin.time.b.f(kotlin.time.c.g(1, eVar)));
        this.i = new x4l.c(new f(this, continuation, i2), new Function1(this) { // from class: fe8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134462b;

            {
                this.f134462b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i66 = i5;
                i iVar = this.f134462b;
                switch (i66) {
                    case 0:
                        String juniorId = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        return (List) iVar.f134470b.get(i.a(juniorId));
                    case 1:
                        String juniorId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        ue0.c cVar2 = iVar.d;
                        String strA = i.a(juniorId2);
                        Type COPARENT_LIST_TYPE = i.f134467j;
                        Intrinsics.checkNotNullExpressionValue(COPARENT_LIST_TYPE, "COPARENT_LIST_TYPE");
                        List list = (List) cVar2.T2(strA, COPARENT_LIST_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = be8.a.f14717a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<de8.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (de8.a aVar : list2) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new vd8.a(aVar.getId(), aVar.getFirstName(), aVar.getLastName(), aVar.getUsername(), aVar.getCode(), (vd8.d) u1.u(aVar.getRole(), be8.a.f14717a), (vd8.e) u1.u(aVar.getState(), be8.a.f14718b), aVar.getPhone(), aVar.getEmail()));
                        }
                        return arrayList;
                    case 2:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) iVar.f134470b.get("INVITATION_APPLICATIONS_LIST_KEY");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) iVar.f134470b.get("COPARENT_REQUESTS_LIST_KEY");
                }
            }
        }, new Function2(this) { // from class: fe8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134460b;

            {
                this.f134460b = this;
            }

            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i66 = i2;
                i iVar = this.f134460b;
                switch (i66) {
                    case 0:
                        List coparentRequests = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(coparentRequests, "coparentRequests");
                        iVar.f134470b.f("COPARENT_REQUESTS_LIST_KEY", coparentRequests);
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<ce8.a>> coparents = iVar.f134469a.getCoparents(juniorId);
                        m0 m0Var = new m0(new o0(27), 23);
                        coparents.getClass();
                        ufm.i iVar2 = new ufm.i(coparents, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String juniorId2 = (String) obj2;
                        List coparents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents2, "coparents");
                        iVar.f134470b.f(i.a(juniorId2), coparents2);
                        break;
                    case 3:
                        String juniorId3 = (String) obj2;
                        List coparents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(coparents3, "coparents");
                        ue0.c cVar2 = iVar.d;
                        String strA = i.a(juniorId3);
                        Object obj4 = be8.a.f14717a;
                        Intrinsics.checkNotNullParameter(coparents3, "<this>");
                        List<vd8.a> list = coparents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (vd8.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new de8.a(aVar.f287813a, aVar.f287814b, aVar.f287815c, aVar.d, aVar.e, u1.g(aVar.f, be8.a.f14717a), u1.g(aVar.f287816g, be8.a.f14718b), aVar.f287817h, aVar.i));
                        }
                        cVar2.G(arrayList, strA, kii.e.o(de8.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        List invitationApplications = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitationApplications, "invitationApplications");
                        iVar.f134470b.f("INVITATION_APPLICATIONS_LIST_KEY", invitationApplications);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, i2), new h(this, continuation, i2));
    }

    public static String a(String str) {
        return j6.a.q("COPARENT_LIST_KEY", str);
    }
}
