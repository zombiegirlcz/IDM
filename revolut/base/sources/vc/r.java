package vc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import kp0.w0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ecm.c f287598c = new ecm.c("SplitInstallInfoProvider", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f287599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287600b;

    public r(Context context) {
        this.f287599a = context;
        this.f287600b = context.getPackageName();
    }

    public static boolean c(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final HashSet d(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : e(packageInfo)) {
            if (!c(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final HashSet e(PackageInfo packageInfo) {
        HashSet hashSet;
        ecm.c cVar = f287598c;
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet2 = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                cVar.b("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet2, string.split(",", -1));
                hashSet2.remove("");
                hashSet2.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            cVar.b("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet2, strArr);
        } else {
            cVar.b("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        uc.i iVar = (uc.i) q.f287597a.get();
        if (iVar == null) {
            return hashSet2;
        }
        uc.a aVar = iVar.f278959a;
        synchronized (aVar.f278946c) {
            hashSet = new HashSet(aVar.f278946c);
        }
        hashSet2.addAll(hashSet);
        return hashSet2;
    }

    public final hh3.c a(Bundle bundle) {
        ecm.c cVar = f287598c;
        if (bundle == null) {
            cVar.f("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            cVar.f("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            hh3.c cVarI = w0.I(this.f287599a.getResources().getXml(i), new p9.q(1));
            if (cVarI == null) {
                cVar.f("Can't parse languages metadata.", new Object[0]);
            }
            return cVarI;
        } catch (Resources.NotFoundException unused) {
            cVar.f("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final HashSet b() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f287599a.getPackageManager().getPackageInfo(this.f287600b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f287598c.c("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        return (packageInfo == null || packageInfo.applicationInfo == null) ? new HashSet() : d(packageInfo);
    }
}
