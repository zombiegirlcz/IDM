package f0d;

import aii.r;
import android.nfc.tech.IsoDep;
import androidx.compose.runtime.saveable.SaverKt;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPointsProductRate;
import com.revolut.feature_exchange.impl.ui.exchange.recurring_order_settings.RecurringOrderSettingsActivity;
import dx4.a1;
import ip0.xi0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import m1c.f1;
import org.joda.time.LocalDate;
import rp0.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131090a;

    public /* synthetic */ k(int i) {
        this.f131090a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        String strE0;
        Double dValueOf = null;
        strP = null;
        String strP = null;
        dValueOf = null;
        boolean z = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        z = false;
        boolean z6 = false;
        z = false;
        boolean z11 = false;
        z = false;
        switch (this.f131090a) {
            case 0:
                od0.i question = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(question, "question");
                if (question.d() && ((d) question.c()).f131084a.f148031a == gzc.d.TEXT) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                od0.i question2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(question2, "question");
                if (question2.d() && ((d) question2.c()).f131084a.f148031a == gzc.d.SELECT) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 2:
                od0.i question3 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(question3, "question");
                return (d) question3.g();
            case 3:
                Function0 defaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                return (List) defaultLoadingItems.invoke();
            case 4:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 5:
                rlm.f Json2 = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json2, "$this$Json");
                Json2.f255101c = true;
                return Unit.f186387a;
            case 6:
                f1c.l update = (f1c.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Integer num = update.f131246c;
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                z19.n nVar = (z19.n) update.f131244a.getContent();
                ArrayList arrayList = nVar != null ? nVar.f318787a : null;
                return f1c.l.a(update, null, null, (arrayList == null || v.j(arrayList) < iIntValue) ? update.f131246c : Integer.valueOf(iIntValue), 3);
            case 7:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return u.c(new xi0("LOADING_ITEM_ID"));
            case 8:
                Data listOfProducts = (Data) obj2;
                Intrinsics.checkNotNullParameter(listOfProducts, "listOfProducts");
                List list = (List) listOfProducts.getContent();
                if (list != null) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (((RevPointsProductRate) next).f84036b == f1.EXPERIENCES) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    RevPointsProductRate revPointsProductRate = (RevPointsProductRate) next;
                    if (revPointsProductRate != null) {
                        dValueOf = Double.valueOf(revPointsProductRate.f84037c);
                    }
                }
                return u1.a(dValueOf);
            case 9:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Optional.empty();
            case 10:
                return SaverKt.AutoSaver$lambda$1(obj2);
            case 11:
                LargeActionButtonDelegate.Model it11 = (LargeActionButtonDelegate.Model) obj2;
                int i = RecurringOrderSettingsActivity.A0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Unit.f186387a;
            case 12:
                rp0.q it12 = (rp0.q) obj2;
                int i2 = RecurringOrderSettingsActivity.A0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Unit.f186387a;
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (LocalDate) pair.f186386b;
            case 14:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                a0 a0Var = (a0) pair2.f186385a;
                if (Intrinsics.f(a0Var.f256041b, "REPEAT_DIALOG_TAG") && a0Var.f256040a) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 15:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return (f2i.g) pair3.f186386b;
            case 16:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                a0 a0Var2 = (a0) pair4.f186385a;
                if (Intrinsics.f(a0Var2.f256041b, "START_DATE_DIALOG_TAG") && a0Var2.f256040a) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 17:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                List list2 = (List) pair5.f186385a;
                List list3 = (List) pair5.f186386b;
                List list4 = list2;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list4) {
                    if (list3.contains(((d2k.h) obj3).f110878a.f297794a)) {
                        arrayList2.add(obj3);
                    }
                }
                boolean zIsEmpty = arrayList2.isEmpty();
                List listV0 = arrayList2;
                if (zIsEmpty) {
                    listV0 = d0.V0(list4, 3);
                }
                return new d2k.i(d0.P0(listV0, new f2k.d()), d0.P0(list4, new f2k.d()));
            case 18:
                List list5 = (List) obj2;
                Intrinsics.checkNotNullParameter(list5, "list");
                ArrayList arrayList3 = new ArrayList();
                Iterator it13 = list5.iterator();
                while (it13.hasNext()) {
                    String strB = f5j.c.b((f5j.a) it13.next());
                    if (strB != null) {
                        arrayList3.add(strB);
                    }
                }
                return d0.V0(d0.U(arrayList3), 3);
            case 19:
                List list6 = (List) obj2;
                Intrinsics.checkNotNullParameter(list6, "list");
                List<z1k.m> list7 = list6;
                ArrayList arrayList4 = new ArrayList(w.t(list7, 10));
                for (z1k.m mVar : list7) {
                    arrayList4.add(new d2k.h(mVar.f318876a, mVar.f318877b));
                }
                return arrayList4;
            case 20:
                String str = (String) obj2;
                return a10.b.t(str, "it", "\n", str);
            case 21:
                d93.b it14 = (d93.b) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Long l2 = it14.f112339g;
                if (l2 != null && l2.longValue() < 60000) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 22:
                d93.b it15 = (d93.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Iterable iterable = it15.e.f22288a.f22292c;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                return iterable;
            case 23:
                c93.m it16 = (c93.m) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f22294b;
            case 24:
                List entryPoints = (List) obj2;
                Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
                fs3.i iVarU = ebm.a.u(entryPoints, fs3.b.PAY_LATER);
                fs3.b bVar = iVarU.f137586a;
                String str2 = iVarU.f137587b;
                String str3 = iVarU.f137588c;
                a1 a1Var = iVarU.d;
                return new mp3.g("paylater_account_item_id", bVar, str2, str3, a1Var != null ? Integer.valueOf(a1Var.c()) : null, iVarU.e, cp5.d.L(iVarU.f));
            case 25:
                r output = (r) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof gfd.d)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String str4 = (String) d0.d0(((gfd.d) output).f143391a);
                if (str4 != null) {
                    x1d.b.Companion.getClass();
                    x1d.b bVarA = x1d.a.a(str4);
                    if (bVarA != null) {
                        strP = com.google.android.gms.internal.mlkit_vision_face.a.p(bVarA.f302363a.f86866a, "-", bVarA.f302364b, "-", bVarA.f302365c);
                    }
                }
                dsh.f fVar = new dsh.f();
                if (strP != null) {
                    fVar.a("WATCHLIST_WIDGET_ASSET_IDS", strP);
                }
                return new dsh.l(new dsh.e(fVar));
            case 26:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return null;
            case 27:
                u8 model = (u8) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                String str5 = model.f54807a;
                Intrinsics.checkNotNullParameter(str5, "<this>");
                if (!kotlin.text.a0.H(str5, "TRAVEL_FLIGHTS_BOOKING_", false)) {
                    str5 = null;
                }
                if (str5 == null || (strE0 = kotlin.text.d0.e0(str5, "TRAVEL_FLIGHTS_BOOKING_")) == null || strE0.length() <= 0) {
                    return null;
                }
                return strE0;
            case 28:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return f5g.a.b();
            default:
                tmm.c.a((IsoDep) obj2);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ k(Object obj2, int i) {
        this.f131090a = i;
    }
}
