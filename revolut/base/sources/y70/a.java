package y70;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f311316a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f311316a = context;
    }

    public final boolean a(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        List<ApplicationInfo> installedApplications = this.f311316a.getPackageManager().getInstalledApplications(0);
        Intrinsics.checkNotNullExpressionValue(installedApplications, "getInstalledApplications(...)");
        List<ApplicationInfo> list = installedApplications;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((ApplicationInfo) it8.next()).packageName, packageName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
