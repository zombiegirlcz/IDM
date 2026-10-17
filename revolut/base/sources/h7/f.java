package h7;

import androidx.compose.runtime.MutableState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import skm.w1;

/* JADX INFO: loaded from: classes23.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ u A;
    public final /* synthetic */ d7.j B;
    public final /* synthetic */ float C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ r F;
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f149777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f149778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f149779y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, int i, int i2, boolean z, float f, u uVar, d7.j jVar2, float f4, boolean z3, boolean z4, r rVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f149777w = i;
        this.f149778x = i2;
        this.f149779y = z;
        this.z = f;
        this.A = uVar;
        this.B = jVar2;
        this.C = f4;
        this.D = z3;
        this.E = z4;
        this.F = rVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f149777w, this.f149778x, this.f149779y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineContext coroutineContext;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                jVar.h(this.f149777w);
                MutableState mutableState = jVar.f149792a;
                MutableState mutableState2 = jVar.f149794c;
                int i2 = this.f149778x;
                mutableState2.setValue(Integer.valueOf(i2));
                jVar.d.setValue(Boolean.valueOf(this.f149779y));
                MutableState mutableState3 = jVar.f;
                float f = this.z;
                mutableState3.setValue(Float.valueOf(f));
                jVar.e.setValue(this.A);
                MutableState mutableState4 = jVar.i;
                d7.j jVar2 = this.B;
                mutableState4.setValue(jVar2);
                jVar.i(this.C);
                jVar.f149795g.setValue(Boolean.valueOf(this.D));
                if (!this.E) {
                    jVar.f149798l.setValue(Long.MIN_VALUE);
                }
                if (jVar2 == null) {
                    mutableState.setValue(Boolean.FALSE);
                    return Unit.f186387a;
                }
                if (Float.isInfinite(f)) {
                    jVar.i(((Number) jVar.f149799m.getValue()).floatValue());
                    mutableState.setValue(Boolean.FALSE);
                    jVar.h(i2);
                    return Unit.f186387a;
                }
                mutableState.setValue(Boolean.TRUE);
                int i3 = e.f149773a[this.F.ordinal()];
                if (i3 == 1) {
                    coroutineContext = w1.f264016b;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    coroutineContext = kotlin.coroutines.g.f186406a;
                }
                d dVar = new d(this.F, skm.e0.t(getContext()), this.f149778x, this.f149777w, this.v, null);
                this.u = 1;
                if (skm.e0.J(coroutineContext, dVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            skm.e0.p(getContext());
            j.b(jVar, false);
            return Unit.f186387a;
        } catch (Throwable th10) {
            j.b(jVar, false);
            throw th10;
        }
    }
}
