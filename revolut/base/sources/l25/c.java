package l25;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f191622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f191623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f191624y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(u uVar, String str, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f191622w = uVar;
        this.f191623x = str;
        this.f191624y = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f191622w, this.f191623x, this.f191624y, continuation, 0);
            default:
                return new c(this.f191622w, this.f191623x, this.f191624y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                u uVar = this.f191622w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    w wVar = uVar.f191655w;
                    this.v = 1;
                    if (wVar.b(this.f191623x, this.f191624y, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return uVar.L2(new mii.f("id_credit_card_boleto_cancel_success", new TextLocalisedClause(R$string.credit_card_boleto_cancelled, null, null, 14), null, null, null, null, 124));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar2 = this.f191622w;
                c cVar = new c(uVar2, this.f191623x, this.f191624y, null, 0);
                this.v = 1;
                Object objY2 = uVar2.Y2(this, cVar);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }
}
