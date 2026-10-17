package bo8;

import au6.a3;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends oki.h implements m {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f17299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final te8.z f17300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kd8.e f17301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wsg.b f17302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fmc.z f17303t;
    public final uw1.c u;
    public final c70.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xi8.b f17304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zn8.c f17305x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f17306y;
    public final cli.y z;

    public b0(e0 stateMapper, c inputData, hj8.a juniorProfileInteractor, te8.z juniorProductsInteractor, kd8.e juniorConsentInteractor, wsg.b walletsInteractor, fmc.z juniorGraduationInteractor, uw1.c apmFeatureChecker, c70.a clipboard, xi8.b juniorPaymentLinkSharingInteractor, zn8.c juniorAccountDetailsCustomAmountBundleProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorGraduationInteractor, "juniorGraduationInteractor");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(juniorPaymentLinkSharingInteractor, "juniorPaymentLinkSharingInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDetailsCustomAmountBundleProvider, "juniorAccountDetailsCustomAmountBundleProvider");
        this.o = inputData;
        this.f17299p = juniorProfileInteractor;
        this.f17300q = juniorProductsInteractor;
        this.f17301r = juniorConsentInteractor;
        this.f17302s = walletsInteractor;
        this.f17303t = juniorGraduationInteractor;
        this.u = apmFeatureChecker;
        this.v = clipboard;
        this.f17304w = juniorPaymentLinkSharingInteractor;
        this.f17305x = juniorAccountDetailsCustomAmountBundleProvider;
        this.f17306y = new vii.b();
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        this.z = mra.d.b(this, new b(data, data2, od0.i.f224256b, a.NONE), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f17306y, new a3(continuation, this, 25)), null, null, new bi2.n(this, continuation, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
