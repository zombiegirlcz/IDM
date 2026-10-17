package ojf;

import gim.i;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends i implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Long C;
    public final /* synthetic */ e D;
    public final /* synthetic */ mhf.i E;
    public final /* synthetic */ b F;
    public final /* synthetic */ boolean G;
    public Long u;
    public Ref$BooleanRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinkedHashSet f225770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f225771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinkedHashSet f225772y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Long l2, e eVar, mhf.i iVar, b bVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.C = l2;
        this.D = eVar;
        this.E = iVar;
        this.F = bVar;
        this.G = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.C, this.D, this.E, this.F, this.G, continuation);
        dVar.B = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (r4 == r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0247, code lost:
    
        if (r0.emit(r1, r26) != r6) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01e2 -> B:58:0x01e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ed -> B:60:0x01f3). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ojf.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
