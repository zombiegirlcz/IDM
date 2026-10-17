package ur9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.o;
import oq9.t;
import org.jetbrains.annotations.NotNull;
import ujb.v;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq9.c f282261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f282262b;

    public f(nq9.c membersMapper) {
        Intrinsics.checkNotNullParameter(membersMapper, "membersMapper");
        this.f282261a = membersMapper;
        this.f282262b = j.b(new v(25));
    }

    public static boolean a(List list, o oVar) {
        List<t> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (t tVar : list2) {
            if (Intrinsics.f(tVar.f227855c, oVar) && tVar.e.isAfterNow()) {
                return true;
            }
        }
        return false;
    }

    public static RowDelegate.Model.c b(st9.e eVar, List list) {
        int i = e.f282260a[eVar.f265544c.ordinal()];
        if (i == 1) {
            return new RowDelegate.Model.c.b(new TextLocalisedClause(R$string.payments_groups_settle_up_debts_pending, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, false, 126);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (list == null) {
            return new pf(new TextLocalisedClause(R.string.common_action_send, null, null, 14), null, null, false, null, null, 510);
        }
        if (a(list, eVar.f265545g)) {
            return null;
        }
        return new pf(new TextLocalisedClause(R.string.common_action_remind, null, null, 14), null, null, false, null, null, 510);
    }
}
