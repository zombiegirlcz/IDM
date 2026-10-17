package lm3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lhk.a0;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.contacts.impl.ui_kompot.add_contact.a f196875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f196876x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar, a aVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f196875w = aVar;
        this.f196876x = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f196875w, this.f196876x, continuation, 0);
            default:
                return new m(this.f196875w, this.f196876x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objW;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar2 = this.f196875w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jpc.e eVar = aVar2.f66021r;
                    this.v = 1;
                    objW = eVar.W(this.f196876x, this);
                    if (objW == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objW = obj2;
                }
                vm3.g gVar = (vm3.g) objW;
                if (gVar instanceof vm3.f) {
                    com.revolut.feature.contacts.impl.ui_kompot.add_contact.a.I2(aVar2, ((vm3.f) gVar).f290528a);
                } else if (gVar instanceof vm3.d) {
                    zm3.a aVar3 = ((vm3.d) gVar).f290526a;
                    aVar2.u.getClass();
                    yji.l.a1(aVar2, aVar2.X1(new y0("ALREADY_EXISTS_DIALOG_ID", new z(new TextLocalisedClause(R$string.contacts_add_contact_error_already_exists, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_ok, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new a0(aVar2, aVar3, null, 2), 3);
                } else {
                    if (!(gVar instanceof vm3.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.J2();
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar5 = this.f196875w;
                    m mVar = new m(aVar5, this.f196876x, null, 0);
                    this.v = 1;
                    if (aVar5.p2(this, mVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
