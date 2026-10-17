package bwi;

import a09.r;
import bnj.n;
import bs9.i0;
import bt9.t;
import com.revolut.retail.core.navigation.FeatureCommand;
import dwi.x;
import efm.d0;
import fo1.b0;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import sri.m;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements pvi.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f19358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f19359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tvi.a f19360c;

    public d(m navigator, x airportLoungesAvailabilityInteractor, tvi.a airportLoungesCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(airportLoungesAvailabilityInteractor, "airportLoungesAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(airportLoungesCommandProvider, "airportLoungesCommandProvider");
        this.f19358a = navigator;
        this.f19359b = airportLoungesAvailabilityInteractor;
        this.f19360c = airportLoungesCommandProvider;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[RETURN] */
    @Override // jf0.d, q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(jf0.c r4) {
        /*
            r3 = this;
            java.lang.String r0 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 2
            java.lang.String r0 = r4.e(r0)
            r1 = 1
            java.lang.String r4 = r4.e(r1)
            int r2 = r4.hashCode()
            switch(r2) {
                case -1140761904: goto L49;
                case 355416697: goto L29;
                case 1081814728: goto L20;
                case 1617328900: goto L17;
                default: goto L16;
            }
        L16:
            goto L51
        L17:
            java.lang.String r0 = "lounges-order-pass"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L53
            goto L51
        L20:
            java.lang.String r0 = "lounges-upgrade"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L53
            goto L51
        L29:
            java.lang.String r2 = "lounges"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L51
            int r4 = r0.length()
            if (r4 != 0) goto L38
            goto L53
        L38:
            java.lang.String r4 = "search"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L53
            java.lang.String r4 = "refund-pass"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L51
            goto L53
        L49:
            java.lang.String r0 = "lounges-select"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L53
        L51:
            r4 = 0
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bwi.d.a(jf0.c):boolean");
    }

    public final z b(FeatureCommand featureCommand) {
        i iVar = new i(new ufm.c(new r(this, featureCommand, 9), 2), new i0(11, new t(21)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }

    public final i c(jf0.c cVar) {
        boolean z = Boolean.parseBoolean((String) cVar.d.get("inline"));
        fwi.a aVar = (fwi.a) this.f19360c;
        aVar.getClass();
        i iVar = new i(w.o0(g.f186406a, new b0(aVar, null, 7)), new i0(12, new a6j.a(z, this, 11)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(jf0.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bwi.c
            if (r0 == 0) goto L13
            r0 = r6
            bwi.c r0 = (bwi.c) r0
            int r1 = r0.f19357x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19357x = r1
            goto L18
        L13:
            bwi.c r0 = new bwi.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f19357x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r5 = r0.u
            yhm.o.b(r6)
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.util.HashMap r5 = r5.d
            java.lang.String r6 = "inline"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            r0.u = r5
            r0.f19357x = r3
            tvi.a r6 = r4.f19360c
            fwi.a r6 = (fwi.a) r6
            com.revolut.retail.core.navigation.FeatureCommand r6 = r6.a()
            if (r6 != r1) goto L51
            return r1
        L51:
            com.revolut.retail.core.navigation.FeatureCommand r6 = (com.revolut.retail.core.navigation.FeatureCommand) r6
            r0 = 0
            if (r5 == 0) goto L61
            q06.h r5 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r6)
            r5.<init>(r1, r0)
            return r5
        L61:
            q06.h r5 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r6)
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.e
            r6.<init>(r2, r0)
            r5.<init>(r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bwi.d.d(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bwi.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        x xVar = this.f19359b;
        z zVarA = xVar.a();
        ufm.c cVar = new ufm.c(new dwi.t(xVar, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        i iVar = new i(w.H0(zVarA, ue0.e.F(cVar, Boolean.FALSE)), new i0(10, new n(this, deeplink, 27)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
