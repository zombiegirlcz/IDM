package dk6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lf6.j;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ OpenBankingBrazilPayment.EditableDateField A;
    public int u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f115452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f115453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f115454y;
    public final /* synthetic */ ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar, String str, boolean z, boolean z3, ArrayList arrayList, OpenBankingBrazilPayment.EditableDateField editableDateField, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f115452w = str;
        this.f115453x = z;
        this.f115454y = z3;
        this.z = arrayList;
        this.A = editableDateField;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f115452w, this.f115453x, this.f115454y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a aVar = dVar.o;
            this.u = 1;
            j jVar = (j) ((com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b) aVar).f72410a;
            jVar.getClass();
            lf6.i iVar = new lf6.i(jVar, this.f115452w, this.z, this.A, this.f115454y, this.f115453x, null);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, iVar, this);
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
            o.b(obj2);
        }
        dVar.B2();
        return Unit.f186387a;
    }
}
