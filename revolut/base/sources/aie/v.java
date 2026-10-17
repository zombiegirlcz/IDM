package aie;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import cuc.e0;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pjl.z0;
import y20.b1;
import y20.f1;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f5253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f5254y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
        this.B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        if (r6.e(r8, r0, r11) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aie.v.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a2, code lost:
    
        if (r1 == r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0280, code lost:
    
        if (r1 == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ce A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aie.v.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ce -> B:30:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x0064
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private final java.lang.Object n(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aie.v.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v((com.revolut.feature.tab.accounts.impl.ui.spaces.i) this.f5254y, (sfe.i) this.A, continuation);
            case 1:
                return new v((b97.l) this.A, (j97.a) this.B, continuation, 1);
            case 2:
                return new v((b97.l) this.A, (String) this.B, continuation, 2);
            case 3:
                return new v((e0) this.f5254y, (String) this.z, (LocationDomain) this.A, (String) this.B, this.f5252w, continuation, 3);
            case 4:
                return new v((dp4.c0) this.f5253x, (String) this.f5254y, (String) this.z, this.f5252w, (dj0.d) this.A, (ql4.v) this.B, continuation, 4);
            case 5:
                return new v((dp4.c0) this.f5253x, (String) this.f5254y, (String) this.z, this.f5252w, (dj0.d) this.A, (dj0.d) this.B, continuation, 5);
            case 6:
                return new v(6, (String) this.z, (jgi.d) this.A, (String) this.B, continuation);
            case 7:
                return new v((Flow) this.f5253x, (AtomicInteger) this.f5254y, (ukm.q) this.z, (AtomicReferenceArray) this.A, this.f5252w, (AtomicInteger) this.B, continuation);
            case 8:
                v vVar = new v((ArrayList) this.A, (FlowCollector) this.B, continuation, 8);
                vVar.z = obj2;
                return vVar;
            case 9:
                return new v(9, (k3c.p) this.z, (d3c.b0) this.A, (String) this.B, continuation);
            case 10:
                return new v((on6.a) this.f5253x, (mn6.j) this.f5254y, (Function0) this.z, (gim.i) this.A, (Function0) this.B, continuation);
            case 11:
                return new v((n6j.c) this.A, (l6j.a) this.B, continuation, 11);
            case 12:
                return new v((z0) this.f5254y, (String) this.z, (pj9.n) this.A, continuation);
            case 13:
                return new v((LocalDate) this.f5254y, (wdb.n) this.z, (String) this.A, (LocalTime) this.B, this.f5252w, continuation, 13);
            case 14:
                v vVar2 = new v((b1) this.B, continuation);
                vVar2.A = obj2;
                return vVar2;
            case 15:
                v vVar3 = new v((y7d.x) this.A, (y7d.l) this.B, continuation, 15);
                vVar3.z = obj2;
                return vVar3;
            default:
                return new v((ypd.j) this.A, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((v) create((f1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((v) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036e A[LOOP:2: B:155:0x036e->B:392:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x049d A[Catch: CancellationException -> 0x0418, all -> 0x04ae, LOOP:6: B:217:0x0497->B:219:0x049d, LOOP_END, TryCatch #7 {CancellationException -> 0x0418, blocks: (B:192:0x0410, B:201:0x042b, B:216:0x0486, B:217:0x0497, B:219:0x049d, B:222:0x04b1, B:212:0x0472), top: B:375:0x0404 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:414:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:429:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0230  */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, jgi.d] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r3v86, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x023f -> B:88:0x01f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x039c -> B:137:0x02d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0080 -> B:20:0x0083). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aie.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar, sfe.i iVar2, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f5254y = iVar;
        this.A = iVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(dp4.c0 c0Var, String str, String str2, int i, dj0.d dVar, Object obj2, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f5253x = c0Var;
        this.f5254y = str;
        this.z = str2;
        this.f5252w = i;
        this.A = dVar;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Object obj3, Object obj4, Object obj5, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f5254y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.B = obj5;
        this.f5252w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.A = obj2;
        this.B = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Flow flow, AtomicInteger atomicInteger, ukm.q qVar, AtomicReferenceArray atomicReferenceArray, int i, AtomicInteger atomicInteger2, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.f5253x = flow;
        this.f5254y = atomicInteger;
        this.z = qVar;
        this.A = atomicReferenceArray;
        this.f5252w = i;
        this.B = atomicInteger2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(on6.a aVar, mn6.j jVar, Function0 function0, Function1 function1, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f5253x = aVar;
        this.f5254y = jVar;
        this.z = function0;
        this.A = (gim.i) function1;
        this.B = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z0 z0Var, String str, pj9.n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = 12;
        this.f5254y = z0Var;
        this.z = str;
        this.A = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b1 b1Var, Continuation continuation) {
        super(2, continuation);
        this.u = 14;
        this.B = b1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ypd.j jVar, Continuation continuation) {
        super(2, continuation);
        this.u = 16;
        this.A = jVar;
    }
}
