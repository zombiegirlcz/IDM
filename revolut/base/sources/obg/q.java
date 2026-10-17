package obg;

import androidx.sqlite.SQLiteConnection;
import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import h93.f0;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.x10;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jf7.k1;
import jf7.l1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223953a;

    public /* synthetic */ q(int i) {
        this.f223953a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = false;
        switch (this.f223953a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return m.f223948a;
            case 1:
                return oc3.h.a((oc3.h) obj2, true, null, null, null, false, false, null, null, false, 478);
            case 2:
                ax4.b updateConstructorState = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                return new ax4.b(0);
            case 3:
                oc4.d update = (oc4.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return oc4.d.a(update, null, Data.copy$default(update.f224094b, null, null, true, 3, null), 1);
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List list = (List) getDefaultLoadingItems.invoke();
                m70.a.c(t0.f186434a);
                return new oc4.h(i3g.k.g(""), list);
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                do3.n nVar = (do3.n) pair.f186385a;
                List list2 = (List) pair.f186386b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            vd8.a aVar = (vd8.a) it8.next();
                            if (Intrinsics.f(aVar.d, nVar.f) && aVar.f == vd8.d.GUARDIAN) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                List<vd8.a> coparents = (List) obj2;
                Intrinsics.checkNotNullParameter(coparents, "coparents");
                for (vd8.a aVar2 : coparents) {
                    if (aVar2.f == vd8.d.GUARDIAN) {
                        return aVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 7:
                vd8.a it9 = (vd8.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ngm.n.n(it9);
            case 8:
                List terms = (List) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                List listN = c6d.b.N(terms);
                if (listN != null) {
                    return listN;
                }
                throw new IllegalStateException("Can't load terms to sign");
            case 9:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 0, 6, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it10 = intRangeU.iterator();
                while (it10.f289625c) {
                    arrayList.add(nb0.a(pb0.Companion, a0.d.n("ID_LOADING_ITEM_", it10.nextInt()), false, 6));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                lw0.h hVar = new lw0.h(lw0.i.AVATAR);
                aim.e eVarB = u.b();
                IntRange intRange = new IntRange(0, 1, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                vim.f it11 = intRange.iterator();
                while (it11.f289625c) {
                    arrayList2.add(new s7(a0.d.n("LOADING_DESCRIPTION_ID_", it11.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList2);
                IntRange intRange2 = new IntRange(0, 2, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange2, 10));
                vim.f it12 = intRange2.iterator();
                while (it12.f289625c) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("LOADING_INSTRUCTIONS_ID_", it12.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList3);
                return new cii.b(new aw0.e(false, null, null, new n6(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58737s, null, null, false, null, null, 988), null, null, 55), u.a(eVarB), hVar);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 13:
                x10 it13 = (x10) obj2;
                KProperty[] kPropertyArr = CashbackProductScreen.i0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f167082b;
            case 14:
                ty0.a it14 = (ty0.a) obj2;
                KProperty[] kPropertyArr2 = CashbackProductScreen.i0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.d instanceof bbj.d);
            case 15:
                ty0.a it15 = (ty0.a) obj2;
                KProperty[] kPropertyArr3 = CashbackProductScreen.i0;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj3 = it15.d;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.retail.feature.crypto_commodities.disclaimer.mapper.api.DisclosuresLinkParcel");
                return (bbj.d) obj3;
            case 16:
                oe1.g update2 = (oe1.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return oe1.g.a(update2, null, 0L, null, null, update2.f + 1, null, 95);
            case 17:
                oe1.g update3 = (oe1.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return oe1.g.a(update3, null, 0L, null, null, update3.f - 1, null, 95);
            case 18:
                oe1.g update4 = (oe1.g) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return oe1.g.a(update4, null, 0L, null, null, 0, null, LDSFile.EF_DG15_TAG);
            case 19:
                f0 it16 = (f0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                od0.h hVar2 = od0.i.Companion;
                Address address = it16.k.f;
                hVar2.getClass();
                return od0.h.a(address);
            case 20:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                l93.d dVar = (l93.d) rVar.f314201a;
                od0.i iVar = (od0.i) rVar.f314202b;
                do3.n nVar2 = (do3.n) rVar.f314203c;
                int i = dVar != null ? oee.l.f224588a[dVar.ordinal()] : -1;
                if (i == 1) {
                    return do3.q.x(nVar2);
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Address address2 = (Address) iVar.f224257a;
                return address2 == null ? do3.q.x(nVar2) : address2;
            case 21:
                k3l.j it17 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.a() instanceof StatusViewConfiguration.Success);
            case 22:
                f0 it18 = (f0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return com.google.android.gms.internal.mlkit_vision_face.a.o(jli.g.c(it18.f150114h.f13640b), " *", it18.f150115j);
            case 23:
                ty0.a it19 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new Pair(it19.d, it19.f275445a);
            case 24:
                return k1.INSTANCE.serializer();
            case 25:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                fVar.b(o0.f186429a.b(l1.class), new q(24));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 26:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM travel_miles_airlines").step();
                    return null;
                } finally {
                }
            case 27:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM travel_miles_accounts").step();
                    return null;
                } finally {
                }
            case 28:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM travel_miles_provider").step();
                    return null;
                } finally {
                }
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new og2.i(iii.c.c(3), false);
        }
    }

    public /* synthetic */ q(Object obj2, int i) {
        this.f223953a = i;
    }
}
