package rp8;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.ChallengeEditDetailsScreenContract$InputData;
import ip0.pr;
import ip0.qd0;
import ip0.rr;
import ip0.vd0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChallengeEditDetailsScreenContract$InputData f256288a;

    public q(ChallengeEditDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f256288a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        a0.x(u.c(new ListSubheaderDelegate.Model("ID_SECTION_DETAILS", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_challenges_edit_section_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338)), eVarB);
        String str = domainState.f256273a;
        InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_INPUT_NAME", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.junior_challenges_edit_name_title, null, null, 14), new TextLocalisedClause(R$string.junior_challenges_edit_name_placeholder, null, null, 14), false, null, null, null, null, null, null, false, null, null, false, false, 540673, 0, rr.f166227a, false, false, null, false, m72.b.u(50), false, false, false, null, null, 0, -1092616208, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
        a0.x(u.c(model), eVarB);
        String str2 = domainState.f256274b;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("LIST_ID_INPUT_DESCRIPTION", new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.junior_challenges_edit_description_title, null, null, 14), new TextLocalisedClause(R$string.junior_challenges_edit_description_placeholder, null, null, 14), false, null, null, null, null, null, null, false, null, null, false, false, 540673, 0, pr.f165860a, false, false, null, false, m72.b.u(255), false, false, false, null, null, 0, -1092616208, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
        a0.x(u.c(model2), eVarB);
        np8.c cVar = this.f256288a.f77373a;
        if (cVar == np8.c.Create) {
            a0.x(u.c(new ListSubheaderDelegate.Model("ID_SECTION_FREQUENCY", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_challenges_edit_section_frequency_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338)), eVarB);
            boolean z = domainState.f256275c;
            RowDelegate.Model model3 = new RowDelegate.Model("LIST_ID_FREQUENCY_RECURRING_FALSE_inner", null, new TextLocalisedClause(R$string.junior_challenges_edit_frequency_type_one_off_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_challenges_edit_frequency_type_one_off_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
            qd0 qd0Var = !z ? qd0.SELECTED : qd0.UNSELECTED;
            vd0 vd0Var = vd0.RADIO;
            List listK = v.k(new SelectableDelegate.Model("LIST_ID_FREQUENCY_RECURRING_FALSE", model3, qd0Var, null, vd0Var, false, null, null, null, false, 32744), new SelectableDelegate.Model("LIST_ID_FREQUENCY_RECURRING_TRUE", new RowDelegate.Model("LIST_ID_FREQUENCY_RECURRING_TRUE_inner", null, new TextLocalisedClause(R$string.junior_challenges_edit_frequency_type_recurring_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_challenges_edit_frequency_type_recurring_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874), z ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, false, null, null, null, false, 32744));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            a0.x(listK, eVarB);
        }
        aim.e eVarA = u.a(eVarB);
        int i2 = p.f256287a[cVar.ordinal()];
        if (i2 == 1) {
            i = R$string.junior_challenges_edit_header_new_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.junior_challenges_edit_header_edit_title;
        }
        return new m(eVarA, new TextLocalisedClause(i, null, null, 14), !d0.W(str) && str.length() <= 50 && domainState.f256274b.length() <= 255);
    }
}
