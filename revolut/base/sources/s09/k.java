package s09;

import aii.u;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$InputData;
import dz8.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g09.i f258916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g09.e f258917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LessonScreenContract$InputData f258918n;
    public final t09.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f258919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f258920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f258921r;

    public k(g09.i lessonsInteractor, g09.e coursesInteractor, LessonScreenContract$InputData inputData, t09.f mapper, l completionActionHandler) {
        Intrinsics.checkNotNullParameter(lessonsInteractor, "lessonsInteractor");
        Intrinsics.checkNotNullParameter(coursesInteractor, "coursesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(completionActionHandler, "completionActionHandler");
        this.f258916l = lessonsInteractor;
        this.f258917m = coursesInteractor;
        this.f258918n = inputData;
        this.o = mapper;
        this.f258919p = completionActionHandler;
        this.f258920q = q.b(1, 5, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r8.d3(r9, r2) == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(s09.k r8, nii.n1 r9, gim.c r10) {
        /*
            com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$InputData r0 = r8.f258918n
            vkm.z1 r1 = r8.f258920q
            boolean r2 = r10 instanceof s09.g
            if (r2 == 0) goto L17
            r2 = r10
            s09.g r2 = (s09.g) r2
            int r3 = r2.f258907x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f258907x = r3
            goto L1c
        L17:
            s09.g r2 = new s09.g
            r2.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f258907x
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L3d
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            yhm.o.b(r10)
            goto L8b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            s09.k r9 = r2.u
            yhm.o.b(r10)
            goto L76
        L3d:
            yhm.o.b(r10)
            boolean r10 = r9 instanceof nii.l1
            if (r10 == 0) goto L56
            nii.l1 r9 = (nii.l1) r9
            nii.m0 r8 = r9.f216190a
            android.os.Parcelable r8 = r8.a()
            boolean r8 = r8 instanceof com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload
            if (r8 == 0) goto L92
            q09.a0 r8 = q09.a0.f241177a
            r1.k(r8)
            goto L92
        L56:
            boolean r10 = r9 instanceof nii.m1
            if (r10 == 0) goto L60
            q09.z r8 = q09.z.f241218a
            r1.k(r8)
            goto L92
        L60:
            boolean r10 = r9 instanceof nii.k1
            if (r10 == 0) goto L8e
            dz8.l r9 = r8.f258919p
            java.lang.String r10 = r0.f78016a
            r2.u = r8
            r2.f258907x = r6
            syj.g r9 = (syj.g) r9
            java.lang.Object r10 = r9.d(r7, r10, r2)
            if (r10 != r3) goto L75
            goto L8a
        L75:
            r9 = r8
        L76:
            dz8.k r10 = (dz8.k) r10
            boolean r9 = r9.e3(r10)
            if (r9 != 0) goto L92
            java.lang.String r9 = r0.f78016a
            r2.u = r7
            r2.f258907x = r5
            java.lang.Object r8 = r8.d3(r9, r2)
            if (r8 != r3) goto L8b
        L8a:
            return r3
        L8b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L8e:
            boolean r8 = r9 instanceof nii.j1
            if (r8 == 0) goto L95
        L92:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L95:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s09.k.Z2(s09.k, nii.n1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r11.f3(r0, r2) == r3) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0172, code lost:
    
        if (r11.d3(r12, r2) == r3) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(s09.k r11, nii.n1 r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s09.k.b3(s09.k, nii.n1, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void H2() {
        u uVar = this.f258921r;
        if (uVar != null) {
            this.f258921r = null;
            A2(uVar);
        }
    }

    public final Object c3(String str, gim.c cVar) {
        return q.x(mo3.a.g(rd0.e.b(this.f258916l.a(str)), null, new ryd.l(20), 1), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof s09.f
            if (r0 == 0) goto L13
            r0 = r8
            s09.f r0 = (s09.f) r0
            int r1 = r0.f258905w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f258905w = r1
            goto L18
        L13:
            s09.f r0 = new s09.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f258905w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L65
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L43
        L37:
            yhm.o.b(r8)
            r0.f258905w = r5
            java.lang.Object r8 = r6.c3(r7, r0)
            if (r8 != r1) goto L43
            goto L64
        L43:
            u09.q r8 = (u09.q) r8
            java.lang.String r7 = r8.f276147c
            r0.f258905w = r4
            g09.e r8 = r6.f258917m
            efm.r r7 = r8.a(r7)
            vkm.d r7 = rd0.e.b(r7)
            ryd.l r8 = new ryd.l
            r2 = 19
            r8.<init>(r2)
            jhi.b r7 = mo3.a.g(r7, r3, r8, r5)
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L65
        L64:
            return r1
        L65:
            u09.f r8 = (u09.f) r8
            com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview$Destination r7 = new com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview$Destination
            java.lang.String r0 = r8.f276109a
            u09.v r8 = r8.f276112g
            r7.<init>(r0, r8, r3, r3)
            r6.A2(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s09.k.d3(java.lang.String, gim.c):java.lang.Object");
    }

    public final boolean e3(dz8.k kVar) {
        if (Intrinsics.f(kVar, dz8.i.f121295a)) {
            return false;
        }
        if (Intrinsics.f(kVar, dz8.g.f121293a)) {
            return true;
        }
        if (kVar instanceof dz8.h) {
            A2(((dz8.h) kVar).f121294a);
            return true;
        }
        if (!(kVar instanceof dz8.j)) {
            throw new NoWhenBranchMatchedException();
        }
        dz8.j jVar = (dz8.j) kVar;
        this.f258921r = jVar.f121297b;
        n.O2(this, jVar.f121296a, null, 2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof s09.i
            if (r0 == 0) goto L13
            r0 = r9
            s09.i r0 = (s09.i) r0
            int r1 = r0.f258913y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f258913y = r1
            goto L18
        L13:
            s09.i r0 = new s09.i
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f258911w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f258913y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r9)
            goto L98
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep$Lesson r8 = r0.v
            com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload r0 = r0.u
            yhm.o.b(r9)
            r6 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto L5b
        L40:
            yhm.o.b(r9)
            com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep r9 = r8.f78018a
            boolean r2 = r9 instanceof com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep.Lesson
            if (r2 == 0) goto L6e
            r2 = r9
            com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep$Lesson r2 = (com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep.Lesson) r2
            java.lang.String r4 = r2.f78037a
            r0.u = r8
            r0.v = r2
            r0.f258913y = r5
            java.lang.Object r0 = r7.c3(r4, r0)
            if (r0 != r1) goto L5b
            goto L97
        L5b:
            u09.q r0 = (u09.q) r0
            com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview$Destination r1 = new com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview$Destination
            java.lang.String r0 = r0.f276147c
            u09.v r8 = r8.f78020c
            com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep$Lesson r9 = (com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep.Lesson) r9
            java.lang.String r9 = r9.f78037a
            r1.<init>(r0, r8, r9, r3)
            r7.A2(r1)
            goto Lb5
        L6e:
            boolean r2 = r9 instanceof com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep.Course
            if (r2 == 0) goto La7
            com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep$Course r9 = (com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep.Course) r9
            java.lang.String r8 = r9.f78036a
            r0.u = r3
            r0.v = r3
            r0.f258913y = r4
            g09.e r9 = r7.f258917m
            efm.r r8 = r9.a(r8)
            vkm.d r8 = rd0.e.b(r8)
            ryd.l r9 = new ryd.l
            r2 = 19
            r9.<init>(r2)
            jhi.b r8 = mo3.a.g(r8, r3, r9, r5)
            java.lang.Object r9 = vkm.q.x(r8, r0)
            if (r9 != r1) goto L98
        L97:
            return r1
        L98:
            u09.f r9 = (u09.f) r9
            com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview$Destination r8 = new com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$CourseOverview$Destination
            java.lang.String r0 = r9.f276109a
            u09.v r9 = r9.f276112g
            r8.<init>(r0, r9, r3, r3)
            r7.A2(r8)
            goto Lb5
        La7:
            boolean r9 = r9 instanceof com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep.None
            if (r9 == 0) goto Lb5
            u09.v r8 = r8.f78020c
            com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$Home$Destination r9 = new com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$Home$Destination
            r9.<init>(r8)
            r7.A2(r9)
        Lb5:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s09.k.f3(com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload, gim.c):java.lang.Object");
    }
}
