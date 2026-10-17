package ue9;

import com.revolut.feature.passcode_reminder.impl.network.PasscodeReminderService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f279316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PasscodeReminderService f279317b;

    public c(ue0.c storage, e dateProvider, PasscodeReminderService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f279316a = storage;
        this.f279317b = service;
    }

    public final boolean a() {
        Long l2 = (Long) j6.a.k(Long.TYPE, this.f279316a, "KEY_LAST_FAILED_ATTEMPT_TIME");
        if (l2 != null) {
            return System.currentTimeMillis() - l2.longValue() <= TimeUnit.HOURS.toMillis(24L);
        }
        return false;
    }
}
