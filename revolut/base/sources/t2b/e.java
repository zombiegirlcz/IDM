package t2b;

import gim.i;
import java.math.BigDecimal;
import k4l.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nel.n;
import p2b.l;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ BigDecimal A;
    public final /* synthetic */ BigDecimal B;
    public final /* synthetic */ BigDecimal C;
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f8l.e f267529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f267530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ BigDecimal f267531y;
    public final /* synthetic */ bfl.g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, f8l.e eVar, n nVar, BigDecimal bigDecimal, bfl.g gVar, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f267529w = eVar;
        this.f267530x = nVar;
        this.f267531y = bigDecimal;
        this.z = gVar;
        this.A = bigDecimal2;
        this.B = bigDecimal3;
        this.C = bigDecimal4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f267529w, this.f267530x, this.f267531y, this.z, this.A, this.B, this.C, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e0 e0Var = (e0) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = this.v;
        l lVar = fVar.f267533b;
        u2b.a aVar2 = fVar.f267534c;
        Float f = e0Var.k;
        BigDecimal bigDecimal = f != null ? new BigDecimal(String.valueOf(f.floatValue())) : null;
        aVar2.getClass();
        return lVar.a(u2b.a.a(this.f267529w, this.f267530x, this.f267531y, this.z, this.A, this.B, bigDecimal, this.C));
    }
}
