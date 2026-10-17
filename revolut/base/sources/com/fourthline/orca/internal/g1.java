package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.jq;
import com.fourthline.orca.internal.u41;
import com.fourthline.vision.document.DocumentScannerStep;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g1 implements u41 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28708h = new a(null);
    public static final int i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl f28709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t1 f28710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i1 f28711c;
    private final bh d;
    private final aq0 e;
    private final jq f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e51 f28712g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f28714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f28715c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f28716g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28717h;
        int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28718j;
        int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f28719l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f28721n;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28719l = obj2;
            this.f28721n |= Integer.MIN_VALUE;
            return g1.this.a((dp) null, (g51) null, this);
        }
    }

    public static final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function0 {
        public c(Object obj2) {
            super(0, 8, dp.class, obj2, "nextStep", "nextStep$fourthline_sdk_release()Lkotlinx/coroutines/Job;");
        }

        public final void a() {
            ((dp) this.receiver).l();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f28723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f28724c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f28725g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28726h;
        /* synthetic */ Object i;
        int k;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.i = obj2;
            this.k |= Integer.MIN_VALUE;
            return g1.this.a((dp) null, (g51) null, (String) null, (jn) null, this);
        }
    }

    public g1(fl identifierRepository, t1 analyzeImageWorker, i1 repository, bh validator, aq0 popupHandler, jq analytics) {
        Intrinsics.checkNotNullParameter(identifierRepository, "identifierRepository");
        Intrinsics.checkNotNullParameter(analyzeImageWorker, "analyzeImageWorker");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f28709a = identifierRepository;
        this.f28710b = analyzeImageWorker;
        this.f28711c = repository;
        this.d = validator;
        this.e = popupHandler;
        this.f = analytics;
    }

    @Override // com.fourthline.orca.internal.u41
    public /* bridge */ void reset() {
        super.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.dp r9, com.fourthline.orca.internal.g51 r10, java.lang.String r11, com.fourthline.orca.internal.jn r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.g1.a(com.fourthline.orca.internal.dp, com.fourthline.orca.internal.g51, java.lang.String, com.fourthline.orca.internal.jn, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0157, code lost:
    
        if (r1 == r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018b, code lost:
    
        if (r1 == r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ea, code lost:
    
        if (r1 == r6) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.fourthline.orca.internal.u41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.dp r19, com.fourthline.orca.internal.g51 r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.g1.a(com.fourthline.orca.internal.dp, com.fourthline.orca.internal.g51, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object a(dp dpVar, g51 g51Var, String str, er erVar, Continuation continuation) {
        if (!Intrinsics.f(erVar, er.b.f28232a) && !Intrinsics.f(erVar, er.c.f28234a)) {
            if (Intrinsics.f(erVar, er.h.f28244a)) {
                dpVar.y();
                this.e.a(new hq0.c(erVar, "document_scanner", null, 4, null));
                return u41.a.f33955c;
            }
            if (!Intrinsics.f(erVar, er.f.f28240a) && !Intrinsics.f(erVar, er.g.f28242a) && !Intrinsics.f(erVar, er.d.f28236a) && !Intrinsics.f(erVar, er.e.f28238a)) {
                if (!Intrinsics.f(erVar, er.a.f28230a) && !Intrinsics.f(erVar, er.i.f28246a) && !Intrinsics.f(erVar, er.j.f28248a)) {
                    throw new NoWhenBranchMatchedException();
                }
                dpVar.h().a(dpVar.j().e(false));
                dpVar.y();
                this.e.a(new hq0.c(erVar, "document_scanner", null, 4, null));
                return u41.a.f33955c;
            }
            dpVar.y();
            aq0.a(this.e, new hq0.c(erVar, "document_scanner", null, 4, null), null, new c(dpVar), 2, null);
            return u41.a.f33955c;
        }
        return a(dpVar, g51Var, str, erVar);
    }

    private final u41.a a(final dp dpVar, final g51 g51Var, final String str, final er erVar) {
        Set setA;
        e51 e51Var = this.f28712g;
        if (e51Var != null && (setA = e51Var.a()) != null && setA.contains(erVar)) {
            e51 e51Var2 = this.f28712g;
            if (Intrinsics.f(e51Var2 != null ? e51Var2.c() : null, h1.b(g51Var.c()))) {
                this.f.track(new jq.a.c(erVar, h1.b(g51Var)));
                return u41.a.f33954b;
            }
        }
        dpVar.h().a(dpVar.j().e(false));
        this.e.a(new hq0.c(erVar, "document_scanner", new Function0() { // from class: com.fourthline.orca.internal.fm1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.a(this.f28568a, str, g51Var, erVar, dpVar);
            }
        }));
        return u41.a.f33955c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g1 g1Var, String str, g51 g51Var, er erVar, dp dpVar) {
        Set setA;
        qa qaVarB = h1.b(g51Var.c());
        e51 e51Var = g1Var.f28712g;
        g1Var.f28712g = new e51(str, qaVarB, (e51Var == null || (setA = e51Var.a()) == null) ? zhm.y0.b(erVar) : zhm.a1.m(setA, erVar));
        dpVar.B();
        return Unit.f186387a;
    }

    private final Object a(jn jnVar, Continuation continuation) {
        String error = jnVar.getError();
        if (Intrinsics.f(error, "DocumentNotSupported")) {
            return zhm.f0.f322471a;
        }
        return Intrinsics.f(error, "NoDocumentDetected") ? zhm.u.c(er.c.f28234a) : zhm.f0.f322471a;
    }

    private final Object a(jn jnVar, nd1 nd1Var, Continuation continuation) {
        return this.d.a(h1.b(jnVar), nd1Var, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if ((r1 != null ? r1.getDocumentType() : null) == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(com.fourthline.orca.internal.jn r1, com.fourthline.orca.internal.g51 r2, kotlin.coroutines.Continuation r3) {
        /*
            r0 = this;
            com.fourthline.orca.internal.i1 r3 = r0.f28711c
            boolean r3 = r3.isDynamicStepsEnabled()
            if (r3 == 0) goto L34
            com.fourthline.vision.document.DocumentScannerStep r2 = r2.c()
            int r2 = r2.getIndex()
            if (r2 != 0) goto L34
            com.fourthline.orca.internal.fo r2 = r1.getValue()
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.String r2 = r2.getIssuingCountry()
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 == 0) goto L2d
            com.fourthline.orca.internal.fo r1 = r1.getValue()
            if (r1 == 0) goto L2b
            java.lang.String r3 = r1.getDocumentType()
        L2b:
            if (r3 != 0) goto L34
        L2d:
            com.fourthline.orca.internal.er$h r1 = com.fourthline.orca.internal.er.h.f28244a
            java.util.List r1 = zhm.u.c(r1)
            return r1
        L34:
            zhm.f0 r1 = zhm.f0.f322471a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.g1.a(com.fourthline.orca.internal.jn, com.fourthline.orca.internal.g51, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String a(DocumentScannerStep documentScannerStep, e51 e51Var) {
        String strB;
        if (e51Var != null && (strB = e51Var.b()) != null) {
            if (!Intrinsics.f(e51Var.c(), h1.b(documentScannerStep))) {
                strB = null;
            }
            if (strB != null) {
                return strB;
            }
        }
        return this.f28709a.b(documentScannerStep);
    }
}
