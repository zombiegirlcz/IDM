package val;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.suspicious_transaction.api.R$string;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogLink;
import ip0.ak0;
import ip0.ck0;
import ip0.ut;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SuspiciousTransactionDialog.Action action = domainState.f287333a;
        List list = action.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new ut(a0.d.n("ID_GUIDE_STEP_", i), new TextClause((String) obj2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i2, false, null, null, 1016));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        aim.e eVarB = u.b();
        if (!d0.W(action.f)) {
            eVarB.add(new TextDelegate.Model("ID_LINK_TITLE", new TextClause(action.f, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
        }
        ArrayList<SuspiciousTransactionDialogLink> arrayList2 = action.f104937g;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (SuspiciousTransactionDialogLink suspiciousTransactionDialogLink : arrayList2) {
            arrayList3.add(new ListCellDelegate.Model(j6.a.q("ID_LINK_", suspiciousTransactionDialogLink.f104976b), new j8(new UrlImage(suspiciousTransactionDialogLink.f104975a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)), new TextClause(suspiciousTransactionDialogLink.f104976b, (Style) null, Integer.valueOf(R$attr.uikit_colorLightBlue), false, (o9) null, (List) null, 122), null, false, suspiciousTransactionDialogLink, null, 0, 0, 0, 0, 4056));
        }
        eVarB.addAll(arrayList3);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        aim.e eVarB2 = u.b();
        if (action.f104938h.length() > 0) {
            eVarB2.add(new TextDelegate.Model("ID_DISCLAIMER", new TextClause(action.f104938h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ak0(yj0.CENTER_HORIZONTAL, null, 2), null, null, 0, 0, 0, 0, 2036));
        }
        List listO = i2b.a.o(i2b.a.o(arrayList, eVarA), u.a(eVarB2));
        tal.c cVar = new tal.c((Clause) new TextLocalisedClause(R$string.outbound_transfer_confirmation_action_cancel, null, null, 14), (Clause) new TextLocalisedClause(R$string.outbound_transfer_confirmation_action_agree, null, null, 14), true);
        Integer numValueOf = action.f104934a ? null : Integer.valueOf(R$attr.uikit_colorForeground);
        TextClause textClause = new TextClause(action.f104935b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(action.f104935b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause3 = new TextClause(action.d, (Style) null, numValueOf, false, (o9) null, (List) null, 122);
        String str = action.f104936c;
        return new g(listO, cVar, new tal.a(textClause, textClause2, textClause3, true, str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left)));
    }
}
