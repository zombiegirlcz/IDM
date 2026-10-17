package pn2;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nq.n;
import nq.r;
import qo2.k;
import qt8.o;
import sbd.h;
import skm.h1;
import t48.y;
import tof.q6;
import ukm.g0;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f237655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f237656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f237657y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.B = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r6v12, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((k) this.z, (mn2.a) this.f237655w, (wn2.d) this.f237656x, (Boolean) this.A, (d) this.f237657y, (String) this.B, continuation);
            case 1:
                return new c((mn2.a) this.f237655w, (wn2.d) this.f237656x, (FormState) this.A, (wn2.a) this.B, (d) this.f237657y, continuation);
            case 2:
                return new c((qac.i) this.f237655w, (String) this.B, (String) this.f237656x, (String) this.A, (String) this.f237657y, continuation);
            case 3:
                c cVar = new c((qq3.i) this.f237657y, (Set) this.B, continuation);
                cVar.A = obj2;
                return cVar;
            case 4:
                c cVar2 = new c((o) this.f237656x, (n) this.A, (r) this.f237657y, (String) this.B, continuation);
                cVar2.f237655w = obj2;
                return cVar2;
            case 5:
                return new c((h) this.z, (String) this.B, (String) this.f237655w, (Long) this.f237656x, (Long) this.A, (String) this.f237657y, continuation);
            case 6:
                return new c((y) this.B, continuation, 6);
            case 7:
                c cVar3 = new c((v1) this.B, continuation, 7);
                cVar3.f237657y = obj2;
                return cVar3;
            case 8:
                return new c((g0) this.f237655w, (FlowCollector) this.f237656x, (Function3) this.A, this.f237657y, (h1) this.B, continuation);
            case 9:
                c cVar4 = new c((Flow) this.f237656x, (Flow) this.A, (FlowCollector) this.f237657y, (Function3) this.B, continuation);
                cVar4.f237655w = obj2;
                return cVar4;
            default:
                c cVar5 = new c((String) this.B, (q6) this.f237655w, (xif.o) this.f237656x, (FlowCollector) this.A, (w4l.k) this.f237657y, continuation);
                cVar5.z = obj2;
                return cVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:513:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:517:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:520:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:522:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120 A[Catch: all -> 0x008a, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x008a, blocks: (B:19:0x0086, B:53:0x0118, B:58:0x0120), top: B:456:0x0086 }] */
    /* JADX WARN: Type inference failed for: r19v7, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r3v53, types: [ukm.g0, ukm.j0] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61, types: [ukm.i0] */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64, types: [ukm.i0] */
    /* JADX WARN: Type inference failed for: r3v66, types: [ukm.i0] */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r4v87, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Type inference failed for: r4v98, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r7v31, types: [kotlin.coroutines.CoroutineContext, skm.d0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x02ab -> B:113:0x0253). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x02df -> B:129:0x02e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x02ea -> B:130:0x02e5). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, q6 q6Var, xif.o oVar, FlowCollector flowCollector, w4l.k kVar, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.B = str;
        this.f237655w = q6Var;
        this.f237656x = oVar;
        this.A = flowCollector;
        this.f237657y = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Flow flow, Flow flow2, FlowCollector flowCollector, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.u = 9;
        this.f237656x = flow;
        this.A = flow2;
        this.f237657y = flowCollector;
        this.B = (i) function3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mn2.a aVar, wn2.d dVar, FormState formState, wn2.a aVar2, d dVar2, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f237655w = aVar;
        this.f237656x = dVar;
        this.A = formState;
        this.B = aVar2;
        this.f237657y = dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qac.i iVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f237655w = iVar;
        this.B = str;
        this.f237656x = str2;
        this.A = str3;
        this.f237657y = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, mn2.a aVar, wn2.d dVar, Boolean bool, d dVar2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.z = kVar;
        this.f237655w = aVar;
        this.f237656x = dVar;
        this.A = bool;
        this.f237657y = dVar2;
        this.B = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qq3.i iVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f237657y = iVar;
        this.B = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, n nVar, r rVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f237656x = oVar;
        this.A = nVar;
        this.f237657y = rVar;
        this.B = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, String str, String str2, Long l2, Long l3, String str3, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.z = hVar;
        this.B = str;
        this.f237655w = str2;
        this.f237656x = l2;
        this.A = l3;
        this.f237657y = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(g0 g0Var, FlowCollector flowCollector, Function3 function3, Object obj2, h1 h1Var, Continuation continuation) {
        super(2, continuation);
        this.u = 8;
        this.f237655w = g0Var;
        this.f237656x = flowCollector;
        this.A = (i) function3;
        this.f237657y = obj2;
        this.B = h1Var;
    }
}
