package exh;

import com.revolut.feature.topup_screen.common.CardDetails;
import efm.d0;
import et6.m0;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import skm.p0;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements wwh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ixh.a f130430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f130431b;

    public b(ixh.a cpgResponseMapper, k requestStrategy) {
        Intrinsics.checkNotNullParameter(cpgResponseMapper, "cpgResponseMapper");
        Intrinsics.checkNotNullParameter(requestStrategy, "requestStrategy");
        this.f130430a = cpgResponseMapper;
        this.f130431b = requestStrategy;
    }

    public final z a(cue.d paymentMethodResponse, String str) {
        Intrinsics.checkNotNullParameter(paymentMethodResponse, "paymentMethodResponse");
        g gVar = (g) this.f130431b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(paymentMethodResponse, "paymentMethodResponse");
        d0 d0VarG = new ufm.i(w.o0(p0.f264003c, new d(gVar, paymentMethodResponse, str, null)), new m0(29, new a(paymentMethodResponse, 2)), 1).g(this.f130430a);
        Intrinsics.checkNotNullExpressionValue(d0VarG, "compose(...)");
        return ue0.e.I(d0VarG, h0.f322473a, new a(paymentMethodResponse, 3));
    }

    public final z b(cue.d cardAuthResponse, CardDetails cardDetails) {
        Intrinsics.checkNotNullParameter(cardAuthResponse, "cardAuthResponse");
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        g gVar = (g) this.f130431b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(cardAuthResponse, "cardAuthResponse");
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        d0 d0VarG = new ufm.i(w.o0(p0.f264003c, new e(gVar, cardAuthResponse, cardDetails, null)), new m0(28, new a(cardAuthResponse, 0)), 1).g(this.f130430a);
        Intrinsics.checkNotNullExpressionValue(d0VarG, "compose(...)");
        return ue0.e.I(d0VarG, h0.f322473a, new a(cardAuthResponse, 1));
    }
}
