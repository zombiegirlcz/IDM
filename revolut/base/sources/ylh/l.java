package ylh;

import ip0.a10;
import ip0.c10;
import ip0.re;
import ip0.te;
import ip0.ue;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f314717w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f314717w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f314717w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f314717w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(this.f314717w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        q updateUserActionState;
        Object value2;
        q updateUserActionState2;
        Object value3;
        q updateUserActionState3;
        int i = this.u;
        p pVar = this.f314717w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                re model = (re) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                t tVar = (t) pVar.d;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f166161a;
                te teVar = model.f166163c;
                ArrayList<ue> arrayList = teVar.f166510b;
                if (str.equals("MONTH_VALUES_ITEM_ID")) {
                    ue ueVar = (ue) zhm.d0.e0(iIntValue, model.f166162b.f166510b);
                    Object obj3 = ueVar != null ? ueVar.f166647b : null;
                    LocalDate localDate = obj3 instanceof LocalDate ? (LocalDate) obj3 : null;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Integer num = teVar.f166511c;
                    if (num == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ue ueVar2 = (ue) zhm.d0.e0(num.intValue(), arrayList);
                    Object obj4 = ueVar2 != null ? ueVar2.f166647b : null;
                    LocalDate localDate2 = obj4 instanceof LocalDate ? (LocalDate) obj4 : null;
                    ref$ObjectRef.f186409a = localDate2;
                    if (localDate != null && localDate2 != null) {
                        if (localDate.compareTo((ChronoLocalDate) localDate2) > 0) {
                            for (ue ueVar3 : arrayList) {
                                Object obj5 = ueVar3.f166647b;
                                Intrinsics.i(obj5, "null cannot be cast to non-null type java.time.LocalDate");
                                if (((LocalDate) obj5).compareTo((ChronoLocalDate) localDate) >= 0) {
                                    Object obj6 = ueVar3.f166647b;
                                    Intrinsics.i(obj6, "null cannot be cast to non-null type java.time.LocalDate");
                                    ref$ObjectRef.f186409a = (LocalDate) obj6;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        j2 j2Var = tVar.f314735t;
                        do {
                            value = j2Var.getValue();
                            updateUserActionState = (q) j2Var.getValue();
                            Intrinsics.checkNotNullParameter(updateUserActionState, "$this$updateUserActionState");
                        } while (!j2Var.h(value, q.a(updateUserActionState, new a(localDate, (LocalDate) ref$ObjectRef.f186409a))));
                    }
                }
                return Unit.f186387a;
            case 1:
                Pair pair2 = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                re model2 = (re) pair2.f186385a;
                int iIntValue2 = ((Number) pair2.f186386b).intValue();
                t tVar2 = (t) pVar.d;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                String str2 = model2.f166161a;
                te teVar2 = model2.f166162b;
                ArrayList arrayList2 = teVar2.f166510b;
                if (str2.equals("MONTH_VALUES_ITEM_ID")) {
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Integer num2 = teVar2.f166511c;
                    if (num2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ue ueVar4 = (ue) zhm.d0.e0(num2.intValue(), arrayList2);
                    Object obj7 = ueVar4 != null ? ueVar4.f166647b : null;
                    ref$ObjectRef2.f186409a = obj7 instanceof LocalDate ? (LocalDate) obj7 : null;
                    ue ueVar5 = (ue) zhm.d0.e0(iIntValue2, model2.f166163c.f166510b);
                    Object obj8 = ueVar5 != null ? ueVar5.f166647b : null;
                    LocalDate localDate3 = obj8 instanceof LocalDate ? (LocalDate) obj8 : null;
                    Object obj9 = ref$ObjectRef2.f186409a;
                    if (obj9 != null && localDate3 != null) {
                        if (((LocalDate) obj9).compareTo((ChronoLocalDate) localDate3) > 0) {
                            for (ue ueVar6 : zhm.d0.I0(arrayList2)) {
                                Object obj10 = ueVar6.f166647b;
                                Intrinsics.i(obj10, "null cannot be cast to non-null type java.time.LocalDate");
                                if (((LocalDate) obj10).compareTo((ChronoLocalDate) localDate3) <= 0) {
                                    Object obj11 = ueVar6.f166647b;
                                    Intrinsics.i(obj11, "null cannot be cast to non-null type java.time.LocalDate");
                                    ref$ObjectRef2.f186409a = (LocalDate) obj11;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        j2 j2Var2 = tVar2.f314735t;
                        do {
                            value2 = j2Var2.getValue();
                            updateUserActionState2 = (q) j2Var2.getValue();
                            Intrinsics.checkNotNullParameter(updateUserActionState2, "$this$updateUserActionState");
                        } while (!j2Var2.h(value2, q.a(updateUserActionState2, new a((LocalDate) ref$ObjectRef2.f186409a, localDate3))));
                    }
                }
                return Unit.f186387a;
            default:
                Pair pair3 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a10 model3 = (a10) pair3.f186385a;
                int iIntValue3 = ((Number) pair3.f186386b).intValue();
                t tVar3 = (t) pVar.d;
                tVar3.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                if (Intrinsics.f(model3.f163363a, "TAX_VALUES_ITEM_ID")) {
                    c10 c10Var = (c10) zhm.d0.e0(iIntValue3, model3.f163364b);
                    Object obj12 = c10Var != null ? c10Var.f163673b : null;
                    a aVar4 = obj12 instanceof a ? (a) obj12 : null;
                    if (aVar4 != null) {
                        j2 j2Var3 = tVar3.f314735t;
                        do {
                            value3 = j2Var3.getValue();
                            updateUserActionState3 = (q) j2Var3.getValue();
                            Intrinsics.checkNotNullParameter(updateUserActionState3, "$this$updateUserActionState");
                        } while (!j2Var3.h(value3, q.a(updateUserActionState3, aVar4)));
                    }
                }
                return Unit.f186387a;
        }
    }
}
