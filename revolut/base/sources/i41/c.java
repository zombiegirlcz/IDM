package i41;

import com.revolut.ProtectedRevolutApplication;
import kotlin.jvm.internal.Intrinsics;
import l41.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.c f158265a;

    public c(z70.c globalSettingsProvider) {
        b getRtcStatus = b.f;
        Intrinsics.checkNotNullParameter(getRtcStatus, "getRtcStatus");
        Intrinsics.checkNotNullParameter(globalSettingsProvider, "globalSettingsProvider");
        this.f158265a = globalSettingsProvider;
    }

    public final h41.b a() {
        b bVar = b.f;
        ProtectedRevolutApplication.BuildConfig buildConfigGChEy = ProtectedRevolutApplication.BuildConfig.GChEy();
        String sessionId = buildConfigGChEy.qbbq;
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        String androidId = buildConfigGChEy.Ithv;
        Intrinsics.checkNotNullExpressionValue(androidId, "androidId");
        return new h41.b(sessionId, androidId, buildConfigGChEy.Iaa, buildConfigGChEy.GH, buildConfigGChEy.eHuC, buildConfigGChEy.yr, buildConfigGChEy.p, buildConfigGChEy.xnr, buildConfigGChEy.sgvi, buildConfigGChEy.hHxIe, buildConfigGChEy.CpIG, this.f158265a.a(), buildConfigGChEy.ogh, buildConfigGChEy.s, buildConfigGChEy.kD, buildConfigGChEy.HeAop);
    }
}
