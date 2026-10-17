package x8h;

import androidx.work.WorkManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkManager f303371a;

    public p0(WorkManager workManager) {
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f303371a = workManager;
    }
}
