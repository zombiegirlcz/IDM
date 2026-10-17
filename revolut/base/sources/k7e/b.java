package k7e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function3 {
    public Subaccount A;
    public Object B;
    public io3.d C;
    public io3.d D;
    public int E;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f182038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f182039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f182040y;
    public FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, f fVar, Continuation continuation) {
        super(3, continuation);
        this.f182039x = fVar;
        this.f182040y = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        f fVar = this.f182039x;
        b bVar = new b(this.f182040y, fVar, (Continuation) obj4);
        bVar.v = (FlowCollector) obj2;
        bVar.f182038w = obj3;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x014e, code lost:
    
        if (r2 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7e.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
