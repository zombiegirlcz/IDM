package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.internal.vd;
import com.fourthline.orca.selfie.SelfieCustomizationConfig;
import com.fourthline.vision.MotionData;
import com.fourthline.vision.ScannerMetadata;
import com.fourthline.vision.selfie.SelfieScannerResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class s7 implements wq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32919b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t7 f32920a = new t7();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements OnProductCompleted {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ra f32922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f32923c;
        final /* synthetic */ OnProductCompleted d;

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f32924a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f32925b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f32926c;
            private /* synthetic */ Object d;
            final /* synthetic */ ra e;
            final /* synthetic */ MotionData f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ OnProductCompleted f32927g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f32928h;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.s7$b$a$a, reason: collision with other inner class name */
            public static final class C0280a extends gim.i implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f32929a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ OnProductCompleted f32930b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Object f32931c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0280a(OnProductCompleted onProductCompleted, Object obj2, Continuation continuation) {
                    super(2, continuation);
                    this.f32930b = onProductCompleted;
                    this.f32931c = obj2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0280a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                }

                @Override // gim.a
                public final Continuation create(Object obj2, Continuation continuation) {
                    return new C0280a(this.f32930b, this.f32931c, continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                    if (this.f32929a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    this.f32930b.onResult(this.f32931c);
                    return Unit.f186387a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ra raVar, MotionData motionData, OnProductCompleted onProductCompleted, Object obj2, Continuation continuation) {
                super(2, continuation);
                this.e = raVar;
                this.f = motionData;
                this.f32927g = onProductCompleted;
                this.f32928h = obj2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                a aVar = new a(this.e, this.f, this.f32927g, this.f32928h, continuation);
                aVar.d = obj2;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
            
                if (skm.e0.J(r7, r1, r6) == r0) goto L23;
             */
            @Override // gim.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r6.d
                    kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                    fim.a r0 = fim.a.COROUTINE_SUSPENDED
                    int r1 = r6.f32926c
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    yhm.o.b(r7)
                    goto L64
                L15:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1d:
                    java.lang.Object r1 = r6.f32924a
                    kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                    yhm.o.b(r7)     // Catch: java.lang.Throwable -> L25
                    goto L40
                L25:
                    r7 = move-exception
                    goto L45
                L27:
                    yhm.o.b(r7)
                    com.fourthline.orca.internal.ra r7 = r6.e
                    com.fourthline.vision.MotionData r1 = r6.f
                    yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L25
                    r6.d = r4     // Catch: java.lang.Throwable -> L25
                    r6.f32924a = r4     // Catch: java.lang.Throwable -> L25
                    r5 = 0
                    r6.f32925b = r5     // Catch: java.lang.Throwable -> L25
                    r6.f32926c = r3     // Catch: java.lang.Throwable -> L25
                    java.lang.Object r7 = r7.b(r1, r6)     // Catch: java.lang.Throwable -> L25
                    if (r7 != r0) goto L40
                    goto L63
                L40:
                    kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L25
                    yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L25
                    goto L4a
                L45:
                    yhm.m$a r1 = yhm.m.INSTANCE
                    yhm.o.a(r7)
                L4a:
                    skm.p0 r7 = skm.p0.f264001a
                    tkm.e r7 = zkm.o.f323119a
                    com.fourthline.orca.internal.s7$b$a$a r1 = new com.fourthline.orca.internal.s7$b$a$a
                    com.fourthline.orca.core.OnProductCompleted r3 = r6.f32927g
                    java.lang.Object r5 = r6.f32928h
                    r1.<init>(r3, r5, r4)
                    r6.d = r4
                    r6.f32924a = r4
                    r6.f32926c = r2
                    java.lang.Object r7 = skm.e0.J(r7, r1, r6)
                    if (r7 != r0) goto L64
                L63:
                    return r0
                L64:
                    kotlin.Unit r7 = kotlin.Unit.f186387a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.s7.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(ra raVar, CoroutineScope coroutineScope, OnProductCompleted onProductCompleted) {
            this.f32922b = raVar;
            this.f32923c = coroutineScope;
            this.d = onProductCompleted;
        }

        @Override // com.fourthline.orca.core.OnProductCompleted
        public final void onResult(Object obj2) {
            ra raVar;
            CoroutineScope coroutineScope;
            ScannerMetadata metadata;
            Object objA = s7.this.f32920a.a(obj2);
            m.Companion companion = yhm.m.INSTANCE;
            if (obj2 instanceof yhm.n) {
                obj2 = null;
            }
            SelfieScannerResult selfieScannerResult = (SelfieScannerResult) obj2;
            MotionData motionData = (selfieScannerResult == null || (metadata = selfieScannerResult.getMetadata()) == null) ? null : metadata.getMotionData();
            if (motionData == null || (raVar = this.f32922b) == null || (coroutineScope = this.f32923c) == null) {
                this.d.onResult(objA);
            } else {
                skm.e0.C(coroutineScope, null, null, new a(raVar, motionData, this.d, objA, null), 3);
            }
        }
    }

    @Override // com.fourthline.orca.internal.wq0
    public dh0 a(lg1 networkConfig, e01 productConfig, SelfieCustomizationConfig productCustomization, Map customFields, OnProductCompleted onProductCompleted) {
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(productConfig, "productConfig");
        Intrinsics.checkNotNullParameter(productCustomization, "productCustomization");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        Intrinsics.checkNotNullParameter(onProductCompleted, "onProductCompleted");
        Object obj2 = customFields.get("componentMotionDataUploader");
        ra raVar = obj2 instanceof ra ? (ra) obj2 : null;
        Object obj3 = customFields.get("componentMotionDataUploaderScope");
        CoroutineScope coroutineScope = obj3 instanceof CoroutineScope ? (CoroutineScope) obj3 : null;
        vd.c cVarA = vd.a();
        Object obj4 = customFields.get("tenantConfig");
        ye1 ye1Var = obj4 instanceof ye1 ? (ye1) obj4 : null;
        if (ye1Var != null) {
            ti0 ti0VarA = cVarA.a(new f01(productConfig, productCustomization, new b(raVar, coroutineScope, onProductCompleted), ye1Var, networkConfig)).a();
            Intrinsics.checkNotNullExpressionValue(ti0VarA, "build(...)");
            return ti0VarA;
        }
        throw new IllegalStateException("FL developer error. Config should always be provided");
    }
}
