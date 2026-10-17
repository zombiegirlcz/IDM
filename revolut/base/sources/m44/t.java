package m44;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f202664w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f202664w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f202664w, continuation, 0);
            default:
                return new t(this.f202664w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object[] objArr = 0;
        u uVar = this.f202664w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    hw3.c cVar = uVar.f202665p;
                    gv3.b bVar = ((e) uVar.t2()).f202649b;
                    if (bVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String str = bVar.f147045a;
                    gv3.b bVar2 = ((e) uVar.t2()).f202650c;
                    String str2 = bVar2 != null ? bVar2.f147045a : null;
                    cu3.c addressRequest = new cu3.c(str, str2);
                    String applicationId = uVar.f202666q.f66957a.f66892b;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(addressRequest, "addressRequest");
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    p24.p pVar = cVar.f156055a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(addressRequest, "addressRequest");
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    CreditPluginsService creditPluginsService = pVar.f232057c;
                    Object obj3 = n14.b.f211238a;
                    Intrinsics.checkNotNullParameter(addressRequest, "<this>");
                    d0<vz3.e> d0VarPostAddress = creditPluginsService.postAddress(applicationId, new vz3.d(str, str2));
                    p24.l lVar = p24.l.f;
                    o0.a aVar2 = new o0.a(13);
                    d0VarPostAddress.getClass();
                    ufm.i iVar = new ufm.i(d0VarPostAddress, aVar2, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.n nVarI0 = w.i0(iVar);
                    this.v = 1;
                    if (nim.a.b(nVarI0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                uVar.v2(k.f202656a);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    t tVar = new t(uVar, objArr == true ? 1 : 0, 0);
                    this.v = 1;
                    if (uVar.p2(this, tVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
