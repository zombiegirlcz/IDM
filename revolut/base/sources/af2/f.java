package af2;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import efm.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import skm.p0;
import sri.m;
import wp5.y;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xe2.b {

    @NotNull
    public static final c Companion = new c();
    public static final List e = v.k("04", "05");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f3849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.c f3850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hg2.h f3851c;
    public final FeatureCommand d;

    public f(m navigator, uw1.c apmFeatureChecker, hg2.h upiQrCodeInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(upiQrCodeInteractor, "upiQrCodeInteractor");
        this.f3849a = navigator;
        this.f3850b = apmFeatureChecker;
        this.f3851c = upiQrCodeInteractor;
        this.d = gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "upi");
    }

    public final k b(jf0.c cVar) {
        if (((ty1.b) this.f3850b).b(uw1.f.UPI)) {
            return q.L(p0.f264003c, new d(this, cVar, null));
        }
        rfm.h hVar = rfm.h.f253943a;
        Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
        return hVar;
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
            boolean r0 = r6 instanceof af2.e
            if (r0 == 0) goto L13
            r0 = r6
            af2.e r0 = (af2.e) r0
            int r1 = r0.f3848w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3848w = r1
            goto L1a
        L13:
            af2.e r0 = new af2.e
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3848w
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
            efm.k r5 = r4.b(r5)
            r0.f3848w = r3
            java.lang.Object r6 = nim.a.i(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination r6 = (com.revolut.feature.apm.upi.api.UpiFeatureConfig.Destination) r6
            r5 = 0
            if (r6 == 0) goto L4c
            q06.h r0 = new q06.h
            r0.<init>(r6, r5)
            return r0
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: af2.f.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        f0 f0VarP = new rfm.m(b(deeplink), new aed.f(new a6j.a(this, z, 4), 21), 1).p(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
        return f0VarP;
    }
}
