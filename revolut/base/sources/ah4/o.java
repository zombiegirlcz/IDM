package ah4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import dx4.e1;
import dx4.p4;
import dx4.q4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import mx4.x;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f4905a;

    public o(x contentListItemMapper) {
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        this.f4905a = contentListItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextClause textClause;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        p4 p4Var = domainState.f4899a;
        ax4.b bVar = domainState.f4901c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.refinancing_account_details_documents_upload_category_title, u.c(p4Var.d), null, 12);
        q4 q4Var = p4Var.f120718c;
        if (q4Var != null) {
            dx4.l lVar = q4Var.f120728c;
            if (lVar != null) {
                String str = q4Var.f120726a;
                textClause = new TextClause(str, (Style) new Click(28, (Integer) null, (Object) lVar, str, false), (Integer) null, false, (o9) null, (List) null, 124);
            } else {
                textClause = q4Var.f120727b ? new TextClause(q4Var.f120726a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : new TextClause(q4Var.f120726a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        } else {
            textClause = null;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.refinancing_account_details_documents_upload_button_continue_title, u.c(p4Var.f120719g), null, 12);
        boolean z = p4Var.f120720h;
        c7 c7Var = new c7(new TextLocalisedClause(R$string.refinancing_account_details_documents_upload_button_continue_footer, null, null, 14), false, null, 6);
        ArrayList arrayList = p4Var.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            a0.x(this.f4905a.b((e1) it8.next(), bVar), arrayList2);
        }
        return new n(textLocalisedClause, textClause, z, textLocalisedClause2, c7Var, arrayList2);
    }
}
