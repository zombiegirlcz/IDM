package lp6;

import com.revolut.feature.feedback.api.domain.FeedbackConfig;
import com.revolut.feature.feedback.api.domain.TagsFeedback;
import com.revolut.feature.feedback.impl.service.FeedbackService;
import ip0.v7;
import k7c.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements dp6.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeedbackService f198949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f198950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f198951c;
    public final x4l.c d;
    public final x4l.c e;

    public m(FeedbackService feedbackService, ne0.j feedbackCache, jp6.a feedbackMapper, ue0.c storage) {
        Intrinsics.checkNotNullParameter(feedbackService, "feedbackService");
        Intrinsics.checkNotNullParameter(feedbackCache, "feedbackCache");
        Intrinsics.checkNotNullParameter(feedbackMapper, "feedbackMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f198949a = feedbackService;
        this.f198950b = feedbackCache;
        this.f198951c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new x(this, continuation, 21), new Function1(this) { // from class: lp6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f198928b;

            {
                this.f198928b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String referenceType = (String) obj2;
                        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
                        return (TagsFeedback) v7.r("KEY_CACHE_TAGS_FEEDBACK", referenceType, this.f198928b.f198950b);
                    default:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.j jVar = this.f198928b.f198950b;
                        c cVar = m.Companion;
                        String strB = params.f198931a.b();
                        String str = params.f198932b;
                        cVar.getClass();
                        return (FeedbackConfig) jVar.get(c.a(strB, str));
                }
            }
        }, new Function2(this) { // from class: lp6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f198930b;

            {
                this.f198930b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String referenceType = (String) obj2;
                        TagsFeedback tags = (TagsFeedback) obj3;
                        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f198930b.f198950b.f("KEY_CACHE_TAGS_FEEDBACK" + referenceType, tags);
                        break;
                    default:
                        d params = (d) obj2;
                        FeedbackConfig feedbackConfig = (FeedbackConfig) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feedbackConfig, "feedbackConfig");
                        ne0.j jVar = this.f198930b.f198950b;
                        c cVar = m.Companion;
                        String strB = params.f198931a.b();
                        String str = params.f198932b;
                        cVar.getClass();
                        jVar.f(c.a(strB, str), feedbackConfig);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(2, 24, continuation), new k3c.l(3, 16, continuation));
        final int i2 = 1;
        this.e = new x4l.c(new x(this, continuation, 20), new Function1(this) { // from class: lp6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f198928b;

            {
                this.f198928b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String referenceType = (String) obj2;
                        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
                        return (TagsFeedback) v7.r("KEY_CACHE_TAGS_FEEDBACK", referenceType, this.f198928b.f198950b);
                    default:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.j jVar = this.f198928b.f198950b;
                        c cVar = m.Companion;
                        String strB = params.f198931a.b();
                        String str = params.f198932b;
                        cVar.getClass();
                        return (FeedbackConfig) jVar.get(c.a(strB, str));
                }
            }
        }, new Function2(this) { // from class: lp6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f198930b;

            {
                this.f198930b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String referenceType = (String) obj2;
                        TagsFeedback tags = (TagsFeedback) obj3;
                        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f198930b.f198950b.f("KEY_CACHE_TAGS_FEEDBACK" + referenceType, tags);
                        break;
                    default:
                        d params = (d) obj2;
                        FeedbackConfig feedbackConfig = (FeedbackConfig) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feedbackConfig, "feedbackConfig");
                        ne0.j jVar = this.f198930b.f198950b;
                        c cVar = m.Companion;
                        String strB = params.f198931a.b();
                        String str = params.f198932b;
                        cVar.getClass();
                        jVar.f(c.a(strB, str), feedbackConfig);
                        break;
                }
                return Unit.f186387a;
            }
        }, new le8.d(this, continuation, 29), new g(this, continuation, 0));
    }

    public final Object c(String str, j50.h hVar) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new e(this, str, null, 0), hVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(yo6.d r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof lp6.h
            if (r0 == 0) goto L13
            r0 = r13
            lp6.h r0 = (lp6.h) r0
            int r1 = r0.f198940w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f198940w = r1
            goto L18
        L13:
            lp6.h r0 = new lp6.h
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f198940w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L49
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            lp6.f r4 = new lp6.f
            r9 = 1
            r8 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f198940w = r3
            java.lang.Object r13 = skm.e0.J(r13, r4, r0)
            if (r13 != r1) goto L49
            return r1
        L49:
            hp6.a r13 = (hp6.a) r13
            boolean r11 = r13.getSubmission()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lp6.m.d(yo6.d, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(yo6.d r16, java.lang.String r17, int r18, java.lang.String r19, java.util.List r20, yo6.c r21, java.lang.Boolean r22, gim.c r23) throws java.lang.Throwable {
        /*
            r15 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof lp6.i
            if (r2 == 0) goto L17
            r2 = r1
            lp6.i r2 = (lp6.i) r2
            int r3 = r2.f198941w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f198941w = r3
            goto L1c
        L17:
            lp6.i r2 = new lp6.i
            r2.<init>(r15, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r13 = fim.a.COROUTINE_SUSPENDED
            int r3 = r2.f198941w
            r14 = 1
            if (r3 == 0) goto L33
            if (r3 != r14) goto L2b
            yhm.o.b(r1)
            goto L7c
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            yhm.o.b(r1)
            r1 = 0
            if (r0 == 0) goto L5b
            hp6.e$a r3 = new hp6.e$a
            boolean r5 = r0 instanceof yo6.b
            if (r5 == 0) goto L43
            r5 = r0
            yo6.b r5 = (yo6.b) r5
            goto L44
        L43:
            r5 = r1
        L44:
            if (r5 == 0) goto L49
            java.lang.String r5 = r5.f315607a
            goto L4a
        L49:
            r5 = r1
        L4a:
            boolean r6 = r0 instanceof yo6.a
            if (r6 == 0) goto L51
            yo6.a r0 = (yo6.a) r0
            goto L52
        L51:
            r0 = r1
        L52:
            if (r0 == 0) goto L56
            java.lang.String r1 = r0.f315606a
        L56:
            r3.<init>(r5, r1)
            r10 = r3
            goto L5c
        L5b:
            r10 = r1
        L5c:
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            lp6.j r3 = new lp6.j
            r12 = 0
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r19
            r8 = r20
            r11 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.f198941w = r14
            java.lang.Object r1 = skm.e0.J(r0, r3, r2)
            if (r1 != r13) goto L7c
            return r13
        L7c:
            hp6.c r1 = (hp6.c) r1
            com.revolut.feature.feedback.api.domain.Feedback r0 = jp6.a.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lp6.m.e(yo6.d, java.lang.String, int, java.lang.String, java.util.List, yo6.c, java.lang.Boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r13, int r14, java.lang.String r15, java.util.List r16, gim.c r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof lp6.k
            if (r1 == 0) goto L15
            r1 = r0
            lp6.k r1 = (lp6.k) r1
            int r2 = r1.f198945w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f198945w = r2
            goto L1a
        L15:
            lp6.k r1 = new lp6.k
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f198945w
            r11 = 1
            if (r2 == 0) goto L31
            if (r2 != r11) goto L29
            yhm.o.b(r0)
            goto L4e
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            yhm.o.b(r0)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            lp6.l r2 = new lp6.l
            r9 = 0
            r8 = 0
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r15
            r6 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.f198945w = r11
            java.lang.Object r0 = skm.e0.J(r0, r2, r1)
            if (r0 != r10) goto L4e
            return r10
        L4e:
            hp6.c r0 = (hp6.c) r0
            com.revolut.feature.feedback.api.domain.Feedback r0 = jp6.a.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lp6.m.f(java.lang.String, int, java.lang.String, java.util.List, gim.c):java.lang.Object");
    }
}
