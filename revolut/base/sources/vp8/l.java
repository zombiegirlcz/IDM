package vp8;

import aw0.n6;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.junior_tasks.api.R$string;
import ip0.ak0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextDelegate.Model model = null;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.junior_challenges_edit_dialog_frequency_title, null, null, 14), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.junior_challenges_edit_dialog_frequency_action_set_frequency, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        aim.e eVarB = u.b();
        EnumEntries enumEntriesA = dp8.d.a();
        ArrayList<dp8.d> arrayList = new ArrayList();
        for (Object obj2 : enumEntriesA) {
            dp8.d dVar = (dp8.d) obj2;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            int i = dp8.e.f116841a[dVar.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                arrayList.add(obj2);
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (dp8.d dVar2 : arrayList) {
            arrayList2.add(new SingleChoiceDelegate.Model(j6.a.q("LIST_ID_FREQUENCY_", dVar2.name()), new TextLocalisedClause(cp5.c.v(dVar2), null, null, 14), dVar2 == domainState.f291139a, null, dVar2, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        a0.x(arrayList2, eVarB);
        int i2 = k.f291143a[domainState.f291139a.ordinal()];
        if (i2 == 1) {
            model = new TextDelegate.Model("ID_CHALLENGE_FREQUENCY_PICKER_FOOTER", new TextLocalisedClause(R$string.junior_challenges_edit_dialog_frequency_footer_weekly, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        } else if (i2 == 2) {
            model = new TextDelegate.Model("ID_CHALLENGE_FREQUENCY_PICKER_FOOTER", new TextLocalisedClause(R$string.junior_challenges_edit_dialog_frequency_footer_monthly, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        } else if (i2 != 3 && i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        a0.x(v.l(model), eVarB);
        return new cii.b(eVar, u.a(eVarB), aVar);
    }
}
