package g58;

import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.joint.impl.R$string;
import ip0.ab;
import ip0.bb;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_invitee_confirm_number_title, u.c(domainState.f140686a.e5()), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.joint_invitee_confirm_number_subtitle, u.c(domainState.f140686a.e5()), null, 12);
        String str = domainState.f140687b;
        Integer numValueOf = str != null ? Integer.valueOf(str.length()) : null;
        ab abVar = ab.DIGITS_4;
        a aVar = (numValueOf != null && numValueOf.intValue() == abVar.a()) ? a.ACTIVE : a.DISABLED;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.joint_invitee_button_confirm_invitation, null, null, 14);
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        bb bbVar = bb.START;
        int i = R$attr.uikit_dp16;
        return new e(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, aVar, u.c(new z3("CODE_ID", str, abVar, null, false, bbVar, false, false, 0, 0, i, i, 920)));
    }
}
