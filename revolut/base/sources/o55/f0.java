package o55;

import com.revolut.feature.credit.loan.impl.network.LoanServiceLegacy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanServiceLegacy f222335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f222336c;
    public final n45.c d;
    public final ue0.c e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f222337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f222338h;
    public final com.google.firebase.messaging.t i;

    public f0(String baseUrl, LoanServiceLegacy api2, ne0.j memoryCache, xx4.d typedMemoryCache, n45.c loanDao, ue0.c storage) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(typedMemoryCache, "typedMemoryCache");
        Intrinsics.checkNotNullParameter(loanDao, "loanDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f222334a = baseUrl;
        this.f222335b = api2;
        this.f222336c = memoryCache;
        this.d = loanDao;
        this.e = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: o55.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f222324b;

            {
                this.f222324b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 k55.q, still in use, count: 2, list:
                  (r8v1 k55.q) from 0x0221: MOVE (r23v0 k55.q) = (r8v1 k55.q)
                  (r8v1 k55.q) from 0x0213: MOVE (r23v2 k55.q) = (r8v1 k55.q)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o55.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i2 = 4;
        a0 a0Var = new a0(this, i2);
        Function2 function22 = new Function2(this) { // from class: o55.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f222324b;

            {
                this.f222324b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 k55.q, still in use, count: 2, list:
                  (r8v1 k55.q) from 0x0221: MOVE (r23v0 k55.q) = (r8v1 k55.q)
                  (r8v1 k55.q) from 0x0213: MOVE (r23v2 k55.q) = (r8v1 k55.q)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o55.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i3 = 5;
        this.f = new w4l.f(function2, a0Var, function22, null, new Function2(this) { // from class: o55.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f222324b;

            {
                this.f222324b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 k55.q, still in use, count: 2, list:
                  (r8v1 k55.q) from 0x0221: MOVE (r23v0 k55.q) = (r8v1 k55.q)
                  (r8v1 k55.q) from 0x0213: MOVE (r23v2 k55.q) = (r8v1 k55.q)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o55.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, new a0(this, 5), null, 168);
        final int i5 = 6;
        Function2 function23 = new Function2(this) { // from class: o55.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f222324b;

            {
                this.f222324b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 k55.q, still in use, count: 2, list:
                  (r8v1 k55.q) from 0x0221: MOVE (r23v0 k55.q) = (r8v1 k55.q)
                  (r8v1 k55.q) from 0x0213: MOVE (r23v2 k55.q) = (r8v1 k55.q)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o55.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        a0 a0Var2 = new a0(this, i5);
        final int i6 = 7;
        final int i21 = 8;
        this.f222337g = new w4l.f(function23, a0Var2, new Function2(this) { // from class: o55.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f222324b;

            {
                this.f222324b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 k55.q, still in use, count: 2, list:
                  (r8v1 k55.q) from 0x0221: MOVE (r23v0 k55.q) = (r8v1 k55.q)
                  (r8v1 k55.q) from 0x0213: MOVE (r23v2 k55.q) = (r8v1 k55.q)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o55.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, new Function2(this) { // from class: o55.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f222324b;

            {
                this.f222324b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 k55.q, still in use, count: 2, list:
                  (r8v1 k55.q) from 0x0221: MOVE (r23v0 k55.q) = (r8v1 k55.q)
                  (r8v1 k55.q) from 0x0213: MOVE (r23v2 k55.q) = (r8v1 k55.q)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o55.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, new a0(this, 7), null, 168);
        final int i22 = 1;
        Function2 function24 = new Function2(this) { // from class: o55.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f222324b;

            {
                this.f222324b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 k55.q, still in use, count: 2, list:
                  (r8v1 k55.q) from 0x0221: MOVE (r23v0 k55.q) = (r8v1 k55.q)
                  (r8v1 k55.q) from 0x0213: MOVE (r23v2 k55.q) = (r8v1 k55.q)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o55.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        a0 a0Var3 = new a0(this, i22);
        final int i32 = 2;
        final int i33 = 3;
        this.f222338h = new w4l.f(function24, a0Var3, new Function2(this) { // from class: o55.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f222324b;

            {
                this.f222324b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 k55.q, still in use, count: 2, list:
                  (r8v1 k55.q) from 0x0221: MOVE (r23v0 k55.q) = (r8v1 k55.q)
                  (r8v1 k55.q) from 0x0213: MOVE (r23v2 k55.q) = (r8v1 k55.q)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o55.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new a0(this, 2), new Function2(this) { // from class: o55.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f222324b;

            {
                this.f222324b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 k55.q, still in use, count: 2, list:
                  (r8v1 k55.q) from 0x0221: MOVE (r23v0 k55.q) = (r8v1 k55.q)
                  (r8v1 k55.q) from 0x0213: MOVE (r23v2 k55.q) = (r8v1 k55.q)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 892
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o55.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        this.i = new com.google.firebase.messaging.t(new a0(this, i33), new ald.o(1, typedMemoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", 0, 15), new jki.d(2, typedMemoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", 0, 9));
    }

    public final pfm.z a() {
        efm.d0 d0VarFirstOrError = m70.a.g(zi0.c.J(this.f222338h.e(Unit.f186387a, w4l.h.f294642c)), null, new o4a.a(3), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return ue0.e.F(d0VarFirstOrError, r0.g());
    }
}
