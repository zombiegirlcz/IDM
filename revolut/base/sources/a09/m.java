package a09;

import androidx.room.util.DBUtil;
import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnService f272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz8.h f273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f274c;
    public final w4l.f d;
    public final w4l.f e;

    public m(LearnService apiService, hz8.h coursesDao, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(coursesDao, "coursesDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f272a = apiService;
        this.f273b = coursesDao;
        this.f274c = memoryCache;
        final int i = 2;
        Function2 function2 = new Function2(this) { // from class: a09.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f266b;

            {
                this.f266b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                m mVar = this.f266b;
                switch (i2) {
                    case 0:
                        String courseId = (String) obj2;
                        u09.f course = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        Intrinsics.checkNotNullParameter(course, "course");
                        mVar.f274c.f(courseId, course);
                        return Unit.f186387a;
                    case 1:
                        u09.f courseWithLessons = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(courseWithLessons, "courseWithLessons");
                        hz8.h hVar = mVar.f273b;
                        DBUtil.performBlocking(hVar.f157071a, false, true, new hul.v(hVar, zhm.u.c(nz8.d.I(courseWithLessons)), 14));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u09.v params = (u09.v) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<qz8.l> allCourses = mVar.f272a.getAllCourses(params.name(), null, null);
                        a05.a aVar = new a05.a(new a(5), 6);
                        allCourses.getClass();
                        ufm.i iVar = new ufm.i(allCourses, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u09.v domain = (u09.v) obj2;
                        List courses = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        Intrinsics.checkNotNullParameter(courses, "courses");
                        ehe.n.z("KEY_COURSES_", domain.name(), mVar.f274c, courses);
                        return Unit.f186387a;
                    case 4:
                        u09.v domain2 = (u09.v) obj2;
                        List courses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        Intrinsics.checkNotNullParameter(courses2, "courses");
                        hz8.h hVar2 = mVar.f273b;
                        List list = courses2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(nz8.d.I((u09.f) it8.next()));
                        }
                        DBUtil.performBlocking(hVar2.f157071a, false, true, new hsa.l(hVar2, 7, domain2, arrayList));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String courseId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        efm.d0<qz8.t> courseDetails = mVar.f272a.getCourseDetails(courseId2);
                        l lVar = l.f;
                        a0.b bVar = new a0.b(2);
                        courseDetails.getClass();
                        ufm.i iVar2 = new ufm.i(courseDetails, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: a09.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f268b;

            {
                this.f268b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String courseId = (String) obj2;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        hz8.h hVar = this.f268b.f273b;
                        jz8.m mVar = (jz8.m) DBUtil.performBlocking(hVar.f157071a, true, true, new hz8.f(hVar, courseId, 0));
                        if (mVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(mVar, "<this>");
                        return nz8.d.z(mVar.f179639a, mVar.f179640b);
                    case 1:
                        u09.v domain = (u09.v) obj2;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        return (List) v7.r("KEY_COURSES_", domain.name(), this.f268b.f274c);
                    case 2:
                        u09.v domain2 = (u09.v) obj2;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        hz8.h hVar2 = this.f268b.f273b;
                        List<jz8.m> list = (List) DBUtil.performBlocking(hVar2.f157071a, true, true, new hz8.e(hVar2, domain2, 1));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (jz8.m mVar2 : list) {
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(nz8.d.z(mVar2.f179639a, mVar2.f179640b));
                        }
                        return arrayList;
                    default:
                        String courseId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        return (u09.f) this.f268b.f274c.get(courseId2);
                }
            }
        };
        final int i3 = 3;
        Function2 function22 = new Function2(this) { // from class: a09.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f266b;

            {
                this.f266b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                m mVar = this.f266b;
                switch (i22) {
                    case 0:
                        String courseId = (String) obj2;
                        u09.f course = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        Intrinsics.checkNotNullParameter(course, "course");
                        mVar.f274c.f(courseId, course);
                        return Unit.f186387a;
                    case 1:
                        u09.f courseWithLessons = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(courseWithLessons, "courseWithLessons");
                        hz8.h hVar = mVar.f273b;
                        DBUtil.performBlocking(hVar.f157071a, false, true, new hul.v(hVar, zhm.u.c(nz8.d.I(courseWithLessons)), 14));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u09.v params = (u09.v) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<qz8.l> allCourses = mVar.f272a.getAllCourses(params.name(), null, null);
                        a05.a aVar = new a05.a(new a(5), 6);
                        allCourses.getClass();
                        ufm.i iVar = new ufm.i(allCourses, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u09.v domain = (u09.v) obj2;
                        List courses = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        Intrinsics.checkNotNullParameter(courses, "courses");
                        ehe.n.z("KEY_COURSES_", domain.name(), mVar.f274c, courses);
                        return Unit.f186387a;
                    case 4:
                        u09.v domain2 = (u09.v) obj2;
                        List courses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        Intrinsics.checkNotNullParameter(courses2, "courses");
                        hz8.h hVar2 = mVar.f273b;
                        List list = courses2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(nz8.d.I((u09.f) it8.next()));
                        }
                        DBUtil.performBlocking(hVar2.f157071a, false, true, new hsa.l(hVar2, 7, domain2, arrayList));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String courseId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        efm.d0<qz8.t> courseDetails = mVar.f272a.getCourseDetails(courseId2);
                        l lVar = l.f;
                        a0.b bVar = new a0.b(2);
                        courseDetails.getClass();
                        ufm.i iVar2 = new ufm.i(courseDetails, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: a09.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f268b;

            {
                this.f268b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        String courseId = (String) obj2;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        hz8.h hVar = this.f268b.f273b;
                        jz8.m mVar = (jz8.m) DBUtil.performBlocking(hVar.f157071a, true, true, new hz8.f(hVar, courseId, 0));
                        if (mVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(mVar, "<this>");
                        return nz8.d.z(mVar.f179639a, mVar.f179640b);
                    case 1:
                        u09.v domain = (u09.v) obj2;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        return (List) v7.r("KEY_COURSES_", domain.name(), this.f268b.f274c);
                    case 2:
                        u09.v domain2 = (u09.v) obj2;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        hz8.h hVar2 = this.f268b.f273b;
                        List<jz8.m> list = (List) DBUtil.performBlocking(hVar2.f157071a, true, true, new hz8.e(hVar2, domain2, 1));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (jz8.m mVar2 : list) {
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(nz8.d.z(mVar2.f179639a, mVar2.f179640b));
                        }
                        return arrayList;
                    default:
                        String courseId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        return (u09.f) this.f268b.f274c.get(courseId2);
                }
            }
        };
        final int i6 = 4;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: a09.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f266b;

            {
                this.f266b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                m mVar = this.f266b;
                switch (i22) {
                    case 0:
                        String courseId = (String) obj2;
                        u09.f course = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        Intrinsics.checkNotNullParameter(course, "course");
                        mVar.f274c.f(courseId, course);
                        return Unit.f186387a;
                    case 1:
                        u09.f courseWithLessons = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(courseWithLessons, "courseWithLessons");
                        hz8.h hVar = mVar.f273b;
                        DBUtil.performBlocking(hVar.f157071a, false, true, new hul.v(hVar, zhm.u.c(nz8.d.I(courseWithLessons)), 14));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u09.v params = (u09.v) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<qz8.l> allCourses = mVar.f272a.getAllCourses(params.name(), null, null);
                        a05.a aVar = new a05.a(new a(5), 6);
                        allCourses.getClass();
                        ufm.i iVar = new ufm.i(allCourses, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u09.v domain = (u09.v) obj2;
                        List courses = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        Intrinsics.checkNotNullParameter(courses, "courses");
                        ehe.n.z("KEY_COURSES_", domain.name(), mVar.f274c, courses);
                        return Unit.f186387a;
                    case 4:
                        u09.v domain2 = (u09.v) obj2;
                        List courses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        Intrinsics.checkNotNullParameter(courses2, "courses");
                        hz8.h hVar2 = mVar.f273b;
                        List list = courses2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(nz8.d.I((u09.f) it8.next()));
                        }
                        DBUtil.performBlocking(hVar2.f157071a, false, true, new hsa.l(hVar2, 7, domain2, arrayList));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String courseId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        efm.d0<qz8.t> courseDetails = mVar.f272a.getCourseDetails(courseId2);
                        l lVar = l.f;
                        a0.b bVar = new a0.b(2);
                        courseDetails.getClass();
                        ufm.i iVar2 = new ufm.i(courseDetails, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 5;
        Function2 function23 = new Function2(this) { // from class: a09.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f266b;

            {
                this.f266b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i21;
                m mVar = this.f266b;
                switch (i22) {
                    case 0:
                        String courseId = (String) obj2;
                        u09.f course = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        Intrinsics.checkNotNullParameter(course, "course");
                        mVar.f274c.f(courseId, course);
                        return Unit.f186387a;
                    case 1:
                        u09.f courseWithLessons = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(courseWithLessons, "courseWithLessons");
                        hz8.h hVar = mVar.f273b;
                        DBUtil.performBlocking(hVar.f157071a, false, true, new hul.v(hVar, zhm.u.c(nz8.d.I(courseWithLessons)), 14));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u09.v params = (u09.v) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<qz8.l> allCourses = mVar.f272a.getAllCourses(params.name(), null, null);
                        a05.a aVar = new a05.a(new a(5), 6);
                        allCourses.getClass();
                        ufm.i iVar = new ufm.i(allCourses, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u09.v domain = (u09.v) obj2;
                        List courses = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        Intrinsics.checkNotNullParameter(courses, "courses");
                        ehe.n.z("KEY_COURSES_", domain.name(), mVar.f274c, courses);
                        return Unit.f186387a;
                    case 4:
                        u09.v domain2 = (u09.v) obj2;
                        List courses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        Intrinsics.checkNotNullParameter(courses2, "courses");
                        hz8.h hVar2 = mVar.f273b;
                        List list = courses2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(nz8.d.I((u09.f) it8.next()));
                        }
                        DBUtil.performBlocking(hVar2.f157071a, false, true, new hsa.l(hVar2, 7, domain2, arrayList));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String courseId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        efm.d0<qz8.t> courseDetails = mVar.f272a.getCourseDetails(courseId2);
                        l lVar = l.f;
                        a0.b bVar = new a0.b(2);
                        courseDetails.getClass();
                        ufm.i iVar2 = new ufm.i(courseDetails, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i22 = 3;
        Function1 function13 = new Function1(this) { // from class: a09.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f268b;

            {
                this.f268b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        String courseId = (String) obj2;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        hz8.h hVar = this.f268b.f273b;
                        jz8.m mVar = (jz8.m) DBUtil.performBlocking(hVar.f157071a, true, true, new hz8.f(hVar, courseId, 0));
                        if (mVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(mVar, "<this>");
                        return nz8.d.z(mVar.f179639a, mVar.f179640b);
                    case 1:
                        u09.v domain = (u09.v) obj2;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        return (List) v7.r("KEY_COURSES_", domain.name(), this.f268b.f274c);
                    case 2:
                        u09.v domain2 = (u09.v) obj2;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        hz8.h hVar2 = this.f268b.f273b;
                        List<jz8.m> list = (List) DBUtil.performBlocking(hVar2.f157071a, true, true, new hz8.e(hVar2, domain2, 1));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (jz8.m mVar2 : list) {
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(nz8.d.z(mVar2.f179639a, mVar2.f179640b));
                        }
                        return arrayList;
                    default:
                        String courseId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        return (u09.f) this.f268b.f274c.get(courseId2);
                }
            }
        };
        final int i32 = 0;
        Function2 function24 = new Function2(this) { // from class: a09.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f266b;

            {
                this.f266b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i32;
                m mVar = this.f266b;
                switch (i222) {
                    case 0:
                        String courseId = (String) obj2;
                        u09.f course = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        Intrinsics.checkNotNullParameter(course, "course");
                        mVar.f274c.f(courseId, course);
                        return Unit.f186387a;
                    case 1:
                        u09.f courseWithLessons = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(courseWithLessons, "courseWithLessons");
                        hz8.h hVar = mVar.f273b;
                        DBUtil.performBlocking(hVar.f157071a, false, true, new hul.v(hVar, zhm.u.c(nz8.d.I(courseWithLessons)), 14));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u09.v params = (u09.v) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<qz8.l> allCourses = mVar.f272a.getAllCourses(params.name(), null, null);
                        a05.a aVar = new a05.a(new a(5), 6);
                        allCourses.getClass();
                        ufm.i iVar = new ufm.i(allCourses, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u09.v domain = (u09.v) obj2;
                        List courses = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        Intrinsics.checkNotNullParameter(courses, "courses");
                        ehe.n.z("KEY_COURSES_", domain.name(), mVar.f274c, courses);
                        return Unit.f186387a;
                    case 4:
                        u09.v domain2 = (u09.v) obj2;
                        List courses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        Intrinsics.checkNotNullParameter(courses2, "courses");
                        hz8.h hVar2 = mVar.f273b;
                        List list = courses2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(nz8.d.I((u09.f) it8.next()));
                        }
                        DBUtil.performBlocking(hVar2.f157071a, false, true, new hsa.l(hVar2, 7, domain2, arrayList));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String courseId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        efm.d0<qz8.t> courseDetails = mVar.f272a.getCourseDetails(courseId2);
                        l lVar = l.f;
                        a0.b bVar = new a0.b(2);
                        courseDetails.getClass();
                        ufm.i iVar2 = new ufm.i(courseDetails, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function14 = new Function1(this) { // from class: a09.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f268b;

            {
                this.f268b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i32) {
                    case 0:
                        String courseId = (String) obj2;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        hz8.h hVar = this.f268b.f273b;
                        jz8.m mVar = (jz8.m) DBUtil.performBlocking(hVar.f157071a, true, true, new hz8.f(hVar, courseId, 0));
                        if (mVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(mVar, "<this>");
                        return nz8.d.z(mVar.f179639a, mVar.f179640b);
                    case 1:
                        u09.v domain = (u09.v) obj2;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        return (List) v7.r("KEY_COURSES_", domain.name(), this.f268b.f274c);
                    case 2:
                        u09.v domain2 = (u09.v) obj2;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        hz8.h hVar2 = this.f268b.f273b;
                        List<jz8.m> list = (List) DBUtil.performBlocking(hVar2.f157071a, true, true, new hz8.e(hVar2, domain2, 1));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (jz8.m mVar2 : list) {
                            Intrinsics.checkNotNullParameter(mVar2, "<this>");
                            arrayList.add(nz8.d.z(mVar2.f179639a, mVar2.f179640b));
                        }
                        return arrayList;
                    default:
                        String courseId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        return (u09.f) this.f268b.f274c.get(courseId2);
                }
            }
        };
        final int i33 = 1;
        this.e = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: a09.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f266b;

            {
                this.f266b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i33;
                m mVar = this.f266b;
                switch (i222) {
                    case 0:
                        String courseId = (String) obj2;
                        u09.f course = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter(courseId, "courseId");
                        Intrinsics.checkNotNullParameter(course, "course");
                        mVar.f274c.f(courseId, course);
                        return Unit.f186387a;
                    case 1:
                        u09.f courseWithLessons = (u09.f) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(courseWithLessons, "courseWithLessons");
                        hz8.h hVar = mVar.f273b;
                        DBUtil.performBlocking(hVar.f157071a, false, true, new hul.v(hVar, zhm.u.c(nz8.d.I(courseWithLessons)), 14));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u09.v params = (u09.v) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<qz8.l> allCourses = mVar.f272a.getAllCourses(params.name(), null, null);
                        a05.a aVar = new a05.a(new a(5), 6);
                        allCourses.getClass();
                        ufm.i iVar = new ufm.i(allCourses, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u09.v domain = (u09.v) obj2;
                        List courses = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        Intrinsics.checkNotNullParameter(courses, "courses");
                        ehe.n.z("KEY_COURSES_", domain.name(), mVar.f274c, courses);
                        return Unit.f186387a;
                    case 4:
                        u09.v domain2 = (u09.v) obj2;
                        List courses2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        Intrinsics.checkNotNullParameter(courses2, "courses");
                        hz8.h hVar2 = mVar.f273b;
                        List list = courses2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(nz8.d.I((u09.f) it8.next()));
                        }
                        DBUtil.performBlocking(hVar2.f157071a, false, true, new hsa.l(hVar2, 7, domain2, arrayList));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String courseId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(courseId2, "courseId");
                        efm.d0<qz8.t> courseDetails = mVar.f272a.getCourseDetails(courseId2);
                        l lVar = l.f;
                        a0.b bVar = new a0.b(2);
                        courseDetails.getClass();
                        ufm.i iVar2 = new ufm.i(courseDetails, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
