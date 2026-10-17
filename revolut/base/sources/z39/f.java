package z39;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru0.d f319225a;

    public f(ru0.d spoofedLocationInteractor) {
        Intrinsics.checkNotNullParameter(spoofedLocationInteractor, "spoofedLocationInteractor");
        this.f319225a = spoofedLocationInteractor;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        boolean z;
        String[] strArr;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        h hVar = (h) this.f319225a.invoke();
        boolean z3 = false;
        if (hVar.f319226a.a()) {
            d dVar = hVar.f319227b;
            Context context = dVar.f319223a;
            if (dVar.f319224b.c("android.permission.QUERY_ALL_PACKAGES")) {
                String packageName = context.getPackageName();
                try {
                    m.Companion companion = m.INSTANCE;
                    List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(4096);
                    Intrinsics.checkNotNullExpressionValue(installedPackages, "getInstalledPackages(...)");
                    z = false;
                    for (PackageInfo packageInfo : installedPackages) {
                        try {
                            String packageName2 = packageInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
                            if (!Intrinsics.f(packageName2, packageName) && (strArr = packageInfo.requestedPermissions) != null && kotlin.collections.d.I(strArr, "android.permission.ACCESS_MOCK_LOCATION")) {
                                z = true;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            m.Companion companion2 = m.INSTANCE;
                            o.a(th);
                        }
                    }
                    Unit unit = Unit.f186387a;
                    m.Companion companion3 = m.INSTANCE;
                } catch (Throwable th11) {
                    th = th11;
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                z3 = true;
            }
        }
        hVar.d = Boolean.valueOf(z3);
    }
}
