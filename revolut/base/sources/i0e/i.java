package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
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

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f157369w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f157369w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f157369w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f157369w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f157369w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        n updateUserActionState;
        Object value2;
        n updateUserActionState2;
        Object value3;
        n updateUserActionState3;
        int i = this.u;
        m mVar = this.f157369w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                re model = (re) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                q qVar = (q) mVar.d;
                qVar.getClass();
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
                        j2 j2Var = qVar.f157387t;
                        do {
                            value = j2Var.getValue();
                            updateUserActionState = (n) j2Var.getValue();
                            Intrinsics.checkNotNullParameter(updateUserActionState, "$this$updateUserActionState");
                        } while (!j2Var.h(value, n.a(updateUserActionState, new StatementPeriod(localDate, (LocalDate) ref$ObjectRef.f186409a))));
                    }
                }
                return Unit.f186387a;
            case 1:
                Pair pair2 = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                re model2 = (re) pair2.f186385a;
                int iIntValue2 = ((Number) pair2.f186386b).intValue();
                q qVar2 = (q) mVar.d;
                qVar2.getClass();
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
                        j2 j2Var2 = qVar2.f157387t;
                        do {
                            value2 = j2Var2.getValue();
                            updateUserActionState2 = (n) j2Var2.getValue();
                            Intrinsics.checkNotNullParameter(updateUserActionState2, "$this$updateUserActionState");
                        } while (!j2Var2.h(value2, n.a(updateUserActionState2, new StatementPeriod((LocalDate) ref$ObjectRef2.f186409a, localDate3))));
                    }
                }
                return Unit.f186387a;
            default:
                Pair pair3 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a10 model3 = (a10) pair3.f186385a;
                int iIntValue3 = ((Number) pair3.f186386b).intValue();
                q qVar3 = (q) mVar.d;
                qVar3.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                String[] elements = {"TAX_VALUES_ITEM_ID", "CALENDAR_YEAR_VALUES_ITEM_ID"};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (kotlin.collections.d.y0(elements).contains(model3.f163363a)) {
                    c10 c10Var = (c10) zhm.d0.e0(iIntValue3, model3.f163364b);
                    Object obj12 = c10Var != null ? c10Var.f163673b : null;
                    StatementPeriod statementPeriod = obj12 instanceof StatementPeriod ? (StatementPeriod) obj12 : null;
                    if (statementPeriod != null) {
                        j2 j2Var3 = qVar3.f157387t;
                        do {
                            value3 = j2Var3.getValue();
                            updateUserActionState3 = (n) j2Var3.getValue();
                            Intrinsics.checkNotNullParameter(updateUserActionState3, "$this$updateUserActionState");
                        } while (!j2Var3.h(value3, n.a(updateUserActionState3, statementPeriod)));
                    }
                }
                return Unit.f186387a;
        }
    }
}
