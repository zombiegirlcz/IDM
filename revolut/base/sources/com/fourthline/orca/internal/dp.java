package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.ho;
import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.jo;
import com.fourthline.orca.internal.lo;
import com.fourthline.orca.internal.si;
import com.fourthline.orca.internal.u41;
import com.fourthline.orca.internal.xd1;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.compose.DocumentScannerControl;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.fourthline.vision.document.compose.DocumentScannerInternalConfig;
import com.fourthline.vision.internal.VisionDocumentScannerFeatureConfig;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
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
public final class dp implements ax, CoroutineScope {
    public static final a C = new a(null);
    public static final int D = 8;
    private final Function1 A;
    private Job B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f27841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f27842c;
    private final to d;
    private final vo e;
    private final yo f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u41 f27843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qd1 f27844h;
    private final wd1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kw f27845j;
    private final fe1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final qg0 f27846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final aq0 f27847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final vp0 f27848n;
    private final oo o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final DocumentScannerInternalConfig f27849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Pair f27850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f27851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f27852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f27853t;
    private boolean u;
    private DocumentScannerStep v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private DocumentScannerStepWarning f27854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private DocumentScannerStepResult f27855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final MutableSharedFlow f27856y;
    private final Flow z;

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
            int[] iArr = new int[DocumentValidationError.values().length];
            try {
                iArr[DocumentValidationError.DOCUMENT_TYPE_NOT_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentValidationError.DOCUMENT_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentValidationError.DOCUMENT_TYPE_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentValidationError.ISSUING_COUNTRY_NOT_SUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentValidationError.NATIONALITY_NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentValidationError.PERSON_NOT_ADULT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentValidationError.MRZ_NOT_VALID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentValidationError.MRZ_NOT_DETECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentValidationError.PHOTO_DETECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DocumentValidationError.PHOTO_NOT_DETECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27857a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ko f27859c;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ dp f27860a;

            public a(dp dpVar) {
                this.f27860a = dpVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d) && !(xd1Var instanceof xd1.c)) {
                    if (!(xd1Var instanceof xd1.a)) {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wz.a("Unexpected state during Document Scanner: %" + ((xd1.b) xd1Var).a().getAlias());
                        throw new KotlinNothingValueException();
                    }
                    this.f27860a.a(new io.a.d(((xd1.a) xd1Var).a()));
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ko koVar, Continuation continuation) {
            super(2, continuation);
            this.f27859c = koVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dp.this.new c(this.f27859c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r5).collect(r1, r4) == r0) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r4.f27857a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r5)
                goto L42
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                yhm.o.b(r5)
                goto L30
            L1c:
                yhm.o.b(r5)
                com.fourthline.orca.internal.dp r5 = com.fourthline.orca.internal.dp.this
                com.fourthline.orca.internal.wd1 r5 = com.fourthline.orca.internal.dp.h(r5)
                com.fourthline.orca.internal.ko r1 = r4.f27859c
                r4.f27857a = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L30
                goto L41
            L30:
                kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
                com.fourthline.orca.internal.dp$c$a r1 = new com.fourthline.orca.internal.dp$c$a
                com.fourthline.orca.internal.dp r3 = com.fourthline.orca.internal.dp.this
                r1.<init>(r3)
                r4.f27857a = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.Unit r5 = kotlin.Unit.f186387a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.dp.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27861a;

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
            return dp.this.new d(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27861a;
            if (i == 0) {
                yhm.o.b(obj2);
                MutableSharedFlow mutableSharedFlow = dp.this.f27856y;
                DocumentScannerControl.MoveToNextStep moveToNextStep = DocumentScannerControl.MoveToNextStep.INSTANCE;
                this.f27861a = 1;
                if (mutableSharedFlow.emit(moveToNextStep, this) == aVar) {
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

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27863a;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dp.this.new e(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27863a;
            if (i == 0) {
                yhm.o.b(obj2);
                MutableSharedFlow mutableSharedFlow = dp.this.f27856y;
                DocumentScannerControl.StartScanner startScanner = DocumentScannerControl.StartScanner.INSTANCE;
                this.f27863a = 1;
                if (mutableSharedFlow.emit(startScanner, this) == aVar) {
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

    public static final class f extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27865a;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dp.this.new f(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27865a;
            if (i == 0) {
                yhm.o.b(obj2);
                MutableSharedFlow mutableSharedFlow = dp.this.f27856y;
                DocumentScannerControl.TakeSnapshot takeSnapshot = DocumentScannerControl.TakeSnapshot.INSTANCE;
                this.f27865a = 1;
                if (mutableSharedFlow.emit(takeSnapshot, this) == aVar) {
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

    public static final class g extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27867a;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dp.this.new g(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27867a;
            if (i == 0) {
                yhm.o.b(obj2);
                MutableSharedFlow mutableSharedFlow = dp.this.f27856y;
                DocumentScannerControl.RestartScanner restartScanner = DocumentScannerControl.RestartScanner.INSTANCE;
                this.f27867a = 1;
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

    public static final class h extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27869a;

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
            return dp.this.new h(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27869a;
            if (i == 0) {
                yhm.o.b(obj2);
                MutableSharedFlow mutableSharedFlow = dp.this.f27856y;
                DocumentScannerControl.ResetCurrentStep resetCurrentStep = DocumentScannerControl.ResetCurrentStep.INSTANCE;
                this.f27869a = 1;
                if (mutableSharedFlow.emit(resetCurrentStep, this) == aVar) {
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
        int f27871a;

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dp.this.new i(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27871a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f27871a = 1;
                if (skm.k0.b(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            dp.this.f27854w = null;
            dp.this.h().a(yo.b(dp.this.j(), dp.this.v, dp.this.f27850q, false, dp.this.u && dp.this.f27853t, dp.this.e().e(), 4, null));
            return Unit.f186387a;
        }
    }

    public static final class j extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27873a;

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
            return dp.this.new j(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27873a;
            if (i == 0) {
                yhm.o.b(obj2);
                dp dpVar = dp.this;
                this.f27873a = 1;
                if (dpVar.a(this) == aVar) {
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

    public static final class k extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27875a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27877c;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f27875a = obj2;
            this.f27877c |= Integer.MIN_VALUE;
            return dp.this.a(this);
        }
    }

    public static final /* synthetic */ class l extends kotlin.jvm.internal.q implements Function0 {
        public l(Object obj2) {
            super(0, 0, dp.class, obj2, "onDocumentReadyPrimaryButtonClicked", "onDocumentReadyPrimaryButtonClicked()V");
        }

        public final void a() {
            ((dp) this.receiver).q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class m extends kotlin.jvm.internal.q implements Function0 {
        public m(Object obj2) {
            super(0, 0, dp.class, obj2, "onDocumentReadySecondaryButtonClicked", "onDocumentReadySecondaryButtonClicked()V");
        }

        public final void a() {
            ((dp) this.receiver).r();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final class n extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27878a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DocumentScannerError f27880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(DocumentScannerError documentScannerError, Continuation continuation) {
            super(2, continuation);
            this.f27880c = documentScannerError;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dp.this.new n(this.f27880c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27878a;
            if (i == 0) {
                yhm.o.b(obj2);
                vp0 vp0Var = dp.this.f27848n;
                if (vp0Var != null) {
                    vp0Var.a();
                }
                this.f27878a = 1;
                if (skm.k0.b(50L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            if (this.f27880c != DocumentScannerError.SCANNER_INTERRUPTED) {
                dp.this.g().a(new vk1(0));
            }
            dp.this.f27845j.handleRecoverableError(new si.f(this.f27880c), "document_scanner", new wk1(dp.this, 0));
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final io a() {
            return io.d.f29656a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a(dp dpVar) {
            dpVar.z();
            return Unit.f186387a;
        }
    }

    public static final class o extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27881a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f27883c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f27883c = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dp.this.new o(this.f27883c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27881a;
            if (i == 0) {
                yhm.o.b(obj2);
                dp.this.h().a(yo.b(dp.this.j(), dp.this.v, dp.this.f27850q, true, false, false, 24, null));
                this.f27881a = 1;
                if (skm.k0.b(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            this.f27883c.invoke();
            return Unit.f186387a;
        }
    }

    public static final class p extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u41 f27885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ dp f27886c;
        final /* synthetic */ DocumentScannerStepResult d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(u41 u41Var, dp dpVar, DocumentScannerStepResult documentScannerStepResult, Continuation continuation) {
            super(2, continuation);
            this.f27885b = u41Var;
            this.f27886c = dpVar;
            this.d = documentScannerStepResult;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new p(this.f27885b, this.f27886c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27884a;
            if (i == 0) {
                yhm.o.b(obj2);
                u41 u41Var = this.f27885b;
                dp dpVar = this.f27886c;
                oo ooVar = dpVar.o;
                dp dpVar2 = this.f27886c;
                g51 g51VarA = ooVar.a(dpVar2, this.d, dpVar2.d.a(), dpVar2.v);
                this.f27884a = 1;
                obj2 = u41Var.a(dpVar, g51VarA, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            u41.a aVar2 = (u41.a) obj2;
            if (aVar2 == u41.a.f33954b) {
                oo ooVar2 = this.f27886c.o;
                dp dpVar3 = this.f27886c;
                ooVar2.a(dpVar3, aVar2, dpVar3.v);
                if (this.f27886c.d.p()) {
                    this.f27886c.l();
                } else {
                    dp dpVar4 = this.f27886c;
                    dpVar4.a(this.d, new wk1(dpVar4, 1));
                }
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a(dp dpVar) {
            dpVar.l();
            return Unit.f186387a;
        }
    }

    public dp(mq0 presenter, wr effectHandler, to repository, vo resultRepository, yo stateProvider, u41 stepConfirmationHandler, qd1 videoRecordingHandler, wd1 viewCompletionHandler, kw documentErrorHandler, fe1 viewNavigator, qg0 analytics, aq0 popupHandler, vp0 vp0Var, oo featurePilotHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(stepConfirmationHandler, "stepConfirmationHandler");
        Intrinsics.checkNotNullParameter(videoRecordingHandler, "videoRecordingHandler");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(documentErrorHandler, "documentErrorHandler");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(featurePilotHandler, "featurePilotHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27840a = coroutineScope;
        this.f27841b = presenter;
        this.f27842c = effectHandler;
        this.d = repository;
        this.e = resultRepository;
        this.f = stateProvider;
        this.f27843g = stepConfirmationHandler;
        this.f27844h = videoRecordingHandler;
        this.i = viewCompletionHandler;
        this.f27845j = documentErrorHandler;
        this.k = viewNavigator;
        this.f27846l = analytics;
        this.f27847m = popupHandler;
        this.f27848n = vp0Var;
        this.o = featurePilotHandler;
        this.f27849p = new DocumentScannerInternalConfig(repository.r(), repository.g(), new VisionDocumentScannerFeatureConfig(false, false, VisionDocumentScannerFeatureConfig.AutoDetectMode.UserAssist, featurePilotHandler instanceof d31 ? (d31) featurePilotHandler : null, 3, null));
        this.f27851r = true;
        this.f27852s = true;
        this.u = true;
        this.v = stateProvider.v();
        vkm.z1 z1VarB = vkm.q.b(0, 7, null);
        this.f27856y = z1VarB;
        this.z = z1VarB;
        this.A = new uk1(this, 1);
    }

    private final void A() {
        a();
        this.f27843g.reset();
        this.f.k();
        this.f27852s = true;
        DocumentScannerStep documentScannerStepV = this.f.v();
        this.v = documentScannerStepV;
        this.f27850q = null;
        this.f27841b.a(yo.b(this.f, documentScannerStepV, null, false, this.u && this.f27853t, false, 20, null));
    }

    private final void C() {
        Job job2 = this.B;
        if (job2 != null) {
            job2.f(null);
        }
        this.B = skm.e0.C(this, null, null, new i(null), 3);
    }

    private final void D() {
        if (d().getShouldStartAutomatically()) {
            this.f27841b.a(new uk1(this, 0));
        } else {
            skm.e0.C(this, null, null, new j(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io E() {
        return io.d.f29656a;
    }

    private final void F() {
        DocumentScannerStep documentScannerStepCopy$default = DocumentScannerStep.copy$default(this.v, 0, null, false, false, 7, null);
        this.v = documentScannerStepCopy$default;
        this.f27841b.a(yo.b(this.f, documentScannerStepCopy$default, this.f27850q, false, this.u && this.f27853t, e().e(), 4, null));
    }

    private final void o() {
        this.f27846l.track(new ho.a.d(this.v));
        DocumentScannerStepResult documentScannerStepResult = this.f27855x;
        if (documentScannerStepResult != null) {
            c(documentScannerStepResult);
            return;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentScannerStepResult + " must not be null."))).toString());
    }

    private final void p() {
        this.f27846l.track(new ho.a.f(this.v));
        lo loVarE = e();
        lo.b bVar = loVarE instanceof lo.b ? (lo.b) loVarE : null;
        if ((bVar != null ? bVar.r() : null) != null) {
            n();
        } else {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io s() {
        return new io.c(zhm.u.c("android.permission.CAMERA"));
    }

    private final void t() {
        this.f27841b.a(this.f.x());
    }

    private final void u() {
        if (this.f27851r) {
            this.f27851r = false;
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io v() {
        return io.b.f29654a;
    }

    private final void w() {
        this.f27846l.track(new ho.a.k(this.v));
        B();
    }

    private final void x() {
        this.u = false;
        this.f27841b.a(this.f.d(false));
        skm.e0.C(this, null, null, new f(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        skm.e0.C(this, null, null, new g(null), 3);
        A();
    }

    public final void B() {
        this.f.k();
        skm.e0.C(this, null, null, new h(null), 3);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f27840a.getF74819h();
    }

    public final void y() {
        this.f27853t = false;
        this.f27852s = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo c(dp dpVar, lo present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return dpVar.f.getInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lo e() {
        return (lo) this.f27841b.b();
    }

    private final void m() {
        if (this.f27851r) {
            this.f27851r = false;
            w();
        }
    }

    private final void n() {
        this.f27841b.a(this.f.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        skm.e0.C(this, null, null, new e(null), 3);
        this.f.k();
        this.f27841b.a(new uk1(this, 2));
    }

    public final DocumentScannerConfig d() {
        DocumentScannerConfig documentScannerConfigK = this.d.k();
        documentScannerConfigK.setInternalConfig(this.f27849p);
        return documentScannerConfigK;
    }

    public final DocumentType f() {
        return this.d.k().getType();
    }

    public final wr g() {
        return this.f27842c;
    }

    public final mq0 h() {
        return this.f27841b;
    }

    public final Flow i() {
        return this.z;
    }

    public final yo j() {
        return this.f;
    }

    public final Function1 k() {
        return this.A;
    }

    public final Job l() {
        return skm.e0.C(this, null, null, new d(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo b(dp dpVar, lo present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return dpVar.f.getInitialState();
    }

    private final void c() {
        this.f27841b.a(new uk1(this, 3));
    }

    private final void d(DocumentScannerStepResult documentScannerStepResult) {
        this.f27851r = true;
        this.f27846l.track(new ho.a.e(this.v));
        this.f27841b.a(new jn1(this, documentScannerStepResult, 7));
    }

    private final void b(DocumentScannerStepResult documentScannerStepResult) {
        a();
        DocumentValidationError documentValidationErrorA = this.o.a(documentScannerStepResult);
        if (documentValidationErrorA != null) {
            a(documentValidationErrorA);
        } else {
            a(documentScannerStepResult);
        }
    }

    private final void c(DocumentScannerStepResult documentScannerStepResult) {
        skm.e0.C(this, null, null, new p(this.f27843g, this, documentScannerStepResult, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(dp dpVar) {
        dpVar.b(DocumentScannerError.UNKNOWN);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(dp dpVar) {
        dpVar.f27846l.track(ho.a.c.f29350b);
        dpVar.f27842c.a(new pj1(25));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(dp dpVar, DocumentScannerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof DocumentScannerEvent.OnFail) {
            dpVar.a(((DocumentScannerEvent.OnFail) event).getError());
        } else if (event instanceof DocumentScannerEvent.OnStepFail) {
            dpVar.a(((DocumentScannerEvent.OnStepFail) event).getError());
        } else if (event instanceof DocumentScannerEvent.OnStepSuccess) {
            dpVar.b(((DocumentScannerEvent.OnStepSuccess) event).getResult());
        } else if (event instanceof DocumentScannerEvent.OnStepUpdate) {
            dpVar.a(((DocumentScannerEvent.OnStepUpdate) event).getStep());
        } else if (event instanceof DocumentScannerEvent.OnStepsCountUpdate) {
            dpVar.a(((DocumentScannerEvent.OnStepsCountUpdate) event).getCount());
        } else if (event instanceof DocumentScannerEvent.OnSuccess) {
            dpVar.a(((DocumentScannerEvent.OnSuccess) event).getResult());
        } else {
            if (!(event instanceof DocumentScannerEvent.OnWarnings)) {
                throw new NoWhenBranchMatchedException();
            }
            dpVar.a(((DocumentScannerEvent.OnWarnings) event).getWarnings());
        }
        return Unit.f186387a;
    }

    private final void b(DocumentScannerError documentScannerError) {
        skm.e0.C(this, null, null, new n(documentScannerError, null), 3);
    }

    private final void b() {
        this.f27852s = false;
        a(io.a.C0218a.f29649a);
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(jo event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof jo.i) {
            x();
            return;
        }
        if (event instanceof jo.f) {
            u();
            return;
        }
        if (event instanceof jo.a) {
            m();
            return;
        }
        if (event instanceof jo.c) {
            p();
            return;
        }
        if (event instanceof jo.h) {
            a(((jo.h) event).a());
            return;
        }
        if (event instanceof jo.g) {
            a(((jo.g) event).a());
            return;
        }
        if (event instanceof jo.e) {
            t();
        } else if (event instanceof jo.d) {
            a(((jo.d) event).a());
        } else {
            if (!(event instanceof jo.b)) {
                throw new NoWhenBranchMatchedException();
            }
            n();
        }
    }

    private final void a(Bitmap bitmap) {
        this.f27846l.track(ho.a.j.f29360b);
        this.f27841b.a(this.f.a(bitmap));
    }

    private final void a(boolean z) {
        this.f27846l.track(ho.a.i.f29359b);
        c();
        if (z) {
            D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo a(dp dpVar, lo present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        lo loVarE = dpVar.e();
        if (!(loVarE instanceof lo.c.a)) {
            return present;
        }
        lo.c.a aVar = (lo.c.a) loVarE;
        return aVar.a((15871 & 1) != 0 ? aVar.f30702a : null, (15871 & 2) != 0 ? aVar.f30703b : null, (15871 & 4) != 0 ? aVar.f30704c : null, (15871 & 8) != 0 ? aVar.d : true, (15871 & 16) != 0 ? aVar.e : null, (15871 & 32) != 0 ? aVar.f : null, (15871 & 64) != 0 ? aVar.f30705g : null, (15871 & 128) != 0 ? aVar.f30706h : null, (15871 & 256) != 0 ? aVar.i : null, (15871 & 512) != 0 ? aVar.f30707j : null, (15871 & 1024) != 0 ? aVar.k : null, (15871 & 2048) != 0 ? aVar.f30708l : false, (15871 & 4096) != 0 ? aVar.f30709m : false, (15871 & 8192) != 0 ? aVar.f30710n : null);
    }

    private final void a(Map map) {
        if (Intrinsics.f(map.get("android.permission.CAMERA"), Boolean.TRUE)) {
            this.f27846l.track(ho.a.b.f29349b);
            D();
        } else {
            if (!map.isEmpty()) {
                this.f27846l.track(ho.a.C0212a.f29348b);
                this.f27845j.handleRecoverableError(new si.d(zhm.d0.d1(map.keySet())), "document_scanner", new wk1(this, 2));
                return;
            }
            throw new IllegalStateException("Developer error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.dp.k
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.dp$k r0 = (com.fourthline.orca.internal.dp.k) r0
            int r1 = r0.f27877c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27877c = r1
            goto L18
        L13:
            com.fourthline.orca.internal.dp$k r0 = new com.fourthline.orca.internal.dp$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27875a
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f27877c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            com.fourthline.orca.internal.to r7 = r6.d
            com.fourthline.orca.internal.en r7 = r7.f()
            long r4 = r7.b()
            r0.f27877c = r3
            java.lang.Object r7 = skm.k0.b(r4, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            com.fourthline.orca.internal.aq0 r7 = r6.f27847m
            com.fourthline.orca.internal.lo$a r0 = com.fourthline.orca.internal.lo.a.f30691a
            com.fourthline.orca.internal.dp$l r1 = new com.fourthline.orca.internal.dp$l
            r1.<init>(r6)
            com.fourthline.orca.internal.dp$m r2 = new com.fourthline.orca.internal.dp$m
            r2.<init>(r6)
            r7.a(r0, r1, r2)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.dp.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void a(int i2) {
        this.f27850q = new Pair(0, Integer.valueOf(i2));
    }

    private final void a(DocumentScannerStep documentScannerStep) {
        Pair pair = this.f27850q;
        Pair pairA = pair != null ? Pair.a(pair, Integer.valueOf(documentScannerStep.getIndex()), null, 2) : null;
        this.f27850q = pairA;
        this.f27853t = true;
        this.u = true;
        this.v = documentScannerStep;
        this.f27841b.a(yo.b(this.f, documentScannerStep, pairA, false, true, e().e(), 4, null));
    }

    private final void a(List list) {
        if (!list.contains(DocumentScannerStepWarning.RECOGNITION_MODELS_NOT_DOWNLOADED) && !list.contains(DocumentScannerStepWarning.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE)) {
            if (this.f27854w == null) {
                DocumentScannerStepWarning documentScannerStepWarning = (DocumentScannerStepWarning) zhm.d0.d0(list);
                this.f27854w = documentScannerStepWarning;
                this.f27841b.a(this.f.a(this.v, documentScannerStepWarning));
                C();
                return;
            }
            return;
        }
        if (this.v.isAutoDetectAvailable()) {
            F();
        }
    }

    private final void a(DocumentScannerStepError documentScannerStepError) {
        wz.a("Should not happen!", new wk1(this, 3));
    }

    private final void a(DocumentScannerStepResult documentScannerStepResult) {
        this.f27855x = documentScannerStepResult;
        if (this.d.p()) {
            a(documentScannerStepResult, new rj1(this, documentScannerStepResult, 17));
        } else {
            c(documentScannerStepResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(dp dpVar, DocumentScannerStepResult documentScannerStepResult) {
        dpVar.d(documentScannerStepResult);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lo a(dp dpVar, DocumentScannerStepResult documentScannerStepResult, lo present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return dpVar.f.b(documentScannerStepResult.getImage().getCropped());
    }

    private final void a(DocumentValidationError documentValidationError) {
        er erVar;
        y();
        this.f27842c.a(new pj1(26));
        switch (b.$EnumSwitchMapping$0[documentValidationError.ordinal()]) {
            case 1:
                erVar = er.e.f28238a;
                break;
            case 2:
                erVar = er.a.f28230a;
                break;
            case 3:
                erVar = er.d.f28236a;
                break;
            case 4:
                erVar = er.g.f28242a;
                break;
            case 5:
                erVar = er.i.f28246a;
                break;
            case 6:
                erVar = er.j.f28248a;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(("Orca doesn't support " + documentValidationError + " error").toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f27845j.handleError(new si.e(erVar), "document_scanner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job a(DocumentScannerStepResult documentScannerStepResult, Function0 function0) {
        return skm.e0.C(this, null, null, new o(function0, null), 3);
    }

    private final void a(DocumentScannerError documentScannerError) {
        this.f27853t = false;
        a();
        if (documentScannerError == DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED) {
            this.f27842c.a(new pj1(24));
        } else if (this.f27852s) {
            b(documentScannerError);
        }
    }

    private final void a(DocumentScannerResult documentScannerResult) {
        this.f27853t = false;
        a();
        ko koVarA = this.o.a(documentScannerResult);
        this.e.a(koVarA);
        this.f27846l.track(ho.a.l.f29363b);
        a(koVarA);
    }

    private final void a(ko koVar) {
        VideoRecording videoRecording = koVar.a().getVideoRecording();
        if (videoRecording != null) {
            this.f27844h.a(videoRecording);
        }
        skm.e0.C(this, null, null, new c(koVar, null), 3);
    }

    private final void a() {
        Job job2 = this.B;
        if (job2 != null) {
            job2.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(io.a aVar) {
        this.k.b(aVar);
    }
}
