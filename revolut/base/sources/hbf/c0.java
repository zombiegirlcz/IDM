package hbf;

import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.data.model.Data;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements cli.n {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f150659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f150660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f150661c;
    public final Lazy d;
    public final Lazy e;

    public c0(kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f150659a = wealthAccountHeaderUiMapper;
        this.f150660b = yhm.j.b(new h43.b(15));
        this.f150661c = yhm.j.b(new h43.b(16));
        this.d = yhm.j.b(new h43.b(17));
        this.e = yhm.j.b(new h43.b(18));
    }

    public static s a(c0 c0Var, r rVar, List list, int i) {
        if ((i & 1) != 0) {
            rVar = p.f150674a;
        }
        return new s(rVar, list, f0.f322471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest r39) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hbf.c0.b(com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest):java.util.ArrayList");
    }

    public static TimeClause d(ZonedDateTime zonedDateTime, TimeClause.Format.DayAndMonth dayAndMonth) {
        return new TimeClause(zonedDateTime.toInstant().toEpochMilli(), dayAndMonth, null, null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f150664a;
        return data == null ? a(this, null, (List) this.f150660b.getValue(), 5) : (s) iii.c.f(data, new y(this, 0), new h1c.c(this, 25), new hb4.n(this, domainState, 2));
    }
}
