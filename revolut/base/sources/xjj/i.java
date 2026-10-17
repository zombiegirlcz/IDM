package xjj;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f306539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f306540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yjj.f f306541c;
    public final unj.e d;
    public final gej.a e;

    public i(q phoneNumberItemMapper, d actionItemsMapper, yjj.f navBarDescriptionMapper, unj.e esimCoverageItemMapper, gej.a bytesFormatter) {
        Intrinsics.checkNotNullParameter(phoneNumberItemMapper, "phoneNumberItemMapper");
        Intrinsics.checkNotNullParameter(actionItemsMapper, "actionItemsMapper");
        Intrinsics.checkNotNullParameter(navBarDescriptionMapper, "navBarDescriptionMapper");
        Intrinsics.checkNotNullParameter(esimCoverageItemMapper, "esimCoverageItemMapper");
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        this.f306539a = phoneNumberItemMapper;
        this.f306540b = actionItemsMapper;
        this.f306541c = navBarDescriptionMapper;
        this.d = esimCoverageItemMapper;
        this.e = bytesFormatter;
    }

    public static CompositeClause a(Instant instant) {
        long epochMilli = instant.toEpochMilli();
        return yoj.b.m(new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TimeClause(epochMilli, new TimeClause.Format.DateMedium(n0.DEFAULT), null, null, 12), new TimeClause(epochMilli, TimeClause.Format.TimeDefault.f57977b, null, null, 12)));
    }
}
