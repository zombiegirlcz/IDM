package z1i;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.confirmations.CardsAccountConfirmationDto;
import com.revolut.data.network.models.confirmations.ProfileAccountConfirmationDto;
import com.revolut.data.network.models.confirmations.ProfileAccountConfirmationDtoKt;
import com.revolut.data.network.models.confirmations.SarAccountConfirmationDto;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsNewScreen;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import ip0.pb0;
import ip0.vl0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jel.w2;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tof.a3;
import v20.b1;
import z55.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318831a;

    public /* synthetic */ l(int i) {
        this.f318831a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f318831a) {
            case 0:
                b2i.b order = (b2i.b) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter(order, "<this>");
                Boolean boolValueOf = Boolean.valueOf(cp5.d.A(order.d.f115083b) && cp5.d.A(order.f.f115083b));
                OrderQuote orderQuote = order.f11950n;
                return new Pair(boolValueOf, orderQuote != null ? orderQuote.f104765t : null);
            case 1:
                StatusViewConfiguration it8 = (StatusViewConfiguration) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8;
            case 2:
                CellDetailsActionDelegate.Model it9 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.f51787l;
                if (obj3 instanceof d4i.a) {
                    return (d4i.a) obj3;
                }
                return null;
            case 3:
                CellDetailsActionDelegate.Model it10 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f51781a, "CURRENT_PRICE_ID"));
            case 4:
                pd5.d it11 = (pd5.d) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List list = it11.f235100j;
                return list == null ? zhm.f0.f322471a : list;
            case 5:
                v20.n message = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(message, "message");
                v20.c cVar = message instanceof v20.c ? (v20.c) message : null;
                if (cVar != null) {
                    return v20.c.r(cVar, null, null, b1.FAILURE, null, 8063);
                }
                return null;
            case 6:
                Byte b4 = (Byte) obj2;
                b4.byteValue();
                return a0.d.v(new Object[]{b4}, 1, "%02x", "format(...)");
            case 7:
                SarAccountConfirmationDto it12 = (SarAccountConfirmationDto) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new Data(ProfileAccountConfirmationDtoKt.toDomain(it12), null, false, 6, null);
            case 8:
                ProfileAccountConfirmationDto it13 = (ProfileAccountConfirmationDto) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Data(ProfileAccountConfirmationDtoKt.toDomain(it13), null, false, 6, null);
            case 9:
                CardsAccountConfirmationDto it14 = (CardsAccountConfirmationDto) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new Data(ProfileAccountConfirmationDtoKt.toDomain(it14), null, false, 6, null);
            case 10:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new z27.e((ds6.m) pair.f186385a, (do3.n) pair.f186386b);
            case 11:
                return z27.f.a((z27.f) obj2, null, false, 3);
            case 12:
                return z27.f.a((z27.f) obj2, null, false, 3);
            case 13:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    pb0 pb0VarO = t61.a.o("LIST_ID_ASSESSMENT_STEP_LOADER_", i, pb0.Companion, false, 6);
                    yp0.b.l(pb0VarO, 0, 0, 0, 0, null, false, 63);
                    arrayListP.add(pb0VarO);
                }
                return arrayListP;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return z27.p.f318992a;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                for (int i2 = 0; i2 < 6; i2++) {
                    eVarB.add(new vl0(a0.d.n("loading_", i2)));
                }
                return new z2a.j(zhm.u.a(eVarB), null);
            case 16:
                y49.h it15 = (y49.h) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                if (it15.f310853l.size() != 1) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar = od0.i.Companion;
                String str = ((y49.e) zhm.d0.b0(it15.f310853l)).f310837a;
                hVar.getClass();
                return od0.h.a(str);
            case 17:
                y49.e it16 = (y49.e) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f310841h.f126703a;
            case 18:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return zhm.d0.E0((List) pair2.f186386b, (List) pair2.f186385a);
            case 19:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return r6.b.g(null, null, null, 7, command);
            case 20:
                RowDelegate.Model it17 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = ApmRecipientDetailsNewScreen.X;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj4 = it17.u;
                if (obj4 instanceof a3) {
                    return (a3) obj4;
                }
                return null;
            case 21:
                LocationDomain location = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(location, "location");
                od0.i.Companion.getClass();
                return od0.h.a(location);
            case 22:
                String str2 = (String) obj2;
                if (str2 != null && str2.length() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                od0.i optional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                return Boolean.valueOf(pd.b.j((Boolean) optional.g()));
            case 24:
                jel.c it18 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                if (it18 instanceof w2) {
                    return (w2) it18;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 26:
                Map.Entry entry = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                return entry.getKey() + " = " + entry.getValue();
            case 27:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair3.f186385a).booleanValue();
                gzc.v vVar = (gzc.v) pair3.f186386b;
                Intrinsics.h(vVar);
                Intrinsics.checkNotNullParameter(vVar, "<this>");
                if (vVar != gzc.v.REQUESTED_UNDER_REVIEW && vVar != gzc.v.REQUIRED_UNDER_REVIEW && !zBooleanValue) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                gzc.w it19 = (gzc.w) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f148042b;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return s.a.f319510a;
        }
    }
}
