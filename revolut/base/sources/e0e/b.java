package e0e;

import a09.z;
import a0e.w;
import a0e.x;
import cli.y;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.impl.ui.documents_hub.period.bottom_sheet.StatementPeriodSelectorBottomSheet;
import ip0.a10;
import ip0.re;
import ip0.ue;
import ip0.vd;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StatementPeriodSelectorBottomSheet f121568w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StatementPeriodSelectorBottomSheet statementPeriodSelectorBottomSheet, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121568w = statementPeriodSelectorBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f121568w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f121568w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b(this.f121568w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
            case 3:
                b bVar4 = new b(this.f121568w, continuation, 3);
                bVar4.v = obj2;
                return bVar4;
            default:
                b bVar5 = new b(this.f121568w, continuation, 4);
                bVar5.v = obj2;
                return bVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StatementPeriod statementPeriodCopy$default;
        int i = this.u;
        StatementPeriodSelectorBottomSheet statementPeriodSelectorBottomSheet = this.f121568w;
        switch (i) {
            case 0:
                ai aiVar = (ai) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Iterator<E> it8 = StatementPeriodType.getEntries().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((StatementPeriodType) next).name(), aiVar.f53687a)) {
                            obj = next;
                        }
                    }
                }
                StatementPeriodType type = (StatementPeriodType) obj;
                if (type != null) {
                    h hVarM3 = statementPeriodSelectorBottomSheet.R2();
                    hVarM3.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    y yVar = hVarM3.f121576s;
                    e eVar = (e) ((j2) yVar.f22677a).getValue();
                    Set set = eVar.f121570b;
                    StatementPeriod statementPeriodF = eVar.f121571c;
                    xxd.b bVar = eVar.f121569a;
                    if (set.contains(type)) {
                        StatementPeriodSelection statementPeriodSelection = bVar.f309510c;
                        StatementPeriod statementPeriod = bVar.f309508a;
                        boolean z = statementPeriodSelection.f88217a == StatementPeriodType.ALL_TIME;
                        switch (g.f121572a[type.ordinal()]) {
                            case 1:
                                w wVar = hVarM3.f121575r;
                                List list = ((e) ((j2) yVar.f22677a).getValue()).e;
                                wVar.getClass();
                                statementPeriodF = w.f(list, statementPeriodF);
                                hVarM3.H2(yVar, new z(type, z, statementPeriodF, 20));
                                hVarM3.f121573p.p(new StatementPeriodSelection(type, statementPeriodF));
                                break;
                            case 2:
                                hVarM3.f121574q.getClass();
                                statementPeriodF = bzd.a.b(bzd.a.a(statementPeriod), statementPeriodF);
                                hVarM3.H2(yVar, new z(type, z, statementPeriodF, 20));
                                hVarM3.f121573p.p(new StatementPeriodSelection(type, statementPeriodF));
                                break;
                            case 3:
                                if (z) {
                                }
                                hVarM3.H2(yVar, new z(type, z, statementPeriodF, 20));
                                hVarM3.f121573p.p(new StatementPeriodSelection(type, statementPeriodF));
                            case 4:
                                statementPeriodF = statementPeriod;
                                hVarM3.H2(yVar, new z(type, z, statementPeriodF, 20));
                                hVarM3.f121573p.p(new StatementPeriodSelection(type, statementPeriodF));
                                break;
                            case 5:
                            case 6:
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return Unit.f186387a;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a10 model = (a10) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                h hVarM32 = statementPeriodSelectorBottomSheet.R2();
                hVarM32.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                y yVar2 = hVarM32.f121576s;
                List list2 = ((e) ((j2) yVar2.f22677a).getValue()).e;
                StatementPeriod statementPeriod2 = (StatementPeriod) d0.e0(iIntValue, list2);
                if (statementPeriod2 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.m("Selected Tax Year at index ", iIntValue, list2.size(), ", but only ", " were generated"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                } else {
                    w wVar2 = hVarM32.f121575r;
                    StatementPeriod statementPeriod3 = ((e) ((j2) yVar2.f22677a).getValue()).f121571c;
                    wVar2.getClass();
                    if (!statementPeriod2.equals(w.f(list2, statementPeriod3))) {
                        hVarM32.H2(yVar2, new x(statementPeriod2, 3));
                        hVarM32.f121573p.p(new StatementPeriodSelection(StatementPeriodType.TAX_YEAR, statementPeriod2));
                    }
                }
                return Unit.f186387a;
            case 2:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                re model2 = (re) pair2.f186385a;
                int iIntValue2 = ((Number) pair2.f186386b).intValue();
                h hVarM33 = statementPeriodSelectorBottomSheet.R2();
                hVarM33.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                ue ueVar = (ue) d0.e0(iIntValue2, model2.f166162b.f166510b);
                Object obj3 = ueVar != null ? ueVar.f166647b : null;
                LocalDate localDate = obj3 instanceof LocalDate ? (LocalDate) obj3 : null;
                if (localDate != null) {
                    bzd.a aVar4 = hVarM33.f121574q;
                    y yVar3 = hVarM33.f121576s;
                    StatementPeriod statementPeriod4 = ((e) ((j2) yVar3.f22677a).getValue()).f121569a.f309508a;
                    aVar4.getClass();
                    StatementPeriod statementPeriodB = bzd.a.b(bzd.a.a(statementPeriod4), ((e) ((j2) yVar3.f22677a).getValue()).f121571c);
                    LocalDate end2 = statementPeriodB.getEnd();
                    int iCompareTo = localDate.compareTo((ChronoLocalDate) end2);
                    LocalDate localDate2 = end2;
                    if (iCompareTo > 0) {
                        ue ueVar2 = (ue) d0.e0(iIntValue2, model2.f166163c.f166510b);
                        Object obj4 = ueVar2 != null ? ueVar2.f166647b : null;
                        obj = obj4 instanceof LocalDate ? (LocalDate) obj4 : null;
                        if (obj != null) {
                            localDate2 = obj;
                            hVarM33.I2(new StatementPeriod(localDate, localDate2), statementPeriodB);
                        }
                    } else {
                        hVarM33.I2(new StatementPeriod(localDate, localDate2), statementPeriodB);
                    }
                }
                return Unit.f186387a;
            case 3:
                Pair pair3 = (Pair) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                re model3 = (re) pair3.f186385a;
                int iIntValue3 = ((Number) pair3.f186386b).intValue();
                h hVarM34 = statementPeriodSelectorBottomSheet.R2();
                hVarM34.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                ue ueVar3 = (ue) d0.e0(iIntValue3, model3.f166163c.f166510b);
                Object obj5 = ueVar3 != null ? ueVar3.f166647b : null;
                LocalDate localDate3 = obj5 instanceof LocalDate ? (LocalDate) obj5 : null;
                if (localDate3 != null) {
                    bzd.a aVar6 = hVarM34.f121574q;
                    y yVar4 = hVarM34.f121576s;
                    StatementPeriod statementPeriod5 = ((e) ((j2) yVar4.f22677a).getValue()).f121569a.f309508a;
                    aVar6.getClass();
                    StatementPeriod statementPeriodB2 = bzd.a.b(bzd.a.a(statementPeriod5), ((e) ((j2) yVar4.f22677a).getValue()).f121571c);
                    LocalDate start = statementPeriodB2.getStart();
                    int iCompareTo2 = start.compareTo((ChronoLocalDate) localDate3);
                    LocalDate localDate4 = start;
                    if (iCompareTo2 > 0) {
                        ue ueVar4 = (ue) d0.e0(iIntValue3, model3.f166162b.f166510b);
                        Object obj6 = ueVar4 != null ? ueVar4.f166647b : null;
                        obj = obj6 instanceof LocalDate ? (LocalDate) obj6 : null;
                        if (obj != null) {
                            localDate4 = obj;
                            hVarM34.I2(new StatementPeriod(localDate4, localDate3), statementPeriodB2);
                        }
                    } else {
                        hVarM34.I2(new StatementPeriod(localDate4, localDate3), statementPeriodB2);
                    }
                }
                return Unit.f186387a;
            default:
                vd clickData = (vd) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarM35 = statementPeriodSelectorBottomSheet.R2();
                Intrinsics.h(clickData);
                hVarM35.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                y yVar5 = hVarM35.f121576s;
                StatementPeriod statementPeriod6 = ((e) ((j2) yVar5.f22677a).getValue()).f121571c;
                g5 g5Var = clickData.f166806a;
                LocalDate localDate5 = clickData.f166807b;
                String str = g5Var.f54184a;
                if (!Intrinsics.f(str, "statement-date-from-picker")) {
                    if (Intrinsics.f(str, "statement-date-to-picker")) {
                        statementPeriodCopy$default = StatementPeriod.copy$default(statementPeriod6, null, localDate5, 1, null);
                    }
                    return Unit.f186387a;
                }
                statementPeriodCopy$default = StatementPeriod.copy$default(statementPeriod6, localDate5, null, 2, null);
                hVarM35.H2(yVar5, new doe.c(statementPeriodCopy$default, clickData, 27));
                hVarM35.f121573p.p(new StatementPeriodSelection(StatementPeriodType.CUSTOM, statementPeriodCopy$default));
                return Unit.f186387a;
        }
    }
}
