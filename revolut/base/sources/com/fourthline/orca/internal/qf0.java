package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcScannerCallback;
import com.fourthline.nfc.NfcScannerConfig;
import com.fourthline.nfc.NfcScannerDataSource;
import com.fourthline.nfc.NfcScannerError;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.NfcScannerStep;
import com.fourthline.orca.internal.af0;
import com.fourthline.orca.internal.bf0;
import com.fourthline.orca.internal.cf0;
import com.fourthline.orca.internal.ef0;
import com.fourthline.orca.internal.ff0;
import com.fourthline.orca.internal.hd0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.xd1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class qf0 implements ax, NfcScannerCallback, NfcScannerDataSource, CoroutineScope {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f32407l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f32408m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f32409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f32410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f32411c;
    private final lf0 d;
    private final fe1 e;
    private final wd1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final hf0 f32412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final aq0 f32413h;
    private final qg0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32414j;
    private Job k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NfcScannerError.values().length];
            try {
                iArr[NfcScannerError.CONNECTION_LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NfcScannerError.AUTHENTICATION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NfcScannerError.NFC_NOT_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NfcScannerError.NFC_NOT_SUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NfcScannerError.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32415a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ef0 f32417c;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ef0 f32418a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ qf0 f32419b;

            public a(ef0 ef0Var, qf0 qf0Var) {
                this.f32418a = ef0Var;
                this.f32419b = qf0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                ee1 bVar;
                if (xd1Var instanceof xd1.a) {
                    ef0 ef0Var = this.f32418a;
                    if (ef0Var instanceof ef0.a) {
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        ld0 ld0Var = (ld0) (kyVarA instanceof ld0 ? kyVarA : null);
                        if (ld0Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        bVar = new bf0.c.C0170c(ld0Var);
                    } else {
                        if (!(ef0Var instanceof ef0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ky kyVarA2 = ((xd1.a) xd1Var).a();
                        ld0 ld0Var2 = (ld0) (kyVarA2 instanceof ld0 ? kyVarA2 : null);
                        if (ld0Var2 == null) {
                            throw new IllegalStateException(kyVarA2.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        bVar = new bf0.c.b(ld0Var2, ((ef0.b) this.f32418a).a());
                    }
                    this.f32419b.e.b(bVar);
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ef0 ef0Var, Continuation continuation) {
            super(2, continuation);
            this.f32417c = ef0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return qf0.this.new c(this.f32417c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r6).collect(r1, r5) == r0) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r5.f32415a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r6)
                goto L44
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                yhm.o.b(r6)
                goto L30
            L1c:
                yhm.o.b(r6)
                com.fourthline.orca.internal.qf0 r6 = com.fourthline.orca.internal.qf0.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.qf0.b(r6)
                com.fourthline.orca.internal.ef0 r1 = r5.f32417c
                r5.f32415a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.qf0$c$a r1 = new com.fourthline.orca.internal.qf0$c$a
                com.fourthline.orca.internal.ef0 r3 = r5.f32417c
                com.fourthline.orca.internal.qf0 r4 = com.fourthline.orca.internal.qf0.this
                r1.<init>(r3, r4)
                r5.f32415a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.qf0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f32421b;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return qf0.this.new d(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003b -> B:14:0x003e). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r5.f32421b
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                int r1 = r5.f32420a
                yhm.o.b(r6)
                goto L3e
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                yhm.o.b(r6)
                com.fourthline.orca.internal.qf0 r6 = com.fourthline.orca.internal.qf0.this
                com.fourthline.orca.internal.mq0 r6 = r6.d()
                com.fourthline.orca.internal.qf0 r1 = com.fourthline.orca.internal.qf0.this
                com.fourthline.orca.internal.or1 r3 = new com.fourthline.orca.internal.or1
                r4 = 0
                r3.<init>(r1, r4)
                r6.a(r3)
                r6 = 0
                r1 = r6
            L2d:
                r6 = 10
                if (r1 >= r6) goto L53
                r5.f32420a = r1
                r5.f32421b = r2
                r3 = 700(0x2bc, double:3.46E-321)
                java.lang.Object r6 = skm.k0.b(r3, r5)
                if (r6 != r0) goto L3e
                return r0
            L3e:
                int r1 = r1 + r2
                com.fourthline.orca.internal.qf0 r6 = com.fourthline.orca.internal.qf0.this
                com.fourthline.orca.internal.mq0 r6 = r6.d()
                com.fourthline.orca.internal.qf0 r3 = com.fourthline.orca.internal.qf0.this
                com.fourthline.orca.internal.lf0 r3 = com.fourthline.orca.internal.qf0.a(r3)
                kotlin.jvm.functions.Function1 r3 = r3.b(r1)
                r6.a(r3)
                goto L2d
            L53:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.qf0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ff0 a(qf0 qf0Var, ff0 ff0Var) {
            return qf0Var.d.b();
        }
    }

    public qf0(mq0 presenter, wr effectHandler, lf0 stateProvider, fe1 viewNavigator, wd1 viewCompletionHandler, hf0 repository, aq0 popupHandler, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f32409a = coroutineScope;
        this.f32410b = presenter;
        this.f32411c = effectHandler;
        this.d = stateProvider;
        this.e = viewNavigator;
        this.f = viewCompletionHandler;
        this.f32412g = repository;
        this.f32413h = popupHandler;
        this.i = analytics;
        this.f32414j = true;
    }

    private final void e() {
        o();
    }

    private final void f() {
        ad0 ad0VarF = this.f32412g.f();
        if (ad0VarF == null) {
            throw new IllegalStateException("Scanner result should be present at this point!");
        }
        a(new ef0.b(ad0VarF));
    }

    private final void g() {
        this.f32414j = false;
        this.e.b(bf0.c.a.f27108a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bf0 h() {
        return bf0.a.f27106a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bf0 i() {
        return bf0.e.f27114a;
    }

    private final void j() {
        o();
    }

    private final void k() {
        this.f32414j = true;
        this.f32412g.a((ad0) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bf0 l() {
        return bf0.a.f27106a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bf0 m() {
        return bf0.e.f27114a;
    }

    private final void n() {
        ff0 ff0Var = (ff0) this.f32410b.b();
        if (ff0Var instanceof ff0.e) {
            f();
        } else if (!(ff0Var instanceof ff0.b) && !(ff0Var instanceof ff0.d) && !(ff0Var instanceof ff0.c)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void o() {
        a();
        this.f32411c.a(new wp1(29));
        this.f32410b.a(new or1(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bf0 p() {
        return bf0.b.f27107a;
    }

    private final void q() {
        Job job2 = this.k;
        if (job2 == null || !job2.d()) {
            this.k = skm.e0.C(this, null, null, new d(null), 3);
        }
    }

    public NfcScannerConfig getConfig() {
        kf0 kf0VarC = this.f32412g.c();
        if (kf0VarC != null) {
            return new NfcScannerConfig(kf0VarC.getKey());
        }
        throw new IllegalStateException("Scanner should never be started without a key in the repository");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f32409a.getF74819h();
    }

    public void onFail(NfcScannerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a();
        fd fdVarA = this.f32412g.a();
        if (fdVarA != null) {
            this.i.track(new af0.a.C0163a(this.f32412g.b(), fdVarA, error));
        }
        if (this.f32414j) {
            hd0 hd0VarA = a(error);
            this.f32412g.a(hd0VarA);
            this.f32411c.a(new nr1(2));
            this.f32411c.a(new nr1(3));
            if ((hd0VarA instanceof hd0.a) || (hd0VarA instanceof hd0.d)) {
                hq0.c cVar = new hq0.c(hd0VarA, null, null, 6, null);
                final int i = 0;
                final int i2 = 1;
                this.f32413h.a(cVar, new Function0(this) { // from class: com.fourthline.orca.internal.mr1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ qf0 f31255b;

                    {
                        this.f31255b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return qf0.d(this.f31255b);
                            case 1:
                                return qf0.e(this.f31255b);
                            default:
                                return qf0.f(this.f31255b);
                        }
                    }
                }, new Function0(this) { // from class: com.fourthline.orca.internal.mr1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ qf0 f31255b;

                    {
                        this.f31255b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return qf0.d(this.f31255b);
                            case 1:
                                return qf0.e(this.f31255b);
                            default:
                                return qf0.f(this.f31255b);
                        }
                    }
                });
                return;
            }
            if (!(hd0VarA instanceof hd0.e)) {
                if (!(hd0VarA instanceof hd0.b) && !(hd0VarA instanceof hd0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                final int i3 = 2;
                this.f32413h.a(new hq0.c(hd0VarA, null, null, 6, null), new vp1(this, (hd0.e) hd0VarA, 4), new Function0(this) { // from class: com.fourthline.orca.internal.mr1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ qf0 f31255b;

                    {
                        this.f31255b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return qf0.d(this.f31255b);
                            case 1:
                                return qf0.e(this.f31255b);
                            default:
                                return qf0.f(this.f31255b);
                        }
                    }
                });
            }
        }
    }

    public void onStepUpdate(NfcScannerStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (step != NfcScannerStep.LOOKING_FOR_DOCUMENT) {
            q();
        } else {
            a();
            this.f32410b.a(new or1(this, 1));
        }
    }

    public void onSuccess(NfcScannerResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        a();
        this.f32411c.a(new nr1(0));
        this.f32411c.a(new nr1(1));
        this.f32412g.h();
        this.f32412g.a(new bd0(result));
        this.f32410b.a(new or1(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(qf0 qf0Var) {
        qf0Var.a(ef0.a.f28125a);
        return Unit.f186387a;
    }

    public final wr b() {
        return this.f32411c;
    }

    public final ExtraNfcScannerConfig c() {
        hf0 hf0Var = this.f32412g;
        DocumentType documentTypeB = hf0Var.b();
        fd fdVarA = hf0Var.a();
        return new ExtraNfcScannerConfig(documentTypeB, fdVarA != null ? fdVarA.c() : null, hf0Var.e());
    }

    public final mq0 d() {
        return this.f32410b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0 b(qf0 qf0Var, ff0 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return qf0Var.d.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(qf0 qf0Var) {
        qf0Var.o();
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(cf0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof cf0.a) {
            e();
            return;
        }
        if (event instanceof cf0.d) {
            k();
            return;
        }
        if (event instanceof cf0.c) {
            j();
        } else if (event instanceof cf0.b) {
            g();
        } else {
            if (!(event instanceof cf0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(qf0 qf0Var) {
        qf0Var.a(ef0.a.f28125a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0 c(qf0 qf0Var, ff0 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return (ff0) qf0Var.d.getInitialState();
    }

    private final void a(ef0 ef0Var) {
        skm.e0.C(this, null, null, new c(ef0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0 a(qf0 qf0Var, ff0 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return qf0Var.d.q();
    }

    private final void a() {
        Job job2 = this.k;
        if (job2 != null) {
            job2.f(null);
        }
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(qf0 qf0Var, hd0 hd0Var) {
        qf0Var.e.b(new bf0.c.d(((hd0.e) hd0Var).a()));
        return Unit.f186387a;
    }

    private final hd0 a(NfcScannerError nfcScannerError) {
        int i = b.$EnumSwitchMapping$0[nfcScannerError.ordinal()];
        if (i == 1) {
            return hd0.a.f29223a;
        }
        if (i == 2) {
            return new hd0.e(this.f32412g.c());
        }
        if (i == 3) {
            return hd0.b.f29225a;
        }
        if (i == 4) {
            return hd0.c.f29227a;
        }
        if (i == 5) {
            return hd0.d.a.a(hd0.d.f29229c, "NfcScannerViewModel.UNKNOWN", null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
