package u96;

import android.app.ActivityManager;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import smd.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c70.b f278396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f278397b;

    public b(c70.b deviceMemoryProvider, s googlePlayServicesChecker) {
        Intrinsics.checkNotNullParameter(deviceMemoryProvider, "deviceMemoryProvider");
        Intrinsics.checkNotNullParameter(googlePlayServicesChecker, "googlePlayServicesChecker");
        this.f278396a = deviceMemoryProvider;
        this.f278397b = googlePlayServicesChecker;
    }

    public final boolean a() {
        ActivityManager activityManager = (ActivityManager) this.f278396a.f21824a.getContext().getSystemService(ActivityManager.class);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        if (memoryInfo.totalMem < 1825361100) {
            return false;
        }
        s sVar = this.f278397b;
        ((c) sVar.f264433b).getClass();
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(((z70.a) sVar.f264432a).getContext()) == 0;
    }
}
