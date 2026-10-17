package xkf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLinkDetails;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f306774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplitBillLinkDetails f306775b;

    public u(w wVar, SplitBillLinkDetails splitBillLinkDetails) {
        this.f306774a = wVar;
        this.f306775b = splitBillLinkDetails;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i3 category = (i3) obj2;
        Intrinsics.checkNotNullParameter(category, "category");
        thf.d dVar = this.f306774a.d;
        SplitBillLinkDetails splitBillLinkDetails = this.f306775b;
        RowDelegate.Model.MainImage.Avatar avatar = new RowDelegate.Model.MainImage.Avatar(new AvatarModel.Default(((bnf.o) dVar).q(splitBillLinkDetails.f, category), null, null, null, null, null, 126), (mx0.i1) null, 6);
        TextClause textClause = new TextClause(splitBillLinkDetails.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Long l2 = splitBillLinkDetails.d;
        RowDelegate.Model model = new RowDelegate.Model("linked_payment_link_transaction", avatar, textClause, null, 0, l2 != null ? new TimeClause(l2.longValue(), new TimeClause.Format.Pretty(0), null, null, 12) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }
}
