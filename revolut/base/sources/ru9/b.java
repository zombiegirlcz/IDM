package ru9;

import aw0.db;
import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static MoneyClause a(dj0.d amount, Custom custom) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return cp5.d.z(amount.f115083b) ? u5l.a.b(amount, null, k7.NEVER, custom, 3) : new MoneyClause(amount, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), custom, null, 8);
    }

    public static TextClause b(String str, boolean z) {
        if (str == null || kotlin.text.d0.W(str)) {
            return null;
        }
        return new TextClause(str, (Style) (z ? new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION) : null), (Integer) null, false, (o9) null, (List) null, 124);
    }

    public static ChatBubbleDelegate.c c(dv9.n direction, Integer num) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = a.f257461a[direction.ordinal()];
        if (i == 1) {
            return new ChatBubbleDelegate.c.d(num);
        }
        if (i == 2) {
            return new ChatBubbleDelegate.c.b(num);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TimeClause d(DateTime date, Integer num) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new TimeClause(date.getMillis(), TimeClause.Format.TimeDefault.f57977b, new Custom(num, false, db.BODY3, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), null, 8);
    }
}
