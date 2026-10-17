package jfb;

import android.net.Uri;
import com.revolut.feature.revolutpay.api.shared.deeplink.RevolutPayOrderParameters;
import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlow;
import com.revolut.kompot.common.ModalDestination;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class y0 extends x0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j6c.b f173846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final uli.c f173847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f173848n;
    public final lfb.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lfb.a f173849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f173850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f173851r;

    public y0(j6c.b revolutPayOrderSummaryProvider, uli.c deeplinkHostsProvider, p reverywhereRevolutPaySourceDeeplinkDecorator, lfb.e externalUriValidator, lfb.a externalDestinationFactory) {
        Intrinsics.checkNotNullParameter(revolutPayOrderSummaryProvider, "revolutPayOrderSummaryProvider");
        Intrinsics.checkNotNullParameter(deeplinkHostsProvider, "deeplinkHostsProvider");
        Intrinsics.checkNotNullParameter(reverywhereRevolutPaySourceDeeplinkDecorator, "reverywhereRevolutPaySourceDeeplinkDecorator");
        Intrinsics.checkNotNullParameter(externalUriValidator, "externalUriValidator");
        Intrinsics.checkNotNullParameter(externalDestinationFactory, "externalDestinationFactory");
        this.f173846l = revolutPayOrderSummaryProvider;
        this.f173847m = deeplinkHostsProvider;
        this.f173848n = reverywhereRevolutPaySourceDeeplinkDecorator;
        this.o = externalUriValidator;
        this.f173849p = externalDestinationFactory;
        this.f173850q = vkm.q.b(1, 5, null);
        this.f173851r = vkm.q.b(8, 5, null);
    }

    @Override // jfb.x0
    public final Flow Z2() {
        return this.f173851r;
    }

    @Override // jfb.x0
    public final z1 b3() {
        return this.f173850q;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    @Override // jfb.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c3(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jfb.y0.c3(java.lang.String):void");
    }

    @Override // jfb.x0
    public final void d3(m redirectionType) {
        Intrinsics.checkNotNullParameter(redirectionType, "redirectionType");
        if (!(redirectionType instanceof l)) {
            throw new NoWhenBranchMatchedException();
        }
        String url2 = ((l) redirectionType).f173820a;
        this.f173848n.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        String url3 = Uri.parse(url2).buildUpon().appendQueryParameter("src", "IN_APP_REVERYWHERE").build().toString();
        Intrinsics.checkNotNullExpressionValue(url3, "toString(...)");
        b7c.c cVar = (b7c.c) this.f173846l;
        xcc.b bVar = cVar.f12993b;
        Intrinsics.checkNotNullParameter(url3, "url");
        jf0.c cVarD = ((s06.c) cVar.f12992a).d(url3);
        if (cVarD == null) {
            throw new IllegalArgumentException("Deeplink cannot be null");
        }
        HashMap map = cVarD.d;
        RevolutPayOrderParameters revolutPayOrderParametersA = bVar.a(map);
        if (revolutPayOrderParametersA == null || !revolutPayOrderParametersA.a()) {
            throw new IllegalArgumentException("Required parameters for RevPay order is missing");
        }
        RevolutPayOrderParameters revolutPayOrderParametersA2 = bVar.a(map);
        if (revolutPayOrderParametersA2 == null) {
            throw new IllegalArgumentException("Required parameters for RevPay order is missing");
        }
        N2(new SummaryFlow(b7c.c.c(cVar, revolutPayOrderParametersA2, false, cVarD.f173627a, null, false, 24)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new jeg.g(this, 5));
    }

    @Override // jfb.x0
    public final l e3(String redirectUrl) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.f173847m.getClass();
        if (kotlin.text.a0.H(redirectUrl, "https://merchant.revolut.com/page-revolut-pay.html", false)) {
            return new l(redirectUrl);
        }
        return null;
    }
}
