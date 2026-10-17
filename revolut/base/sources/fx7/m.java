package fx7;

import kotlin.jvm.internal.Intrinsics;
import kx7.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f138771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx7.a f138772b;

    public m(i0 petReminderRepository, kx7.a petNotificationRepository) {
        Intrinsics.checkNotNullParameter(petReminderRepository, "petReminderRepository");
        Intrinsics.checkNotNullParameter(petNotificationRepository, "petNotificationRepository");
        this.f138771a = petReminderRepository;
        this.f138772b = petNotificationRepository;
    }
}
