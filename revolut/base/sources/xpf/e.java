package xpf;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.api.R$string;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import gim.i;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferScreen f307964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ScheduleTransferScreen scheduleTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307964w = scheduleTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f307964w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f307964w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f307964w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScheduleTransferScreen scheduleTransferScreen = this.f307964w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVarT2 = scheduleTransferScreen.T2();
                Intrinsics.h(listId);
                h hVar = (h) bVarT2;
                l80.e eVar = hVar.f307968s;
                zpf.b bVar = hVar.f307967r;
                j60.a aVar2 = hVar.f307966q;
                Intrinsics.checkNotNullParameter(listId, "listId");
                int iHashCode = listId.hashCode();
                if (iHashCode == -1893067809) {
                    if (listId.equals("SCHEDULED_DATE_FIELD_ID")) {
                        l80.f fVar = (l80.f) eVar;
                        LocalDateTime localDateTimeB = n1l.b.b(((a) hVar.t2()).f307958a, fVar.f());
                        LocalDate localDateE = ((a) hVar.t2()).e;
                        if (localDateE == null) {
                            localDateE = fVar.e();
                        }
                        LocalDate localDate = ((a) hVar.t2()).f;
                        zpf.a aVar3 = zpf.b.Companion;
                        aVar2.x(new y(((zpf.e) bVar).b(localDateTimeB, localDateE, localDate, "DATE_PICKER_SCHEDULE_DATE_FIELD_ID"), new t(new TextLocalisedClause(R$string.transfer_schedule_selector_start_date_title, null, null, 14), null, null, 30), l.WINDOW, null, null, null, 1016));
                        return Unit.f186387a;
                    }
                    throw new IllegalStateException(p.a.p("Unsupported row id ", listId, " clicked"));
                }
                if (iHashCode == -1189353927) {
                    if (listId.equals("ENDS_ON_FIELD_ID")) {
                        TransferScheduleData data = ((a) hVar.t2()).f307958a;
                        ((zpf.e) bVar).getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        List listK = v.k(new SingleChoiceDelegate.Model("BOTTOM_ENDS_ON_NEVER_FIELD_ID", new TextLocalisedClause(R$string.transfer_schedule_selector_recurring_mode_never, null, null, 14), data.f104287c instanceof TransferScheduleEndsOn.Never, null, null, 2040), new SingleChoiceDelegate.Model("BOTTOM_ENDS_ON_DATE_FIELD_ID", new TextLocalisedClause(R$string.transfer_schedule_ends_on_option_end_date, null, null, 14), data.f104287c instanceof TransferScheduleEndsOn.Date, null, null, 2040));
                        yp0.b.k(listK, 0, 0, 0, 0, 31);
                        aVar2.x(new y(listK, new t(new TextLocalisedClause(R$string.transfer_schedule_ends_on_title, null, null, 14), null, null, 30), l.WINDOW, null, null, null, 1016));
                        return Unit.f186387a;
                    }
                    throw new IllegalStateException(p.a.p("Unsupported row id ", listId, " clicked"));
                }
                if (iHashCode == 934907076 && listId.equals("REPEAT_FIELD_ID")) {
                    List paymentPeriods = hVar.f307965p.e;
                    TransferScheduleData data2 = ((a) hVar.t2()).f307958a;
                    ((zpf.e) bVar).getClass();
                    Intrinsics.checkNotNullParameter(paymentPeriods, "paymentPeriods");
                    Intrinsics.checkNotNullParameter(data2, "data");
                    List<jli.c> list = paymentPeriods;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    for (jli.c cVar : list) {
                        arrayList.add(new SingleChoiceDelegate.Model("BOTTOM_REPEAT_FIELD_ID" + cVar, zpf.e.a(cVar), cVar == data2.f104286b, null, cVar, YearClass.CLASS_2008));
                    }
                    yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                    aVar2.x(new y(arrayList, new t(new TextLocalisedClause(R$string.transfer_schedule_selector_recurring_mode_title, null, null, 14), null, null, 30), l.WINDOW, null, null, null, 1016));
                    return Unit.f186387a;
                }
                throw new IllegalStateException(p.a.p("Unsupported row id ", listId, " clicked"));
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String listId2 = (String) pair.f186385a;
                LocalDate date = (LocalDate) pair.f186386b;
                b bVarT22 = scheduleTransferScreen.T2();
                Intrinsics.h(date);
                h hVar2 = (h) bVarT22;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                Intrinsics.checkNotNullParameter(date, "date");
                hVar2.x2(new wtl.f(listId2, 26, date, hVar2));
                j60.a.v(hVar2.f307966q, true, null, 2);
                return Unit.f186387a;
            default:
                String id10 = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVarT23 = scheduleTransferScreen.T2();
                Intrinsics.h(id10);
                h hVar3 = (h) bVarT23;
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("REMOVE_MENU_ITEM_ID")) {
                    hVar3.v2(new dpf.b(new TransferScheduleData(0L, (jli.c) null, 7)));
                } else if (id10.equals("SKIP_MENU_ITEM_ID")) {
                    hVar3.C1(new BridgeDestination(new FinishCommand(null, null, null, 7)));
                }
                return Unit.f186387a;
        }
    }
}
