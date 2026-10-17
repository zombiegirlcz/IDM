package drl;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.testing.recorder.model.TestRecordingSession;
import com.revolut.testing.recorder.navigation.TestRecorderDestination;
import java.util.HashMap;
import jf0.c;
import jf0.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import q06.h;
import q06.k;
import sri.m;
import yhi.b;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f117172a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f117172a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        od0.a aVar = od0.a.f224253a;
        return od0.a.e() && Intrinsics.f(deeplink.e(1), "test") && Intrinsics.f(deeplink.e(2), "record") && d0.W(deeplink.e(3));
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        HashMap map = cVar.d;
        String str = cVar.f173627a;
        String str2 = (String) map.get("testId");
        if (str2 == null) {
            throw new IllegalArgumentException(j6.a.q("No 'testId' in ", str));
        }
        if (d0.W(str2)) {
            throw new IllegalArgumentException(j6.a.q("No 'testId' in ", str));
        }
        String str3 = (String) map.get("jwt");
        if (str3 == null) {
            throw new IllegalArgumentException(j6.a.q("No 'jwt' in ", str));
        }
        if (d0.W(str3)) {
            throw new IllegalArgumentException(j6.a.q("No 'jwt' in ", str));
        }
        String str4 = (String) map.get("env");
        if (str4 == null) {
            throw new IllegalArgumentException(j6.a.q("No 'env' in ", str));
        }
        if (d0.W(str4)) {
            throw new IllegalArgumentException(j6.a.q("No 'env' in ", str));
        }
        return new h(new BridgeDestination(new FeatureCommand(new KompotOverlayFeatureConfig(new TestRecorderDestination.Intro(new TestRecordingSession(str2, str3, str4)), b.POPUP, (Integer) null, 12))), null);
    }

    @Override // jf0.d
    public final efm.d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        boolean zA = a(deeplink);
        String str = deeplink.f173627a;
        HashMap map = deeplink.d;
        if (!zA) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        String str2 = (String) map.get("testId");
        if (str2 == null || d0.W(str2)) {
            ufm.c cVarL = efm.d0.l(new IllegalArgumentException(j6.a.q("No 'testId' in ", str)));
            Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
            return cVarL;
        }
        String str3 = (String) map.get("jwt");
        if (str3 == null || d0.W(str3)) {
            ufm.c cVarL2 = efm.d0.l(new IllegalArgumentException(j6.a.q("No 'jwt' in ", str)));
            Intrinsics.checkNotNullExpressionValue(cVarL2, "error(...)");
            return cVarL2;
        }
        String str4 = (String) map.get("env");
        if (str4 == null || d0.W(str4)) {
            ufm.c cVarL3 = efm.d0.l(new IllegalArgumentException(j6.a.q("No 'env' in ", str)));
            Intrinsics.checkNotNullExpressionValue(cVarL3, "error(...)");
            return cVarL3;
        }
        this.f117172a.c(new FeatureCommand(new KompotOverlayFeatureConfig(new TestRecorderDestination.Intro(new TestRecordingSession(str2, str3, str4)), b.POPUP, (Integer) null, 12)));
        ufm.b bVarM2 = efm.d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
