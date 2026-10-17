package k37;

import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import ip0.pb0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k50.b1;
import k50.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import org.jmrtd.lds.LDSFile;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180644a;

    public /* synthetic */ s(int i) {
        this.f180644a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f180644a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                return f0.f322471a;
            case 2:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new f((ds6.q) rVar.f314201a, (List) rVar.f314202b, (do3.n) rVar.f314203c);
            case 3:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(t61.a.o("LIST_ID_PAYMENT_ASSESSMENT_STEP_LOADER_", i, pb0.Companion, false, 6));
                }
                return arrayListP;
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return p.f180640a;
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 6:
                Intrinsics.checkNotNullParameter((k3c.f) obj2, "<unused var>");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 8:
                String it9 = (String) obj2;
                KProperty[] kPropertyArr = TravelExperiencesSearchScreen.f93130h0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return d0.F0(it9).toString();
            case 9:
                String query = (String) obj2;
                KProperty[] kPropertyArr2 = TravelExperiencesSearchScreen.f93130h0;
                Intrinsics.checkNotNullParameter(query, "query");
                return Boolean.valueOf(query.length() >= 3);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return k3g.p.b();
            case 11:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                Set set = config.U;
                HashSet hashSet = new HashSet();
                Iterator it10 = set.iterator();
                while (it10.hasNext()) {
                    hashSet.add(((xi0.b) it10.next()).f306286a);
                }
                return hashSet;
            case 12:
                List<z1k.n> remittanceCurrencies = (List) obj2;
                Intrinsics.checkNotNullParameter(remittanceCurrencies, "remittanceCurrencies");
                ArrayList arrayList = new ArrayList();
                for (z1k.n nVar : remittanceCurrencies) {
                    String str = (nVar.f318881c || nVar.f318880b) ? nVar.f318879a.f306286a : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            case 13:
                ty0.a it11 = (ty0.a) obj2;
                KProperty[] kPropertyArr3 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f275445a;
            case 14:
                SelectableDelegate.Model it12 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj3 = ((RowDelegate.Model) it12.f53305b).u;
                if (obj3 instanceof kq2.c) {
                    return (kq2.c) obj3;
                }
                return null;
            case 15:
                ty0.a it13 = (ty0.a) obj2;
                KProperty[] kPropertyArr5 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj4 = it13.d;
                if (obj4 instanceof kq2.e) {
                    return (kq2.e) obj4;
                }
                return null;
            case 16:
                SelectableDelegate.Model it14 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr6 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj5 = ((RowDelegate.Model) it14.f53305b).u;
                if (obj5 instanceof RemittanceRouteId) {
                    return (RemittanceRouteId) obj5;
                }
                return null;
            case 17:
                LargeActionButtonDelegate.Model it15 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr7 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj6 = it15.i;
                if (obj6 instanceof kq2.c) {
                    return (kq2.c) obj6;
                }
                return null;
            case 18:
                LargeActionButtonDelegate.Model it16 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr8 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(Intrinsics.f(it16.f52613a, "FLOW_LIMITS_DIALOG_BUTTON_ID"));
            case 19:
                CenteredAmountDelegate.Model it17 = (CenteredAmountDelegate.Model) obj2;
                KProperty[] kPropertyArr9 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj7 = it17.f51981p;
                if (obj7 instanceof yof.b) {
                    return (yof.b) obj7;
                }
                return null;
            case 20:
                InputTextDelegate.Model it18 = (InputTextDelegate.Model) obj2;
                KProperty[] kPropertyArr10 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.f52580a, "ITEM_FEE_OPTIONS_ID"));
            case 21:
                InputTextDelegate.Model it19 = (InputTextDelegate.Model) obj2;
                KProperty[] kPropertyArr11 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(Intrinsics.f(it19.f52580a, "ITEM_TRANSFER_TYPE_ID"));
            case 22:
                return k4a.k.a((k4a.k) obj2, null, false, null, null, null, null, LDSFile.EF_DG15_TAG);
            case 23:
                Throwable it20 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(it20 instanceof Exception);
            case 24:
                String text = (String) obj2;
                MessagesScreen.Companion aVar = MessagesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(text, "text");
                return Boolean.valueOf(!d0.W(text));
            case 25:
                k50.h0 update = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                o0 o0Var = update.e;
                return k50.h0.a(update, null, null, null, null, o0.a(o0Var, "", o0Var.f181193b + 100, null, null, false, f0.f322471a, null, 92), null, null, null, null, null, false, false, null, null, b1.a(update.f181090r, null, null, null, null, 23), null, false, null, null, null, null, null, null, null, 268304367);
            case 26:
                k50.h0 it21 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                v30.j jVar = (v30.j) it21.f181080b.getContent();
                if (jVar != null) {
                    return jVar.c();
                }
                return null;
            case 27:
                k50.h0 it22 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.i;
            case 28:
                k50.h0 update2 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return k50.h0.a(update2, null, null, null, null, null, v30.i.a(update2.f, true, null, false, null, false, 26), null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435423);
            default:
                k50.h0 update3 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return k50.h0.a(update3, null, null, null, null, null, v30.i.a(update3.f, false, null, false, null, false, 27), null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435423);
        }
    }

    public /* synthetic */ s(Object obj2, int i) {
        this.f180644a = i;
    }
}
