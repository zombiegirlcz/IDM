package jck;

import aw0.c7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.retail.feature.plan_gifting.impl.R$plurals;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3.f f172838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f172839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f172840c;

    public c(dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f172838a = contactsMapper;
        this.f172839b = te0.w.y0(new ja3.b(this, 6));
        this.f172840c = te0.w.y0(new ja3.b(this, 7));
    }

    public static TextClause a(String str) {
        return new TextClause(str, (Style) new Custom(null, false, null, true, null, Constants.TAG_BLE_FIRMWARE_VERSION), (Integer) null, false, (o9) null, (List) null, 124);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    public final RowDelegate.Model b(i0 upcomingBirthday, x upcomingBirthdaysState) {
        Clause clauseB;
        Clause textLocalisedClause;
        Object obj2;
        Intrinsics.checkNotNullParameter(upcomingBirthday, "upcomingBirthday");
        Intrinsics.checkNotNullParameter(upcomingBirthdaysState, "upcomingBirthdaysState");
        RowDelegate.Model modelM = ((xl3.d) this.f172838a).m(upcomingBirthday.f172850a);
        int[] iArr = b.f172836a;
        int i = iArr[upcomingBirthdaysState.ordinal()];
        if (i == 1) {
            clauseB = (TextClause) this.f172839b.getValue();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            clauseB = com.revolut.core.ui_kit.models.j.b(c7.Companion, upcomingBirthday.f172851b, new LocalDateClause$DateFormat.DayAndMonth(0));
        }
        Clause clause = clauseB;
        int i2 = iArr[upcomingBirthdaysState.ordinal()];
        if (i2 == 1) {
            textLocalisedClause = (TextClause) this.f172840c.getValue();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = upcomingBirthday.f172852c;
            textLocalisedClause = i3 == 0 ? new TextLocalisedClause(R$string.premium_gift_recipient_birthdays_section_today, null, null, 14) : new TextLocalisedQuantityClause(R$plurals.premium_gift_recipient_birthdays_days, Integer.valueOf(i3), zhm.u.c(Integer.valueOf(i3)), (Style) null, 24);
        }
        RowDelegate.Model modelX = RowDelegate.Model.x(modelM, null, null, null, clause, null, 0, new RowDelegate.Model.c.b(null, textLocalisedClause, null, false, ISO781611.SMT_TAG), false, null, null, 0, 0, 0, 0, null, -1057, 15);
        int i5 = iArr[upcomingBirthdaysState.ordinal()];
        if (i5 == 1) {
            obj2 = "id_upcoming_birthdays_item_sharing_disabled";
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = modelX.u;
        }
        return RowDelegate.Model.x(modelX, null, null, null, null, null, 0, null, false, null, obj2, 0, 0, 0, 0, null, -4194305, 15);
    }
}
