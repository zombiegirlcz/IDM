package m64;

import com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.RequestConsentScreenContract$InputData;
import ft3.h1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ku1.v;
import nii.c0;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.y0;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f203005w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f203005w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f203005w, continuation, 0);
            case 1:
                return new i(this.f203005w, continuation, 1);
            default:
                return new i(this.f203005w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        k kVar;
        Object objV;
        int i = this.u;
        k kVar2 = this.f203005w;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    kVar2.X1(new y0(null, new c0(null, null, null, true, null, false, false, null, 1903), false, 5));
                    pw3.a aVar2 = kVar2.f203007p;
                    h1 h1Var = kVar2.o.f67226a;
                    this.v = 1;
                    t24.d dVar = aVar2.f240317a;
                    dVar.getClass();
                    t24.b bVar = new t24.b(dVar, h1Var, continuation, 0);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, bVar, this);
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objJ = obj2;
                }
                kVar2.C2(new d((it3.d) objJ));
                return Unit.f186387a;
            case 1:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    pw3.a aVar3 = kVar2.f203007p;
                    RequestConsentScreenContract$InputData requestConsentScreenContract$InputData = kVar2.o;
                    h1 h1Var2 = requestConsentScreenContract$InputData.f67226a;
                    CoBorrower coBorrower = requestConsentScreenContract$InputData.d;
                    t24.d dVar2 = aVar3.f240317a;
                    dVar2.getClass();
                    t24.c cVar = new t24.c(coBorrower, dVar2, h1Var2, null);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, cVar, this);
                    if (objJ2 != obj3) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 != obj3) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 != obj3) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                k kVar3 = this.f203005w;
                if (i6 == 0) {
                    o.b(obj2);
                    lic.a aVar5 = new lic.a(kVar3, 2);
                    v vVar = new v(kVar3, 4);
                    i iVar = new i(kVar3, continuation, i2);
                    this.v = 1;
                    kVar = kVar3;
                    objV = n14.k.V(kVar, null, aVar5, vVar, iVar, this, 1);
                    if (objV == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    kVar = kVar3;
                    objV = obj2;
                }
                nii.h hVar = (nii.h) objV;
                if (hVar instanceof nii.f) {
                    n1 n1Var = ((nii.f) hVar).f216147b;
                    iu3.c cVar2 = kVar.o.f67228c.d;
                    if (n1Var instanceof l1) {
                        kVar.I2(cVar2.f168463c.f168460b);
                    } else if (n1Var instanceof m1) {
                        iu3.b bVar2 = cVar2.d;
                        if (bVar2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        kVar.I2(bVar2.f168460b);
                    }
                } else {
                    if (!(hVar instanceof nii.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.C2(e.f203000a);
                }
                return Unit.f186387a;
        }
    }
}
