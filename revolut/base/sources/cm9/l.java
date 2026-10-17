package cm9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_with_smile.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_with_smile.impl.ui.settings.a f25174w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.pay_with_smile.impl.ui.settings.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f25174w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f25174w, continuation, 0);
            default:
                return new l(this.f25174w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ql9.d dVar = this.f25174w.o;
                    this.v = 1;
                    dVar.getClass();
                    qc8.b bVar = new qc8.b(dVar, continuation, 9);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, bVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.pay_with_smile.impl.ui.settings.a aVar2 = this.f25174w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    l lVar = new l(aVar2, continuation, 0);
                    this.v = 1;
                    if (aVar2.p2(this, lVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.a1(aVar2, aVar2.X1(new mii.k("ID_PAY_WITH_SMILE_DISABLED", new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_opt_out_success_title, null, null, 14), null, null, null, 28)), null, null, new c65.i(aVar2, continuation, 26), 3);
        }
    }
}
