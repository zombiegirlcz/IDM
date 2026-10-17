package v80;

import a12.m;
import a8j.c;
import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.PixBeneficiary;
import com.revolut.feature.cash_topup.api.models.OpenInterval;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.retail.core.navigation.NaviCommand;
import dfl.r0;
import dj0.d;
import do3.n;
import do3.q;
import ip0.nb0;
import ip0.pb0;
import ip0.wj;
import java.util.ArrayList;
import java.util.List;
import kii.e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import od0.h;
import od0.i;
import rp0.z;
import u80.j;
import u80.k;
import v94.g;
import vb3.f;
import vch.x;
import whf.p;
import xzg.h0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286700a;

    public /* synthetic */ a(int i) {
        this.f286700a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f286700a) {
            case 0:
                qd0.b lp10 = (qd0.b) obj2;
                Intrinsics.checkNotNullParameter(lp10, "lp");
                k.Companion.getClass();
                return j.a(lp10);
            case 1:
                d it8 = (d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                i.Companion.getClass();
                return h.a(it8);
            case 2:
                n it9 = (n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return q.y(it9);
            case 3:
                ArrayList arrayListP = e.p((Function0) obj2, "it", 11);
                for (int i = 0; i < 11; i++) {
                    arrayListP.add(nb0.a(pb0.Companion, "LOADING_ITEM_ID", false, 6));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 4:
                uv5.b details = (uv5.b) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                xi0.a aVar = xi0.b.Companion;
                String str = details.f283304a;
                aVar.getClass();
                CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str), null, null, 6);
                String str2 = details.f283305b;
                String str3 = details.f283306c;
                String str4 = details.d;
                Iterable iterable = details.f283308h;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterable<uv5.h> iterable2 = iterable;
                ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
                for (uv5.h hVar : iterable2) {
                    arrayList.add(new c(hVar.f283318a, hVar.f283319b, hVar.f283320c));
                }
                return new a8j.d(currencyClause, str2, str3, str4, arrayList);
            case 5:
                Intrinsics.checkNotNullParameter((g) obj2, "$this$update");
                return new g(new Data(null, null, true, 3, null));
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return u.c(new wj("ID_LOADING_ITEM"));
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                String str5 = (String) pair.f186386b;
                if (d0.W(d0.F0(str5).toString())) {
                    return list;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    TransferInInstrument transferInInstrument = (TransferInInstrument) obj3;
                    if (jli.g.h(transferInInstrument.f91507b, str5) || jli.g.h(transferInInstrument.f91508c, str5)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 8:
                r0 page = (r0) obj2;
                Intrinsics.checkNotNullParameter(page, "page");
                return Boolean.valueOf(page.f114451b > 0);
            case 9:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                i iVar = (i) pair2.f186385a;
                boolean zBooleanValue = ((Boolean) pair2.f186386b).booleanValue();
                if (!iVar.d()) {
                    i.Companion.getClass();
                    return i.f224256b;
                }
                u0h.c cVar = new u0h.c((h0) iVar.c(), zBooleanValue);
                i.Companion.getClass();
                return h.a(cVar);
            case 10:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 11:
                p it10 = (p) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new m(f0.f322471a, it10);
            case 12:
                ReferralContactDelegate.Model it11 = (ReferralContactDelegate.Model) obj2;
                KProperty[] kPropertyArr = PixAreaScreen.Z;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj4 = it11.f53167l;
                if (obj4 instanceof PixBeneficiary) {
                    return (PixBeneficiary) obj4;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                n6.Companion.getClass();
                return m6.a();
            case 14:
                OpenInterval it12 = (OpenInterval) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return com.google.android.gms.internal.mlkit_vision_face.a.o(it12.f65602a, " - ", it12.f65603b);
            case 15:
                vb3.g updateState = (vb3.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return vb3.g.a(updateState, f.DEPOSIT_CASH);
            case 16:
                vb3.g updateState2 = (vb3.g) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return vb3.g.a(updateState2, f.SELECT_LOCATION);
            case 17:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 18:
                ub7.d surveysDto = (ub7.d) obj2;
                Intrinsics.checkNotNullParameter(surveysDto, "surveysDto");
                return xam.a.s(surveysDto.getSurveys());
            case 19:
                vc2.a update = (vc2.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = Data.copy$default(update.f287615a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new vc2.a(data);
            case 20:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new vc2.c((List) getDefaultLoadingItems2.invoke(), f0.f322471a);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return x.f287741a;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Unit.f186387a;
            case 25:
                z it13 = (z) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f256227a;
            case 26:
                vch.k updateState3 = (vch.k) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return vch.k.a(updateState3, null, null, null, null, null, null, null, null, null, false, true, false, 14335);
            case 27:
                d it14 = (d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.k());
            case 28:
                vch.k updateState4 = (vch.k) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return vch.k.a(updateState4, null, null, null, null, null, null, null, null, null, false, true, false, 14335);
            default:
                vch.k updateState5 = (vch.k) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return vch.k.a(updateState5, null, null, null, null, null, null, null, null, null, true, false, false, 13311);
        }
    }
}
