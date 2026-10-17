package n80;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f213186a;

    public e(PackageManager pm7) {
        Intrinsics.checkNotNullParameter(pm7, "pm");
        this.f213186a = pm7;
    }

    public final ApplicationInfo a(String packageName, int i) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int i2 = Build.VERSION.SDK_INT;
        PackageManager packageManager = this.f213186a;
        if (i2 >= 33) {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(i));
            Intrinsics.h(applicationInfo);
            return applicationInfo;
        }
        ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo(packageName, i);
        Intrinsics.h(applicationInfo2);
        return applicationInfo2;
    }

    public final List b(int i) {
        int i2 = Build.VERSION.SDK_INT;
        PackageManager packageManager = this.f213186a;
        if (i2 >= 33) {
            List installedPackages = packageManager.getInstalledPackages(PackageManager.PackageInfoFlags.of(i));
            Intrinsics.h(installedPackages);
            return installedPackages;
        }
        List<PackageInfo> installedPackages2 = packageManager.getInstalledPackages(i);
        Intrinsics.h(installedPackages2);
        return installedPackages2;
    }

    public final PackageInfo c(String packageName, int i) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int i2 = Build.VERSION.SDK_INT;
        PackageManager packageManager = this.f213186a;
        if (i2 >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(i));
            Intrinsics.h(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i);
        Intrinsics.h(packageInfo2);
        return packageInfo2;
    }
}
