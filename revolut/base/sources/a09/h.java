package a09;

import androidx.room.util.DBUtil;
import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz8.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnService f262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz8.h f263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f264c;
    public final w4l.f d;

    public h(LearnService apiService, hz8.h coursesDao, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(coursesDao, "coursesDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f262a = apiService;
        this.f263b = coursesDao;
        this.f264c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: a09.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251b;

            {
                this.f251b = this;
            }

            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strQ;
                u09.v vVar;
                jz8.l lVar;
                u09.l lVar2;
                u09.k kVar;
                int i2;
                ArrayList arrayList;
                int i3 = i;
                h hVar = this.f251b;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g gVar = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(gVar, "<destruct>");
                        u09.v vVar2 = gVar.f259a;
                        efm.d0<rz8.f> courseCategories = hVar.f262a.getCourseCategories(vVar2 != null ? vVar2.name() : null, null, null);
                        a05.a aVar = new a05.a(new a(4), 5);
                        courseCategories.getClass();
                        ufm.i iVar = new ufm.i(courseCategories, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        g gVar2 = (g) obj2;
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter(gVar2, "<destruct>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        u09.v vVar3 = gVar2.f259a;
                        ne0.j jVar = hVar.f264c;
                        if (vVar3 == null || (strQ = j6.a.q("LearnCourseCategoriesRepositoryImpl_", vVar3.name())) == null) {
                            strQ = "LearnCourseCategoriesRepositoryImpl_ALL_CATEGORIES_CACHE_KEY";
                        }
                        jVar.f(strQ, categories);
                        break;
                    default:
                        g gVar3 = (g) obj2;
                        List categories2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(gVar3, "<destruct>");
                        Intrinsics.checkNotNullParameter(categories2, "categories");
                        u09.v vVar4 = gVar3.f259a;
                        hz8.h hVar2 = hVar.f263b;
                        List<u09.i> list = categories2;
                        int i5 = 10;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        for (u09.i iVar2 : list) {
                            Object obj4 = nz8.b.f220991a;
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            jz8.f fVar = new jz8.f(iVar2.f276126a, iVar2.f276127b, u1.g(iVar2.f276128c, nz8.b.f220991a), iVar2.e);
                            ArrayList<u09.f> arrayList3 = iVar2.d;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, i5));
                            for (u09.f fVar2 : arrayList3) {
                                Intrinsics.checkNotNullParameter(fVar2, "<this>");
                                String str = fVar2.f276109a;
                                String str2 = fVar2.f276110b;
                                z0 z0VarC = nz8.j.c(fVar2.f276111c);
                                String str3 = fVar2.d;
                                u09.l lVar3 = fVar2.e;
                                u09.k kVar2 = fVar2.f;
                                u09.v vVar5 = fVar2.f276112g;
                                String str4 = fVar2.f276113h;
                                int i6 = fVar2.i;
                                List list2 = fVar2.k;
                                boolean z = fVar2.f276115l;
                                List list3 = fVar2.f276116m;
                                String str5 = fVar2.f276117n;
                                u09.o oVar = fVar2.o;
                                if (oVar != null) {
                                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                                    vVar = vVar4;
                                    lVar = new jz8.l(nz8.j.c(oVar.f276138a));
                                } else {
                                    vVar = vVar4;
                                    lVar = null;
                                }
                                List list4 = fVar2.f276118p;
                                if (list4 != null) {
                                    List list5 = list4;
                                    lVar2 = lVar3;
                                    kVar = kVar2;
                                    i2 = 10;
                                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                                    Iterator it8 = list5.iterator();
                                    while (it8.hasNext()) {
                                        arrayList5.add(nz8.d.H((u09.h) it8.next()));
                                    }
                                    arrayList = arrayList5;
                                } else {
                                    lVar2 = lVar3;
                                    kVar = kVar2;
                                    i2 = 10;
                                    arrayList = null;
                                }
                                arrayList4.add(new jz8.i(str, str2, z0VarC, str3, lVar2, kVar, vVar5, str4, i6, list2, z, list3, str5, lVar, arrayList, Boolean.valueOf(fVar2.f276119q)));
                                vVar4 = vVar;
                                i5 = i2;
                            }
                            arrayList2.add(new jz8.h(fVar, arrayList4));
                        }
                        DBUtil.performBlocking(hVar2.f157071a, false, true, new g48.h(hVar2, arrayList2, vVar4 == null, 7));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: a09.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f253b;

            {
                this.f253b = this;
            }

            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String strQ;
                List list;
                int i2 = i;
                h hVar = this.f253b;
                switch (i2) {
                    case 0:
                        g gVar = (g) obj2;
                        Intrinsics.checkNotNullParameter(gVar, "<destruct>");
                        u09.v vVar = gVar.f259a;
                        ne0.j jVar = hVar.f264c;
                        if (vVar == null || (strQ = j6.a.q("LearnCourseCategoriesRepositoryImpl_", vVar.name())) == null) {
                            strQ = "LearnCourseCategoriesRepositoryImpl_ALL_CATEGORIES_CACHE_KEY";
                        }
                        return (List) jVar.get(strQ);
                    default:
                        hz8.h hVar2 = hVar.f263b;
                        g gVar2 = (g) obj2;
                        Intrinsics.checkNotNullParameter(gVar2, "<destruct>");
                        u09.v vVar2 = gVar2.f259a;
                        int i3 = 1;
                        if (vVar2 == null) {
                            list = (List) DBUtil.performBlocking(hVar2.f157071a, true, true, new hw9.a(hVar2, 16));
                        } else {
                            List<jz8.h> list2 = (List) DBUtil.performBlocking(hVar2.f157071a, true, true, new hz8.f(hVar2, vVar2.name(), i3));
                            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                            for (jz8.h hVar3 : list2) {
                                List list3 = hVar3.f179619b;
                                ArrayList courses = new ArrayList();
                                for (Object obj3 : list3) {
                                    if (((jz8.i) obj3).f179626g == vVar2) {
                                        courses.add(obj3);
                                    }
                                }
                                jz8.f category = hVar3.f179618a;
                                Intrinsics.checkNotNullParameter(category, "category");
                                Intrinsics.checkNotNullParameter(courses, "courses");
                                arrayList.add(new jz8.h(category, courses));
                            }
                            list = arrayList;
                        }
                        List<jz8.h> list4 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (jz8.h hVar4 : list4) {
                            Object obj4 = nz8.b.f220991a;
                            Intrinsics.checkNotNullParameter(hVar4, "<this>");
                            jz8.f fVar = hVar4.f179618a;
                            List courses2 = hVar4.f179619b;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            Intrinsics.checkNotNullParameter(courses2, "courses");
                            String str = fVar.f179612a;
                            String str2 = fVar.f179613b;
                            u09.j jVar2 = (u09.j) u1.u(fVar.f179614c, nz8.b.f220991a);
                            List list5 = courses2;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it8 = list5.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(nz8.d.z((jz8.i) it8.next(), zhm.f0.f322471a));
                            }
                            arrayList2.add(new u09.i(str, str2, jVar2, arrayList3, fVar.d));
                        }
                        return arrayList2;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: a09.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251b;

            {
                this.f251b = this;
            }

            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strQ;
                u09.v vVar;
                jz8.l lVar;
                u09.l lVar2;
                u09.k kVar;
                int i22;
                ArrayList arrayList;
                int i3 = i2;
                h hVar = this.f251b;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g gVar = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(gVar, "<destruct>");
                        u09.v vVar2 = gVar.f259a;
                        efm.d0<rz8.f> courseCategories = hVar.f262a.getCourseCategories(vVar2 != null ? vVar2.name() : null, null, null);
                        a05.a aVar = new a05.a(new a(4), 5);
                        courseCategories.getClass();
                        ufm.i iVar = new ufm.i(courseCategories, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        g gVar2 = (g) obj2;
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter(gVar2, "<destruct>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        u09.v vVar3 = gVar2.f259a;
                        ne0.j jVar = hVar.f264c;
                        if (vVar3 == null || (strQ = j6.a.q("LearnCourseCategoriesRepositoryImpl_", vVar3.name())) == null) {
                            strQ = "LearnCourseCategoriesRepositoryImpl_ALL_CATEGORIES_CACHE_KEY";
                        }
                        jVar.f(strQ, categories);
                        break;
                    default:
                        g gVar3 = (g) obj2;
                        List categories2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(gVar3, "<destruct>");
                        Intrinsics.checkNotNullParameter(categories2, "categories");
                        u09.v vVar4 = gVar3.f259a;
                        hz8.h hVar2 = hVar.f263b;
                        List<u09.i> list = categories2;
                        int i5 = 10;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        for (u09.i iVar2 : list) {
                            Object obj4 = nz8.b.f220991a;
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            jz8.f fVar = new jz8.f(iVar2.f276126a, iVar2.f276127b, u1.g(iVar2.f276128c, nz8.b.f220991a), iVar2.e);
                            ArrayList<u09.f> arrayList3 = iVar2.d;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, i5));
                            for (u09.f fVar2 : arrayList3) {
                                Intrinsics.checkNotNullParameter(fVar2, "<this>");
                                String str = fVar2.f276109a;
                                String str2 = fVar2.f276110b;
                                z0 z0VarC = nz8.j.c(fVar2.f276111c);
                                String str3 = fVar2.d;
                                u09.l lVar3 = fVar2.e;
                                u09.k kVar2 = fVar2.f;
                                u09.v vVar5 = fVar2.f276112g;
                                String str4 = fVar2.f276113h;
                                int i6 = fVar2.i;
                                List list2 = fVar2.k;
                                boolean z = fVar2.f276115l;
                                List list3 = fVar2.f276116m;
                                String str5 = fVar2.f276117n;
                                u09.o oVar = fVar2.o;
                                if (oVar != null) {
                                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                                    vVar = vVar4;
                                    lVar = new jz8.l(nz8.j.c(oVar.f276138a));
                                } else {
                                    vVar = vVar4;
                                    lVar = null;
                                }
                                List list4 = fVar2.f276118p;
                                if (list4 != null) {
                                    List list5 = list4;
                                    lVar2 = lVar3;
                                    kVar = kVar2;
                                    i22 = 10;
                                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                                    Iterator it8 = list5.iterator();
                                    while (it8.hasNext()) {
                                        arrayList5.add(nz8.d.H((u09.h) it8.next()));
                                    }
                                    arrayList = arrayList5;
                                } else {
                                    lVar2 = lVar3;
                                    kVar = kVar2;
                                    i22 = 10;
                                    arrayList = null;
                                }
                                arrayList4.add(new jz8.i(str, str2, z0VarC, str3, lVar2, kVar, vVar5, str4, i6, list2, z, list3, str5, lVar, arrayList, Boolean.valueOf(fVar2.f276119q)));
                                vVar4 = vVar;
                                i5 = i22;
                            }
                            arrayList2.add(new jz8.h(fVar, arrayList4));
                        }
                        DBUtil.performBlocking(hVar2.f157071a, false, true, new g48.h(hVar2, arrayList2, vVar4 == null, 7));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: a09.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f253b;

            {
                this.f253b = this;
            }

            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String strQ;
                List list;
                int i22 = i2;
                h hVar = this.f253b;
                switch (i22) {
                    case 0:
                        g gVar = (g) obj2;
                        Intrinsics.checkNotNullParameter(gVar, "<destruct>");
                        u09.v vVar = gVar.f259a;
                        ne0.j jVar = hVar.f264c;
                        if (vVar == null || (strQ = j6.a.q("LearnCourseCategoriesRepositoryImpl_", vVar.name())) == null) {
                            strQ = "LearnCourseCategoriesRepositoryImpl_ALL_CATEGORIES_CACHE_KEY";
                        }
                        return (List) jVar.get(strQ);
                    default:
                        hz8.h hVar2 = hVar.f263b;
                        g gVar2 = (g) obj2;
                        Intrinsics.checkNotNullParameter(gVar2, "<destruct>");
                        u09.v vVar2 = gVar2.f259a;
                        int i3 = 1;
                        if (vVar2 == null) {
                            list = (List) DBUtil.performBlocking(hVar2.f157071a, true, true, new hw9.a(hVar2, 16));
                        } else {
                            List<jz8.h> list2 = (List) DBUtil.performBlocking(hVar2.f157071a, true, true, new hz8.f(hVar2, vVar2.name(), i3));
                            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                            for (jz8.h hVar3 : list2) {
                                List list3 = hVar3.f179619b;
                                ArrayList courses = new ArrayList();
                                for (Object obj3 : list3) {
                                    if (((jz8.i) obj3).f179626g == vVar2) {
                                        courses.add(obj3);
                                    }
                                }
                                jz8.f category = hVar3.f179618a;
                                Intrinsics.checkNotNullParameter(category, "category");
                                Intrinsics.checkNotNullParameter(courses, "courses");
                                arrayList.add(new jz8.h(category, courses));
                            }
                            list = arrayList;
                        }
                        List<jz8.h> list4 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (jz8.h hVar4 : list4) {
                            Object obj4 = nz8.b.f220991a;
                            Intrinsics.checkNotNullParameter(hVar4, "<this>");
                            jz8.f fVar = hVar4.f179618a;
                            List courses2 = hVar4.f179619b;
                            Intrinsics.checkNotNullParameter(fVar, "<this>");
                            Intrinsics.checkNotNullParameter(courses2, "courses");
                            String str = fVar.f179612a;
                            String str2 = fVar.f179613b;
                            u09.j jVar2 = (u09.j) u1.u(fVar.f179614c, nz8.b.f220991a);
                            List list5 = courses2;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list5, 10));
                            Iterator it8 = list5.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(nz8.d.z((jz8.i) it8.next(), zhm.f0.f322471a));
                            }
                            arrayList2.add(new u09.i(str, str2, jVar2, arrayList3, fVar.d));
                        }
                        return arrayList2;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: a09.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f251b;

            {
                this.f251b = this;
            }

            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strQ;
                u09.v vVar;
                jz8.l lVar;
                u09.l lVar2;
                u09.k kVar;
                int i22;
                ArrayList arrayList;
                int i32 = i3;
                h hVar = this.f251b;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g gVar = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(gVar, "<destruct>");
                        u09.v vVar2 = gVar.f259a;
                        efm.d0<rz8.f> courseCategories = hVar.f262a.getCourseCategories(vVar2 != null ? vVar2.name() : null, null, null);
                        a05.a aVar = new a05.a(new a(4), 5);
                        courseCategories.getClass();
                        ufm.i iVar = new ufm.i(courseCategories, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        g gVar2 = (g) obj2;
                        List categories = (List) obj3;
                        Intrinsics.checkNotNullParameter(gVar2, "<destruct>");
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        u09.v vVar3 = gVar2.f259a;
                        ne0.j jVar = hVar.f264c;
                        if (vVar3 == null || (strQ = j6.a.q("LearnCourseCategoriesRepositoryImpl_", vVar3.name())) == null) {
                            strQ = "LearnCourseCategoriesRepositoryImpl_ALL_CATEGORIES_CACHE_KEY";
                        }
                        jVar.f(strQ, categories);
                        break;
                    default:
                        g gVar3 = (g) obj2;
                        List categories2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(gVar3, "<destruct>");
                        Intrinsics.checkNotNullParameter(categories2, "categories");
                        u09.v vVar4 = gVar3.f259a;
                        hz8.h hVar2 = hVar.f263b;
                        List<u09.i> list = categories2;
                        int i5 = 10;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        for (u09.i iVar2 : list) {
                            Object obj4 = nz8.b.f220991a;
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            jz8.f fVar = new jz8.f(iVar2.f276126a, iVar2.f276127b, u1.g(iVar2.f276128c, nz8.b.f220991a), iVar2.e);
                            ArrayList<u09.f> arrayList3 = iVar2.d;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, i5));
                            for (u09.f fVar2 : arrayList3) {
                                Intrinsics.checkNotNullParameter(fVar2, "<this>");
                                String str = fVar2.f276109a;
                                String str2 = fVar2.f276110b;
                                z0 z0VarC = nz8.j.c(fVar2.f276111c);
                                String str3 = fVar2.d;
                                u09.l lVar3 = fVar2.e;
                                u09.k kVar2 = fVar2.f;
                                u09.v vVar5 = fVar2.f276112g;
                                String str4 = fVar2.f276113h;
                                int i6 = fVar2.i;
                                List list2 = fVar2.k;
                                boolean z = fVar2.f276115l;
                                List list3 = fVar2.f276116m;
                                String str5 = fVar2.f276117n;
                                u09.o oVar = fVar2.o;
                                if (oVar != null) {
                                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                                    vVar = vVar4;
                                    lVar = new jz8.l(nz8.j.c(oVar.f276138a));
                                } else {
                                    vVar = vVar4;
                                    lVar = null;
                                }
                                List list4 = fVar2.f276118p;
                                if (list4 != null) {
                                    List list5 = list4;
                                    lVar2 = lVar3;
                                    kVar = kVar2;
                                    i22 = 10;
                                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                                    Iterator it8 = list5.iterator();
                                    while (it8.hasNext()) {
                                        arrayList5.add(nz8.d.H((u09.h) it8.next()));
                                    }
                                    arrayList = arrayList5;
                                } else {
                                    lVar2 = lVar3;
                                    kVar = kVar2;
                                    i22 = 10;
                                    arrayList = null;
                                }
                                arrayList4.add(new jz8.i(str, str2, z0VarC, str3, lVar2, kVar, vVar5, str4, i6, list2, z, list3, str5, lVar, arrayList, Boolean.valueOf(fVar2.f276119q)));
                                vVar4 = vVar;
                                i5 = i22;
                            }
                            arrayList2.add(new jz8.h(fVar, arrayList4));
                        }
                        DBUtil.performBlocking(hVar2.f157071a, false, true, new g48.h(hVar2, arrayList2, vVar4 == null, 7));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
