package j3d;

import ch.qos.logback.core.CoreConstants;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import ivb.i;
import j1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import sri.m;
import w4l.h;
import wp5.y;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements t1d.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f171177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f171178b;

    public c(m navigator, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f171177a = navigator;
        this.f171178b = featuresInteractor;
    }

    public static Set b(jf0.c cVar) {
        List listM0;
        String str = (String) cVar.d.get("selectedAssetTypes");
        if (str != null && (listM0 = d0.m0(str, new char[]{CoreConstants.COMMA_CHAR}, 6)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM0) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new FavouritesAssetTypeKey((String) it8.next()));
            }
            Set setI1 = zhm.d0.i1(arrayList2);
            if (setI1 != null) {
                return setI1;
            }
        }
        return h0.f322473a;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "watchlist");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof j3d.b
            if (r0 == 0) goto L13
            r0 = r8
            j3d.b r0 = (j3d.b) r0
            int r1 = r0.f171176x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171176x = r1
            goto L1a
        L13:
            j3d.b r0 = new j3d.b
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171176x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L64
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            xoj.a r8 = r6.f171178b
            yoj.c r2 = yoj.c.FAVOURITES
            efm.r r8 = xoj.a.d(r8, r2)
            j1.e r2 = new j1.e
            r4 = 28
            r2.<init>(r4)
            ivb.i r4 = new ivb.i
            r5 = 28
            r4.<init>(r2, r5)
            efm.r r8 = r8.map(r4)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r0.f171176x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r0 = 0
            if (r8 == 0) goto L9b
            java.util.Set r7 = b(r7)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L78
            return r0
        L78:
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.separate_favourites.api.combined_watchlist.CombinedWatchlistFeatureConfig r1 = new com.revolut.feature.separate_favourites.api.combined_watchlist.CombinedWatchlistFeatureConfig
            com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext r2 = new com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext
            java.lang.String r3 = "COMBINED_WATCHLIST_ORDERING_HOME"
            r2.<init>(r3, r7, r7)
            r1.<init>(r2)
            r8.<init>(r1)
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r8)
            q06.b r8 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.f160140a
            r8.<init>(r2, r0)
            r7.<init>(r1, r8)
            return r7
        L9b:
            q06.i r7 = new q06.i
            q06.b r8 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r8.<init>(r1, r0)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j3d.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        efm.d0 d0VarFirstOrError = ((cpj.b) this.f171178b).j(yoj.c.FAVOURITES, h.f294642c).map(new i(new e(26), 25)).firstOrError();
        i iVar = new i(new g48.h(this, deeplink, z, 14), 26);
        d0VarFirstOrError.getClass();
        ufm.i iVar2 = new ufm.i(new ufm.i(d0VarFirstOrError, iVar, 0), new i(new e(27), 27), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        return iVar2;
    }
}
