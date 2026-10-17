package ueg;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import ip0.gu;
import ip0.pb0;
import ip0.wa0;
import ip0.yl;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279414a;

    public /* synthetic */ p0(int i) {
        this.f279414a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object bVar;
        zh9.i iVar;
        zh9.h hVar;
        zh9.i iVar2;
        cVar = null;
        zh9.c cVar = null;
        int i = 0;
        z = false;
        z = false;
        boolean z = false;
        switch (this.f279414a) {
            case 0:
                v update = (v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v.a(update, null, null, null, null, null, null, null, null, null, null, null, null, i0.DATES_GUESTS_EXPANDED, null, null, null, null, null, false, null, null, null, null, 8384511);
            case 1:
                v update2 = (v) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return v.a(update2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, h0.LOADING, null, null, zhm.f0.f322471a, 2621439);
            case 2:
                v update3 = (v) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return v.a(update3, null, null, null, null, null, null, null, null, null, null, null, null, null, u.COLLAPSED, null, null, null, null, false, null, null, null, null, 8380415);
            case 3:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, h0.IDLE, null, null, zhm.f0.f322471a, 2621439);
            case 4:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, h0.IDLE, null, null, null, 7864319);
            case 5:
                uek.f it8 = (uek.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f279469a;
            case 6:
                List inboxItems = (List) obj2;
                Intrinsics.checkNotNullParameter(inboxItems, "inboxItems");
                if (inboxItems.isEmpty()) {
                    return v30.e0.f285765a;
                }
                List<s69.d> listV0 = zhm.d0.V0(inboxItems, 20);
                s69.d dVar = (s69.d) listV0.get(0);
                for (s69.d dVar2 : listV0) {
                    if (dVar2.d == s69.f.CREATED) {
                        i++;
                    }
                    if (dVar2.f260160c.isAfter(dVar.f260160c)) {
                        dVar = dVar2;
                    }
                }
                String str = dVar.f;
                Instant instantOfEpochMilli = Instant.ofEpochMilli(dVar.f260160c.getMillis());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                return new v30.d0(str, instantOfEpochMilli, i);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new pf4.u(zhm.f0.f322471a, new pf4.r(null), true, null, false, SyslogConstants.LOG_CLOCK);
            case 8:
                Data incentiveRewardDetailsContentData = new Data(null, null, true, 3, null);
                ((uf7.k) obj2).getClass();
                Intrinsics.checkNotNullParameter(incentiveRewardDetailsContentData, "incentiveRewardDetailsContentData");
                return new uf7.k(incentiveRewardDetailsContentData);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                wa0 wa0Var = new wa0();
                yp0.b.l(wa0Var, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                List listK = zhm.v.k(wa0Var, new yl("LOADING_SECTION_TITLE_LIST_ID", 0, 30));
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    arrayList.add(new pb0(a0.d.n("LOADING_SECTION_ITEM_LIST_ID_PREFIX_", it9.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new uf7.x(i2b.a.o(listK, arrayList), uf7.p.f279616a);
            case 10:
                do3.n it10 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                String str2 = it10.f116408a;
                do3.u uVar = it10.f116423x;
                return new ugc.e(str2, uVar != null ? uVar.f116432a : null);
            case 11:
                LocationDomain it11 = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.h hVar2 = od0.i.Companion;
                co3.a aVar = new co3.a(it11.f78066a, it11.f78067b);
                hVar2.getClass();
                return od0.h.a(aVar);
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = zhm.u.c(new gu("loadingItemId1", 0, 0, 30));
                List listK2 = zhm.v.k(new pb0("loadingItemId2"), new pb0("loadingItemId3"));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return zhm.d0.E0(listK2, listC);
            case 13:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                List<ehl.w> list = it12;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                for (ehl.w wVar : list) {
                    HashMap map = hhl.b.f152423a;
                    Intrinsics.checkNotNullParameter(wVar, "<this>");
                    ehl.v vVar = wVar.d;
                    if (vVar != null) {
                        String str3 = wVar.f126297a;
                        ZonedDateTime zonedDateTime = wVar.f126298b;
                        ZonedDateTime zonedDateTime2 = wVar.f126299c;
                        String str4 = vVar.f126292a;
                        String str5 = vVar.f126293b;
                        dj0.d dVarV = hx7.a.v(vVar.f126294c);
                        float f = vVar.d;
                        jo3.b bVar2 = vVar.e;
                        dj0.d dVarV2 = bVar2 != null ? hx7.a.v(bVar2) : null;
                        jo3.b bVar3 = vVar.f;
                        dj0.d dVarV3 = bVar3 != null ? hx7.a.v(bVar3) : null;
                        jo3.b bVar4 = vVar.f126295g;
                        bVar = new bfl.f(str3, zonedDateTime, zonedDateTime2, str4, str5, dVarV, f, dVarV2, dVarV3, bVar4 != null ? hx7.a.v(bVar4) : null, bfl.g.valueOf(vVar.f126296h));
                    } else {
                        ehl.d dVar3 = wVar.e;
                        if (dVar3 != null) {
                            bVar = new bfl.a(wVar.f126297a, wVar.f126298b, wVar.f126299c, hx7.a.v(dVar3.f126240a), bfl.g.valueOf(dVar3.f126241b));
                        } else {
                            ehl.g gVar = wVar.f;
                            if (gVar != null) {
                                bVar = new bfl.c(wVar.f126297a, wVar.f126298b, wVar.f126299c, gVar.f126246a, gVar.f126247b, hx7.a.v(gVar.f126248c));
                            } else {
                                ehl.h hVar3 = wVar.f126300g;
                                if (hVar3 != null) {
                                    bVar = new bfl.d(wVar.f126297a, wVar.f126298b, wVar.f126299c, hVar3.f126249a, hVar3.f126250b, hx7.a.v(hVar3.f126251c));
                                } else {
                                    ehl.f fVar = wVar.f126301h;
                                    if (fVar == null) {
                                        throw new IllegalStateException("Should not get here");
                                    }
                                    bVar = new bfl.b(wVar.f126297a, wVar.f126298b, wVar.f126299c, hx7.a.v(fVar.f126245a));
                                }
                            }
                        }
                    }
                    arrayList2.add(bVar);
                }
                return new Data(arrayList2, null, false, 6, null);
            case 14:
                ehl.w it13 = (ehl.w) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                od0.h hVar4 = od0.i.Companion;
                ZonedDateTime zonedDateTime3 = it13.f126298b;
                hVar4.getClass();
                return new uhl.d(od0.h.a(zonedDateTime3), zhm.h0.f322473a);
            case 15:
                ohl.b events = (ohl.b) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                return events.getItems();
            case 16:
                ui0.d it14 = (ui0.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Integer.valueOf(it14.f280280a);
            case 17:
                ui0.d it15 = (ui0.d) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Integer.valueOf(it15.f280281b);
            case 18:
                ui0.d it16 = (ui0.d) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Integer.valueOf(it16.f280282c);
            case 19:
                od0.i managementOpt = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(managementOpt, "managementOpt");
                zh9.i0 i0Var = (zh9.i0) managementOpt.f224257a;
                return Boolean.valueOf(((i0Var == null || (iVar = i0Var.f322286b) == null || (hVar = iVar.f) == null) ? 0 : cp5.c.t(hVar)) > 50);
            case 20:
                return Boolean.valueOf(((Integer) obj2).intValue() == 0);
            case 21:
                od0.i managementOpt2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(managementOpt2, "managementOpt");
                zh9.i0 i0Var2 = (zh9.i0) managementOpt2.f224257a;
                if (i0Var2 != null && (iVar2 = i0Var2.f322286b) != null) {
                    cVar = iVar2.f322282c;
                }
                int i2 = cVar == null ? -1 : ui9.u.f280349a[cVar.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        z = true;
                    } else if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                al4.i it17 = (al4.i) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                it17.getClass();
                return Boolean.valueOf(!(it17 instanceof al4.h));
            case 23:
                l35.e it18 = (l35.e) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                it18.getClass();
                return Boolean.valueOf(it18 instanceof l35.c);
            case 24:
                return uid.a.a((uid.a) obj2, null, 15);
            case 25:
                uif.a it19 = (uif.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Integer.valueOf(it19.f280421b.f60260a);
            case 26:
                uif.a it20 = (uif.a) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Long.valueOf(it20.f280420a);
            case 27:
                al0.a state = (al0.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(state == al0.a.ONLINE);
            case 28:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new Data(null, it21, false, 5, null);
            default:
                return ((uj6.k) obj2).f280496b;
        }
    }

    public /* synthetic */ p0(cli.n nVar, int i) {
        this.f279414a = i;
    }
}
