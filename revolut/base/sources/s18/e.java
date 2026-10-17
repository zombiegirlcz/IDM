package s18;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ybl.k;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends y08.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mk0.a f259112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f259113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final toa.a f259114n;
    public final k o;

    static {
        Intrinsics.checkNotNullParameter("SMART_NOTIFICATIONS_COMPLIANCE_ACKNOWLEDGED", "id");
    }

    public e(mk0.a personalisationStorage, gte.a featureToggleInteractor, toa.a notificationSettingsInteractor, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f259112l = personalisationStorage;
        this.f259113m = featureToggleInteractor;
        this.f259114n = notificationSettingsInteractor;
        this.o = tradingAccountsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // y08.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(boolean r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s18.e.Z2(boolean, gim.c):java.lang.Object");
    }
}
