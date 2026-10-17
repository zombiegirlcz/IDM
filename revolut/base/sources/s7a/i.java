package s7a;

import android.content.Context;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.picker.PickerController;
import com.revolut.tracking.v3.ItemPickerSearchContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PickerController f260608w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(PickerController pickerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f260608w = pickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f260608w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f260608w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i(this.f260608w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i(this.f260608w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i(this.f260608w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            case 5:
                i iVar6 = new i(this.f260608w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
            case 6:
                i iVar7 = new i(this.f260608w, continuation, 6);
                iVar7.v = obj2;
                return iVar7;
            case 7:
                i iVar8 = new i(this.f260608w, continuation, 7);
                iVar8.v = obj2;
                return iVar8;
            case 8:
                i iVar9 = new i(this.f260608w, continuation, 8);
                iVar9.v = obj2;
                return iVar9;
            case 9:
                i iVar10 = new i(this.f260608w, continuation, 9);
                iVar10.v = obj2;
                return iVar10;
            case 10:
                i iVar11 = new i(this.f260608w, continuation, 10);
                iVar11.v = obj2;
                return iVar11;
            default:
                i iVar12 = new i(this.f260608w, continuation, 11);
                iVar12.v = obj2;
                return iVar12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((ItemPickerSearchContext) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PickerController pickerController = this.f260608w;
        switch (i) {
            case 0:
                ItemPickerSearchContext itemPickerSearchContext = (ItemPickerSearchContext) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                AnalyticsContext analyticsContext = pickerController.Y;
                AnalyticsContext.INSTANCE.getClass();
                pickerController.Y = new AnalyticsContext(AnalyticsContext.Companion.a(itemPickerSearchContext));
                Context context = pickerController.D2().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                py0.f fVarN0 = jh.d.f(context).n0();
                View viewD2 = pickerController.D2();
                String query = itemPickerSearchContext.getQuery();
                Intrinsics.checkNotNullExpressionValue(query, "getQuery(...)");
                fVarN0.i(viewD2, query);
                pickerController.Y = analyticsContext;
                return Unit.f186387a;
            case 1:
                Object obj3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.picker.a aVar3 = (com.revolut.feature.picker.a) pickerController.R2();
                aVar3.getClass();
                b0 b0Var = obj3 instanceof b0 ? (b0) obj3 : null;
                if (b0Var != null) {
                    if (!(b0Var instanceof b0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m70.a.c(t0.f186434a);
                    aVar3.W0("");
                }
                return Unit.f186387a;
            case 2:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.picker.a) pickerController.R2()).J2(aVar4.d, aVar4.f275445a);
                return Unit.f186387a;
            case 3:
                String str = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0 j0VarR2 = pickerController.R2();
                Intrinsics.h(str);
                ((com.revolut.feature.picker.a) j0VarR2).W0(str);
                return Unit.f186387a;
            case 4:
                lw0.l lVar = (lw0.l) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.picker.a) pickerController.R2()).L2(lVar.a());
                return Unit.f186387a;
            case 5:
                ty0.a aVar8 = (ty0.a) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.picker.a) pickerController.R2()).J2(aVar8.d, aVar8.f275445a);
                return Unit.f186387a;
            case 6:
                Boolean bool = (Boolean) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0 j0VarR22 = pickerController.R2();
                Intrinsics.h(bool);
                ((com.revolut.feature.picker.a) j0VarR22).M2(bool.booleanValue());
                return Unit.f186387a;
            case 7:
                String str2 = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0 j0VarR23 = pickerController.R2();
                Intrinsics.h(str2);
                ((com.revolut.feature.picker.a) j0VarR23).L2(str2);
                return Unit.f186387a;
            case 8:
                String str3 = (String) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0 j0VarR24 = pickerController.R2();
                Intrinsics.h(str3);
                ((com.revolut.feature.picker.a) j0VarR24).W0(str3);
                return Unit.f186387a;
            case 9:
                ty0.a aVar13 = (ty0.a) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.picker.a) pickerController.R2()).J2(aVar13.d, aVar13.f275445a);
                return Unit.f186387a;
            case 10:
                ty0.a aVar15 = (ty0.a) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.picker.a) pickerController.R2()).J2(aVar15.d, aVar15.f275445a);
                return Unit.f186387a;
            default:
                Boolean bool2 = (Boolean) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0 j0VarR25 = pickerController.R2();
                Intrinsics.h(bool2);
                ((com.revolut.feature.picker.a) j0VarR25).M2(bool2.booleanValue());
                return Unit.f186387a;
        }
    }
}
