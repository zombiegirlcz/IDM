package b79;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f12954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f12955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f12956y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, String str, String str2, String str3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12954w = mVar;
        this.f12955x = str;
        this.f12956y = str2;
        this.z = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f12954w, this.f12955x, this.f12956y, this.z, continuation, 0);
            default:
                return new k(this.f12954w, this.f12955x, this.f12956y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                m mVar = this.f12954w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    u69.d dVar = mVar.f12959a;
                    String str = this.f12955x;
                    v69.b bVarB = dVar.b(str);
                    if ((bVarB != null ? mVar.f12961c.n(bVarB) : null) == null) {
                        return Unit.f186387a;
                    }
                    efm.b bVarHideMessage = mVar.f12960b.hideMessage(str, m.a(str, this.f12956y, this.z));
                    this.v = 1;
                    if (nim.a.a(bVarHideMessage, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                efm.b bVarB2 = mVar.b();
                this.v = 2;
                if (nim.a.a(bVarB2, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                String str2 = this.f12955x;
                m mVar2 = this.f12954w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    v69.b bVarB3 = mVar2.f12959a.b(str2);
                    s69.d dVarN = bVarB3 != null ? mVar2.f12961c.n(bVarB3) : null;
                    if (dVarN == null || dVarN.d == s69.f.OPENED) {
                        return Unit.f186387a;
                    }
                    efm.b messageOpen = mVar2.f12960b.setMessageOpen(str2, m.a(str2, this.f12956y, this.z));
                    this.v = 1;
                    if (nim.a.a(messageOpen, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                mVar2.d(u.c(str2), s69.f.OPENED, null);
                return Unit.f186387a;
        }
    }
}
