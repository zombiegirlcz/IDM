package flf;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.postal_check.api.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rp0.k1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f135967w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
        this.f135967w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f135967w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        n nVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jr1.f fVar = nVar.f135969m;
            this.u = 1;
            fr1.b bVar = fVar.f177930a;
            bVar.getClass();
            fr1.a aVar = new fr1.a(bVar, this.f135967w, continuation, 0);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, aVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
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
        ((k1) nVar.f135970n).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "ID_RECEIPT_REQUEST_SUCCESS", new TextLocalisedClause(R$string.postal_check_request_receipt_success, null, null, 14), null, null, null, 60));
        return Unit.f186387a;
    }
}
