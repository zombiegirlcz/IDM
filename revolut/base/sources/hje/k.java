package hje;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements cje.f, q06.k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f152746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f152747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FeatureCommand f152748c;

    public k(sri.m navigator, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f152746a = cryptoNavigationInterceptor;
        this.f152747b = navigator;
        this.f152748c = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "newly-added");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f152746a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f152746a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f152746a.d(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hje.j
            if (r0 == 0) goto L13
            r0 = r6
            hje.j r0 = (hje.j) r0
            int r1 = r0.f152745w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152745w = r1
            goto L1a
        L13:
            hje.j r0 = new hje.j
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f152745w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f173629c
            r0.f152745w = r3
            ai5.b r6 = r4.f152746a
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            q06.j r6 = (q06.j) r6
            if (r6 == 0) goto L46
            return r6
        L46:
            q06.h r5 = new q06.h
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.d
            r1 = 0
            r6.<init>(r0, r1)
            com.revolut.retail.feature.crypto.newlyadded.api.navigation.NewlyAddedCryptoDestination r0 = com.revolut.retail.feature.crypto.newlyadded.api.navigation.NewlyAddedCryptoDestination.f100029a
            r5.<init>(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hje.k.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        e eVar = new e(new gae.a(this, z, 9), 6);
        d0VarB.getClass();
        ufm.i iVar = new ufm.i(d0VarB, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
