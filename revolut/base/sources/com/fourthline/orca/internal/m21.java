package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.orca.internal.a21;
import com.fourthline.orca.internal.c21;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.ui0;
import com.fourthline.orca.internal.xd1;
import com.fourthline.orca.internal.y11;
import com.fourthline.orca.internal.z11;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.fourthline.vision.selfie.compose.SelfieScannerControl;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes23.dex */
public final class m21 implements ax, CoroutineScope {
    public static final a B = new a(null);
    public static final int C = 8;
    private Job A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f30928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f30929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f30930c;
    private final l21 d;
    private final boolean e;
    private final fe1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wd1 f30931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i21 f30932h;
    private final kw i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aq0 f30933j;
    private final qg0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SelfieScannerInternalConfig.RandomnessLiveness f30934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SelfieScannerStep f30935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SelfieScannerError f30936n;
    private SelfieScannerWarning o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f30937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Pair f30938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final MutableSharedFlow f30939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Flow f30940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f30941t;
    private Job u;
    private int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Job f30942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Job f30943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Job f30944y;
    private Job z;

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
            int[] iArr = new int[SelfieScannerStep.values().length];
            try {
                iArr[SelfieScannerStep.SELFIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieScannerStep.ORCHESTRATED_LIVENESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieScannerStep.HAND_MOVEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
        public c(Object obj2) {
            super(1, 0, m21.class, obj2, "onRandomnessLivenessEvent", "onRandomnessLivenessEvent(Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;)V");
        }

        public final void a(SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((m21) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent) obj2);
            return Unit.f186387a;
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f30951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f30952c;
        int d;
        int e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f30953g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, Continuation continuation) {
            super(2, continuation);
            this.f30953g = i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m21.this.new e(this.f30953g, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            List<Integer> sessionRandomnessLivenessSteps;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.e;
            if (i == 0) {
                yhm.o.b(obj2);
                m21.this.f().a(new vk1(1));
                Pair pair = m21.this.f30938q;
                if (pair != null) {
                    m21 m21Var = m21.this;
                    int i2 = this.f30953g;
                    m21Var.f30938q = Pair.a(pair, new Integer(i2 + 1), null, 2);
                    SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = m21Var.f30934l;
                    if (randomnessLiveness != null && (sessionRandomnessLivenessSteps = randomnessLiveness.getSessionRandomnessLivenessSteps()) != null) {
                        int iIntValue = sessionRandomnessLivenessSteps.get(i2).intValue();
                        m21Var.g().a(new eo1(m21Var, iIntValue, pair));
                        this.f30950a = null;
                        this.f30951b = 0;
                        this.f30952c = iIntValue;
                        this.d = 0;
                        this.e = 1;
                        if (skm.k0.b(1000L, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            m21.this.f30944y = null;
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final z11 a() {
            return new z11.d(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c21 a(m21 m21Var, int i, Pair pair, c21 c21Var) {
            Pair pair2 = m21Var.f30938q;
            Integer numValueOf = pair2 != null ? Integer.valueOf(i51.a(pair2)) : null;
            Pair pair3 = m21Var.f30938q;
            return Intrinsics.f(numValueOf, pair3 != null ? Integer.valueOf(i51.b(pair3)) : null) ? m21Var.d.c(i) : m21Var.d.a(i, pair);
        }
    }

    public static final class f extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30954a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30956c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, Continuation continuation) {
            super(2, continuation);
            this.f30956c = i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m21.this.new f(this.f30956c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30954a;
            if (i == 0) {
                yhm.o.b(obj2);
                Job job2 = m21.this.f30944y;
                if (job2 != null) {
                    this.f30954a = 1;
                    if (job2.u(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            Pair pair = m21.this.f30938q;
            if (pair != null) {
                m21 m21Var = m21.this;
                int i2 = this.f30956c;
                m21Var.a(m21Var.d.a(pair, i2));
                m21Var.d(i2);
                m21Var.f30943x = null;
            }
            return Unit.f186387a;
        }
    }

    public static final class g extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30957a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SelfieScannerResult f30959c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SelfieScannerResult selfieScannerResult, Continuation continuation) {
            super(2, continuation);
            this.f30959c = selfieScannerResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final z11 b() {
            return new z11.d(null, 1, 0 == true ? 1 : 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m21.this.new g(this.f30959c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30957a;
            if (i == 0) {
                yhm.o.b(obj2);
                if (m21.this.e() instanceof c21.b.a) {
                    m21.this.f().a(new vk1(2));
                    m21.this.g().a(new lp1(m21.this, 0));
                    this.f30957a = 1;
                    if (skm.k0.b(500L, this) == aVar) {
                        return aVar;
                    }
                } else if (!m21.this.j()) {
                    m21.this.f().a(new vk1(3));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            m21.this.f30932h.a(this.f30959c);
            m21.this.g().a(new jn1(m21.this, this.f30959c, 3));
            if (m21.this.e) {
                m21.this.k.track(new y11.a.e(m21.this.f30935m));
            } else {
                m21.this.a(this.f30959c);
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final z11 a() {
            return new z11.d(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c21 a(m21 m21Var, c21 c21Var) {
            return m21Var.d.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c21 a(m21 m21Var, SelfieScannerResult selfieScannerResult, c21 c21Var) {
            return m21Var.d.a(selfieScannerResult.getImage());
        }
    }

    public static final class h extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30960a;

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m21.this.new h(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30960a;
            if (i == 0) {
                yhm.o.b(obj2);
                MutableSharedFlow mutableSharedFlow = m21.this.f30939r;
                SelfieScannerControl.RestartScanner restartScanner = SelfieScannerControl.RestartScanner.INSTANCE;
                this.f30960a = 1;
                if (mutableSharedFlow.emit(restartScanner, this) == aVar) {
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

    public static final class i extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30962a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30964c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i, Continuation continuation) {
            super(2, continuation);
            this.f30964c = i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m21.this.new i(this.f30964c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30962a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f30962a = 1;
                if (skm.k0.b(5000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            l21 l21Var = m21.this.d;
            m21.this.g().a(l21Var.a(this.f30964c));
            m21.this.d(this.f30964c);
            return Unit.f186387a;
        }
    }

    public static final class j extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30965a;

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m21.this.new j(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30965a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f30965a = 1;
                if (skm.k0.b(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            m21.this.o = null;
            m21.this.g().a(new mp1(m21.this.d, 0));
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c21 a(l21 l21Var, c21 c21Var) {
            return l21Var.b(c21Var);
        }
    }

    public static final class k extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30967a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c21.b.c f30969c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(c21.b.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f30969c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c21 a(c21.b.c cVar, c21 c21Var) {
            return cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c21 b(m21 m21Var, c21 c21Var) {
            return m21Var.d.r();
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m21.this.new k(this.f30969c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (skm.k0.b(1000, r8) == r0) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r8.f30967a
                r2 = 1000(0x3e8, double:4.94E-321)
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L1e
                if (r1 == r5) goto L1a
                if (r1 != r4) goto L12
                yhm.o.b(r9)
                goto L55
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                yhm.o.b(r9)
                goto L3b
            L1e:
                yhm.o.b(r9)
                com.fourthline.orca.internal.m21 r9 = com.fourthline.orca.internal.m21.this
                com.fourthline.orca.internal.mq0 r9 = r9.g()
                com.fourthline.orca.internal.m21 r1 = com.fourthline.orca.internal.m21.this
                com.fourthline.orca.internal.lp1 r6 = new com.fourthline.orca.internal.lp1
                r7 = 1
                r6.<init>(r1, r7)
                r9.a(r6)
                r8.f30967a = r5
                java.lang.Object r9 = skm.k0.b(r2, r8)
                if (r9 != r0) goto L3b
                goto L54
            L3b:
                com.fourthline.orca.internal.m21 r9 = com.fourthline.orca.internal.m21.this
                com.fourthline.orca.internal.mq0 r9 = r9.g()
                com.fourthline.orca.internal.m21 r1 = com.fourthline.orca.internal.m21.this
                com.fourthline.orca.internal.lp1 r5 = new com.fourthline.orca.internal.lp1
                r6 = 2
                r5.<init>(r1, r6)
                r9.a(r5)
                r8.f30967a = r4
                java.lang.Object r9 = skm.k0.b(r2, r8)
                if (r9 != r0) goto L55
            L54:
                return r0
            L55:
                com.fourthline.orca.internal.m21 r9 = com.fourthline.orca.internal.m21.this
                com.fourthline.orca.internal.mq0 r9 = r9.g()
                com.fourthline.orca.internal.c21$b$c r0 = r8.f30969c
                com.fourthline.orca.internal.np1 r1 = new com.fourthline.orca.internal.np1
                r2 = 0
                r1.<init>(r0, r2)
                r9.a(r1)
                kotlin.Unit r9 = kotlin.Unit.f186387a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.m21.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c21 a(m21 m21Var, c21 c21Var) {
            return m21Var.d.j();
        }
    }

    public static final class l extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30970a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c21.b.C0176b f30972c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(c21.b.C0176b c0176b, Continuation continuation) {
            super(2, continuation);
            this.f30972c = c0176b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c21 a(c21.b.C0176b c0176b, c21 c21Var) {
            return c0176b;
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m21.this.new l(this.f30972c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30970a;
            if (i == 0) {
                yhm.o.b(obj2);
                m21.this.g().a(new lp1(m21.this, 3));
                this.f30970a = 1;
                if (skm.k0.b(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            m21.this.g().a(new op1(this.f30972c, 0));
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c21 a(m21 m21Var, c21 c21Var) {
            return m21Var.d.j();
        }
    }

    public m21(mq0 presenter, wr effectHandler, l21 uiStateProvider, boolean z, fe1 viewNavigator, wd1 viewCompletionHandler, i21 repository, kw selfieErrorHandler, aq0 popupHandler, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(uiStateProvider, "uiStateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(selfieErrorHandler, "selfieErrorHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f30928a = coroutineScope;
        this.f30929b = presenter;
        this.f30930c = effectHandler;
        this.d = uiStateProvider;
        this.e = z;
        this.f = viewNavigator;
        this.f30931g = viewCompletionHandler;
        this.f30932h = repository;
        this.i = selfieErrorHandler;
        this.f30933j = popupHandler;
        this.k = analytics;
        this.f30934l = c();
        this.f30935m = SelfieScannerStep.SELFIE;
        this.f30937p = true;
        vkm.z1 z1VarB = vkm.q.b(0, 7, null);
        this.f30939r = z1VarB;
        this.f30940s = z1VarB;
        this.f30941t = new lp1(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final z11 A() {
        return new z11.d(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final z11 B() {
        return new z11.d(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21 a(c21.b.c cVar, c21 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z11 o() {
        return new z11.c(zhm.u.c("android.permission.CAMERA"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final z11 p() {
        return new z11.d(null, 1, 0 == true ? 1 : 0);
    }

    private final void q() {
        this.f30929b.a(this.d.o());
        Job job2 = this.f30942w;
        if (job2 != null) {
            job2.start();
        }
    }

    private final void r() {
        v();
    }

    private final void s() {
        c21 c21VarE = e();
        if (c21VarE instanceof c21.a) {
            m();
        } else {
            if (!(c21VarE instanceof c21.b)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("There is no positive button in this state (" + e() + ")");
        }
    }

    private final void t() {
        SelfieScannerError selfieScannerError = this.f30936n;
        if (selfieScannerError != null) {
            this.k.track(new y11.a.i(this.f30935m, selfieScannerError));
        }
        w();
    }

    private final void u() {
        this.k.track(y11.a.g.f35136b);
        v();
    }

    private final void v() {
        a();
        this.f30935m = SelfieScannerStep.SELFIE;
        this.f30937p = true;
        a(c());
        this.f30929b.a(new lp1(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        if (!d().getInternalConfig().getCameraX()) {
            a(z11.a.d.f35490a);
        } else {
            skm.e0.C(this, null, null, new h(null), 3);
            v();
        }
    }

    private final void x() {
        Job job2 = this.A;
        if (job2 != null) {
            job2.f(null);
        }
        this.A = skm.e0.C(this, null, null, new j(null), 3);
    }

    private final void y() {
        this.i.handleRecoverableError(ui0.c.f34105a, "selfie_scanner", new ko1(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z11 z() {
        return z11.b.f35491a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f30928a.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21 a(c21.b.C0176b c0176b, c21 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return c0176b;
    }

    private final void c(int i2) {
        this.f30943x = skm.e0.C(this, null, null, new f(i2, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c21 e() {
        return (c21) this.f30929b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return this.f30934l != null;
    }

    private final void k() {
        c21 c21VarE = e();
        if (c21VarE instanceof c21.a) {
            t();
        } else {
            if (!(c21VarE instanceof c21.b)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("There is no negative button in this state (" + e() + ")");
        }
    }

    private final void l() {
        this.f30929b.a(this.d.p());
    }

    private final void m() {
        this.k.track(new y11.a.d(this.f30935m));
        SelfieScannerResult selfieScannerResultA = this.f30932h.a();
        if (selfieScannerResultA == null) {
            throw new IllegalStateException("selfieScannerResult is missing from repository");
        }
        a(selfieScannerResultA);
    }

    private final void n() {
        this.k.track(new y11.a.f(this.f30935m));
        c21 c21VarE = e();
        c21.a.C0175a c0175a = c21VarE instanceof c21.a.C0175a ? (c21.a.C0175a) c21VarE : null;
        if ((c0175a != null ? c0175a.r() : null) != null) {
            l();
        } else {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(m21 m21Var) {
        m21Var.k.track(y11.a.c.f35132b);
        m21Var.f30930c.a(new wn1(23));
        return Unit.f186387a;
    }

    public final wr f() {
        return this.f30930c;
    }

    public final mq0 g() {
        return this.f30929b;
    }

    public final Flow h() {
        return this.f30940s;
    }

    public final Function1 i() {
        return this.f30941t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21 b(m21 m21Var, c21 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return m21Var.d.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21 c(m21 m21Var, c21 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return (c21) m21Var.d.getInitialState();
    }

    public final SelfieScannerConfig d() {
        SelfieScannerConfig selfieScannerConfigC = this.f30932h.c();
        selfieScannerConfigC.setInternalConfig(SelfieScannerInternalConfig.copy$default(selfieScannerConfigC.getInternalConfig(), null, false, null, this.f30934l, 7, null));
        return selfieScannerConfigC;
    }

    private final void b(int i2) {
        a((Job) null);
        this.f30944y = skm.e0.C(this, null, null, new e(i2, null), 3);
    }

    private final SelfieScannerInternalConfig.RandomnessLiveness c() {
        List listA;
        oy0 oy0VarB = this.f30932h.b();
        if (oy0VarB == null || (listA = oy0VarB.a(2)) == null) {
            return null;
        }
        return new SelfieScannerInternalConfig.RandomnessLiveness(listA, new c(this));
    }

    private final void b(SelfieScannerResult selfieScannerResult) {
        a();
        skm.e0.C(this, null, null, new g(selfieScannerResult, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i2) {
        a(skm.e0.C(this, null, skm.d0.LAZY, new i(i2, null), 1));
    }

    private final void b() {
        this.f30937p = false;
        a(z11.a.C0320a.f35485a);
    }

    private final void b(SelfieScannerError selfieScannerError) {
        a();
        this.i.handleError(new ui0.d(selfieScannerError), "selfie_scanner");
    }

    private final void a(SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness) {
        this.f30934l = randomnessLiveness;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(m21 m21Var, SelfieScannerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof SelfieScannerEvent.OnFail) {
            m21Var.a(((SelfieScannerEvent.OnFail) event).getError());
        } else if (event instanceof SelfieScannerEvent.OnStepUpdate) {
            m21Var.a(((SelfieScannerEvent.OnStepUpdate) event).getStep());
        } else if (event instanceof SelfieScannerEvent.OnSuccess) {
            m21Var.b(((SelfieScannerEvent.OnSuccess) event).getResult());
        } else {
            if (!(event instanceof SelfieScannerEvent.OnWarnings)) {
                throw new NoWhenBranchMatchedException();
            }
            m21Var.a(((SelfieScannerEvent.OnWarnings) event).getWarnings());
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(a21 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a21.f) {
            s();
            return;
        }
        if (event instanceof a21.a) {
            k();
            return;
        }
        if (event instanceof a21.c) {
            n();
            return;
        }
        if (event instanceof a21.h) {
            u();
            return;
        }
        if (event instanceof a21.g) {
            a(((a21.g) event).a());
            return;
        }
        if (event instanceof a21.d) {
            a(((a21.d) event).a());
        } else if (event instanceof a21.b) {
            l();
        } else {
            if (!(event instanceof a21.e)) {
                throw new NoWhenBranchMatchedException();
            }
            q();
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30945a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SelfieScannerResult f30947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SelfieScannerResult selfieScannerResult, Continuation continuation) {
            super(2, continuation);
            this.f30947c = selfieScannerResult;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m21.this.new d(this.f30947c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
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
                int r1 = r5.f30945a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r6)
                goto L49
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                yhm.o.b(r6)
                goto L35
            L1c:
                yhm.o.b(r6)
                com.fourthline.orca.internal.m21 r6 = com.fourthline.orca.internal.m21.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.m21.j(r6)
                com.fourthline.orca.internal.b21 r1 = new com.fourthline.orca.internal.b21
                com.fourthline.vision.selfie.SelfieScannerResult r4 = r5.f30947c
                r1.<init>(r4)
                r5.f30945a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L35
                goto L48
            L35:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.m21$d$a r1 = new com.fourthline.orca.internal.m21$d$a
                com.fourthline.orca.internal.m21 r3 = com.fourthline.orca.internal.m21.this
                com.fourthline.vision.selfie.SelfieScannerResult r4 = r5.f30947c
                r1.<init>(r3, r4)
                r5.f30945a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L49
            L48:
                return r0
            L49:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.m21.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m21 f30948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SelfieScannerResult f30949b;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.m21$d$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0246a extends kotlin.jvm.internal.q implements Function0 {
                public C0246a(Object obj2) {
                    super(0, 0, m21.class, obj2, "restart", "restart()V");
                }

                public final void a() {
                    ((m21) this.receiver).w();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return Unit.f186387a;
                }
            }

            public a(m21 m21Var, SelfieScannerResult selfieScannerResult) {
                this.f30948a = m21Var;
                this.f30949b = selfieScannerResult;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function0] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d) && !(xd1Var instanceof xd1.c)) {
                    if (xd1Var instanceof xd1.a) {
                        m21 m21Var = this.f30948a;
                        Object objA = ((xd1.a) xd1Var).a();
                        l01 l01Var = (l01) (objA instanceof l01 ? objA : null);
                        if (l01Var == null) {
                            throw new IllegalStateException(objA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        m21Var.a(new z11.a.c(l01Var, this.f30949b));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        xd1.b bVar = (xd1.b) xd1Var;
                        hq0.c cVar = new hq0.c(bVar.a(), "selfie_scanner", null, 4, null);
                        kh0 kh0VarA = bVar.a();
                        if (kh0VarA instanceof ui0.b) {
                            rj1Var = new C0246a(this.f30948a);
                        } else if ((kh0VarA instanceof re1.a) || (kh0VarA instanceof re1.c)) {
                            rj1Var = new rj1(this.f30948a, this.f30949b, 8);
                        }
                        aq0.a(this.f30948a.f30933j, cVar, rj1Var, null, 4, null);
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(m21 m21Var, SelfieScannerResult selfieScannerResult) {
                m21Var.a(selfieScannerResult);
                return Unit.f186387a;
            }
        }
    }

    private final void a(Map map) {
        if (Intrinsics.f(map.get("android.permission.CAMERA"), Boolean.TRUE)) {
            this.k.track(y11.a.b.f35131b);
        } else {
            this.k.track(y11.a.C0312a.f35130b);
            y();
        }
    }

    private final void a(SelfieScannerStep selfieScannerStep) {
        a();
        this.f30935m = selfieScannerStep;
        this.f30936n = null;
        int i2 = b.$EnumSwitchMapping$0[selfieScannerStep.ordinal()];
        if (i2 == 1) {
            this.f30929b.a(new lp1(this, 7));
            return;
        }
        if (i2 == 2) {
            if (j()) {
                return;
            }
            a(this.d.h());
        } else if (i2 == 3) {
            if (j()) {
                return;
            }
            a(this.d.f());
        } else if (i2 != 4) {
            if (i2 == 5) {
                this.f30929b.a(new lp1(this, 6));
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21 a(m21 m21Var, c21 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return m21Var.d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(SelfieScannerResult selfieScannerResult) {
        this.k.track(y11.a.j.f35140b);
        skm.e0.C(this, null, null, new d(selfieScannerResult, null), 3);
    }

    private final void a(c21.b.C0176b c0176b) {
        Job job2 = this.u;
        if (job2 != null) {
            job2.f(null);
        }
        this.f30930c.a(new wn1(24));
        if (e() instanceof c21.b.C0176b) {
            this.f30929b.a(new op1(c0176b, 1));
        } else {
            this.u = skm.e0.C(this, null, null, new l(c0176b, null), 3);
        }
    }

    private final void a(Bitmap bitmap) {
        this.k.track(y11.a.h.f35137b);
        this.f30929b.a(this.d.a(bitmap));
    }

    private final void a(List list) {
        if (this.o == null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((SelfieScannerWarning) obj2) != SelfieScannerWarning.DEVICE_NOT_STEADY) {
                    arrayList.add(obj2);
                }
            }
            SelfieScannerWarning selfieScannerWarning = (SelfieScannerWarning) zhm.d0.d0(arrayList);
            if (selfieScannerWarning != null) {
                this.o = selfieScannerWarning;
                this.f30929b.a(new jn1(this, selfieScannerWarning, 14));
            }
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c21 a(m21 m21Var, SelfieScannerWarning selfieScannerWarning, c21 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return m21Var.d.a(selfieScannerWarning);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent randomnessLivenessEvent) {
        if (randomnessLivenessEvent instanceof SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnHeadMoved) {
            a(((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnHeadMoved) randomnessLivenessEvent).getMetadata());
            return;
        }
        if (randomnessLivenessEvent instanceof SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepCountUpdate) {
            a(((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepCountUpdate) randomnessLivenessEvent).getCount());
        } else if (randomnessLivenessEvent instanceof SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepSuccess) {
            b(((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepSuccess) randomnessLivenessEvent).getIndex());
        } else {
            if (!(randomnessLivenessEvent instanceof SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate)) {
                throw new NoWhenBranchMatchedException();
            }
            c(((SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate) randomnessLivenessEvent).getDirection());
        }
    }

    private final void a(HeadMetadata headMetadata) {
        l21 l21Var = this.d;
        Job job2 = this.f30943x;
        if ((job2 == null || job2.isCompleted()) && this.f30944y == null) {
            Integer direction = headMetadata.getDirection();
            if (direction != null) {
                this.v = direction.intValue();
            }
            this.f30929b.a(l21Var.a(direction, headMetadata.getYaw(), headMetadata.getPitch()));
        }
    }

    private final void a(int i2) {
        this.f30938q = new Pair(0, Integer.valueOf(i2));
    }

    private final void a(Job job2) {
        Job job3 = this.f30942w;
        if (job3 != null) {
            job3.f(null);
        }
        this.f30942w = job2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(c21.b.c cVar) {
        Job job2 = this.z;
        if (job2 != null) {
            job2.f(null);
        }
        c21 c21VarE = e();
        if (c21VarE instanceof c21.b.d) {
            this.f30930c.a(new wn1(27));
            this.z = skm.e0.C(this, null, null, new k(cVar, null), 3);
        } else if (c21VarE instanceof c21.b.c) {
            this.f30929b.a(new np1(cVar, 1));
        }
    }

    private final void a(SelfieScannerError selfieScannerError) {
        a();
        this.f30936n = selfieScannerError;
        if (selfieScannerError == SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED) {
            this.f30930c.a(new wn1(25));
        } else if (this.f30937p) {
            this.f30930c.a(new wn1(26));
            b(selfieScannerError);
        }
    }

    public final void a() {
        Job job2 = this.A;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = this.u;
        if (job3 != null) {
            job3.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(z11.a aVar) {
        this.f.b(aVar);
        r();
    }
}
