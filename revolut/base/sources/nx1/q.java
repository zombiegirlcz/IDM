package nx1;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import skm.k0;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Throwable f220076w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ long f220077x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        Throwable th10 = (Throwable) obj3;
        Number number = (Number) obj4;
        switch (this.u) {
            case 0:
                long jLongValue = number.longValue();
                q qVar = new q(4, 0, (Continuation) obj5);
                qVar.f220076w = th10;
                qVar.f220077x = jLongValue;
                return qVar.invokeSuspend(Unit.f186387a);
            case 1:
                long jLongValue2 = number.longValue();
                q qVar2 = new q(4, 1, (Continuation) obj5);
                qVar2.f220076w = th10;
                qVar2.f220077x = jLongValue2;
                return qVar2.invokeSuspend(Unit.f186387a);
            case 2:
                long jLongValue3 = number.longValue();
                q qVar3 = new q(4, 2, (Continuation) obj5);
                qVar3.f220076w = th10;
                qVar3.f220077x = jLongValue3;
                return qVar3.invokeSuspend(Unit.f186387a);
            default:
                long jLongValue4 = number.longValue();
                q qVar4 = new q(4, 3, (Continuation) obj5);
                qVar4.f220076w = th10;
                qVar4.f220077x = jLongValue4;
                return qVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Throwable th10 = this.f220076w;
                long j2 = this.f220077x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                boolean z = true;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (!(th10 instanceof j) || j2 >= 3) {
                        z = false;
                    } else {
                        long j3 = (1 + j2) * CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
                        this.f220076w = null;
                        this.f220077x = j2;
                        this.v = 1;
                        if (k0.b(j3, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(z);
            case 1:
                Throwable th11 = this.f220076w;
                long j5 = this.f220077x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                boolean z3 = true;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (!(th11 instanceof px1.d) || j5 >= 3) {
                        z3 = false;
                    } else {
                        long j16 = (1 + j5) * CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
                        this.f220076w = null;
                        this.f220077x = j5;
                        this.v = 1;
                        if (k0.b(j16, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(z3);
            case 2:
                Throwable th12 = this.f220076w;
                long j22 = this.f220077x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    if (j22 >= 10 || !(th12 instanceof rg3.f)) {
                        return Boolean.FALSE;
                    }
                    long j42 = j22 == 0 ? 100L : 1000L;
                    this.f220076w = null;
                    this.f220077x = j22;
                    this.v = 1;
                    if (k0.b(j42, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.TRUE;
            default:
                Throwable th13 = this.f220076w;
                long j46 = this.f220077x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    if (j46 >= 10 || !(th13 instanceof sx2.j)) {
                        return Boolean.FALSE;
                    }
                    long j47 = j46 == 0 ? 100L : 1000L;
                    this.f220076w = null;
                    this.f220077x = j46;
                    this.v = 1;
                    if (k0.b(j47, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.TRUE;
        }
    }
}
