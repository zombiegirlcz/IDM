package eq2;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import ip0.qd0;
import ip0.vd0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        wn2.a aVar = domainState.f128226b;
        wn2.d dVar = domainState.d;
        mn2.a aVar2 = domainState.f128227c;
        JointAccountData jointAccountData = domainState.f128225a;
        qd0 qd0Var = aVar == wn2.a.PERSONAL ? qd0.SELECTED : qd0.UNSELECTED;
        vd0 vd0Var = vd0.RADIO;
        List listK = v.k(new SelectableDelegate.Model("ID_PERSONAL_ACCOUNT", new RowDelegate.Model("ID_PERSONAL_ACCOUNT_INNER", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_revolut, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(R$string.account_switch_account_selection_personal, null, null, 14), null, 0, new TextClause(jointAccountData.f63901a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), qd0Var, null, vd0Var, false, null, null, null, false, 32744), new SelectableDelegate.Model("ID_JOINT_ACCOUNT", new RowDelegate.Model("ID_JOINT_ACCOUNT_INNER", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_joint, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(R$string.account_switch_account_selection_joint, null, null, 14), null, 0, new TextClause(d0.k0(jointAccountData.f63902b, " & ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), domainState.f128226b == wn2.a.JOINT ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, false, null, null, null, false, 32744));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        int i2 = j.f128233b[aVar2.ordinal()];
        if (i2 == 1) {
            i = R$string.account_switch_account_selection_title;
        } else if (i2 == 2) {
            int i3 = dVar == null ? -1 : j.f128232a[dVar.ordinal()];
            if (i3 == -1) {
                throw new IllegalStateException("Reached Target Account Selection screen for CASS without a Switch preference set");
            }
            if (i3 == 1) {
                i = R$string.account_switch_account_selection_cass_title;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.account_switch_account_selection_title;
            }
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = dVar == null ? -1 : j.f128232a[dVar.ordinal()];
            if (i5 == -1) {
                throw new IllegalStateException("Reached Target Account Selection screen for Mobility without a Switch preference set");
            }
            if (i5 == 1) {
                i = R$string.account_switch_account_selection_elcimai_full_title;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.account_switch_account_selection_elcimai_partial_title;
            }
        }
        return new g(new TextLocalisedClause(i, null, null, 14), (aVar2 == mn2.a.CASS && dVar == wn2.d.FULL) ? new TextLocalisedClause(R$string.account_switch_account_selection_cass_subtitle, null, null, 14) : null, listK);
    }
}
