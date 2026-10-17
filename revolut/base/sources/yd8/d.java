package yd8;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.junior_coparent.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List coparentInvitations = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(coparentInvitations, "coparentInvitations");
        List<vd8.f> list = coparentInvitations;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (vd8.f fVar : list) {
            String strQ = j6.a.q("JUNIOR_PENDING_ACTION_COPARENT_INVITATION", fVar.f287823a);
            int i = R$string.junior_co_parent_pending_action_invitation_title;
            String str = fVar.d;
            arrayList.add(new ActionWidgetDelegate.Model(strQ, new TextLocalisedClause(i, u.c(str), null, 12), new TextLocalisedClause(R$string.junior_co_parent_pending_action_invitation_message, v.k(fVar.f287824b, str), null, 12), new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D183", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), ActionWidgetDelegate.Model.b.C0394b.f51606a, new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(R$string.junior_co_parent_pending_action_invitation_action_view_request, null, null, 14), null, 14), null, fVar, null, false, 7488));
        }
        return arrayList;
    }
}
