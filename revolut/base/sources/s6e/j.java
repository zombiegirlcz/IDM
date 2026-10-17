package s6e;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ z C;
    public SubaccountType[] u;
    public SubaccountType v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SubaccountType[] f260289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f260290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f260291y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z zVar, Continuation continuation) {
        super(2, continuation);
        this.C = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.C, continuation);
        jVar.B = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        if (r3.emit(r14, r13) != r4) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
