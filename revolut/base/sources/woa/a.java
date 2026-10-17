package woa;

import efm.b;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pfm.t;
import te0.w;
import yoa.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements toa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f298907a;

    public a(c notificationsSettingsRepository) {
        Intrinsics.checkNotNullParameter(notificationsSettingsRepository, "notificationsSettingsRepository");
        this.f298907a = notificationsSettingsRepository;
    }

    @Override // toa.a
    public final b a(soa.b setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        c cVar = this.f298907a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(setting, "setting");
        t tVarL = w.g0(cVar.f315641a.updateNotificationSettings(ifk.b.F(setting.b()), ifk.b.I(setting))).l(new xza.a(cVar, setting, 8));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    @Override // toa.a
    public final r b() {
        return this.f298907a.e.f(Unit.f186387a, false);
    }
}
