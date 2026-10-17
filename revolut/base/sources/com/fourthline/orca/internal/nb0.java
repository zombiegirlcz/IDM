package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSideKt;
import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.core.location.Coordinate;
import com.fourthline.orca.internal.ab0;
import com.fourthline.orca.internal.ke;
import com.fourthline.orca.internal.nc1;
import com.fourthline.vision.document.DocumentScannerStepMetadata;
import com.fourthline.vision.document.DocumentScannerStepResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes23.dex */
public final class nb0 implements nc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f31372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj f31373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ke f31374c;
    private final double d;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f31377c;
        long d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f31378g;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f31378g |= Integer.MIN_VALUE;
            Object objA = nb0.this.a((nc1.a) null, 0L, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31379a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ il f31381c;
        final /* synthetic */ Ref$ObjectRef d;

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f31382a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f31383b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef f31384c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
                super(2, continuation);
                this.f31384c = ref$ObjectRef;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ne neVar, Continuation continuation) {
                return ((a) create(neVar, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                a aVar = new a(this.f31384c, continuation);
                aVar.f31383b = obj2;
                return aVar;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                ne neVar = (ne) this.f31383b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f31382a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                ke.a aVarB = neVar.b();
                boolean z = true;
                if (aVarB instanceof ke.a.d) {
                    this.f31384c.f186409a = neVar.b();
                } else if (aVarB instanceof ke.a.b) {
                    this.f31384c.f186409a = neVar.b();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(il ilVar, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
            super(2, continuation);
            this.f31381c = ilVar;
            this.d = ref$ObjectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return nb0.this.new b(this.f31381c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f31379a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                return obj2;
            }
            yhm.o.b(obj2);
            Flow flowA = nb0.this.f31374c.a(this.f31381c.a());
            a aVar2 = new a(this.d, null);
            this.f31379a = 1;
            Object objY = vkm.q.y(flowA, aVar2, this);
            return objY == aVar ? aVar : objY;
        }
    }

    public nb0(Function0 workflowIdProvider, gj documentFlowDataBundle, ke dataWorkManager, double d) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        this.f31372a = workflowIdProvider;
        this.f31373b = documentFlowDataBundle;
        this.f31374c = dataWorkManager;
        this.d = d;
    }

    private final il b(nc1.a aVar) {
        return new il((String) this.f31372a.invoke(), aVar.a(), aVar.c(), a(this.f31373b, aVar.a(), aVar.c(), aVar.b(), aVar.d()));
    }

    @Override // com.fourthline.orca.internal.nc1
    public void a(nc1.a input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f31374c.a(b(input));
    }

    private final List a(gj gjVar, String str, String str2, Bitmap bitmap, DocumentScannerStepResult documentScannerStepResult) throws IOException {
        di diVarO = gjVar.o();
        DocumentType documentTypeC = diVarO != null ? diVarO.c() : null;
        if (documentTypeC != null) {
            String fourthlineValue = DocumentTypeKt.toFourthlineValue(documentTypeC);
            int i = (int) (this.d * ((double) 100));
            String strA = a(documentScannerStepResult, fourthlineValue, "jpg");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                Intrinsics.h(byteArray);
                ab0.c.a aVar = new ab0.c.a("File", new sc(byteArray), bx.a(bx.d(), strA));
                gh ghVarF = gjVar.f();
                String strK = ghVarF.k();
                Date dateC = ghVarF.c();
                Date dateE = ghVarF.e();
                fd fdVarG = gjVar.g();
                String strC = fdVarG != null ? fdVarG.c() : null;
                DocumentScannerStepMetadata metadata = documentScannerStepResult.getMetadata();
                String fourthlineValue2 = DocumentFileSideKt.toFourthlineValue(metadata.getFileSide());
                String strA2 = qc1.a(metadata.isAngled());
                Coordinate location = metadata.getLocation();
                String strValueOf = location != null ? String.valueOf(location.getLatitude()) : null;
                Coordinate location2 = metadata.getLocation();
                hl hlVar = new hl(str, str2, fourthlineValue, true, false, strK, dateC, dateE, strC, new c50(strA, fourthlineValue2, strA2, strValueOf, location2 != null ? String.valueOf(location2.getLongitude()) : null));
                Json jsonA = s40.a();
                jsonA.getClass();
                return zhm.v.k(new ab0.c.a("UploadDocumentRequest", tc.a(jsonA.c(hl.INSTANCE.serializer(), hlVar)), null, 4, null), aVar);
            } finally {
            }
        } else {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentTypeC + " must not be null."))).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.nc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.nc1.a r6, long r7, kotlin.coroutines.Continuation r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.fourthline.orca.internal.nb0.a
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.orca.internal.nb0$a r0 = (com.fourthline.orca.internal.nb0.a) r0
            int r1 = r0.f31378g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31378g = r1
            goto L18
        L13:
            com.fourthline.orca.internal.nb0$a r0 = new com.fourthline.orca.internal.nb0$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f31378g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f31377c
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r7 = r0.f31376b
            com.fourthline.orca.internal.il r7 = (com.fourthline.orca.internal.il) r7
            java.lang.Object r7 = r0.f31375a
            com.fourthline.orca.internal.nc1$a r7 = (com.fourthline.orca.internal.nc1.a) r7
            yhm.o.b(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            goto L66
        L33:
            r6 = move-exception
            goto La9
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            yhm.o.b(r9)
            com.fourthline.orca.internal.il r6 = r5.b(r6)
            com.fourthline.orca.internal.ke r9 = r5.f31374c
            r9.a(r6)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            com.fourthline.orca.internal.nb0$b r2 = new com.fourthline.orca.internal.nb0$b     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            r4 = 0
            r2.<init>(r6, r9, r4)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            r0.f31375a = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            r0.f31376b = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            r0.f31377c = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            r0.d = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            r0.f31378g = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            java.lang.Object r6 = skm.h2.b(r7, r2, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            if (r6 != r1) goto L65
            return r1
        L65:
            r6 = r9
        L66:
            java.lang.Object r6 = r6.f186409a     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            com.fourthline.orca.internal.ke$a r6 = (com.fourthline.orca.internal.ke.a) r6     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            boolean r7 = r6 instanceof com.fourthline.orca.internal.ke.a.d     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            if (r7 == 0) goto L8d
            r7 = r6
            com.fourthline.orca.internal.ke$a$d r7 = (com.fourthline.orca.internal.ke.a.d) r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            java.lang.Object r7 = r7.a()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            boolean r7 = r7 instanceof com.fourthline.orca.internal.eb0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            if (r7 == 0) goto L82
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            com.fourthline.orca.internal.ke$a$d r6 = (com.fourthline.orca.internal.ke.a.d) r6     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            java.lang.Object r6 = r6.a()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            return r6
        L82:
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            com.fourthline.orca.internal.kh0 r6 = r5.a()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            yhm.n r6 = yhm.o.a(r6)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            return r6
        L8d:
            boolean r7 = r6 instanceof com.fourthline.orca.internal.ke.a.b     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            if (r7 == 0) goto L9e
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            com.fourthline.orca.internal.ke$a$b r6 = (com.fourthline.orca.internal.ke.a.b) r6     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            java.lang.Throwable r6 = r6.a()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            yhm.n r6 = yhm.o.a(r6)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            return r6
        L9e:
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            com.fourthline.orca.internal.kh0 r6 = r5.a()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            yhm.n r6 = yhm.o.a(r6)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L33
            return r6
        La9:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.nb0.a(com.fourthline.orca.internal.nc1$a, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String a(DocumentScannerStepResult documentScannerStepResult, String str, String str2) {
        return str + "_" + DocumentFileSideKt.toFourthlineValue(documentScannerStepResult.getMetadata().getFileSide()) + "_" + (documentScannerStepResult.getMetadata().isAngled() ? "angled" : "normal") + "." + str2;
    }

    private final kh0 a() {
        return new kh0("Result is of unexpected type.", null, "unexpected", 2, null);
    }
}
