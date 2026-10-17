package b3d;

import a09.z;
import b0a.h;
import b0a.j;
import ch.qos.logback.core.CoreConstants;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import sri.m;
import ue0.e;
import ufm.i;
import wp5.y;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements q1d.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f12022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f12023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f12024c;

    public c(m navigator, xoj.a featuresInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f12022a = navigator;
        this.f12023b = featuresInteractor;
        this.f12024c = featureToggleInteractor;
    }

    public static Set b(jf0.c cVar) {
        List listM0;
        String str = (String) cVar.d.get("convertibleAssets");
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
        return y.D(cVar, "deeplink", 1, "converter");
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
            boolean r0 = r6 instanceof b3d.b
            if (r0 == 0) goto L13
            r0 = r6
            b3d.b r0 = (b3d.b) r0
            int r1 = r0.f12021x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12021x = r1
            goto L1a
        L13:
            b3d.b r0 = new b3d.b
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12021x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            jf0.c r5 = r0.u
            yhm.o.b(r6)
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            yoj.c r6 = yoj.c.FAVOURITES
            xoj.a r2 = r4.f12023b
            cpj.b r2 = (cpj.b) r2
            efm.r r6 = r2.l(r6)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.u = r5
            r0.f12021x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            gte.a r0 = r4.f12024c
            com.revolut.feature.separate_favourites.api.converter.widget.ConverterDelegatesApi$Toggles$HideConverter r1 = com.revolut.feature.separate_favourites.api.converter.widget.ConverterDelegatesApi$Toggles$HideConverter.f86017c
            boolean r0 = r0.a(r1)
            boolean r6 = r6.booleanValue()
            r1 = 0
            if (r6 == 0) goto L90
            if (r0 == 0) goto L90
            java.util.Set r5 = b(r5)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L72
            return r1
        L72:
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.separate_favourites.api.converter.ConverterFeatureConfig$ConverterScreen r0 = new com.revolut.feature.separate_favourites.api.converter.ConverterFeatureConfig$ConverterScreen
            r2 = 14
            r0.<init>(r2, r5)
            r6.<init>(r0)
            q06.h r5 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r6)
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.f160140a
            r6.<init>(r2, r1)
            r5.<init>(r0, r6)
            return r5
        L90:
            q06.i r5 = new q06.i
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f160140a
            r6.<init>(r0, r1)
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b3d.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        efm.d0 d0VarFirstOrError = ((cpj.b) this.f12023b).l(yoj.c.FAVOURITES).firstOrError();
        h hVar = new h(8, new z(this, deeplink, z, 6));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, hVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return e.D(iVar, new j(9));
    }
}
