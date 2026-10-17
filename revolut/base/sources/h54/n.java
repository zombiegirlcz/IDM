package h54;

import j54.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ it3.d f149484x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, it3.d dVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149483w = dVar;
        this.f149484x = dVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f149483w, this.f149484x, continuation, 0);
            case 1:
                return new n(this.f149483w, this.f149484x, continuation, 1);
            case 2:
                return new n(this.f149483w, this.f149484x, continuation, 2);
            case 3:
                return new n(this.f149483w, this.f149484x, continuation, 3);
            case 4:
                return new n(this.f149483w, this.f149484x, continuation, 4);
            default:
                return new n(this.f149483w, this.f149484x, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar = this.f149483w;
                    m mVar = new m(dVar, this.f149484x, null, 0);
                    this.v = 1;
                    if (dVar.p2(this, mVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar = this.f149483w.H;
                    String str = this.f149484x.f168323a;
                    this.v = 1;
                    j54.y yVar = (j54.y) vVar;
                    mri.w wVar = yVar.f171584l;
                    mri.w.r0(wVar, str);
                    pw5.a.w(wVar);
                    yVar.r2().M0(new t.a(null, str));
                    if (Unit.f186387a == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar2 = this.f149483w;
                m mVar2 = new m(dVar2, this.f149484x, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(dVar2.k, "cancel application", mVar2, this);
                return objB == aVar3 ? aVar3 : objB;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar3 = this.f149483w;
                    m mVar3 = new m(dVar3, this.f149484x, null, 3);
                    this.v = 1;
                    if (dVar3.p2(this, mVar3) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar2 = this.f149483w.H;
                    String str2 = this.f149484x.f168323a;
                    this.v = 1;
                    j54.y yVar2 = (j54.y) vVar2;
                    mri.w wVar2 = yVar2.f171584l;
                    mri.w.r0(wVar2, str2);
                    pw5.a.w(wVar2);
                    yVar2.r2().M0(new t.a(null, str2));
                    if (Unit.f186387a == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar4 = this.f149483w;
                m mVar4 = new m(dVar4, this.f149484x, null, 5);
                this.v = 1;
                Object objB2 = pu7.a.B(dVar4.k, "cancel application", mVar4, this);
                return objB2 == aVar6 ? aVar6 : objB2;
        }
    }
}
