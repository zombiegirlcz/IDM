package dk6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import do3.q;
import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i implements Function1 {
    public final /* synthetic */ OpenBankingBrazilPayment.EditableDateField A;
    public int u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f115455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f115456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f115457y;
    public final /* synthetic */ ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar, String str, boolean z, boolean z3, ArrayList arrayList, OpenBankingBrazilPayment.EditableDateField editableDateField, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f115455w = str;
        this.f115456x = z;
        this.f115457y = z3;
        this.z = arrayList;
        this.A = editableDateField;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f115455w, this.f115456x, this.f115457y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            OpenBankingBrazilPayment.EditableDateField editableDateField = this.A;
            com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar = this.v;
            f fVar = new f(dVar, this.f115455w, this.f115456x, this.f115457y, this.z, editableDateField, null);
            this.u = 1;
            if (q.t(dVar, fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
