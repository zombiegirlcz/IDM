package com.fourthline.orca.internal;

import com.fourthline.orca.internal.fg1;
import com.fourthline.orca.internal.gh1;
import com.fourthline.orca.internal.lz;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ix implements fg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gh1 f29716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yg1 f29717c;
    private final bf1 d;
    private final kh1 e;
    private final lz f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function2 f29718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t90 f29719h;
    private final u21 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h2 f29720j;
    private final CoroutineScope k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f29721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f29722m;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29725c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f29726g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f29727h;
        /* synthetic */ Object i;
        int k;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.i = obj2;
            this.k |= Integer.MIN_VALUE;
            return ix.this.a((gh1.b.C0203b) null, this);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29729a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29731c;
        final /* synthetic */ a2 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, a2 a2Var, Continuation continuation) {
            super(2, continuation);
            this.f29731c = str;
            this.d = a2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return ix.this.new b(this.f29731c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29729a;
            if (i == 0) {
                yhm.o.b(obj2);
                h2 h2Var = ix.this.f29720j;
                String str = this.f29731c;
                a2 a2Var = this.d;
                this.f29729a = 1;
                if (h2Var.a(str, a2Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    public static final class c extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29734c;
        /* synthetic */ Object d;
        int f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = ix.this.a((fg1.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29737c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f29738g;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f29738g |= Integer.MIN_VALUE;
            return ix.this.a((lg1) null, this);
        }
    }

    public static final class e extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29740b;
        int d;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29740b = obj2;
            this.d |= Integer.MIN_VALUE;
            return ix.this.a((String) null, this);
        }
    }

    public static final class f extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29743b;
        int d;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29743b = obj2;
            this.d |= Integer.MIN_VALUE;
            return ix.this.a((ye1) null, this);
        }
    }

    public static final class g extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29746b;
        int d;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29746b = obj2;
            this.d |= Integer.MIN_VALUE;
            return ix.this.b((String) null, this);
        }
    }

    public static final class h extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29749b;
        int d;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29749b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objB = ix.this.b((fg1.a) null, this);
            return objB == fim.a.COROUTINE_SUSPENDED ? objB : new yhm.m(objB);
        }
    }

    public ix(boolean z, gh1 workflowStartSessionWorker, yg1 workflowQtspPreSadTokenWorker, bf1 workflowConfigurationWorker, kh1 workflowStatusWorker, lz workflowWhatsNextWorker, Function2 workflowModulesFilter, t90 networkConfigResultRepo, u21 signingManager, h2 attestationWorker, CoroutineScope attestationScope) {
        Intrinsics.checkNotNullParameter(workflowStartSessionWorker, "workflowStartSessionWorker");
        Intrinsics.checkNotNullParameter(workflowQtspPreSadTokenWorker, "workflowQtspPreSadTokenWorker");
        Intrinsics.checkNotNullParameter(workflowConfigurationWorker, "workflowConfigurationWorker");
        Intrinsics.checkNotNullParameter(workflowStatusWorker, "workflowStatusWorker");
        Intrinsics.checkNotNullParameter(workflowWhatsNextWorker, "workflowWhatsNextWorker");
        Intrinsics.checkNotNullParameter(workflowModulesFilter, "workflowModulesFilter");
        Intrinsics.checkNotNullParameter(networkConfigResultRepo, "networkConfigResultRepo");
        Intrinsics.checkNotNullParameter(signingManager, "signingManager");
        Intrinsics.checkNotNullParameter(attestationWorker, "attestationWorker");
        Intrinsics.checkNotNullParameter(attestationScope, "attestationScope");
        this.f29715a = z;
        this.f29716b = workflowStartSessionWorker;
        this.f29717c = workflowQtspPreSadTokenWorker;
        this.d = workflowConfigurationWorker;
        this.e = workflowStatusWorker;
        this.f = workflowWhatsNextWorker;
        this.f29718g = workflowModulesFilter;
        this.f29719h = networkConfigResultRepo;
        this.i = signingManager;
        this.f29720j = attestationWorker;
        this.k = attestationScope;
        this.f29721l = new LinkedHashMap();
        this.f29722m = new LinkedHashMap();
    }

    private final void a(String str) {
        ib.b bVarB;
        ib.h hVar = hb.a.f150532a;
        if (hVar == null || (bVarB = hVar.b(ib.b.Session)) == null) {
            return;
        }
        bVarB.set("session_id", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.fourthline.orca.internal.fg1.a r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.fourthline.orca.internal.ix.h
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.orca.internal.ix$h r0 = (com.fourthline.orca.internal.ix.h) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ix$h r0 = new com.fourthline.orca.internal.ix$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29749b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.f29748a
            com.fourthline.orca.internal.fg1$a r8 = (com.fourthline.orca.internal.fg1.a) r8
            yhm.o.b(r9)
            yhm.m r9 = (yhm.m) r9
            java.lang.Object r9 = r9.f314193a
            goto L69
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            java.util.Map r9 = r7.f29721l
            java.lang.String r2 = r8.b()
            java.lang.Object r9 = r9.get(r2)
            com.fourthline.orca.internal.gh1$b r9 = (com.fourthline.orca.internal.gh1.b) r9
            if (r9 == 0) goto L4b
            yhm.m$a r8 = yhm.m.INSTANCE
            return r9
        L4b:
            com.fourthline.orca.internal.gh1 r9 = r7.f29716b
            com.fourthline.orca.internal.gh1$a r2 = new com.fourthline.orca.internal.gh1$a
            java.lang.String r4 = r8.b()
            java.lang.String r5 = r8.a()
            java.lang.String r6 = r7.a()
            r2.<init>(r4, r5, r6)
            r0.f29748a = r8
            r0.d = r3
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            yhm.m$a r0 = yhm.m.INSTANCE
            boolean r0 = r9 instanceof yhm.n
            if (r0 != 0) goto L7b
            r0 = r9
            com.fourthline.orca.internal.gh1$b r0 = (com.fourthline.orca.internal.gh1.b) r0
            java.util.Map r0 = r7.f29721l
            java.lang.String r8 = r8.b()
            r0.get(r8)
        L7b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ix.b(com.fourthline.orca.internal.fg1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String a() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        this.i.b();
        return this.i.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.fg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.fg1.a r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.fourthline.orca.internal.ix.c
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.orca.internal.ix$c r0 = (com.fourthline.orca.internal.ix.c) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ix$c r0 = new com.fourthline.orca.internal.ix$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f29733b
            com.fourthline.orca.internal.gh1$b r7 = (com.fourthline.orca.internal.gh1.b) r7
            java.lang.Object r7 = r0.f29732a
            com.fourthline.orca.internal.fg1$a r7 = (com.fourthline.orca.internal.fg1.a) r7
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L33 com.fourthline.orca.internal.cf1 -> L35
            goto L77
        L33:
            r7 = move-exception
            goto L93
        L35:
            r7 = move-exception
            goto L7a
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.f29732a
            com.fourthline.orca.internal.fg1$a r7 = (com.fourthline.orca.internal.fg1.a) r7
            yhm.o.b(r8)
            yhm.m r8 = (yhm.m) r8
            java.lang.Object r7 = r8.f314193a
            goto L59
        L4b:
            yhm.o.b(r8)
            r0.f29732a = r5
            r0.f = r4
            java.lang.Object r7 = r6.b(r7, r0)
            if (r7 != r1) goto L59
            goto L76
        L59:
            yhm.m$a r8 = yhm.m.INSTANCE
            boolean r8 = r7 instanceof yhm.n
            if (r8 != 0) goto L9a
            com.fourthline.orca.internal.gh1$b r7 = (com.fourthline.orca.internal.gh1.b) r7     // Catch: java.lang.Throwable -> L33
            boolean r8 = r7 instanceof com.fourthline.orca.internal.gh1.b.C0203b     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L82
            com.fourthline.orca.internal.gh1$b$b r7 = (com.fourthline.orca.internal.gh1.b.C0203b) r7     // Catch: java.lang.Throwable -> L33 com.fourthline.orca.internal.cf1 -> L35
            r0.f29732a = r5     // Catch: java.lang.Throwable -> L33 com.fourthline.orca.internal.cf1 -> L35
            r0.f29733b = r5     // Catch: java.lang.Throwable -> L33 com.fourthline.orca.internal.cf1 -> L35
            r8 = 0
            r0.f29734c = r8     // Catch: java.lang.Throwable -> L33 com.fourthline.orca.internal.cf1 -> L35
            r0.f = r3     // Catch: java.lang.Throwable -> L33 com.fourthline.orca.internal.cf1 -> L35
            java.lang.Object r8 = r6.a(r7, r0)     // Catch: java.lang.Throwable -> L33 com.fourthline.orca.internal.cf1 -> L35
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            com.fourthline.orca.internal.fg1$b r8 = (com.fourthline.orca.internal.fg1.b) r8     // Catch: java.lang.Throwable -> L33 com.fourthline.orca.internal.cf1 -> L35
            goto L7f
        L7a:
            com.fourthline.orca.internal.fg1$b$a r8 = new com.fourthline.orca.internal.fg1$b$a     // Catch: java.lang.Throwable -> L33
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L33
        L7f:
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L33
            goto L99
        L82:
            boolean r7 = r7 instanceof com.fourthline.orca.internal.gh1.b.a     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L8d
            com.fourthline.orca.internal.cf1$b r7 = com.fourthline.orca.internal.cf1.f27457a     // Catch: java.lang.Throwable -> L33
            com.fourthline.orca.internal.cf1$d r7 = r7.a()     // Catch: java.lang.Throwable -> L33
            throw r7     // Catch: java.lang.Throwable -> L33
        L8d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L33
            r7.<init>()     // Catch: java.lang.Throwable -> L33
            throw r7     // Catch: java.lang.Throwable -> L33
        L93:
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r8 = yhm.o.a(r7)
        L99:
            return r8
        L9a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ix.a(com.fourthline.orca.internal.fg1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.ix.g
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.ix$g r0 = (com.fourthline.orca.internal.ix.g) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ix$g r0 = new com.fourthline.orca.internal.ix$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29746b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f29745a
            java.lang.String r5 = (java.lang.String) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.orca.internal.kh1 r6 = r4.e
            com.fourthline.orca.internal.kh1$a r2 = new com.fourthline.orca.internal.kh1$a
            r2.<init>(r5)
            r5 = 0
            r0.f29745a = r5
            r0.d = r3
            java.lang.Object r5 = r6.a(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            yhm.o.b(r5)
            com.fourthline.orca.internal.kh1$b r5 = (com.fourthline.orca.internal.kh1.b) r5
            com.fourthline.orca.internal.hh1 r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ix.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.gh1.b.C0203b r21, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ix.a(com.fourthline.orca.internal.gh1$b$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.lg1 r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ix.a(com.fourthline.orca.internal.lg1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.ye1 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.ix.f
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.ix$f r0 = (com.fourthline.orca.internal.ix.f) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ix$f r0 = new com.fourthline.orca.internal.ix$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29743b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f29742a
            com.fourthline.orca.internal.ye1 r5 = (com.fourthline.orca.internal.ye1) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.orca.internal.lz r6 = r4.f
            com.fourthline.orca.internal.lz$a r2 = new com.fourthline.orca.internal.lz$a
            r2.<init>(r5)
            r5 = 0
            r0.f29742a = r5
            r0.d = r3
            java.lang.Object r5 = r6.a(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            yhm.o.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ix.a(com.fourthline.orca.internal.ye1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.ix.e
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.ix$e r0 = (com.fourthline.orca.internal.ix.e) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ix$e r0 = new com.fourthline.orca.internal.ix$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29740b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f29739a
            java.lang.String r5 = (java.lang.String) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r6 = r6.f314193a
            goto L56
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            java.util.Map r6 = r4.f29722m
            java.lang.Object r6 = r6.get(r5)
            com.fourthline.orca.internal.ye1 r6 = (com.fourthline.orca.internal.ye1) r6
            if (r6 != 0) goto L69
            com.fourthline.orca.internal.bf1 r6 = r4.d
            com.fourthline.orca.internal.bf1$a r2 = new com.fourthline.orca.internal.bf1$a
            r2.<init>(r5)
            r0.f29739a = r5
            r0.d = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            yhm.o.b(r6)
            com.fourthline.orca.internal.bf1$b r6 = (com.fourthline.orca.internal.bf1.b) r6
            java.util.Map r0 = r4.f29722m
            com.fourthline.orca.internal.ye1 r1 = r6.a()
            r0.put(r5, r1)
            com.fourthline.orca.internal.ye1 r5 = r6.a()
            return r5
        L69:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ix.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final ny a(lz.c cVar) {
        lz.c.C0245c c0245c = cVar instanceof lz.c.C0245c ? (lz.c.C0245c) cVar : null;
        if (c0245c != null) {
            return c0245c.c();
        }
        return null;
    }
}
