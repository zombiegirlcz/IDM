package dk6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends i implements Function2 {
    public final /* synthetic */ OpenBankingBrazilPayment.EditableDateField A;
    public int u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f115458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f115459x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f115460y;
    public final /* synthetic */ ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar, String str, boolean z, boolean z3, ArrayList arrayList, OpenBankingBrazilPayment.EditableDateField editableDateField, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f115458w = str;
        this.f115459x = z;
        this.f115460y = z3;
        this.z = arrayList;
        this.A = editableDateField;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f115458w, this.f115459x, this.f115460y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            OpenBankingBrazilPayment.EditableDateField editableDateField = this.A;
            com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar = this.v;
            g gVar = new g(dVar, this.f115458w, this.f115459x, this.f115460y, this.z, editableDateField, null);
            this.u = 1;
            if (dVar.p2(this, gVar) == aVar) {
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
