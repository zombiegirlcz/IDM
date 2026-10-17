package iqf;

import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.payments.core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        SingleChoiceDelegate.Model model;
        String str;
        iqf.a domainState = (iqf.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        krf.c cVar = domainState.f167826c;
        krf.e eVar = cVar instanceof krf.e ? (krf.e) cVar : null;
        List<krf.e> list = domainState.f167824a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (krf.e eVar2 : list) {
            arrayList.add(new SingleChoiceDelegate.Model(eVar2.f188861a, new TextClause(eVar2.f188862b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(eVar2.f188861a, eVar != null ? eVar.f188861a : null), null, eVar2, YearClass.CLASS_2008));
        }
        if (domainState.f167825b) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_core_reason_for_transfer_reason_custom_name, null, null, 14);
            boolean z = cVar instanceof krf.d;
            krf.d dVar = z ? (krf.d) cVar : null;
            if (dVar == null || (str = dVar.f188860a) == null) {
                str = "";
            }
            model = new SingleChoiceDelegate.Model("CUSTOM_REASON_ID", textLocalisedClause, z, null, new krf.d(str), YearClass.CLASS_2008);
        } else {
            model = null;
        }
        List listP = i2b.a.p(arrayList, model);
        yp0.b.k(listP, 0, 0, 0, 0, 31);
        return new e(listP, cVar != null ? new aw0.e(true, null, null, new n6(new TextLocalisedClause(R$string.purpose_of_payment_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 54) : null);
    }
}
