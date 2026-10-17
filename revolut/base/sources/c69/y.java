package c69;

import com.revolut.feature.masav.impl.model.DirectDebitData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.masav.impl.ui.form.c f21745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ DirectDebitData f21746x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.masav.impl.ui.form.c cVar, DirectDebitData directDebitData, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21745w = cVar;
        this.f21746x = directDebitData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f21745w, this.f21746x, continuation, 0);
            default:
                return new y(this.f21745w, this.f21746x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    DirectDebitData directDebitData = this.f21746x;
                    com.revolut.feature.masav.impl.ui.form.c cVar = this.f21745w;
                    com.revolut.feature.masav.impl.ui.form.a aVar2 = new com.revolut.feature.masav.impl.ui.form.a(cVar, directDebitData, null);
                    this.v = 1;
                    if (u0.b0(cVar.X(), "BUTTON_LOADING_TAG", aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    DirectDebitData directDebitData2 = this.f21746x;
                    com.revolut.feature.masav.impl.ui.form.c cVar2 = this.f21745w;
                    com.revolut.feature.masav.impl.ui.form.b bVar = new com.revolut.feature.masav.impl.ui.form.b(cVar2, directDebitData2, null);
                    this.v = 1;
                    if (u0.b0(cVar2.X(), "BUTTON_LOADING_TAG", bVar, this) == aVar3) {
                        return aVar3;
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
