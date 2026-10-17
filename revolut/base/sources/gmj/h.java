package gmj;

import dfj.h1;
import dfj.i1;
import gmj.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f144868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f144869x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f144870y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f144868w = str;
        this.f144869x = str2;
        this.f144870y = str3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f144868w, this.f144869x, this.f144870y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            i1 i1Var = iVar.f144871p;
            this.u = 1;
            i1Var.getClass();
            h1 h1Var = new h1(i1Var, this.f144869x, this.f144870y, this.f144868w, null, 1);
            p0 p0Var = p0.f264001a;
            if (e0.J(elm.f.f127540b, h1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        iVar.C2(f.a.f144864a);
        return Unit.f186387a;
    }
}
