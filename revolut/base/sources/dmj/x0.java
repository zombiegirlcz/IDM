package dmj;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class x0 implements cli.n {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qjj.f f116185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a f116186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fmj.d f116187c;
    public final fmj.f d;

    public x0(qjj.f payWithItemMapper, com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a esimDynamicTermsMapper, fmj.a actionButtonClauseMapper, fmj.d paymentSummaryMapper, fmj.f planSummaryMapper) {
        Intrinsics.checkNotNullParameter(payWithItemMapper, "payWithItemMapper");
        Intrinsics.checkNotNullParameter(esimDynamicTermsMapper, "esimDynamicTermsMapper");
        Intrinsics.checkNotNullParameter(actionButtonClauseMapper, "actionButtonClauseMapper");
        Intrinsics.checkNotNullParameter(paymentSummaryMapper, "paymentSummaryMapper");
        Intrinsics.checkNotNullParameter(planSummaryMapper, "planSummaryMapper");
        this.f116185a = payWithItemMapper;
        this.f116186b = esimDynamicTermsMapper;
        this.f116187c = paymentSummaryMapper;
        this.d = planSummaryMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a0 domainState = (a0) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (c0) iii.c.f(t1.u(domainState.e, domainState.f116136c, domainState.f116134a), new a(this, 3), new dmb.m(this, 2), new cab.m(this, domainState, 28));
    }
}
