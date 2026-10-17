package cnc;

import cfl.c0;
import cie.l1;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f25399a;

    public s(r headerMapper, o adjustRecurringDepositActionMapper, l addMoneyActionMapper, q editGoalActionMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(adjustRecurringDepositActionMapper, "adjustRecurringDepositActionMapper");
        Intrinsics.checkNotNullParameter(addMoneyActionMapper, "addMoneyActionMapper");
        Intrinsics.checkNotNullParameter(editGoalActionMapper, "editGoalActionMapper");
        this.f25399a = adjustRecurringDepositActionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Data data;
        Data data2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data3 = domainState.f25387b;
        Data data4 = domainState.f25386a;
        j jVar2 = new j(data3 != null ? (CompositeClause) iii.c.f(data3, new cmc.c(15), new clk.b(11), new l1(7)) : null);
        Data data5 = domainState.f25388c;
        Data data6 = domainState.e;
        Data data7 = domainState.d;
        if (data4 != null) {
            try {
                Object content = data4.getContent();
                data = new Data(content != null ? ((c0) content).f23734c : null, data4.getError(), data4.getLoading());
            } catch (Throwable th10) {
                data = new Data(null, th10, data4.getLoading());
            }
        } else {
            data = null;
        }
        Data dataV = (data5 == null || data6 == null || data7 == null || data == null) ? null : t1.v(data5, data6, data7, data);
        List list = dataV != null ? (List) iii.c.f(dataV, new cmc.c(14), new clk.b(10), new l1(this.f25399a, 6)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        yp0.b.k(list2, 0, 0, 0, 0, 31);
        Data data8 = domainState.f;
        if (data4 != null) {
            try {
                Object content2 = data4.getContent();
                data2 = new Data(content2 != null ? ((c0) content2).f23733b : null, data4.getError(), data4.getLoading());
            } catch (Throwable th11) {
                data2 = new Data(null, th11, data4.getLoading());
            }
        } else {
            data2 = null;
        }
        Data dataT = (data8 == null || data2 == null) ? null : t1.t(data8, data2);
        List list3 = dataT != null ? (List) iii.c.f(dataT, new cmc.c(13), new clk.b(9), new l1(5)) : null;
        if (list3 == null) {
            list3 = f0.f322471a;
        }
        List list4 = list3;
        yp0.b.k(list4, 0, 0, 0, 0, 31);
        List listC = zhm.u.c(new ProductSelectionDelegate.Model("edit-goal", new dc(new GlyphImage(R$drawable.uikit_icn_24_edit, null, null, 6)), new TextLocalisedClause(R$string.wealth_robo_portfolio_manage_goal_edit_goal_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_portfolio_manage_goal_edit_goal_subtitle, null, null, 14), null, i.f25394a, null, false, false, false, 976));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new k(jVar2, zhm.w.u(zhm.v.k(list2, list4, listC)));
    }
}
