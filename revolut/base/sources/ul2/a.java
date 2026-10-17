package ul2;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.i implements Function2 {
    public BackendFlowFile u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f280853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ File f280854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f280855y;
    public final /* synthetic */ BackendFlow z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(File file, c cVar, BackendFlow backendFlow, Continuation continuation) {
        super(2, continuation);
        this.f280854x = file;
        this.f280855y = cVar;
        this.z = backendFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f280854x, this.f280855y, this.z, continuation);
        aVar.f280853w = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if (r0.emit(r12, r11) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r0.emit(r12, r11) != r1) goto L31;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.feature.backend_flow.domain.models.BackendFlowFile, int] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f280853w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.v
            java.io.File r3 = r11.f280854x
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L39
            if (r2 == r7) goto L33
            if (r2 == r6) goto L2d
            if (r2 == r5) goto L26
            if (r2 != r4) goto L1e
            yhm.o.b(r12)
            goto La8
        L1e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L26:
            com.revolut.feature.backend_flow.domain.models.BackendFlowFile r2 = r11.u
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L93
            goto La8
        L2d:
            com.revolut.feature.backend_flow.domain.models.BackendFlowFile r2 = r11.u
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L93
            goto L7c
        L33:
            com.revolut.feature.backend_flow.domain.models.BackendFlowFile r2 = r11.u
            yhm.o.b(r12)
            goto L52
        L39:
            yhm.o.b(r12)
            com.revolut.feature.backend_flow.domain.models.BackendFlowBinary$a r12 = com.revolut.feature.backend_flow.domain.models.BackendFlowBinary.INSTANCE
            xl2.e r2 = xl2.e.UPLOADING
            com.revolut.feature.backend_flow.domain.models.BackendFlowFile r12 = com.revolut.feature.backend_flow.domain.models.BackendFlowBinary.Companion.a(r12, r3, r2, r8, r4)
            r11.f280853w = r0
            r11.u = r12
            r11.v = r7
            java.lang.Object r2 = r0.emit(r12, r11)
            if (r2 != r1) goto L51
            goto La7
        L51:
            r2 = r12
        L52:
            ul2.c r12 = r11.f280855y     // Catch: java.lang.Exception -> L93
            ar6.c r12 = r12.f280857a     // Catch: java.lang.Exception -> L93
            com.revolut.feature.backend_flow.domain.models.BackendFlow r7 = r11.z     // Catch: java.lang.Exception -> L93
            java.lang.String r7 = r7.f63264b     // Catch: java.lang.Exception -> L93
            java.lang.String r9 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)     // Catch: java.lang.Exception -> L93
            java.lang.String r9 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r9)     // Catch: java.lang.Exception -> L93
            amh.j r9 = new amh.j     // Catch: java.lang.Exception -> L93
            r10 = 27
            r9.<init>(r12, r7, r10)     // Catch: java.lang.Exception -> L93
            ufm.n r12 = hx7.i.c0(r3, r9)     // Catch: java.lang.Exception -> L93
            r11.f280853w = r0     // Catch: java.lang.Exception -> L93
            r11.u = r2     // Catch: java.lang.Exception -> L93
            r11.v = r6     // Catch: java.lang.Exception -> L93
            java.lang.Object r12 = nim.a.b(r12, r11)     // Catch: java.lang.Exception -> L93
            if (r12 != r1) goto L7c
            goto La7
        L7c:
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> L93
            xl2.e r3 = xl2.e.SUCCESS     // Catch: java.lang.Exception -> L93
            r6 = 43
            com.revolut.feature.backend_flow.domain.models.BackendFlowFile r12 = com.revolut.feature.backend_flow.domain.models.BackendFlowFile.a(r2, r12, r8, r3, r6)     // Catch: java.lang.Exception -> L93
            r11.f280853w = r0     // Catch: java.lang.Exception -> L93
            r11.u = r2     // Catch: java.lang.Exception -> L93
            r11.v = r5     // Catch: java.lang.Exception -> L93
            java.lang.Object r12 = r0.emit(r12, r11)     // Catch: java.lang.Exception -> L93
            if (r12 != r1) goto La8
            goto La7
        L93:
            xl2.e r12 = xl2.e.UPLOAD_ERROR
            r3 = 47
            com.revolut.feature.backend_flow.domain.models.BackendFlowFile r12 = com.revolut.feature.backend_flow.domain.models.BackendFlowFile.a(r2, r8, r8, r12, r3)
            r11.f280853w = r8
            r11.u = r8
            r11.v = r4
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto La8
        La7:
            return r1
        La8:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
