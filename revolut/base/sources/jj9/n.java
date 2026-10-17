package jj9;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.PayLaterCrossSellContext;
import ieg.z;
import java.util.List;
import jfb.v0;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi9.j f174803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oj9.f f174804b;

    public n(lj9.c payLaterHeaderSectionMapper, lj9.d payLaterLimitSectionMapper, lj9.e payLaterPricingSectionMapper, vi9.j payLaterDocumentsSectionMapper, oj9.f payLaterCrossSellItemMapper) {
        Intrinsics.checkNotNullParameter(payLaterHeaderSectionMapper, "payLaterHeaderSectionMapper");
        Intrinsics.checkNotNullParameter(payLaterLimitSectionMapper, "payLaterLimitSectionMapper");
        Intrinsics.checkNotNullParameter(payLaterPricingSectionMapper, "payLaterPricingSectionMapper");
        Intrinsics.checkNotNullParameter(payLaterDocumentsSectionMapper, "payLaterDocumentsSectionMapper");
        Intrinsics.checkNotNullParameter(payLaterCrossSellItemMapper, "payLaterCrossSellItemMapper");
        this.f174803a = payLaterDocumentsSectionMapper;
        this.f174804b = payLaterCrossSellItemMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = (g) iii.c.f(t1.t(domainState.f174781a, domainState.d), new jj3.a(6), new v0(17), new jb8.b(this, 10));
        List list = (List) iii.c.f(t1.v(domainState.f174781a, domainState.f174782b, domainState.f174783c, domainState.e), new jj3.a(7), new v0(18), new z(this, domainState, 28));
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        ai9.c cVar = domainState.f;
        PayLaterCrossSellContext payLaterCrossSellContext = cVar != null ? cVar.f : null;
        companion.getClass();
        return new i(gVar, list, AnalyticsContext.Companion.a(payLaterCrossSellContext));
    }
}
