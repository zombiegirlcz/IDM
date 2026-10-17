package uxa;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vxa.c;
import vxa.d;
import vxa.e;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public b(xxa.a repository, d recipientRevolutUserProvider, e userValidationProvider, toa.a notificationSettingsInteractor, vxa.a availableCountryValidationProvider, vxa.b notInterestedValidationProvider, c personalReceiverValidationProvider, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(recipientRevolutUserProvider, "recipientRevolutUserProvider");
        Intrinsics.checkNotNullParameter(userValidationProvider, "userValidationProvider");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(availableCountryValidationProvider, "availableCountryValidationProvider");
        Intrinsics.checkNotNullParameter(notInterestedValidationProvider, "notInterestedValidationProvider");
        Intrinsics.checkNotNullParameter(personalReceiverValidationProvider, "personalReceiverValidationProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        new ConcurrentHashMap();
    }
}
