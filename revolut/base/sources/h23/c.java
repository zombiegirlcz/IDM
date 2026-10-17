package h23;

import ce9.m;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.cards_core.R$string;
import do3.n;
import h93.l0;
import io3.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import oim.p;
import te0.w;
import yhm.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements p {
    public /* synthetic */ Object A;
    public final /* synthetic */ int u = 0;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ List f148628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ boolean f148629x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ boolean f148630y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(6, continuation);
        this.A = dVar;
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        switch (this.u) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                c cVar = new c((d) this.A, (Continuation) obj7);
                cVar.z = (n) obj2;
                cVar.f148629x = zBooleanValue;
                cVar.f148630y = zBooleanValue2;
                cVar.f148628w = (List) obj5;
                cVar.v = (Data) obj6;
                return cVar.invokeSuspend(Unit.f186387a);
            default:
                boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
                c cVar2 = new c(this.f148630y, (Continuation) obj7);
                cVar2.v = (Data) obj2;
                cVar2.f148628w = (List) obj3;
                cVar2.z = (List) obj4;
                cVar2.A = (Data) obj5;
                cVar2.f148629x = zBooleanValue3;
                return cVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        wi0.a aVar;
        ArrayList arrayList;
        TextLocalisedClause textLocalisedClause2;
        pc pcVarC;
        pc pcVarD;
        TextLocalisedClause textLocalisedClause3;
        pc pcVarC2;
        pc pcVarC3;
        Data data;
        ArrayList arrayList2;
        switch (this.u) {
            case 0:
                n user = (n) this.z;
                boolean z = this.f148629x;
                boolean z3 = this.f148630y;
                List list = this.f148628w;
                Data cardPromotionsData = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVar = (d) this.A;
                l0 l0Var = dVar.f148631a.f65114g;
                g23.l0 l0Var2 = dVar.f148632b;
                List list2 = list;
                ArrayList cardDesigns = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof e93.d) {
                        cardDesigns.add(obj3);
                    }
                }
                ArrayList cardDesigns2 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof e93.e) {
                        cardDesigns2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : cardDesigns2) {
                    if (!m.s((e93.e) obj5)) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList disposableCardDesigns = new ArrayList();
                for (Object obj6 : cardDesigns2) {
                    if (m.x((e93.e) obj6)) {
                        disposableCardDesigns.add(obj6);
                    }
                }
                boolean z4 = dVar.f148631a.e == zn3.a.ONBOARDING;
                aim.e eVarB = u.b();
                Intrinsics.checkNotNullParameter(cardPromotionsData, "cardPromotionsData");
                Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
                Intrinsics.checkNotNullParameter(user, "user");
                boolean z6 = z4;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(z ? R$string.card_order_debit_physical_prepaid_card_title : R$string.card_order_physical_title, null, null, 14);
                wi0.a aVar3 = wi0.b.Companion;
                aVar3.getClass();
                wi0.b bVar = wi0.b.M0;
                if (w.S(user, bVar)) {
                    textLocalisedClause = textLocalisedClause4;
                    aVar = aVar3;
                    arrayList = arrayList3;
                    textLocalisedClause2 = new TextLocalisedClause(R$string.card_order_physical_debit_subtitle, null, null, 14);
                } else {
                    textLocalisedClause = textLocalisedClause4;
                    aVar = aVar3;
                    arrayList = arrayList3;
                    textLocalisedClause2 = z3 ? new TextLocalisedClause(R$string.card_order_physical_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_order_debit_physical_card_description, null, null, 14);
                }
                TextLocalisedClause textLocalisedClause5 = textLocalisedClause2;
                boolean zY = hx7.i.y(cardDesigns);
                g23.l0 l0Var3 = dVar.f148632b;
                int i = R$drawable.uikit_icn_24_card;
                l0 l0Var4 = l0.BRAZIL_LOCAL;
                int i2 = l0Var == l0Var4 ? R$attr.uikit_colorTeal : R$attr.uikit_colorColdBlue;
                if (zY) {
                    l0Var2.getClass();
                    pcVarC = g23.l0.c();
                } else {
                    pcVarC = null;
                }
                List list3 = (List) cardPromotionsData.getContent();
                if (list3 != null ? list3.contains(n93.d.YOUTH_GRADUATION) : false) {
                    Address address = user.k;
                    wi0.b bVarG = address != null ? nz8.d.g(address) : null;
                    l0Var2.getClass();
                    pcVarD = g23.l0.d(bVarG);
                } else {
                    pcVarD = null;
                }
                pc[] elements = {pcVarC, pcVarD};
                Intrinsics.checkNotNullParameter(elements, "elements");
                eVarB.add(g23.l0.b(l0Var3, "NEW_PHYSICAL_LIST_ID", textLocalisedClause, textLocalisedClause5, i, i2, kotlin.collections.d.L(elements), 192));
                if (!z6) {
                    cardDesigns2 = arrayList;
                }
                Intrinsics.checkNotNullParameter(cardDesigns2, "cardDesigns");
                Intrinsics.checkNotNullParameter(user, "user");
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.card_order_virtual_title, null, null, 14);
                aVar.getClass();
                if (w.S(user, bVar)) {
                    textLocalisedClause3 = new TextLocalisedClause(R$string.card_order_virtual_debit_subtitle, null, null, 14);
                } else {
                    aVar.getClass();
                    textLocalisedClause3 = w.S(user, wi0.b.f297770q3) ? new TextLocalisedClause(R$string.card_order_virtual_subtitle_complimentary, null, null, 14) : new TextLocalisedClause(R$string.card_order_virtual_subtitle, null, null, 14);
                }
                TextLocalisedClause textLocalisedClause7 = textLocalisedClause3;
                boolean zY2 = hx7.i.y(cardDesigns2);
                g23.l0 l0Var5 = dVar.f148632b;
                int i3 = R$drawable.uikit_icn_24_smartphone;
                int i5 = l0Var == l0Var4 ? R$attr.uikit_colorTeal : R$attr.uikit_colorColdBlue;
                if (zY2) {
                    l0Var2.getClass();
                    pcVarC2 = g23.l0.c();
                } else {
                    pcVarC2 = null;
                }
                eVarB.add(g23.l0.b(l0Var5, "NEW_VIRTUAL_LIST_ID", textLocalisedClause6, textLocalisedClause7, i3, i5, v.l(pcVarC2), 192));
                if (!z6 && !disposableCardDesigns.isEmpty() && l0Var != l0.INDIA_GLOBAL) {
                    Intrinsics.checkNotNullParameter(disposableCardDesigns, "disposableCardDesigns");
                    Intrinsics.checkNotNullParameter(user, "user");
                    boolean zE = hx7.i.e(disposableCardDesigns);
                    g23.l0 l0Var6 = dVar.f148632b;
                    TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.card_order_disposable_title, null, null, 14);
                    aVar.getClass();
                    TextLocalisedClause textLocalisedClause9 = w.S(user, bVar) ? new TextLocalisedClause(R$string.card_order_disposable_debit_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_order_disposable_subtitle, null, null, 14);
                    int i6 = R$drawable.uikit_icn_24_all_time;
                    int i21 = R$attr.uikit_colorColdBlue;
                    if (zE) {
                        l0Var2.getClass();
                        pcVarC3 = g23.l0.c();
                    } else {
                        pcVarC3 = null;
                    }
                    eVarB.add(g23.l0.b(l0Var6, "NEW_DISPOSABLE_LIST_ID", textLocalisedClause8, textLocalisedClause9, i6, i21, v.l(pcVarC3), 192));
                }
                return u.a(eVarB);
            default:
                boolean z11 = this.f148630y;
                Data data2 = this.v;
                List list4 = this.f148628w;
                List list5 = (List) this.z;
                Data data3 = (Data) this.A;
                boolean z12 = this.f148629x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean z29 = data3.getContent() == null;
                boolean z31 = z11 && (z29 || Intrinsics.f(data3.getContent(), Boolean.TRUE) || z12);
                boolean z41 = !z11 || z29 || z12;
                Intrinsics.h(data2);
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        arrayList2 = new ArrayList();
                        for (Object obj7 : (List) content) {
                            io3.d dVar2 = (io3.d) obj7;
                            xi0.b bVarL = z92.f.l(dVar2);
                            if (z31 || dVar2.e == l.LOCKED_GIFT || !list5.contains(bVarL) || (!list4.contains(bVarL) && z41)) {
                                arrayList2.add(obj7);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    data = new Data(arrayList2, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return Data.copy$default(data, null, null, data2.getLoading() || data3.getLoading(), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, Continuation continuation) {
        super(6, continuation);
        this.f148630y = z;
    }
}
