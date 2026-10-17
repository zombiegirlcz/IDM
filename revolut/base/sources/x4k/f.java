package x4k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import gim.i;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import r4k.j;
import skm.g0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function3 {
    public j A;
    public boolean B;
    public boolean C;
    public int D;
    public /* synthetic */ n61.d E;
    public /* synthetic */ Clause F;
    public final /* synthetic */ kq2.a G;
    public final /* synthetic */ g0 H;
    public final /* synthetic */ prf.g I;
    public final /* synthetic */ g0 J;
    public final /* synthetic */ g0 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ j M;
    public final /* synthetic */ g0 N;
    public kq2.a u;
    public kq2.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n61.d f302888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public prf.g f302889x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TransferTrustData f302890y;
    public Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kq2.a aVar, g0 g0Var, prf.g gVar, g0 g0Var2, g0 g0Var3, boolean z, j jVar, g0 g0Var4, Continuation continuation) {
        super(3, continuation);
        this.G = aVar;
        this.H = g0Var;
        this.I = gVar;
        this.J = g0Var2;
        this.K = g0Var3;
        this.L = z;
        this.M = jVar;
        this.N = g0Var4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        j jVar = this.M;
        g0 g0Var = this.N;
        f fVar = new f(this.G, this.H, this.I, this.J, this.K, this.L, jVar, g0Var, (Continuation) obj4);
        fVar.E = (n61.d) obj2;
        fVar.F = (Clause) obj3;
        return fVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4k.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
