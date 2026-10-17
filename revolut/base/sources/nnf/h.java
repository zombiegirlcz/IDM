package nnf;

import aw0.o9;
import com.google.protobuf.f3;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.wj;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import nii.n1;
import nnj.o;
import nnj.p;
import noc.q;
import noc.r;
import noc.w;
import pcd.s;
import tof.a3;
import tof.fc;
import uo.h0;
import yhm.m;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217619a;

    public /* synthetic */ h(int i) {
        this.f217619a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objA;
        w4d.h hVar;
        int i = 4;
        switch (this.f217619a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (a3) d0.b0(it8);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new pb0("LIST_ID_WAITING_FOR_REFUND");
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.a(nb0Var, "ID_LIST_LOADING_NOT_ABLE_TO_INSTALL_ESIM", false, 6), nb0.a(nb0Var, "ID_LIST_LOADING_ESIM_INSTALLED_BUT_NOT_WORKING", false, 6), nb0.a(nb0Var, "ID_LIST_LOADING_DEVICE_IS_CARRIER_BLOCKED", false, 6), nb0.a(nb0Var, "ID_LIST_LOADING_ACCIDENTAL_PURCHASE", false, 6), nb0.a(nb0Var, "ID_LIST_LOADING_REFUND_REASON_OTHER", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new p(listK, o.HIDDEN);
            case 3:
                return nnk.c.a((nnk.c) obj2, null, 1);
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                return new nnk.f(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), f0.f322471a, u.c(new wj("LIST_ID_LOADING")));
            case 5:
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                h0 h0Var = h0.f281482a;
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    if (h0.f281483b == null) {
                        synchronized (h0Var) {
                            try {
                                if (h0.f281483b == null) {
                                    h0.f281483b = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
                                }
                                Unit unit = Unit.f186387a;
                            } finally {
                            }
                        }
                    }
                    Method method = h0.f281483b;
                    objA = (String) (method != null ? method.invoke(null, "sys.oem_unlock_allowed") : null);
                    if (objA == null) {
                        objA = "";
                    }
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (objA instanceof yhm.n) {
                    objA = "-1";
                }
                com.bumptech.glide.c.x(buildStruct, "status", (String) objA);
                return Unit.f186387a;
            case 6:
                f3 buildStruct2 = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct2, "$this$buildStruct");
                com.bumptech.glide.c.t(buildStruct2, "secured", Boolean.TRUE);
                return Unit.f186387a;
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new nob.f((djb.a) pair.f186386b, (s) pair.f186385a);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new nob.h(u.c(new s7("AUTO_PAYMENTS_DATA_LOADING_ID", 0, 0, 0, 0, false, null, 126)), new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 9:
                ListSubheaderDelegate.Model it9 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.f52715m;
                if (obj3 instanceof q) {
                    return (q) obj3;
                }
                return null;
            case 10:
                ListSubheaderDelegate.Model it10 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj4 = it10.f52715m;
                if (obj4 instanceof q) {
                    return (q) obj4;
                }
                return null;
            case 11:
                LargeActionButtonDelegate.Model it11 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.i instanceof r);
            case 12:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new noc.v((List) pair2.f186385a, (RoboPortfolioInfo) pair2.f186386b);
            case 13:
                Template template = (Template) obj2;
                Intrinsics.checkNotNullParameter(template, "template");
                return new w(template);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new noe.f(f0.f322471a);
            case 15:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                nof.l lVar = (nof.l) pair3.f186385a;
                nof.l other = (nof.l) u1.l((Optional) pair3.f186386b);
                if (other == null) {
                    return lVar;
                }
                List list = other.f218037a;
                if (list.isEmpty()) {
                    return lVar;
                }
                lVar.getClass();
                Intrinsics.checkNotNullParameter(other, "other");
                return new nof.l(d0.E0(list, lVar.f218037a), fc.c(lVar.f218038b, other.f218038b));
            case 16:
                nof.l it12 = (nof.l) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                List list2 = it12.f218037a;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it13 = list2.iterator();
                while (it13.hasNext()) {
                    arrayList.add(((a3) it13.next()).f272581b);
                }
                return d0.i1(arrayList);
            case 17:
                nof.l it14 = (nof.l) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return u1.a(it14);
            case 18:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 5, null);
            case 19:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                Object obj5 = pair4.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj5, "component2(...)");
                Boolean bool = (Boolean) obj5;
                bool.booleanValue();
                return bool;
            case 20:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                return pair5.f186385a;
            case 21:
                Intrinsics.checkNotNullParameter((n1) obj2, "it");
                return Unit.f186387a;
            case 22:
                Data it15 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15.getContent() != null);
            case 23:
                jpc.c breakdown = (jpc.c) obj2;
                Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                dj0.d dVar = breakdown.f177253a;
                dj0.d dVar2 = breakdown.f177254b;
                dj0.d dVarH = pyd.c.H(dVar, dVar2);
                long j2 = dVarH.f115082a;
                if (j2 < 0) {
                    j2 = 0;
                }
                return new npc.i(dVar, dVar2, dj0.d.c(dVarH, j2, null, 2));
            case 24:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                List list3 = config.P0;
                if (list3 != null) {
                    List list4 = list3;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it16 = list4.iterator();
                    while (it16.hasNext()) {
                        arrayList2.add(((e7l.h) it16.next()).f123408a);
                    }
                    Set setI1 = d0.i1(arrayList2);
                    if (setI1 != null) {
                        return setI1;
                    }
                }
                return zhm.h0.f322473a;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var2 = pb0.Companion;
                List listK2 = v.k(nb0.b(nb0Var2, "LOADING_ROW_ID1", false, 0, false, 30), nb0.b(nb0Var2, "LOADING_ROW_ID2", false, 0, false, 30), nb0.b(nb0Var2, "LOADING_ROW_ID3", false, 0, false, 30));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return new nqd.e(listK2);
            case 26:
                Pair it17 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                List<yw4.a> list5 = ((yw4.b) it17.f186386b).f317316b;
                ArrayList arrayList3 = new ArrayList();
                for (yw4.a aVar : list5) {
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    int i2 = nr4.a.f218527a[aVar.ordinal()];
                    if (i2 == 1) {
                        hVar = new w4d.h(new TextLocalisedClause(R$string.credit_card_settings_display_amount_toggle_option_spent, null, null, 14), "SPENT");
                    } else if (i2 == 2) {
                        hVar = new w4d.h(new TextLocalisedClause(R$string.credit_card_settings_display_amount_toggle_option_available, null, null, 14), "AVAILABLE");
                    } else {
                        if (i2 != 3 && i2 != 4 && i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar = null;
                    }
                    if (hVar != null) {
                        arrayList3.add(hVar);
                    }
                }
                return new w4d.i(((PersistedBackground) it17.f186385a).f63743a.f63742b, ((yw4.b) it17.f186386b).f317315a.name(), arrayList3);
            case 27:
                InstrumentTicker ticker = (InstrumentTicker) obj2;
                Intrinsics.checkNotNullParameter(ticker, "ticker");
                ej0.b bVar = ticker.f;
                if (bVar != null) {
                    return bVar.f126703a;
                }
                return null;
            case 28:
                return new BigDecimal(String.valueOf(((d1b.b) obj2).getClose()));
            default:
                Pair pair6 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair6, "<destruct>");
                return ((Optional) pair6.f186386b).map(new bpd.a(new njf.e((List) pair6.f186385a, i), 12));
        }
    }

    public /* synthetic */ h(cli.n nVar, int i) {
        this.f217619a = i;
    }
}
