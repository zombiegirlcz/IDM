package yxc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.selfserve.entity.config.shared.models.EntityProgressStep;
import ip0.o50;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements m {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f317652a = r0.k(new Pair("DONE", zxc.b.DONE), new Pair("EMPTY", zxc.b.EMPTY), new Pair("VERIFIED", zxc.b.VERIFIED), new Pair("ACTION_REQUIRED", zxc.b.ACTION_REQUIRED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f317653b;

    static {
        Pair pair = new Pair("INITIAL", zxc.a.INITIAL);
        Pair pair2 = new Pair("PENDING", zxc.a.PENDING);
        Pair pair3 = new Pair("ACTION_REQUIRED", zxc.a.ACTION_REQUIRED);
        Pair pair4 = new Pair("TO_BE_REVIEWED", zxc.a.TO_BE_REVIEWED);
        zxc.a aVar = zxc.a.IN_REVIEW;
        f317653b = r0.k(pair, pair2, pair3, pair4, new Pair("IN_REVIEW", aVar), new Pair("UNDER_REVIEW", aVar), new Pair("VERIFIED", zxc.a.VERIFIED));
    }

    public static o50 a(EntityProgressStep entityProgressStep) {
        String string;
        String str = entityProgressStep != null ? entityProgressStep.f85841a : null;
        if (str == null) {
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = false;
        if (entityProgressStep != null && entityProgressStep.f85842b != zxc.b.EMPTY) {
            z = true;
        }
        Long l2 = entityProgressStep != null ? entityProgressStep.f85843c : null;
        if (l2 == null || (string = new DateTime(l2.longValue(), DateTimeZone.UTC).toString("MMM dd")) == null) {
            string = "-";
        }
        return new o50(textClause, new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z);
    }
}
