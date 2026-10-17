package androidx.camera.camera2.pipe.config;

import android.content.Context;
import android.content.pm.PackageManager;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvidePackageManagerFactory implements e {
    public static PackageManager providePackageManager(Context context) {
        PackageManager packageManagerProvidePackageManager = CameraPipeModule.INSTANCE.providePackageManager(context);
        s.k(packageManagerProvidePackageManager);
        return packageManagerProvidePackageManager;
    }
}
