package cu8;

import com.revolut.shared.feature.move_money.api.model.MoveMoneyReason;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public /* synthetic */ Object C;
    public Object D;
    public Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f108885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f108886x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f108887y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, ks8.c cVar, Continuation continuation) {
        super(2, continuation);
        this.G = r0Var;
        this.F = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q0 q0Var = new q0((r0) this.G, (ks8.c) this.F, continuation);
                q0Var.C = obj2;
                return q0Var;
            default:
                return new q0((m8l.g) this.f108886x, this.f108885w, (j8l.d) this.f108887y, (j8l.h) this.z, (String) this.A, (Map) this.B, (MoveMoneyReason) this.C, (Integer) this.D, (j8l.j) this.E, (String) this.F, (j8l.h) this.G, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0305  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu8.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(m8l.g gVar, long j2, j8l.d dVar, j8l.h hVar, String str, Map map, MoveMoneyReason moveMoneyReason, Integer num, j8l.j jVar, String str2, j8l.h hVar2, Continuation continuation) {
        super(2, continuation);
        this.f108886x = gVar;
        this.f108885w = j2;
        this.f108887y = dVar;
        this.z = hVar;
        this.A = str;
        this.B = map;
        this.C = moveMoneyReason;
        this.D = num;
        this.E = jVar;
        this.F = str2;
        this.G = hVar2;
    }
}
