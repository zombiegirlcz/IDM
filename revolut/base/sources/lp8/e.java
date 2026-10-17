package lp8;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_tasks.impl.services.JuniorTasksService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import le.u1;
import llh.g;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ufm.i;
import w4l.f;
import wim.z;
import zhm.a1;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements a {

    @NotNull
    public static final d Companion = new d();
    public static final Type f = new TypeToken<List<? extends kp8.b>>() { // from class: com.revolut.feature.junior_tasks.impl.repositories.JuniorTasksRepositoryImpl$Companion$TASK_REWARD_SUGGESTIONS_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f198956g = new TypeToken<Map<String, ? extends List<? extends kp8.a>>>() { // from class: com.revolut.feature.junior_tasks.impl.repositories.JuniorTasksRepositoryImpl$Companion$ALL_TASKS_LIST_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorTasksService f198957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f198958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f198959c;
    public final f d;
    public final f e;

    public e(JuniorTasksService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f198957a = service;
        this.f198958b = memoryCache;
        this.f198959c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: lp8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198953b;

            {
                this.f198953b = this;
            }

            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                int i3 = 10;
                e eVar = this.f198953b;
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<jp8.d>> rewardSuggestions = eVar.f198957a.getRewardSuggestions(juniorId);
                        g gVar = new g(26, new loc.a(6));
                        rewardSuggestions.getClass();
                        i iVar = new i(rewardSuggestions, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        eVar.f198958b.f(e.a(juniorId2), suggestions);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List suggestions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        ue0.c cVar = eVar.f198959c;
                        String strA = e.a(juniorId3);
                        Intrinsics.checkNotNullParameter(suggestions2, "<this>");
                        List<dp8.f> list = suggestions2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (dp8.f fVar : list) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new kp8.b(hx7.a.A(fVar.f116842a)));
                        }
                        cVar.G(arrayList, strA, kii.e.o(kp8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<jp8.c>> allTasks = eVar.f198957a.getAllTasks();
                        g gVar2 = new g(25, new l3d.a(params, 25));
                        allTasks.getClass();
                        i iVar2 = new i(allTasks, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        Map newTasksMap = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(newTasksMap, "newTasksMap");
                        j jVar = eVar.f198958b;
                        jVar.f("ALL_TASKS_LIST_KEY", e.b((Map) jVar.get("ALL_TASKS_LIST_KEY"), newTasksMap));
                        break;
                    default:
                        ue0.c cVar2 = eVar.f198959c;
                        Map tasks = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tasks, "tasks");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(tasks.size()));
                        Iterator it8 = tasks.entrySet().iterator();
                        while (it8.hasNext()) {
                            Map.Entry entry = (Map.Entry) it8.next();
                            Object key = entry.getKey();
                            List list2 = (List) entry.getValue();
                            Object obj4 = ip8.b.f167679a;
                            Intrinsics.checkNotNullParameter(list2, "<this>");
                            List<dp8.b> list3 = list2;
                            ArrayList arrayList2 = new ArrayList(w.t(list3, i3));
                            for (dp8.b bVar : list3) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                String str = bVar.f116831a;
                                String str2 = bVar.f116832b;
                                String str3 = bVar.f116833c;
                                String str4 = bVar.d;
                                Iterator it9 = it8;
                                String strG = u1.g(bVar.e, ip8.b.f167679a);
                                jo3.b bVarA = hx7.a.A(bVar.f);
                                String str5 = bVar.f116834g;
                                String str6 = bVar.f116835h;
                                long millis = bVar.i.getMillis();
                                DateTime dateTime = bVar.f116836j;
                                Long lValueOf = null;
                                Long lValueOf2 = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                                DateTime dateTime2 = bVar.k;
                                if (dateTime2 != null) {
                                    lValueOf = Long.valueOf(dateTime2.getMillis());
                                }
                                arrayList2.add(new kp8.a(str, str2, str3, str4, strG, bVarA, str5, str6, millis, lValueOf2, lValueOf, u1.g(bVar.f116837l, ip8.b.f167680b)));
                                it8 = it9;
                            }
                            linkedHashMap.put(key, arrayList2);
                            i3 = 10;
                        }
                        Type ALL_TASKS_LIST_TYPE = e.f198956g;
                        Intrinsics.checkNotNullExpressionValue(ALL_TASKS_LIST_TYPE, "ALL_TASKS_LIST_TYPE");
                        cVar2.G(e.b((Map) cVar2.T2("ALL_TASKS_LIST_KEY", ALL_TASKS_LIST_TYPE), linkedHashMap), "ALL_TASKS_LIST_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(kp8.a.class)))))));
                        break;
                }
                return Unit.f186387a;
            }
        };
        c cVar = new c(this, i);
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: lp8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198953b;

            {
                this.f198953b = this;
            }

            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                int i3 = 10;
                e eVar = this.f198953b;
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<jp8.d>> rewardSuggestions = eVar.f198957a.getRewardSuggestions(juniorId);
                        g gVar = new g(26, new loc.a(6));
                        rewardSuggestions.getClass();
                        i iVar = new i(rewardSuggestions, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        eVar.f198958b.f(e.a(juniorId2), suggestions);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List suggestions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        ue0.c cVar2 = eVar.f198959c;
                        String strA = e.a(juniorId3);
                        Intrinsics.checkNotNullParameter(suggestions2, "<this>");
                        List<dp8.f> list = suggestions2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (dp8.f fVar : list) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new kp8.b(hx7.a.A(fVar.f116842a)));
                        }
                        cVar2.G(arrayList, strA, kii.e.o(kp8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<jp8.c>> allTasks = eVar.f198957a.getAllTasks();
                        g gVar2 = new g(25, new l3d.a(params, 25));
                        allTasks.getClass();
                        i iVar2 = new i(allTasks, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        Map newTasksMap = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(newTasksMap, "newTasksMap");
                        j jVar = eVar.f198958b;
                        jVar.f("ALL_TASKS_LIST_KEY", e.b((Map) jVar.get("ALL_TASKS_LIST_KEY"), newTasksMap));
                        break;
                    default:
                        ue0.c cVar22 = eVar.f198959c;
                        Map tasks = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tasks, "tasks");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(tasks.size()));
                        Iterator it8 = tasks.entrySet().iterator();
                        while (it8.hasNext()) {
                            Map.Entry entry = (Map.Entry) it8.next();
                            Object key = entry.getKey();
                            List list2 = (List) entry.getValue();
                            Object obj4 = ip8.b.f167679a;
                            Intrinsics.checkNotNullParameter(list2, "<this>");
                            List<dp8.b> list3 = list2;
                            ArrayList arrayList2 = new ArrayList(w.t(list3, i3));
                            for (dp8.b bVar : list3) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                String str = bVar.f116831a;
                                String str2 = bVar.f116832b;
                                String str3 = bVar.f116833c;
                                String str4 = bVar.d;
                                Iterator it9 = it8;
                                String strG = u1.g(bVar.e, ip8.b.f167679a);
                                jo3.b bVarA = hx7.a.A(bVar.f);
                                String str5 = bVar.f116834g;
                                String str6 = bVar.f116835h;
                                long millis = bVar.i.getMillis();
                                DateTime dateTime = bVar.f116836j;
                                Long lValueOf = null;
                                Long lValueOf2 = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                                DateTime dateTime2 = bVar.k;
                                if (dateTime2 != null) {
                                    lValueOf = Long.valueOf(dateTime2.getMillis());
                                }
                                arrayList2.add(new kp8.a(str, str2, str3, str4, strG, bVarA, str5, str6, millis, lValueOf2, lValueOf, u1.g(bVar.f116837l, ip8.b.f167680b)));
                                it8 = it9;
                            }
                            linkedHashMap.put(key, arrayList2);
                            i3 = 10;
                        }
                        Type ALL_TASKS_LIST_TYPE = e.f198956g;
                        Intrinsics.checkNotNullExpressionValue(ALL_TASKS_LIST_TYPE, "ALL_TASKS_LIST_TYPE");
                        cVar22.G(e.b((Map) cVar22.T2("ALL_TASKS_LIST_KEY", ALL_TASKS_LIST_TYPE), linkedHashMap), "ALL_TASKS_LIST_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(kp8.a.class)))))));
                        break;
                }
                return Unit.f186387a;
            }
        };
        c cVar2 = new c(this, i2);
        final int i3 = 2;
        this.d = new f(function2, cVar, function22, cVar2, new Function2(this) { // from class: lp8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198953b;

            {
                this.f198953b = this;
            }

            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                int i32 = 10;
                e eVar = this.f198953b;
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<jp8.d>> rewardSuggestions = eVar.f198957a.getRewardSuggestions(juniorId);
                        g gVar = new g(26, new loc.a(6));
                        rewardSuggestions.getClass();
                        i iVar = new i(rewardSuggestions, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        eVar.f198958b.f(e.a(juniorId2), suggestions);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List suggestions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        ue0.c cVar22 = eVar.f198959c;
                        String strA = e.a(juniorId3);
                        Intrinsics.checkNotNullParameter(suggestions2, "<this>");
                        List<dp8.f> list = suggestions2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (dp8.f fVar : list) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new kp8.b(hx7.a.A(fVar.f116842a)));
                        }
                        cVar22.G(arrayList, strA, kii.e.o(kp8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<jp8.c>> allTasks = eVar.f198957a.getAllTasks();
                        g gVar2 = new g(25, new l3d.a(params, 25));
                        allTasks.getClass();
                        i iVar2 = new i(allTasks, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        Map newTasksMap = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(newTasksMap, "newTasksMap");
                        j jVar = eVar.f198958b;
                        jVar.f("ALL_TASKS_LIST_KEY", e.b((Map) jVar.get("ALL_TASKS_LIST_KEY"), newTasksMap));
                        break;
                    default:
                        ue0.c cVar222 = eVar.f198959c;
                        Map tasks = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tasks, "tasks");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(tasks.size()));
                        Iterator it8 = tasks.entrySet().iterator();
                        while (it8.hasNext()) {
                            Map.Entry entry = (Map.Entry) it8.next();
                            Object key = entry.getKey();
                            List list2 = (List) entry.getValue();
                            Object obj4 = ip8.b.f167679a;
                            Intrinsics.checkNotNullParameter(list2, "<this>");
                            List<dp8.b> list3 = list2;
                            ArrayList arrayList2 = new ArrayList(w.t(list3, i32));
                            for (dp8.b bVar : list3) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                String str = bVar.f116831a;
                                String str2 = bVar.f116832b;
                                String str3 = bVar.f116833c;
                                String str4 = bVar.d;
                                Iterator it9 = it8;
                                String strG = u1.g(bVar.e, ip8.b.f167679a);
                                jo3.b bVarA = hx7.a.A(bVar.f);
                                String str5 = bVar.f116834g;
                                String str6 = bVar.f116835h;
                                long millis = bVar.i.getMillis();
                                DateTime dateTime = bVar.f116836j;
                                Long lValueOf = null;
                                Long lValueOf2 = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                                DateTime dateTime2 = bVar.k;
                                if (dateTime2 != null) {
                                    lValueOf = Long.valueOf(dateTime2.getMillis());
                                }
                                arrayList2.add(new kp8.a(str, str2, str3, str4, strG, bVarA, str5, str6, millis, lValueOf2, lValueOf, u1.g(bVar.f116837l, ip8.b.f167680b)));
                                it8 = it9;
                            }
                            linkedHashMap.put(key, arrayList2);
                            i32 = 10;
                        }
                        Type ALL_TASKS_LIST_TYPE = e.f198956g;
                        Intrinsics.checkNotNullExpressionValue(ALL_TASKS_LIST_TYPE, "ALL_TASKS_LIST_TYPE");
                        cVar222.G(e.b((Map) cVar222.T2("ALL_TASKS_LIST_KEY", ALL_TASKS_LIST_TYPE), linkedHashMap), "ALL_TASKS_LIST_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(kp8.a.class)))))));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 3;
        final int i6 = 4;
        final int i21 = 5;
        this.e = new f(new Function2(this) { // from class: lp8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198953b;

            {
                this.f198953b = this;
            }

            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                int i32 = 10;
                e eVar = this.f198953b;
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<jp8.d>> rewardSuggestions = eVar.f198957a.getRewardSuggestions(juniorId);
                        g gVar = new g(26, new loc.a(6));
                        rewardSuggestions.getClass();
                        i iVar = new i(rewardSuggestions, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        eVar.f198958b.f(e.a(juniorId2), suggestions);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List suggestions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        ue0.c cVar22 = eVar.f198959c;
                        String strA = e.a(juniorId3);
                        Intrinsics.checkNotNullParameter(suggestions2, "<this>");
                        List<dp8.f> list = suggestions2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (dp8.f fVar : list) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new kp8.b(hx7.a.A(fVar.f116842a)));
                        }
                        cVar22.G(arrayList, strA, kii.e.o(kp8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<jp8.c>> allTasks = eVar.f198957a.getAllTasks();
                        g gVar2 = new g(25, new l3d.a(params, 25));
                        allTasks.getClass();
                        i iVar2 = new i(allTasks, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        Map newTasksMap = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(newTasksMap, "newTasksMap");
                        j jVar = eVar.f198958b;
                        jVar.f("ALL_TASKS_LIST_KEY", e.b((Map) jVar.get("ALL_TASKS_LIST_KEY"), newTasksMap));
                        break;
                    default:
                        ue0.c cVar222 = eVar.f198959c;
                        Map tasks = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tasks, "tasks");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(tasks.size()));
                        Iterator it8 = tasks.entrySet().iterator();
                        while (it8.hasNext()) {
                            Map.Entry entry = (Map.Entry) it8.next();
                            Object key = entry.getKey();
                            List list2 = (List) entry.getValue();
                            Object obj4 = ip8.b.f167679a;
                            Intrinsics.checkNotNullParameter(list2, "<this>");
                            List<dp8.b> list3 = list2;
                            ArrayList arrayList2 = new ArrayList(w.t(list3, i32));
                            for (dp8.b bVar : list3) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                String str = bVar.f116831a;
                                String str2 = bVar.f116832b;
                                String str3 = bVar.f116833c;
                                String str4 = bVar.d;
                                Iterator it9 = it8;
                                String strG = u1.g(bVar.e, ip8.b.f167679a);
                                jo3.b bVarA = hx7.a.A(bVar.f);
                                String str5 = bVar.f116834g;
                                String str6 = bVar.f116835h;
                                long millis = bVar.i.getMillis();
                                DateTime dateTime = bVar.f116836j;
                                Long lValueOf = null;
                                Long lValueOf2 = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                                DateTime dateTime2 = bVar.k;
                                if (dateTime2 != null) {
                                    lValueOf = Long.valueOf(dateTime2.getMillis());
                                }
                                arrayList2.add(new kp8.a(str, str2, str3, str4, strG, bVarA, str5, str6, millis, lValueOf2, lValueOf, u1.g(bVar.f116837l, ip8.b.f167680b)));
                                it8 = it9;
                            }
                            linkedHashMap.put(key, arrayList2);
                            i32 = 10;
                        }
                        Type ALL_TASKS_LIST_TYPE = e.f198956g;
                        Intrinsics.checkNotNullExpressionValue(ALL_TASKS_LIST_TYPE, "ALL_TASKS_LIST_TYPE");
                        cVar222.G(e.b((Map) cVar222.T2("ALL_TASKS_LIST_KEY", ALL_TASKS_LIST_TYPE), linkedHashMap), "ALL_TASKS_LIST_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(kp8.a.class)))))));
                        break;
                }
                return Unit.f186387a;
            }
        }, new c(this, 2), new Function2(this) { // from class: lp8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198953b;

            {
                this.f198953b = this;
            }

            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                int i32 = 10;
                e eVar = this.f198953b;
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<jp8.d>> rewardSuggestions = eVar.f198957a.getRewardSuggestions(juniorId);
                        g gVar = new g(26, new loc.a(6));
                        rewardSuggestions.getClass();
                        i iVar = new i(rewardSuggestions, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        eVar.f198958b.f(e.a(juniorId2), suggestions);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List suggestions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        ue0.c cVar22 = eVar.f198959c;
                        String strA = e.a(juniorId3);
                        Intrinsics.checkNotNullParameter(suggestions2, "<this>");
                        List<dp8.f> list = suggestions2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (dp8.f fVar : list) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new kp8.b(hx7.a.A(fVar.f116842a)));
                        }
                        cVar22.G(arrayList, strA, kii.e.o(kp8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<jp8.c>> allTasks = eVar.f198957a.getAllTasks();
                        g gVar2 = new g(25, new l3d.a(params, 25));
                        allTasks.getClass();
                        i iVar2 = new i(allTasks, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        Map newTasksMap = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(newTasksMap, "newTasksMap");
                        j jVar = eVar.f198958b;
                        jVar.f("ALL_TASKS_LIST_KEY", e.b((Map) jVar.get("ALL_TASKS_LIST_KEY"), newTasksMap));
                        break;
                    default:
                        ue0.c cVar222 = eVar.f198959c;
                        Map tasks = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tasks, "tasks");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(tasks.size()));
                        Iterator it8 = tasks.entrySet().iterator();
                        while (it8.hasNext()) {
                            Map.Entry entry = (Map.Entry) it8.next();
                            Object key = entry.getKey();
                            List list2 = (List) entry.getValue();
                            Object obj4 = ip8.b.f167679a;
                            Intrinsics.checkNotNullParameter(list2, "<this>");
                            List<dp8.b> list3 = list2;
                            ArrayList arrayList2 = new ArrayList(w.t(list3, i32));
                            for (dp8.b bVar : list3) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                String str = bVar.f116831a;
                                String str2 = bVar.f116832b;
                                String str3 = bVar.f116833c;
                                String str4 = bVar.d;
                                Iterator it9 = it8;
                                String strG = u1.g(bVar.e, ip8.b.f167679a);
                                jo3.b bVarA = hx7.a.A(bVar.f);
                                String str5 = bVar.f116834g;
                                String str6 = bVar.f116835h;
                                long millis = bVar.i.getMillis();
                                DateTime dateTime = bVar.f116836j;
                                Long lValueOf = null;
                                Long lValueOf2 = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                                DateTime dateTime2 = bVar.k;
                                if (dateTime2 != null) {
                                    lValueOf = Long.valueOf(dateTime2.getMillis());
                                }
                                arrayList2.add(new kp8.a(str, str2, str3, str4, strG, bVarA, str5, str6, millis, lValueOf2, lValueOf, u1.g(bVar.f116837l, ip8.b.f167680b)));
                                it8 = it9;
                            }
                            linkedHashMap.put(key, arrayList2);
                            i32 = 10;
                        }
                        Type ALL_TASKS_LIST_TYPE = e.f198956g;
                        Intrinsics.checkNotNullExpressionValue(ALL_TASKS_LIST_TYPE, "ALL_TASKS_LIST_TYPE");
                        cVar222.G(e.b((Map) cVar222.T2("ALL_TASKS_LIST_KEY", ALL_TASKS_LIST_TYPE), linkedHashMap), "ALL_TASKS_LIST_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(kp8.a.class)))))));
                        break;
                }
                return Unit.f186387a;
            }
        }, new c(this, 3), new Function2(this) { // from class: lp8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f198953b;

            {
                this.f198953b = this;
            }

            /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i21;
                int i32 = 10;
                e eVar = this.f198953b;
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String juniorId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        d0<List<jp8.d>> rewardSuggestions = eVar.f198957a.getRewardSuggestions(juniorId);
                        g gVar = new g(26, new loc.a(6));
                        rewardSuggestions.getClass();
                        i iVar = new i(rewardSuggestions, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String juniorId2 = (String) obj2;
                        List suggestions = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        eVar.f198958b.f(e.a(juniorId2), suggestions);
                        break;
                    case 2:
                        String juniorId3 = (String) obj2;
                        List suggestions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        ue0.c cVar22 = eVar.f198959c;
                        String strA = e.a(juniorId3);
                        Intrinsics.checkNotNullParameter(suggestions2, "<this>");
                        List<dp8.f> list = suggestions2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (dp8.f fVar : list) {
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            arrayList.add(new kp8.b(hx7.a.A(fVar.f116842a)));
                        }
                        cVar22.G(arrayList, strA, kii.e.o(kp8.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 3:
                        f DataObservableDelegate2 = (f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<jp8.c>> allTasks = eVar.f198957a.getAllTasks();
                        g gVar2 = new g(25, new l3d.a(params, 25));
                        allTasks.getClass();
                        i iVar2 = new i(allTasks, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 4:
                        Map newTasksMap = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(newTasksMap, "newTasksMap");
                        j jVar = eVar.f198958b;
                        jVar.f("ALL_TASKS_LIST_KEY", e.b((Map) jVar.get("ALL_TASKS_LIST_KEY"), newTasksMap));
                        break;
                    default:
                        ue0.c cVar222 = eVar.f198959c;
                        Map tasks = (Map) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tasks, "tasks");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(tasks.size()));
                        Iterator it8 = tasks.entrySet().iterator();
                        while (it8.hasNext()) {
                            Map.Entry entry = (Map.Entry) it8.next();
                            Object key = entry.getKey();
                            List list2 = (List) entry.getValue();
                            Object obj4 = ip8.b.f167679a;
                            Intrinsics.checkNotNullParameter(list2, "<this>");
                            List<dp8.b> list3 = list2;
                            ArrayList arrayList2 = new ArrayList(w.t(list3, i32));
                            for (dp8.b bVar : list3) {
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                String str = bVar.f116831a;
                                String str2 = bVar.f116832b;
                                String str3 = bVar.f116833c;
                                String str4 = bVar.d;
                                Iterator it9 = it8;
                                String strG = u1.g(bVar.e, ip8.b.f167679a);
                                jo3.b bVarA = hx7.a.A(bVar.f);
                                String str5 = bVar.f116834g;
                                String str6 = bVar.f116835h;
                                long millis = bVar.i.getMillis();
                                DateTime dateTime = bVar.f116836j;
                                Long lValueOf = null;
                                Long lValueOf2 = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                                DateTime dateTime2 = bVar.k;
                                if (dateTime2 != null) {
                                    lValueOf = Long.valueOf(dateTime2.getMillis());
                                }
                                arrayList2.add(new kp8.a(str, str2, str3, str4, strG, bVarA, str5, str6, millis, lValueOf2, lValueOf, u1.g(bVar.f116837l, ip8.b.f167680b)));
                                it8 = it9;
                            }
                            linkedHashMap.put(key, arrayList2);
                            i32 = 10;
                        }
                        Type ALL_TASKS_LIST_TYPE = e.f198956g;
                        Intrinsics.checkNotNullExpressionValue(ALL_TASKS_LIST_TYPE, "ALL_TASKS_LIST_TYPE");
                        cVar222.G(e.b((Map) cVar222.T2("ALL_TASKS_LIST_KEY", ALL_TASKS_LIST_TYPE), linkedHashMap), "ALL_TASKS_LIST_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(kp8.a.class)))))));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(String str) {
        return j6.a.q("TASK_REWARD_SUGGESTIONS_KEY_", str);
    }

    public static LinkedHashMap b(Map map, Map map2) {
        LinkedHashMap linkedHashMapZ = map != null ? r0.z(map) : new LinkedHashMap();
        for (String str : a1.l(linkedHashMapZ.keySet(), map2.keySet())) {
            Collection collection = (List) map2.get(str);
            if (collection == null) {
                collection = f0.f322471a;
            }
            linkedHashMapZ.put(str, collection);
        }
        return linkedHashMapZ;
    }

    public final pfm.a c(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        d0 d0VarLastOrError = mo3.a.n(this.e.f("ALL_TASKS", true)).lastOrError();
        g gVar = new g(27, new llh.j(this, juniorId, 13));
        d0VarLastOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarLastOrError, gVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
