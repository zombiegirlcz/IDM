package aqd;

import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f8379b;

    public /* synthetic */ n1(int i, Boolean bool) {
        this.f8378a = i;
        this.f8379b = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8378a) {
            case 0:
                t tVar = (t) obj2;
                Boolean bool = this.f8379b;
                Intrinsics.h(bool);
                return t.a(tVar, null, null, null, null, bool.booleanValue(), null, !bool.booleanValue() ? null : tVar.f8405g, 47);
            case 1:
                Boolean bool2 = this.f8379b;
                Intrinsics.h(bool2);
                return bg2.g.a((bg2.g) obj2, null, null, null, null, null, null, bool2.booleanValue(), null, 7679);
            case 2:
                Boolean bool3 = this.f8379b;
                Intrinsics.h(bool3);
                return bs9.o.a((bs9.o) obj2, null, null, bool3.booleanValue(), false, false, null, null, 0, null, null, null, 8187);
            case 3:
                cul.v update = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Boolean bool4 = this.f8379b;
                Intrinsics.h(bool4);
                return cul.v.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, bool4.booleanValue(), null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 8191);
            case 4:
                Boolean bool5 = this.f8379b;
                Intrinsics.h(bool5);
                return dm3.e.a((dm3.e) obj2, null, null, null, null, null, bool5.booleanValue(), null, false, false, null, 3967);
            case 5:
                Boolean bool6 = this.f8379b;
                Intrinsics.h(bool6);
                return grc.a.a((grc.a) obj2, null, null, bool6.booleanValue(), 3);
            case 6:
                Boolean bool7 = this.f8379b;
                Intrinsics.h(bool7);
                return gs2.i.a((gs2.i) obj2, null, null, null, null, null, null, bool7.booleanValue(), null, 191);
            case 7:
                return hl6.g.a((hl6.g) obj2, null, null, zi0.c.P(this.f8379b, false, null, 3), null, null, 27);
            case 8:
                return jck.o.a((jck.o) obj2, null, new Data(this.f8379b, null, false, 6, null), 1);
            case 9:
                Boolean bool8 = this.f8379b;
                Intrinsics.h(bool8);
                return ka2.h.a((ka2.h) obj2, false, bool8.booleanValue(), null, null, 13);
            case 10:
                lg5.e eVar = (lg5.e) obj2;
                Boolean bool9 = this.f8379b;
                Intrinsics.h(bool9);
                boolean zBooleanValue = bool9.booleanValue();
                boolean z = eVar.f195069b;
                eVar.getClass();
                return new lg5.e(zBooleanValue, z);
            case 11:
                Boolean bool10 = this.f8379b;
                Intrinsics.h(bool10);
                return n09.l.a((n09.l) obj2, null, bool10.booleanValue(), null, false, 13);
            case 12:
                Map splitBills = (Map) obj2;
                Intrinsics.checkNotNullParameter(splitBills, "splitBills");
                Boolean bool11 = this.f8379b;
                Intrinsics.h(bool11);
                return new njf.a(bool11.booleanValue(), splitBills);
            case 13:
                Boolean bool12 = this.f8379b;
                Intrinsics.h(bool12);
                return o23.w.a((o23.w) obj2, null, null, null, null, null, false, null, null, null, null, bool12.booleanValue(), null, 28671);
            case 14:
                return ocb.g.a((ocb.g) obj2, null, false, null, false, false, null, null, this.f8379b, null, false, false, false, null, false, null, 32639);
            case 15:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                Boolean bool13 = this.f8379b;
                Intrinsics.h(bool13);
                boolean zBooleanValue2 = bool13.booleanValue();
                ArrayList arrayListE0 = zhm.d0.E0(list2, list);
                ArrayList arrayList = new ArrayList(zhm.w.t(arrayListE0, 10));
                Iterator it8 = arrayListE0.iterator();
                while (it8.hasNext()) {
                    arrayList.add(wh.a((wh) it8.next(), null, null, null, 16367));
                }
                return new oqk.t(arrayList, zBooleanValue2, !r2.isEmpty());
            case 16:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list3 = (List) pair2.f186385a;
                List list4 = (List) pair2.f186386b;
                Boolean bool14 = this.f8379b;
                Intrinsics.h(bool14);
                boolean zBooleanValue3 = bool14.booleanValue();
                Intrinsics.h(list4);
                ArrayList arrayListE02 = zhm.d0.E0(list4, list3);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListE02, 10));
                Iterator it9 = arrayListE02.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(wh.a((wh) it9.next(), null, null, null, 16367));
                }
                return new oqk.t(arrayList2, zBooleanValue3, !r2.isEmpty());
            case 17:
                Boolean bool15 = this.f8379b;
                Intrinsics.h(bool15);
                return q22.a.a((q22.a) obj2, null, null, null, null, null, null, null, false, bool15.booleanValue(), 255);
            case 18:
                Boolean bool16 = this.f8379b;
                Intrinsics.h(bool16);
                return q22.a.a((q22.a) obj2, null, null, null, null, null, null, null, bool16.booleanValue(), false, 383);
            case 19:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                if (!(command instanceof FragmentNavigateCommand)) {
                    return command;
                }
                Boolean bool17 = Boolean.TRUE;
                Boolean bool18 = this.f8379b;
                if (Intrinsics.f(bool18, bool17)) {
                    return ngm.n.g((FragmentNavigateCommand) command);
                }
                if (Intrinsics.f(bool18, Boolean.FALSE)) {
                    return ngm.n.h((FragmentNavigateCommand) command);
                }
                if (bool18 == null) {
                    return (FragmentNavigateCommand) command;
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                Boolean bool19 = this.f8379b;
                Intrinsics.h(bool19);
                return rq4.j.a((rq4.j) obj2, null, null, null, bool19.booleanValue(), false, 55);
            case 21:
                Boolean bool20 = this.f8379b;
                Intrinsics.h(bool20);
                return tb6.m.a((tb6.m) obj2, null, null, null, null, null, null, null, null, null, null, false, bool20.booleanValue(), false, null, 14335);
            case 22:
                Boolean bool21 = this.f8379b;
                Intrinsics.h(bool21);
                return tb6.m.a((tb6.m) obj2, null, null, null, null, null, null, null, null, null, null, bool21.booleanValue(), false, false, null, 15359);
            case 23:
                Boolean bool22 = this.f8379b;
                Intrinsics.h(bool22);
                return ux6.j.a((ux6.j) obj2, null, null, false, false, bool22.booleanValue(), 15);
            case 24:
                Boolean bool23 = this.f8379b;
                Intrinsics.h(bool23);
                return v0f.u.a((v0f.u) obj2, null, null, null, null, null, null, null, null, bool23.booleanValue(), false, false, false, false, false, 16127);
            case 25:
                return vb3.g.a((vb3.g) obj2, this.f8379b.booleanValue() ? vb3.f.SHOW_BARCODE : vb3.f.DEPOSIT_CASH);
            case 26:
                Boolean bool24 = this.f8379b;
                Intrinsics.h(bool24);
                return wbg.g0.a((wbg.g0) obj2, null, null, null, null, null, false, bool24.booleanValue(), null, null, null, null, null, null, 8127);
            case 27:
                Boolean bool25 = this.f8379b;
                Intrinsics.h(bool25);
                return wv2.d.a((wv2.d) obj2, 0, null, null, bool25.booleanValue(), 23);
            case 28:
                return x1g.i.a((x1g.i) obj2, null, null, null, this.f8379b, false, null, null, null, null, 32255);
            default:
                Boolean bool26 = this.f8379b;
                Intrinsics.h(bool26);
                return x23.j.a((x23.j) obj2, null, null, null, false, false, bool26.booleanValue(), false, null, null, 3967);
        }
    }
}
