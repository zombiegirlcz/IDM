package ij4;

import com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.ValuatorsListScreen;
import ho6.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ValuatorsListScreen f161699w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ValuatorsListScreen valuatorsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f161699w = valuatorsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f161699w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f161699w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f161699w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((iy3.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((iy3.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ValuatorsListScreen valuatorsListScreen = this.f161699w;
        switch (i) {
            case 0:
                iy3.b valuator = (iy3.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarR2 = valuatorsListScreen.R2();
                jVarR2.getClass();
                Intrinsics.checkNotNullParameter(valuator, "valuator");
                jVarR2.H2(jVarR2.f161707p, new ii4.b(valuator, 4));
                break;
            case 1:
                String city = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarR22 = valuatorsListScreen.R2();
                Intrinsics.h(city);
                jVarR22.getClass();
                Intrinsics.checkNotNullParameter(city, "city");
                jVarR22.H2(jVarR22.f161707p, new n(city, 28));
                break;
            default:
                iy3.b valuator2 = (iy3.b) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarR23 = valuatorsListScreen.R2();
                jVarR23.getClass();
                Intrinsics.checkNotNullParameter(valuator2, "valuator");
                jVarR23.C2(new h(valuator2));
                break;
        }
        return Unit.f186387a;
    }
}
