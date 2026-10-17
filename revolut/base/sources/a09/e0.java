package a09;

import androidx.room.util.DBUtil;
import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import java.util.List;
import java.util.Map;
import jz8.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnService f254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz8.h f255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f256c;
    public final a61.a d;
    public final c09.b e;
    public final w4l.f f;

    public e0(LearnService apiService, hz8.h coursesDao, ne0.d memoryCache, a61.a courseCacheInvalidator, c09.b learnProgressUpdateResultMapper) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(coursesDao, "coursesDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(courseCacheInvalidator, "courseCacheInvalidator");
        Intrinsics.checkNotNullParameter(learnProgressUpdateResultMapper, "learnProgressUpdateResultMapper");
        this.f254a = apiService;
        this.f255b = coursesDao;
        this.f256c = memoryCache;
        this.d = courseCacheInvalidator;
        this.e = learnProgressUpdateResultMapper;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: a09.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f292b;

            {
                this.f292b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                e0 e0Var = this.f292b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String lessonId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
                        efm.d0<uz8.i> lessonDetails = e0Var.f254a.getLessonDetails(lessonId);
                        c0 c0Var = c0.f;
                        a0.b bVar = new a0.b(3);
                        lessonDetails.getClass();
                        ufm.i iVar = new ufm.i(lessonDetails, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String lessonId2 = (String) obj2;
                        u09.q lesson = (u09.q) obj3;
                        Intrinsics.checkNotNullParameter(lessonId2, "lessonId");
                        Intrinsics.checkNotNullParameter(lesson, "lesson");
                        e0Var.f256c.f(lessonId2, lesson);
                        break;
                    default:
                        u09.q lesson2 = (u09.q) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(lesson2, "lesson");
                        hz8.h hVar = e0Var.f255b;
                        List listC = zhm.u.c(nz8.f.d(lesson2));
                        hVar.getClass();
                        listC.getClass();
                        DBUtil.performBlocking(hVar.f157071a, false, true, new hul.v(hVar, listC, 15));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: a09.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f294b;

            {
                this.f294b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String lessonId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
                        return (u09.q) this.f294b.f256c.get(lessonId);
                    default:
                        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
                        hz8.h hVar = this.f294b.f255b;
                        t0 t0Var = (t0) DBUtil.performBlocking(hVar.f157071a, true, false, new ho6.n(8, lessonId, hVar));
                        if (t0Var != null) {
                            return nz8.f.a(t0Var);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: a09.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f292b;

            {
                this.f292b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                e0 e0Var = this.f292b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String lessonId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
                        efm.d0<uz8.i> lessonDetails = e0Var.f254a.getLessonDetails(lessonId);
                        c0 c0Var = c0.f;
                        a0.b bVar = new a0.b(3);
                        lessonDetails.getClass();
                        ufm.i iVar = new ufm.i(lessonDetails, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String lessonId2 = (String) obj2;
                        u09.q lesson = (u09.q) obj3;
                        Intrinsics.checkNotNullParameter(lessonId2, "lessonId");
                        Intrinsics.checkNotNullParameter(lesson, "lesson");
                        e0Var.f256c.f(lessonId2, lesson);
                        break;
                    default:
                        u09.q lesson2 = (u09.q) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(lesson2, "lesson");
                        hz8.h hVar = e0Var.f255b;
                        List listC = zhm.u.c(nz8.f.d(lesson2));
                        hVar.getClass();
                        listC.getClass();
                        DBUtil.performBlocking(hVar.f157071a, false, true, new hul.v(hVar, listC, 15));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: a09.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f294b;

            {
                this.f294b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String lessonId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
                        return (u09.q) this.f294b.f256c.get(lessonId);
                    default:
                        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
                        hz8.h hVar = this.f294b.f255b;
                        t0 t0Var = (t0) DBUtil.performBlocking(hVar.f157071a, true, false, new ho6.n(8, lessonId, hVar));
                        if (t0Var != null) {
                            return nz8.f.a(t0Var);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        this.f = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: a09.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f292b;

            {
                this.f292b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                e0 e0Var = this.f292b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String lessonId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
                        efm.d0<uz8.i> lessonDetails = e0Var.f254a.getLessonDetails(lessonId);
                        c0 c0Var = c0.f;
                        a0.b bVar = new a0.b(3);
                        lessonDetails.getClass();
                        ufm.i iVar = new ufm.i(lessonDetails, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String lessonId2 = (String) obj2;
                        u09.q lesson = (u09.q) obj3;
                        Intrinsics.checkNotNullParameter(lessonId2, "lessonId");
                        Intrinsics.checkNotNullParameter(lesson, "lesson");
                        e0Var.f256c.f(lessonId2, lesson);
                        break;
                    default:
                        u09.q lesson2 = (u09.q) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(lesson2, "lesson");
                        hz8.h hVar = e0Var.f255b;
                        List listC = zhm.u.c(nz8.f.d(lesson2));
                        hVar.getClass();
                        listC.getClass();
                        DBUtil.performBlocking(hVar.f157071a, false, true, new hul.v(hVar, listC, 15));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final efm.d0 a(u09.q qVar, u09.y yVar, k0 k0Var, boolean z) {
        int i = b0.f247a[k0Var.ordinal()];
        if (i == 1) {
            pfm.h hVar = new pfm.h(new a0(qVar, 0, yVar, this), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return ue0.e.v(te0.w.g0(hVar)).D(new b09.b(new u09.z(yVar, z, qVar.f276147c, null)));
        }
        if (i == 2) {
            return b(qVar.f276145a, qVar.f276147c, yVar, z);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ufm.i iVar = new ufm.i(b(qVar.f276145a, qVar.f276147c, yVar, z), new a05.a(new z(this, qVar, z), 10), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return te0.w.i0(iVar);
    }

    public final ufm.i b(String lessonId, String str, u09.y yVar, boolean z) {
        uz8.p pVar;
        efm.d0<Response<uz8.n>> d0VarSubmitLessonProgress;
        u09.y yVar2 = u09.y.COMPLETED;
        LearnService learnService = this.f254a;
        if (yVar == yVar2) {
            d0VarSubmitLessonProgress = learnService.completeLesson(lessonId);
        } else {
            Map map = nz8.f.f220998a;
            Intrinsics.checkNotNullParameter(yVar, "<this>");
            Intrinsics.checkNotNullParameter(lessonId, "lessonId");
            switch (nz8.e.f220995a[yVar.ordinal()]) {
                case 1:
                    pVar = uz8.p.LOCKED;
                    break;
                case 2:
                    pVar = uz8.p.NOT_STARTED;
                    break;
                case 3:
                    pVar = uz8.p.CONTENT_STARTED;
                    break;
                case 4:
                    pVar = uz8.p.CONTENT_FINISHED;
                    break;
                case 5:
                    pVar = uz8.p.QUIZ_STARTED;
                    break;
                case 6:
                    pVar = uz8.p.COMPLETED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            d0VarSubmitLessonProgress = learnService.submitLessonProgress(lessonId, new uz8.n(lessonId, pVar));
        }
        ufm.i iVar = new ufm.i(te0.w.i0(d0VarSubmitLessonProgress), new a05.a(new z(str, yVar, this, z), 11), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
