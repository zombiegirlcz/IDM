package nkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class x extends gim.h implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f216865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f216866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f216867y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Throwable th10, Continuation continuation) {
        super(2, continuation);
        this.A = th10;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x((Sequence) this.z, (nij.d) this.A, continuation);
                xVar.f216867y = obj2;
                return xVar;
            default:
                x xVar2 = new x((Throwable) this.A, continuation);
                xVar2.f216865w = obj2;
                return xVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        o oVar = (o) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(oVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d3 -> B:36:0x00d6). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nkm.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Sequence sequence, nij.d dVar, Continuation continuation) {
        super(2, continuation);
        this.z = sequence;
        this.A = dVar;
    }
}
