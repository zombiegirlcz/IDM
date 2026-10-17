package m2m;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.trustdockekyc.core.backend.domain.model.AppError;
import com.trustdockekyc.core.backend.internal.infrastructure.api.r;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements g2m.e, g2m.c, g2m.b, g2m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f202256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f202257b;

    public m(r nativeAppSdkApi, Context context) {
        p0 p0Var = p0.f264001a;
        elm.f dispatcherIo = elm.f.f127540b;
        Intrinsics.checkNotNullParameter(nativeAppSdkApi, "nativeAppSdkApi");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcherIo, "dispatcherIo");
        this.f202256a = nativeAppSdkApi;
        this.f202257b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof m2m.h
            if (r0 == 0) goto L13
            r0 = r5
            m2m.h r0 = (m2m.h) r0
            int r1 = r0.f202251w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202251w = r1
            goto L18
        L13:
            m2m.h r0 = new m2m.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202251w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r4.f()
            r0.f202251w = r3
            com.trustdockekyc.core.backend.internal.infrastructure.api.r r5 = r4.f202256a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.GetSettingResponse r5 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.GetSettingResponse) r5
            x2m.f r0 = new x2m.f
            java.lang.String r1 = r5.f107385a
            java.lang.String r2 = r5.f107386b
            boolean r5 = r5.f107387c
            r0.<init>(r1, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2m.m.a(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.PostIcChipReaderJapanCtProcessesDocumentRequestBody r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof m2m.k
            if (r0 == 0) goto L13
            r0 = r12
            m2m.k r0 = (m2m.k) r0
            int r1 = r0.f202254w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202254w = r1
            goto L18
        L13:
            m2m.k r0 = new m2m.k
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202254w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L40
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r12)
            r9.f()
            r0.f202254w = r3
            com.trustdockekyc.core.backend.internal.infrastructure.api.r r12 = r9.f202256a
            java.lang.Object r12 = r12.a(r10, r11, r0)
            if (r12 != r1) goto L40
            return r1
        L40:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.PostIcChipReaderJapanCtProcessesDocumentResponse r12 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.PostIcChipReaderJapanCtProcessesDocumentResponse) r12
            r12.getClass()
            a3m.n r0 = new a3m.n
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentType r10 = r12.f107503a
            a3m.g r1 = r10.toModel()
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentDriversLicense r10 = r12.f107504b
            r11 = 0
            if (r10 == 0) goto L58
            a3m.a r10 = r10.a()
            r2 = r10
            goto L59
        L58:
            r2 = r11
        L59:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentResidenceCard r10 = r12.f107505c
            if (r10 == 0) goto L7d
            a3m.d r3 = new a3m.d
            java.lang.String r4 = r10.f107446a
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTResidenceCardAddress r5 = r10.f107447b
            if (r5 == 0) goto L72
            a3m.m r6 = new a3m.m
            java.lang.String r7 = r5.f107479a
            java.lang.String r8 = r5.f107480b
            java.lang.String r5 = r5.f107481c
            r6.<init>(r7, r8, r5)
            r5 = r6
            goto L73
        L72:
            r5 = r11
        L73:
            java.lang.String r6 = r10.f107448c
            java.lang.String r7 = r10.d
            boolean r8 = r10.e
            r3.<init>(r4, r5, r6, r7, r8)
            goto L7e
        L7d:
            r3 = r11
        L7e:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate r10 = r12.d
            if (r10 == 0) goto L99
            a3m.f r4 = new a3m.f
            java.lang.String r5 = r10.f107452a
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTResidenceCardAddress r10 = r10.f107453b
            if (r10 == 0) goto L95
            a3m.m r11 = new a3m.m
            java.lang.String r6 = r10.f107479a
            java.lang.String r7 = r10.f107480b
            java.lang.String r10 = r10.f107481c
            r11.<init>(r6, r7, r10)
        L95:
            r4.<init>(r5, r11)
            goto L9a
        L99:
            r4 = r11
        L9a:
            boolean r5 = r12.f
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2m.m.b(java.lang.String, com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.PostIcChipReaderJapanCtProcessesDocumentRequestBody, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m2m.f
            if (r0 == 0) goto L13
            r0 = r6
            m2m.f r0 = (m2m.f) r0
            int r1 = r0.f202249w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202249w = r1
            goto L18
        L13:
            m2m.f r0 = new m2m.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202249w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r4.f()
            r0.f202249w = r3
            com.trustdockekyc.core.backend.internal.infrastructure.api.r r6 = r4.f202256a
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.GetFaceMatchingJapanTdProcessesSettingResponse r6 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.GetFaceMatchingJapanTdProcessesSettingResponse) r6
            r6.getClass()
            z2m.a r5 = new z2m.a
            boolean r6 = r6.f107412a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m2m.m.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, java.io.File r8, java.util.List r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof m2m.i
            if (r0 == 0) goto L13
            r0 = r10
            m2m.i r0 = (m2m.i) r0
            int r1 = r0.f202252w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202252w = r1
            goto L18
        L13:
            m2m.i r0 = new m2m.i
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202252w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L7d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r10)
            r6.f()
            byte[] r8 = lim.m.d(r8)
            r10 = 2
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r10)
            java.lang.String r2 = "let(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = zhm.w.t(r9, r5)
            r4.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L52:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r9.next()
            java.io.File r5 = (java.io.File) r5
            byte[] r5 = lim.m.d(r5)
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r4.add(r5)
            goto L52
        L6d:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody r9 = new com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody
            r9.<init>(r8, r4)
            r0.f202252w = r3
            com.trustdockekyc.core.backend.internal.infrastructure.api.r r8 = r6.f202256a
            java.lang.Object r10 = r8.a(r7, r9, r0)
            if (r10 != r1) goto L7d
            return r1
        L7d:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesFaceMatchingsResponse r10 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesFaceMatchingsResponse) r10
            r10.getClass()
            z2m.d r7 = new z2m.d
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesFaceMatchingsResponse$Result r8 = r10.f107415a
            z2m.c r8 = r8.toModel()
            float r9 = r10.f107416b
            r7.<init>(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m2m.m.d(java.lang.String, java.io.File, java.util.List, gim.c):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final java.lang.Object e(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public final void f() {
        Context context = this.f202257b;
        Intrinsics.checkNotNullParameter(context, "context");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (!(networkCapabilities == null ? false : networkCapabilities.hasCapability(12))) {
            throw new AppError.NetworkConnectionFailedError(new w1m.c(23, null, "network is not connected.", null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m2m.g
            if (r0 == 0) goto L13
            r0 = r6
            m2m.g r0 = (m2m.g) r0
            int r1 = r0.f202250w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202250w = r1
            goto L18
        L13:
            m2m.g r0 = new m2m.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202250w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r4.f()
            r0.f202250w = r3
            com.trustdockekyc.core.backend.internal.infrastructure.api.r r6 = r4.f202256a
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.GetIcChipReaderJapanCtProcessesSettingResponse r6 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.GetIcChipReaderJapanCtProcessesSettingResponse) r6
            java.util.List r5 = r6.f107421a
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r5.next()
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentType r0 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentType) r0
            a3m.g r0 = r0.toModel()
            r6.add(r0)
            goto L53
        L67:
            a3m.o r5 = new a3m.o
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m2m.m.g(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m2m.j
            if (r0 == 0) goto L13
            r0 = r6
            m2m.j r0 = (m2m.j) r0
            int r1 = r0.f202253w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202253w = r1
            goto L18
        L13:
            m2m.j r0 = new m2m.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202253w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r4.f()
            r0.f202253w = r3
            com.trustdockekyc.core.backend.internal.infrastructure.api.r r6 = r4.f202256a
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse r6 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse) r6
            java.util.List r5 = r6.f107417a
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r5.next()
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse$Action r0 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse.Action) r0
            x1m.a r0 = r0.toModel()
            r6.add(r0)
            goto L53
        L67:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m2m.m.h(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable i(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m2m.l
            if (r0 == 0) goto L13
            r0 = r6
            m2m.l r0 = (m2m.l) r0
            int r1 = r0.f202255w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202255w = r1
            goto L18
        L13:
            m2m.l r0 = new m2m.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202255w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            goto L47
        L27:
            r5 = move-exception
            goto L76
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r4.f()
            com.trustdockekyc.core.backend.internal.infrastructure.api.r r6 = r4.f202256a     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostPackageRequestBody r2 = new com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostPackageRequestBody     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            r2.<init>(r5)     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            r0.f202255w = r3     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            if (r6 != r1) goto L47
            return r1
        L47:
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostPackageResponse r6 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostPackageResponse) r6     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            java.lang.String r5 = r6.f107390b     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            java.util.List r6 = r6.f107391c     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            r1 = 10
            int r1 = zhm.w.t(r6, r1)     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            r0.<init>(r1)     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            java.util.Iterator r6 = r6.iterator()     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
        L5c:
            boolean r1 = r6.hasNext()     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            if (r1 == 0) goto L70
            java.lang.Object r1 = r6.next()     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostPackageResponse$Process r1 = (com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostPackageResponse.Process) r1     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            w1m.k r1 = r1.toModel()     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            r0.add(r1)     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            goto L5c
        L70:
            com.trustdockekyc.core.backend.domain.model.d r6 = new com.trustdockekyc.core.backend.domain.model.d     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            r6.<init>(r5, r0)     // Catch: com.trustdockekyc.core.backend.domain.model.AppError.NetworkResponseError -> L27
            return r6
        L76:
            w1m.c r6 = r5.f107372a
            if (r6 == 0) goto L7d
            java.lang.Integer r0 = r6.f293891c
            goto L7e
        L7d:
            r0 = 0
        L7e:
            if (r0 == 0) goto L92
            int r0 = r0.intValue()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L92
            com.trustdockekyc.core.backend.domain.model.AppError$InvalidPackageIdError r0 = new com.trustdockekyc.core.backend.domain.model.AppError$InvalidPackageIdError
            w1m.c r5 = w1m.c.a(r6, r5)
            r0.<init>(r5)
            throw r0
        L92:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m2m.m.i(java.lang.String, gim.c):java.io.Serializable");
    }
}
