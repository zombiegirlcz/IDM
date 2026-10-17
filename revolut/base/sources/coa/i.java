package coa;

import cli.y;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.data.network.models.security.SecuritySettings;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nyb.b0;
import skm.a2;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements c {
    public final toa.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final am2.a f25509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final eub.k f25510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pp3.b f25511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f25512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f25513t;

    public i(b stateMapper, toa.a notificationSettingsInteractor, am2.a profileTypeInteractor, eub.k personalisationAvailabilityInteractor, pp3.b creditCollectionNotificationSettingsInteractor, gte.a toggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(personalisationAvailabilityInteractor, "personalisationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(creditCollectionNotificationSettingsInteractor, "creditCollectionNotificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(toggleInteractor, "toggleInteractor");
        this.o = notificationSettingsInteractor;
        this.f25509p = profileTypeInteractor;
        this.f25510q = personalisationAvailabilityInteractor;
        this.f25511r = creditCollectionNotificationSettingsInteractor;
        this.f25513t = mra.d.b(this, new a(((jte.d) toggleInteractor).c(ChatApi$Toggles.MoneyAssistant.f50984c), 15), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, mo3.a.g(rd0.e.b(this.f25509p.a()), null, null, 3), null, null, new g(this, continuation, 1), 3);
        I2();
        b0 b0Var = (b0) this.f25510q;
        y21.c cVar = b0Var.f220776c;
        SecuritySettings securitySettings = SecuritySettings.TRANSACTIONS_USAGE;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, rd0.e.b(nim.a.w(kli.a.i(cVar.b(securitySettings, hVar), cVar.b(SecuritySettings.REVOLUT_PRODUCTS_USAGE, hVar), cVar.b(SecuritySettings.REVPOINTS_PROFILE_USAGE, hVar)), new nya.b0(b0Var, 4))), null, null, new g(this, continuation, 0), 3);
    }

    public final void I2() {
        a2 a2Var = this.f25512s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f25512s = yji.l.a1(this, xam.a.h(new g(this, continuation, 2), rd0.e.b(this.f25509p.a())), null, null, new g(this, continuation, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f25513t;
    }
}
