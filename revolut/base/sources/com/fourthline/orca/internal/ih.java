package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.vision.MotionData;
import com.fourthline.vision.ScannerMetadata;
import com.fourthline.vision.document.DocumentScannerResult;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class ih implements wq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jh f29585a = new jh();

    public static final class a implements OnProductCompleted {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ra f29587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f29588c;
        final /* synthetic */ OnProductCompleted d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ih$a$a, reason: collision with other inner class name */
        public static final class C0216a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f29589a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f29590b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f29591c;
            private /* synthetic */ Object d;
            final /* synthetic */ ra e;
            final /* synthetic */ MotionData f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ OnProductCompleted f29592g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f29593h;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.ih$a$a$a, reason: collision with other inner class name */
            public static final class C0217a extends gim.i implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29594a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ OnProductCompleted f29595b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Object f29596c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0217a(OnProductCompleted onProductCompleted, Object obj2, Continuation continuation) {
                    super(2, continuation);
                    this.f29595b = onProductCompleted;
                    this.f29596c = obj2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0217a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                }

                @Override // gim.a
                public final Continuation create(Object obj2, Continuation continuation) {
                    return new C0217a(this.f29595b, this.f29596c, continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                    if (this.f29594a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    this.f29595b.onResult(this.f29596c);
                    return Unit.f186387a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0216a(ra raVar, MotionData motionData, OnProductCompleted onProductCompleted, Object obj2, Continuation continuation) {
                super(2, continuation);
                this.e = raVar;
                this.f = motionData;
                this.f29592g = onProductCompleted;
                this.f29593h = obj2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0216a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0216a c0216a = new C0216a(this.e, this.f, this.f29592g, this.f29593h, continuation);
                c0216a.d = obj2;
                return c0216a;
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
                    int r1 = r6.f29591c
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
                    java.lang.Object r1 = r6.f29589a
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
                    r6.f29589a = r4     // Catch: java.lang.Throwable -> L25
                    r5 = 0
                    r6.f29590b = r5     // Catch: java.lang.Throwable -> L25
                    r6.f29591c = r3     // Catch: java.lang.Throwable -> L25
                    java.lang.Object r7 = r7.a(r1, r6)     // Catch: java.lang.Throwable -> L25
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
                    com.fourthline.orca.internal.ih$a$a$a r1 = new com.fourthline.orca.internal.ih$a$a$a
                    com.fourthline.orca.core.OnProductCompleted r3 = r6.f29592g
                    java.lang.Object r5 = r6.f29593h
                    r1.<init>(r3, r5, r4)
                    r6.d = r4
                    r6.f29589a = r4
                    r6.f29591c = r2
                    java.lang.Object r7 = skm.e0.J(r7, r1, r6)
                    if (r7 != r0) goto L64
                L63:
                    return r0
                L64:
                    kotlin.Unit r7 = kotlin.Unit.f186387a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ih.a.C0216a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(ra raVar, CoroutineScope coroutineScope, OnProductCompleted onProductCompleted) {
            this.f29587b = raVar;
            this.f29588c = coroutineScope;
            this.d = onProductCompleted;
        }

        @Override // com.fourthline.orca.core.OnProductCompleted
        public final void onResult(Object obj2) {
            ra raVar;
            CoroutineScope coroutineScope;
            DocumentScannerResult documentScannerResultB;
            ScannerMetadata metadata;
            Object objA = ih.this.f29585a.a(obj2);
            m.Companion companion = yhm.m.INSTANCE;
            if (obj2 instanceof yhm.n) {
                obj2 = null;
            }
            ym ymVar = (ym) obj2;
            MotionData motionData = (ymVar == null || (documentScannerResultB = ymVar.b()) == null || (metadata = documentScannerResultB.getMetadata()) == null) ? null : metadata.getMotionData();
            if (motionData == null || (raVar = this.f29587b) == null || (coroutineScope = this.f29588c) == null) {
                this.d.onResult(objA);
            } else {
                skm.e0.C(coroutineScope, null, null, new C0216a(raVar, motionData, this.d, objA, null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    @Override // com.fourthline.orca.internal.wq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fourthline.orca.internal.dh0 a(com.fourthline.orca.internal.lg1 r6, com.fourthline.orca.internal.um r7, com.fourthline.orca.document.DocumentCustomizationConfig r8, java.util.Map r9, com.fourthline.orca.core.OnProductCompleted r10) {
        /*
            r5 = this;
            java.lang.String r0 = "networkConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "productConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "productCustomization"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "customFields"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onProductCompleted"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.fourthline.core.DocumentType r0 = r7.f()
            com.fourthline.core.DocumentType r1 = com.fourthline.core.DocumentType.TIN_REFERENCE_DOCUMENT
            r2 = 0
            if (r0 == r1) goto L5e
            com.fourthline.core.DocumentType r0 = r7.f()
            com.fourthline.core.DocumentType r1 = com.fourthline.core.DocumentType.PROOF_OF_ADDRESS
            if (r0 != r1) goto L2b
            goto L5e
        L2b:
            java.lang.String r0 = r7.d()
            if (r0 != 0) goto L34
            com.fourthline.orca.internal.er$g r0 = com.fourthline.orca.internal.er.g.f28242a
            goto L5f
        L34:
            com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator r0 = new com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator
            com.fourthline.orca.internal.ul1 r1 = new com.fourthline.orca.internal.ul1
            r3 = 24
            r1.<init>(r7, r3)
            r0.<init>(r1)
            yhm.r r1 = new yhm.r
            java.lang.String r3 = r7.d()
            com.fourthline.core.DocumentType r4 = r7.f()
            r1.<init>(r3, r4, r2)
            java.util.Set r0 = r0.validate(r1)
            java.lang.Object r0 = zhm.d0.c0(r0)
            com.fourthline.vision.document.ocr.OcrValidationError r0 = (com.fourthline.vision.document.ocr.OcrValidationError) r0
            if (r0 == 0) goto L5e
            com.fourthline.orca.internal.er r0 = com.fourthline.orca.internal.ch.a(r0)
            goto L5f
        L5e:
            r0 = r2
        L5f:
            if (r0 == 0) goto L6f
            yhm.m$a r6 = yhm.m.INSTANCE
            com.fourthline.orca.workflow.WorkflowError$ModuleError r6 = com.fourthline.orca.internal.hh0.a(r0)
            yhm.n r6 = yhm.o.a(r6)
            r10.onResult(r6)
            return r2
        L6f:
            java.lang.String r0 = "componentMotionDataUploader"
            java.lang.Object r0 = r9.get(r0)
            boolean r1 = r0 instanceof com.fourthline.orca.internal.ra
            if (r1 == 0) goto L7c
            com.fourthline.orca.internal.ra r0 = (com.fourthline.orca.internal.ra) r0
            goto L7d
        L7c:
            r0 = r2
        L7d:
            java.lang.String r1 = "componentMotionDataUploaderScope"
            java.lang.Object r9 = r9.get(r1)
            boolean r1 = r9 instanceof kotlinx.coroutines.CoroutineScope
            if (r1 == 0) goto L8a
            r2 = r9
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
        L8a:
            com.fourthline.orca.internal.ud$a r9 = com.fourthline.orca.internal.ud.b()
            com.fourthline.orca.internal.lh r1 = new com.fourthline.orca.internal.lh
            com.fourthline.orca.internal.ih$a r3 = new com.fourthline.orca.internal.ih$a
            r3.<init>(r0, r2, r10)
            r1.<init>(r6, r7, r8, r3)
            com.fourthline.orca.internal.ud$a r6 = r9.a(r1)
            com.fourthline.orca.internal.gh0 r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ih.a(com.fourthline.orca.internal.lg1, com.fourthline.orca.internal.um, com.fourthline.orca.document.DocumentCustomizationConfig, java.util.Map, com.fourthline.orca.core.OnProductCompleted):com.fourthline.orca.internal.dh0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(um umVar) {
        return umVar.b().getSupportedDocuments();
    }
}
