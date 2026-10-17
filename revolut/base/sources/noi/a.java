package noi;

import com.revolut.data.network.models.security.SecuritySettingRequestDto;
import com.revolut.data.network.models.security.SecuritySettings;
import e8h.p;
import ie.b0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import pfm.t;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements loi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final loi.b f218046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final soi.e f218047b;

    public a(loi.b analyticsTracker, soi.e targetAnalyticsRepository) {
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(targetAnalyticsRepository, "targetAnalyticsRepository");
        this.f218046a = analyticsTracker;
        this.f218047b = targetAnalyticsRepository;
    }

    public final pfm.a a() {
        soi.e eVar = this.f218047b;
        w4l.f fVar = eVar.d;
        Unit unit = Unit.f186387a;
        pfm.a aVar = new pfm.a(fVar.g(unit, false).f(m70.a.g(eVar.d.e(unit, w4l.j.f294644c), null, new akg.d(28), 1).firstOrError()), new b0(new f2(this, 1), 12), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a b(boolean z) {
        soi.e eVar = this.f218047b;
        t tVarL = w.g0(eVar.f264847a.putSecuritySetting(SecuritySettings.ANALYTICS_EVENTS.getSettingsQuery(), new SecuritySettingRequestDto(z))).l(new p(eVar, z, 6));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        pfm.a aVarE = tVarL.e(new pfm.h(new p(this, z, 3), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
