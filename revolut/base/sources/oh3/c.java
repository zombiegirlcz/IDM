package oh3;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import gim.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public Object A;
    public FlowCollector B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ List J;
    public final /* synthetic */ f K;
    public final /* synthetic */ AccountWrapper L;
    public final /* synthetic */ dj0.d M;
    public f u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f225277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f225278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f225279y;
    public BalanceWrapper z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, f fVar, AccountWrapper accountWrapper, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.J = list;
        this.K = fVar;
        this.L = accountWrapper;
        this.M = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.J, this.K, this.L, this.M, continuation);
        cVar.I = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0154, code lost:
    
        if (r0.emit((java.util.List) r2, r16) == r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0115 -> B:11:0x004c). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oh3.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
