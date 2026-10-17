package cgh;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vfh.a f23986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f23987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1h.h f23988c;

    public t(vfh.a commonMapper, l80.e dateProvider, d1h.h disclaimersMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        this.f23986a = commonMapper;
        this.f23987b = dateProvider;
        this.f23988c = disclaimersMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new p(new TextLocalisedClause(R$string.wealth_private_equity_fund_details_about_highlights_header, null, null, 14), (List) iii.c.f(t1.t(domainState.f23977a, domainState.f23978b), new cge.g(this, 3), new ccg.a(11), new cab.m(this, domainState, 3)));
    }
}
