package c0l;

import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfm.r;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b f20299x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b bVar, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f20299x = bVar;
        this.f20298w = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f20299x, this.f20298w, continuation);
            default:
                return new f(this.f20298w, this.f20299x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    r rVarS = this.f20299x.o.s(new xel.d(this.f20298w));
                    this.v = 1;
                    if (nim.a.a(rVarS, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b bVar = this.f20299x;
                if (i2 == 0) {
                    o.b(obj2);
                    ArrayList arrayList = this.f20298w;
                    if (!arrayList.isEmpty()) {
                        f fVar = new f(bVar, arrayList, (Continuation) null);
                        this.v = 1;
                        if (u0.b0(bVar.X(), "CONTINUE_BUTTON_LOADING_TAG", fVar, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar.C2(new c(false));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArrayList arrayList, com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f20298w = arrayList;
        this.f20299x = bVar;
    }
}
