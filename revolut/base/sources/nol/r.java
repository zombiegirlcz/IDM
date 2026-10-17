package nol;

import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f218095w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.sso.impl.ui.phone.change_flow.b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f218095w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, this.f218095w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.sso.impl.ui.phone.change_flow.b bVar = this.v;
            wi0.b bVarE = bVar.f106656r.e(this.f218095w);
            EnterPhoneScreenContract$InputData.Mode.Create.PhoneData.CountryOnly countryOnly = bVarE != null ? new EnterPhoneScreenContract$InputData.Mode.Create.PhoneData.CountryOnly(bVarE) : null;
            this.u = 1;
            if (com.revolut.sso.impl.ui.phone.change_flow.b.K2(bVar, countryOnly, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
