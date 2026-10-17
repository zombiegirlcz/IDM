package oy9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ReferralsSearchQuickAction;
import com.revolut.retail.feature.payments.core.R$string;
import do3.n;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ox5.d0;
import vf0.k;
import x5k.l;
import x5k.o;
import x5k.p;
import x5k.q;
import x5k.r;
import x5k.s;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dsd.i f230914b;

    public /* synthetic */ a(dsd.i iVar, int i) {
        this.f230913a = i;
        this.f230914b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f230913a;
        dsd.i iVar = this.f230914b;
        switch (i) {
            case 0:
                k kVar = (k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                Boolean bool = (Boolean) kVar.f288454a;
                boolean zBooleanValue = ((Boolean) kVar.f288455b).booleanValue();
                n nVar = (n) kVar.f288456c;
                boolean zBooleanValue2 = ((Boolean) kVar.d).booleanValue();
                boolean zBooleanValue3 = ((Boolean) kVar.e).booleanValue();
                String str = nVar.f;
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                s[] elements = {r.f, zBooleanValue3 ? o.f : null, p.f, zBooleanValue ? l.f : null, (zBooleanValue && bool.booleanValue()) ? x5k.k.f : null, Intrinsics.f(nVar.f116414l, nVar.f) ? new x5k.f(0) : null, str != null ? new q(str) : null, x5k.n.f, ((zq.a) iVar.f117303h).s() ? x5k.i.f : null, zBooleanValue2 ? x5k.e.f : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                Object obj4 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                List list = (List) obj4;
                return (((Boolean) obj3).booleanValue() && ((jte.d) ((gte.a) iVar.f117304j)).c(SharedReferralsUiApi$Toggles$ReferralsSearchQuickAction.f81818c)) ? m70.a.g(wwa.b.e((wwa.b) iVar.i, null, 3), null, new d0(13), 1).map(new or2.e(new njf.e(14, iVar, list), 29)).onErrorReturnItem(zhm.d0.F0(new x5k.h(new TextLocalisedClause(R$string.referrals_search_quick_action_no_reward_subtitle, null, null, 14)), list)).startWith(list) : efm.r.just(list);
        }
    }
}
