package uo;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class s0 {
    public static /* synthetic */ OutputConfiguration f(int i, Size size) {
        return new OutputConfiguration(i, size);
    }

    public static /* synthetic */ SessionConfiguration g(int i, List list) {
        return new SessionConfiguration(i, list);
    }
}
