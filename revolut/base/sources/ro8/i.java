package ro8;

import cli.y;
import com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation.PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f255944w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f255944w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f255944w, continuation, 0);
            default:
                return new i(this.f255944w, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                j jVar = this.f255944w;
                y yVar = jVar.f255946q;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    String str = ((d) ((j2) yVar.f22677a).getValue()).f255933a;
                    PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod phoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod = ((d) ((j2) yVar.f22677a).getValue()).f255935c;
                    if (phoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod instanceof PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod.Profile) {
                        k18.c cVar = jVar.o;
                        this.v = 1;
                        if (cVar.n(str, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (!(phoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod instanceof PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod.RemoteLoginInvitation)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zq.a aVar2 = jVar.f255945p;
                        this.v = 2;
                        if (aVar2.f(str, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    j jVar2 = this.f255944w;
                    i iVar = new i(jVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(jVar2.X(), "LOADING_CONFIRM_ACTION", iVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
