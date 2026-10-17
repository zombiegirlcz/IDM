package g23;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 extends gim.i implements oim.o {
    public /* synthetic */ do3.n u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f139788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ List f139789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g0 f139790y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, Continuation continuation) {
        super(5, continuation);
        this.f139790y = g0Var;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        f0 f0Var = new f0(this.f139790y, (Continuation) obj6);
        f0Var.u = (do3.n) obj2;
        f0Var.v = zBooleanValue;
        f0Var.f139788w = zBooleanValue2;
        f0Var.f139789x = (List) obj5;
        return f0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pc pcVarC;
        pc pcVarC2;
        pc pcVarC3;
        do3.n user = this.u;
        boolean z = this.v;
        boolean z3 = this.f139788w;
        List list = this.f139789x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g0 g0Var = this.f139790y;
        g0Var.getClass();
        List list2 = list;
        ArrayList cardDesigns = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof e93.d) {
                cardDesigns.add(obj3);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list2) {
            if (obj4 instanceof e93.e) {
                arrayList.add(obj4);
            }
        }
        ArrayList cardDesigns2 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (!ce9.m.s((e93.e) obj5)) {
                cardDesigns2.add(obj5);
            }
        }
        ArrayList disposableCardDesigns = new ArrayList();
        for (Object obj6 : list2) {
            e93.f fVar = (e93.f) obj6;
            if (fVar instanceof e93.e) {
                e93.e eVar = (e93.e) fVar;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                if (ce9.m.s(eVar)) {
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    if (eVar.f123850p == h93.j0.JOINT_ACCOUNT) {
                        disposableCardDesigns.add(obj6);
                    }
                }
            }
        }
        aim.e eVarB = zhm.u.b();
        Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
        Intrinsics.checkNotNullParameter(user, "user");
        wi0.a aVar2 = wi0.b.Companion;
        aVar2.getClass();
        wi0.b bVar = wi0.b.y2;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(te0.w.S(user, bVar) ? R$string.card_order_physical_joint_title : z ? R$string.card_order_debit_physical_prepaid_card_title : R$string.card_order_physical_title, null, null, 14);
        aVar2.getClass();
        wi0.b bVar2 = wi0.b.M0;
        TextLocalisedClause textLocalisedClause2 = te0.w.S(user, bVar2) ? new TextLocalisedClause(R$string.card_order_physical_debit_subtitle, null, null, 14) : z3 ? new TextLocalisedClause(R$string.card_order_physical_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_order_debit_physical_card_description, null, null, 14);
        boolean zY = hx7.i.y(cardDesigns);
        l0 l0Var = g0Var.f139793m;
        int i = R$drawable.uikit_icn_24_card;
        int i2 = R$attr.uikit_colorPurple;
        if (zY) {
            l0Var.getClass();
            pcVarC = l0.c();
        } else {
            pcVarC = null;
        }
        eVarB.add(l0.b(l0Var, "NEW_PHYSICAL_JOINT_LIST_ID", textLocalisedClause, textLocalisedClause2, i, i2, zhm.v.l(pcVarC), 192));
        Intrinsics.checkNotNullParameter(cardDesigns2, "cardDesigns");
        Intrinsics.checkNotNullParameter(user, "user");
        TextLocalisedClause textLocalisedClause3 = te0.w.S(user, bVar) ? new TextLocalisedClause(R$string.card_order_virtual_joint_title, null, null, 14) : new TextLocalisedClause(R$string.card_order_virtual_title, null, null, 14);
        aVar2.getClass();
        TextLocalisedClause textLocalisedClause4 = te0.w.S(user, bVar2) ? new TextLocalisedClause(R$string.card_order_virtual_debit_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_order_virtual_subtitle, null, null, 14);
        boolean zY2 = hx7.i.y(cardDesigns2);
        l0 l0Var2 = g0Var.f139793m;
        int i3 = R$drawable.uikit_icn_24_smartphone;
        int i5 = R$attr.uikit_colorPurple;
        if (zY2) {
            l0Var2.getClass();
            pcVarC2 = l0.c();
        } else {
            pcVarC2 = null;
        }
        eVarB.add(l0.b(l0Var2, "NEW_VIRTUAL_JOINT_LIST_ID", textLocalisedClause3, textLocalisedClause4, i3, i5, zhm.v.l(pcVarC2), 192));
        if (!disposableCardDesigns.isEmpty() && g0Var.f139792l.f65114g != h93.l0.INDIA_GLOBAL) {
            Intrinsics.checkNotNullParameter(disposableCardDesigns, "disposableCardDesigns");
            Intrinsics.checkNotNullParameter(user, "user");
            boolean zE = hx7.i.e(disposableCardDesigns);
            l0 l0Var3 = g0Var.f139793m;
            TextLocalisedClause textLocalisedClause5 = te0.w.S(user, bVar) ? new TextLocalisedClause(R$string.card_order_disposable_joint_title, null, null, 14) : new TextLocalisedClause(R$string.card_order_disposable_title, null, null, 14);
            aVar2.getClass();
            TextLocalisedClause textLocalisedClause6 = te0.w.S(user, bVar2) ? new TextLocalisedClause(R$string.card_order_disposable_debit_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_order_disposable_subtitle, null, null, 14);
            int i6 = R$drawable.uikit_icn_24_all_time;
            int i21 = R$attr.uikit_colorPurple;
            if (zE) {
                g0Var.f139793m.getClass();
                pcVarC3 = l0.c();
            } else {
                pcVarC3 = null;
            }
            eVarB.add(l0.b(l0Var3, "NEW_DISPOSABLE_JOINT_LIST_ID", textLocalisedClause5, textLocalisedClause6, i6, i21, zhm.v.l(pcVarC3), 192));
        }
        return zhm.u.a(eVarB);
    }
}
