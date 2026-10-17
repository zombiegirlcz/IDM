package lh2;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements ch2.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f195155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.c f195156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vz1.a f195157c;

    public i(m navigator, uw1.c apmFeatureChecker, vz1.a disputesRepository) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(disputesRepository, "disputesRepository");
        this.f195155a = navigator;
        this.f195156b = apmFeatureChecker;
        this.f195157c = disputesRepository;
    }

    public static MainScreenFeatureConfig.WithAction d() {
        Intrinsics.checkNotNullExpressionValue("i", "TAG");
        IllegalStateException illegalStateException = new IllegalStateException("Attempted to open WERO deeplink, but feature is disabled");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.WARNING, "i", null, illegalStateException, h0Var);
        return new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("APM_DEEPLINK"), new ApmDeeplinkPayload.Unavailable(ApmDeeplinkPayload.Apm.WERO.f82741b)));
    }

    public static String g(String str, jf0.c cVar) {
        Object obj2 = cVar.d.get(str);
        String str2 = (String) obj2;
        if (str2 == null || d0.W(str2)) {
            obj2 = null;
        }
        String str3 = (String) obj2;
        if (str3 != null) {
            return str3;
        }
        throw new IllegalArgumentException("Missing deeplink parameter ".concat(str));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "wero");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jf0.c r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.i.b(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(jf0.c r10, gim.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof lh2.f
            if (r0 == 0) goto L13
            r0 = r11
            lh2.f r0 = (lh2.f) r0
            int r1 = r0.f195152w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195152w = r1
            goto L18
        L13:
            lh2.f r0 = new lh2.f
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195152w
            r7 = 0
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r11)
            goto L51
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            yhm.o.b(r11)
            java.lang.String r11 = "paymentId"
            java.lang.String r5 = g(r11, r10)
            f02.b r6 = f02.b.REDIRECT_URL
            r0.f195152w = r3
            vq5.w r3 = new vq5.w
            r8 = 11
            vz1.a r4 = r9.f195157c
            r3.<init>(r4, r5, r6, r7, r8)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r10, r3, r0)
            if (r11 != r1) goto L51
            return r1
        L51:
            f02.a r11 = (f02.a) r11
            com.revolut.kompot.common.ExternalDestination$Browser r10 = new com.revolut.kompot.common.ExternalDestination$Browser
            java.lang.String r11 = r11.f130992a
            r10.<init>(r11, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.i.c(jf0.c, gim.c):java.lang.Object");
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
            boolean r0 = r6 instanceof lh2.h
            if (r0 == 0) goto L13
            r0 = r6
            lh2.h r0 = (lh2.h) r0
            int r1 = r0.f195154w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195154w = r1
            goto L1a
        L13:
            lh2.h r0 = new lh2.h
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195154w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.f195154w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            lh2.d r6 = (lh2.d) r6
            r5 = 0
            if (r6 == 0) goto L68
            boolean r0 = r6 instanceof lh2.b
            if (r0 == 0) goto L4b
            lh2.b r6 = (lh2.b) r6
            com.revolut.kompot.common.ParcelableDestination r6 = r6.f195147a
            goto L5c
        L4b:
            boolean r6 = r6 instanceof lh2.c
            if (r6 == 0) goto L62
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithAction r0 = d()
            com.revolut.retail.core.navigation.FeatureCommand r0 = gc0.c.f(r0)
            r6.<init>(r0)
        L5c:
            q06.h r0 = new q06.h
            r0.<init>(r6, r5)
            return r0
        L62:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L68:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.i.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullExpressionValue("i", "TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "i", j6.a.q("Wero Deeplink uri: ", deeplink.f173629c), null, null, 16);
        return w.o0(p0.f264003c, new g(this, deeplink, null));
    }
}
