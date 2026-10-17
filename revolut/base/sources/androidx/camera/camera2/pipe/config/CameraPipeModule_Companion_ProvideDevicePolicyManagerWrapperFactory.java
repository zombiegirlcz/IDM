package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory implements e {
    public static DevicePolicyManagerWrapper provideDevicePolicyManagerWrapper(Context context) {
        DevicePolicyManagerWrapper devicePolicyManagerWrapperProvideDevicePolicyManagerWrapper = CameraPipeModule.INSTANCE.provideDevicePolicyManagerWrapper(context);
        s.k(devicePolicyManagerWrapperProvideDevicePolicyManagerWrapper);
        return devicePolicyManagerWrapperProvideDevicePolicyManagerWrapper;
    }
}
