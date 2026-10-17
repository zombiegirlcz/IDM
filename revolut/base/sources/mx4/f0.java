package mx4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f210176a;

    public f0(u contentImageMapper) {
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        this.f210176a = contentImageMapper;
    }

    public final hx4.a a(fx4.h header, int i) {
        Intrinsics.checkNotNullParameter(header, "header");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(header.f138731a), null, 12);
        fx4.g gVar = header.f138732b;
        TextLocalisedClause textLocalisedClause2 = gVar != null ? new TextLocalisedClause(R$string.credit_application_constructor_header_second_description_text, zhm.u.c(gVar.f138730a), null, 12) : null;
        dx4.d1 d1Var = header.f138733c;
        u uVar = this.f210176a;
        yy0.j jVar = d1Var != null ? new yy0.j(uVar.a(d1Var)) : null;
        List<fx4.f> list = header.d;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (fx4.f fVar : list) {
            String str = fVar.f138727a;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_constructor_header_action_label, zhm.u.c(str), null, 12);
            dx4.d1 d1Var2 = fVar.f138728b;
            arrayList.add(new ActionsView.Item(str, null, false, null, null, textLocalisedClause3, d1Var2 != null ? uVar.a(d1Var2) : null, null, null, null, false, null, null, fVar.f138729c, null, 24478));
        }
        return new hx4.a(textLocalisedClause, textLocalisedClause2, jVar, arrayList);
    }

    public final hx4.b b(int i) {
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        return new hx4.b(new TextLocalisedClause(i, zhm.u.c(""), null, 12));
    }
}
